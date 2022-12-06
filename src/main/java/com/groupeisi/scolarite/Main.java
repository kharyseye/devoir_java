package com.groupeisi.scolarite;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.groupeisi.entities.Inscription;
import com.groupeisi.entities.User;
import com.groupeisi.metier.DB;
import com.groupeisi.metier.IInscription;
import com.groupeisi.metier.IUser;
import com.groupeisi.metier.InscriptionImpl;
import com.groupeisi.metier.UserImpl;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * DB db = new DB(); Connection con = db.getConnection(); if(con != null) {
		 * 
		 * System.out.println("connexion etablie");
		 * 
		 * }else {
		 * 
		 * System.out.println("echec de la connexion");
		 * 
		 * }
		 */
		
		IUser iuser = new UserImpl();
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("saisir email user : "); String email = scan.nextLine();
		 * User user = new User(); user.setEmail(email);
		 * System.out.println("saisir le mot de passe user : "); String password =
		 * scan.nextLine(); user.setPassword(password);
		 * 
		 * int nb = iuser.add(user); if(nb !=0) { System.out.println("user ajoutée");
		 * }else{ System.out.println("user non ajoutée"); }
		 */
		
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("saisir ID user : "); int id =
		 * Integer.parseInt(scan.nextLine());
		 * System.out.println("saisir email user : "); String email = scan.nextLine();
		 * System.out.println("saisir le mot de passe user : "); String password =
		 * scan.nextLine(); User user = new User(); user.setEmail(email);
		 * user.setPassword(password); user.setId(id); int nb = iuser.update(user);
		 * if(nb !=0) { System.out.println("user Modifié"); }else{
		 * System.out.println("user non modifié"); }
		 */
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("saisir ID user : "); int id =
		 * Integer.parseInt(scan.nextLine()); int nb = iuser.delete(id); if(nb !=0) {
		 * System.out.println("user supprimé"); }else {
		 * System.out.println("user non supprimé"); }
		 */
		
		/*
		 * List<User>allUser= iuser.getAllUser(); for(User user:allUser) {
		 * System.out.println(user); }
		 */

		IInscription iinscription = new InscriptionImpl();
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("saisir la date d'inscription : "); SimpleDateFormat sdf =
		 * new SimpleDateFormat("yyyy-MM-dd"); Date date = null; try { date =
		 * sdf.parse(scan.nextLine()); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } Inscription inscription =
		 * new Inscription(); inscription.setDate(date);
		 * System.out.println("saisir la classe : "); String classe = scan.nextLine();
		 * inscription.setClasse(classe); int nb = iinscription.add(inscription); if(nb
		 * !=0) { System.out.println("inscription ajoutée"); }else{
		 * System.out.println("inscription non ajoutée"); }
		 */
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("saisir ID : ");
		 * int id = Integer.parseInt(scan.nextLine());
		 * System.out.println("saisir la date d'inscription : "); SimpleDateFormat sdf
		 * =new SimpleDateFormat("yyyy-MM-dd"); Date date = null; try { date =
		 * sdf.parse(scan.nextLine()); }catch (ParseException e) { e.printStackTrace();
		 * } System.out.println("saisir la classe : "); String classe =scan.nextLine();
		 * Inscription inscription = new Inscription(); inscription.setDate(date);
		 * inscription.setClasse(classe); inscription.setId(id); int nb =
		 * iinscription.update(inscription); if(nb !=0) {
		 * System.out.println("inscription Modifiée"); }else{
		 * System.out.println("inscription non modifiée"); }
		 */
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("saisir ID : ");
		 * int id =Integer.parseInt(scan.nextLine()); int nb = iuser.delete(id); if(nb
		 * !=0) { System.out.println("inscription supprimée"); }else {
		 * System.out.println("inscription non supprimée"); }
		 */
		
		List<Inscription>allInscription= iinscription.getAllInscription();
		for(Inscription inscription:allInscription) {
			 System.out.println(inscription); }
		
	}

	
}
