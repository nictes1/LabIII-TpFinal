package Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
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


	public ConserjeEntity createConserje(String name, String lastName, String dni, String password) {
		return new ConserjeEntity(name,lastName,dni,password);
	}

	//Conserjes's List..
	private List<ConserjeEntity> listConserjes = new ArrayList<>();









	public void addConserjesToList (List<ConserjeEntity> list){

	}

}
