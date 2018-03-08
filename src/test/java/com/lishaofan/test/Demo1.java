package com.lishaofan.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.service.ForExcelService;
import com.demo.service.ForWordService;

public class Demo1 extends SpringTest{
	
	@Autowired
	ForExcelService forExcelService;
	
	@Autowired
	ForWordService forWordService; 
	
	@Test
	public void test1(){
		System.out.println("hello");
	}
	//读取excel
	@Test
	public void test2(){
		
		String fileName = "E:\\hh\\2018应届生培训课程 - 武研.xlsx";  
		forExcelService.ReadExcel(fileName);
	}
	//读取world
	@Test
	public void test3(){
		
		String fileName = "E:\\hh\\熟悉的技术.docx";  
		forWordService.ReadWord(fileName);
	}
	
	
}
