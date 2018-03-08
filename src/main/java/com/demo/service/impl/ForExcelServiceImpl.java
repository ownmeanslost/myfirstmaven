package com.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.service.ForExcelService;

public class ForExcelServiceImpl implements ForExcelService{

	@Override
	public String ReadExcel(String path){
		try {
			// 构造 XSSFWorkbook 对象，strPath 传入文件路径  
			XSSFWorkbook xwb = new XSSFWorkbook(path);  
			// 读取第一章表格内容  
			XSSFSheet sheet = xwb.getSheetAt(0);  
			// 定义 row、cell  
			XSSFRow row;  
			String cell;  
			// 循环输出表格中的内容  
			for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {  
			    row = sheet.getRow(i);  
			    for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {  
			        // 通过 row.getCell(j).toString() 获取单元格内容，  
			        cell = row.getCell(j).toString();  
			        System.out.print(cell + "\t");  
			    }  
			    System.out.println("");  
			}
		} catch (Exception e) {
			Logger logger=LoggerFactory.getLogger(ForExcelServiceImpl.class);
			logger.info("读取错误");
		}
		
		return "";  
		
	}

	@Override
	public List<List<String>> ShowExcle(String path) {
		List<List<String>> list=new ArrayList<>();
		try {
			// 构造 XSSFWorkbook 对象，strPath 传入文件路径  
			XSSFWorkbook xwb = new XSSFWorkbook(path);  
			// 读取第一章表格内容  
			XSSFSheet sheet = xwb.getSheetAt(0);  
			// 定义 row、cell  
			XSSFRow row;  
			String cell;  
			// 循环输出表格中的内容  
			for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {  
			    row = sheet.getRow(i); 
			    //某行的列数
			    //Integer colum=row.getPhysicalNumberOfCells();
			    List<String> line=new ArrayList<>();
			    for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {  
			        // 通过 row.getCell(j).toString() 获取单元格内容，  
			        cell = row.getCell(j).toString();  
			        line.add(cell); 
			    }  
			   list.add(line);
			}
		} catch (Exception e) {
			Logger logger=LoggerFactory.getLogger(ForExcelServiceImpl.class);
			logger.info("读取错误");
		}
		return list;
	}

}
