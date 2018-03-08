package com.demo.service.impl;





import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;


import com.demo.service.ForWordService;

public class ForWordServiceImpl implements ForWordService{

	@Override
	public String ReadWord(String path) {
		String buffer="";
		try {  
            if (path.endsWith(".doc")||path.endsWith(".docx")) {  
              
             
                OPCPackage opcPackage = POIXMLDocument.openPackage(path);  
                POIXMLTextExtractor extractor = new XWPFWordExtractor(opcPackage);  
                buffer = extractor.getText(); 
                System.out.println(buffer);
            }
             else {  
                System.out.println("此文件不是word文件！");  
            }  
  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		return "";
		
	}

}
