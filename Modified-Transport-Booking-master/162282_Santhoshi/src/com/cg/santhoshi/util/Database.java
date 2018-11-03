package com.cg.santhoshi.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cg.santhoshi.bean.TransportBean;

public class Database {
	private static Map<String, String> transportDetails = new HashMap<>();
	private static Map<Integer, TransportBean> bookTransport = new HashMap<>();

	public static Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		transportDetails.put("f-1", "flight");
		transportDetails.put("t-2", "train");
		transportDetails.put("Ta-1", "Taxi");
		return transportDetails;
	}

	public static void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		bookTransport.put(bean.getId(), bean);

	}

	public static Map<Integer, TransportBean> displayTransportDetails() {
		System.out.println("*Your Bookings*");
		return bookTransport;

	}

	public static void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub

		Iterator<Map.Entry<Integer, TransportBean>> it = bookTransport
				.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, TransportBean> entry = it.next();

			if (choiceDelete == entry.getKey()) {

				it.remove();
				System.out.println("Deleted successfully");
			}

		}

		

	}

}
