package com.cg.santhoshi.dao;

import java.sql.DatabaseMetaData;
import java.util.Map;

import com.cg.santhoshi.bean.TransportBean;
import com.cg.santhoshi.exception.TransportException;
import com.cg.santhoshi.util.Database;

public class TransportDaoImpl implements ITransportDao {

	

	@Override
	public Map<String, String> getTransportDetails() throws TransportException {
		// TODO Auto-generated method stub
		return Database.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) throws TransportException{
		//
		Database.addTransport(bean);
	}

	@Override
	public Map<Integer, TransportBean> displayTransportDetails() {
		// TODO Auto-generated method stub
		return Database.displayTransportDetails();
	}

	@Override
	public void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub
		Database.deleteBooking(choiceDelete);
	}

	

}
