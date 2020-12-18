package fr.scoop.FindUrDev.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersistLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int persist_id;
	
	private String persist_username;
	private String persist_series;
	private String persist_token;
	private String persist_lastUsed;
	public String getPersist_username() {
		return persist_username;
	}
	public void setPersist_username(String persist_username) {
		this.persist_username = persist_username;
	}
	public String getPersist_series() {
		return persist_series;
	}
	public void setPersist_series(String persist_series) {
		this.persist_series = persist_series;
	}
	public String getPersist_token() {
		return persist_token;
	}
	public void setPersist_token(String persist_token) {
		this.persist_token = persist_token;
	}
	public String getPersist_lastUsed() {
		return persist_lastUsed;
	}
	public void setPersist_lastUsed(String persist_lastUsed) {
		this.persist_lastUsed = persist_lastUsed;
	}

}
