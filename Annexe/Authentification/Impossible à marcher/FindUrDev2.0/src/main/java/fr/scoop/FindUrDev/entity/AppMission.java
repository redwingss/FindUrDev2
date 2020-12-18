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
public class AppMission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mission_id;
	
	private String mission_name;
	private String mission_price;
	private String mission_goal;
	private String mission_category;
	
	@ManyToMany
	@JoinTable(name = "users_missions",joinColumns = @JoinColumn(name="mission_id"),
	inverseJoinColumns = @JoinColumn(name="user_id"))
	private List<AppUser> users = new ArrayList<>();

	public int getMission_id() {
		return mission_id;
	}

	public void setMission_id(int mission_id) {
		this.mission_id = mission_id;
	}

	public String getMission_name() {
		return mission_name;
	}

	public void setMission_name(String mission_name) {
		this.mission_name = mission_name;
	}

	public String getMission_price() {
		return mission_price;
	}

	public void setMission_price(String mission_price) {
		this.mission_price = mission_price;
	}

	public String getMission_goal() {
		return mission_goal;
	}

	public void setMission_goal(String mission_goal) {
		this.mission_goal = mission_goal;
	}

	public String getMission_category() {
		return mission_category;
	}

	public void setMission_category(String mission_category) {
		this.mission_category = mission_category;
	}

	public List<AppUser> getUsers() {
		return users;
	}

	public void setUsers(List<AppUser> users) {
		this.users = users;
	}
	
	
	
	
}
