package com.autohome.scheduler.entity;

import java.util.ArrayList;

/**
 * 该组对应于Linux的用户组，描述的是资源的的概念
 * 
 * @author Administrator
 *
 */
public class GroupInfo {
	// 资源组id
	private String groupId;
	// 资源组名称
	private String groupName;
	// 资源组信息
	private String groupInfo;
	// 资源组拥有者
	private String groupOwner;
	//资源组级别 0 普通  1、2 敏感  3 机密
	private String groupLevel;
	//资源组类型
	private String groupType;
	//资源组业务方
	private String groupBu;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupInfo() {
		return groupInfo;
	}

	public void setGroupInfo(String groupInfo) {
		this.groupInfo = groupInfo;
	}

	public String getGroupOwner() {
		return groupOwner;
	}

	public void setGroupOwner(String groupOwner) {
		this.groupOwner = groupOwner;
	}
	
	public String getGroupLevel() {
		return groupLevel;
	}

	public void setGroupLevel(String groupLevel) {
		this.groupLevel = groupLevel;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getGroupBu() {
		return groupBu;
	}

	public void setGroupBu(String groupBu) {
		this.groupBu = groupBu;
	}

	@Override
	public String toString() {
		return "GroupInfo [groupId=" + groupId + ", groupName=" + groupName + ", groupInfo=" + groupInfo
				+ ", groupOwner=" + groupOwner + "]";
	}

}
