package com.citizant.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	
	/*
	    * Fail Method LK
	    */ 
	/*
	  @Test
	  public void test () {
	  fail("Not yet implemented");
		*/
	
	/*
	    * Pass Method LK
	    */ 
	/*
	  @Test
	  public void test () {
	
		*/
	
	StringHelper helper = new StringHelper();
   
		@Test
		public void testTruncateAInFirst2Positions_Ainfirst2positions() {
			
			//AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
			
			assertEquals( "CD", helper.truncateAInFirst2Positions("AACD"));
			
		 //expected , actual
	
		}
		
		@Test
		public void testTruncateAInFirst2Positions_AinFirstposition(){
		
		//	assertEquals( "CDA", helper.truncateAInFirst2Positions("ACD"));
			assertEquals( "CD", helper.truncateAInFirst2Positions("ACD"));
			
		}
		
		
		
	}


