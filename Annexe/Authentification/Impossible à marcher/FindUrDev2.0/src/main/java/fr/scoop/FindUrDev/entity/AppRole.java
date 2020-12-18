package fr.scoop.FindUrDev.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class AppRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	
	private String role_name;
	
	@ManyToMany
	@JoinTable(name = "users_role",joinColumns = @JoinColumn(name="role_id"),
	inverseJoinColumns = @JoinColumn(name="user_id"))
	private List<AppUser> usersRole = new ArrayList<>();

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public List<AppUser> getUsersRole() {
		return usersRole;
	}

	public void setUsersRole(List<AppUser> usersRole) {
		this.usersRole = usersRole;
	}
}
