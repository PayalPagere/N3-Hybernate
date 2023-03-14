package org.tnsif.singleInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee{
	
	/**
	 * 
	 */
	private int deptId;
	private String deptName;
	
	//setters and getters
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Manager [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	

}