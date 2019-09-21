package main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;


public class Mail {

	public static void check( ) 
		   {
		      try {
			      String host = "smtp.gmail.com";// change accordingly
			    
		    	  final String fromEmail = "pt.aubay@gmail.com"; //requires valid gmail id
					final String password2 = "aubay123"; // correct password for gmail id
		      //create properties field
		      Properties properties = new Properties();
		      InputStream inProp  = Main.class.getClassLoader().getResourceAsStream("application.properties");
		      properties.load(inProp);
		
				Authenticator auth = new Authenticator() {
					//override the getPasswordAuthentication method
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(fromEmail, password2);
					}
				};
		      Session emailSession = Session.getDefaultInstance(properties,auth);
		  
		      //create the POP3 store object and connect with the pop server
		      Store store = emailSession.getStore("pop3s");
		     
		      store.connect(host, fromEmail, password2);
		      System.out.println("Conected");
		      //create the folder object and open it
		      Folder emailFolder = store.getFolder("INBOX");
		      emailFolder.open(Folder.READ_ONLY);
		     
		      // retrieve the messages from the folder in an array and print it
		      Message[] messages = emailFolder.getMessages();
		      System.out.println("messages.length---" + messages.length);

		      for (int i = 0 ; i < 10; i++) {
		         Message message = messages[i];
		         System.out.println("---------------------------------");
		         System.out.println("Email Number " + (i + 1));
		         System.out.println("Subject: " + message.getSubject());
		         System.out.println("From: " + message.getFrom()[0]);
		         System.out.println("Text: " + message.getContent().toString());

		      }

		      //close the store and folder objects
		      emailFolder.close(false);
		      store.close();

		      } catch (NoSuchProviderException e) {
		         e.printStackTrace();
		      } catch (MessagingException e) {
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		   }

		   public static void main(String[] args) {


		      final String username = "pt.aubay@gmail.com"; //requires valid gmail id
				final String password = "aubay123"; // correct password for gmail id

		      check();

		   }
}
