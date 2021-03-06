package org.release.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
public class User {
    
	@Id
	private Long id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String nickname;
	
	public User(){
		
	}
	public User(Long id){
		this.id=id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
