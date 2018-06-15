package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboResume {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        Item item = new Item();

        Invoice invoice = new Invoice();

        System.out.print("name: "); //Ss
        String inputName = keyboard.nextLine(); //line

        invoice.setCustomerName(inputName);
        //System.out.print("customer name: " + invoice.getCustomerName());//banana

        System.out.print(" email: ");//tuna song \n e
        String email = keyboard.nextLine();

        if (email.contains("@") != true){
            System.out.print("no @?");
        }
        else {
            invoice.setEmail(email);
        }
        //System.out.print("customer email: " + invoice.getEmail());

        ArrayList<String> educ = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(" education, done: ");
            String inputeduc = keyboard.nextLine(); //Line bs in psyc um
            if (inputeduc.equals("done"))
                break;
            item.setEducation(inputeduc);//itemName2
            educ.add(inputeduc);
            //System.out.print(names);
        }
        //System.out.print(educ);
        /*for (String n : educ) {
            System.out.print(" "+n);
        }*/

        //System.out.print(" \n");
        ArrayList<String> work = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(" work, done: "); //eork
            String inputwork = keyboard.nextLine();
            if (inputwork.equals("done"))
                break;
            item.setWork(inputwork);//itemName2
            work.add(inputwork);//educ
            //System.out.print(names);
        }
        //System.out.print(work);//
        /*for (String n : work) {
            System.out.print(n);
        }*/
        ArrayList<String> skill = new ArrayList<>();//piano draw
        //ArrayList<String> sklv = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            System.out.print(" skill, done: "); //eork
            String inputskill = keyboard.nextLine();
            if (inputskill.equals("done"))
                break;
            item.setSkill(inputskill);//itemName2
            skill.add(inputskill);//educ
            //System.out.print(names);

            System.out.print(" skill level, done: "); //eork
            String inputsklv = keyboard.nextLine();
            item.setSkill(inputsklv);//itemName2
            skill.add(inputsklv);//educ skilv.
        }
        //System.out.print(skill);
        /*for (String n : skill) {
            System.out.print(n + "\t");//\n?
        }*/
        //prints
        System.out.print("customer name: " + invoice.getCustomerName());
        System.out.println(" customer email: " + invoice.getEmail());//,
        System.out.println(" education: " + educ);
        System.out.println(" work: " + work);
        System.out.println(" skill: " + skill  + " ");
    }
}
