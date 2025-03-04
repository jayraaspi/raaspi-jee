package com.rcomputer.genapp.model;
// Generated 9-May-2023 8:57:32 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Fpxxfq1t8xwwqqhxxxxxitemprofl generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "itemprofl")
public class Fpxxfq1t8xwwqqhxxxxxitemprofl implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem;
	private String b1xxukxrbvxxxxxxxxxxrow;
	private String b1xxusxrbvxxxxxxxxxxlength;
	private String b1xxu2xrbvxxxxxxxxxxwidth;
	private String b1xxu3xrbvxxxxxxxxxxheight;
	private String b2xxuxxrbvxxxxxxxxxxsizeunit;
	private String b3xxuxxrbvxxxxxxxxxxweight;
	private String b4xxuxxrbvxxxxxxxxxxweightunit;
	private String b5xxfxxxbvxxxxxxxxxxshipmode;
	private String c1xxfxxxbvxxxxxxxxxxcolour;
	private Boolean c1xxfxxxbvxxxxxxxxxxmaterial;
	private Boolean c1xxfxxxbvxxxxxxxxxxmadein;
	private Boolean c1xxfxxxbvxxxxxxxxxxsku;
	private String c2xxfxxxbvxxxxxxxxxxsaleschannel;
	private String c3xxuxxrbvxxxxxxxxxxcompareprice;
	private String c4xxuxxrbvxxxxxxxxxxcustomscode;
	private String c5xxuxxrbvxxxxxxxxxxpagetitle;
	private String c6xxuxxrbvxxxxxxxxxxmetadescription;
	private String c7xxuxxrbvxxxxxxxxxxurlhandle;
	private String c8xxuxxrbvxxxxxxxxxxrating;
	private String d1xxuxxrbvxxxxxxxxxxpoints;
	private String d2xxuxxrbvxxxxxxxxxxpointsunit;
	private String d3xxuxxrbvxxxxxxxxxxdtstyle;
	private String d4xxuxxrbvxxxxxxxxxxftstyle;
	private String d5xxuxxrbvxxxxxxxxxxdefaultr;
	private String d6xxuxxrbvxxxxxxxxxxdefaultc;
	private String d7xxuxxrbvxxxxxxxxxxdbname;
	private String e1xxuxxrbvxxxxxxxxxxrootdir;
	private String e2xxuxxrbvxxxxxxxxxxkeyorder;
	private BigDecimal e3xxzxxxlvxxxxxxxxxxmargin;
	private BigDecimal e4xxzxxxlvxxxxxxxxxxfooter;
	private Boolean e5xxfxxxbvxxxxxxxxxxlistbuildc;
	private Boolean e6xxfxxxbvxxxxxxxxxxlistbuildv;
	private Boolean e7xxfxxxbvxxxxxxxxxxlistbuilde;
	private Integer e8xxzxxrbvxxxxxxxxxxlistbrownc;
	private Integer e9xxzxxrbvxxxxxxxxxxlistbrownv;
	private Integer eaxxzxxrbvxxxxxxxxxxlistbrowne;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private String w7xxuznxbvxxxxxxxxxxnotes;
	private String w8xxuzdrbvxxxxxxxxxxdocmnt;
	private String z3xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;

	public Fpxxfq1t8xwwqqhxxxxxitemprofl() {
	}

	public Fpxxfq1t8xwwqqhxxxxxitemprofl(
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem,
			String b1xxukxrbvxxxxxxxxxxrow, String b1xxusxrbvxxxxxxxxxxlength,
			String b1xxu2xrbvxxxxxxxxxxwidth,
			String b1xxu3xrbvxxxxxxxxxxheight,
			String b2xxuxxrbvxxxxxxxxxxsizeunit,
			String b3xxuxxrbvxxxxxxxxxxweight,
			String b4xxuxxrbvxxxxxxxxxxweightunit,
			String b5xxfxxxbvxxxxxxxxxxshipmode,
			String c1xxfxxxbvxxxxxxxxxxcolour,
			Boolean c1xxfxxxbvxxxxxxxxxxmaterial,
			Boolean c1xxfxxxbvxxxxxxxxxxmadein,
			Boolean c1xxfxxxbvxxxxxxxxxxsku,
			String c2xxfxxxbvxxxxxxxxxxsaleschannel,
			String c3xxuxxrbvxxxxxxxxxxcompareprice,
			String c4xxuxxrbvxxxxxxxxxxcustomscode,
			String c5xxuxxrbvxxxxxxxxxxpagetitle,
			String c6xxuxxrbvxxxxxxxxxxmetadescription,
			String c7xxuxxrbvxxxxxxxxxxurlhandle,
			String c8xxuxxrbvxxxxxxxxxxrating,
			String d1xxuxxrbvxxxxxxxxxxpoints,
			String d2xxuxxrbvxxxxxxxxxxpointsunit,
			String d3xxuxxrbvxxxxxxxxxxdtstyle,
			String d4xxuxxrbvxxxxxxxxxxftstyle,
			String d5xxuxxrbvxxxxxxxxxxdefaultr,
			String d6xxuxxrbvxxxxxxxxxxdefaultc,
			String d7xxuxxrbvxxxxxxxxxxdbname,
			String e1xxuxxrbvxxxxxxxxxxrootdir,
			String e2xxuxxrbvxxxxxxxxxxkeyorder,
			BigDecimal e3xxzxxxlvxxxxxxxxxxmargin,
			BigDecimal e4xxzxxxlvxxxxxxxxxxfooter,
			Boolean e5xxfxxxbvxxxxxxxxxxlistbuildc,
			Boolean e6xxfxxxbvxxxxxxxxxxlistbuildv,
			Boolean e7xxfxxxbvxxxxxxxxxxlistbuilde,
			Integer e8xxzxxrbvxxxxxxxxxxlistbrownc,
			Integer e9xxzxxrbvxxxxxxxxxxlistbrownv,
			Integer eaxxzxxrbvxxxxxxxxxxlistbrowne,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			String w7xxuznxbvxxxxxxxxxxnotes,
			String w8xxuzdrbvxxxxxxxxxxdocmnt,
			String z3xxutoxlhxxxxxxxxxxowner, String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
		this.b1xxukxrbvxxxxxxxxxxrow = b1xxukxrbvxxxxxxxxxxrow;
		this.b1xxusxrbvxxxxxxxxxxlength = b1xxusxrbvxxxxxxxxxxlength;
		this.b1xxu2xrbvxxxxxxxxxxwidth = b1xxu2xrbvxxxxxxxxxxwidth;
		this.b1xxu3xrbvxxxxxxxxxxheight = b1xxu3xrbvxxxxxxxxxxheight;
		this.b2xxuxxrbvxxxxxxxxxxsizeunit = b2xxuxxrbvxxxxxxxxxxsizeunit;
		this.b3xxuxxrbvxxxxxxxxxxweight = b3xxuxxrbvxxxxxxxxxxweight;
		this.b4xxuxxrbvxxxxxxxxxxweightunit = b4xxuxxrbvxxxxxxxxxxweightunit;
		this.b5xxfxxxbvxxxxxxxxxxshipmode = b5xxfxxxbvxxxxxxxxxxshipmode;
		this.c1xxfxxxbvxxxxxxxxxxcolour = c1xxfxxxbvxxxxxxxxxxcolour;
		this.c1xxfxxxbvxxxxxxxxxxmaterial = c1xxfxxxbvxxxxxxxxxxmaterial;
		this.c1xxfxxxbvxxxxxxxxxxmadein = c1xxfxxxbvxxxxxxxxxxmadein;
		this.c1xxfxxxbvxxxxxxxxxxsku = c1xxfxxxbvxxxxxxxxxxsku;
		this.c2xxfxxxbvxxxxxxxxxxsaleschannel = c2xxfxxxbvxxxxxxxxxxsaleschannel;
		this.c3xxuxxrbvxxxxxxxxxxcompareprice = c3xxuxxrbvxxxxxxxxxxcompareprice;
		this.c4xxuxxrbvxxxxxxxxxxcustomscode = c4xxuxxrbvxxxxxxxxxxcustomscode;
		this.c5xxuxxrbvxxxxxxxxxxpagetitle = c5xxuxxrbvxxxxxxxxxxpagetitle;
		this.c6xxuxxrbvxxxxxxxxxxmetadescription = c6xxuxxrbvxxxxxxxxxxmetadescription;
		this.c7xxuxxrbvxxxxxxxxxxurlhandle = c7xxuxxrbvxxxxxxxxxxurlhandle;
		this.c8xxuxxrbvxxxxxxxxxxrating = c8xxuxxrbvxxxxxxxxxxrating;
		this.d1xxuxxrbvxxxxxxxxxxpoints = d1xxuxxrbvxxxxxxxxxxpoints;
		this.d2xxuxxrbvxxxxxxxxxxpointsunit = d2xxuxxrbvxxxxxxxxxxpointsunit;
		this.d3xxuxxrbvxxxxxxxxxxdtstyle = d3xxuxxrbvxxxxxxxxxxdtstyle;
		this.d4xxuxxrbvxxxxxxxxxxftstyle = d4xxuxxrbvxxxxxxxxxxftstyle;
		this.d5xxuxxrbvxxxxxxxxxxdefaultr = d5xxuxxrbvxxxxxxxxxxdefaultr;
		this.d6xxuxxrbvxxxxxxxxxxdefaultc = d6xxuxxrbvxxxxxxxxxxdefaultc;
		this.d7xxuxxrbvxxxxxxxxxxdbname = d7xxuxxrbvxxxxxxxxxxdbname;
		this.e1xxuxxrbvxxxxxxxxxxrootdir = e1xxuxxrbvxxxxxxxxxxrootdir;
		this.e2xxuxxrbvxxxxxxxxxxkeyorder = e2xxuxxrbvxxxxxxxxxxkeyorder;
		this.e3xxzxxxlvxxxxxxxxxxmargin = e3xxzxxxlvxxxxxxxxxxmargin;
		this.e4xxzxxxlvxxxxxxxxxxfooter = e4xxzxxxlvxxxxxxxxxxfooter;
		this.e5xxfxxxbvxxxxxxxxxxlistbuildc = e5xxfxxxbvxxxxxxxxxxlistbuildc;
		this.e6xxfxxxbvxxxxxxxxxxlistbuildv = e6xxfxxxbvxxxxxxxxxxlistbuildv;
		this.e7xxfxxxbvxxxxxxxxxxlistbuilde = e7xxfxxxbvxxxxxxxxxxlistbuilde;
		this.e8xxzxxrbvxxxxxxxxxxlistbrownc = e8xxzxxrbvxxxxxxxxxxlistbrownc;
		this.e9xxzxxrbvxxxxxxxxxxlistbrownv = e9xxzxxrbvxxxxxxxxxxlistbrownv;
		this.eaxxzxxrbvxxxxxxxxxxlistbrowne = eaxxzxxrbvxxxxxxxxxxlistbrowne;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
		this.w7xxuznxbvxxxxxxxxxxnotes = w7xxuznxbvxxxxxxxxxxnotes;
		this.w8xxuzdrbvxxxxxxxxxxdocmnt = w8xxuzdrbvxxxxxxxxxxdocmnt;
		this.z3xxutoxlhxxxxxxxxxxowner = z3xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
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
	@JoinColumn(name = "itemid")
	public Fpxxfq1a5xwwqqhxxxxxitem getFpxxfq1a5xwwqqhxxxxxitem() {
		return this.fpxxfq1a5xwwqqhxxxxxitem;
	}

	public void setFpxxfq1a5xwwqqhxxxxxitem(
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem) {
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
	}

	@Column(name = "row", length = 20)
	@Size(max = 20)
	public String getB1xxukxrbvxxxxxxxxxxrow() {
		return this.b1xxukxrbvxxxxxxxxxxrow;
	}

	public void setB1xxukxrbvxxxxxxxxxxrow(String b1xxukxrbvxxxxxxxxxxrow) {
		this.b1xxukxrbvxxxxxxxxxxrow = b1xxukxrbvxxxxxxxxxxrow;
	}

	@Column(name = "length")
	public String getB1xxusxrbvxxxxxxxxxxlength() {
		return this.b1xxusxrbvxxxxxxxxxxlength;
	}

	public void setB1xxusxrbvxxxxxxxxxxlength(String b1xxusxrbvxxxxxxxxxxlength) {
		this.b1xxusxrbvxxxxxxxxxxlength = b1xxusxrbvxxxxxxxxxxlength;
	}

	@Column(name = "width")
	public String getB1xxu2xrbvxxxxxxxxxxwidth() {
		return this.b1xxu2xrbvxxxxxxxxxxwidth;
	}

	public void setB1xxu2xrbvxxxxxxxxxxwidth(String b1xxu2xrbvxxxxxxxxxxwidth) {
		this.b1xxu2xrbvxxxxxxxxxxwidth = b1xxu2xrbvxxxxxxxxxxwidth;
	}

	@Column(name = "height", length = 30)
	@Size(max = 30)
	public String getB1xxu3xrbvxxxxxxxxxxheight() {
		return this.b1xxu3xrbvxxxxxxxxxxheight;
	}

	public void setB1xxu3xrbvxxxxxxxxxxheight(String b1xxu3xrbvxxxxxxxxxxheight) {
		this.b1xxu3xrbvxxxxxxxxxxheight = b1xxu3xrbvxxxxxxxxxxheight;
	}

	@Column(name = "sizeunit", length = 30)
	@Size(max = 30)
	public String getB2xxuxxrbvxxxxxxxxxxsizeunit() {
		return this.b2xxuxxrbvxxxxxxxxxxsizeunit;
	}

	public void setB2xxuxxrbvxxxxxxxxxxsizeunit(
			String b2xxuxxrbvxxxxxxxxxxsizeunit) {
		this.b2xxuxxrbvxxxxxxxxxxsizeunit = b2xxuxxrbvxxxxxxxxxxsizeunit;
	}

	@Column(name = "weight", length = 30)
	@Size(max = 30)
	public String getB3xxuxxrbvxxxxxxxxxxweight() {
		return this.b3xxuxxrbvxxxxxxxxxxweight;
	}

	public void setB3xxuxxrbvxxxxxxxxxxweight(String b3xxuxxrbvxxxxxxxxxxweight) {
		this.b3xxuxxrbvxxxxxxxxxxweight = b3xxuxxrbvxxxxxxxxxxweight;
	}

	@Column(name = "weightunit", length = 30)
	@Size(max = 30)
	public String getB4xxuxxrbvxxxxxxxxxxweightunit() {
		return this.b4xxuxxrbvxxxxxxxxxxweightunit;
	}

	public void setB4xxuxxrbvxxxxxxxxxxweightunit(
			String b4xxuxxrbvxxxxxxxxxxweightunit) {
		this.b4xxuxxrbvxxxxxxxxxxweightunit = b4xxuxxrbvxxxxxxxxxxweightunit;
	}

	@Column(name = "shipmode", length = 30)
	@Size(max = 30)
	public String getB5xxfxxxbvxxxxxxxxxxshipmode() {
		return this.b5xxfxxxbvxxxxxxxxxxshipmode;
	}

	public void setB5xxfxxxbvxxxxxxxxxxshipmode(
			String b5xxfxxxbvxxxxxxxxxxshipmode) {
		this.b5xxfxxxbvxxxxxxxxxxshipmode = b5xxfxxxbvxxxxxxxxxxshipmode;
	}

	@Column(name = "colour", length = 30)
	@Size(max = 30)
	public String getC1xxfxxxbvxxxxxxxxxxcolour() {
		return this.c1xxfxxxbvxxxxxxxxxxcolour;
	}

	public void setC1xxfxxxbvxxxxxxxxxxcolour(String c1xxfxxxbvxxxxxxxxxxcolour) {
		this.c1xxfxxxbvxxxxxxxxxxcolour = c1xxfxxxbvxxxxxxxxxxcolour;
	}

	@Column(name = "material")
	public Boolean getC1xxfxxxbvxxxxxxxxxxmaterial() {
		return this.c1xxfxxxbvxxxxxxxxxxmaterial;
	}

	public void setC1xxfxxxbvxxxxxxxxxxmaterial(
			Boolean c1xxfxxxbvxxxxxxxxxxmaterial) {
		this.c1xxfxxxbvxxxxxxxxxxmaterial = c1xxfxxxbvxxxxxxxxxxmaterial;
	}

	@Column(name = "madein")
	public Boolean getC1xxfxxxbvxxxxxxxxxxmadein() {
		return this.c1xxfxxxbvxxxxxxxxxxmadein;
	}

	public void setC1xxfxxxbvxxxxxxxxxxmadein(Boolean c1xxfxxxbvxxxxxxxxxxmadein) {
		this.c1xxfxxxbvxxxxxxxxxxmadein = c1xxfxxxbvxxxxxxxxxxmadein;
	}

	@Column(name = "sku")
	public Boolean getC1xxfxxxbvxxxxxxxxxxsku() {
		return this.c1xxfxxxbvxxxxxxxxxxsku;
	}

	public void setC1xxfxxxbvxxxxxxxxxxsku(Boolean c1xxfxxxbvxxxxxxxxxxsku) {
		this.c1xxfxxxbvxxxxxxxxxxsku = c1xxfxxxbvxxxxxxxxxxsku;
	}

	@Column(name = "saleschannel", length = 5)
	@Size(max = 5)
	public String getC2xxfxxxbvxxxxxxxxxxsaleschannel() {
		return this.c2xxfxxxbvxxxxxxxxxxsaleschannel;
	}

	public void setC2xxfxxxbvxxxxxxxxxxsaleschannel(
			String c2xxfxxxbvxxxxxxxxxxsaleschannel) {
		this.c2xxfxxxbvxxxxxxxxxxsaleschannel = c2xxfxxxbvxxxxxxxxxxsaleschannel;
	}

	@Column(name = "compareprice", length = 5)
	@Size(max = 5)
	public String getC3xxuxxrbvxxxxxxxxxxcompareprice() {
		return this.c3xxuxxrbvxxxxxxxxxxcompareprice;
	}

	public void setC3xxuxxrbvxxxxxxxxxxcompareprice(
			String c3xxuxxrbvxxxxxxxxxxcompareprice) {
		this.c3xxuxxrbvxxxxxxxxxxcompareprice = c3xxuxxrbvxxxxxxxxxxcompareprice;
	}

	@Column(name = "customscode", length = 5)
	@Size(max = 5)
	public String getC4xxuxxrbvxxxxxxxxxxcustomscode() {
		return this.c4xxuxxrbvxxxxxxxxxxcustomscode;
	}

	public void setC4xxuxxrbvxxxxxxxxxxcustomscode(
			String c4xxuxxrbvxxxxxxxxxxcustomscode) {
		this.c4xxuxxrbvxxxxxxxxxxcustomscode = c4xxuxxrbvxxxxxxxxxxcustomscode;
	}

	@Column(name = "pagetitle", length = 5)
	@Size(max = 5)
	public String getC5xxuxxrbvxxxxxxxxxxpagetitle() {
		return this.c5xxuxxrbvxxxxxxxxxxpagetitle;
	}

	public void setC5xxuxxrbvxxxxxxxxxxpagetitle(
			String c5xxuxxrbvxxxxxxxxxxpagetitle) {
		this.c5xxuxxrbvxxxxxxxxxxpagetitle = c5xxuxxrbvxxxxxxxxxxpagetitle;
	}

	@Column(name = "metadescription", length = 5)
	@Size(max = 5)
	public String getC6xxuxxrbvxxxxxxxxxxmetadescription() {
		return this.c6xxuxxrbvxxxxxxxxxxmetadescription;
	}

	public void setC6xxuxxrbvxxxxxxxxxxmetadescription(
			String c6xxuxxrbvxxxxxxxxxxmetadescription) {
		this.c6xxuxxrbvxxxxxxxxxxmetadescription = c6xxuxxrbvxxxxxxxxxxmetadescription;
	}

	@Column(name = "urlhandle", length = 5)
	@Size(max = 5)
	public String getC7xxuxxrbvxxxxxxxxxxurlhandle() {
		return this.c7xxuxxrbvxxxxxxxxxxurlhandle;
	}

	public void setC7xxuxxrbvxxxxxxxxxxurlhandle(
			String c7xxuxxrbvxxxxxxxxxxurlhandle) {
		this.c7xxuxxrbvxxxxxxxxxxurlhandle = c7xxuxxrbvxxxxxxxxxxurlhandle;
	}

	@Column(name = "rating", length = 30)
	@Size(max = 30)
	public String getC8xxuxxrbvxxxxxxxxxxrating() {
		return this.c8xxuxxrbvxxxxxxxxxxrating;
	}

	public void setC8xxuxxrbvxxxxxxxxxxrating(String c8xxuxxrbvxxxxxxxxxxrating) {
		this.c8xxuxxrbvxxxxxxxxxxrating = c8xxuxxrbvxxxxxxxxxxrating;
	}

	@Column(name = "points", length = 30)
	@Size(max = 30)
	public String getD1xxuxxrbvxxxxxxxxxxpoints() {
		return this.d1xxuxxrbvxxxxxxxxxxpoints;
	}

	public void setD1xxuxxrbvxxxxxxxxxxpoints(String d1xxuxxrbvxxxxxxxxxxpoints) {
		this.d1xxuxxrbvxxxxxxxxxxpoints = d1xxuxxrbvxxxxxxxxxxpoints;
	}

	@Column(name = "pointsunit", length = 30)
	@Size(max = 30)
	public String getD2xxuxxrbvxxxxxxxxxxpointsunit() {
		return this.d2xxuxxrbvxxxxxxxxxxpointsunit;
	}

	public void setD2xxuxxrbvxxxxxxxxxxpointsunit(
			String d2xxuxxrbvxxxxxxxxxxpointsunit) {
		this.d2xxuxxrbvxxxxxxxxxxpointsunit = d2xxuxxrbvxxxxxxxxxxpointsunit;
	}

	@Column(name = "dtstyle", length = 30)
	@Size(max = 30)
	public String getD3xxuxxrbvxxxxxxxxxxdtstyle() {
		return this.d3xxuxxrbvxxxxxxxxxxdtstyle;
	}

	public void setD3xxuxxrbvxxxxxxxxxxdtstyle(
			String d3xxuxxrbvxxxxxxxxxxdtstyle) {
		this.d3xxuxxrbvxxxxxxxxxxdtstyle = d3xxuxxrbvxxxxxxxxxxdtstyle;
	}

	@Column(name = "ftstyle", length = 20)
	@Size(max = 20)
	public String getD4xxuxxrbvxxxxxxxxxxftstyle() {
		return this.d4xxuxxrbvxxxxxxxxxxftstyle;
	}

	public void setD4xxuxxrbvxxxxxxxxxxftstyle(
			String d4xxuxxrbvxxxxxxxxxxftstyle) {
		this.d4xxuxxrbvxxxxxxxxxxftstyle = d4xxuxxrbvxxxxxxxxxxftstyle;
	}

	@Column(name = "defaultr", length = 3)
	@Size(max = 3)
	public String getD5xxuxxrbvxxxxxxxxxxdefaultr() {
		return this.d5xxuxxrbvxxxxxxxxxxdefaultr;
	}

	public void setD5xxuxxrbvxxxxxxxxxxdefaultr(
			String d5xxuxxrbvxxxxxxxxxxdefaultr) {
		this.d5xxuxxrbvxxxxxxxxxxdefaultr = d5xxuxxrbvxxxxxxxxxxdefaultr;
	}

	@Column(name = "defaultc", length = 3)
	@Size(max = 3)
	public String getD6xxuxxrbvxxxxxxxxxxdefaultc() {
		return this.d6xxuxxrbvxxxxxxxxxxdefaultc;
	}

	public void setD6xxuxxrbvxxxxxxxxxxdefaultc(
			String d6xxuxxrbvxxxxxxxxxxdefaultc) {
		this.d6xxuxxrbvxxxxxxxxxxdefaultc = d6xxuxxrbvxxxxxxxxxxdefaultc;
	}

	@Column(name = "dbname", length = 20)
	@Size(max = 20)
	public String getD7xxuxxrbvxxxxxxxxxxdbname() {
		return this.d7xxuxxrbvxxxxxxxxxxdbname;
	}

	public void setD7xxuxxrbvxxxxxxxxxxdbname(String d7xxuxxrbvxxxxxxxxxxdbname) {
		this.d7xxuxxrbvxxxxxxxxxxdbname = d7xxuxxrbvxxxxxxxxxxdbname;
	}

	@Column(name = "rootdir", length = 35)
	@Size(max = 35)
	public String getE1xxuxxrbvxxxxxxxxxxrootdir() {
		return this.e1xxuxxrbvxxxxxxxxxxrootdir;
	}

	public void setE1xxuxxrbvxxxxxxxxxxrootdir(
			String e1xxuxxrbvxxxxxxxxxxrootdir) {
		this.e1xxuxxrbvxxxxxxxxxxrootdir = e1xxuxxrbvxxxxxxxxxxrootdir;
	}

	@Column(name = "keyorder", length = 3)
	@Size(max = 3)
	public String getE2xxuxxrbvxxxxxxxxxxkeyorder() {
		return this.e2xxuxxrbvxxxxxxxxxxkeyorder;
	}

	public void setE2xxuxxrbvxxxxxxxxxxkeyorder(
			String e2xxuxxrbvxxxxxxxxxxkeyorder) {
		this.e2xxuxxrbvxxxxxxxxxxkeyorder = e2xxuxxrbvxxxxxxxxxxkeyorder;
	}

	@Column(name = "margin", precision = 14)
	public BigDecimal getE3xxzxxxlvxxxxxxxxxxmargin() {
		return this.e3xxzxxxlvxxxxxxxxxxmargin;
	}

	public void setE3xxzxxxlvxxxxxxxxxxmargin(
			BigDecimal e3xxzxxxlvxxxxxxxxxxmargin) {
		this.e3xxzxxxlvxxxxxxxxxxmargin = e3xxzxxxlvxxxxxxxxxxmargin;
	}

	@Column(name = "footer", precision = 14)
	public BigDecimal getE4xxzxxxlvxxxxxxxxxxfooter() {
		return this.e4xxzxxxlvxxxxxxxxxxfooter;
	}

	public void setE4xxzxxxlvxxxxxxxxxxfooter(
			BigDecimal e4xxzxxxlvxxxxxxxxxxfooter) {
		this.e4xxzxxxlvxxxxxxxxxxfooter = e4xxzxxxlvxxxxxxxxxxfooter;
	}

	@Column(name = "listbuildc")
	public Boolean getE5xxfxxxbvxxxxxxxxxxlistbuildc() {
		return this.e5xxfxxxbvxxxxxxxxxxlistbuildc;
	}

	public void setE5xxfxxxbvxxxxxxxxxxlistbuildc(
			Boolean e5xxfxxxbvxxxxxxxxxxlistbuildc) {
		this.e5xxfxxxbvxxxxxxxxxxlistbuildc = e5xxfxxxbvxxxxxxxxxxlistbuildc;
	}

	@Column(name = "listbuildv")
	public Boolean getE6xxfxxxbvxxxxxxxxxxlistbuildv() {
		return this.e6xxfxxxbvxxxxxxxxxxlistbuildv;
	}

	public void setE6xxfxxxbvxxxxxxxxxxlistbuildv(
			Boolean e6xxfxxxbvxxxxxxxxxxlistbuildv) {
		this.e6xxfxxxbvxxxxxxxxxxlistbuildv = e6xxfxxxbvxxxxxxxxxxlistbuildv;
	}

	@Column(name = "listbuilde")
	public Boolean getE7xxfxxxbvxxxxxxxxxxlistbuilde() {
		return this.e7xxfxxxbvxxxxxxxxxxlistbuilde;
	}

	public void setE7xxfxxxbvxxxxxxxxxxlistbuilde(
			Boolean e7xxfxxxbvxxxxxxxxxxlistbuilde) {
		this.e7xxfxxxbvxxxxxxxxxxlistbuilde = e7xxfxxxbvxxxxxxxxxxlistbuilde;
	}

	@Column(name = "listbrownc")
	public Integer getE8xxzxxrbvxxxxxxxxxxlistbrownc() {
		return this.e8xxzxxrbvxxxxxxxxxxlistbrownc;
	}

	public void setE8xxzxxrbvxxxxxxxxxxlistbrownc(
			Integer e8xxzxxrbvxxxxxxxxxxlistbrownc) {
		this.e8xxzxxrbvxxxxxxxxxxlistbrownc = e8xxzxxrbvxxxxxxxxxxlistbrownc;
	}

	@Column(name = "listbrownv")
	public Integer getE9xxzxxrbvxxxxxxxxxxlistbrownv() {
		return this.e9xxzxxrbvxxxxxxxxxxlistbrownv;
	}

	public void setE9xxzxxrbvxxxxxxxxxxlistbrownv(
			Integer e9xxzxxrbvxxxxxxxxxxlistbrownv) {
		this.e9xxzxxrbvxxxxxxxxxxlistbrownv = e9xxzxxrbvxxxxxxxxxxlistbrownv;
	}

	@Column(name = "listbrowne")
	public Integer getEaxxzxxrbvxxxxxxxxxxlistbrowne() {
		return this.eaxxzxxrbvxxxxxxxxxxlistbrowne;
	}

	public void setEaxxzxxrbvxxxxxxxxxxlistbrowne(
			Integer eaxxzxxrbvxxxxxxxxxxlistbrowne) {
		this.eaxxzxxrbvxxxxxxxxxxlistbrowne = eaxxzxxrbvxxxxxxxxxxlistbrowne;
	}

	@Column(name = "statusfl")
	public Integer getZ1xxzzfxhhxxxxxxxxxxstatusfl() {
		return this.z1xxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZ1xxzzfxhhxxxxxxxxxxstatusfl(
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl) {
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "statusfldt", length = 29)
	public Date getZ2xxcztxlxxxxxxxxxxxstatusfldt() {
		return this.z2xxcztxlxxxxxxxxxxxstatusfldt;
	}

	public void setZ2xxcztxlxxxxxxxxxxxstatusfldt(
			Date z2xxcztxlxxxxxxxxxxxstatusfldt) {
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
	}

	@Column(name = "notes", length = 4096000)
	@Size(max = 4096000)
	public String getW7xxuznxbvxxxxxxxxxxnotes() {
		return this.w7xxuznxbvxxxxxxxxxxnotes;
	}

	public void setW7xxuznxbvxxxxxxxxxxnotes(String w7xxuznxbvxxxxxxxxxxnotes) {
		this.w7xxuznxbvxxxxxxxxxxnotes = w7xxuznxbvxxxxxxxxxxnotes;
	}

	@Column(name = "docmnt", length = 90)
	@Size(max = 90)
	public String getW8xxuzdrbvxxxxxxxxxxdocmnt() {
		return this.w8xxuzdrbvxxxxxxxxxxdocmnt;
	}

	public void setW8xxuzdrbvxxxxxxxxxxdocmnt(String w8xxuzdrbvxxxxxxxxxxdocmnt) {
		this.w8xxuzdrbvxxxxxxxxxxdocmnt = w8xxuzdrbvxxxxxxxxxxdocmnt;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZ3xxutoxlhxxxxxxxxxxowner() {
		return this.z3xxutoxlhxxxxxxxxxxowner;
	}

	public void setZ3xxutoxlhxxxxxxxxxxowner(String z3xxutoxlhxxxxxxxxxxowner) {
		this.z3xxutoxlhxxxxxxxxxxowner = z3xxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
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
