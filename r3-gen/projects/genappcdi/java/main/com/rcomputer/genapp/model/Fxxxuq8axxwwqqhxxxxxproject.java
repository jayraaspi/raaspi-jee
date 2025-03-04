package com.rcomputer.genapp.model;
// Generated 9-May-2023 8:57:32 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Fxxxuq8axxwwqqhxxxxxproject generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "project")
public class Fxxxuq8axxwwqqhxxxxxproject implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Fxxxuq8axxwwqqhxxxxxproject fxxxuq8axxwwqqhxxxxxproject;
	private Fxxxch133xhhxqhxxlxxdivision fxxxch133xhhxqhxxlxxdivision;
	private Fxxxch122xhhxqhxxlxxdepartment fxxxch122xhhxqhxxlxxdepartment;
	private Dxxxch1d3xwwqqhxxlxxcompany dxxxch1d3xwwqqhxxlxxcompany;
	private String a0xxukxxbvxxxxxxxxxxproj;
	private String b1xxuszsbvxxxxxxxxxxdescript;
	private Integer b4xxuxxrbvlxxxxxxxxxlocation;
	private Date b5gxdxxdbvxxxxxxxxxxsdatet;
	private Date b5exdxxdbvxxxxxxxxxxedatet;
	private String z1xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Set<Fxxxuq8axxwwqqhxxxxxproject> fxxxuq8axxwwqqhxxxxxprojects = new HashSet<Fxxxuq8axxwwqqhxxxxxproject>(
			0);

	public Fxxxuq8axxwwqqhxxxxxproject() {
	}

	public Fxxxuq8axxwwqqhxxxxxproject(String a0xxukxxbvxxxxxxxxxxproj) {
		this.a0xxukxxbvxxxxxxxxxxproj = a0xxukxxbvxxxxxxxxxxproj;
	}
	public Fxxxuq8axxwwqqhxxxxxproject(
			Fxxxuq8axxwwqqhxxxxxproject fxxxuq8axxwwqqhxxxxxproject,
			Fxxxch133xhhxqhxxlxxdivision fxxxch133xhhxqhxxlxxdivision,
			Fxxxch122xhhxqhxxlxxdepartment fxxxch122xhhxqhxxlxxdepartment,
			Dxxxch1d3xwwqqhxxlxxcompany dxxxch1d3xwwqqhxxlxxcompany,
			String a0xxukxxbvxxxxxxxxxxproj,
			String b1xxuszsbvxxxxxxxxxxdescript,
			Integer b4xxuxxrbvlxxxxxxxxxlocation,
			Date b5gxdxxdbvxxxxxxxxxxsdatet, Date b5exdxxdbvxxxxxxxxxxedatet,
			String z1xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Set<Fxxxuq8axxwwqqhxxxxxproject> fxxxuq8axxwwqqhxxxxxprojects) {
		this.fxxxuq8axxwwqqhxxxxxproject = fxxxuq8axxwwqqhxxxxxproject;
		this.fxxxch133xhhxqhxxlxxdivision = fxxxch133xhhxqhxxlxxdivision;
		this.fxxxch122xhhxqhxxlxxdepartment = fxxxch122xhhxqhxxlxxdepartment;
		this.dxxxch1d3xwwqqhxxlxxcompany = dxxxch1d3xwwqqhxxlxxcompany;
		this.a0xxukxxbvxxxxxxxxxxproj = a0xxukxxbvxxxxxxxxxxproj;
		this.b1xxuszsbvxxxxxxxxxxdescript = b1xxuszsbvxxxxxxxxxxdescript;
		this.b4xxuxxrbvlxxxxxxxxxlocation = b4xxuxxrbvlxxxxxxxxxlocation;
		this.b5gxdxxdbvxxxxxxxxxxsdatet = b5gxdxxdbvxxxxxxxxxxsdatet;
		this.b5exdxxdbvxxxxxxxxxxedatet = b5exdxxdbvxxxxxxxxxxedatet;
		this.z1xxutoxlhxxxxxxxxxxowner = z1xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.fxxxuq8axxwwqqhxxxxxprojects = fxxxuq8axxwwqqhxxxxxprojects;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sid", unique = true, nullable = false)
	public Integer getA0xxuobxbxxxxxxxxxxxsid() {
		return this.a0xxuobxbxxxxxxxxxxxsid;
	}

	public void setA0xxuobxbxxxxxxxxxxxsid(Integer a0xxuobxbxxxxxxxxxxxsid) {
		this.a0xxuobxbxxxxxxxxxxxsid = a0xxuobxbxxxxxxxxxxxsid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parentcode")
	public Fxxxuq8axxwwqqhxxxxxproject getFxxxuq8axxwwqqhxxxxxproject() {
		return this.fxxxuq8axxwwqqhxxxxxproject;
	}

	public void setFxxxuq8axxwwqqhxxxxxproject(
			Fxxxuq8axxwwqqhxxxxxproject fxxxuq8axxwwqqhxxxxxproject) {
		this.fxxxuq8axxwwqqhxxxxxproject = fxxxuq8axxwwqqhxxxxxproject;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "divcode")
	public Fxxxch133xhhxqhxxlxxdivision getFxxxch133xhhxqhxxlxxdivision() {
		return this.fxxxch133xhhxqhxxlxxdivision;
	}

	public void setFxxxch133xhhxqhxxlxxdivision(
			Fxxxch133xhhxqhxxlxxdivision fxxxch133xhhxqhxxlxxdivision) {
		this.fxxxch133xhhxqhxxlxxdivision = fxxxch133xhhxqhxxlxxdivision;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "depcode")
	public Fxxxch122xhhxqhxxlxxdepartment getFxxxch122xhhxqhxxlxxdepartment() {
		return this.fxxxch122xhhxqhxxlxxdepartment;
	}

	public void setFxxxch122xhhxqhxxlxxdepartment(
			Fxxxch122xhhxqhxxlxxdepartment fxxxch122xhhxqhxxlxxdepartment) {
		this.fxxxch122xhhxqhxxlxxdepartment = fxxxch122xhhxqhxxlxxdepartment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "companycode")
	public Dxxxch1d3xwwqqhxxlxxcompany getDxxxch1d3xwwqqhxxlxxcompany() {
		return this.dxxxch1d3xwwqqhxxlxxcompany;
	}

	public void setDxxxch1d3xwwqqhxxlxxcompany(
			Dxxxch1d3xwwqqhxxlxxcompany dxxxch1d3xwwqqhxxlxxcompany) {
		this.dxxxch1d3xwwqqhxxlxxcompany = dxxxch1d3xwwqqhxxlxxcompany;
	}

	@Column(name = "proj", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxukxxbvxxxxxxxxxxproj() {
		return this.a0xxukxxbvxxxxxxxxxxproj;
	}

	public void setA0xxukxxbvxxxxxxxxxxproj(String a0xxukxxbvxxxxxxxxxxproj) {
		this.a0xxukxxbvxxxxxxxxxxproj = a0xxukxxbvxxxxxxxxxxproj;
	}

	@Column(name = "descript", length = 120)
	@Size(max = 120)
	public String getB1xxuszsbvxxxxxxxxxxdescript() {
		return this.b1xxuszsbvxxxxxxxxxxdescript;
	}

	public void setB1xxuszsbvxxxxxxxxxxdescript(
			String b1xxuszsbvxxxxxxxxxxdescript) {
		this.b1xxuszsbvxxxxxxxxxxdescript = b1xxuszsbvxxxxxxxxxxdescript;
	}

	@Column(name = "location")
	public Integer getB4xxuxxrbvlxxxxxxxxxlocation() {
		return this.b4xxuxxrbvlxxxxxxxxxlocation;
	}

	public void setB4xxuxxrbvlxxxxxxxxxlocation(
			Integer b4xxuxxrbvlxxxxxxxxxlocation) {
		this.b4xxuxxrbvlxxxxxxxxxlocation = b4xxuxxrbvlxxxxxxxxxlocation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sdatet", length = 29)
	public Date getB5gxdxxdbvxxxxxxxxxxsdatet() {
		return this.b5gxdxxdbvxxxxxxxxxxsdatet;
	}

	public void setB5gxdxxdbvxxxxxxxxxxsdatet(Date b5gxdxxdbvxxxxxxxxxxsdatet) {
		this.b5gxdxxdbvxxxxxxxxxxsdatet = b5gxdxxdbvxxxxxxxxxxsdatet;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "edatet", length = 29)
	public Date getB5exdxxdbvxxxxxxxxxxedatet() {
		return this.b5exdxxdbvxxxxxxxxxxedatet;
	}

	public void setB5exdxxdbvxxxxxxxxxxedatet(Date b5exdxxdbvxxxxxxxxxxedatet) {
		this.b5exdxxdbvxxxxxxxxxxedatet = b5exdxxdbvxxxxxxxxxxedatet;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZ1xxutoxlhxxxxxxxxxxowner() {
		return this.z1xxutoxlhxxxxxxxxxxowner;
	}

	public void setZ1xxutoxlhxxxxxxxxxxowner(String z1xxutoxlhxxxxxxxxxxowner) {
		this.z1xxutoxlhxxxxxxxxxxowner = z1xxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq8axxwwqqhxxxxxproject")
	public Set<Fxxxuq8axxwwqqhxxxxxproject> getFxxxuq8axxwwqqhxxxxxprojects() {
		return this.fxxxuq8axxwwqqhxxxxxprojects;
	}

	public void setFxxxuq8axxwwqqhxxxxxprojects(
			Set<Fxxxuq8axxwwqqhxxxxxproject> fxxxuq8axxwwqqhxxxxxprojects) {
		this.fxxxuq8axxwwqqhxxxxxprojects = fxxxuq8axxwwqqhxxxxxprojects;
	}

	// The following is extra code specified in the hbm.xml files

	private Boolean flaggedAsEditable = false;
	private Boolean flaggedAsDeleteable = false;
	private Boolean flaggedAsNew = false;
	@Transient
	public boolean getFlaggedAsEditable() {
		return flaggedAsEditable;
	}
	public void setFlaggedAsEditable(Boolean value) {
		flaggedAsEditable = value;
	}
	@Transient
	public boolean getFlaggedAsDeleteable() {
		return flaggedAsDeleteable;
	}
	public void setFlaggedAsDeleteable(Boolean value) {
		flaggedAsDeleteable = value;
	}
	@Transient
	public boolean getFlaggedAsNew() {
		return flaggedAsNew;
	}
	public void setFlaggedAsNew(Boolean value) {
		flaggedAsNew = value;
	}

	// end of extra code specified in the hbm.xml files

}
