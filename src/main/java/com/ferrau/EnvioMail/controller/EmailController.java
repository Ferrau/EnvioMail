package com.ferrau.EnvioMail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ferrau.EnvioMail.model.Mail;
import com.ferrau.EnvioMail.model.Response;

import com.ferrau.EnvioMail.utils.ISendMailService;



@RestController
@RequestMapping("/email")
public class EmailController {
		@Autowired
		private ISendMailService service;
	
		
//	    public EmailController(SendMailServiceImpl service) {
//	        this.service = service;
//	    }
	    
	    
	    @PostMapping("/send")
	    public Response sendMail(@RequestBody Mail mail) {
	    	
	       
	        return service.sendEmail(mail);
	    }
	    
	    
	    
	    
	    
//	    @GetMapping ("/send")
//	    public String sendMail(@RequestBody Mail mail) {
//	        service.sendMail(mail);
//	        return "Email Sent successfully";
//	    }
	    
//	    cuerpo de solicitud que contiene los detalles del correo electrónico 
//	    que se enviará y la respuesta es del tipo cadena con información sobre 
//	    si el correo electrónico se envió correctamente o no.

//	  @PostMapping("/send")
//	    public ResponseEntity<String> sendMail(@RequestBody Mail mail) {
//	    	
//	        this.service.sendMail(mail);
//	        return new ResponseEntity<>("Email Sent successfully", HttpStatus.OK);
//	    }

//	    @PostMapping("/attachment")
//	    public ResponseEntity<String> sendAttachmentEmail(@RequestBody Mail mail) throws MessagingException {
//	        service.sendMailWithAttachments(mail);
//	        return new ResponseEntity<>("Attachment mail sent successfully", HttpStatus.OK);
//	    }
}
