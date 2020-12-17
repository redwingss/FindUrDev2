package FindUrDev2.FindUrDev2.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import FindUrDev2.FindUrDev2.Form.MissionForm;
import FindUrDev2.FindUrDev2.Model.AppMission;
import FindUrDev2.FindUrDev2.Repository.AppMissionRepository;

@Controller
public class AppMissionController {
	
	private AppMissionRepository repository;
	private static List<AppMission> appmissions = new ArrayList<AppMission>();

		
		
		AppMissionController(AppMissionRepository appMissionRepository) {
			this.repository = appMissionRepository;
		}
	    // index work
	    @RequestMapping(value = {"/", "/missions"}, method = RequestMethod.GET)
	    public String missiontList(Model model){
	    	appmissions = repository.findAll();
	        model.addAttribute("appmissions", appmissions);

	        return "acceuil";
	    }
	    // page mission work
	    @RequestMapping(value = {"/missions/{mission_id}"}, method = RequestMethod.GET)
	    public String OneMission(Model model, @PathVariable("mission_id") Long mission_id) {
	    	AppMission appmissions = repository.getOne(mission_id);
	        model.addAttribute("appmissions", appmissions);
	        
	        return "mission_page";
	    }
	    // delete work
		@RequestMapping(value = {"/deleteMission/{mission_id}"}, method = RequestMethod.GET)
		public String deleteMission(@PathVariable("mission_id") long mission_id, HttpServletResponse resp) throws ServletException, IOException {
		    repository.deleteById(mission_id);
		    resp.sendRedirect("http://localhost:8080");
		    return "acceuil";
		    
		}
	    
	    // ajouter form mission work
	    @RequestMapping(value = {"/addMission"}, method = RequestMethod.GET)
		public String showAddMission(Model model) {
	    	MissionForm missionForm = new MissionForm();
			model.addAttribute("missionForm", missionForm);
			return "addMission";
		}
		// ajouter form mission work
		@RequestMapping(value = {"/addMission"}, method = RequestMethod.POST)
		public String addMission(Model model, @ModelAttribute("MissionForm") MissionForm missionForm) {

			AppMission appmission = new AppMission(missionForm.getMission_name(), missionForm.getMission_price(), missionForm.getMission_goal(), missionForm.getMission_category(), missionForm.getMission_phone());
			if(missionForm.isSet(missionForm.getMission_name()) && missionForm.getMission_price() != null && missionForm.isSet(missionForm.getMission_goal()) && missionForm.isSet(missionForm.getMission_category())&& missionForm.isSet(missionForm.getMission_phone())){
	            repository.save(appmission);
	            appmissions.add(appmission);
	            model.addAttribute("appmissions", appmissions);
	            return "acceuil";
	        }else{
	            model.addAttribute("appmissions", appmissions);
	            return this.showAddMission(model);
	        }
		}
		
		
}
