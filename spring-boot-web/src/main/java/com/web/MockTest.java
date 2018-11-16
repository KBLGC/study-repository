package com.web;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;

public class MockTest {
     public String getName(){
    	 return "张三";
     }
     public String getName(String p){
    	// System.out.println(p);
    	 return p;
     }
     public void setName(){
    	 
     }
     public static void main(String[] args) {
		MockTest mt=mock(MockTest.class);
		when(mt.getName()).thenReturn("李四");
		verify(mt).getName();
	}
     
     @Test
     public void test(){
    	 MockTest mt=mock(MockTest.class);
 		when(mt.getName()).thenReturn("李四");
    	 when(mt.getName(anyString())).thenReturn("李四");
 		System.out.println(mt.getName());
 		System.out.println(mt.getName());
 		doThrow(new RuntimeException()).when(mt).setName();
 		//mt.setName();
 		//System.out.println(mt.getName("ew"));
 		verify(mt).getName();
     }
}
