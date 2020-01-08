package org.sid.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.sid.dao.DemandeRepository;
import org.sid.dao.Type_ServiceRepository;
import org.sid.entities.Demande;
import org.sid.entities.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DemandeController {
	
	@Autowired
    public JavaMailSender emailSender;
	@Autowired
	DemandeRepository demande;
	@Autowired
	Type_ServiceRepository tsr;
	@PostMapping("/user/addDemande")
	public String demander(@RequestParam(value="objet") String objet, @RequestParam(value="desc") String desc) throws AddressException, MessagingException {
	 System.out.println(objet+ " sending "+desc);
	        // Create a Simple MailMessage.
	 Demande d=new Demande();
	 d.setObjet(objet);
	 d.setDescription(desc);
	 List<TypeService> t=new ArrayList<TypeService>();
	 t=tsr.findAll();
	 for(int i=0;i<t.size();i++) {
		 d.setType(t.get(i));
	 }
	 demande.save(d);
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo("yr.rouissi@gmail.com");
	        message.setSubject(objet);
	        message.setText(desc);
	 
	        // Send Message!
	        this.emailSender.send(message);

		return "index";
	}
	
}
