<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">    
<html>    
<head>    
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">    
<title>Insert title here</title>    
</head>    
<body>  
<h1>poi读取excel，freemark显示</h1>  
<#list listExcel as item>
	<#list item as a>
	${a}
	</#list><br/>
</#list> 
</body>    
</html>   