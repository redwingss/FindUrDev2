package FindUrDev2.FindUrDev2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppMission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mission_id;
	
	private String mission_name;
	private Integer mission_price;
	private String mission_goal;
	private String mission_category;
	private String mission_phone;
	
	public AppMission() {
		
	}

	public AppMission(String mission_name, Integer mission_price, String mission_goal, String mission_category,String mission_phone) {
		this.mission_name = mission_name;
		this.mission_price = mission_price;
		this.mission_goal = mission_goal;
		this.mission_category = mission_category;	
		this.mission_phone = mission_phone;
	}

	public Long getMission_id() {
		return mission_id;
	}

	public String getMission_name() {
		return mission_name;
	}

	public void setMission_name(String mission_name) {
		this.mission_name = mission_name;
	}

	public Integer getMission_price() {
		return mission_price;
	}

	public void setMission_price(Integer mission_price) {
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

	public String getMission_phone() {
		return mission_phone;
	}

	public void setMission_phone(String mission_phone) {
		this.mission_phone = mission_phone;
	}
}
