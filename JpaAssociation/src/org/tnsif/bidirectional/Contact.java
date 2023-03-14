package org.tnsif.bidirectional;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long contactno;
	private String simtype;
	
	@OneToMany(mappedBy="contact" ,cascade=CascadeType.ALL)
	private Set<Person>person=new HashSet<Person>(0);
	
	
	public Long getContactno() {
		return contactno;
	}
	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}
	public String getSimtype() {
		return simtype;
	}
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	public Set<Person> getPerson() {
		return person;
	}
	public void setPerson(Set<Person> person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Contact [contactno=" + contactno + ", simtype=" + simtype + "]";
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long contactno, String simtype, Set<Person> person) {
		super();
		this.contactno = contactno;
		this.simtype = simtype;
		this.person = person;
	}
	
	
	
	
}
