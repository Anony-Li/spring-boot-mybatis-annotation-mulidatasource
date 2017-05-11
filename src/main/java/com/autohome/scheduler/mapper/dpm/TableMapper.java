package com.autohome.scheduler.mapper.dpm;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.autohome.scheduler.entity.DpmTable;

public interface TableMapper {

	@Select("select distinct(DATABASE_NAME) as name from dpm_table where IS_VALID='0'")
	public List<String> getAllBaseName();
	
	@Insert("insert into dpm_table(DATABASE_NAME,TABLE_NAME,TABLE_CNAME,LOCATION,IS_VALID) values(#{databaseName},#{tableName},#{tableCname},#{location},'0')")
	public Integer insertTableInfo(DpmTable table);
}
