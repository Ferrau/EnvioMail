package com.ferrau.EnvioMail.model;



import javax.persistence.*;

@Entity
@Table(name = "mail")
public class Mail{
		
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
		
		@Column(name = "Too")
	    private String to;
		@Column(name = "subject")
	    private String subject;
		@Column(name = "MMessage")
	    private String message;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Mail( String to, String subject, String message) {

			//this.id = id;
			this.to = to;
			this.subject = subject;
			this.message = message;
		}
		public Mail() {
			super();
		}

		@Override
		public String toString() {
			return "Mail [to=" + to + ", subject=" + subject + ", message=" + message + "]";
		}
	
}
