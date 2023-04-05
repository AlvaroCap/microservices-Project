package com.spring.project.dto;

import java.util.Arrays;

public class ErrorDTO {

	String timestamp;
	String status;
	String error;
	String[] msg;
	BuyDTO info;
	String infoadicional;

	public ErrorDTO(String timestamp, String status, String error, String[] msg, BuyDTO info, String infoadicional) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.msg = msg;
		this.info = info;
		this.infoadicional = infoadicional;
	}

	public ErrorDTO() {
		super();
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String[] getMsg() {
		return msg;
	}

	public void setMsg(String[] msg) {
		this.msg = msg;
	}

	public BuyDTO getInfo() {
		return info;
	}

	public void setInfo(BuyDTO info) {
		this.info = info;
	}

	public String getInfoadicional() {
		return infoadicional;
	}

	public void setInfoadicional(String infoadicional) {
		this.infoadicional = infoadicional;
	}

	@Override
	public String toString() {
		return "ErrorDTO [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", msg="
				+ Arrays.toString(msg) + ", info=" + info + ", infoadicional=" + infoadicional + "]";
	}

}
