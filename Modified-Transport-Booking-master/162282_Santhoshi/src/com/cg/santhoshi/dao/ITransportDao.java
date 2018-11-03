package com.cg.santhoshi.dao;

import java.util.Map;

import com.cg.santhoshi.bean.TransportBean;
import com.cg.santhoshi.exception.TransportException;

public interface ITransportDao {

	Map<String, String> getTransportDetails() throws TransportException;

	void addTransport(TransportBean bean) throws TransportException;

	Map<Integer, TransportBean> displayTransportDetails();

	void deleteBooking(int choiceDelete);

	

}
