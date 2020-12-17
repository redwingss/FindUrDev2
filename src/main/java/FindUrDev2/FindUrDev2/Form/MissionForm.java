package FindUrDev2.FindUrDev2.Form;

import lombok.Getter;
import lombok.Setter;

public class MissionForm {

    @Getter
    @Setter
    public Long mission_id;

    @Getter
    @Setter
    public String mission_name;

    @Getter
    @Setter
    public Integer mission_price;

    @Getter
    @Setter
    public String mission_goal;

    @Getter
    @Setter
    public String mission_category;
    
    @Getter
    @Setter
    public String mission_phone;


    public boolean isSet(String text){
        return !text.isEmpty();
    }

    /**
    * @return mission_id
    */
	public Long getMission_id() {
		return mission_id;
	}
	/**
	* @return the mission_name
	*/
	public String getMission_name() {
		return mission_name;
	}
	/**
	* @param mission_name the mission_name to set
	*/
	public void setMission_name(String mission_name) {
		this.mission_name = mission_name;
	}
	/**
	* @return the mission_price
	*/
	public Integer getMission_price() {
		return mission_price;
	}
	/**
	* @param mission_price the mission_price to set
	*/
	public void setMission_price(Integer mission_price) {
		this.mission_price = mission_price;
	}
	/**
	* @return the mission_goal
	*/
	public String getMission_goal() {
		return mission_goal;
	}
	/**
	* @param mission_goal the mission_goal to set
	*/
	public void setMission_goal(String mission_goal) {
		this.mission_goal = mission_goal;
	}
	/**
	* @return the mission_category
	*/
	public String getMission_category() {
		return mission_category;
	}
	/**
	* @param mission_category the mission_category to set
	*/
	public void setMission_category(String mission_category) {
		this.mission_category = mission_category;
	}
	/**
	* @return the mission_phone
	*/
	public String getMission_phone() {
		return mission_phone;
	}
	/**
	* @param mission_phone the mission_phone to set
	*/
	public void setMission_phone(String mission_phone) {
		this.mission_phone = mission_phone;
	}
}
