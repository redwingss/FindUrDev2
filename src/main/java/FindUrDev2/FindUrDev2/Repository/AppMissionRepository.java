package FindUrDev2.FindUrDev2.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FindUrDev2.FindUrDev2.Model.*;


@Repository
public interface AppMissionRepository extends JpaRepository<AppMission, Long>{
	

}
