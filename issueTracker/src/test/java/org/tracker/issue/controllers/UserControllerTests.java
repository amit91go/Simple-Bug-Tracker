package org.tracker.issue.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.tracker.issue.SimpleBugTrackerApplication;
import org.tracker.issue.entities.Role;
import org.tracker.issue.entities.User;
import org.tracker.issue.services.UserService;


@WebMvcTest(value = UserController.class)
@ContextConfiguration(classes=SimpleBugTrackerApplication.class)
public class UserControllerTests {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;
	
	String exampleCourseJson = "{\"name\":\"user1\",\"email\":\"abc.com\",\"role\":0}";

	
	@Test
	public void createUser() throws Exception {
		User mockUser = new User("1", "User1", "user1@abc.com", Role.Manager);

		// studentService.addCourse to respond back with mockCourse
		Mockito.when(
				userService.createUser(Mockito.any(User.class))).thenReturn(mockUser);

		// Send course as body to /students/Student1/courses
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/users")
				.accept(MediaType.APPLICATION_JSON).content(exampleCourseJson)
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();
		
		System.out.println(response.getContentAsString());

		assertEquals(HttpStatus.CREATED.value(), response.getStatus());
		
		
		String expected = "{\"id\":\"1\",\"name\":\"User1\",\"email\":\"user1@abc.com\",\"role\":\"Manager\"}";

		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

		JSONAssert.assertEquals(expected, response.getContentAsString(), false);

	}


}
