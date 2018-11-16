package com.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="user_info")
public class UserInfo {
	
	 @Id
     private Long id;
     
	 @Column
     private Long userId;
     
	 @Column
     private String realName;
	 
	 public UserInfo(Long userId,String realName){
		 this.userId=userId;
		 this.realName=realName;
	 }
}
