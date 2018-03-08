package com.lishaofan.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.demo.hunt.mapper.AdministerMapper;
import com.demo.hunt.pojo.Administer;

public class demo2 extends SpringTest {
	@Resource
	AdministerMapper administerMapper;  
	@Test
	public void test1(){
	Administer adm=	administerMapper.get("1234567");
	System.out.println(adm.getName());
	}
}
