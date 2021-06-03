package Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

import Entities.AdminEntity;
import Entities.ConserjeEntity;
import Interfaces.IAdminRepository;
import Utils.Utils;

public class AdminRepository extends AdminEntity implements IAdminRepository{

	public boolean loginAdmin(String password, String confirmPassword) {
		//TODO: Obtener la lista de admins
		AtomicBoolean result = new AtomicBoolean(false);
		List<AdminEntity> admins = new ArrayList<AdminEntity>();
		AdminEntity admin1 = new AdminEntity("password1", "password1");
		AdminEntity admin2 = new AdminEntity("password2", "password2");
		AdminEntity admin3 = new AdminEntity("password3", "password3");
		admins.add(admin1);
		admins.add(admin2);
		admins.add(admin3);

		admins.forEach(admin -> {
			String pwd = admin.getPassword();
			String confPwd = admin.getConfirmPassword();
			if(pwd == password && confPwd == confirmPassword) {
				result.set(true);
			}
			else {
				result.set(false);
			}
		});
		return result.get();
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
