package com.autohome.scheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autohome.scheduler.entity.DpmTable;
import com.autohome.scheduler.mapper.matestore.MatestoreMapper;

@Service
public class MatestoreService {

	@Autowired
	private MatestoreMapper matestoreMapper;
	
	public List<DpmTable> getTableInfo(){
		return matestoreMapper.getTableInfo();
	}
}
