package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.ForExcelService;
import com.demo.service.ForWordService;

@Controller
public class POIController {
	@Autowired
	ForExcelService forExcelService;
	
	@Autowired
	ForWordService forWordService; 
	
	@RequestMapping("/showExcel")
	public String showExcelWeb(Model model){
		List<List<String>> list=new ArrayList<>();
		list=forExcelService.ShowExcle("E:\\hh\\2018应届生培训课程 - 武研.xlsx");
		model.addAttribute("listExcel",list);
		Logger logger=LoggerFactory.getLogger(POIController.class);
		logger.info("excel读取成功");
		return "ShowExcel.ftl";
		
	}
}
