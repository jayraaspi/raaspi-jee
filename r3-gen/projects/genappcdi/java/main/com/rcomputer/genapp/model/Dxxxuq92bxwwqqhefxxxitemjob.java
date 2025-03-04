package com.rcomputer.genapp.model;
// Generated 9-May-2023 8:57:32 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
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
 * Dxxxuq92bxwwqqhefxxxitemjob generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "itemjob")
public class Dxxxuq92bxwwqqhefxxxitemjob implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer;
	private Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem;
	private String a0xxunijbvxxxxxxxxxxjobno;
	private Date b2xxcxxrlxxxxxxxxxxxproddatet;
	private BigDecimal b3xxzqxrbvxxxxxxxxxxqtyalloc;
	private String b4xxuxcobvxxxxxxxxxxpono;
	private BigDecimal z1xxzxxrlvxxxxxxxxxxqtyostnd;
	private BigDecimal z2xxzxxrlvxxxxxxxxxxqtyalstk;
	private BigDecimal z3xxzxxrlvxxxxxxxxxxqtyissud;
	private BigDecimal z4xxzxxrlvxxxxxxxxxxjobtotl;
	private Integer z5xxzzfxhhxxxxxxxxxxstatusfl;
	private Integer c2xxuxxrbvxxxxxxxxxxvendor;
	private Date z6xxcztxlxxxxxxxxxxxstatusfldt;
	private Integer z7xxzzprhvxxxxxxxxxxprintmstat;
	private Date z8xxczqxlhxxxxxxxxxxprinmtfldt;
	private Integer z9xxzzprhvxxxxxxxxxxprintmstatj;
	private Date zaxxczqxlhxxxxxxxxxxprinmtfldtj;
	private String c3xxuxxrbv17xxxxxxxxtype;
	private String zbxxuxxrbvxxxxxxxxxxmatcodeout;
	private BigDecimal zcxxzxxrlvxxxxxxxxxxqtyout;
	private String ydxxuznybvxxxxxxxxxxnotes;
	private String zdxxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private String yexxuzdrbvxxxxxxxxxxdocmnt;
	private Set<Trxxuq9aaxwwqqhefxxxjobassignment> trxxuq9aaxwwqqhefxxxjobassignments = new HashSet<Trxxuq9aaxwwqqhefxxxjobassignment>(
			0);
	private Set<Xoxxuq9bfxwwqqhexxxxjobassignmentdetails> xoxxuq9bfxwwqqhexxxxjobassignmentdetailses = new HashSet<Xoxxuq9bfxwwqqhexxxxjobassignmentdetails>(
			0);

	public Dxxxuq92bxwwqqhefxxxitemjob() {
	}

	public Dxxxuq92bxwwqqhefxxxitemjob(String a0xxunijbvxxxxxxxxxxjobno) {
		this.a0xxunijbvxxxxxxxxxxjobno = a0xxunijbvxxxxxxxxxxjobno;
	}
	public Dxxxuq92bxwwqqhefxxxitemjob(
			Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer,
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem,
			String a0xxunijbvxxxxxxxxxxjobno,
			Date b2xxcxxrlxxxxxxxxxxxproddatet,
			BigDecimal b3xxzqxrbvxxxxxxxxxxqtyalloc,
			String b4xxuxcobvxxxxxxxxxxpono,
			BigDecimal z1xxzxxrlvxxxxxxxxxxqtyostnd,
			BigDecimal z2xxzxxrlvxxxxxxxxxxqtyalstk,
			BigDecimal z3xxzxxrlvxxxxxxxxxxqtyissud,
			BigDecimal z4xxzxxrlvxxxxxxxxxxjobtotl,
			Integer z5xxzzfxhhxxxxxxxxxxstatusfl,
			Integer c2xxuxxrbvxxxxxxxxxxvendor,
			Date z6xxcztxlxxxxxxxxxxxstatusfldt,
			Integer z7xxzzprhvxxxxxxxxxxprintmstat,
			Date z8xxczqxlhxxxxxxxxxxprinmtfldt,
			Integer z9xxzzprhvxxxxxxxxxxprintmstatj,
			Date zaxxczqxlhxxxxxxxxxxprinmtfldtj,
			String c3xxuxxrbv17xxxxxxxxtype,
			String zbxxuxxrbvxxxxxxxxxxmatcodeout,
			BigDecimal zcxxzxxrlvxxxxxxxxxxqtyout,
			String ydxxuznybvxxxxxxxxxxnotes,
			String zdxxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			String yexxuzdrbvxxxxxxxxxxdocmnt,
			Set<Trxxuq9aaxwwqqhefxxxjobassignment> trxxuq9aaxwwqqhefxxxjobassignments,
			Set<Xoxxuq9bfxwwqqhexxxxjobassignmentdetails> xoxxuq9bfxwwqqhexxxxjobassignmentdetailses) {
		this.jxxxuq201xwwqqhxxxxxcustomer = jxxxuq201xwwqqhxxxxxcustomer;
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
		this.a0xxunijbvxxxxxxxxxxjobno = a0xxunijbvxxxxxxxxxxjobno;
		this.b2xxcxxrlxxxxxxxxxxxproddatet = b2xxcxxrlxxxxxxxxxxxproddatet;
		this.b3xxzqxrbvxxxxxxxxxxqtyalloc = b3xxzqxrbvxxxxxxxxxxqtyalloc;
		this.b4xxuxcobvxxxxxxxxxxpono = b4xxuxcobvxxxxxxxxxxpono;
		this.z1xxzxxrlvxxxxxxxxxxqtyostnd = z1xxzxxrlvxxxxxxxxxxqtyostnd;
		this.z2xxzxxrlvxxxxxxxxxxqtyalstk = z2xxzxxrlvxxxxxxxxxxqtyalstk;
		this.z3xxzxxrlvxxxxxxxxxxqtyissud = z3xxzxxrlvxxxxxxxxxxqtyissud;
		this.z4xxzxxrlvxxxxxxxxxxjobtotl = z4xxzxxrlvxxxxxxxxxxjobtotl;
		this.z5xxzzfxhhxxxxxxxxxxstatusfl = z5xxzzfxhhxxxxxxxxxxstatusfl;
		this.c2xxuxxrbvxxxxxxxxxxvendor = c2xxuxxrbvxxxxxxxxxxvendor;
		this.z6xxcztxlxxxxxxxxxxxstatusfldt = z6xxcztxlxxxxxxxxxxxstatusfldt;
		this.z7xxzzprhvxxxxxxxxxxprintmstat = z7xxzzprhvxxxxxxxxxxprintmstat;
		this.z8xxczqxlhxxxxxxxxxxprinmtfldt = z8xxczqxlhxxxxxxxxxxprinmtfldt;
		this.z9xxzzprhvxxxxxxxxxxprintmstatj = z9xxzzprhvxxxxxxxxxxprintmstatj;
		this.zaxxczqxlhxxxxxxxxxxprinmtfldtj = zaxxczqxlhxxxxxxxxxxprinmtfldtj;
		this.c3xxuxxrbv17xxxxxxxxtype = c3xxuxxrbv17xxxxxxxxtype;
		this.zbxxuxxrbvxxxxxxxxxxmatcodeout = zbxxuxxrbvxxxxxxxxxxmatcodeout;
		this.zcxxzxxrlvxxxxxxxxxxqtyout = zcxxzxxrlvxxxxxxxxxxqtyout;
		this.ydxxuznybvxxxxxxxxxxnotes = ydxxuznybvxxxxxxxxxxnotes;
		this.zdxxutoxlhxxxxxxxxxxowner = zdxxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.yexxuzdrbvxxxxxxxxxxdocmnt = yexxuzdrbvxxxxxxxxxxdocmnt;
		this.trxxuq9aaxwwqqhefxxxjobassignments = trxxuq9aaxwwqqhefxxxjobassignments;
		this.xoxxuq9bfxwwqqhexxxxjobassignmentdetailses = xoxxuq9bfxwwqqhexxxxjobassignmentdetailses;
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
	@JoinColumn(name = "customej")
	public Jxxxuq201xwwqqhxxxxxcustomer getJxxxuq201xwwqqhxxxxxcustomer() {
		return this.jxxxuq201xwwqqhxxxxxcustomer;
	}

	public void setJxxxuq201xwwqqhxxxxxcustomer(
			Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer) {
		this.jxxxuq201xwwqqhxxxxxcustomer = jxxxuq201xwwqqhxxxxxcustomer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matcode")
	public Fpxxfq1a5xwwqqhxxxxxitem getFpxxfq1a5xwwqqhxxxxxitem() {
		return this.fpxxfq1a5xwwqqhxxxxxitem;
	}

	public void setFpxxfq1a5xwwqqhxxxxxitem(
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem) {
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
	}

	@Column(name = "jobno", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxunijbvxxxxxxxxxxjobno() {
		return this.a0xxunijbvxxxxxxxxxxjobno;
	}

	public void setA0xxunijbvxxxxxxxxxxjobno(String a0xxunijbvxxxxxxxxxxjobno) {
		this.a0xxunijbvxxxxxxxxxxjobno = a0xxunijbvxxxxxxxxxxjobno;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "proddatet", length = 29)
	public Date getB2xxcxxrlxxxxxxxxxxxproddatet() {
		return this.b2xxcxxrlxxxxxxxxxxxproddatet;
	}

	public void setB2xxcxxrlxxxxxxxxxxxproddatet(
			Date b2xxcxxrlxxxxxxxxxxxproddatet) {
		this.b2xxcxxrlxxxxxxxxxxxproddatet = b2xxcxxrlxxxxxxxxxxxproddatet;
	}

	@Column(name = "qtyalloc", precision = 14)
	public BigDecimal getB3xxzqxrbvxxxxxxxxxxqtyalloc() {
		return this.b3xxzqxrbvxxxxxxxxxxqtyalloc;
	}

	public void setB3xxzqxrbvxxxxxxxxxxqtyalloc(
			BigDecimal b3xxzqxrbvxxxxxxxxxxqtyalloc) {
		this.b3xxzqxrbvxxxxxxxxxxqtyalloc = b3xxzqxrbvxxxxxxxxxxqtyalloc;
	}

	@Column(name = "pono", length = 20)
	@Size(max = 20)
	public String getB4xxuxcobvxxxxxxxxxxpono() {
		return this.b4xxuxcobvxxxxxxxxxxpono;
	}

	public void setB4xxuxcobvxxxxxxxxxxpono(String b4xxuxcobvxxxxxxxxxxpono) {
		this.b4xxuxcobvxxxxxxxxxxpono = b4xxuxcobvxxxxxxxxxxpono;
	}

	@Column(name = "qtyostnd", precision = 14)
	public BigDecimal getZ1xxzxxrlvxxxxxxxxxxqtyostnd() {
		return this.z1xxzxxrlvxxxxxxxxxxqtyostnd;
	}

	public void setZ1xxzxxrlvxxxxxxxxxxqtyostnd(
			BigDecimal z1xxzxxrlvxxxxxxxxxxqtyostnd) {
		this.z1xxzxxrlvxxxxxxxxxxqtyostnd = z1xxzxxrlvxxxxxxxxxxqtyostnd;
	}

	@Column(name = "qtyalstk", precision = 14)
	public BigDecimal getZ2xxzxxrlvxxxxxxxxxxqtyalstk() {
		return this.z2xxzxxrlvxxxxxxxxxxqtyalstk;
	}

	public void setZ2xxzxxrlvxxxxxxxxxxqtyalstk(
			BigDecimal z2xxzxxrlvxxxxxxxxxxqtyalstk) {
		this.z2xxzxxrlvxxxxxxxxxxqtyalstk = z2xxzxxrlvxxxxxxxxxxqtyalstk;
	}

	@Column(name = "qtyissud", precision = 14)
	public BigDecimal getZ3xxzxxrlvxxxxxxxxxxqtyissud() {
		return this.z3xxzxxrlvxxxxxxxxxxqtyissud;
	}

	public void setZ3xxzxxrlvxxxxxxxxxxqtyissud(
			BigDecimal z3xxzxxrlvxxxxxxxxxxqtyissud) {
		this.z3xxzxxrlvxxxxxxxxxxqtyissud = z3xxzxxrlvxxxxxxxxxxqtyissud;
	}

	@Column(name = "jobtotl", precision = 14)
	public BigDecimal getZ4xxzxxrlvxxxxxxxxxxjobtotl() {
		return this.z4xxzxxrlvxxxxxxxxxxjobtotl;
	}

	public void setZ4xxzxxrlvxxxxxxxxxxjobtotl(
			BigDecimal z4xxzxxrlvxxxxxxxxxxjobtotl) {
		this.z4xxzxxrlvxxxxxxxxxxjobtotl = z4xxzxxrlvxxxxxxxxxxjobtotl;
	}

	@Column(name = "statusfl")
	public Integer getZ5xxzzfxhhxxxxxxxxxxstatusfl() {
		return this.z5xxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZ5xxzzfxhhxxxxxxxxxxstatusfl(
			Integer z5xxzzfxhhxxxxxxxxxxstatusfl) {
		this.z5xxzzfxhhxxxxxxxxxxstatusfl = z5xxzzfxhhxxxxxxxxxxstatusfl;
	}

	@Column(name = "vendor")
	public Integer getC2xxuxxrbvxxxxxxxxxxvendor() {
		return this.c2xxuxxrbvxxxxxxxxxxvendor;
	}

	public void setC2xxuxxrbvxxxxxxxxxxvendor(Integer c2xxuxxrbvxxxxxxxxxxvendor) {
		this.c2xxuxxrbvxxxxxxxxxxvendor = c2xxuxxrbvxxxxxxxxxxvendor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "statusfldt", length = 29)
	public Date getZ6xxcztxlxxxxxxxxxxxstatusfldt() {
		return this.z6xxcztxlxxxxxxxxxxxstatusfldt;
	}

	public void setZ6xxcztxlxxxxxxxxxxxstatusfldt(
			Date z6xxcztxlxxxxxxxxxxxstatusfldt) {
		this.z6xxcztxlxxxxxxxxxxxstatusfldt = z6xxcztxlxxxxxxxxxxxstatusfldt;
	}

	@Column(name = "printmstat")
	public Integer getZ7xxzzprhvxxxxxxxxxxprintmstat() {
		return this.z7xxzzprhvxxxxxxxxxxprintmstat;
	}

	public void setZ7xxzzprhvxxxxxxxxxxprintmstat(
			Integer z7xxzzprhvxxxxxxxxxxprintmstat) {
		this.z7xxzzprhvxxxxxxxxxxprintmstat = z7xxzzprhvxxxxxxxxxxprintmstat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "prinmtfldt", length = 29)
	public Date getZ8xxczqxlhxxxxxxxxxxprinmtfldt() {
		return this.z8xxczqxlhxxxxxxxxxxprinmtfldt;
	}

	public void setZ8xxczqxlhxxxxxxxxxxprinmtfldt(
			Date z8xxczqxlhxxxxxxxxxxprinmtfldt) {
		this.z8xxczqxlhxxxxxxxxxxprinmtfldt = z8xxczqxlhxxxxxxxxxxprinmtfldt;
	}

	@Column(name = "printmstatj")
	public Integer getZ9xxzzprhvxxxxxxxxxxprintmstatj() {
		return this.z9xxzzprhvxxxxxxxxxxprintmstatj;
	}

	public void setZ9xxzzprhvxxxxxxxxxxprintmstatj(
			Integer z9xxzzprhvxxxxxxxxxxprintmstatj) {
		this.z9xxzzprhvxxxxxxxxxxprintmstatj = z9xxzzprhvxxxxxxxxxxprintmstatj;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "prinmtfldtj", length = 29)
	public Date getZaxxczqxlhxxxxxxxxxxprinmtfldtj() {
		return this.zaxxczqxlhxxxxxxxxxxprinmtfldtj;
	}

	public void setZaxxczqxlhxxxxxxxxxxprinmtfldtj(
			Date zaxxczqxlhxxxxxxxxxxprinmtfldtj) {
		this.zaxxczqxlhxxxxxxxxxxprinmtfldtj = zaxxczqxlhxxxxxxxxxxprinmtfldtj;
	}

	@Column(name = "type", length = 12)
	@Size(max = 12)
	public String getC3xxuxxrbv17xxxxxxxxtype() {
		return this.c3xxuxxrbv17xxxxxxxxtype;
	}

	public void setC3xxuxxrbv17xxxxxxxxtype(String c3xxuxxrbv17xxxxxxxxtype) {
		this.c3xxuxxrbv17xxxxxxxxtype = c3xxuxxrbv17xxxxxxxxtype;
	}

	@Column(name = "matcodeout", length = 32)
	@Size(max = 32)
	public String getZbxxuxxrbvxxxxxxxxxxmatcodeout() {
		return this.zbxxuxxrbvxxxxxxxxxxmatcodeout;
	}

	public void setZbxxuxxrbvxxxxxxxxxxmatcodeout(
			String zbxxuxxrbvxxxxxxxxxxmatcodeout) {
		this.zbxxuxxrbvxxxxxxxxxxmatcodeout = zbxxuxxrbvxxxxxxxxxxmatcodeout;
	}

	@Column(name = "qtyout", precision = 14)
	public BigDecimal getZcxxzxxrlvxxxxxxxxxxqtyout() {
		return this.zcxxzxxrlvxxxxxxxxxxqtyout;
	}

	public void setZcxxzxxrlvxxxxxxxxxxqtyout(
			BigDecimal zcxxzxxrlvxxxxxxxxxxqtyout) {
		this.zcxxzxxrlvxxxxxxxxxxqtyout = zcxxzxxrlvxxxxxxxxxxqtyout;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getYdxxuznybvxxxxxxxxxxnotes() {
		return this.ydxxuznybvxxxxxxxxxxnotes;
	}

	public void setYdxxuznybvxxxxxxxxxxnotes(String ydxxuznybvxxxxxxxxxxnotes) {
		this.ydxxuznybvxxxxxxxxxxnotes = ydxxuznybvxxxxxxxxxxnotes;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZdxxutoxlhxxxxxxxxxxowner() {
		return this.zdxxutoxlhxxxxxxxxxxowner;
	}

	public void setZdxxutoxlhxxxxxxxxxxowner(String zdxxutoxlhxxxxxxxxxxowner) {
		this.zdxxutoxlhxxxxxxxxxxowner = zdxxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	@Column(name = "docmnt", length = 90)
	@Size(max = 90)
	public String getYexxuzdrbvxxxxxxxxxxdocmnt() {
		return this.yexxuzdrbvxxxxxxxxxxdocmnt;
	}

	public void setYexxuzdrbvxxxxxxxxxxdocmnt(String yexxuzdrbvxxxxxxxxxxdocmnt) {
		this.yexxuzdrbvxxxxxxxxxxdocmnt = yexxuzdrbvxxxxxxxxxxdocmnt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dxxxuq92bxwwqqhefxxxitemjob")
	public Set<Trxxuq9aaxwwqqhefxxxjobassignment> getTrxxuq9aaxwwqqhefxxxjobassignments() {
		return this.trxxuq9aaxwwqqhefxxxjobassignments;
	}

	public void setTrxxuq9aaxwwqqhefxxxjobassignments(
			Set<Trxxuq9aaxwwqqhefxxxjobassignment> trxxuq9aaxwwqqhefxxxjobassignments) {
		this.trxxuq9aaxwwqqhefxxxjobassignments = trxxuq9aaxwwqqhefxxxjobassignments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dxxxuq92bxwwqqhefxxxitemjob")
	public Set<Xoxxuq9bfxwwqqhexxxxjobassignmentdetails> getXoxxuq9bfxwwqqhexxxxjobassignmentdetailses() {
		return this.xoxxuq9bfxwwqqhexxxxjobassignmentdetailses;
	}

	public void setXoxxuq9bfxwwqqhexxxxjobassignmentdetailses(
			Set<Xoxxuq9bfxwwqqhexxxxjobassignmentdetails> xoxxuq9bfxwwqqhexxxxjobassignmentdetailses) {
		this.xoxxuq9bfxwwqqhexxxxjobassignmentdetailses = xoxxuq9bfxwwqqhexxxxjobassignmentdetailses;
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
