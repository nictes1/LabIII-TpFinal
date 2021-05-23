package Repository;

import java.util.UUID;

import Entities.AdminEntity;
import Entities.ConserjeEntity;
import Interfaces.IAdminRepository;

public class AdminRepository extends AdminEntity implements IAdminRepository{

	public Boolean adminLogin(String document, String password) 
	{	
		return true;
	}
	
	public ConserjeEntity createConserje(String cjPassword)
	{
		ConserjeEntity newConserje = new ConserjeEntity();
		
		newConserje.setPassword(cjPassword);
	
		//TODO: Save on file
		
		return newConserje;
	}
	
	public ConserjeEntity updateConserje(UUID id)
	{
		//TODO: Search on file for Conserje ID
		
		return new ConserjeEntity();
	}
}
