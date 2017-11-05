<%-- 
    Document   : index
    Created on : Oct 29, 2017, 11:27:21 PM
    Author     : light
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Student Registration Form</title>
  </head>
  <body>
    <h3>Student Registration Form</h3>

    <form action = "GetParameters"
      method = "get">
      <!-- Name text fields -->
      <p><label>Last Name</label>
      <input type = "text" name = "lastName" size = "20" />
      <label>First Name</label>
      <input type = "text" name = "firstName" size = "20" />
      <label>MI</label>
      <input type = "text" name = "mi" size = "1" /></p>

      <!-- Gender radio buttons -->
      <p><label>Gender:</label> 
      <input type = "radio" name = "gender" value = "M" checked /> 
        Male         
      <input type = "radio" name = "gender" value = "F" /> Female</p>

      <!-- Major combo box -->
      <p><label>Major</label> 
        <select name = "major" size = "1">
          <option value = "CS">Computer Science</option>
          <option value = "Math">Mathematics</option>
          <option>English</option>
          <option>Chinese</option>
        </select>

      <!-- Minor list -->
      <label>Minor</label>
        <select name = "minor" size = "2" multiple>
          <option>Computer Science</option>
          <option>Mathematics</option>
          <option>English</option>
          <option>Chinese</option>
        </select></p>

      <!-- Hobby check boxes -->
      <p><label>Hobby:</label>
        <input type = "checkbox" name = "tennis" /> Tennis
        <input type = "checkbox" name = "golf" /> Golf
        <input type = "checkbox" name = "pingPong" checked />Ping Pong
      </p>

      <!-- Remark text area -->
      <p>Remarks:</p>
      <p><textarea name = "remarks" rows = "3" cols = "56">
         </textarea></p>

      <!-- Submit and Reset buttons -->
      <p><input type = "submit" value = "Submit" />
      <input type = "reset" value = "Reset" /></p>
    </form>

        <h2><a href="./CurrentTime">Current Time</a></h2>
        <h2><a href="./FirstServlet">First Servlet</a></h2>
        <h2><a href="./MyServlet">My Servlet</a></h2>
  </body>
</html>