package com.example.sushant.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentModel {
	@Id
String stud_No;
String stud_name;
String stud_address;
String stud_class;
public String getStud_No() {
	return stud_No;
}
public void setStud_No(String stud_No) {
	this.stud_No = stud_No;
}
public String getStud_name() {
	return stud_name;
}
public void setStud_name(String stud_name) {
	this.stud_name = stud_name;
}
public String getStud_address() {
	return stud_address;
}
public void setStud_address(String stud_address) {
	this.stud_address = stud_address;
}
public String getStud_class() {
	return stud_class;
}
public void setStud_class(String stud_class) {
	this.stud_class = stud_class;
}
public StudentModel(String string, String stud_name, String stud_address, String stud_class) {
	super();
	this.stud_No = string;
	this.stud_name = stud_name;
	this.stud_address = stud_address;
	this.stud_class = stud_class;
}
public StudentModel() {
	super();
}
@Override
public String toString() {
	return "StudentModel [stud_No=" + stud_No + ", stud_name=" + stud_name + ", stud_address=" + stud_address
			+ ", stud_class=" + stud_class + "]";
}



}
