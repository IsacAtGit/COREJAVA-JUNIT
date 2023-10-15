package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Task implements Comparable<Task> {//its an interface which has one method , 

	private int id;
	private String name;
	private LocalDate date;

	public Task(int id, String name, LocalDate date) {

		this.id = id;
		this.name = name;
		this.date = date;
	} 
	public Task() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate input) {
		this.date = input;
	}

	@Override
	
	public int compareTo(Task o) {// 0,.,,,,1.....-1...
		//c0mparision   acct1...acct2
		
		if (this.date == o.getDate()) {
			return 0;
		} else {
			if (this.date.compareTo( o.getDate())<0) {
				return 1;
			} else {
				return -1;
			} 
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}

	@Override
	public String toString() {
		return "Account [id" + id + ", name=" + name + ", date=" + date + "]";
	}

} 


