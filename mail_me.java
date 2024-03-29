package com.mail_to_sam;  //My first Java Project : Mail through Java!!

public class App {
public static void main(String[] args) {

System.out.println("preparing to send message...");
String message = "Hi Guys, this is my first project into Java. This project basically sends the email through Java Programming. And I'm happy to learn and execute it. Thankyou";
String subject= "A Java mail by Samarth Sarvade";
String to= "samarthsarvade3@gmail.com";
String from="samsarnucsci2003@gmail.com";

sendEmail(message,subject,to,from);
}

//This is repositary to send email...
private static vaid sendEmail(String message, String subject, String to, String from) {

//Variable for gmail
String host="smtp.gmail.com";

//get the s/s properties
Properties properties = System.getProperties();
System.out.println("PROPERTIES"+properties);

//Setting important information to properties object

//host
properties.put("mail.smtp.host",host);
properties.put("mail.smtp.port","465");
properties.put("mail.smtp.ssl.enable","true");
properties.put("mail.smtp.auth","true");

//Step 1: To get the session object
Session session=Session.getInstance(properties, new Authenticator() {

//go to source_overwrite and then implement method select Authenticator and get password authenticator

@override
protected PasswordAuthentication getPasswordAuthentication() {

return new PasswordAuthenticatiob("samsarnucsci2003@gmail.com","yvtkhndbacxrhcwh");
}

});

session.setDebug(true);

//Step 2 : Compost the message [text]
MimeMessage m = MimeMessage(session);

try{

//from email id
m.setFrom(from);

//adding recipient to message
m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

//adding subjest to message 
m.setSubject(subject);

//adding text to message
m.setText();

//send

//Step 3 : Send the message using transport class
Transport.send(m);

System.out.println("Sent Successfully!!");
}catch(Exception e) {
e.printStackTrace();
}
}
}
