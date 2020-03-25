package com.capgemini.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.exception.NoDataFoundException;
import com.capgemini.exception.NotNegativeId;

public interface Orderserviceinterface {


	public List<Integer> getId();
    public String orderservice(int orderid, LocalDate exitdate, LocalDate manufacturingdate, LocalDate expirydate) throws NoDataFoundException, NotNegativeId;
    public boolean dateValidate(String date);
    public List<Integer> getOrderid();

}
