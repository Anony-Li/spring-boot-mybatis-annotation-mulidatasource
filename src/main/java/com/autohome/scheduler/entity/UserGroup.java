package com.autohome.scheduler.entity;

/**
 * 用户和资源组的对应关系
 * 
 * @author Administrator
 *
 */
public class UserGroup {
	// 用户和资源组的关联id
	private String relateId;
	// 用户id
	private String userId;
	// 资源组id
	private String groupId;
	// 创建时间
	private String createTime;
	// 修改时间，修改时间拼接
	private String modifyTime;
	// 过期时间
	private String expiryTime;
	// 权限类型 已有，新申请，延期
	private int type;
	//延期的天数
	private int expiryDay;

	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getExpiryDay() {
		return expiryDay;
	}

	public void setExpiryDay(int expiryDay) {
		this.expiryDay = expiryDay;
	}

	@Override
	public String toString() {
		return "UserGroup [relateId=" + relateId + ", userId=" + userId + ", groupId=" + groupId + "]";
	}

}
