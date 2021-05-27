package Classes;

import Entities.ConserjeEntity;
import Repository.AdminRepository;
import Repository.ConserjeRepository;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		ObjectInputStream read = new ObjectInputStream(new FileInputStream("Conserje.txt"));


	}
}
