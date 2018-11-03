package com.cg.santhoshi.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.santhoshi.bean.TransportBean;
import com.cg.santhoshi.exception.TransportException;
import com.cg.santhoshi.service.ITransportService;
import com.cg.santhoshi.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {

		ITransportService service = new TransportServiceImpl();

		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("*****MENU******");
				System.out.println("1.Add Booking details");
				System.out.println("2.Display Booking Details");
				System.out.println("3.Delete a Booking of ur choice");
				System.out.println("4.Exit");

				int ch = scanner.nextInt();
				switch (ch) {
				case 1:
					TransportBean bean = new TransportBean();
					Map<String, String> transportdetails = service.getTransportDetails();
					System.out.println("Mode of Transport");
					int count = 1;
					for (Map.Entry<String, String> entrySet : transportdetails.entrySet()) {
						System.out.println(count + ". " + entrySet.getValue());
						count++;
					}
					System.out.println("Enter Option:");

					int choice = scanner.nextInt();
					int count1 = 1;
					for (Map.Entry<String, String> entrySet : transportdetails.entrySet()) {
						if (choice == count1) {
							
							bean.setTransportCategoryId(entrySet.getKey());
						}
						count1++;
					}
					int id = (int) (Math.random() * 10000);
					bean.setId(id);
					System.out.println("Enter reason");
					scanner.nextLine();
					String reason = scanner.nextLine();
					bean.setReason(reason);
					System.out.println("Enter When");
					System.out.println("1.This week\n2.Next week\n3.Next month");
					int whenChoice = scanner.nextInt();
					if (whenChoice == 1) {
						bean.setWhen("This week");
					}
					if (whenChoice == 2) {
						bean.setWhen("Next week");
					}
					if (whenChoice == 3) {
						bean.setWhen("Next month");
					}
					service.addTransport(bean);

					LocalDateTime ldt = LocalDateTime.now();
					DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh : mm a");
					System.out.println("Booked with " + id + " on "+ ldt.format(f));
					break;

				case 2:
					Map<Integer, TransportBean> transportdeatils = service.displayTransportDetails();

					for (Map.Entry<Integer, TransportBean> entrySet : transportdeatils.entrySet()) {
						
						System.out.println("key:" + entrySet.getKey()+ "\nvalue:" + entrySet.getValue());

					}

					break;
				case 3:
					System.out.println("Enter the id u want to delete");
					int choiceDelete = scanner.nextInt();
					service.deleteBooking(choiceDelete);
					break;

				case 4:
					System.exit(0);
				}
			}
		} catch (TransportException ticketException) {
			System.out.println("Error in fetching details and adding data");

		} catch (Exception e) {
			System.out.println("Internal error. try later.");
		}

	}

}
