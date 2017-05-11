package com.autohome.scheduler.mapper.matestore;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.autohome.scheduler.entity.DpmTable;

public interface MatestoreMapper {

	@Select("SELECT d.NAME AS databaseName, b.tbl_name AS tableName, ' ' AS tableCname, c.location FROM TBLS b, SDS c, DBS d WHERE b.SD_ID = c.SD_ID AND b.DB_ID = d.DB_ID AND b.TBL_NAME NOT LIKE 'tmp_%' AND b.TBL_NAME NOT LIKE '%_tmp' AND b.TBL_NAME NOT LIKE '%_bak'")
	public List<DpmTable> getTableInfo();
}
