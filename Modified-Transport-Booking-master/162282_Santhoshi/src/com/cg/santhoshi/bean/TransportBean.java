package com.cg.santhoshi.bean;

public class TransportBean {
	@Override
	public String toString() {
		return "TransportBean [id=" + id + ", transportCategoryId="
				+ transportCategoryId + ", reason=" + reason + ", when=" + when
				+ "]";
	}
	private Integer id;
	private String transportCategoryId;
	private String reason;
	private String when;
	private static String status="new";
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTransportCategoryId() {
		return transportCategoryId;
	}
	public void setTransportCategoryId(String transportCategoryId) {
		this.transportCategoryId = transportCategoryId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	public static String getStatus() {
		return status;
	}
	public static void setStatus(String status) {
		TransportBean.status = status;
	}
	
	
}
