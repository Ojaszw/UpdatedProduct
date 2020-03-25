package com.capgemini.testing;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.capgemini.exception.NoDataFoundException;
import com.capgemini.exception.NotNegativeId;
import com.capgemini.service.OrderService;
import java.time.LocalDate;
import java.util.*;

public class ServiceTest {

	OrderService obj;
	Integer List[ ]= {1,2,3,4};
	@Before
	public void setUp()
	{
		obj=new OrderService();
	}
	@Test
	public void testGetOrderId()
	{
		List<Integer>list=obj.getId();
		assertArrayEquals(List,list.toArray());
	
	}
	@Test(expected=NotNegativeId.class)
    public void notNeagativeId() throws NotNegativeId, NoDataFoundException
    {
    	assertEquals("Id should be positive",obj.orderservice(-23, null, null, null));
    }
	@Test
    public void zeroId() throws NoDataFoundException, NotNegativeId 
	 {
	    assertEquals("Id can not be 0",obj.orderservice(0, null, null, null));
	 }
	@Test
	public void testorderservice() throws NoDataFoundException, NotNegativeId
	{
		
		assertEquals("Order",obj.orderservice(4,LocalDate.parse("2017-01-11"),LocalDate.parse("2018-02-12"),LocalDate.parse("2019-03-13")));	
	}
	@Test(expected = NoDataFoundException.class)
    public void  forValidId() throws NoDataFoundException, NotNegativeId
    {	
      assertEquals("Not a valid ", obj.orderservice(10, null, null, null));
    }
	@After
    public void cleaUp()
    {
    	obj=null;
    }
}
