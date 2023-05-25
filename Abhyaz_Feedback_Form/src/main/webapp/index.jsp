<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Abhyaz Feedback Form</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <div class="center">
      <h1>Feedback Form</h1>
      <form action="feedback_form" method="post">
        <div class="txt_field">
          <input type="text" name="uname" required>
          <span></span>
          <label>Username</label>
        </div>
        <div class="txt_field">
          <input type="text" name="email" required>
          <span></span>
          <label>Email ID</label>
        </div>
        <div class="txt_field">
          <input type="textarea" name="fdbk" required>
          <span></span>
          <label>Your Feedback</label>
        </div>
        <input type="submit" value="Submit">
        <br>
        <br>
        <br>
      </form>
    </div>
  </body>
</html>