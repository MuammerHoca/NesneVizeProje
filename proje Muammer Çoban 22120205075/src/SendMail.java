/*
import java.util.*;
import javax.imageio.spi.IIORegistry;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendMail {

    public static void main(String [] args) {
        // Kime
        String to = "abcd@gmail.com";

        // Kimden
        String from = "web@gmail.com";

        // localhosttan gönderildiğini varsayıyoruz.
        String host = "localhost";

        // Sistem özelliklerini getiriyoruz
        Properties properties = System.getProperties();

        // Mail serveri seçiyoruz.
        properties.setProperty("mail.smtp.host", host);

        // Oturum oluşturuyoruz.
        IIORegistry Session;
        //Session session = Session.getDefaultInstance(properties);

        try {
            // Postayı oluşturuyoruz.
            //MimeMessage message = new MimeMessage(session);

            // Kimden alanının doldurulması
            //message.setFrom(new InternetAddress(from));

            // Kime alanının doldurulması
            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Konu başlığının belirtilmesi
            //message.setSubject("This is the Subject Line!");

            // Konu içeriğinin belirtilmesi
          // message.setText("This is actual message");

            // Gönderme işleminin tamamlanması
            //Transport.send(message);
           // System.out.println("Sent message successfully....");
        //} catch (MessagingException mex) {
          //  mex.printStackTrace();
        //}
  //  /}
///}*/
