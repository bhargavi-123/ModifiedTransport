package com.cg.santhoshi.service;

import java.awt.peer.ChoicePeer;
import java.util.Map;

import com.cg.santhoshi.bean.TransportBean;
import com.cg.santhoshi.dao.ITransportDao;
import com.cg.santhoshi.dao.TransportDaoImpl;
import com.cg.santhoshi.exception.TransportException;

public class TransportServiceImpl implements ITransportService {
  ITransportDao dao= new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() throws TransportException {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	
	@Override
	public void addTransport(TransportBean bean) throws TransportException {
	     dao.addTransport(bean);
		
	}

	@Override
	public Map<Integer, TransportBean> displayTransportDetails() {
		// TODO Auto-generated method stub
		return dao.displayTransportDetails();
	}

	@Override
	public void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub
		dao.deleteBooking(choiceDelete);
	}

	

}
