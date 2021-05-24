package kz.iitu.bussystem.util.email;
import java.util.Properties;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(465);

        mailSender.setUsername("bussystemdiploma@gmail.com");
        mailSender.setPassword("1189406C118");

        mailSender.setProtocol("smtp");
        Properties props = mailSender.getJavaMailProperties();
        //Set debug so we see the whole communication with the server
        props.put("mail.debug", "true");
        // All mail props for protocol will be mail.smtps

        // We set smtps transport protocol for SSL
//        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        return mailSender;
    }

}