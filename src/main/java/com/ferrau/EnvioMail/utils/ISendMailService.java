package com.ferrau.EnvioMail.utils;



import com.ferrau.EnvioMail.model.Mail;
import com.ferrau.EnvioMail.model.Response;


public interface ISendMailService {
	

	Response sendEmail(Mail mail);

    //void sendMailWithAttachments(Mail mail) throws MessagingException;
}
