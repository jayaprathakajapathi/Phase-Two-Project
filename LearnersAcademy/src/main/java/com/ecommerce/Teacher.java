package com.ecommerce;


import java.util.Set;


public class Teacher {
private int ID;
private String name;
private int age;
private Set<Subjects> subjects;
private Set<Classes> classes;
private Set<Student> student;
public Teacher() {
	
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Set<Subjects> getSubjects() {
	return subjects;
}
public void setSubjects(Set<Subjects> subjects) {
	this.subjects = subjects;
}
public Set<Classes> getClasses() {
	return classes;
}
public void setClasses(Set<Classes> classes) {
	this.classes = classes;
}
public Set<Student> getStudent() {
	return student;
}
public void setStudent(Set<Student> student) {
	this.student = student;
}

}