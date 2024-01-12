<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<body bgcolor="lightgreen"></body>
<center>
<h1>View All Students Details.........</h1>
<table border="1">
<tr>
  <th>StudentRollNo</th>
  <th>Name</th>
  <th>Course</th>
  <th>Hibernate</th>
  <th>Spring</th>
  <th>SpringBoot</th>
  <th>TotalMarks</th>
  <th>Percentage</th>
  <th>Grade</th>
  <th>Result</th>
  <th>Delete</th>
   <th>Edit</th>
</tr>
<c:forEach var="student" items="${students}">
<tr>
  <td>${student.stdRollNo}</td>
  <td>${student.name}</td>
  <td>${student.course}</td>
  <td>${student.hibernate}</td>
  <td>${student.spring}</td>
  <td>${student.springboot}</td>
  <td>${student.totalmarks}</td>
  <td>${student.percentage}</td>
  <td>${student.grade}</td>
  <td>${student.result}</td>
  <td>
    <a href="/delete/${student.stdRollNo}">Delete</a>
  </td>
  <td>
    <a href="/edit/${student.stdRollNo}">Edit</a>
  </td>
</tr>
</c:forEach>
</table>
<a href="/">Home Page</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/addstudent">Add new student</a>
</center>