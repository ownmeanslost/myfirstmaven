package com.demo.service;

import java.util.List;

public interface ForExcelService {
	//读取Excel
	public String ReadExcel(String path);
	//在web段显示excel
	public List<List<String>> ShowExcle(String path);
	
}
