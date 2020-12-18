package fr.scoop.FindUrDev.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	private String user_name;
	private String user_password;
	private String user_enabled;
	private String user_pseudo;
	private String user_email;
	
	@ManyToMany(mappedBy = "users")
	private List<AppMission> missions = new ArrayList<>();
	
	@ManyToMany(mappedBy = "usersRole")
	private List<AppRole> roles = new ArrayList<>();

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_enabled() {
		return user_enabled;
	}

	public void setUser_enabled(String user_enabled) {
		this.user_enabled = user_enabled;
	}

	public String getUser_pseudo() {
		return user_pseudo;
	}

	public void setUser_pseudo(String user_pseudo) {
		this.user_pseudo = user_pseudo;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public List<AppMission> getMissions() {
		return missions;
	}

	public void setMissions(List<AppMission> missions) {
		this.missions = missions;
	}

	public List<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(List<AppRole> roles) {
		this.roles = roles;
	}
	
	
}
