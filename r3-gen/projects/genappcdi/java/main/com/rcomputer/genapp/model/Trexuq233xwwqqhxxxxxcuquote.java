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
 * Trexuq233xwwqqhxxxxxcuquote generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "cuquote")
public class Trexuq233xwwqqhxxxxxcuquote implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Trexuq233xwwqqhxxxxxcuquote trexuq233xwwqqhxxxxxcuquote;
	private Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee;
	private Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer;
	private Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem;
	private String a0xxuncqbvxxxxxxxxxxpurchsno;
	private Date b1xxcxxrlxxxxxxxxxxxdelvdatet;
	private Integer z2xxuvxrblxxxxxxxxxxvendor;
	private BigDecimal z1xxztprlxxxxxxxxxxxamounttotal;
	private BigDecimal z2xxzyprlxxxxxxxxxxxamountostndt;
	private BigDecimal z3xxztqrlxxxxxxxxxxxqtytotal;
	private BigDecimal z4xxzyqrlxxxxxxxxxxxqtyostndt;
	private Integer z5xxzzfxhhxxxxxxxxxxstatusfl;
	private String y3xxuxxrblxxxxxxxxxxcinvoice;
	private BigDecimal y4xxzpxxavxxxxxxxxxxordprice;
	private String y5xxuxxrblxxxxxxxxxxjobno;
	private String y6xxuxxrblxxxxxxxxxxvpono;
	private String y7xxuxxrblxxxxxxxxxxquoordt;
	private Date z6xxcztxlxxxxxxxxxxxstatusfldt;
	private Integer z7xxzzprhvxxxxxxxxxxprintmstat;
	private Date z8xxczqxlhxxxxxxxxxxprinmtfldt;
	private String b5xxuxxrbl10xxxxxxxxtype;
	private String b6xxuxxrbl09xxxxxxxxterms;
	private Boolean b7xxfxxrbvxxxxxxxxxxpriority;
	private Date b8xxcxxrlxxxxxxxxxxxodatet;
	private Integer y8xxuxxrblxxxxxxxxxxshipcode;
	private String y9xxuxxrblxxxxxxxxxxactivitycode;
	private BigDecimal z7xxzbtxavxxxxxxxxxxbaseamountt;
	private BigDecimal z9xxzltxavxxxxxxxxxxdelivchrgt;
	private BigDecimal zaxxzmtxavxxxxxxxxxxmiscchrgt;
	private BigDecimal zbxxzxz1avxxxxxxxxxxtax1amtt;
	private BigDecimal zcxxzxz2avxxxxxxxxxxtax2amtt;
	private BigDecimal zdxxzxz3avxxxxxxxxxxtax3amtt;
	private String yaxxuxxrblxxxxxxxxxxattach;
	private String ybxxuznybvxxxxxxxxxxnotes;
	private String zexxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private String ycxxuzdrblxxxxxxxxxxdocmnt;
	private Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuorderses = new HashSet<Trexuq244xwwqqhxxxxxcuorders>(
			0);
	private Set<Xoxxuq2c4xwwqqhxxxxxcuqdetails> xoxxuq2c4xwwqqhxxxxxcuqdetailses = new HashSet<Xoxxuq2c4xwwqqhxxxxxcuqdetails>(
			0);
	private Set<Trexuq233xwwqqhxxxxxcuquote> trexuq233xwwqqhxxxxxcuquotes = new HashSet<Trexuq233xwwqqhxxxxxcuquote>(
			0);

	public Trexuq233xwwqqhxxxxxcuquote() {
	}

	public Trexuq233xwwqqhxxxxxcuquote(String a0xxuncqbvxxxxxxxxxxpurchsno) {
		this.a0xxuncqbvxxxxxxxxxxpurchsno = a0xxuncqbvxxxxxxxxxxpurchsno;
	}
	public Trexuq233xwwqqhxxxxxcuquote(
			Trexuq233xwwqqhxxxxxcuquote trexuq233xwwqqhxxxxxcuquote,
			Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee,
			Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer,
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem,
			String a0xxuncqbvxxxxxxxxxxpurchsno,
			Date b1xxcxxrlxxxxxxxxxxxdelvdatet,
			Integer z2xxuvxrblxxxxxxxxxxvendor,
			BigDecimal z1xxztprlxxxxxxxxxxxamounttotal,
			BigDecimal z2xxzyprlxxxxxxxxxxxamountostndt,
			BigDecimal z3xxztqrlxxxxxxxxxxxqtytotal,
			BigDecimal z4xxzyqrlxxxxxxxxxxxqtyostndt,
			Integer z5xxzzfxhhxxxxxxxxxxstatusfl,
			String y3xxuxxrblxxxxxxxxxxcinvoice,
			BigDecimal y4xxzpxxavxxxxxxxxxxordprice,
			String y5xxuxxrblxxxxxxxxxxjobno,
			String y6xxuxxrblxxxxxxxxxxvpono,
			String y7xxuxxrblxxxxxxxxxxquoordt,
			Date z6xxcztxlxxxxxxxxxxxstatusfldt,
			Integer z7xxzzprhvxxxxxxxxxxprintmstat,
			Date z8xxczqxlhxxxxxxxxxxprinmtfldt,
			String b5xxuxxrbl10xxxxxxxxtype,
			String b6xxuxxrbl09xxxxxxxxterms,
			Boolean b7xxfxxrbvxxxxxxxxxxpriority,
			Date b8xxcxxrlxxxxxxxxxxxodatet,
			Integer y8xxuxxrblxxxxxxxxxxshipcode,
			String y9xxuxxrblxxxxxxxxxxactivitycode,
			BigDecimal z7xxzbtxavxxxxxxxxxxbaseamountt,
			BigDecimal z9xxzltxavxxxxxxxxxxdelivchrgt,
			BigDecimal zaxxzmtxavxxxxxxxxxxmiscchrgt,
			BigDecimal zbxxzxz1avxxxxxxxxxxtax1amtt,
			BigDecimal zcxxzxz2avxxxxxxxxxxtax2amtt,
			BigDecimal zdxxzxz3avxxxxxxxxxxtax3amtt,
			String yaxxuxxrblxxxxxxxxxxattach,
			String ybxxuznybvxxxxxxxxxxnotes,
			String zexxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			String ycxxuzdrblxxxxxxxxxxdocmnt,
			Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuorderses,
			Set<Xoxxuq2c4xwwqqhxxxxxcuqdetails> xoxxuq2c4xwwqqhxxxxxcuqdetailses,
			Set<Trexuq233xwwqqhxxxxxcuquote> trexuq233xwwqqhxxxxxcuquotes) {
		this.trexuq233xwwqqhxxxxxcuquote = trexuq233xwwqqhxxxxxcuquote;
		this.jxxxbh400xwwqqhxxxxxemployee = jxxxbh400xwwqqhxxxxxemployee;
		this.jxxxuq201xwwqqhxxxxxcustomer = jxxxuq201xwwqqhxxxxxcustomer;
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
		this.a0xxuncqbvxxxxxxxxxxpurchsno = a0xxuncqbvxxxxxxxxxxpurchsno;
		this.b1xxcxxrlxxxxxxxxxxxdelvdatet = b1xxcxxrlxxxxxxxxxxxdelvdatet;
		this.z2xxuvxrblxxxxxxxxxxvendor = z2xxuvxrblxxxxxxxxxxvendor;
		this.z1xxztprlxxxxxxxxxxxamounttotal = z1xxztprlxxxxxxxxxxxamounttotal;
		this.z2xxzyprlxxxxxxxxxxxamountostndt = z2xxzyprlxxxxxxxxxxxamountostndt;
		this.z3xxztqrlxxxxxxxxxxxqtytotal = z3xxztqrlxxxxxxxxxxxqtytotal;
		this.z4xxzyqrlxxxxxxxxxxxqtyostndt = z4xxzyqrlxxxxxxxxxxxqtyostndt;
		this.z5xxzzfxhhxxxxxxxxxxstatusfl = z5xxzzfxhhxxxxxxxxxxstatusfl;
		this.y3xxuxxrblxxxxxxxxxxcinvoice = y3xxuxxrblxxxxxxxxxxcinvoice;
		this.y4xxzpxxavxxxxxxxxxxordprice = y4xxzpxxavxxxxxxxxxxordprice;
		this.y5xxuxxrblxxxxxxxxxxjobno = y5xxuxxrblxxxxxxxxxxjobno;
		this.y6xxuxxrblxxxxxxxxxxvpono = y6xxuxxrblxxxxxxxxxxvpono;
		this.y7xxuxxrblxxxxxxxxxxquoordt = y7xxuxxrblxxxxxxxxxxquoordt;
		this.z6xxcztxlxxxxxxxxxxxstatusfldt = z6xxcztxlxxxxxxxxxxxstatusfldt;
		this.z7xxzzprhvxxxxxxxxxxprintmstat = z7xxzzprhvxxxxxxxxxxprintmstat;
		this.z8xxczqxlhxxxxxxxxxxprinmtfldt = z8xxczqxlhxxxxxxxxxxprinmtfldt;
		this.b5xxuxxrbl10xxxxxxxxtype = b5xxuxxrbl10xxxxxxxxtype;
		this.b6xxuxxrbl09xxxxxxxxterms = b6xxuxxrbl09xxxxxxxxterms;
		this.b7xxfxxrbvxxxxxxxxxxpriority = b7xxfxxrbvxxxxxxxxxxpriority;
		this.b8xxcxxrlxxxxxxxxxxxodatet = b8xxcxxrlxxxxxxxxxxxodatet;
		this.y8xxuxxrblxxxxxxxxxxshipcode = y8xxuxxrblxxxxxxxxxxshipcode;
		this.y9xxuxxrblxxxxxxxxxxactivitycode = y9xxuxxrblxxxxxxxxxxactivitycode;
		this.z7xxzbtxavxxxxxxxxxxbaseamountt = z7xxzbtxavxxxxxxxxxxbaseamountt;
		this.z9xxzltxavxxxxxxxxxxdelivchrgt = z9xxzltxavxxxxxxxxxxdelivchrgt;
		this.zaxxzmtxavxxxxxxxxxxmiscchrgt = zaxxzmtxavxxxxxxxxxxmiscchrgt;
		this.zbxxzxz1avxxxxxxxxxxtax1amtt = zbxxzxz1avxxxxxxxxxxtax1amtt;
		this.zcxxzxz2avxxxxxxxxxxtax2amtt = zcxxzxz2avxxxxxxxxxxtax2amtt;
		this.zdxxzxz3avxxxxxxxxxxtax3amtt = zdxxzxz3avxxxxxxxxxxtax3amtt;
		this.yaxxuxxrblxxxxxxxxxxattach = yaxxuxxrblxxxxxxxxxxattach;
		this.ybxxuznybvxxxxxxxxxxnotes = ybxxuznybvxxxxxxxxxxnotes;
		this.zexxutoxlhxxxxxxxxxxowner = zexxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.ycxxuzdrblxxxxxxxxxxdocmnt = ycxxuzdrblxxxxxxxxxxdocmnt;
		this.trexuq244xwwqqhxxxxxcuorderses = trexuq244xwwqqhxxxxxcuorderses;
		this.xoxxuq2c4xwwqqhxxxxxcuqdetailses = xoxxuq2c4xwwqqhxxxxxcuqdetailses;
		this.trexuq233xwwqqhxxxxxcuquotes = trexuq233xwwqqhxxxxxcuquotes;
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
	@JoinColumn(name = "replicate")
	public Trexuq233xwwqqhxxxxxcuquote getTrexuq233xwwqqhxxxxxcuquote() {
		return this.trexuq233xwwqqhxxxxxcuquote;
	}

	public void setTrexuq233xwwqqhxxxxxcuquote(
			Trexuq233xwwqqhxxxxxcuquote trexuq233xwwqqhxxxxxcuquote) {
		this.trexuq233xwwqqhxxxxxcuquote = trexuq233xwwqqhxxxxxcuquote;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agent")
	public Jxxxbh400xwwqqhxxxxxemployee getJxxxbh400xwwqqhxxxxxemployee() {
		return this.jxxxbh400xwwqqhxxxxxemployee;
	}

	public void setJxxxbh400xwwqqhxxxxxemployee(
			Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee) {
		this.jxxxbh400xwwqqhxxxxxemployee = jxxxbh400xwwqqhxxxxxemployee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer")
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

	@Column(name = "purchsno", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxuncqbvxxxxxxxxxxpurchsno() {
		return this.a0xxuncqbvxxxxxxxxxxpurchsno;
	}

	public void setA0xxuncqbvxxxxxxxxxxpurchsno(
			String a0xxuncqbvxxxxxxxxxxpurchsno) {
		this.a0xxuncqbvxxxxxxxxxxpurchsno = a0xxuncqbvxxxxxxxxxxpurchsno;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "delvdatet", length = 29)
	public Date getB1xxcxxrlxxxxxxxxxxxdelvdatet() {
		return this.b1xxcxxrlxxxxxxxxxxxdelvdatet;
	}

	public void setB1xxcxxrlxxxxxxxxxxxdelvdatet(
			Date b1xxcxxrlxxxxxxxxxxxdelvdatet) {
		this.b1xxcxxrlxxxxxxxxxxxdelvdatet = b1xxcxxrlxxxxxxxxxxxdelvdatet;
	}

	@Column(name = "vendor")
	public Integer getZ2xxuvxrblxxxxxxxxxxvendor() {
		return this.z2xxuvxrblxxxxxxxxxxvendor;
	}

	public void setZ2xxuvxrblxxxxxxxxxxvendor(Integer z2xxuvxrblxxxxxxxxxxvendor) {
		this.z2xxuvxrblxxxxxxxxxxvendor = z2xxuvxrblxxxxxxxxxxvendor;
	}

	@Column(name = "amounttotal", precision = 14)
	public BigDecimal getZ1xxztprlxxxxxxxxxxxamounttotal() {
		return this.z1xxztprlxxxxxxxxxxxamounttotal;
	}

	public void setZ1xxztprlxxxxxxxxxxxamounttotal(
			BigDecimal z1xxztprlxxxxxxxxxxxamounttotal) {
		this.z1xxztprlxxxxxxxxxxxamounttotal = z1xxztprlxxxxxxxxxxxamounttotal;
	}

	@Column(name = "amountostndt", precision = 14)
	public BigDecimal getZ2xxzyprlxxxxxxxxxxxamountostndt() {
		return this.z2xxzyprlxxxxxxxxxxxamountostndt;
	}

	public void setZ2xxzyprlxxxxxxxxxxxamountostndt(
			BigDecimal z2xxzyprlxxxxxxxxxxxamountostndt) {
		this.z2xxzyprlxxxxxxxxxxxamountostndt = z2xxzyprlxxxxxxxxxxxamountostndt;
	}

	@Column(name = "qtytotal", precision = 14)
	public BigDecimal getZ3xxztqrlxxxxxxxxxxxqtytotal() {
		return this.z3xxztqrlxxxxxxxxxxxqtytotal;
	}

	public void setZ3xxztqrlxxxxxxxxxxxqtytotal(
			BigDecimal z3xxztqrlxxxxxxxxxxxqtytotal) {
		this.z3xxztqrlxxxxxxxxxxxqtytotal = z3xxztqrlxxxxxxxxxxxqtytotal;
	}

	@Column(name = "qtyostndt", precision = 14)
	public BigDecimal getZ4xxzyqrlxxxxxxxxxxxqtyostndt() {
		return this.z4xxzyqrlxxxxxxxxxxxqtyostndt;
	}

	public void setZ4xxzyqrlxxxxxxxxxxxqtyostndt(
			BigDecimal z4xxzyqrlxxxxxxxxxxxqtyostndt) {
		this.z4xxzyqrlxxxxxxxxxxxqtyostndt = z4xxzyqrlxxxxxxxxxxxqtyostndt;
	}

	@Column(name = "statusfl")
	public Integer getZ5xxzzfxhhxxxxxxxxxxstatusfl() {
		return this.z5xxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZ5xxzzfxhhxxxxxxxxxxstatusfl(
			Integer z5xxzzfxhhxxxxxxxxxxstatusfl) {
		this.z5xxzzfxhhxxxxxxxxxxstatusfl = z5xxzzfxhhxxxxxxxxxxstatusfl;
	}

	@Column(name = "cinvoice", length = 20)
	@Size(max = 20)
	public String getY3xxuxxrblxxxxxxxxxxcinvoice() {
		return this.y3xxuxxrblxxxxxxxxxxcinvoice;
	}

	public void setY3xxuxxrblxxxxxxxxxxcinvoice(
			String y3xxuxxrblxxxxxxxxxxcinvoice) {
		this.y3xxuxxrblxxxxxxxxxxcinvoice = y3xxuxxrblxxxxxxxxxxcinvoice;
	}

	@Column(name = "ordprice", precision = 14)
	public BigDecimal getY4xxzpxxavxxxxxxxxxxordprice() {
		return this.y4xxzpxxavxxxxxxxxxxordprice;
	}

	public void setY4xxzpxxavxxxxxxxxxxordprice(
			BigDecimal y4xxzpxxavxxxxxxxxxxordprice) {
		this.y4xxzpxxavxxxxxxxxxxordprice = y4xxzpxxavxxxxxxxxxxordprice;
	}

	@Column(name = "jobno", length = 20)
	@Size(max = 20)
	public String getY5xxuxxrblxxxxxxxxxxjobno() {
		return this.y5xxuxxrblxxxxxxxxxxjobno;
	}

	public void setY5xxuxxrblxxxxxxxxxxjobno(String y5xxuxxrblxxxxxxxxxxjobno) {
		this.y5xxuxxrblxxxxxxxxxxjobno = y5xxuxxrblxxxxxxxxxxjobno;
	}

	@Column(name = "vpono", length = 20)
	@Size(max = 20)
	public String getY6xxuxxrblxxxxxxxxxxvpono() {
		return this.y6xxuxxrblxxxxxxxxxxvpono;
	}

	public void setY6xxuxxrblxxxxxxxxxxvpono(String y6xxuxxrblxxxxxxxxxxvpono) {
		this.y6xxuxxrblxxxxxxxxxxvpono = y6xxuxxrblxxxxxxxxxxvpono;
	}

	@Column(name = "quoordt", length = 20)
	@Size(max = 20)
	public String getY7xxuxxrblxxxxxxxxxxquoordt() {
		return this.y7xxuxxrblxxxxxxxxxxquoordt;
	}

	public void setY7xxuxxrblxxxxxxxxxxquoordt(
			String y7xxuxxrblxxxxxxxxxxquoordt) {
		this.y7xxuxxrblxxxxxxxxxxquoordt = y7xxuxxrblxxxxxxxxxxquoordt;
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

	@Column(name = "type", length = 12)
	@Size(max = 12)
	public String getB5xxuxxrbl10xxxxxxxxtype() {
		return this.b5xxuxxrbl10xxxxxxxxtype;
	}

	public void setB5xxuxxrbl10xxxxxxxxtype(String b5xxuxxrbl10xxxxxxxxtype) {
		this.b5xxuxxrbl10xxxxxxxxtype = b5xxuxxrbl10xxxxxxxxtype;
	}

	@Column(name = "terms", length = 25)
	@Size(max = 25)
	public String getB6xxuxxrbl09xxxxxxxxterms() {
		return this.b6xxuxxrbl09xxxxxxxxterms;
	}

	public void setB6xxuxxrbl09xxxxxxxxterms(String b6xxuxxrbl09xxxxxxxxterms) {
		this.b6xxuxxrbl09xxxxxxxxterms = b6xxuxxrbl09xxxxxxxxterms;
	}

	@Column(name = "priority")
	public Boolean getB7xxfxxrbvxxxxxxxxxxpriority() {
		return this.b7xxfxxrbvxxxxxxxxxxpriority;
	}

	public void setB7xxfxxrbvxxxxxxxxxxpriority(
			Boolean b7xxfxxrbvxxxxxxxxxxpriority) {
		this.b7xxfxxrbvxxxxxxxxxxpriority = b7xxfxxrbvxxxxxxxxxxpriority;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "odatet", length = 29)
	public Date getB8xxcxxrlxxxxxxxxxxxodatet() {
		return this.b8xxcxxrlxxxxxxxxxxxodatet;
	}

	public void setB8xxcxxrlxxxxxxxxxxxodatet(Date b8xxcxxrlxxxxxxxxxxxodatet) {
		this.b8xxcxxrlxxxxxxxxxxxodatet = b8xxcxxrlxxxxxxxxxxxodatet;
	}

	@Column(name = "shipcode")
	public Integer getY8xxuxxrblxxxxxxxxxxshipcode() {
		return this.y8xxuxxrblxxxxxxxxxxshipcode;
	}

	public void setY8xxuxxrblxxxxxxxxxxshipcode(
			Integer y8xxuxxrblxxxxxxxxxxshipcode) {
		this.y8xxuxxrblxxxxxxxxxxshipcode = y8xxuxxrblxxxxxxxxxxshipcode;
	}

	@Column(name = "activitycode", length = 20)
	@Size(max = 20)
	public String getY9xxuxxrblxxxxxxxxxxactivitycode() {
		return this.y9xxuxxrblxxxxxxxxxxactivitycode;
	}

	public void setY9xxuxxrblxxxxxxxxxxactivitycode(
			String y9xxuxxrblxxxxxxxxxxactivitycode) {
		this.y9xxuxxrblxxxxxxxxxxactivitycode = y9xxuxxrblxxxxxxxxxxactivitycode;
	}

	@Column(name = "baseamountt", precision = 14)
	public BigDecimal getZ7xxzbtxavxxxxxxxxxxbaseamountt() {
		return this.z7xxzbtxavxxxxxxxxxxbaseamountt;
	}

	public void setZ7xxzbtxavxxxxxxxxxxbaseamountt(
			BigDecimal z7xxzbtxavxxxxxxxxxxbaseamountt) {
		this.z7xxzbtxavxxxxxxxxxxbaseamountt = z7xxzbtxavxxxxxxxxxxbaseamountt;
	}

	@Column(name = "delivchrgt", precision = 14)
	public BigDecimal getZ9xxzltxavxxxxxxxxxxdelivchrgt() {
		return this.z9xxzltxavxxxxxxxxxxdelivchrgt;
	}

	public void setZ9xxzltxavxxxxxxxxxxdelivchrgt(
			BigDecimal z9xxzltxavxxxxxxxxxxdelivchrgt) {
		this.z9xxzltxavxxxxxxxxxxdelivchrgt = z9xxzltxavxxxxxxxxxxdelivchrgt;
	}

	@Column(name = "miscchrgt", precision = 14)
	public BigDecimal getZaxxzmtxavxxxxxxxxxxmiscchrgt() {
		return this.zaxxzmtxavxxxxxxxxxxmiscchrgt;
	}

	public void setZaxxzmtxavxxxxxxxxxxmiscchrgt(
			BigDecimal zaxxzmtxavxxxxxxxxxxmiscchrgt) {
		this.zaxxzmtxavxxxxxxxxxxmiscchrgt = zaxxzmtxavxxxxxxxxxxmiscchrgt;
	}

	@Column(name = "tax1amtt", precision = 14)
	public BigDecimal getZbxxzxz1avxxxxxxxxxxtax1amtt() {
		return this.zbxxzxz1avxxxxxxxxxxtax1amtt;
	}

	public void setZbxxzxz1avxxxxxxxxxxtax1amtt(
			BigDecimal zbxxzxz1avxxxxxxxxxxtax1amtt) {
		this.zbxxzxz1avxxxxxxxxxxtax1amtt = zbxxzxz1avxxxxxxxxxxtax1amtt;
	}

	@Column(name = "tax2amtt", precision = 14)
	public BigDecimal getZcxxzxz2avxxxxxxxxxxtax2amtt() {
		return this.zcxxzxz2avxxxxxxxxxxtax2amtt;
	}

	public void setZcxxzxz2avxxxxxxxxxxtax2amtt(
			BigDecimal zcxxzxz2avxxxxxxxxxxtax2amtt) {
		this.zcxxzxz2avxxxxxxxxxxtax2amtt = zcxxzxz2avxxxxxxxxxxtax2amtt;
	}

	@Column(name = "tax3amtt", precision = 14)
	public BigDecimal getZdxxzxz3avxxxxxxxxxxtax3amtt() {
		return this.zdxxzxz3avxxxxxxxxxxtax3amtt;
	}

	public void setZdxxzxz3avxxxxxxxxxxtax3amtt(
			BigDecimal zdxxzxz3avxxxxxxxxxxtax3amtt) {
		this.zdxxzxz3avxxxxxxxxxxtax3amtt = zdxxzxz3avxxxxxxxxxxtax3amtt;
	}

	@Column(name = "attach", length = 20)
	@Size(max = 20)
	public String getYaxxuxxrblxxxxxxxxxxattach() {
		return this.yaxxuxxrblxxxxxxxxxxattach;
	}

	public void setYaxxuxxrblxxxxxxxxxxattach(String yaxxuxxrblxxxxxxxxxxattach) {
		this.yaxxuxxrblxxxxxxxxxxattach = yaxxuxxrblxxxxxxxxxxattach;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getYbxxuznybvxxxxxxxxxxnotes() {
		return this.ybxxuznybvxxxxxxxxxxnotes;
	}

	public void setYbxxuznybvxxxxxxxxxxnotes(String ybxxuznybvxxxxxxxxxxnotes) {
		this.ybxxuznybvxxxxxxxxxxnotes = ybxxuznybvxxxxxxxxxxnotes;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZexxutoxlhxxxxxxxxxxowner() {
		return this.zexxutoxlhxxxxxxxxxxowner;
	}

	public void setZexxutoxlhxxxxxxxxxxowner(String zexxutoxlhxxxxxxxxxxowner) {
		this.zexxutoxlhxxxxxxxxxxowner = zexxutoxlhxxxxxxxxxxowner;
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
	public String getYcxxuzdrblxxxxxxxxxxdocmnt() {
		return this.ycxxuzdrblxxxxxxxxxxdocmnt;
	}

	public void setYcxxuzdrblxxxxxxxxxxdocmnt(String ycxxuzdrblxxxxxxxxxxdocmnt) {
		this.ycxxuzdrblxxxxxxxxxxdocmnt = ycxxuzdrblxxxxxxxxxxdocmnt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trexuq233xwwqqhxxxxxcuquote")
	public Set<Trexuq244xwwqqhxxxxxcuorders> getTrexuq244xwwqqhxxxxxcuorderses() {
		return this.trexuq244xwwqqhxxxxxcuorderses;
	}

	public void setTrexuq244xwwqqhxxxxxcuorderses(
			Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuorderses) {
		this.trexuq244xwwqqhxxxxxcuorderses = trexuq244xwwqqhxxxxxcuorderses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trexuq233xwwqqhxxxxxcuquote")
	public Set<Xoxxuq2c4xwwqqhxxxxxcuqdetails> getXoxxuq2c4xwwqqhxxxxxcuqdetailses() {
		return this.xoxxuq2c4xwwqqhxxxxxcuqdetailses;
	}

	public void setXoxxuq2c4xwwqqhxxxxxcuqdetailses(
			Set<Xoxxuq2c4xwwqqhxxxxxcuqdetails> xoxxuq2c4xwwqqhxxxxxcuqdetailses) {
		this.xoxxuq2c4xwwqqhxxxxxcuqdetailses = xoxxuq2c4xwwqqhxxxxxcuqdetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trexuq233xwwqqhxxxxxcuquote")
	public Set<Trexuq233xwwqqhxxxxxcuquote> getTrexuq233xwwqqhxxxxxcuquotes() {
		return this.trexuq233xwwqqhxxxxxcuquotes;
	}

	public void setTrexuq233xwwqqhxxxxxcuquotes(
			Set<Trexuq233xwwqqhxxxxxcuquote> trexuq233xwwqqhxxxxxcuquotes) {
		this.trexuq233xwwqqhxxxxxcuquotes = trexuq233xwwqqhxxxxxcuquotes;
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
