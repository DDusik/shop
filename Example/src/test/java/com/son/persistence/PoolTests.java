package com.son.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PoolTests {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		try(
			Connection con = dataSource.getConnection();	
		){
			
		System.out.println("con="+con);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
}
