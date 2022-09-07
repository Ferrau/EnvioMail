package com.ferrau.EnvioMail.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import com.ferrau.EnvioMail.model.Mail;
import com.ferrau.EnvioMail.model.Response;
import com.ferrau.EnvioMail.utils.ISendMailService;


@Service 
public class SendMailServiceImpl implements ISendMailService{
	
	@Autowired
	private  JavaMailSender javaMailSender;

    //public SendMailServiceImpl(JavaMailSender javaMailSender) {
        //this.javaMailSender = javaMailSender;
    //}
	@Override
	public Response sendEmail(Mail mail) {
		
		Response response = new Response();
		try {
			 SimpleMailMessage msg = new SimpleMailMessage();
			 msg.setTo(mail.getTo());	        
			 msg.setSubject(mail.getSubject());
	         msg.setText(mail.getMessage());
	         
	         javaMailSender.send(msg);
	         
	         response.setCode(0);
	         response.setMessage("Email enviado!");
		}catch (Exception e){
			response.setCode(1);
	        response.setMessage("Error al enviar el mail " + e.getMessage());
		}
		return response;
	}

//    @Override
//    public void sendMail(Mail mail) {
//    	
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo(mail.getTo());
//        msg.setSubject(mail.getSubject());
//        msg.setText(mail.getMessage());
//
//        javaMailSender.send(msg);
//    }

    
    //ENVIO DE MAIL CON ARCHIVO ADJUNTO
    
//    @Override
//    public void sendMailWithAttachments(Mail mail) throws MessagingException {
//        MimeMessage msg = javaMailSender.createMimeMessage();
//
//        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
//
//        helper.setTo("sprapp@outlook.com");
//
//        helper.setSubject("Testing from Spring Boot");
//
//        helper.setText("Find the attached image", true);
//
//        helper.addAttachment("hero.jpg", new ClassPathResource("hero.jpg"));
//
//        javaMailSender.send(msg);
//    }
    
    
}
