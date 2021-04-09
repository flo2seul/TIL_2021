<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상품이 저장되었습니다.</h1><br>

<table>
	<tbody>
		<tr>
			<td><b>상품 번호</b></td><td>${vo.number}</td>
		</tr>
		<tr>
			<td><b>상 품 명</b></td><td>${vo.name}</td>
		</tr>		
		<tr>
			<td><b>상품 가격</b></td><td>${vo.price}</td>
		</tr>
		<tr>
			<td><b>상품 설명</b></td><td>${vo.desc}</td>
		</tr>				
	</tbody>
</table>
<a href="#">상품 목록</a>
</body>
</html>