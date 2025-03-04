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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Xoxxuq943xwwqqhxxxxxactivityjobdetails generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "activityjobdetails")
public class Xoxxuq943xwwqqhxxxxxactivityjobdetails
		implements
			java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Txxxuq932xwwqqhspxxxactivityjob txxxuq932xwwqqhspxxxactivityjob;
	private Fxxxuq188xwwqqhxxxxxactivity fxxxuq188xwwqqhxxxxxactivity;
	private Integer b1xxzo11bvlxxxxxxxxxline;
	private Date z3xxcxxrlxxxxxxxxxxxproddatet;
	private BigDecimal z4xxzqxrbvxxxxxxxxxxqtyalloc;
	private Integer z5xxuxcobvxxxxxxxxxxpono;
	private BigDecimal z5xxzpxravxxxxxxxxxxordprice;
	private BigDecimal z6xxzxxrlvxxxxxxxxxxqtyostnd;
	private BigDecimal z7xxzxxrlvxxxxxxxxxxqtyalstk;
	private BigDecimal z8xxzxxrlvxxxxxxxxxxqtyissud;
	private Integer zaxxzzfxhhxxxxxxxxxxstatusfl;
	private Date zbxxcztxlxxxxxxxxxxxstatusfldt;
	private Integer zcxxzzprhvxxxxxxxxxxprintmstat;
	private Date zdxxczqxlhxxxxxxxxxxprinmtfldt;
	private Integer zexxzzprhvxxxxxxxxxxprintmstatj;
	private Date zfxxczqxlhxxxxxxxxxxprinmtfldtj;
	private String zgxxuxxrbv17xxxxxxxxtype;
	private Integer zhxxuxxrbvxxactivitycodeout;
	private BigDecimal zixxzxxrlvxxxxxxxxxxqtyout;
	private BigDecimal zgxxzlpxxvxxxxxxxxxxlinetotl;
	private String zzxxu2oxxhxxxxxxxxxxowner2;

	public Xoxxuq943xwwqqhxxxxxactivityjobdetails() {
	}

	public Xoxxuq943xwwqqhxxxxxactivityjobdetails(
			Txxxuq932xwwqqhspxxxactivityjob txxxuq932xwwqqhspxxxactivityjob) {
		this.txxxuq932xwwqqhspxxxactivityjob = txxxuq932xwwqqhspxxxactivityjob;
	}
	public Xoxxuq943xwwqqhxxxxxactivityjobdetails(
			Txxxuq932xwwqqhspxxxactivityjob txxxuq932xwwqqhspxxxactivityjob,
			Fxxxuq188xwwqqhxxxxxactivity fxxxuq188xwwqqhxxxxxactivity,
			Integer b1xxzo11bvlxxxxxxxxxline,
			Date z3xxcxxrlxxxxxxxxxxxproddatet,
			BigDecimal z4xxzqxrbvxxxxxxxxxxqtyalloc,
			Integer z5xxuxcobvxxxxxxxxxxpono,
			BigDecimal z5xxzpxravxxxxxxxxxxordprice,
			BigDecimal z6xxzxxrlvxxxxxxxxxxqtyostnd,
			BigDecimal z7xxzxxrlvxxxxxxxxxxqtyalstk,
			BigDecimal z8xxzxxrlvxxxxxxxxxxqtyissud,
			Integer zaxxzzfxhhxxxxxxxxxxstatusfl,
			Date zbxxcztxlxxxxxxxxxxxstatusfldt,
			Integer zcxxzzprhvxxxxxxxxxxprintmstat,
			Date zdxxczqxlhxxxxxxxxxxprinmtfldt,
			Integer zexxzzprhvxxxxxxxxxxprintmstatj,
			Date zfxxczqxlhxxxxxxxxxxprinmtfldtj,
			String zgxxuxxrbv17xxxxxxxxtype,
			Integer zhxxuxxrbvxxactivitycodeout,
			BigDecimal zixxzxxrlvxxxxxxxxxxqtyout,
			BigDecimal zgxxzlpxxvxxxxxxxxxxlinetotl,
			String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.txxxuq932xwwqqhspxxxactivityjob = txxxuq932xwwqqhspxxxactivityjob;
		this.fxxxuq188xwwqqhxxxxxactivity = fxxxuq188xwwqqhxxxxxactivity;
		this.b1xxzo11bvlxxxxxxxxxline = b1xxzo11bvlxxxxxxxxxline;
		this.z3xxcxxrlxxxxxxxxxxxproddatet = z3xxcxxrlxxxxxxxxxxxproddatet;
		this.z4xxzqxrbvxxxxxxxxxxqtyalloc = z4xxzqxrbvxxxxxxxxxxqtyalloc;
		this.z5xxuxcobvxxxxxxxxxxpono = z5xxuxcobvxxxxxxxxxxpono;
		this.z5xxzpxravxxxxxxxxxxordprice = z5xxzpxravxxxxxxxxxxordprice;
		this.z6xxzxxrlvxxxxxxxxxxqtyostnd = z6xxzxxrlvxxxxxxxxxxqtyostnd;
		this.z7xxzxxrlvxxxxxxxxxxqtyalstk = z7xxzxxrlvxxxxxxxxxxqtyalstk;
		this.z8xxzxxrlvxxxxxxxxxxqtyissud = z8xxzxxrlvxxxxxxxxxxqtyissud;
		this.zaxxzzfxhhxxxxxxxxxxstatusfl = zaxxzzfxhhxxxxxxxxxxstatusfl;
		this.zbxxcztxlxxxxxxxxxxxstatusfldt = zbxxcztxlxxxxxxxxxxxstatusfldt;
		this.zcxxzzprhvxxxxxxxxxxprintmstat = zcxxzzprhvxxxxxxxxxxprintmstat;
		this.zdxxczqxlhxxxxxxxxxxprinmtfldt = zdxxczqxlhxxxxxxxxxxprinmtfldt;
		this.zexxzzprhvxxxxxxxxxxprintmstatj = zexxzzprhvxxxxxxxxxxprintmstatj;
		this.zfxxczqxlhxxxxxxxxxxprinmtfldtj = zfxxczqxlhxxxxxxxxxxprinmtfldtj;
		this.zgxxuxxrbv17xxxxxxxxtype = zgxxuxxrbv17xxxxxxxxtype;
		this.zhxxuxxrbvxxactivitycodeout = zhxxuxxrbvxxactivitycodeout;
		this.zixxzxxrlvxxxxxxxxxxqtyout = zixxzxxrlvxxxxxxxxxxqtyout;
		this.zgxxzlpxxvxxxxxxxxxxlinetotl = zgxxzlpxxvxxxxxxxxxxlinetotl;
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
	@JoinColumn(name = "jobno", nullable = false)
	@NotNull
	public Txxxuq932xwwqqhspxxxactivityjob getTxxxuq932xwwqqhspxxxactivityjob() {
		return this.txxxuq932xwwqqhspxxxactivityjob;
	}

	public void setTxxxuq932xwwqqhspxxxactivityjob(
			Txxxuq932xwwqqhspxxxactivityjob txxxuq932xwwqqhspxxxactivityjob) {
		this.txxxuq932xwwqqhspxxxactivityjob = txxxuq932xwwqqhspxxxactivityjob;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activitycode")
	public Fxxxuq188xwwqqhxxxxxactivity getFxxxuq188xwwqqhxxxxxactivity() {
		return this.fxxxuq188xwwqqhxxxxxactivity;
	}

	public void setFxxxuq188xwwqqhxxxxxactivity(
			Fxxxuq188xwwqqhxxxxxactivity fxxxuq188xwwqqhxxxxxactivity) {
		this.fxxxuq188xwwqqhxxxxxactivity = fxxxuq188xwwqqhxxxxxactivity;
	}

	@Column(name = "line")
	public Integer getB1xxzo11bvlxxxxxxxxxline() {
		return this.b1xxzo11bvlxxxxxxxxxline;
	}

	public void setB1xxzo11bvlxxxxxxxxxline(Integer b1xxzo11bvlxxxxxxxxxline) {
		this.b1xxzo11bvlxxxxxxxxxline = b1xxzo11bvlxxxxxxxxxline;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "proddatet", length = 29)
	public Date getZ3xxcxxrlxxxxxxxxxxxproddatet() {
		return this.z3xxcxxrlxxxxxxxxxxxproddatet;
	}

	public void setZ3xxcxxrlxxxxxxxxxxxproddatet(
			Date z3xxcxxrlxxxxxxxxxxxproddatet) {
		this.z3xxcxxrlxxxxxxxxxxxproddatet = z3xxcxxrlxxxxxxxxxxxproddatet;
	}

	@Column(name = "qtyalloc", precision = 14)
	public BigDecimal getZ4xxzqxrbvxxxxxxxxxxqtyalloc() {
		return this.z4xxzqxrbvxxxxxxxxxxqtyalloc;
	}

	public void setZ4xxzqxrbvxxxxxxxxxxqtyalloc(
			BigDecimal z4xxzqxrbvxxxxxxxxxxqtyalloc) {
		this.z4xxzqxrbvxxxxxxxxxxqtyalloc = z4xxzqxrbvxxxxxxxxxxqtyalloc;
	}

	@Column(name = "pono")
	public Integer getZ5xxuxcobvxxxxxxxxxxpono() {
		return this.z5xxuxcobvxxxxxxxxxxpono;
	}

	public void setZ5xxuxcobvxxxxxxxxxxpono(Integer z5xxuxcobvxxxxxxxxxxpono) {
		this.z5xxuxcobvxxxxxxxxxxpono = z5xxuxcobvxxxxxxxxxxpono;
	}

	@Column(name = "ordprice", precision = 14)
	public BigDecimal getZ5xxzpxravxxxxxxxxxxordprice() {
		return this.z5xxzpxravxxxxxxxxxxordprice;
	}

	public void setZ5xxzpxravxxxxxxxxxxordprice(
			BigDecimal z5xxzpxravxxxxxxxxxxordprice) {
		this.z5xxzpxravxxxxxxxxxxordprice = z5xxzpxravxxxxxxxxxxordprice;
	}

	@Column(name = "qtyostnd", precision = 14)
	public BigDecimal getZ6xxzxxrlvxxxxxxxxxxqtyostnd() {
		return this.z6xxzxxrlvxxxxxxxxxxqtyostnd;
	}

	public void setZ6xxzxxrlvxxxxxxxxxxqtyostnd(
			BigDecimal z6xxzxxrlvxxxxxxxxxxqtyostnd) {
		this.z6xxzxxrlvxxxxxxxxxxqtyostnd = z6xxzxxrlvxxxxxxxxxxqtyostnd;
	}

	@Column(name = "qtyalstk", precision = 14)
	public BigDecimal getZ7xxzxxrlvxxxxxxxxxxqtyalstk() {
		return this.z7xxzxxrlvxxxxxxxxxxqtyalstk;
	}

	public void setZ7xxzxxrlvxxxxxxxxxxqtyalstk(
			BigDecimal z7xxzxxrlvxxxxxxxxxxqtyalstk) {
		this.z7xxzxxrlvxxxxxxxxxxqtyalstk = z7xxzxxrlvxxxxxxxxxxqtyalstk;
	}

	@Column(name = "qtyissud", precision = 14)
	public BigDecimal getZ8xxzxxrlvxxxxxxxxxxqtyissud() {
		return this.z8xxzxxrlvxxxxxxxxxxqtyissud;
	}

	public void setZ8xxzxxrlvxxxxxxxxxxqtyissud(
			BigDecimal z8xxzxxrlvxxxxxxxxxxqtyissud) {
		this.z8xxzxxrlvxxxxxxxxxxqtyissud = z8xxzxxrlvxxxxxxxxxxqtyissud;
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

	@Column(name = "printmstat")
	public Integer getZcxxzzprhvxxxxxxxxxxprintmstat() {
		return this.zcxxzzprhvxxxxxxxxxxprintmstat;
	}

	public void setZcxxzzprhvxxxxxxxxxxprintmstat(
			Integer zcxxzzprhvxxxxxxxxxxprintmstat) {
		this.zcxxzzprhvxxxxxxxxxxprintmstat = zcxxzzprhvxxxxxxxxxxprintmstat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "prinmtfldt", length = 29)
	public Date getZdxxczqxlhxxxxxxxxxxprinmtfldt() {
		return this.zdxxczqxlhxxxxxxxxxxprinmtfldt;
	}

	public void setZdxxczqxlhxxxxxxxxxxprinmtfldt(
			Date zdxxczqxlhxxxxxxxxxxprinmtfldt) {
		this.zdxxczqxlhxxxxxxxxxxprinmtfldt = zdxxczqxlhxxxxxxxxxxprinmtfldt;
	}

	@Column(name = "printmstatj")
	public Integer getZexxzzprhvxxxxxxxxxxprintmstatj() {
		return this.zexxzzprhvxxxxxxxxxxprintmstatj;
	}

	public void setZexxzzprhvxxxxxxxxxxprintmstatj(
			Integer zexxzzprhvxxxxxxxxxxprintmstatj) {
		this.zexxzzprhvxxxxxxxxxxprintmstatj = zexxzzprhvxxxxxxxxxxprintmstatj;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "prinmtfldtj", length = 29)
	public Date getZfxxczqxlhxxxxxxxxxxprinmtfldtj() {
		return this.zfxxczqxlhxxxxxxxxxxprinmtfldtj;
	}

	public void setZfxxczqxlhxxxxxxxxxxprinmtfldtj(
			Date zfxxczqxlhxxxxxxxxxxprinmtfldtj) {
		this.zfxxczqxlhxxxxxxxxxxprinmtfldtj = zfxxczqxlhxxxxxxxxxxprinmtfldtj;
	}

	@Column(name = "type", length = 12)
	@Size(max = 12)
	public String getZgxxuxxrbv17xxxxxxxxtype() {
		return this.zgxxuxxrbv17xxxxxxxxtype;
	}

	public void setZgxxuxxrbv17xxxxxxxxtype(String zgxxuxxrbv17xxxxxxxxtype) {
		this.zgxxuxxrbv17xxxxxxxxtype = zgxxuxxrbv17xxxxxxxxtype;
	}

	@Column(name = "activitycodeout")
	public Integer getZhxxuxxrbvxxactivitycodeout() {
		return this.zhxxuxxrbvxxactivitycodeout;
	}

	public void setZhxxuxxrbvxxactivitycodeout(
			Integer zhxxuxxrbvxxactivitycodeout) {
		this.zhxxuxxrbvxxactivitycodeout = zhxxuxxrbvxxactivitycodeout;
	}

	@Column(name = "qtyout", precision = 14)
	public BigDecimal getZixxzxxrlvxxxxxxxxxxqtyout() {
		return this.zixxzxxrlvxxxxxxxxxxqtyout;
	}

	public void setZixxzxxrlvxxxxxxxxxxqtyout(
			BigDecimal zixxzxxrlvxxxxxxxxxxqtyout) {
		this.zixxzxxrlvxxxxxxxxxxqtyout = zixxzxxrlvxxxxxxxxxxqtyout;
	}

	@Column(name = "linetotl", precision = 14)
	public BigDecimal getZgxxzlpxxvxxxxxxxxxxlinetotl() {
		return this.zgxxzlpxxvxxxxxxxxxxlinetotl;
	}

	public void setZgxxzlpxxvxxxxxxxxxxlinetotl(
			BigDecimal zgxxzlpxxvxxxxxxxxxxlinetotl) {
		this.zgxxzlpxxvxxxxxxxxxxlinetotl = zgxxzlpxxvxxxxxxxxxxlinetotl;
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
