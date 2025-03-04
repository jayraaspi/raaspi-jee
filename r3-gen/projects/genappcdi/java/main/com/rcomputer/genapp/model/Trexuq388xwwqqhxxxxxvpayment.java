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
 * Trexuq388xwwqqhxxxxxvpayment generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "vpayment")
public class Trexuq388xwwqqhxxxxxvpayment implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Trexuq3a6xwwqqhxxxxxvinvoice trexuq3a6xwwqqhxxxxxvinvoice;
	private Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor;
	private Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount;
	private String a0xxunvpbvxxxxxxxxxxpayment;
	private Date b3xxxxxrlxxxxxxxxxxxcheqdate;
	private Date c1xxxxxrlxxxxxxxxxxxpaymentduedate;
	private Integer c2xxpxeravxxxxxxxxxxpostingperiod;
	private Integer d1xxudiravxxxxxxxxxxmatcode;
	private String f1xxuwmxbv40xxxxxxxxintegrset;
	private BigDecimal b3xxztprlxxxxxxxxxxxamounttotal;
	private BigDecimal z1xxzyprlxxxxxxxxxxxamountostndt;
	private BigDecimal d1xxzyprlxxxxxxxxxxxamountin;
	private BigDecimal z2xxztqrlxxxxxxxxxxxqtytotal;
	private BigDecimal z3xxzyqrlxxxxxxxxxxxqtyostndt;
	private BigDecimal z7xxzbtxavxxxxxxxxxxbaseamountt;
	private BigDecimal z7xxzltxavxxxxxxxxxxdelivchrgt;
	private BigDecimal z8xxzmtxavxxxxxxxxxxmiscchrgt;
	private BigDecimal z4xxzxz1avxxxxxxxxxxtax1amtt;
	private BigDecimal z5xxzxz2avxxxxxxxxxxtax2amtt;
	private BigDecimal z6xxzxz3avxxxxxxxxxxtax3amtt;
	private BigDecimal b4xxzixrbvxxxxxxxxxxdiscount;
	private String b5xxuxxrbv10xxxxxxxxpaytype;
	private String z5xxuxxrbvxxxxxxxxxxpaybyid;
	private Date z6xxcxxrlxxxxxxxxxxxpaybydate;
	private String c1xxuxxrbvxxxxxxxxxxcurrency;
	private BigDecimal c2xxzxxrbvxxxxxxxxxxconvrate;
	private BigDecimal z9xxzxxrbvxxxxxxxxxxlocamount;
	private Integer zaxxzzfxhhxxxxxxxxxxstatusfl;
	private Date zbxxcztxlxxxxxxxxxxxstatusfldt;
	private String y2xxuxznbvxxxxxxxxxxnotes;
	private String zcxxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Set<Xoxxuq3b4xwwqqhxxxxxvendpdetails> xoxxuq3b4xwwqqhxxxxxvendpdetailses = new HashSet<Xoxxuq3b4xwwqqhxxxxxvendpdetails>(
			0);

	public Trexuq388xwwqqhxxxxxvpayment() {
	}

	public Trexuq388xwwqqhxxxxxvpayment(String a0xxunvpbvxxxxxxxxxxpayment) {
		this.a0xxunvpbvxxxxxxxxxxpayment = a0xxunvpbvxxxxxxxxxxpayment;
	}
	public Trexuq388xwwqqhxxxxxvpayment(
			Trexuq3a6xwwqqhxxxxxvinvoice trexuq3a6xwwqqhxxxxxvinvoice,
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor,
			Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount,
			String a0xxunvpbvxxxxxxxxxxpayment,
			Date b3xxxxxrlxxxxxxxxxxxcheqdate,
			Date c1xxxxxrlxxxxxxxxxxxpaymentduedate,
			Integer c2xxpxeravxxxxxxxxxxpostingperiod,
			Integer d1xxudiravxxxxxxxxxxmatcode,
			String f1xxuwmxbv40xxxxxxxxintegrset,
			BigDecimal b3xxztprlxxxxxxxxxxxamounttotal,
			BigDecimal z1xxzyprlxxxxxxxxxxxamountostndt,
			BigDecimal d1xxzyprlxxxxxxxxxxxamountin,
			BigDecimal z2xxztqrlxxxxxxxxxxxqtytotal,
			BigDecimal z3xxzyqrlxxxxxxxxxxxqtyostndt,
			BigDecimal z7xxzbtxavxxxxxxxxxxbaseamountt,
			BigDecimal z7xxzltxavxxxxxxxxxxdelivchrgt,
			BigDecimal z8xxzmtxavxxxxxxxxxxmiscchrgt,
			BigDecimal z4xxzxz1avxxxxxxxxxxtax1amtt,
			BigDecimal z5xxzxz2avxxxxxxxxxxtax2amtt,
			BigDecimal z6xxzxz3avxxxxxxxxxxtax3amtt,
			BigDecimal b4xxzixrbvxxxxxxxxxxdiscount,
			String b5xxuxxrbv10xxxxxxxxpaytype,
			String z5xxuxxrbvxxxxxxxxxxpaybyid,
			Date z6xxcxxrlxxxxxxxxxxxpaybydate,
			String c1xxuxxrbvxxxxxxxxxxcurrency,
			BigDecimal c2xxzxxrbvxxxxxxxxxxconvrate,
			BigDecimal z9xxzxxrbvxxxxxxxxxxlocamount,
			Integer zaxxzzfxhhxxxxxxxxxxstatusfl,
			Date zbxxcztxlxxxxxxxxxxxstatusfldt,
			String y2xxuxznbvxxxxxxxxxxnotes,
			String zcxxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Set<Xoxxuq3b4xwwqqhxxxxxvendpdetails> xoxxuq3b4xwwqqhxxxxxvendpdetailses) {
		this.trexuq3a6xwwqqhxxxxxvinvoice = trexuq3a6xwwqqhxxxxxvinvoice;
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
		this.yxxxch601xwwqqhxxxxxaccount = yxxxch601xwwqqhxxxxxaccount;
		this.a0xxunvpbvxxxxxxxxxxpayment = a0xxunvpbvxxxxxxxxxxpayment;
		this.b3xxxxxrlxxxxxxxxxxxcheqdate = b3xxxxxrlxxxxxxxxxxxcheqdate;
		this.c1xxxxxrlxxxxxxxxxxxpaymentduedate = c1xxxxxrlxxxxxxxxxxxpaymentduedate;
		this.c2xxpxeravxxxxxxxxxxpostingperiod = c2xxpxeravxxxxxxxxxxpostingperiod;
		this.d1xxudiravxxxxxxxxxxmatcode = d1xxudiravxxxxxxxxxxmatcode;
		this.f1xxuwmxbv40xxxxxxxxintegrset = f1xxuwmxbv40xxxxxxxxintegrset;
		this.b3xxztprlxxxxxxxxxxxamounttotal = b3xxztprlxxxxxxxxxxxamounttotal;
		this.z1xxzyprlxxxxxxxxxxxamountostndt = z1xxzyprlxxxxxxxxxxxamountostndt;
		this.d1xxzyprlxxxxxxxxxxxamountin = d1xxzyprlxxxxxxxxxxxamountin;
		this.z2xxztqrlxxxxxxxxxxxqtytotal = z2xxztqrlxxxxxxxxxxxqtytotal;
		this.z3xxzyqrlxxxxxxxxxxxqtyostndt = z3xxzyqrlxxxxxxxxxxxqtyostndt;
		this.z7xxzbtxavxxxxxxxxxxbaseamountt = z7xxzbtxavxxxxxxxxxxbaseamountt;
		this.z7xxzltxavxxxxxxxxxxdelivchrgt = z7xxzltxavxxxxxxxxxxdelivchrgt;
		this.z8xxzmtxavxxxxxxxxxxmiscchrgt = z8xxzmtxavxxxxxxxxxxmiscchrgt;
		this.z4xxzxz1avxxxxxxxxxxtax1amtt = z4xxzxz1avxxxxxxxxxxtax1amtt;
		this.z5xxzxz2avxxxxxxxxxxtax2amtt = z5xxzxz2avxxxxxxxxxxtax2amtt;
		this.z6xxzxz3avxxxxxxxxxxtax3amtt = z6xxzxz3avxxxxxxxxxxtax3amtt;
		this.b4xxzixrbvxxxxxxxxxxdiscount = b4xxzixrbvxxxxxxxxxxdiscount;
		this.b5xxuxxrbv10xxxxxxxxpaytype = b5xxuxxrbv10xxxxxxxxpaytype;
		this.z5xxuxxrbvxxxxxxxxxxpaybyid = z5xxuxxrbvxxxxxxxxxxpaybyid;
		this.z6xxcxxrlxxxxxxxxxxxpaybydate = z6xxcxxrlxxxxxxxxxxxpaybydate;
		this.c1xxuxxrbvxxxxxxxxxxcurrency = c1xxuxxrbvxxxxxxxxxxcurrency;
		this.c2xxzxxrbvxxxxxxxxxxconvrate = c2xxzxxrbvxxxxxxxxxxconvrate;
		this.z9xxzxxrbvxxxxxxxxxxlocamount = z9xxzxxrbvxxxxxxxxxxlocamount;
		this.zaxxzzfxhhxxxxxxxxxxstatusfl = zaxxzzfxhhxxxxxxxxxxstatusfl;
		this.zbxxcztxlxxxxxxxxxxxstatusfldt = zbxxcztxlxxxxxxxxxxxstatusfldt;
		this.y2xxuxznbvxxxxxxxxxxnotes = y2xxuxznbvxxxxxxxxxxnotes;
		this.zcxxutoxlhxxxxxxxxxxowner = zcxxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.xoxxuq3b4xwwqqhxxxxxvendpdetailses = xoxxuq3b4xwwqqhxxxxxvendpdetailses;
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
	@JoinColumn(name = "vinvoice")
	public Trexuq3a6xwwqqhxxxxxvinvoice getTrexuq3a6xwwqqhxxxxxvinvoice() {
		return this.trexuq3a6xwwqqhxxxxxvinvoice;
	}

	public void setTrexuq3a6xwwqqhxxxxxvinvoice(
			Trexuq3a6xwwqqhxxxxxvinvoice trexuq3a6xwwqqhxxxxxvinvoice) {
		this.trexuq3a6xwwqqhxxxxxvinvoice = trexuq3a6xwwqqhxxxxxvinvoice;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendor")
	public Jxxxuq300xwwqqhxxxxxvendor getJxxxuq300xwwqqhxxxxxvendor() {
		return this.jxxxuq300xwwqqhxxxxxvendor;
	}

	public void setJxxxuq300xwwqqhxxxxxvendor(
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor) {
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account")
	public Yxxxch601xwwqqhxxxxxaccount getYxxxch601xwwqqhxxxxxaccount() {
		return this.yxxxch601xwwqqhxxxxxaccount;
	}

	public void setYxxxch601xwwqqhxxxxxaccount(
			Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount) {
		this.yxxxch601xwwqqhxxxxxaccount = yxxxch601xwwqqhxxxxxaccount;
	}

	@Column(name = "payment", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxunvpbvxxxxxxxxxxpayment() {
		return this.a0xxunvpbvxxxxxxxxxxpayment;
	}

	public void setA0xxunvpbvxxxxxxxxxxpayment(
			String a0xxunvpbvxxxxxxxxxxpayment) {
		this.a0xxunvpbvxxxxxxxxxxpayment = a0xxunvpbvxxxxxxxxxxpayment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cheqdate", length = 29)
	public Date getB3xxxxxrlxxxxxxxxxxxcheqdate() {
		return this.b3xxxxxrlxxxxxxxxxxxcheqdate;
	}

	public void setB3xxxxxrlxxxxxxxxxxxcheqdate(
			Date b3xxxxxrlxxxxxxxxxxxcheqdate) {
		this.b3xxxxxrlxxxxxxxxxxxcheqdate = b3xxxxxrlxxxxxxxxxxxcheqdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "paymentduedate", length = 29)
	public Date getC1xxxxxrlxxxxxxxxxxxpaymentduedate() {
		return this.c1xxxxxrlxxxxxxxxxxxpaymentduedate;
	}

	public void setC1xxxxxrlxxxxxxxxxxxpaymentduedate(
			Date c1xxxxxrlxxxxxxxxxxxpaymentduedate) {
		this.c1xxxxxrlxxxxxxxxxxxpaymentduedate = c1xxxxxrlxxxxxxxxxxxpaymentduedate;
	}

	@Column(name = "postingperiod")
	public Integer getC2xxpxeravxxxxxxxxxxpostingperiod() {
		return this.c2xxpxeravxxxxxxxxxxpostingperiod;
	}

	public void setC2xxpxeravxxxxxxxxxxpostingperiod(
			Integer c2xxpxeravxxxxxxxxxxpostingperiod) {
		this.c2xxpxeravxxxxxxxxxxpostingperiod = c2xxpxeravxxxxxxxxxxpostingperiod;
	}

	@Column(name = "matcode")
	public Integer getD1xxudiravxxxxxxxxxxmatcode() {
		return this.d1xxudiravxxxxxxxxxxmatcode;
	}

	public void setD1xxudiravxxxxxxxxxxmatcode(
			Integer d1xxudiravxxxxxxxxxxmatcode) {
		this.d1xxudiravxxxxxxxxxxmatcode = d1xxudiravxxxxxxxxxxmatcode;
	}

	@Column(name = "integrset", length = 20)
	@Size(max = 20)
	public String getF1xxuwmxbv40xxxxxxxxintegrset() {
		return this.f1xxuwmxbv40xxxxxxxxintegrset;
	}

	public void setF1xxuwmxbv40xxxxxxxxintegrset(
			String f1xxuwmxbv40xxxxxxxxintegrset) {
		this.f1xxuwmxbv40xxxxxxxxintegrset = f1xxuwmxbv40xxxxxxxxintegrset;
	}

	@Column(name = "amounttotal", precision = 14)
	public BigDecimal getB3xxztprlxxxxxxxxxxxamounttotal() {
		return this.b3xxztprlxxxxxxxxxxxamounttotal;
	}

	public void setB3xxztprlxxxxxxxxxxxamounttotal(
			BigDecimal b3xxztprlxxxxxxxxxxxamounttotal) {
		this.b3xxztprlxxxxxxxxxxxamounttotal = b3xxztprlxxxxxxxxxxxamounttotal;
	}

	@Column(name = "amountostndt", precision = 14)
	public BigDecimal getZ1xxzyprlxxxxxxxxxxxamountostndt() {
		return this.z1xxzyprlxxxxxxxxxxxamountostndt;
	}

	public void setZ1xxzyprlxxxxxxxxxxxamountostndt(
			BigDecimal z1xxzyprlxxxxxxxxxxxamountostndt) {
		this.z1xxzyprlxxxxxxxxxxxamountostndt = z1xxzyprlxxxxxxxxxxxamountostndt;
	}

	@Column(name = "amountin", precision = 14)
	public BigDecimal getD1xxzyprlxxxxxxxxxxxamountin() {
		return this.d1xxzyprlxxxxxxxxxxxamountin;
	}

	public void setD1xxzyprlxxxxxxxxxxxamountin(
			BigDecimal d1xxzyprlxxxxxxxxxxxamountin) {
		this.d1xxzyprlxxxxxxxxxxxamountin = d1xxzyprlxxxxxxxxxxxamountin;
	}

	@Column(name = "qtytotal", precision = 14)
	public BigDecimal getZ2xxztqrlxxxxxxxxxxxqtytotal() {
		return this.z2xxztqrlxxxxxxxxxxxqtytotal;
	}

	public void setZ2xxztqrlxxxxxxxxxxxqtytotal(
			BigDecimal z2xxztqrlxxxxxxxxxxxqtytotal) {
		this.z2xxztqrlxxxxxxxxxxxqtytotal = z2xxztqrlxxxxxxxxxxxqtytotal;
	}

	@Column(name = "qtyostndt", precision = 14)
	public BigDecimal getZ3xxzyqrlxxxxxxxxxxxqtyostndt() {
		return this.z3xxzyqrlxxxxxxxxxxxqtyostndt;
	}

	public void setZ3xxzyqrlxxxxxxxxxxxqtyostndt(
			BigDecimal z3xxzyqrlxxxxxxxxxxxqtyostndt) {
		this.z3xxzyqrlxxxxxxxxxxxqtyostndt = z3xxzyqrlxxxxxxxxxxxqtyostndt;
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
	public BigDecimal getZ7xxzltxavxxxxxxxxxxdelivchrgt() {
		return this.z7xxzltxavxxxxxxxxxxdelivchrgt;
	}

	public void setZ7xxzltxavxxxxxxxxxxdelivchrgt(
			BigDecimal z7xxzltxavxxxxxxxxxxdelivchrgt) {
		this.z7xxzltxavxxxxxxxxxxdelivchrgt = z7xxzltxavxxxxxxxxxxdelivchrgt;
	}

	@Column(name = "miscchrgt", precision = 14)
	public BigDecimal getZ8xxzmtxavxxxxxxxxxxmiscchrgt() {
		return this.z8xxzmtxavxxxxxxxxxxmiscchrgt;
	}

	public void setZ8xxzmtxavxxxxxxxxxxmiscchrgt(
			BigDecimal z8xxzmtxavxxxxxxxxxxmiscchrgt) {
		this.z8xxzmtxavxxxxxxxxxxmiscchrgt = z8xxzmtxavxxxxxxxxxxmiscchrgt;
	}

	@Column(name = "tax1amtt", precision = 14)
	public BigDecimal getZ4xxzxz1avxxxxxxxxxxtax1amtt() {
		return this.z4xxzxz1avxxxxxxxxxxtax1amtt;
	}

	public void setZ4xxzxz1avxxxxxxxxxxtax1amtt(
			BigDecimal z4xxzxz1avxxxxxxxxxxtax1amtt) {
		this.z4xxzxz1avxxxxxxxxxxtax1amtt = z4xxzxz1avxxxxxxxxxxtax1amtt;
	}

	@Column(name = "tax2amtt", precision = 14)
	public BigDecimal getZ5xxzxz2avxxxxxxxxxxtax2amtt() {
		return this.z5xxzxz2avxxxxxxxxxxtax2amtt;
	}

	public void setZ5xxzxz2avxxxxxxxxxxtax2amtt(
			BigDecimal z5xxzxz2avxxxxxxxxxxtax2amtt) {
		this.z5xxzxz2avxxxxxxxxxxtax2amtt = z5xxzxz2avxxxxxxxxxxtax2amtt;
	}

	@Column(name = "tax3amtt", precision = 14)
	public BigDecimal getZ6xxzxz3avxxxxxxxxxxtax3amtt() {
		return this.z6xxzxz3avxxxxxxxxxxtax3amtt;
	}

	public void setZ6xxzxz3avxxxxxxxxxxtax3amtt(
			BigDecimal z6xxzxz3avxxxxxxxxxxtax3amtt) {
		this.z6xxzxz3avxxxxxxxxxxtax3amtt = z6xxzxz3avxxxxxxxxxxtax3amtt;
	}

	@Column(name = "discount", precision = 14)
	public BigDecimal getB4xxzixrbvxxxxxxxxxxdiscount() {
		return this.b4xxzixrbvxxxxxxxxxxdiscount;
	}

	public void setB4xxzixrbvxxxxxxxxxxdiscount(
			BigDecimal b4xxzixrbvxxxxxxxxxxdiscount) {
		this.b4xxzixrbvxxxxxxxxxxdiscount = b4xxzixrbvxxxxxxxxxxdiscount;
	}

	@Column(name = "paytype", length = 4)
	@Size(max = 4)
	public String getB5xxuxxrbv10xxxxxxxxpaytype() {
		return this.b5xxuxxrbv10xxxxxxxxpaytype;
	}

	public void setB5xxuxxrbv10xxxxxxxxpaytype(
			String b5xxuxxrbv10xxxxxxxxpaytype) {
		this.b5xxuxxrbv10xxxxxxxxpaytype = b5xxuxxrbv10xxxxxxxxpaytype;
	}

	@Column(name = "paybyid", length = 20)
	@Size(max = 20)
	public String getZ5xxuxxrbvxxxxxxxxxxpaybyid() {
		return this.z5xxuxxrbvxxxxxxxxxxpaybyid;
	}

	public void setZ5xxuxxrbvxxxxxxxxxxpaybyid(
			String z5xxuxxrbvxxxxxxxxxxpaybyid) {
		this.z5xxuxxrbvxxxxxxxxxxpaybyid = z5xxuxxrbvxxxxxxxxxxpaybyid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "paybydate", length = 29)
	public Date getZ6xxcxxrlxxxxxxxxxxxpaybydate() {
		return this.z6xxcxxrlxxxxxxxxxxxpaybydate;
	}

	public void setZ6xxcxxrlxxxxxxxxxxxpaybydate(
			Date z6xxcxxrlxxxxxxxxxxxpaybydate) {
		this.z6xxcxxrlxxxxxxxxxxxpaybydate = z6xxcxxrlxxxxxxxxxxxpaybydate;
	}

	@Column(name = "currency", length = 12)
	@Size(max = 12)
	public String getC1xxuxxrbvxxxxxxxxxxcurrency() {
		return this.c1xxuxxrbvxxxxxxxxxxcurrency;
	}

	public void setC1xxuxxrbvxxxxxxxxxxcurrency(
			String c1xxuxxrbvxxxxxxxxxxcurrency) {
		this.c1xxuxxrbvxxxxxxxxxxcurrency = c1xxuxxrbvxxxxxxxxxxcurrency;
	}

	@Column(name = "convrate", precision = 14)
	public BigDecimal getC2xxzxxrbvxxxxxxxxxxconvrate() {
		return this.c2xxzxxrbvxxxxxxxxxxconvrate;
	}

	public void setC2xxzxxrbvxxxxxxxxxxconvrate(
			BigDecimal c2xxzxxrbvxxxxxxxxxxconvrate) {
		this.c2xxzxxrbvxxxxxxxxxxconvrate = c2xxzxxrbvxxxxxxxxxxconvrate;
	}

	@Column(name = "locamount", precision = 14)
	public BigDecimal getZ9xxzxxrbvxxxxxxxxxxlocamount() {
		return this.z9xxzxxrbvxxxxxxxxxxlocamount;
	}

	public void setZ9xxzxxrbvxxxxxxxxxxlocamount(
			BigDecimal z9xxzxxrbvxxxxxxxxxxlocamount) {
		this.z9xxzxxrbvxxxxxxxxxxlocamount = z9xxzxxrbvxxxxxxxxxxlocamount;
	}

	@Column(name = "statusfl")
	public Integer getZaxxzzfxhhxxxxxxxxxxstatusfl() {
		return this.zaxxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZaxxzzfxhhxxxxxxxxxxstatusfl(
			Integer zaxxzzfxhhxxxxxxxxxxstatusfl) {
		this.zaxxzzfxhhxxxxxxxxxxstatusfl = zaxxzzfxhhxxxxxxxxxxstatusfl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "statusfldt", length = 29)
	public Date getZbxxcztxlxxxxxxxxxxxstatusfldt() {
		return this.zbxxcztxlxxxxxxxxxxxstatusfldt;
	}

	public void setZbxxcztxlxxxxxxxxxxxstatusfldt(
			Date zbxxcztxlxxxxxxxxxxxstatusfldt) {
		this.zbxxcztxlxxxxxxxxxxxstatusfldt = zbxxcztxlxxxxxxxxxxxstatusfldt;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getY2xxuxznbvxxxxxxxxxxnotes() {
		return this.y2xxuxznbvxxxxxxxxxxnotes;
	}

	public void setY2xxuxznbvxxxxxxxxxxnotes(String y2xxuxznbvxxxxxxxxxxnotes) {
		this.y2xxuxznbvxxxxxxxxxxnotes = y2xxuxznbvxxxxxxxxxxnotes;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZcxxutoxlhxxxxxxxxxxowner() {
		return this.zcxxutoxlhxxxxxxxxxxowner;
	}

	public void setZcxxutoxlhxxxxxxxxxxowner(String zcxxutoxlhxxxxxxxxxxowner) {
		this.zcxxutoxlhxxxxxxxxxxowner = zcxxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trexuq388xwwqqhxxxxxvpayment")
	public Set<Xoxxuq3b4xwwqqhxxxxxvendpdetails> getXoxxuq3b4xwwqqhxxxxxvendpdetailses() {
		return this.xoxxuq3b4xwwqqhxxxxxvendpdetailses;
	}

	public void setXoxxuq3b4xwwqqhxxxxxvendpdetailses(
			Set<Xoxxuq3b4xwwqqhxxxxxvendpdetails> xoxxuq3b4xwwqqhxxxxxvendpdetailses) {
		this.xoxxuq3b4xwwqqhxxxxxvendpdetailses = xoxxuq3b4xwwqqhxxxxxvendpdetailses;
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
