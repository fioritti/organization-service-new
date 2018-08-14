package com.thoughtmechanix.organization.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.thoughtmechanix.organization.model.Organization;
import com.thoughtmechanix.organization.services.OrganizationService;

@Component
public class MockRepository implements ApplicationRunner {

	@Autowired
	private OrganizationService orgService;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		
		Organization org1 = new Organization("e254f8c-c442-4ebe-a82a-e2fc1d1ff78a","customer-crm-co","Mark Balster","mark.balster@custcrmco.com","823-555-1212");
		Organization org2 = new Organization("442adb6e-fa58-47f3-9ca2-ed1fecdfe86c","HR-PowerSuite","Doug Drewry","doug.drewry@hr.com","920-555-1212");
		
		orgService.saveOrgWithID(org1);
		orgService.saveOrgWithID(org2);
		
	}
	

}
