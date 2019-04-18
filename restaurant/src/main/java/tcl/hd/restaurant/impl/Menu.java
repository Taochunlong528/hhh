package tcl.hd.restaurant.impl;

import java.io.Serializable;

public class Menu implements Serializable{
private int tid;
private String manme;
private double price;
private String content;
//状态
private int status;
public Menu() {
	super();
}
public Menu(int tid, String manme, double price, String content, int status) {
	super();
	this.tid = tid;
	this.manme = manme;
	this.price = price;
	this.content = content;
	this.status = status;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getManme() {
	return manme;
}
public void setManme(String manme) {
	this.manme = manme;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
@Override
public String toString() {
	return tid + "\t" + manme + "\t" + price + "\t" + content + "\t" + status;
}
}
