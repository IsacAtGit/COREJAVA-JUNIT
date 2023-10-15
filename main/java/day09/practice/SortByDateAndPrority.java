package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tasks implements Comparable<Tasks> {

	private int id;
	private String name;
	private int priority;
	private LocalDate date; 

	public Tasks(int id, String name, LocalDate date, int priority) {

		this.id = id;
		this.name = name;
		this.date = date;
		this.priority=priority;
	} 
	public Tasks() {
		
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

	public void setPrority(int priority) {
		this.priority = priority;
	}
	public int getPriority() {
		return priority;
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
	public int compareTo(Tasks o) {

		if (this.date.equals(o.getDate())) {
			
			if(this.priority==o.getPriority()) {
				return 0;
				
			}
			else if(this.priority>o.getPriority()) {
				
				return -1;
			}
			else {
				return 1;
			} 
		
		} else {
			if (this.date.isBefore( o.getDate())) {
				return -1;
			} else {
				return 1;
			}
			
		} 
	}

	@Override 
	public String toString() {
		return "Tasks [id" + id + ", name=" + name + ", date=" + date + "]";
	}

}


