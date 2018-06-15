package com.company;

public class Item {


    private String name;
    private String education;
    private String work;
    private String skill;

    public Item(){

    }
    public Item(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Item(String name, String education){
        this.name = name;
        this.education = education;
    }
    /*public String getEducation(){
        return education;
    }*/

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    public Item(String name, String education, String work){
        this.name = name;
        this.education = education;
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    public Item(String name, String education, String work, String skill){
        this.name = name;
        this.education = education;
        this.work = work;
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
