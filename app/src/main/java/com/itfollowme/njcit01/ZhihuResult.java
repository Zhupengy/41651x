package com.itfollowme.njcit01;

import java.io.Serializable;

public class ZhihuResult implements Serializable {
	private boolean result;
	private String msg;
	private Object obj;
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
