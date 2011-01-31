<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title><fmt:message key="citizen.create"/></title></head>
  <body>
  <h1><fmt:message key="citizen.create"/></h1>

<s:hasBindErrors name="command">
        <div id="div_global_error" align="center">
            <h1>
                <%--<fmt:message key="error.title"/>--%>
            </h1>
            <div id="global_errors">
                <s:bind path="command">
                    <ul class="header-list">
                        <c:forEach items="${status.errorMessages}" var="err">
                            <li>
                                <c:out value='${err}'/>
                            </li>
                        </c:forEach>
                    </ul>
                </s:bind>
            </div>
        </div>
    </s:hasBindErrors>


  <form:form action="save">

      <table>
          <tr>
              <th><fmt:message key="citizen.name"/></th>
              <td>
                  <form:input path="name" maxlength="35"/>
                  <form:errors path="name"/>
              </td>
          </tr>

          <tr>
              <th><fmt:message key="citizen.nationalId"/></th>
              <td>
                  <form:input path="nationalId" maxlength="13"/>
                  <form:errors path="nationalId"/>
              </td>
          </tr>

          <tr>
              <th><fmt:message key="citizen.gender"/></th>
              <td><form:input path="gender" maxlength="1"/>
                  <form:errors path="gender"/>
              </td>
          </tr>

          <tr>
              <th><fmt:message key="citizen.dob"/></th>
              <td>
                  <form:input path="dateOfBirth" maxlength="10"/>
                  <form:errors path="dateOfBirth"/>
              </td>
          </tr>

          <tr>
              <th><fmt:message key="citizen.address"/></th>
              <td>
                  <form:input path="address" maxlength="50"/>
                  <form:errors path="address"/>
              </td>
          </tr>

          <tr>
              <th><fmt:message key="citizen.city"/></th>
              <td>
                  <form:input path="city" maxlength="35"/>
                  <form:errors path="city"/>
              </td>
          </tr>

          <tr>
              <th><fmt:message key="common.submit"/></th>
              <td>
                  <input type="submit" name="create" value="<fmt:message key="common.submit"/> ">
                  <form:errors path="name"/>
              </td>
          </tr>

      </table>
  </form:form>

  </body>
</html>
