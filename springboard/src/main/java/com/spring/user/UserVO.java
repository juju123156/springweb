package com.spring.user;

//VO(Value Object)
public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;
	
	//아이디 반환
	public String getId() {
		return id;
	}
	//아이디 변경
	public void setId(String id) {
		this.id = id;
	}
	//비밀번호 반환
	public String getPassword() {
		return password;
	}
	//비밀번호 변경
	public void setPassword(String password) {
		this.password = password;
	}
	//이름 반환
	public String getName() {
		return name;
	}
	//이름 변경
	public void setName(String name) {
		this.name = name;
	}
	//역할 반환
	public String getRole() {
		return role;
	}
	//역할 변경
	public void setRole(String role) {
		this.role = role;
	}
	//재정의
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
	
	

}
