/**
 * 
 */
package com.aravind.sample.core.dataobject;

/**
 * @author aravind
 *
 */
public class User {
	
	private String name;
	private double age;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public double getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(double age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "Name :"+name+"\t Age::"+age;
	}
	
	
	

}
