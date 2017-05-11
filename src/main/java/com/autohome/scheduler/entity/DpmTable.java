package com.autohome.scheduler.entity;

import java.io.Serializable;

public class DpmTable implements Serializable {
	private int tableId;
	private String databaseName;
	private String tableName;
	private String tableCname;
	private String location;
	private String groupId;
	// 0为有效
	private boolean isValid;

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableCname() {
		return tableCname;
	}

	public void setTableCname(String tableCname) {
		this.tableCname = tableCname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "DpmTable [tableId=" + tableId + ", databaseName=" + databaseName + ", tableName=" + tableName
				+ ", tableCname=" + tableCname + ", location=" + location + ", groupId=" + groupId + ", isValid="
				+ isValid + "]";
	}

}
