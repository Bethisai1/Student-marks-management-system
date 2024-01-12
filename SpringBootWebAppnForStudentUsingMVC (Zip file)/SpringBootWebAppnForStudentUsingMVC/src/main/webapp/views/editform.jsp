<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
  <body bgcolor="pink"> 
  <h1>Edit And Save Here</h1>

<form:form method="GET" action="/editandsave">

<form:hidden path="stdRollNo"/><p></p>
Name:<form:input path="name"/><p></p>
Course<form:input path="course"/><p></p>
Hibernate:<form:input path="hibernate"/><p></p>
Spring<form:input path="spring"/><p></p>
Springboot<form:input path="springboot"/><p></p>
<form:button>editandsave</form:button>
</form:form>









