package com.ecommerce;

public class Student {
private int ID;
private String name;
private int classes;

public Student() {
	
}
public Student(String name, int classes) {
	super();
	this.name = name;
	this.classes = classes;
	
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getClasses() {
	return classes;
}
public void setClasses(int classes) {
	this.classes = classes;
}

}