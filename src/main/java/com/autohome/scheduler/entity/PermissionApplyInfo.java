package com.autohome.scheduler.entity;

public class PermissionApplyInfo {
	private int id;
	private String userId;
	private String groupId;
	private int expiryDay;
	// 1为首次申请 2为延期申请  0
	private int type;
	// 1为有效 2为无效
	private int state;
	private String message;
	private String relateId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public int getExpiryDay() {
		return expiryDay;
	}

	public void setExpiryDay(int expiryDay) {
		this.expiryDay = expiryDay;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	@Override
	public String toString() {
		return "PermissionApplyInfo [id=" + id + ", userId=" + userId + ", groupId=" + groupId + ", expiryDay="
				+ expiryDay + ", type=" + type + ", state=" + state + ", message=" + message + ", relateId=" + relateId
				+ "]";
	}

}
