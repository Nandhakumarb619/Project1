package com.ecomm.test;

import junit.framework.TestCase;


import static org.junit.Assert.*;
import java.util.List;



import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.UserDAO;
import com.ecomm.model.UserDetail;



public class UserDAOUnitTest {
	static UserDAO userDAO;

	@BeforeClass
	public static  void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	
 
	@Test
	public  void registerUser() 
	{
		UserDetail user=new UserDetail();
		
		user.setMobileNo("9087558324");
		user.setPassword("123");
		user.setCustomerAddr("nandha");
		user.setAddr("kanchipuram");
		user.setRole("Admim");
		user.setEnabled(true);
		user.setCustomerAddr("nandhakumar");
		
		assertTrue("Problem in User Insertion",userDAO.registerUser(user));
	
	}
	
	@Ignore
	@Test
	public  void deleteUser() 
	{
		UserDetail user=userDAO.getUser("1256");
		assertTrue("Problem in Deletion:",userDAO.deleteUser(user));
	}
	
	@Ignore
	@Test
	public  void updateUser() 
	{

		UserDetail user=userDAO.getUser("ravi");
	   user.setAddr("Anna/  Nagar");
		assertTrue("Problem in Updation",userDAO.updateUser(user));
	}
	
	
	    }
	