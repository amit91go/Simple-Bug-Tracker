package org.tracker.issue.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class User {
	
		@Id 
		private String id;
		@NotBlank(message="Name can not be null.")
		private String name; 
		@NotBlank(message="Email can not be null.")
		@Email(message = "Enter a valid email address.")
		private String email;
		@NotNull(message="Role can not be null.")
		private Role role;
		
		
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public User(String id, String name, String email, Role role) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.role = role;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Role getRole() {
			return role;
		}
		public void setRole(Role role) {
			this.role = role;
		}
		


}