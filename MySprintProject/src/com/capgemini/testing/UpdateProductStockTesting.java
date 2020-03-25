package com.capgemini.testing;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.capgemini.dao.UpdateProductStatusDAO;
import com.capgemini.service.OrderService;

import java.util.List;

public class UpdateProductStockTesting {


	UpdateProductStatusDAO obj;
    Integer List[]= {1,2,3,4};
    @Before
	public void setUp()
	{
		obj=new UpdateProductStatusDAO();
	}
    @Test
	public void testgetId()
	{
		List<Integer> list=obj.getOrderid();
		assertArrayEquals(List,list.toArray());
	}
    @Test
	public void testUpdateProductStatusDAO1()
	{
		assertEquals("Order ID is 104",obj.getDetails(4));
	}
    @Test
	public void testUpdateProductStatusDAO2()
	{
		assertEquals("Invalid ID",obj.getDetails(10));
	}
    @After
    public void cleaUp()
    {
    	obj=null;
    }
	

}
