



package com.rcomputer.genapp.action;

import com.rcomputer.genapp.model.*;
import org.picketlink.Identity;
import org.picketlink.idm.IdentityManagementException;
import org.picketlink.authentication.AuthenticationException;
import org.picketlink.common.exceptions.PicketLinkException;

import org.apache.deltaspike.data.api.QueryResult;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query; 
import org.apache.deltaspike.data.api.QueryParam; 
import org.apache.deltaspike.data.api.Repository; 
import org.apache.deltaspike.data.api.SingleResultType; 

import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.logging.Logger;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.ByteArrayInputStream;


import java.util.Date;
import java.util.Calendar;
import java.sql.Connection;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Locale;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.*;


import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext; 
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.annotation.PostConstruct;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.HtmlExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRCsvExporterParameter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.SimpleFileResolver;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.j2ee.servlets.ImageServlet;
import net.sf.jasperreports.engine.SimpleJasperReportsContext;
import net.sf.jasperreports.repo.FileRepositoryService;
import net.sf.jasperreports.repo.FileRepositoryPersistenceServiceFactory;
import net.sf.jasperreports.repo.RepositoryService;
import net.sf.jasperreports.repo.PersistenceServiceFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import java.net.URL;

import javax.faces.application.FacesMessage;
import java.text.SimpleDateFormat; 

import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.Session;
import org.hibernate.type.*;
import javax.mail.MessagingException;
import com.rcomputer.genapp.action.SessionConfig;



import com.sendgrid.smtpapi.SMTPAPI;
//simple-mail

import javax.mail.BodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import com.outjected.email.api.ContentDisposition;
import com.outjected.email.api.EmailMessage;
import com.outjected.email.api.MessagePriority;
import com.outjected.email.api.SendFailedException;
import com.rcomputer.genapp.action.MailMessageImpl;
import com.rcomputer.genapp.action.SimpleMailConfig;
import com.outjected.email.impl.attachments.URLAttachment;
import com.outjected.email.impl.attachments.InputStreamAttachment;
import com.outjected.email.impl.templating.freemarker.FreeMarkerTemplate;
import com.outjected.email.impl.util.EmailAttachmentUtil;
import com.outjected.email.impl.util.MailTestUtil;
import com.outjected.email.impl.util.MessageConverter;
//import com.outjected.email.util.SMTPAuthenticator;
//import com.outjected.email.util.TestMailConfigs;
import com.google.common.io.Resources;
import com.outjected.email.api.EmailAttachment;
import com.outjected.email.api.MailMessage;
import com.outjected.email.api.ContentType;
 import org.jsoup.Jsoup;
 //put conditional import
 import org.jsoup.nodes.Document;
 import org.jsoup.nodes.Element;
 import org.jsoup.select.Elements;
 import org.jsoup.safety.Whitelist;
 import org.primefaces.model.DualListModel;








/**
* This is Action List class 
* @author 3r Computer Systems  
* @version 2.0
*/

@Named("fxxxuq1skxwwqqhxxxxxseatList")
@ViewScoped
public class Fxxxuq1skxwwqqhxxxxxseatList implements Serializable
{
   private Logger log = Logger.getLogger(Fxxxuq1skxwwqqhxxxxxseat.class.getCanonicalName());
	@Inject
	Identity identity;
   @Inject R3RestClient r3RestClient;

   @PersistenceContext(unitName = "genappcdi")
   private EntityManager entityManager;
        //except for employee itself
	private Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee;
    @Inject 
    Jxxxbh400xwwqqhxxxxxemployeeHome jxxxbh400xwwqqhxxxxxemployeeHome;
    @Inject 
    Yxxxuq1n1xwwqqqxxxxxblobdataHome yxxxuq1n1xwwqqqxxxxxblobdataHome;

    @Inject 
    Yxxxuh566xwwqqwxxxxxuserList yxxxuh566xwwqqwxxxxxuserList;





	 @Inject 
	 Yxxxch5a1xhhxxhxxxxxtruefalseHome yxxxch5a1xhhxxhxxxxxtruefalseHome;
	 private Yxxxch5a1xhhxxhxxxxxtruefalse yxxxch5a1xhhxxhxxxxxtruefalse;

    @Inject CustomIdentity customIdentity; 
    @PostConstruct
    public void initialize() {
      ownerCode=customIdentity.getOwner();
      ownerCddCode=ownerCode.substring(ownerCode.length()-3,ownerCode.length() );
      productCode=customIdentity.getProduct();
      subProductCode=customIdentity.getSubProduct();

     {
          urlIndex=urlName.lastIndexOf(".");
          if (urlIndex == -1){
            urlIndex=urlName.length();
          }       
          if (urlName.contains("www.")){
           owner2Code=urlName.substring(4,urlIndex);
          }else{
           owner2Code=urlName.substring(0,urlIndex);
          }
          //extract subdomain if used. if subdomain, masterSiteCode will have a value
         if(!customIdentity.getMasterSiteCode().isEmpty()){
          owner2Code=owner2Code.replace("."+customIdentity.getMasterSiteCode(),"");
         }
      if (userIP == null) {  
       userIP = req.getRemoteAddr();  
       if (userIP == null) {  
        userIP = "noIP";  
       }      
      }
     }
     masterSiteCode=customIdentity.getMasterSiteCode();
                int listSize=getwwqqhxxxxxseatKeyList().size();
                start=  listSize==0 ? "0" : String.valueOf(getwwqqhxxxxxseatKeyList().get(0)) ;
                end=    listSize==0 ? "0" : String.valueOf(getwwqqhxxxxxseatKeyList().get(listSize-1));

          // initialize mailrelay0ff
          mailingSource="<p style=\"font-family:arial;color:black;font-size:20px;\">";
           mailingSource=mailingSource+"Thank you for using our service. We have attached your receipt as a confirmation.</p>";
                        //context = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext(); 
                        //  context,req and hostUrl already set in construct
                        String serverName=context.getServerInfo();// check if tomcat or wildfly
                        if(serverName.contains("omcat")){
                         tomeeYN=true;
                        }

          if(yxxxuq1n1xwwqqqxxxxxblobdataHome.getBlobdata("blobdata","B3R-LOGO-C","PIC",0) !=null){
                        int hostPort=0;
                        if(req.getServerPort()==8080){
                         hostUrl=req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort(); 
                        }else{
                         hostUrl=req.getScheme()+"://"+req.getServerName(); 
                        }  
           String quotePE="\"";
           mailingSource=mailingSource+"<img  alt=\"logo\""+" src="+quotePE+hostUrl+"/ImageServletCdi/?seq=1&amp;id=B3R-LOGO-C&amp;height=50"+quotePE+"/>";//email needs full url  
          }
    }

   private Boolean showNamesYN = false;//needed for mailrelay and if all bcc for non relay
   private Boolean showAsBCCYN = false;
   private Map <String,String> fieldKeyList=null;
   private String owner2Code="";
   private String masterSiteCode="";
   private String selectedOwnerCode="";
   private String clientEMail="";
   private String eMailFirstName="";
   private String eMailLastName="";
   private String eMailAddress="";//used by Ical 
   private String e1mailAddress="";//used by emailsend
   private String userFullName="";
   private String timeStamp="";
   private String dataOwner2Code="";
     private String ownerCode="sss";
     private String subProductCode="";
      private String ownerCddCode="";
      private String productCode="";


      private int mprinted=512;
      private int mdel=256;
      private int mmark=128;
      private int munmark=1023;
      private int mconsign=64;
      private int mnoMail=64;
      private int minvoiced=64;
      //  can be used for other status, use it for 1st entry in group,account or to mark a row as editable etc 
      //               where line field is not there 
      private int mpartial=32;
      private int mshipped=32;
      private int mpaid=16;
      private int mclosed=8;
      private int mreturn=4;
      private int mcopy=2;
      // copy means record was copied from another 
      private int mtoPay=2;
      //open becomes active  , mutually exclusive
      private int mactive=1;
      private int mordered=1;
      private int mopen=0;
      private int category;
      private int subcategory;
      private int subcategory3;
      private int categoryUi;
      private int subcategoryUi;
      private String itemTagType="";
      // open means record created
      // use setXx(getXx()| mcopy)) to set copy flag leaving other bits as is 
      // use setXx(getXx()& _mcopy)) to clear copy flag leaving other bits as is 
      // the following shows which bit counting 0 as the right most bit 
      // used as if bitset(status,_matcive)
      // or as iif(bitset(status,_mmark),.t.,.f.)
      //_mactive=0  && 0th bit from right starting at 0 bit, value 1
      private int _mopen=0;
      //0th bit ,numeric value 0
      private int _mactive=0;
      // && 0th bit ,numeric value 1
      private int _mcopy=1;
      //   && 1th bit ,numeric value 2
      private int _mreturn=2;
      // && 2nd bit                4 
      private int _mclosed=3;
      // && 3rd                    8 
      private int _mpaid=4;
      //   && 4th                   16
      private int _mpartial=5;
      private int _mshipped=5;
      // && 5th                   32 
      private int _mconsign=6;
      private int _minvoiced=6;
      // && 6th                   64
      private int _mmark=7;
      //    && 7th                   128
      private int _mdel=8;
      //     && 8th                    
      private int _mprinted=9;
      // && 9th                   512 
      private Calendar calendar = Calendar.getInstance();
      private Calendar calendare = Calendar.getInstance();
      private DataSource ds;
      private String countryIsoEq="";
        boolean mailRelayOff=true; 
	private boolean bcontinue = true;
	private boolean showSharedData = false;
	private boolean showResultsCount = false;
	private boolean showResultsData = false;
        private Integer paramResultsCount = 0;
        private BigDecimal allow3Amount=new BigDecimal("0.0");


     Map parameters = new HashMap();
     int xvc=1;
     String reportNamePrefix="";
     String reportNameMinusPrefix="";
     List<Fxxxuq1skxwwqqhxxxxxseat> sresults=null;

     List<Jxxxbh400xwwqqhxxxxxemployee> ccresults=new ArrayList<Jxxxbh400xwwqqhxxxxxemployee>();
     //String lorderColumn = "a0xxuobxbxxxxxxxxxxxsid";
     //String lorderDirection = "desc";
     //String orderColumnPrev = "";
     //String orderDirectionPrev = "";
     //String lorder ="a0xxuobxbxxxxxxxxxxxsid desc";
     //remove above after test check new assigns below
     private String eMailingAddress1="";
     private String eMailingAddress2="";
     private String eMailingAddress3="";
     private String eMailingAddress4="";
     private Integer eMailingAttachSeq1=-1;
     private Integer eMailingAttachSeq2=-1;
     private Integer eMailingAttachSeq3=-1;
     private Integer eMailingAttachSeq4=-1;
     private Integer eMailingAttachSeq5=-1;
     private Integer eMailingTextAttachSeq1=-1;
     private Integer eMailingTextAttachSeq2=-1;
     private Integer eMailingTextAttachSeq3=-1;
     private Integer eMailingTextAttachSeq4=-1;
     private Integer eMailingTextAttachSeq5=-1;
     private Boolean[] checkMapI=new Boolean[6];
     private Boolean[] checkMapT=new Boolean[6];

     private Integer maxResultsVal;// changes as 6/50/100 rows
     private String subKey = "";  
     private Integer optionNumber=1;
     // id and 8 columns, save in userprofl and increase by 8 but check against max cols
     private Boolean skipColumns=false;
     private Boolean options01Show=true;// show as default
     private Boolean options02Show=false;
     private Boolean options03Show=false;
     private Boolean options04Show=false;
     private Boolean options05Show=false;
     private Boolean options06Show=false;
     private Boolean options07Show=false;
     private Boolean options08Show=false;
     private Boolean options09Show=false;
     private Boolean options10Show=false;
     private Boolean options11Show=false;
     private Boolean options12Show=false;
     private Boolean options13Show=false;
     private Boolean options14Show=false;
     private Boolean options15Show=false;
     private Boolean options16Show=false;
     private Boolean options17Show=false;
     private Boolean options18Show=false;
     private Boolean options19Show=false;
     private Boolean options20Show=false;
     private Boolean options21Show=false;
     private Boolean options22Show=false;
     private Boolean options23Show=false;
     private Boolean options24Show=false;
     private Boolean options25Show=false;
     private Boolean options26Show=false;
     private Boolean options27Show=false;
     private Boolean options28Show=false;
     private Boolean options29Show=false;
     private Boolean options30Show=false;
     private Boolean options31Show=false;
     private Boolean options32Show=false;
     private Boolean options33Show=false;
     private Boolean options34Show=false;
     private Boolean options35Show=false;
     private Boolean options36Show=false;
     private Boolean options37Show=false;
     private Boolean options38Show=false;
     private Boolean options39Show=false;
     private Boolean options40Show=false;
     private Boolean options41Show=false;
     private Boolean options42Show=false;
     private Boolean options43Show=false;
     private Boolean options44Show=false;
     private Boolean options45Show=false;
     private Boolean options46Show=false;
     private Boolean options47Show=false;
     private Boolean options48Show=false;
     private Boolean options49Show=false;
     private Boolean options50Show=false;
     private Boolean options51Show=false;
     private Boolean options52Show=false;
     private Boolean options53Show=false;
     private Boolean options54Show=false;
     private Boolean options55Show=false;
     private Boolean options56Show=false;
     private Boolean options57Show=false;
     private Boolean options58Show=false;
     private Boolean options59Show=false;
     private Boolean options60Show=false;
     private String headers ="";
     private String[] showColumnNames =new String[138];
     private Map <String,String> showClassNames=null;
     private String   selectedClass="com.rcomputer.genapp.model.Fxxxuq111xwwqqhxxxxxaddress";
     private String   selectedQualifier="de";
     private Boolean tomeeYN = false;// to allow myfaces vd mojarra jsf or jndi naming



      FacesContext facesContext = FacesContext.getCurrentInstance(); 
      ResourceBundle bundle = facesContext.getApplication().getResourceBundle(facesContext, "messages");
      ///SEVERITY_INFO, "any string in quotes"+e.getMessage+bundle.getString("id_password_not_matching")

      ExternalContext externalContext = facesContext.getExternalContext(); 
      // if following can be set here, remove set in postconstruct
      ServletContext context = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext(); 
      HttpServletRequest req = (HttpServletRequest) externalContext.getRequest(); 
      String hostUrl="";
                HttpSession session = req.getSession();

                String urlName=((javax.servlet.http.HttpServletRequest) externalContext.getRequest()).getServerName();
                int urlPort=((javax.servlet.http.HttpServletRequest) externalContext.getRequest()).getServerPort();

                Locale browserLocale=facesContext.getViewRoot().getLocale();
      private String userIP = req.getHeader("X-FORWARDED-FOR");

      HttpServletResponse resp = (HttpServletResponse) externalContext.getResponse(); 
	 private static final Pattern FROM_PATTERN = Pattern.compile(
			"(^|\\s)(from)\\s", 2);
	 private static final Pattern WHERE_PATTERN = Pattern.compile(
			"\\s(where)\\s", 2);
	 private static final Pattern ORDER_PATTERN = Pattern.compile(
			"\\s(order)(\\s)+by\\s", 2);

     private static final String EJBQL = "select fxxxuq1skxwwqqhxxxxxseat from Fxxxuq1skxwwqqhxxxxxseat fxxxuq1skxwwqqhxxxxxseat "  ;

     private static final String[] RESTRICTIONS = {
        "lower(fxxxuq1skxwwqqhxxxxxseat.a2xxukstbvxxxxxxxxxxrow) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.a2xxukstbvxxxxxxxxxxrow},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.a3xxuxxxbvxxxxxxxxxxrowlabel) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.a3xxuxxxbvxxxxxxxxxxrowlabel},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b1xxxxxxbvxxxxxxxxxxseat001status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b1xxxxxxbvxxxxxxxxxxseat001status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b2xxxxxxbvxxxxxxxxxxname001) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b2xxxxxxbvxxxxxxxxxxname001},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b3xxxxxxbvxxxxxxxxxxticket001) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b3xxxxxxbvxxxxxxxxxxticket001},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b4xxxxxxbvxxxxxxxxxxpo001) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b4xxxxxxbvxxxxxxxxxxpo001},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b5xxxxxxbvxxxxxxxxxxseat002status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b5xxxxxxbvxxxxxxxxxxseat002status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b6xxxxxxbvxxxxxxxxxxname002) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b6xxxxxxbvxxxxxxxxxxname002},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b7xxxxxxbvxxxxxxxxxxticket002) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b7xxxxxxbvxxxxxxxxxxticket002},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b8xxxxxxbvxxxxxxxxxxpo002) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b8xxxxxxbvxxxxxxxxxxpo002},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.b9xxxxxxbvxxxxxxxxxxseat003status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.b9xxxxxxbvxxxxxxxxxxseat003status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.baxxxxxxbvxxxxxxxxxxname003) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.baxxxxxxbvxxxxxxxxxxname003},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bbxxxxxxbvxxxxxxxxxxticket003) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bbxxxxxxbvxxxxxxxxxxticket003},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bcxxxxxxbvxxxxxxxxxxpo003) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bcxxxxxxbvxxxxxxxxxxpo003},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bdxxxxxxbvxxxxxxxxxxseat004status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bdxxxxxxbvxxxxxxxxxxseat004status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bexxxxxxbvxxxxxxxxxxname004) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bexxxxxxbvxxxxxxxxxxname004},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bfxxxxxxbvxxxxxxxxxxticket004) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bfxxxxxxbvxxxxxxxxxxticket004},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bgxxxxxxbvxxxxxxxxxxpo004) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bgxxxxxxbvxxxxxxxxxxpo004},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bhxxxxxxbvxxxxxxxxxxseat005status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bhxxxxxxbvxxxxxxxxxxseat005status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bixxxxxxbvxxxxxxxxxxname005) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bixxxxxxbvxxxxxxxxxxname005},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bjxxxxxxbvxxxxxxxxxxticket005) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bjxxxxxxbvxxxxxxxxxxticket005},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bkxxxxxxbvxxxxxxxxxxpo005) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bkxxxxxxbvxxxxxxxxxxpo005},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.blxxxxxxbvxxxxxxxxxxseat006status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.blxxxxxxbvxxxxxxxxxxseat006status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bmxxxxxxbvxxxxxxxxxxname006) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bmxxxxxxbvxxxxxxxxxxname006},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bnxxxxxxbvxxxxxxxxxxticket006) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bnxxxxxxbvxxxxxxxxxxticket006},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.boxxxxxxbvxxxxxxxxxxpo006) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.boxxxxxxbvxxxxxxxxxxpo006},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bpxxxxxxbvxxxxxxxxxxseat007status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bpxxxxxxbvxxxxxxxxxxseat007status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bqxxxxxxbvxxxxxxxxxxname007) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bqxxxxxxbvxxxxxxxxxxname007},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.brxxxxxxbvxxxxxxxxxxticket007) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.brxxxxxxbvxxxxxxxxxxticket007},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bsxxxxxxbvxxxxxxxxxxpo007) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bsxxxxxxbvxxxxxxxxxxpo007},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.btxxxxxxbvxxxxxxxxxxseat008status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.btxxxxxxbvxxxxxxxxxxseat008status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.buxxxxxxbvxxxxxxxxxxname008) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.buxxxxxxbvxxxxxxxxxxname008},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bvxxxxxxbvxxxxxxxxxxticket008) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bvxxxxxxbvxxxxxxxxxxticket008},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bwxxxxxxbvxxxxxxxxxxpo008) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bwxxxxxxbvxxxxxxxxxxpo008},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bxxxxxxxbvxxxxxxxxxxseat009status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bxxxxxxxbvxxxxxxxxxxseat009status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.byxxxxxxbvxxxxxxxxxxname009) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.byxxxxxxbvxxxxxxxxxxname009},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.bzxxxxxxbvxxxxxxxxxxticket009) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.bzxxxxxxbvxxxxxxxxxxticket009},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c1xxxxxxbvxxxxxxxxxxpo009) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c1xxxxxxbvxxxxxxxxxxpo009},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c2xxxxxxbvxxxxxxxxxxseat010status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c2xxxxxxbvxxxxxxxxxxseat010status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c3xxxxxxbvxxxxxxxxxxname010) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c3xxxxxxbvxxxxxxxxxxname010},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c4xxxxxxbvxxxxxxxxxxticket010) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c4xxxxxxbvxxxxxxxxxxticket010},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c5xxxxxxbvxxxxxxxxxxpo010) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c5xxxxxxbvxxxxxxxxxxpo010},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c6xxxxxxbvxxxxxxxxxxseat011status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c6xxxxxxbvxxxxxxxxxxseat011status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c7xxxxxxbvxxxxxxxxxxname011) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c7xxxxxxbvxxxxxxxxxxname011},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c8xxxxxxbvxxxxxxxxxxticket011) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c8xxxxxxbvxxxxxxxxxxticket011},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.c9xxxxxxbvxxxxxxxxxxpo011) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.c9xxxxxxbvxxxxxxxxxxpo011},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.caxxxxxxbvxxxxxxxxxxseat012status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.caxxxxxxbvxxxxxxxxxxseat012status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cbxxxxxxbvxxxxxxxxxxname012) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cbxxxxxxbvxxxxxxxxxxname012},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ccxxxxxxbvxxxxxxxxxxticket012) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ccxxxxxxbvxxxxxxxxxxticket012},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cdxxxxxxbvxxxxxxxxxxpo012) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cdxxxxxxbvxxxxxxxxxxpo012},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cexxxxxxbvxxxxxxxxxxseat013status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cexxxxxxbvxxxxxxxxxxseat013status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cfxxxxxxbvxxxxxxxxxxname013) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cfxxxxxxbvxxxxxxxxxxname013},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cgxxxxxxbvxxxxxxxxxxticket013) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cgxxxxxxbvxxxxxxxxxxticket013},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.chxxxxxxbvxxxxxxxxxxpo013) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.chxxxxxxbvxxxxxxxxxxpo013},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cixxxxxxbvxxxxxxxxxxseat014status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cixxxxxxbvxxxxxxxxxxseat014status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cjxxxxxxbvxxxxxxxxxxname014) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cjxxxxxxbvxxxxxxxxxxname014},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ckxxxxxxbvxxxxxxxxxxticket014) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ckxxxxxxbvxxxxxxxxxxticket014},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.clxxxxxxbvxxxxxxxxxxpo014) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.clxxxxxxbvxxxxxxxxxxpo014},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cmxxxxxxbvxxxxxxxxxxseat015status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cmxxxxxxbvxxxxxxxxxxseat015status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cnxxxxxxbvxxxxxxxxxxname015) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cnxxxxxxbvxxxxxxxxxxname015},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.coxxxxxxbvxxxxxxxxxxticket015) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.coxxxxxxbvxxxxxxxxxxticket015},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cpxxxxxxbvxxxxxxxxxxpo015) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cpxxxxxxbvxxxxxxxxxxpo015},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cqxxxxxxbvxxxxxxxxxxseat016status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cqxxxxxxbvxxxxxxxxxxseat016status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.crxxxxxxbvxxxxxxxxxxname016) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.crxxxxxxbvxxxxxxxxxxname016},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.csxxxxxxbvxxxxxxxxxxticket016) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.csxxxxxxbvxxxxxxxxxxticket016},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ctxxxxxxbvxxxxxxxxxxpo016) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ctxxxxxxbvxxxxxxxxxxpo016},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cuxxxxxxbvxxxxxxxxxxseat017status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cuxxxxxxbvxxxxxxxxxxseat017status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cvxxxxxxbvxxxxxxxxxxname017) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cvxxxxxxbvxxxxxxxxxxname017},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cxxxxxxxbvxxxxxxxxxxticket017) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cxxxxxxxbvxxxxxxxxxxticket017},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.cyxxxxxxbvxxxxxxxxxxpo017) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.cyxxxxxxbvxxxxxxxxxxpo017},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.daxxxxxxbvxxxxxxxxxxseat018status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.daxxxxxxbvxxxxxxxxxxseat018status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dbxxxxxxbvxxxxxxxxxxname018) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dbxxxxxxbvxxxxxxxxxxname018},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dcxxxxxxbvxxxxxxxxxxticket018) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dcxxxxxxbvxxxxxxxxxxticket018},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ddxxxxxxbvxxxxxxxxxxpo018) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ddxxxxxxbvxxxxxxxxxxpo018},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dexxxxxxbvxxxxxxxxxxseat019status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dexxxxxxbvxxxxxxxxxxseat019status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dfxxxxxxbvxxxxxxxxxxname019) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dfxxxxxxbvxxxxxxxxxxname019},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dgxxxxxxbvxxxxxxxxxxticket019) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dgxxxxxxbvxxxxxxxxxxticket019},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dhxxxxxxbvxxxxxxxxxxpo019) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dhxxxxxxbvxxxxxxxxxxpo019},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dixxxxxxbvxxxxxxxxxxseat020status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dixxxxxxbvxxxxxxxxxxseat020status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.djxxxxxxbvxxxxxxxxxxname020) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.djxxxxxxbvxxxxxxxxxxname020},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dkxxxxxxbvxxxxxxxxxxticket020) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dkxxxxxxbvxxxxxxxxxxticket020},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dlxxxxxxbvxxxxxxxxxxpo020) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dlxxxxxxbvxxxxxxxxxxpo020},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dmxxxxxxbvxxxxxxxxxxseat021status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dmxxxxxxbvxxxxxxxxxxseat021status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dnxxxxxxbvxxxxxxxxxxname021) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dnxxxxxxbvxxxxxxxxxxname021},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.doxxxxxxbvxxxxxxxxxxticket021) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.doxxxxxxbvxxxxxxxxxxticket021},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dpxxxxxxbvxxxxxxxxxxpo021) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dpxxxxxxbvxxxxxxxxxxpo021},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dqxxxxxxbvxxxxxxxxxxseat022status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dqxxxxxxbvxxxxxxxxxxseat022status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.drxxxxxxbvxxxxxxxxxxname022) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.drxxxxxxbvxxxxxxxxxxname022},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dsxxxxxxbvxxxxxxxxxxticket022) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dsxxxxxxbvxxxxxxxxxxticket022},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dtxxxxxxbvxxxxxxxxxxpo022) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dtxxxxxxbvxxxxxxxxxxpo022},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.duxxxxxxbvxxxxxxxxxxseat023status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.duxxxxxxbvxxxxxxxxxxseat023status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dvxxxxxxbvxxxxxxxxxxname023) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dvxxxxxxbvxxxxxxxxxxname023},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dwxxxxxxbvxxxxxxxxxxticket023) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dwxxxxxxbvxxxxxxxxxxticket023},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.dxxxxxxxbvxxxxxxxxxxpo023) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.dxxxxxxxbvxxxxxxxxxxpo023},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.e1xxxxxxbvxxxxxxxxxxseat024status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.e1xxxxxxbvxxxxxxxxxxseat024status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.e2xxxxxxbvxxxxxxxxxxname024) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.e2xxxxxxbvxxxxxxxxxxname024},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.e3xxxxxxbvxxxxxxxxxxticket024) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.e3xxxxxxbvxxxxxxxxxxticket024},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.e4xxxxxxbvxxxxxxxxxxpo024) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.e4xxxxxxbvxxxxxxxxxxpo024},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.eaxxxxxxbvxxxxxxxxxxseat025status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.eaxxxxxxbvxxxxxxxxxxseat025status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ebxxxxxxbvxxxxxxxxxxname025) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ebxxxxxxbvxxxxxxxxxxname025},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ecxxxxxxbvxxxxxxxxxxticket025) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ecxxxxxxbvxxxxxxxxxxticket025},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.edxxxxxxbvxxxxxxxxxxpo025) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.edxxxxxxbvxxxxxxxxxxpo025},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.efxxxxxxbvxxxxxxxxxxseat026status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.efxxxxxxbvxxxxxxxxxxseat026status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.egxxxxxxbvxxxxxxxxxxname026) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.egxxxxxxbvxxxxxxxxxxname026},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ehxxxxxxbvxxxxxxxxxxticket026) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ehxxxxxxbvxxxxxxxxxxticket026},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.eixxxxxxbvxxxxxxxxxxpo026) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.eixxxxxxbvxxxxxxxxxxpo026},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ejxxxxxxbvxxxxxxxxxxseat027status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ejxxxxxxbvxxxxxxxxxxseat027status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ekxxxxxxbvxxxxxxxxxxname027) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ekxxxxxxbvxxxxxxxxxxname027},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.elxxxxxxbvxxxxxxxxxxticket027) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.elxxxxxxbvxxxxxxxxxxticket027},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.emxxxxxxbvxxxxxxxxxxpo027) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.emxxxxxxbvxxxxxxxxxxpo027},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.enxxxxxxbvxxxxxxxxxxseat028status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.enxxxxxxbvxxxxxxxxxxseat028status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.eoxxxxxxbvxxxxxxxxxxname028) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.eoxxxxxxbvxxxxxxxxxxname028},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.epxxxxxxbvxxxxxxxxxxticket028) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.epxxxxxxbvxxxxxxxxxxticket028},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.eqxxxxxxbvxxxxxxxxxxpo028) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.eqxxxxxxbvxxxxxxxxxxpo028},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.erxxxxxxbvxxxxxxxxxxseat029status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.erxxxxxxbvxxxxxxxxxxseat029status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.esxxxxxxbvxxxxxxxxxxname029) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.esxxxxxxbvxxxxxxxxxxname029},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.etxxxxxxbvxxxxxxxxxxticket029) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.etxxxxxxbvxxxxxxxxxxticket029},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.euxxxxxxbvxxxxxxxxxxpo029) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.euxxxxxxbvxxxxxxxxxxpo029},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.evxxxxxxbvxxxxxxxxxxseat030status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.evxxxxxxbvxxxxxxxxxxseat030status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ewxxxxxxbvxxxxxxxxxxname030) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ewxxxxxxbvxxxxxxxxxxname030},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.exxxxxxxbvxxxxxxxxxxticket030) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.exxxxxxxbvxxxxxxxxxxticket030},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.eyxxxxxxbvxxxxxxxxxxpo030) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.eyxxxxxxbvxxxxxxxxxxpo030},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.faxxxxxxbvxxxxxxxxxxseat031status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.faxxxxxxbvxxxxxxxxxxseat031status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fbxxxxxxbvxxxxxxxxxxname031) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fbxxxxxxbvxxxxxxxxxxname031},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fcxxxxxxbvxxxxxxxxxxticket031) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fcxxxxxxbvxxxxxxxxxxticket031},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fdxxxxxxbvxxxxxxxxxxpo031) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fdxxxxxxbvxxxxxxxxxxpo031},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fexxxxxxbvxxxxxxxxxxseat032status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fexxxxxxbvxxxxxxxxxxseat032status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ffxxxxxxbvxxxxxxxxxxname032) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ffxxxxxxbvxxxxxxxxxxname032},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fgxxxxxxbvxxxxxxxxxxticket032) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fgxxxxxxbvxxxxxxxxxxticket032},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fhxxxxxxbvxxxxxxxxxxpo032) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fhxxxxxxbvxxxxxxxxxxpo032},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fixxxxxxbvxxxxxxxxxxseat033status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fixxxxxxbvxxxxxxxxxxseat033status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fjxxxxxxbvxxxxxxxxxxname033) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fjxxxxxxbvxxxxxxxxxxname033},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fkxxxxxxbvxxxxxxxxxxticket033) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fkxxxxxxbvxxxxxxxxxxticket033},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.flxxxxxxbvxxxxxxxxxxpo033) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.flxxxxxxbvxxxxxxxxxxpo033},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fmxxxxxxbvxxxxxxxxxxseat034status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fmxxxxxxbvxxxxxxxxxxseat034status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fnxxxxxxbvxxxxxxxxxxname034) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fnxxxxxxbvxxxxxxxxxxname034},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.foxxxxxxbvxxxxxxxxxxticket034) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.foxxxxxxbvxxxxxxxxxxticket034},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fpxxxxxxbvxxxxxxxxxxpo034) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fpxxxxxxbvxxxxxxxxxxpo034},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fqxxxxxxbvxxxxxxxxxxseat035status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fqxxxxxxbvxxxxxxxxxxseat035status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.frxxxxxxbvxxxxxxxxxxname035) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.frxxxxxxbvxxxxxxxxxxname035},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fsxxxxxxbvxxxxxxxxxxticket035) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fsxxxxxxbvxxxxxxxxxxticket035},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ftxxxxxxbvxxxxxxxxxxpo035) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ftxxxxxxbvxxxxxxxxxxpo035},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fuxxxxxxbvxxxxxxxxxxseat036status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fuxxxxxxbvxxxxxxxxxxseat036status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fvxxxxxxbvxxxxxxxxxxname036) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fvxxxxxxbvxxxxxxxxxxname036},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.fwxxxxxxbvxxxxxxxxxxticket036) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fwxxxxxxbvxxxxxxxxxxticket036},'%'))",

        "lower(fxxxuq1skxwwqqhxxxxxseat.fxxxxxxxbvxxxxxxxxxxpo036) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.fxxxxxxxbvxxxxxxxxxxpo036},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gaxxxxxxbvxxxxxxxxxxseat037status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gaxxxxxxbvxxxxxxxxxxseat037status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gbxxxxxxbvxxxxxxxxxxname037) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gbxxxxxxbvxxxxxxxxxxname037},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gcxxxxxxbvxxxxxxxxxxticket037) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gcxxxxxxbvxxxxxxxxxxticket037},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gdxxxxxxbvxxxxxxxxxxpo037) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gdxxxxxxbvxxxxxxxxxxpo037},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gexxxxxxbvxxxxxxxxxxseat038status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gexxxxxxbvxxxxxxxxxxseat038status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gfxxxxxxbvxxxxxxxxxxname038) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gfxxxxxxbvxxxxxxxxxxname038},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ggxxxxxxbvxxxxxxxxxxticket038) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ggxxxxxxbvxxxxxxxxxxticket038},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ghxxxxxxbvxxxxxxxxxxpo038) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ghxxxxxxbvxxxxxxxxxxpo038},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gixxxxxxbvxxxxxxxxxxseat039status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gixxxxxxbvxxxxxxxxxxseat039status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gjxxxxxxbvxxxxxxxxxxname039) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gjxxxxxxbvxxxxxxxxxxname039},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gkxxxxxxbvxxxxxxxxxxticket039) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gkxxxxxxbvxxxxxxxxxxticket039},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.glxxxxxxbvxxxxxxxxxxpo039) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.glxxxxxxbvxxxxxxxxxxpo039},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gmxxxxxxbvxxxxxxxxxxseat040status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gmxxxxxxbvxxxxxxxxxxseat040status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gnxxxxxxbvxxxxxxxxxxname040) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gnxxxxxxbvxxxxxxxxxxname040},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.goxxxxxxbvxxxxxxxxxxticket040) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.goxxxxxxbvxxxxxxxxxxticket040},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gpxxxxxxbvxxxxxxxxxxpo040) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gpxxxxxxbvxxxxxxxxxxpo040},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gqxxxxxxbvxxxxxxxxxxseat041status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gqxxxxxxbvxxxxxxxxxxseat041status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.grxxxxxxbvxxxxxxxxxxname041) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.grxxxxxxbvxxxxxxxxxxname041},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gsxxxxxxbvxxxxxxxxxxticket041) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gsxxxxxxbvxxxxxxxxxxticket041},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gtxxxxxxbvxxxxxxxxxxpo041) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gtxxxxxxbvxxxxxxxxxxpo041},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.guxxxxxxbvxxxxxxxxxxseat042status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.guxxxxxxbvxxxxxxxxxxseat042status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gvxxxxxxbvxxxxxxxxxxname042) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gvxxxxxxbvxxxxxxxxxxname042},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gwxxxxxxbvxxxxxxxxxxticket042) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gwxxxxxxbvxxxxxxxxxxticket042},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.gxxxxxxxbvxxxxxxxxxxpo042) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.gxxxxxxxbvxxxxxxxxxxpo042},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.haxxxxxxbvxxxxxxxxxxseat043status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.haxxxxxxbvxxxxxxxxxxseat043status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hbxxxxxxbvxxxxxxxxxxname043) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hbxxxxxxbvxxxxxxxxxxname043},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hcxxxxxxbvxxxxxxxxxxticket043) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hcxxxxxxbvxxxxxxxxxxticket043},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hdxxxxxxbvxxxxxxxxxxpo043) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hdxxxxxxbvxxxxxxxxxxpo043},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hexxxxxxbvxxxxxxxxxxseat044status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hexxxxxxbvxxxxxxxxxxseat044status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hfxxxxxxbvxxxxxxxxxxname044) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hfxxxxxxbvxxxxxxxxxxname044},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hgxxxxxxbvxxxxxxxxxxticket044) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hgxxxxxxbvxxxxxxxxxxticket044},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hhxxxxxxbvxxxxxxxxxxpo044) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hhxxxxxxbvxxxxxxxxxxpo044},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hixxxxxxbvxxxxxxxxxxseat045status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hixxxxxxbvxxxxxxxxxxseat045status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hjxxxxxxbvxxxxxxxxxxname045) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hjxxxxxxbvxxxxxxxxxxname045},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hkxxxxxxbvxxxxxxxxxxticket045) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hkxxxxxxbvxxxxxxxxxxticket045},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hlxxxxxxbvxxxxxxxxxxpo045) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hlxxxxxxbvxxxxxxxxxxpo045},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hmxxxxxxbvxxxxxxxxxxseat046status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hmxxxxxxbvxxxxxxxxxxseat046status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hnxxxxxxbvxxxxxxxxxxname046) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hnxxxxxxbvxxxxxxxxxxname046},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hoxxxxxxbvxxxxxxxxxxticket046) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hoxxxxxxbvxxxxxxxxxxticket046},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hpxxxxxxbvxxxxxxxxxxpo046) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hpxxxxxxbvxxxxxxxxxxpo046},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hqxxxxxxbvxxxxxxxxxxseat047status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hqxxxxxxbvxxxxxxxxxxseat047status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hrxxxxxxbvxxxxxxxxxxname047) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hrxxxxxxbvxxxxxxxxxxname047},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hsxxxxxxbvxxxxxxxxxxticket047) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hsxxxxxxbvxxxxxxxxxxticket047},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.htxxxxxxbvxxxxxxxxxxpo047) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.htxxxxxxbvxxxxxxxxxxpo047},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.huxxxxxxbvxxxxxxxxxxseat048status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.huxxxxxxbvxxxxxxxxxxseat048status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hvxxxxxxbvxxxxxxxxxxname048) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hvxxxxxxbvxxxxxxxxxxname048},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hwxxxxxxbvxxxxxxxxxxticket048) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hwxxxxxxbvxxxxxxxxxxticket048},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.hxxxxxxxbvxxxxxxxxxxpo048) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.hxxxxxxxbvxxxxxxxxxxpo048},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.iaxxxxxxbvxxxxxxxxxxseat049status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.iaxxxxxxbvxxxxxxxxxxseat049status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ibxxxxxxbvxxxxxxxxxxname049) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ibxxxxxxbvxxxxxxxxxxname049},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.icxxxxxxbvxxxxxxxxxxticket049) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.icxxxxxxbvxxxxxxxxxxticket049},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.idxxxxxxbvxxxxxxxxxxpo049) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.idxxxxxxbvxxxxxxxxxxpo049},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.iexxxxxxbvxxxxxxxxxxseat050status) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.iexxxxxxbvxxxxxxxxxxseat050status},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ifxxxxxxbvxxxxxxxxxxname050) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ifxxxxxxbvxxxxxxxxxxname050},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.igxxxxxxbvxxxxxxxxxxticket050) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.igxxxxxxbvxxxxxxxxxxticket050},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.ihxxxxxxbvxxxxxxxxxxpo050) like lower( concat(#{fxxxuq1skxwwqqhxxxxxseatList.fxxxuq1skxwwqqhxxxxxseat.ihxxxxxxbvxxxxxxxxxxpo050},'%'))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.z3xxutoxlhxxxxxxxxxxowner) like lower( concat('%',#{fxxxuq1skxwwqqhxxxxxseatList.ownerCddCode}))",
        "lower(fxxxuq1skxwwqqhxxxxxseat.zzxxu2oxxhxxxxxxxxxxowner2) = lower(#{fxxxuq1skxwwqqhxxxxxseatList.dataOwner2Code})",
    };



    private Fxxxuq1skxwwqqhxxxxxseat fxxxuq1skxwwqqhxxxxxseat = new Fxxxuq1skxwwqqhxxxxxseat();
 /*
  In case of non composite ie Single Field Key
 */
      /*
      ids = pojo.identifierProperty.name >>> a0xxuobxbxxxxxxxxxxxsid
      */




// add more logic here to pick up foreign fields if transaction or mailing, pks,pfs=05 efs=06,added multiple K test
   //not foreign or collection properties  property name a0xxuobxbxxxxxxxxxxxsid
   //not foreign or collection also not component  property name a0xxuobxbxxxxxxxxxxxsid
   //not foreign or collection properties  property name a2xxukstbvxxxxxxxxxxrow
   //not foreign or collection also not component  property name a2xxukstbvxxxxxxxxxxrow
      //not component keyfield property name a2xxukstbvxxxxxxxxxxrow
   //not foreign or collection properties  property name a3xxuxxxbvxxxxxxxxxxrowlabel
   //not foreign or collection also not component  property name a3xxuxxxbvxxxxxxxxxxrowlabel
   //not foreign or collection properties  property name b1xxxxxxbvxxxxxxxxxxseat001status
   //not foreign or collection also not component  property name b1xxxxxxbvxxxxxxxxxxseat001status
   //not foreign or collection properties  property name b2xxxxxxbvxxxxxxxxxxname001
   //not foreign or collection also not component  property name b2xxxxxxbvxxxxxxxxxxname001
   //not foreign or collection properties  property name b3xxxxxxbvxxxxxxxxxxticket001
   //not foreign or collection also not component  property name b3xxxxxxbvxxxxxxxxxxticket001
   //not foreign or collection properties  property name b4xxxxxxbvxxxxxxxxxxpo001
   //not foreign or collection also not component  property name b4xxxxxxbvxxxxxxxxxxpo001
   //not foreign or collection properties  property name b5xxxxxxbvxxxxxxxxxxseat002status
   //not foreign or collection also not component  property name b5xxxxxxbvxxxxxxxxxxseat002status
   //not foreign or collection properties  property name b6xxxxxxbvxxxxxxxxxxname002
   //not foreign or collection also not component  property name b6xxxxxxbvxxxxxxxxxxname002
   //not foreign or collection properties  property name b7xxxxxxbvxxxxxxxxxxticket002
   //not foreign or collection also not component  property name b7xxxxxxbvxxxxxxxxxxticket002
   //not foreign or collection properties  property name b8xxxxxxbvxxxxxxxxxxpo002
   //not foreign or collection also not component  property name b8xxxxxxbvxxxxxxxxxxpo002
   //not foreign or collection properties  property name b9xxxxxxbvxxxxxxxxxxseat003status
   //not foreign or collection also not component  property name b9xxxxxxbvxxxxxxxxxxseat003status
   //not foreign or collection properties  property name baxxxxxxbvxxxxxxxxxxname003
   //not foreign or collection also not component  property name baxxxxxxbvxxxxxxxxxxname003
   //not foreign or collection properties  property name bbxxxxxxbvxxxxxxxxxxticket003
   //not foreign or collection also not component  property name bbxxxxxxbvxxxxxxxxxxticket003
   //not foreign or collection properties  property name bcxxxxxxbvxxxxxxxxxxpo003
   //not foreign or collection also not component  property name bcxxxxxxbvxxxxxxxxxxpo003
   //not foreign or collection properties  property name bdxxxxxxbvxxxxxxxxxxseat004status
   //not foreign or collection also not component  property name bdxxxxxxbvxxxxxxxxxxseat004status
   //not foreign or collection properties  property name bexxxxxxbvxxxxxxxxxxname004
   //not foreign or collection also not component  property name bexxxxxxbvxxxxxxxxxxname004
   //not foreign or collection properties  property name bfxxxxxxbvxxxxxxxxxxticket004
   //not foreign or collection also not component  property name bfxxxxxxbvxxxxxxxxxxticket004
   //not foreign or collection properties  property name bgxxxxxxbvxxxxxxxxxxpo004
   //not foreign or collection also not component  property name bgxxxxxxbvxxxxxxxxxxpo004
   //not foreign or collection properties  property name bhxxxxxxbvxxxxxxxxxxseat005status
   //not foreign or collection also not component  property name bhxxxxxxbvxxxxxxxxxxseat005status
   //not foreign or collection properties  property name bixxxxxxbvxxxxxxxxxxname005
   //not foreign or collection also not component  property name bixxxxxxbvxxxxxxxxxxname005
   //not foreign or collection properties  property name bjxxxxxxbvxxxxxxxxxxticket005
   //not foreign or collection also not component  property name bjxxxxxxbvxxxxxxxxxxticket005
   //not foreign or collection properties  property name bkxxxxxxbvxxxxxxxxxxpo005
   //not foreign or collection also not component  property name bkxxxxxxbvxxxxxxxxxxpo005
   //not foreign or collection properties  property name blxxxxxxbvxxxxxxxxxxseat006status
   //not foreign or collection also not component  property name blxxxxxxbvxxxxxxxxxxseat006status
   //not foreign or collection properties  property name bmxxxxxxbvxxxxxxxxxxname006
   //not foreign or collection also not component  property name bmxxxxxxbvxxxxxxxxxxname006
   //not foreign or collection properties  property name bnxxxxxxbvxxxxxxxxxxticket006
   //not foreign or collection also not component  property name bnxxxxxxbvxxxxxxxxxxticket006
   //not foreign or collection properties  property name boxxxxxxbvxxxxxxxxxxpo006
   //not foreign or collection also not component  property name boxxxxxxbvxxxxxxxxxxpo006
   //not foreign or collection properties  property name bpxxxxxxbvxxxxxxxxxxseat007status
   //not foreign or collection also not component  property name bpxxxxxxbvxxxxxxxxxxseat007status
   //not foreign or collection properties  property name bqxxxxxxbvxxxxxxxxxxname007
   //not foreign or collection also not component  property name bqxxxxxxbvxxxxxxxxxxname007
   //not foreign or collection properties  property name brxxxxxxbvxxxxxxxxxxticket007
   //not foreign or collection also not component  property name brxxxxxxbvxxxxxxxxxxticket007
   //not foreign or collection properties  property name bsxxxxxxbvxxxxxxxxxxpo007
   //not foreign or collection also not component  property name bsxxxxxxbvxxxxxxxxxxpo007
   //not foreign or collection properties  property name btxxxxxxbvxxxxxxxxxxseat008status
   //not foreign or collection also not component  property name btxxxxxxbvxxxxxxxxxxseat008status
   //not foreign or collection properties  property name buxxxxxxbvxxxxxxxxxxname008
   //not foreign or collection also not component  property name buxxxxxxbvxxxxxxxxxxname008
   //not foreign or collection properties  property name bvxxxxxxbvxxxxxxxxxxticket008
   //not foreign or collection also not component  property name bvxxxxxxbvxxxxxxxxxxticket008
   //not foreign or collection properties  property name bwxxxxxxbvxxxxxxxxxxpo008
   //not foreign or collection also not component  property name bwxxxxxxbvxxxxxxxxxxpo008
   //not foreign or collection properties  property name bxxxxxxxbvxxxxxxxxxxseat009status
   //not foreign or collection also not component  property name bxxxxxxxbvxxxxxxxxxxseat009status
   //not foreign or collection properties  property name byxxxxxxbvxxxxxxxxxxname009
   //not foreign or collection also not component  property name byxxxxxxbvxxxxxxxxxxname009
   //not foreign or collection properties  property name bzxxxxxxbvxxxxxxxxxxticket009
   //not foreign or collection also not component  property name bzxxxxxxbvxxxxxxxxxxticket009
   //not foreign or collection properties  property name c1xxxxxxbvxxxxxxxxxxpo009
   //not foreign or collection also not component  property name c1xxxxxxbvxxxxxxxxxxpo009
   //not foreign or collection properties  property name c2xxxxxxbvxxxxxxxxxxseat010status
   //not foreign or collection also not component  property name c2xxxxxxbvxxxxxxxxxxseat010status
   //not foreign or collection properties  property name c3xxxxxxbvxxxxxxxxxxname010
   //not foreign or collection also not component  property name c3xxxxxxbvxxxxxxxxxxname010
   //not foreign or collection properties  property name c4xxxxxxbvxxxxxxxxxxticket010
   //not foreign or collection also not component  property name c4xxxxxxbvxxxxxxxxxxticket010
   //not foreign or collection properties  property name c5xxxxxxbvxxxxxxxxxxpo010
   //not foreign or collection also not component  property name c5xxxxxxbvxxxxxxxxxxpo010
   //not foreign or collection properties  property name c6xxxxxxbvxxxxxxxxxxseat011status
   //not foreign or collection also not component  property name c6xxxxxxbvxxxxxxxxxxseat011status
   //not foreign or collection properties  property name c7xxxxxxbvxxxxxxxxxxname011
   //not foreign or collection also not component  property name c7xxxxxxbvxxxxxxxxxxname011
   //not foreign or collection properties  property name c8xxxxxxbvxxxxxxxxxxticket011
   //not foreign or collection also not component  property name c8xxxxxxbvxxxxxxxxxxticket011
   //not foreign or collection properties  property name c9xxxxxxbvxxxxxxxxxxpo011
   //not foreign or collection also not component  property name c9xxxxxxbvxxxxxxxxxxpo011
   //not foreign or collection properties  property name caxxxxxxbvxxxxxxxxxxseat012status
   //not foreign or collection also not component  property name caxxxxxxbvxxxxxxxxxxseat012status
   //not foreign or collection properties  property name cbxxxxxxbvxxxxxxxxxxname012
   //not foreign or collection also not component  property name cbxxxxxxbvxxxxxxxxxxname012
   //not foreign or collection properties  property name ccxxxxxxbvxxxxxxxxxxticket012
   //not foreign or collection also not component  property name ccxxxxxxbvxxxxxxxxxxticket012
   //not foreign or collection properties  property name cdxxxxxxbvxxxxxxxxxxpo012
   //not foreign or collection also not component  property name cdxxxxxxbvxxxxxxxxxxpo012
   //not foreign or collection properties  property name cexxxxxxbvxxxxxxxxxxseat013status
   //not foreign or collection also not component  property name cexxxxxxbvxxxxxxxxxxseat013status
   //not foreign or collection properties  property name cfxxxxxxbvxxxxxxxxxxname013
   //not foreign or collection also not component  property name cfxxxxxxbvxxxxxxxxxxname013
   //not foreign or collection properties  property name cgxxxxxxbvxxxxxxxxxxticket013
   //not foreign or collection also not component  property name cgxxxxxxbvxxxxxxxxxxticket013
   //not foreign or collection properties  property name chxxxxxxbvxxxxxxxxxxpo013
   //not foreign or collection also not component  property name chxxxxxxbvxxxxxxxxxxpo013
   //not foreign or collection properties  property name cixxxxxxbvxxxxxxxxxxseat014status
   //not foreign or collection also not component  property name cixxxxxxbvxxxxxxxxxxseat014status
   //not foreign or collection properties  property name cjxxxxxxbvxxxxxxxxxxname014
   //not foreign or collection also not component  property name cjxxxxxxbvxxxxxxxxxxname014
   //not foreign or collection properties  property name ckxxxxxxbvxxxxxxxxxxticket014
   //not foreign or collection also not component  property name ckxxxxxxbvxxxxxxxxxxticket014
   //not foreign or collection properties  property name clxxxxxxbvxxxxxxxxxxpo014
   //not foreign or collection also not component  property name clxxxxxxbvxxxxxxxxxxpo014
   //not foreign or collection properties  property name cmxxxxxxbvxxxxxxxxxxseat015status
   //not foreign or collection also not component  property name cmxxxxxxbvxxxxxxxxxxseat015status
   //not foreign or collection properties  property name cnxxxxxxbvxxxxxxxxxxname015
   //not foreign or collection also not component  property name cnxxxxxxbvxxxxxxxxxxname015
   //not foreign or collection properties  property name coxxxxxxbvxxxxxxxxxxticket015
   //not foreign or collection also not component  property name coxxxxxxbvxxxxxxxxxxticket015
   //not foreign or collection properties  property name cpxxxxxxbvxxxxxxxxxxpo015
   //not foreign or collection also not component  property name cpxxxxxxbvxxxxxxxxxxpo015
   //not foreign or collection properties  property name cqxxxxxxbvxxxxxxxxxxseat016status
   //not foreign or collection also not component  property name cqxxxxxxbvxxxxxxxxxxseat016status
   //not foreign or collection properties  property name crxxxxxxbvxxxxxxxxxxname016
   //not foreign or collection also not component  property name crxxxxxxbvxxxxxxxxxxname016
   //not foreign or collection properties  property name csxxxxxxbvxxxxxxxxxxticket016
   //not foreign or collection also not component  property name csxxxxxxbvxxxxxxxxxxticket016
   //not foreign or collection properties  property name ctxxxxxxbvxxxxxxxxxxpo016
   //not foreign or collection also not component  property name ctxxxxxxbvxxxxxxxxxxpo016
   //not foreign or collection properties  property name cuxxxxxxbvxxxxxxxxxxseat017status
   //not foreign or collection also not component  property name cuxxxxxxbvxxxxxxxxxxseat017status
   //not foreign or collection properties  property name cvxxxxxxbvxxxxxxxxxxname017
   //not foreign or collection also not component  property name cvxxxxxxbvxxxxxxxxxxname017
   //not foreign or collection properties  property name cxxxxxxxbvxxxxxxxxxxticket017
   //not foreign or collection also not component  property name cxxxxxxxbvxxxxxxxxxxticket017
   //not foreign or collection properties  property name cyxxxxxxbvxxxxxxxxxxpo017
   //not foreign or collection also not component  property name cyxxxxxxbvxxxxxxxxxxpo017
   //not foreign or collection properties  property name daxxxxxxbvxxxxxxxxxxseat018status
   //not foreign or collection also not component  property name daxxxxxxbvxxxxxxxxxxseat018status
   //not foreign or collection properties  property name dbxxxxxxbvxxxxxxxxxxname018
   //not foreign or collection also not component  property name dbxxxxxxbvxxxxxxxxxxname018
   //not foreign or collection properties  property name dcxxxxxxbvxxxxxxxxxxticket018
   //not foreign or collection also not component  property name dcxxxxxxbvxxxxxxxxxxticket018
   //not foreign or collection properties  property name ddxxxxxxbvxxxxxxxxxxpo018
   //not foreign or collection also not component  property name ddxxxxxxbvxxxxxxxxxxpo018
   //not foreign or collection properties  property name dexxxxxxbvxxxxxxxxxxseat019status
   //not foreign or collection also not component  property name dexxxxxxbvxxxxxxxxxxseat019status
   //not foreign or collection properties  property name dfxxxxxxbvxxxxxxxxxxname019
   //not foreign or collection also not component  property name dfxxxxxxbvxxxxxxxxxxname019
   //not foreign or collection properties  property name dgxxxxxxbvxxxxxxxxxxticket019
   //not foreign or collection also not component  property name dgxxxxxxbvxxxxxxxxxxticket019
   //not foreign or collection properties  property name dhxxxxxxbvxxxxxxxxxxpo019
   //not foreign or collection also not component  property name dhxxxxxxbvxxxxxxxxxxpo019
   //not foreign or collection properties  property name dixxxxxxbvxxxxxxxxxxseat020status
   //not foreign or collection also not component  property name dixxxxxxbvxxxxxxxxxxseat020status
   //not foreign or collection properties  property name djxxxxxxbvxxxxxxxxxxname020
   //not foreign or collection also not component  property name djxxxxxxbvxxxxxxxxxxname020
   //not foreign or collection properties  property name dkxxxxxxbvxxxxxxxxxxticket020
   //not foreign or collection also not component  property name dkxxxxxxbvxxxxxxxxxxticket020
   //not foreign or collection properties  property name dlxxxxxxbvxxxxxxxxxxpo020
   //not foreign or collection also not component  property name dlxxxxxxbvxxxxxxxxxxpo020
   //not foreign or collection properties  property name dmxxxxxxbvxxxxxxxxxxseat021status
   //not foreign or collection also not component  property name dmxxxxxxbvxxxxxxxxxxseat021status
   //not foreign or collection properties  property name dnxxxxxxbvxxxxxxxxxxname021
   //not foreign or collection also not component  property name dnxxxxxxbvxxxxxxxxxxname021
   //not foreign or collection properties  property name doxxxxxxbvxxxxxxxxxxticket021
   //not foreign or collection also not component  property name doxxxxxxbvxxxxxxxxxxticket021
   //not foreign or collection properties  property name dpxxxxxxbvxxxxxxxxxxpo021
   //not foreign or collection also not component  property name dpxxxxxxbvxxxxxxxxxxpo021
   //not foreign or collection properties  property name dqxxxxxxbvxxxxxxxxxxseat022status
   //not foreign or collection also not component  property name dqxxxxxxbvxxxxxxxxxxseat022status
   //not foreign or collection properties  property name drxxxxxxbvxxxxxxxxxxname022
   //not foreign or collection also not component  property name drxxxxxxbvxxxxxxxxxxname022
   //not foreign or collection properties  property name dsxxxxxxbvxxxxxxxxxxticket022
   //not foreign or collection also not component  property name dsxxxxxxbvxxxxxxxxxxticket022
   //not foreign or collection properties  property name dtxxxxxxbvxxxxxxxxxxpo022
   //not foreign or collection also not component  property name dtxxxxxxbvxxxxxxxxxxpo022
   //not foreign or collection properties  property name duxxxxxxbvxxxxxxxxxxseat023status
   //not foreign or collection also not component  property name duxxxxxxbvxxxxxxxxxxseat023status
   //not foreign or collection properties  property name dvxxxxxxbvxxxxxxxxxxname023
   //not foreign or collection also not component  property name dvxxxxxxbvxxxxxxxxxxname023
   //not foreign or collection properties  property name dwxxxxxxbvxxxxxxxxxxticket023
   //not foreign or collection also not component  property name dwxxxxxxbvxxxxxxxxxxticket023
   //not foreign or collection properties  property name dxxxxxxxbvxxxxxxxxxxpo023
   //not foreign or collection also not component  property name dxxxxxxxbvxxxxxxxxxxpo023
   //not foreign or collection properties  property name e1xxxxxxbvxxxxxxxxxxseat024status
   //not foreign or collection also not component  property name e1xxxxxxbvxxxxxxxxxxseat024status
   //not foreign or collection properties  property name e2xxxxxxbvxxxxxxxxxxname024
   //not foreign or collection also not component  property name e2xxxxxxbvxxxxxxxxxxname024
   //not foreign or collection properties  property name e3xxxxxxbvxxxxxxxxxxticket024
   //not foreign or collection also not component  property name e3xxxxxxbvxxxxxxxxxxticket024
   //not foreign or collection properties  property name e4xxxxxxbvxxxxxxxxxxpo024
   //not foreign or collection also not component  property name e4xxxxxxbvxxxxxxxxxxpo024
   //not foreign or collection properties  property name eaxxxxxxbvxxxxxxxxxxseat025status
   //not foreign or collection also not component  property name eaxxxxxxbvxxxxxxxxxxseat025status
   //not foreign or collection properties  property name ebxxxxxxbvxxxxxxxxxxname025
   //not foreign or collection also not component  property name ebxxxxxxbvxxxxxxxxxxname025
   //not foreign or collection properties  property name ecxxxxxxbvxxxxxxxxxxticket025
   //not foreign or collection also not component  property name ecxxxxxxbvxxxxxxxxxxticket025
   //not foreign or collection properties  property name edxxxxxxbvxxxxxxxxxxpo025
   //not foreign or collection also not component  property name edxxxxxxbvxxxxxxxxxxpo025
   //not foreign or collection properties  property name efxxxxxxbvxxxxxxxxxxseat026status
   //not foreign or collection also not component  property name efxxxxxxbvxxxxxxxxxxseat026status
   //not foreign or collection properties  property name egxxxxxxbvxxxxxxxxxxname026
   //not foreign or collection also not component  property name egxxxxxxbvxxxxxxxxxxname026
   //not foreign or collection properties  property name ehxxxxxxbvxxxxxxxxxxticket026
   //not foreign or collection also not component  property name ehxxxxxxbvxxxxxxxxxxticket026
   //not foreign or collection properties  property name eixxxxxxbvxxxxxxxxxxpo026
   //not foreign or collection also not component  property name eixxxxxxbvxxxxxxxxxxpo026
   //not foreign or collection properties  property name ejxxxxxxbvxxxxxxxxxxseat027status
   //not foreign or collection also not component  property name ejxxxxxxbvxxxxxxxxxxseat027status
   //not foreign or collection properties  property name ekxxxxxxbvxxxxxxxxxxname027
   //not foreign or collection also not component  property name ekxxxxxxbvxxxxxxxxxxname027
   //not foreign or collection properties  property name elxxxxxxbvxxxxxxxxxxticket027
   //not foreign or collection also not component  property name elxxxxxxbvxxxxxxxxxxticket027
   //not foreign or collection properties  property name emxxxxxxbvxxxxxxxxxxpo027
   //not foreign or collection also not component  property name emxxxxxxbvxxxxxxxxxxpo027
   //not foreign or collection properties  property name enxxxxxxbvxxxxxxxxxxseat028status
   //not foreign or collection also not component  property name enxxxxxxbvxxxxxxxxxxseat028status
   //not foreign or collection properties  property name eoxxxxxxbvxxxxxxxxxxname028
   //not foreign or collection also not component  property name eoxxxxxxbvxxxxxxxxxxname028
   //not foreign or collection properties  property name epxxxxxxbvxxxxxxxxxxticket028
   //not foreign or collection also not component  property name epxxxxxxbvxxxxxxxxxxticket028
   //not foreign or collection properties  property name eqxxxxxxbvxxxxxxxxxxpo028
   //not foreign or collection also not component  property name eqxxxxxxbvxxxxxxxxxxpo028
   //not foreign or collection properties  property name erxxxxxxbvxxxxxxxxxxseat029status
   //not foreign or collection also not component  property name erxxxxxxbvxxxxxxxxxxseat029status
   //not foreign or collection properties  property name esxxxxxxbvxxxxxxxxxxname029
   //not foreign or collection also not component  property name esxxxxxxbvxxxxxxxxxxname029
   //not foreign or collection properties  property name etxxxxxxbvxxxxxxxxxxticket029
   //not foreign or collection also not component  property name etxxxxxxbvxxxxxxxxxxticket029
   //not foreign or collection properties  property name euxxxxxxbvxxxxxxxxxxpo029
   //not foreign or collection also not component  property name euxxxxxxbvxxxxxxxxxxpo029
   //not foreign or collection properties  property name evxxxxxxbvxxxxxxxxxxseat030status
   //not foreign or collection also not component  property name evxxxxxxbvxxxxxxxxxxseat030status
   //not foreign or collection properties  property name ewxxxxxxbvxxxxxxxxxxname030
   //not foreign or collection also not component  property name ewxxxxxxbvxxxxxxxxxxname030
   //not foreign or collection properties  property name exxxxxxxbvxxxxxxxxxxticket030
   //not foreign or collection also not component  property name exxxxxxxbvxxxxxxxxxxticket030
   //not foreign or collection properties  property name eyxxxxxxbvxxxxxxxxxxpo030
   //not foreign or collection also not component  property name eyxxxxxxbvxxxxxxxxxxpo030
   //not foreign or collection properties  property name faxxxxxxbvxxxxxxxxxxseat031status
   //not foreign or collection also not component  property name faxxxxxxbvxxxxxxxxxxseat031status
   //not foreign or collection properties  property name fbxxxxxxbvxxxxxxxxxxname031
   //not foreign or collection also not component  property name fbxxxxxxbvxxxxxxxxxxname031
   //not foreign or collection properties  property name fcxxxxxxbvxxxxxxxxxxticket031
   //not foreign or collection also not component  property name fcxxxxxxbvxxxxxxxxxxticket031
   //not foreign or collection properties  property name fdxxxxxxbvxxxxxxxxxxpo031
   //not foreign or collection also not component  property name fdxxxxxxbvxxxxxxxxxxpo031
   //not foreign or collection properties  property name fexxxxxxbvxxxxxxxxxxseat032status
   //not foreign or collection also not component  property name fexxxxxxbvxxxxxxxxxxseat032status
   //not foreign or collection properties  property name ffxxxxxxbvxxxxxxxxxxname032
   //not foreign or collection also not component  property name ffxxxxxxbvxxxxxxxxxxname032
   //not foreign or collection properties  property name fgxxxxxxbvxxxxxxxxxxticket032
   //not foreign or collection also not component  property name fgxxxxxxbvxxxxxxxxxxticket032
   //not foreign or collection properties  property name fhxxxxxxbvxxxxxxxxxxpo032
   //not foreign or collection also not component  property name fhxxxxxxbvxxxxxxxxxxpo032
   //not foreign or collection properties  property name fixxxxxxbvxxxxxxxxxxseat033status
   //not foreign or collection also not component  property name fixxxxxxbvxxxxxxxxxxseat033status
   //not foreign or collection properties  property name fjxxxxxxbvxxxxxxxxxxname033
   //not foreign or collection also not component  property name fjxxxxxxbvxxxxxxxxxxname033
   //not foreign or collection properties  property name fkxxxxxxbvxxxxxxxxxxticket033
   //not foreign or collection also not component  property name fkxxxxxxbvxxxxxxxxxxticket033
   //not foreign or collection properties  property name flxxxxxxbvxxxxxxxxxxpo033
   //not foreign or collection also not component  property name flxxxxxxbvxxxxxxxxxxpo033
   //not foreign or collection properties  property name fmxxxxxxbvxxxxxxxxxxseat034status
   //not foreign or collection also not component  property name fmxxxxxxbvxxxxxxxxxxseat034status
   //not foreign or collection properties  property name fnxxxxxxbvxxxxxxxxxxname034
   //not foreign or collection also not component  property name fnxxxxxxbvxxxxxxxxxxname034
   //not foreign or collection properties  property name foxxxxxxbvxxxxxxxxxxticket034
   //not foreign or collection also not component  property name foxxxxxxbvxxxxxxxxxxticket034
   //not foreign or collection properties  property name fpxxxxxxbvxxxxxxxxxxpo034
   //not foreign or collection also not component  property name fpxxxxxxbvxxxxxxxxxxpo034
   //not foreign or collection properties  property name fqxxxxxxbvxxxxxxxxxxseat035status
   //not foreign or collection also not component  property name fqxxxxxxbvxxxxxxxxxxseat035status
   //not foreign or collection properties  property name frxxxxxxbvxxxxxxxxxxname035
   //not foreign or collection also not component  property name frxxxxxxbvxxxxxxxxxxname035
   //not foreign or collection properties  property name fsxxxxxxbvxxxxxxxxxxticket035
   //not foreign or collection also not component  property name fsxxxxxxbvxxxxxxxxxxticket035
   //not foreign or collection properties  property name ftxxxxxxbvxxxxxxxxxxpo035
   //not foreign or collection also not component  property name ftxxxxxxbvxxxxxxxxxxpo035
   //not foreign or collection properties  property name fuxxxxxxbvxxxxxxxxxxseat036status
   //not foreign or collection also not component  property name fuxxxxxxbvxxxxxxxxxxseat036status
   //not foreign or collection properties  property name fvxxxxxxbvxxxxxxxxxxname036
   //not foreign or collection also not component  property name fvxxxxxxbvxxxxxxxxxxname036
   //not foreign or collection properties  property name fwxxxxxxbvxxxxxxxxxxticket036
   //not foreign or collection also not component  property name fwxxxxxxbvxxxxxxxxxxticket036
   //not foreign or collection properties  property name fxxxxxxxbvxxxxxxxxxxpo036
   //not foreign or collection also not component  property name fxxxxxxxbvxxxxxxxxxxpo036
   //not foreign or collection properties  property name gaxxxxxxbvxxxxxxxxxxseat037status
   //not foreign or collection also not component  property name gaxxxxxxbvxxxxxxxxxxseat037status
   //not foreign or collection properties  property name gbxxxxxxbvxxxxxxxxxxname037
   //not foreign or collection also not component  property name gbxxxxxxbvxxxxxxxxxxname037
   //not foreign or collection properties  property name gcxxxxxxbvxxxxxxxxxxticket037
   //not foreign or collection also not component  property name gcxxxxxxbvxxxxxxxxxxticket037
   //not foreign or collection properties  property name gdxxxxxxbvxxxxxxxxxxpo037
   //not foreign or collection also not component  property name gdxxxxxxbvxxxxxxxxxxpo037
   //not foreign or collection properties  property name gexxxxxxbvxxxxxxxxxxseat038status
   //not foreign or collection also not component  property name gexxxxxxbvxxxxxxxxxxseat038status
   //not foreign or collection properties  property name gfxxxxxxbvxxxxxxxxxxname038
   //not foreign or collection also not component  property name gfxxxxxxbvxxxxxxxxxxname038
   //not foreign or collection properties  property name ggxxxxxxbvxxxxxxxxxxticket038
   //not foreign or collection also not component  property name ggxxxxxxbvxxxxxxxxxxticket038
   //not foreign or collection properties  property name ghxxxxxxbvxxxxxxxxxxpo038
   //not foreign or collection also not component  property name ghxxxxxxbvxxxxxxxxxxpo038
   //not foreign or collection properties  property name gixxxxxxbvxxxxxxxxxxseat039status
   //not foreign or collection also not component  property name gixxxxxxbvxxxxxxxxxxseat039status
   //not foreign or collection properties  property name gjxxxxxxbvxxxxxxxxxxname039
   //not foreign or collection also not component  property name gjxxxxxxbvxxxxxxxxxxname039
   //not foreign or collection properties  property name gkxxxxxxbvxxxxxxxxxxticket039
   //not foreign or collection also not component  property name gkxxxxxxbvxxxxxxxxxxticket039
   //not foreign or collection properties  property name glxxxxxxbvxxxxxxxxxxpo039
   //not foreign or collection also not component  property name glxxxxxxbvxxxxxxxxxxpo039
   //not foreign or collection properties  property name gmxxxxxxbvxxxxxxxxxxseat040status
   //not foreign or collection also not component  property name gmxxxxxxbvxxxxxxxxxxseat040status
   //not foreign or collection properties  property name gnxxxxxxbvxxxxxxxxxxname040
   //not foreign or collection also not component  property name gnxxxxxxbvxxxxxxxxxxname040
   //not foreign or collection properties  property name goxxxxxxbvxxxxxxxxxxticket040
   //not foreign or collection also not component  property name goxxxxxxbvxxxxxxxxxxticket040
   //not foreign or collection properties  property name gpxxxxxxbvxxxxxxxxxxpo040
   //not foreign or collection also not component  property name gpxxxxxxbvxxxxxxxxxxpo040
   //not foreign or collection properties  property name gqxxxxxxbvxxxxxxxxxxseat041status
   //not foreign or collection also not component  property name gqxxxxxxbvxxxxxxxxxxseat041status
   //not foreign or collection properties  property name grxxxxxxbvxxxxxxxxxxname041
   //not foreign or collection also not component  property name grxxxxxxbvxxxxxxxxxxname041
   //not foreign or collection properties  property name gsxxxxxxbvxxxxxxxxxxticket041
   //not foreign or collection also not component  property name gsxxxxxxbvxxxxxxxxxxticket041
   //not foreign or collection properties  property name gtxxxxxxbvxxxxxxxxxxpo041
   //not foreign or collection also not component  property name gtxxxxxxbvxxxxxxxxxxpo041
   //not foreign or collection properties  property name guxxxxxxbvxxxxxxxxxxseat042status
   //not foreign or collection also not component  property name guxxxxxxbvxxxxxxxxxxseat042status
   //not foreign or collection properties  property name gvxxxxxxbvxxxxxxxxxxname042
   //not foreign or collection also not component  property name gvxxxxxxbvxxxxxxxxxxname042
   //not foreign or collection properties  property name gwxxxxxxbvxxxxxxxxxxticket042
   //not foreign or collection also not component  property name gwxxxxxxbvxxxxxxxxxxticket042
   //not foreign or collection properties  property name gxxxxxxxbvxxxxxxxxxxpo042
   //not foreign or collection also not component  property name gxxxxxxxbvxxxxxxxxxxpo042
   //not foreign or collection properties  property name haxxxxxxbvxxxxxxxxxxseat043status
   //not foreign or collection also not component  property name haxxxxxxbvxxxxxxxxxxseat043status
   //not foreign or collection properties  property name hbxxxxxxbvxxxxxxxxxxname043
   //not foreign or collection also not component  property name hbxxxxxxbvxxxxxxxxxxname043
   //not foreign or collection properties  property name hcxxxxxxbvxxxxxxxxxxticket043
   //not foreign or collection also not component  property name hcxxxxxxbvxxxxxxxxxxticket043
   //not foreign or collection properties  property name hdxxxxxxbvxxxxxxxxxxpo043
   //not foreign or collection also not component  property name hdxxxxxxbvxxxxxxxxxxpo043
   //not foreign or collection properties  property name hexxxxxxbvxxxxxxxxxxseat044status
   //not foreign or collection also not component  property name hexxxxxxbvxxxxxxxxxxseat044status
   //not foreign or collection properties  property name hfxxxxxxbvxxxxxxxxxxname044
   //not foreign or collection also not component  property name hfxxxxxxbvxxxxxxxxxxname044
   //not foreign or collection properties  property name hgxxxxxxbvxxxxxxxxxxticket044
   //not foreign or collection also not component  property name hgxxxxxxbvxxxxxxxxxxticket044
   //not foreign or collection properties  property name hhxxxxxxbvxxxxxxxxxxpo044
   //not foreign or collection also not component  property name hhxxxxxxbvxxxxxxxxxxpo044
   //not foreign or collection properties  property name hixxxxxxbvxxxxxxxxxxseat045status
   //not foreign or collection also not component  property name hixxxxxxbvxxxxxxxxxxseat045status
   //not foreign or collection properties  property name hjxxxxxxbvxxxxxxxxxxname045
   //not foreign or collection also not component  property name hjxxxxxxbvxxxxxxxxxxname045
   //not foreign or collection properties  property name hkxxxxxxbvxxxxxxxxxxticket045
   //not foreign or collection also not component  property name hkxxxxxxbvxxxxxxxxxxticket045
   //not foreign or collection properties  property name hlxxxxxxbvxxxxxxxxxxpo045
   //not foreign or collection also not component  property name hlxxxxxxbvxxxxxxxxxxpo045
   //not foreign or collection properties  property name hmxxxxxxbvxxxxxxxxxxseat046status
   //not foreign or collection also not component  property name hmxxxxxxbvxxxxxxxxxxseat046status
   //not foreign or collection properties  property name hnxxxxxxbvxxxxxxxxxxname046
   //not foreign or collection also not component  property name hnxxxxxxbvxxxxxxxxxxname046
   //not foreign or collection properties  property name hoxxxxxxbvxxxxxxxxxxticket046
   //not foreign or collection also not component  property name hoxxxxxxbvxxxxxxxxxxticket046
   //not foreign or collection properties  property name hpxxxxxxbvxxxxxxxxxxpo046
   //not foreign or collection also not component  property name hpxxxxxxbvxxxxxxxxxxpo046
   //not foreign or collection properties  property name hqxxxxxxbvxxxxxxxxxxseat047status
   //not foreign or collection also not component  property name hqxxxxxxbvxxxxxxxxxxseat047status
   //not foreign or collection properties  property name hrxxxxxxbvxxxxxxxxxxname047
   //not foreign or collection also not component  property name hrxxxxxxbvxxxxxxxxxxname047
   //not foreign or collection properties  property name hsxxxxxxbvxxxxxxxxxxticket047
   //not foreign or collection also not component  property name hsxxxxxxbvxxxxxxxxxxticket047
   //not foreign or collection properties  property name htxxxxxxbvxxxxxxxxxxpo047
   //not foreign or collection also not component  property name htxxxxxxbvxxxxxxxxxxpo047
   //not foreign or collection properties  property name huxxxxxxbvxxxxxxxxxxseat048status
   //not foreign or collection also not component  property name huxxxxxxbvxxxxxxxxxxseat048status
   //not foreign or collection properties  property name hvxxxxxxbvxxxxxxxxxxname048
   //not foreign or collection also not component  property name hvxxxxxxbvxxxxxxxxxxname048
   //not foreign or collection properties  property name hwxxxxxxbvxxxxxxxxxxticket048
   //not foreign or collection also not component  property name hwxxxxxxbvxxxxxxxxxxticket048
   //not foreign or collection properties  property name hxxxxxxxbvxxxxxxxxxxpo048
   //not foreign or collection also not component  property name hxxxxxxxbvxxxxxxxxxxpo048
   //not foreign or collection properties  property name iaxxxxxxbvxxxxxxxxxxseat049status
   //not foreign or collection also not component  property name iaxxxxxxbvxxxxxxxxxxseat049status
   //not foreign or collection properties  property name ibxxxxxxbvxxxxxxxxxxname049
   //not foreign or collection also not component  property name ibxxxxxxbvxxxxxxxxxxname049
   //not foreign or collection properties  property name icxxxxxxbvxxxxxxxxxxticket049
   //not foreign or collection also not component  property name icxxxxxxbvxxxxxxxxxxticket049
   //not foreign or collection properties  property name idxxxxxxbvxxxxxxxxxxpo049
   //not foreign or collection also not component  property name idxxxxxxbvxxxxxxxxxxpo049
   //not foreign or collection properties  property name iexxxxxxbvxxxxxxxxxxseat050status
   //not foreign or collection also not component  property name iexxxxxxbvxxxxxxxxxxseat050status
   //not foreign or collection properties  property name ifxxxxxxbvxxxxxxxxxxname050
   //not foreign or collection also not component  property name ifxxxxxxbvxxxxxxxxxxname050
   //not foreign or collection properties  property name igxxxxxxbvxxxxxxxxxxticket050
   //not foreign or collection also not component  property name igxxxxxxbvxxxxxxxxxxticket050
   //not foreign or collection properties  property name ihxxxxxxbvxxxxxxxxxxpo050
   //not foreign or collection also not component  property name ihxxxxxxbvxxxxxxxxxxpo050
   //not foreign or collection properties  property name z3xxutoxlhxxxxxxxxxxowner
   //not foreign or collection also not component  property name z3xxutoxlhxxxxxxxxxxowner
   //not foreign or collection properties  property name zixxzzfxhhxxxxxxxxxxstatusfl
   //not foreign or collection also not component  property name zixxzzfxhhxxxxxxxxxxstatusfl
   //not foreign or collection properties  property name zjxxcztxlxxxxxxxxxxxstatusfldt
   //not foreign or collection also not component  property name zjxxcztxlxxxxxxxxxxxstatusfldt
   //not foreign or collection properties  property name zzxxu2oxxhxxxxxxxxxxowner2
   //not foreign or collection also not component  property name zzxxu2oxxhxxxxxxxxxxowner2



     String lorderColumn = "a2xxukstbvxxxxxxxxxxrow";
     String lorder ="a2xxukstbvxxxxxxxxxxrow asc";
     String lorderDirection = "asc";
     String orderColumnPrev = "";
     String orderDirectionPrev = "";
     int urlIndex=0;





public Fxxxuq1skxwwqqhxxxxxseatList()
{




            checkMapI[0]=Boolean.FALSE;
            checkMapI[1]=Boolean.FALSE;
            checkMapI[2]=Boolean.FALSE;
            checkMapI[3]=Boolean.FALSE;
            checkMapI[4]=Boolean.FALSE;
            checkMapI[5]=Boolean.FALSE;
            checkMapT[0]=Boolean.FALSE;
            checkMapT[1]=Boolean.FALSE;
            checkMapT[2]=Boolean.FALSE;
            checkMapT[3]=Boolean.FALSE;
            checkMapT[4]=Boolean.FALSE;
            checkMapT[5]=Boolean.FALSE;
       

        ///setEjbql(EJBQL);
        ///setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
         if(maxResultsVal == null){
          maxResultsVal=6;
         }
         setMaxResults(maxResultsVal);
        // added desc order by sid 
         // setOrderColumn does not work see override resultList    
          //setOrderColumn( "fxxxuq1skxwwqqhxxxxxseat.a2xxukstbvxxxxxxxxxxrow" );
        //a2xxukstbvxxxxxxxxxxrow
        
}

    public Fxxxuq1skxwwqqhxxxxxseat getFxxxuq1skxwwqqhxxxxxseat()
    {
        return fxxxuq1skxwwqqhxxxxxseat;
    }

    public boolean isBitSet(Integer a, Integer n){ 
     if (a == null){
      a=0;
     }
     return (a & (1 << n)) != 0; 
    }


      private String  reportName  = "deFxxxuq1skxwwqqhxxxxxseat";
      String reference="";
      private boolean markedOnes = false;
      private String  targetId = "";
      private String  displayAs  = "HTML";
      private String  sendAs  = "";
      private String  sortOrder  = "";
      private String  sortKey  = "";
      private String  fontName  = "";
      
      private Integer groupSid=0;
      private Integer[] toSelects;
      private Integer[] ccSelects;
      private List<String> toDraftSelects;
      private List<String> ccDraftSelects;
      
      private String start = "         ";
      private String group = "         ";
      private String end = "ZZZZZZZZZZZZZZZ";
      private String searchVal="";
      private String searchValJ="";
      private String searchVal2="";
      private Date searchDate=new Date(0);
      private Date searchDateD=null;
      private Integer searchStatus=null;
      private String searchType=null;

      private String  mailingAddress = "";
      private String  mailingSubject = "Enter Subject here";
      private String  useTemplate = "template_mailing.xhtml";
      private String  attachment = "If any";
      private String  mailingSource = "Enter text";
      StringBuffer sBuffer = new StringBuffer();
      private byte[] mailingBytes1 = null;
      private byte[] mailingBytes2 = null;
      private byte[] mailingBytes3 = null;
      private byte[] mailingBytes4 = null;
      private byte[] mailingBytes5 = null;
      private byte[] mailingBytes = null;
      private String mailingText = null;
      private String mailingText1 = null;
      private String mailingText2 = null;
      private String mailingText3 = null;
      private String mailingText4 = null;
      private String mailingText5 = null;
      private String mailingBytes1Type = null;
      private String mailingBytes2Type = null;
      private String mailingBytes3Type = null;
      private String mailingBytes4Type = null;
      private String mailingBytes5Type = null;
      private String mailingText1Type = null;
      private String mailingText2Type = null;
      private String mailingText3Type = null;
      private String mailingText4Type = null;
      private String mailingText5Type = null;
      private String mailingBytes1TypeMime = null;
      private String mailingBytes2TypeMime = null;
      private String mailingBytes3TypeMime = null;
      private String mailingBytes4TypeMime = null;
      private String mailingBytes5TypeMime = null;
      private String mailInfo="";
      private String mailInfoTo="";
      private String mailInfoCC="";
      private String mailInfoBCC="";
      private String mailNameInfo="";
      private String  mailingStatus = "";
      private String mailAttachInfo="";
      private Integer noMailCount=0;

      private String  signatureSource = "";
      private String  unsubscribeSource = "";
      private String  signatureImageSource = "";// doc key to blob
      private boolean signatureYN = false;
      private boolean multilingualYN = false;
      private boolean contactYN = false;
      private boolean unsubscribeYN = false;
      private boolean signatureImageYN = false;
      private boolean searchOn=false;
      private Integer firstResult;
      private Integer maxResults;
      private String orderColumn;
      private String order;
      private String orderDirection;
      private DataModel dataModel;


      Locale locale = new Locale("en", "CA","3rcomp");
	public Boolean getMarkedOnes() {
		return this.markedOnes;
	}

	public void setMarkedOnes(Boolean markedOnes) {
		this.markedOnes = markedOnes;
	}

	public String getOwner2Code() {
		return owner2Code;
	}

	public void setOwner2Code(String owner2Code) {
		this.owner2Code = owner2Code;
	}

	public Boolean getShowNamesYN() {
		return this.showNamesYN;
	}

	public void setShowNamesYN(Boolean showNamesYN) {
		this.showNamesYN = showNamesYN;
	}


	public Boolean getShowAsBCCYN() {
		return this.showAsBCCYN;
	}

	public void setShowAsBCCYN(Boolean showAsBCCYN) {
		this.showAsBCCYN = showAsBCCYN;
	}


	public String getOwnerCode() {
		return ownerCode;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerCddCode() {
		return ownerCddCode;
	}

	public void setOwnerCddCode(String ownerCddCode) {
		this.ownerCddCode = ownerCddCode;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getDisplayAs() {
		return displayAs;
	}
	public void setDisplayAs(String displayAs) {
		this.displayAs = displayAs;
	}

	public String getSendAs() {
		return sendAs;
	}

	public void setSendAs(String sendAs) {
		this.sendAs = sendAs;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}
	public String getMailingStatus() {
		return mailingStatus;
	}

	public void setMailingStatus(String mailingStatus) {
		this.mailingStatus = mailingStatus;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	public Integer getGroupSid() {
		return groupSid;
	}

	public void setGroupSid(Integer groupSid) {
		this.groupSid = groupSid;
	}
	public Integer[] getToSelects() {
		return toSelects;
	}

	public void setToSelects(Integer[] toSelects) {
		this.toSelects = toSelects;
	}

	public Integer[] getCcSelects() {
		return ccSelects;
	}

	public void setCcSelects(Integer[] ccSelects) {
		this.ccSelects = ccSelects;
	}
	public List<String> getToDraftSelects() {
		return toDraftSelects;
	}

	public void setToDraftSelects(List<String> toDraftSelects) {
		this.toDraftSelects = toDraftSelects;
	}

	public List<String> getCcDraftSelects() {
		return ccDraftSelects;
	}

	public void setCcDraftSelects(List<String> ccDraftSelects) {
		this.ccDraftSelects = ccDraftSelects;
	}


	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getSearchVal() {
		return searchVal;
	}

	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal==null?"":searchVal;
                searchValJ=searchVal;

	}

	public String getSearchValJ() {
		return searchValJ;
	}

	public Integer getSearchStatus() {
		return searchStatus;
	}

	public String getSearchVal2() {
		return searchVal2;
	}

	public void setSearchVal2(String searchVal2) {
		this.searchVal2 = searchVal2==null?"":searchVal2;
	}

	public void setSearchStatus(Integer searchStatus) {
		this.searchStatus = searchStatus;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public Date getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}
      

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}
	public String getSortKey() {
		return sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public String getMailingSubject() {
		return mailingSubject;
	}


	public void setMailingSubject(String mailingSubject) {
		this.mailingSubject = mailingSubject;
	}
        //for cc
	public String getEMailingAddress1() {
		return eMailingAddress1;
	}
     
	public void setEMailingAddress1(String eMailingAddress1) {
		this.eMailingAddress1 = eMailingAddress1;
	}

        //for bcc
	public String getEMailingAddress2() {
		return eMailingAddress2;
	}
     
	public void setEMailingAddress2(String eMailingAddress2) {
		this.eMailingAddress2 = eMailingAddress2;
	}
        //not used
	public String getEMailingAddress3() {
		return eMailingAddress3;
	}
     
	public void setEMailingAddress3(String eMailingAddress3) {
		this.eMailingAddress3 = eMailingAddress3;
	}
        //not used
	public String getEMailingAddress4() {
		return eMailingAddress4;
	}
     
	public void setEMailingAddress4(String eMailingAddress4) {
		this.eMailingAddress4 = eMailingAddress4;
	}

	public String getDataOwner2Code() {
		return dataOwner2Code;
	}

	public void setDataOwner2Code(String dataOwner2Code) {
		this.dataOwner2Code = dataOwner2Code;
	}

	public Boolean getShowSharedData() {
		return this.showSharedData;
	}

	public void setShowSharedData(Boolean showSharedData) {
		this.showSharedData = showSharedData;
	}

	public Boolean getShowResultsCount() {
		return this.showResultsCount;
	}

	public void setShowResultsCount(Boolean showResultsCount) {
		this.showResultsCount = showResultsCount;
	}
	public Integer getparamResultsCount() {
		return paramResultsCount;
	}
     
	public void setparamResultsCount(Integer paramResultsCount) {
		this.paramResultsCount = paramResultsCount;
	}
	public BigDecimal getallow3Amount() {
		return allow3Amount;
	}
     
	public void setallow3Amount(BigDecimal allow3Amount) {
		this.allow3Amount = allow3Amount;
	}

        public boolean isAllow3Ok(){
         if (this.allow3Amount.compareTo(new BigDecimal("0.0")) == 1){    
          return true; 
         }else{
          return false; 
         }
        }

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	public int getSubcategoryUi() {
		return subcategoryUi;
	}

	public void setSubcategoryUi(int subcategoryUi) {
		this.subcategoryUi = subcategoryUi;
	}

	public Boolean getShowResultsData() {
		return this.showResultsData;
	}

	public void setShowResultsData(Boolean showResultsData) {
		this.showResultsData = showResultsData;
	}
        public boolean getSkipColumns(){ 
         return skipColumns;
        }
	public void setskipColumns(boolean skipColumns) {
		this.skipColumns = skipColumns;
	}




	public String getUseTemplate() {
		return useTemplate;
	}

	public void setUseTemplate(String useTemplate) {
		this.useTemplate = useTemplate;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getMailingSource() {
		return mailingSource;
	}

	public void setMailingSource(String mailingSource) {
		this.mailingSource = mailingSource;
	}

	public String getMailInfo() {
		return mailInfo;
	}

	public void setMailInfo(String mailInfo) {
		this.mailInfo = mailInfo;
	}

	public String getMailInfoCC() {
		return mailInfoCC;
	}

	public void setMailInfoCC(String mailInfoCC) {
		this.mailInfoCC = mailInfoCC;
	}

	public String getMailInfoBCC() {
		return mailInfoBCC;
	}

	public void setMailInfoBCC(String mailInfoBCC) {
		this.mailInfoBCC = mailInfoBCC;
	}
	public String getMailInfoTo() {
		return mailInfoTo;
	}

	public void setMailInfoTo(String mailInfoTo) {
		this.mailInfoTo = mailInfoTo;
	}
	public String getMailAttachInfo() {
		return mailAttachInfo;
	}

	public void setMailAttachInfo(String mailAttachInfo) {
		this.mailAttachInfo = mailAttachInfo;
	}
	public String getMailNameInfo() {
		return mailNameInfo;
	}

	public void setMailingNameInfo(String mailNameInfo) {
		this.mailNameInfo = mailNameInfo;
	}

	public String getSelectedOwnerCode() {
		return selectedOwnerCode;
	}

	public void setSelectedOwnerCode(String selectedOwnerCode) {
		this.selectedOwnerCode = selectedOwnerCode;
	}


	public byte[] getMailingBytes() {
           
		return mailingBytes;
	}

	public void setMailingBytes(byte[] mailingBytes) {
		this.mailingBytes = mailingBytes;
	}

	public byte[] getMailingImage1() {
           
		return mailingBytes1;
	}

	public void setMailingImage1(byte[] mailingBytes) {
		this.mailingBytes1 = mailingBytes;
	}

	public byte[] getMailingImage2() {
           
		return mailingBytes2;
	}

	public void setMailingImage2(byte[] mailingBytes) {
		this.mailingBytes2 = mailingBytes;
	}
	public byte[] getMailingImage3() {
           
		return mailingBytes3;
	}

	public void setMailingImage3(byte[] mailingBytes) {
		this.mailingBytes3 = mailingBytes;
	}
	public byte[] getMailingImage4() {
           
		return mailingBytes4;
	}

	public void setMailingImage4(byte[] mailingBytes) {
		this.mailingBytes4 = mailingBytes;
	}

	public byte[] getMailingImage5() {
           
		return mailingBytes5;
	}

	public void setMailingImage5(byte[] mailingBytes) {
		this.mailingBytes5 = mailingBytes;
	}
	public String getMailingImage1Type() {
           
		return mailingBytes1Type;
	}

	public void setMailingImage1Type(String mailingType ) {
		this.mailingBytes1Type = mailingType;
	}

	public String getMailingImage2Type() {
           
		return mailingBytes2Type;
	}

	public void setMailingImage2Type(String mailingType ) {
		this.mailingBytes2Type = mailingType;
	}
	public String getMailingImage3Type() {
           
		return mailingBytes3Type;
	}

	public void setMailingImage3Type(String mailingType ) {
		this.mailingBytes3Type = mailingType;
	}

	public String getMailingImage4Type() {
           
		return mailingBytes4Type;
	}

	public void setMailingImage4Type(String mailingType ) {
		this.mailingBytes4Type = mailingType;
	}

	public String getMailingImage5Type() {
           
		return mailingBytes5Type;
	}

	public void setMailingImage5Type(String mailingType ) {
		this.mailingBytes5Type = mailingType;
	}


	public String getMailingText() {
           
		return mailingText;
	}

	public void setMailingText(String mailingText) {
		this.mailingText = mailingText;
	}

	public String getMailingText1() {
           
		return mailingText1;
	}

	public void setMailingText1(String mailingText) {
		this.mailingText1 = mailingText;
	}

	public String getMailingText2() {
           
		return mailingText2;
	}

	public void setMailingText2(String mailingText) {
		this.mailingText2 = mailingText;
	}
	public String getMailingText3() {
           
		return mailingText3;
	}

	public void setMailingText3(String mailingText) {
		this.mailingText3 = mailingText;
	}
	public String getMailingText4() {
           
		return mailingText4;
	}
	public void setMailingText4(String mailingText) {
		this.mailingText4 = mailingText;
	}



	public String getMailingText5() {
           
		return mailingText5;
	}
	public void setMailingText5(String mailingText) {
		this.mailingText5 = mailingText;
	}


	public String getMailingText1Type() {
           
		return mailingText1Type;
	}

	public void setMailingText1Type(String mailingTextType) {
		this.mailingText1Type = mailingTextType;
	}

	public String getMailingText2Type() {
           
		return mailingText2Type;
	}

	public void setMailingText2Type(String mailingTextType) {
		this.mailingText2Type = mailingTextType;
	}
	public String getMailingText3Type() {
           
		return mailingText3Type;
	}

	public void setMailingText3Type(String mailingTextType) {
		this.mailingText3Type = mailingTextType;
	}
	public String getMailingText4Type() {
           
		return mailingText4Type;
	}

	public void setMailingText4Type(String mailingTextType) {
		this.mailingText4Type = mailingTextType;
	}

	public String getMailingImage1TypeMime() {
           
		return mailingBytes1TypeMime;
	}

	public void setMailingImage1TypeMime(String mailingTypeMime ) {
		this.mailingBytes1TypeMime = mailingTypeMime;
	}

	public String getMailingImage2TypeMime() {
           
		return mailingBytes2TypeMime;
	}

	public void setMailingImage2TypeMime(String mailingTypeMime ) {
		this.mailingBytes2TypeMime = mailingTypeMime;
	}
	public String getMailingImage3TypeMime() {
           
		return mailingBytes3TypeMime;
	}

	public void setMailingImage3TypeMime(String mailingTypeMime ) {
		this.mailingBytes3TypeMime = mailingTypeMime;
	}

	public String getMailingImage4TypeMime() {
           
		return mailingBytes4TypeMime;
	}

	public void setMailingImage4TypeMime(String mailingTypeMime ) {
		this.mailingBytes4TypeMime = mailingTypeMime;
	}

	public String getMailingImage5TypeMime() {
           
		return mailingBytes5TypeMime;
	}

	public void setMailingImage5TypeMime(String mailingTypeMime ) {
		this.mailingBytes5TypeMime = mailingTypeMime;
	}



	public String getMailingAddress() {
		return mailingAddress;
	}
     
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

     public List<Fxxxuq1skxwwqqhxxxxxseat> getResultListMaxSet(Integer maxResultsVal){
      sresults=null;// reset 
      this.maxResultsVal=maxResultsVal;
      return getResultList();
     }

     public List<Fxxxuq1skxwwqqhxxxxxseat> getSystemResultListMaxSet(Integer maxResultsVal){
      this.maxResultsVal=maxResultsVal;
      return getSystemResultList();
     }

     public void setMaxResultsVal(Integer maxResultsVal){
      this.maxResultsVal=maxResultsVal;
      setMaxResults(maxResultsVal); 
    }
    
     public Integer getMaxResultsVal(){
      return maxResultsVal;
     }

     public Long getResultCount(){
     // show owner2 only not including SYSTEM, affected pagination
        
		Long count =  (Long)getEntityManager()
					.createQuery(
							"select count(cc) from Fxxxuq1skxwwqqhxxxxxseat cc where (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) ")
					.setParameter("owner2", owner2Code)
					.getSingleResult();
                return count;

     }
     public Long getSystemResultCount(){
     // show SYSTEM only not including owner2, affected pagination

		Long count =  (Long)getEntityManager()
					.createQuery(
							"select count(cc) from Fxxxuq1skxwwqqhxxxxxseat cc where (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) ")
					.setParameter("owner2", "SYSTEM")
					.getSingleResult();
                return count;

     }

     public Long getResultCountClosed(){

		Long count =  (Long)getEntityManager()
		.createQuery(
		 "select count(cc) from Fxxxuq1skxwwqqhxxxxxseat cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
		 .setParameter("owner2", owner2Code).setParameter("flag", mclosed)
		 .getSingleResult();
                return count;

     }
     public Long getResultCountReturned(){

		Long count =  (Long)getEntityManager()
		.createQuery(
		 "select count(cc) from Fxxxuq1skxwwqqhxxxxxseat cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
		 .setParameter("owner2", owner2Code).setParameter("flag", mreturn)
		 .getSingleResult();
                return count;

     }
     public Long getResultCountOrdered(){

		Long count =  (Long)getEntityManager()
		.createQuery(
		"select count(cc) from Fxxxuq1skxwwqqhxxxxxseat cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
		.setParameter("owner2", owner2Code).setParameter("flag", mordered)
		.getSingleResult();
                return count;

     }


     public Long getResultCountShipped(){

	Long count =  (Long)getEntityManager()
	.createQuery(
	"select count(cc) from Fxxxuq1skxwwqqhxxxxxseat  cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
	.setParameter("owner2", owner2Code).setParameter("flag", mshipped)
	.getSingleResult();
         return count;

     }
     public Long getResultCountInvoiced(){
       //invoiced refers to flag value 64 and may mean approved or ? or invoiced depending on the entity

	Long count =  (Long)getEntityManager()
	.createQuery(
	"select count(cc) from Fxxxuq1skxwwqqhxxxxxseat  cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
	.setParameter("owner2", owner2Code).setParameter("flag", minvoiced)
	.getSingleResult();
         return count;

     }









     public List<Fxxxuq1skxwwqqhxxxxxseat> getSystemResultList(){
      //use SYSTEM only,  allow PH to see

      // start null seems to make query return null, also null pointer to make lowercase
      if(start == null){
       start=" ";
      }
      if(end == null){
       end="zzzzz";
      }


      if( customIdentity.hasRole("VW") || customIdentity.hasRole("VQ")||customIdentity.hasRole("VH")||customIdentity.hasRole("PQ") ){
           if ( (getOrderColumn() != null && !getOrderColumn().equals(orderColumnPrev)) ||  (getOrderDirection() != null && !getOrderDirection().equals(orderDirectionPrev))   ){
            if(getOrderColumn()!=null){
             lorderColumn=getOrderColumn();
            }
            if(getOrderDirection()!=null){
            lorderDirection=getOrderDirection();
            }
            lorder="lower("+lorderColumn+") "+lorderDirection;//order case insensitive
            sresults=null;
           }
           getEntityManager().clear();// otherwise search was causing row being overwritten by search row
            //search1 ie keyfield has value
            if(this.searchDate == null){
             searchDateD=new Date(0);           
            }else{
             searchDateD=this.searchDate;
            }
            if(searchVal == null || searchVal.isEmpty() ){
             searchVal=searchValJ;// until why seachVal getting empty this logic needed           
            }

           // add logic to handle client(52),options(51),user(56) userprofl (57) etc which wont or on exception have user as owner
          // means could return empty in xxx.list       
		List<Fxxxuq1skxwwqqhxxxxxseat> results =  getEntityManager()
                                     .createQuery(
                                       "select cc from Fxxxuq1skxwwqqhxxxxxseat  cc where cc.z3xxutoxlhxxxxxxxxxxowner=:owner  and  ((zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) and (lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%'))) and (lower(a2xxukstbvxxxxxxxxxxrow) between :start and :end) ) order by "+ lorder)
                                        .setParameter("owner", ownerCode)
                                        .setParameter("owner2", "SYSTEM")
                                        .setHint("org.hibernate.readOnly","false").setParameter("searchVal", searchVal).setParameter("start", start.toLowerCase()).setParameter("end", end.toLowerCase())
                                        .setMaxResults(maxResultsVal).setFirstResult(getFirstResult()!=null?getFirstResult():0)
                                        .getResultList();
          sresults=results;
          return sresults;
      }
      else{
           if ( (getOrderColumn() != null && !getOrderColumn().equals(orderColumnPrev)) ||  (getOrderDirection() != null && !getOrderDirection().equals(orderDirectionPrev))   ){
            if(getOrderColumn()!=null){
             lorderColumn=getOrderColumn();
            }
            if(getOrderDirection()!=null){
            lorderDirection=getOrderDirection();
            }
            lorder="lower("+lorderColumn+") "+lorderDirection;
            sresults=null;
           }
 
           getEntityManager().clear();// otherwise search was causing row being overwritten by search row
            // jsf cannot handle too many rows and columns for options(51) so return 1 but allow search to pick any, client(52)which also has many rows/columns checking not needed since only one record matching owner2 is shown
            // employee(40) restrict to own record,if demo user. otherwise show all like default user(56) restrict to own record if demo user
            //search1 ie keyfield has value
            if(this.searchDate == null){
             searchDateD=new Date(0);           
            }else{
             searchDateD=this.searchDate;
            }
            //options date not needed in search, options(51) maxresults reduced from 100 to default 3 to avoid excessive parameters
             //employee add search
              //all others
                   //statusfield


                 //:: type cast operator conflicts with the JPA so use cast(:searchDate AS date) dateField zjxxcztxlxxxxxxxxxxxstatusfldt statflgdt zjxxcztxlxxxxxxxxxxxstatusfldt
		   sresults =  getEntityManager()
					.createQuery(
		   "select cc from Fxxxuq1skxwwqqhxxxxxseat  cc where ((cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 and (:searchStatus is null  or cc.zixxzzfxhhxxxxxxxxxxstatusfl = :searchStatus) ) and (lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%'))) and (cast(cc.zjxxcztxlxxxxxxxxxxxstatusfldt AS date) >= cast(:searchDate AS date)) and lower(a2xxukstbvxxxxxxxxxxrow) between :start and :end) ) order by "+ lorder)
                    .setParameter("owner2", "SYSTEM").setHint("org.hibernate.readOnly","false").setParameter("searchVal", searchVal).setParameter("searchDate", searchDateD).setParameter("start", start.toLowerCase()).setParameter("end", end.toLowerCase()).setParameter("searchStatus", searchStatus)
                    .setMaxResults(maxResultsVal).setFirstResult(getFirstResult()!=null?getFirstResult():0)
                   .getResultList();
             // all others end
            //non options end
          orderColumnPrev=lorderColumn;
          orderDirectionPrev=lorderDirection;
          if( sresults.size() == 0 && (searchVal != null && !searchVal.isEmpty()) ){
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
               FacesMessage.SEVERITY_INFO,bundle.getString("search")+" "+bundle.getString("empty"),""));

          }
          return sresults;

      }
      
     }


       /**
    * The following method overrides seam method because setOrder did not work 
    * @param args -none
    * @return List<Fxxxuq1skxwwqqhxxxxxseat>
    * @exception to be added
    * @see 
    * order by is added as part of the query 
    * order is added to sql but its value is sanitized and not entered externally
    * a0xxuobxbxxxxxxxxxxxsid is same for all entities 
    * cc where cc.clause was added here because mixing this method with seam query for search was causing cache dirty and entity
    * update issue
    * search1 refers to keyproperty, search2 refers to descript or if a property has option49 as in clobdata or customer,vendor
    * or employee if transactions like order. if more than one proprties, last match used and if no match search1 value used
    *  search3 used for item if Txn, group id if groupmembers,can we use it for price if item? if no value in search3 use search1 value
    *  except for txn like payments
    */

     public List<Fxxxuq1skxwwqqhxxxxxseat> getResultList(){
      // shopping items for visitors are not fetched here but in itembrowselist or in itemdetailbrowselist 
      // if visitor ,for any table, allow only own or owned records
      // jay resultList check whether any exception needed 
      // ?? if employee table allow only owned or owned records for "U" user
      // maxResults may be set by caller or already set as 6
      // search1 ie key property may be empty , getFirst is a method in seam superclass and sets the first record
      // use seq not key seqs for numeric ordering //jayresultList

      // start null seems to make query return null, also null pointer to make lowercase
      if(start == null){
       start=" ";
      }
      if(end == null){
       end="zzzzz";
      }


      if( customIdentity.hasRole("VW") || customIdentity.hasRole("VQ")||customIdentity.hasRole("VH")||customIdentity.hasRole("PH") ){
           //if visitors. added sort order 
           if ( (getOrderColumn() != null && !getOrderColumn().equals(orderColumnPrev)) ||  (getOrderDirection() != null && !getOrderDirection().equals(orderDirectionPrev))   ){
            if(getOrderColumn()!=null){
             lorderColumn=getOrderColumn();
            }
            if(getOrderDirection()!=null){
            lorderDirection=getOrderDirection();
            }
            lorder=lorderColumn+" "+lorderDirection;
            sresults=null;
           }
           getEntityManager().clear();// otherwise search was causing row being overwritten by search row
            //search1 ie keyfield has value
            if(this.searchDate == null){
             searchDateD=new Date(0);           
            }else{
             searchDateD=this.searchDate;
            }
            if(searchVal == null || searchVal.isEmpty() ){
             searchVal=searchValJ;// until why seachVal getting empty this logic needed           
            }
           // for visitors, added logic to handle client(52),options(51),user(56) userprofl (57) etc which wont or on exception have user as owner
          // means could return empty in xxx.list       
                                   List<Fxxxuq1skxwwqqhxxxxxseat> results =  getEntityManager()
                                    .createQuery(
                                     "select cc from Fxxxuq1skxwwqqhxxxxxseat  cc where cc.z3xxutoxlhxxxxxxxxxxowner=:owner  and ((cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) and (lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%'))) and (lower(a2xxukstbvxxxxxxxxxxrow) between :start and :end) ) order by "+ lorder)
                                      .setParameter("owner", ownerCode)
                                        .setParameter("owner2", owner2Code) 
                                        .setHint("org.hibernate.readOnly","false").setParameter("searchVal", searchVal).setParameter("start", start.toLowerCase()).setParameter("end", end.toLowerCase())
                                        .setMaxResults(maxResultsVal).setFirstResult(getFirstResult()!=null?getFirstResult():0)
                                       .getResultList();
          sresults=results;
          return sresults;
      }//backOffice users begins 
      else{
           if ( (getOrderColumn() != null && !getOrderColumn().equals(orderColumnPrev)) ||  (getOrderDirection() != null && !getOrderDirection().equals(orderDirectionPrev))   ){
            if(getOrderColumn()!=null){
             lorderColumn=getOrderColumn();
            }
            if(getOrderDirection()!=null){
            lorderDirection=getOrderDirection();
            }
            lorder=lorderColumn+" "+lorderDirection;
            sresults=null;
           }
 
           getEntityManager().clear();// otherwise search was causing row being overwritten by search row
            // jsf cannot handle too many rows and columns for options(51) so return 1 but allow search to pick any, client(52)which also has many rows/columns checking not needed since only one record matching owner2 is shown
            // employee(40) restrict to own record,if demo user. otherwise show all like default user(56) restrict to own record if demo user
            //search1 ie keyfield has value
            if(this.searchDate == null){
             searchDateD=new Date(0);           
            }else{
             searchDateD=this.searchDate;
            }
            if(searchVal == null || searchVal.isEmpty() ){
             searchVal=searchValJ;// until why seachVal getting empty this logic needed           
            }

            //for options/51, date not needed in search
             //below non options, employee, add search
              //all others
                   //statusfield


                 //:: type cast operator conflicts with the JPA so use cast(:searchDate AS date) dateField zjxxcztxlxxxxxxxxxxxstatusfldt statflgdt zjxxcztxlxxxxxxxxxxxstatusfldt
	   sresults =  getEntityManager()
	   .createQuery(
                    //these have statusfields but some needs extra search
		    "select cc from Fxxxuq1skxwwqqhxxxxxseat  cc where (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 and ((:searchStatus is null  or cc.zixxzzfxhhxxxxxxxxxxstatusfl = :searchStatus) ) and ((lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')) or lower(a2xxukstbvxxxxxxxxxxrow) like lower(concat('%',:searchVal,'%')))) and (cast(cc.zjxxcztxlxxxxxxxxxxxstatusfldt AS date) >= cast(:searchDate AS date)) and lower(a2xxukstbvxxxxxxxxxxrow) between :start and :end) ) order by "+ lorder)
                    .                     setParameter("owner2", owner2Code).setHint("org.hibernate.readOnly","false").setParameter("searchVal", searchVal).setParameter("searchDate", searchDateD).setParameter("start", start.toLowerCase()).setParameter("end", end.toLowerCase()).setParameter("searchStatus", searchStatus)
                                       .setMaxResults(maxResultsVal).setFirstResult(getFirstResult()!=null?getFirstResult():0)
                   .getResultList();
                              // all others end
            //options/nonoptions
            //non options end
          orderColumnPrev=lorderColumn;
          orderDirectionPrev=lorderDirection;
          if( sresults.size() == 0 && (searchVal != null && !searchVal.isEmpty()) ){
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_INFO,bundle.getString("search")+" "+bundle.getString("empty"),""));

          }
          return sresults;

      }
      
     }
     public boolean isNextExists(){ return getResultCount() > (getFirstResult()!=null?getFirstResult():0) + getMaxResults(); }
     public boolean isSystemNextExists(){ return getSystemResultCount() > (getFirstResult()!=null?getFirstResult():0) + getMaxResults(); }

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public String getClientEMail() {
		return clientEMail;
	}

	public void setClientEMail(String clientEMail) {
		this.clientEMail = clientEMail;
	}

	public String getEmailFirstName() {
		return eMailFirstName;
	}

	public void setEmailFirstName(String eMailFirstName) {
		this.eMailFirstName = eMailFirstName;
	}
	public String getEmailLastName() {
		return eMailLastName;
	}

	public void setEmailLastName(String eMailLastName) {
		this.eMailLastName = eMailLastName;
	}

	public String getEmailAddress() {
		return eMailAddress;
	}

	public void setEmailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}

	public String getE1mailAddress() {
		return e1mailAddress;
	}

	public void setE1mailAddress(String e1mailAddress) {
		this.e1mailAddress = e1mailAddress;
	}

     public Fxxxuq1skxwwqqhxxxxxseat getSidSToEntity(String sidS){
      return getSidToEntity(Integer.parseInt(sidS));//
     }

     public Fxxxuq1skxwwqqhxxxxxseat getSidToEntity(Integer sid){
      Fxxxuq1skxwwqqhxxxxxseat entity=null;
      List<Fxxxuq1skxwwqqhxxxxxseat> results=null;
      try{
       results = getEntityManager()
					.createQuery(
							"select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a0xxuobxbxxxxxxxxxxxsid = :nSid and zzxxu2oxxhxxxxxxxxxxowner2 = :owner2")
					.setParameter("nSid",sid)
					.setParameter("owner2", owner2Code)
					.getResultList();
      }catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("seat")+" "+bundle.getString("error")+" "+e.getMessage(), ""));
       return null;
      }
      if(results.isEmpty()){
          return null;
      }
      if(results.size() >1){
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_INFO,bundle.getString("seat")+" "+bundle.getString("multiple")+" "+bundle.getString("entries"),""));
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("first")+" "+bundle.getString("one")+" "+bundle.getString("used")+", "+bundle.getString("delete")+" "+bundle.getString("duplicates"), ""));
      }
      return results.get(0);

     } 













	public List<Fxxxuq1skxwwqqhxxxxxseat> getFlaggedAsList(int flag) {
		// will return objects matching flag 
		return getEntityManager()
				.createQuery(
						"select cc from Fxxxuq1skxwwqqhxxxxxseat cc where (cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2)")
				.setParameter("flag", flag).setParameter("owner2", owner2Code).getResultList();

	}

	public List<Fxxxuq1skxwwqqhxxxxxseat> getNotFlaggedAsList(int flag) {
		// will return objects not matching flag 

		return getEntityManager()
				.createQuery(
						"select cc from Fxxxuq1skxwwqqhxxxxxseat cc where (cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2)")
				.setParameter("flag", flag).setParameter("owner2", owner2Code).getResultList();

	}

	public List<Fxxxuq1skxwwqqhxxxxxseat> getOldByList(int days) {
	// will return objects statusfldt < today-days
        calendar.add(Calendar.DATE, -days); //xx days in past, can check further for 15 days/7 days/ expiry
        Date searchDate= calendar.getTime();

	return getEntityManager()
	 .createQuery(
	  "select cc from Fxxxuq1skxwwqqhxxxxxseat cc where (cast(cc.zjxxcztxlxxxxxxxxxxxstatusfldt AS date) < cast(:searchDate AS date AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2)")
	   .setParameter("searchDate", searchDate).setParameter("owner2", owner2Code).getResultList();

	}






         public Fxxxuq1skxwwqqhxxxxxseat getKeyToEntity(String key){
      Fxxxuq1skxwwqqhxxxxxseat entity=null;
      List<Fxxxuq1skxwwqqhxxxxxseat> results=null;
      try{
       results = getEntityManager()
	.createQuery(
	"select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a2xxukstbvxxxxxxxxxxrow = :nKeyName AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')")
	.setParameter("nKeyName",key)
	.setParameter("owner2", owner2Code)
	.getResultList();
      }catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
         FacesMessage.SEVERITY_ERROR,bundle.getString("seat")+" "+bundle.getString("error")+" "+e.getMessage(), ""));
       return null;
      }
      if(results.isEmpty()){
          return null;
      }
      if(results.size() >1){
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("seat")+" "+bundle.getString("multiple")+" "+bundle.getString("entries")+" "+bundle.getString("found"),""));
          // end user may see it,FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
          // FacesMessage.SEVERITY_ERROR,bundle.getString("first")+" "+bundle.getString("one")+" "+bundle.getString("used")+", "+bundle.getString("delete")+" "+bundle.getString("duplicates"), ""));
          customIdentity.setHoldValue3(""+results.size());//caller may examine this
      }
      return results.get(0);

    } 


     public Fxxxuq1skxwwqqhxxxxxseat getKeyContainsToEntity(String key){
      Fxxxuq1skxwwqqhxxxxxseat entity=null;
      List<Fxxxuq1skxwwqqhxxxxxseat> results=null;
      try{
       results = getEntityManager()
	.createQuery(
	"select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a2xxukstbvxxxxxxxxxxrow like :nKeyName AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')")
	.setParameter("nKeyName",key+'%')
	.setParameter("owner2", owner2Code)
	.getResultList();
      }catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
         FacesMessage.SEVERITY_ERROR,bundle.getString("seat")+" "+bundle.getString("error")+" "+e.getMessage(), ""));
       return null;
      }
      if(results.isEmpty()){
          return null;
      }
      if(results.size() >1){
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("seat")+" "+bundle.getString("multiple")+" "+bundle.getString("entries"),""));
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_ERROR,bundle.getString("first")+" "+bundle.getString("one")+" "+bundle.getString("used")+", "+bundle.getString("delete")+" "+bundle.getString("duplicates"), ""));
      }
      return results.get(0);

    } 





     //keyValue is called in dataTable and avoids having to implement eagerloading in getresultList
     // key passed is the record key ie sid and return the natural key value
     public String getKeyValue(Integer key) {
     if(key == null || key == 0){
      return null;
     }
     try{
      String value= getEntityManager().createQuery(" select a2xxukstbvxxxxxxxxxxrow from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a0xxuobxbxxxxxxxxxxxsid = :keyOfEntity  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')   order by cc.a0xxuobxbxxxxxxxxxxxsid  ")
        				.setParameter("keyOfEntity", key).setParameter("owner2", owner2Code)
					.getSingleResult().toString();

       return value;
      }
      catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("error")+" "+e.getMessage(), ""));

       return null;
      }
     }


     public String getKeyOwner2Value(Integer key) {
     if(key == null || key == 0){
      return null;
     }
     try{
      String value= getEntityManager().createQuery(" select a2xxukstbvxxxxxxxxxxrow||'/'||zzxxu2oxxhxxxxxxxxxxowner2 from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a0xxuobxbxxxxxxxxxxxsid = :keyOfEntity  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')   order by cc.a0xxuobxbxxxxxxxxxxxsid  ")
        				.setParameter("keyOfEntity", key).setParameter("owner2", owner2Code)
					.getSingleResult().toString();

       return value;
      }
      catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("error")+" "+e.getMessage(), ""));

       return null;
      }
     }
     // suggest is called when only key values are needed and should be faster
     public ArrayList<String> suggest(String input) {
      String userInput = (String) input;
      if (userInput == "*" || userInput == null ){
       //allow digits
       userInput="0";
      }
      if (userInput == "email" ){
       userInput="0";
      }
      ArrayList<String> ret = new ArrayList<String>();
 
      for (Fxxxuq1skxwwqqhxxxxxseat fxxxuq1skxwwqqhxxxxxseat : getSuggestList(userInput)) {
         ret.add(fxxxuq1skxwwqqhxxxxxseat.getA2xxukstbvxxxxxxxxxxrow());
       //}
      }
     if (!ret.isEmpty()){
     Collections.sort(ret,String.CASE_INSENSITIVE_ORDER);
     // set start/end
     start=ret.get(0);
     end=ret.get(ret.size()-1); 
     }
     return ret;
    }
     // overdrive getSuggestList if type field is present
     // not used because cannot pass hideTypePrefix needs testing, instead getSuggestList has added logic for hide
     // based on entity type
     public List<Fxxxuq1skxwwqqhxxxxxseat> getSuggestList(String prefix,String hideTypePrefix) {
     // getSuggestList is called when non key values are also needed like item key, its price etc 
     // when is keyfield blank probably never for keyAutogen
     
			return getEntityManager().createQuery(" select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a2xxukstbvxxxxxxxxxxrow >=:keyOfEntity  AND !( cc.c6xxusxrbv16xxxxxxxxtype LIKE  hideTypePrefix )  AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2   order by cc.a2xxukstbvxxxxxxxxxxrow  ")
        				.setParameter("keyOfEntity", prefix).setParameter("owner2", owner2Code)
					.getResultList();
	}
   





	public List<Fxxxuq1skxwwqqhxxxxxseat> getSystemSuggestList(String prefix) {
                if(prefix.startsWith("BI-L*")){
                //item add dont show details, only blog categories
                String owner2CodeS="SYSTEM";// test how it behaves
                 prefix="0";
                 if( customIdentity.hasRole("VW") || customIdentity.hasRole("VQ")||customIdentity.hasRole("VH")||customIdentity.hasRole("PH")){
			return getEntityManager().createQuery(" select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a2xxukstbvxxxxxxxxxxrow >=:keyOfEntity AND cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND cc.c6xxusxrbv16xxxxxxxxtype LIKE  :showTypePrefix1  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2S) AND cc.zexxutoxlhxxxxxxxxxxowner=:ownerCode order by cc.a2xxukstbvxxxxxxxxxxrow")
        				.setParameter("keyOfEntity", prefix).setParameter("flag", mclosed).setParameter("showTypePrefix1", "BI-L%").setParameter("owner2", owner2Code).setParameter("owner2S", owner2CodeS)
					.getResultList();
                 //NC will come here
                 }else{
			return getEntityManager().createQuery(" select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a2xxukstbvxxxxxxxxxxrow >=:keyOfEntity AND cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND cc.c6xxusxrbv16xxxxxxxxtype LIKE  :showTypePrefix1  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2S)   order by cc.a2xxukstbvxxxxxxxxxxrow")
        				.setParameter("keyOfEntity", prefix).setParameter("flag", mclosed).setParameter("showTypePrefix1", "BI-L%").setParameter("owner2S", owner2CodeS)
					.getResultList();
                 }
                }
                return null;

        }

     public List<Fxxxuq1skxwwqqhxxxxxseat> getSuggestList(String prefix) {
     // getSuggestList is called when whole object is needed ie non key values are also needed like item key, its price etc 
     // when is keyfield blank probably never for keyAutogen
     // getflaggesaslist also gets a list based on status field value (only one status value)
     // if item hide certain types or account show prefix 3 or A or 3
     // if item prefix "O" show if status Ordered (value 1)
     // if item prefix "I" show if status Invoiced (value 64)
     // if item prefix "IP" show if status Invoiced (value 64) and shiptype 1st ch is P ie PickUp , used by cartPOS
     // if item prefix "P" show if status Paid (value 16)
     // if item prefix "S" show if status Shipped (value 32)
     // if item,usagebyperiods etc prefix "NC" show if status not closed (value != 8)
     // added NC for txns 
     // if cob or cqb applies to quote or ordrs falls into other so like NC all not closed
     // closed entities are excluded
     // if item prefix is LT- (lab test) show only types LT- and change prefix to 0
     // for report we need prefix * to allow selecting any record ignoring flag but cntent controlled by searchStatus
     // ex orders may get closed but we may want to see data
     // if eagerLoading is to be added use select yxxxuq1r1xwwqqhxxxxxresource from Yxxxuq1r1xwwqqhxxxxxresource yxxxuq1r1xwwqqhxxxxxresource join fetch
     //   yxxxuq1r1xwwqqhxxxxxresource.yxxxuq1l1xwwqqhxxxxxresource_bundle
     // added prefix "MY" to return own emplorders for todo list
     // added prefix "LH" to return statusflupdate in last hour
     //BackOffice txn flow as follows
     // usage chart for xxedit.quoteorderexists.xhtlml for select list via suggestlist(prefix) for copy and convert
     // Order Processing 3 options
     // (1) BackOffice merchant entries for customer phone,email request or corporate purchase orders 
     // Flow >>Quote-            >>order               >> Shipment                 >>invoice               >> payment
     //          |Fn:23 pkey:cq |Fn:24 pkey:cq  |Fn:25 pkey:co              |Fn:26 pkey:co       |Fn:27 pkey:ci             |
     //          |quote to quote | quote to order | order to shipment      | order to invoice   | invoice to payment
     //          |make status 0 | make status 8 | make status 32          | make status 64   |  failed
     //          |/open after      | /closed             |/shipped                       | /invoiced             | 
     //          |copy                 | after copy         |after copy                     | after copy            |
    //           |cq/23               |cq/23                |co/24                              |co/24                    |ci/26
    //cu       |NCNINP not    |NCNINP not       |OPTNS orderd+paid    |NCNINP not          |NCI not 
    //           |closd,inv,paid |closd,inv,paid   | +terms paid +toPay+  | closd,inv,paid       |closd,inv
    //           |                         |                           | not shipped                  |                                |
    //          |Fn:33 pkey:vq |Fn:34 pkey:vq  |Fn:37 pkey:vo                |Fn:3a pkey:vo       |Fn:38 pkey:vi
    //           |vq/33               |vq/33                |vo/34                             |vo/34                     |vi/3A
    //vend   |same               |same                 |OPNS ordrd+paid         |same                       |same
    //           |                         |                           |+not shipped                 |                                |    
    //(2) cartCheckOut flow as follows-customer online entry via website or phone apps
     // Flow >>>order              >>invoice             >>picklist pick                >> Shipment                 >>> payment capture
     //                                      (payment auth)      
     //          |                         |                           |Optional Orders            |                                       |
    //           |                         |                           | PickList by Location   |                                       |
     //          |cartItem          |Checkout           | BackOffce                    |BackOffce                     | BackOffce                    |
     //          |                         |                           |Shipment for pickup or| Shipment                     | Capture payment
     //          |make status 1| keep status 1  | delivery status 2           | make po status 64     |  
     //          |/active             | /active             |/picked                            | /invoiced                    | 
     //          |                         | terms ToPay   |                                        | after copy                    | make po 16/paid
    //           |                         | and PickUp,     |co/24                              |co/24                            |ci/26
    //           |                         | Delivery                          |                                        |
    //           |                         |
    //           |                         |
    //           |                         | terms Paid      |
    //           |                         | and PickUp,     |
    //           |                         | Delivery            |
    //           |                         |Order,Invoice,
    //           |                         | Paymnt recrds|
    //           |                         | shipment not
    //           |                         |
    //           |                         |
    //cu       |NCNINP not    |NCNINP not       |OPTNS orderd+paid    |NCNINP not          |NCI not 
    //           |closd,inv,paid |closd,inv,paid   | +terms paid +toPay+  | closd,inv,paid       |closd,inv
    //           |                         |                           | not shipped                  |                                |
   //(3)cartPOS flow as follows- at store Merchant entry for in Person customer
   // Flow >>>>order              >>>invoice  
   //                                          Shipment
   //                                            Payment 
     //          |                         |                           |
    //           |                         |                           |  
     //          |cartPOS           |Checkout POS  |                    |
     //          |                         |                           |
     //          |make status 1|  status 16        |   
     //          |/active             | /paid                | 
     //          |                         |                          |
    //           |                         |                          |
    //cu       |NCNINP not    |                          | 
    //           |closd,inv,paid |                          |
    //           |                         |                          |
   //(3)cartPOS shortcut buttons at bottom
   //            |Accept Pamnt|Pay on PickUp |Pay on Deliv  |PrePaid PickUp | PrePaid Deliv | BackOffice Orders|
   //            | IP                    | COP                  | POD               |PP                       | PD                   |MY
   //(4)shipmentEdit.quotreOrderExists  Tab for cuorders
   //            |Accept Pamnt|Pay on PickUp |Pay on Deliv  |PrePaid PickUp | PrePaid Deliv | BackOffice Orders|
   //            | IP                    | COP                  | POD               |PP                       | PD                   |MY

 
                        //in send() method nomail (unsubscribed) is filtered out for group members 
                        if(prefix !=null && (prefix.isEmpty() || prefix.equals("email")) ){
                         prefix="0";
                        } 

			 return getEntityManager().createQuery(" select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a2xxukstbvxxxxxxxxxxrow >=:keyOfEntity AND cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')   order by cc.a2xxukstbvxxxxxxxxxxrow  ")
        				.setParameter("keyOfEntity", prefix).setParameter("flag", mclosed).setParameter("owner2", owner2Code)
					.getResultList();


	}
     public List<Fxxxuq1skxwwqqhxxxxxseat> getNextSids(Integer sid){
      sresults=null;// reset 
      List<Fxxxuq1skxwwqqhxxxxxseat> results=null;
		results	  =  getEntityManager()
			.createQuery("select cc from Fxxxuq1skxwwqqhxxxxxseat cc where cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 and cc.a0xxuobxbxxxxxxxxxxxsid >=:sid order by cc.a0xxuobxbxxxxxxxxxxxsid").setParameter("owner2", owner2Code).setParameter("sid", sid)
					.getResultList();
      return results;
     }
     public List<Integer> getAllSids(){
      List<Integer> results=null;
		results	  =  getEntityManager()
			.createQuery("select cc.a0xxuobxbxxxxxxxxxxxsid from Fxxxuq1skxwwqqhxxxxxseat cc where cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 order by cc.a0xxuobxbxxxxxxxxxxxsid").setParameter("owner2", owner2Code).getResultList();
      return results;
     }










	public List<String> getwwqqhxxxxxseatKeyList() {
                 // xxxxxxxxxa0xxuobxbxxxxxxxxxxxsid  java.lang.String a2xxukstbvxxxxxxxxxxrow
    
		       String enteredValue = "";
                        //order case insensitive
			return getEntityManager().createQuery("select cc.a2xxukstbvxxxxxxxxxxrow from Fxxxuq1skxwwqqhxxxxxseat cc where cc.a2xxukstbvxxxxxxxxxxrow >=:keyOfEntity   AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')  order by lower(cc.a2xxukstbvxxxxxxxxxxrow) ")
        				.setParameter("keyOfEntity", enteredValue).setParameter("owner2", owner2Code)
					.getResultList();
   


      }



     Connection conn = null;

      public void eLabel(String reference,String sendAs,String start,String end,Boolean markedOnes,String reportName) {  
         this.reference=reference;
         displayAs=sendAs;
         this.start=start;
         this.end=end;
         this.markedOnes=markedOnes;
         this.reportName="59"+reportName;
      
         this.print();
      }

      public void ePrint(String sendAs,String start,String end,Boolean markedOnes,String reportName) {  
         // allows to invoke print directly from another method, also adds the prefix to the reportname
         //displayAs=sendAs; ignore sendas param, since displayAs variable is now set before calling ePrint  
         this.start=start;
         this.end=end;
         this.markedOnes=markedOnes;
         this.reportName="ma"+reportName;
      
         this.print();
      }





      public void print() {  
           // reportname has 2 ch prefix to indicate type of reports and are stripped off later
           // 59,66= Avery label de= default dg=demographic me=metrics fi=financia sk=stock 
           // load messages from data base, now bundleName is ignored,it is hardcoded as "m"
           // jasperSoft need to pass resourcebundle and locale to subreport  via parameter
           // pass prefix based truefalse field selection values as show00nh and show00n as
           // report parameters
           ResourceBundle resourceBundle = new DatabaseResourceLoader();
                if(end == null || end.isEmpty() || end.equals("0") ){
                 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                   FacesMessage.SEVERITY_WARN,bundle.getString("no")+" "+bundle.getString("record")+" "+bundle.getString("found")+" "+bundle.getString("or")+" "+bundle.getString("end")+" "+bundle.getString("not")+" "+bundle.getString("selected"),""));
                 return;
                }

		// Set class path for compiling XML templates
		System.setProperty("jasper.reports.compile.class.path", context.getRealPath("/WEB-INF/reports/"));


		// Specify a default folder for storing 
		// compiled XML templates
		System.setProperty("jasper.reports.compile.temp", context
				.getRealPath("WEB-INF/reports/"));


		//log.info("Report Class Path ="+System.getProperty("jasper.reports.compile.class.path"));

           bcontinue=true;
           int xvi=0;
           String companyName="";
       

 	  try {
                        // Get a database connection
                        // start/end/marked ones logic not complete,supposed to be used as scope. marked not used
                        // start/end refers to incorrect value in case journal report since it refers to account list as default
                        // not journal list. may be use parameter like eprint so that calling module can decide
                        conn = getConnection();
                        //locale=localeSelector.getLocale();
                        String reportTitle = "Jay Report";
                        String recordMarkedOnly = "";
                        parameters.put("DisplayAs", displayAs);
                        parameters.put("reference", reference);
                        // if serialnumber report invoked from item then start needs to be independent of item value
                        if(reportName.contains("serialnumbers")){
                         start="000000";
                         end="zzzzzz";
                        } 
			parameters.put("Start", start);
			parameters.put("End", end);
			parameters.put("MarkedOnes", markedOnes);
			parameters.put("TargetId", targetId);
			parameters.put("SortKey", sortKey);
			parameters.put("SortOrder", sortOrder);
			parameters.put("Status", searchStatus);
                        reportNamePrefix=reportName.substring(0,2);
                        reportNameMinusPrefix=reportName.substring(2);
			parameters.put("ReportName", reportNameMinusPrefix);
                        // 6.17 deprecated parameters.put(JRParameter.REPORT_FILE_RESOLVER, new SimpleFileResolver(new File(context.getRealPath("/WEB-INF/reports/"))));
                        //depecated fileResolver replaced by net.sf.jasperreports.repo.RepositoryService
                        parameters.put(JRParameter.REPORT_LOCALE, locale);
                        parameters.put("owner2Code", owner2Code);
                        parameters.put(JRParameter.REPORT_RESOURCE_BUNDLE, resourceBundle);
                        parameters.put("CompanyName", companyName); 
                        context = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext(); 
                      /*  already set at bean construct
                        HttpServletRequest req = (HttpServletRequest) externalContext.getRequest(); 
                        int hostPort=0;
                        hostUrl="";
                        if(req.getServerPort()==8080){
                         hostUrl=req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort(); 
                        }else{
                         hostUrl=req.getScheme()+"://"+req.getServerName(); 
                        }  
                      */
                        parameters.put("subreportPath", context.getRealPath("/WEB-INF/reports/"));

                        parameters.put("reqUrl",hostUrl );//gets abc.com:port
	  } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
              FacesMessage.SEVERITY_WARN,bundle.getString("database")+" "+bundle.getString("connect")+" "+bundle.getString("error")+" "+e.getMessage(),""));

                return;
	  }
     // truefalse table can be used for reports to indicate a field should be printed or not. The field is passed
     // as $P{show00nh as name and show00n as value} Note it starts with sid as show001 and
     // sorted by full property name axxxxx, yxxx not column name sid,matcode etc
     // If enttry exists in truefalse then load from there using loadTruefalses() or create a new entry here 
     //
     // in createInstance of truefalse, instance property show00x has default values as true, so we need 
     // to set to false to hide. Example prefix dg will hide numeric fields 
     // de default dg demographics me quantity  a1 ad hoc 1 a2 ad hoc 2 a3 ad hoc 3 fi financial used by transactions
     // Once entry exists, user can alter it to customixe. TBD add option to reset to default? 


          try{
                if (!reportNamePrefix.equals("fi")){
                 //following for parameter label not value true/false for non fi reports ie non Txn
		            parameters.put("show001h", "#{messages[Sid]}");
		            parameters.put("show002h", "#{messages[Row]}");
		            parameters.put("show003h", "#{messages[Rowlabel]}");
		            parameters.put("show004h", "#{messages[Seat001status]}");
		            parameters.put("show005h", "#{messages[Name001]}");
		            parameters.put("show006h", "#{messages[Ticket001]}");
		            parameters.put("show007h", "#{messages[Po001]}");
		            parameters.put("show008h", "#{messages[Seat002status]}");
		            parameters.put("show009h", "#{messages[Name002]}");
		            parameters.put("show010h", "#{messages[Ticket002]}");
		            parameters.put("show011h", "#{messages[Po002]}");
		            parameters.put("show012h", "#{messages[Seat003status]}");
		            parameters.put("show013h", "#{messages[Name003]}");
		            parameters.put("show014h", "#{messages[Ticket003]}");
		            parameters.put("show015h", "#{messages[Po003]}");
		            parameters.put("show016h", "#{messages[Seat004status]}");
		            parameters.put("show017h", "#{messages[Name004]}");
		            parameters.put("show018h", "#{messages[Ticket004]}");
		            parameters.put("show019h", "#{messages[Po004]}");
		            parameters.put("show020h", "#{messages[Seat005status]}");
		            parameters.put("show021h", "#{messages[Name005]}");
		            parameters.put("show022h", "#{messages[Ticket005]}");
		            parameters.put("show023h", "#{messages[Po005]}");
		            parameters.put("show024h", "#{messages[Seat006status]}");
		            parameters.put("show025h", "#{messages[Name006]}");
		            parameters.put("show026h", "#{messages[Ticket006]}");
		            parameters.put("show027h", "#{messages[Po006]}");
		            parameters.put("show028h", "#{messages[Seat007status]}");
		            parameters.put("show029h", "#{messages[Name007]}");
		            parameters.put("show030h", "#{messages[Ticket007]}");
		            parameters.put("show031h", "#{messages[Po007]}");
		            parameters.put("show032h", "#{messages[Seat008status]}");
		            parameters.put("show033h", "#{messages[Name008]}");
		            parameters.put("show034h", "#{messages[Ticket008]}");
		            parameters.put("show035h", "#{messages[Po008]}");
		            parameters.put("show036h", "#{messages[Seat009status]}");
		            parameters.put("show037h", "#{messages[Name009]}");
		            parameters.put("show038h", "#{messages[Ticket009]}");
		            parameters.put("show039h", "#{messages[Po009]}");
		            parameters.put("show040h", "#{messages[Seat010status]}");
		            parameters.put("show041h", "#{messages[Name010]}");
		            parameters.put("show042h", "#{messages[Ticket010]}");
		            parameters.put("show043h", "#{messages[Po010]}");
		            parameters.put("show044h", "#{messages[Seat011status]}");
		            parameters.put("show045h", "#{messages[Name011]}");
		            parameters.put("show046h", "#{messages[Ticket011]}");
		            parameters.put("show047h", "#{messages[Po011]}");
		            parameters.put("show048h", "#{messages[Seat012status]}");
		            parameters.put("show049h", "#{messages[Name012]}");
		            parameters.put("show050h", "#{messages[Ticket012]}");
		            parameters.put("show051h", "#{messages[Po012]}");
		            parameters.put("show052h", "#{messages[Seat013status]}");
		            parameters.put("show053h", "#{messages[Name013]}");
		            parameters.put("show054h", "#{messages[Ticket013]}");
		            parameters.put("show055h", "#{messages[Po013]}");
		            parameters.put("show056h", "#{messages[Seat014status]}");
		            parameters.put("show057h", "#{messages[Name014]}");
		            parameters.put("show058h", "#{messages[Ticket014]}");
		            parameters.put("show059h", "#{messages[Po014]}");
		            parameters.put("show060h", "#{messages[Seat015status]}");
		            parameters.put("show061h", "#{messages[Name015]}");
		            parameters.put("show062h", "#{messages[Ticket015]}");
		            parameters.put("show063h", "#{messages[Po015]}");
		            parameters.put("show064h", "#{messages[Seat016status]}");
		            parameters.put("show065h", "#{messages[Name016]}");
		            parameters.put("show066h", "#{messages[Ticket016]}");
		            parameters.put("show067h", "#{messages[Po016]}");
		            parameters.put("show068h", "#{messages[Seat017status]}");
		            parameters.put("show069h", "#{messages[Name017]}");
		            parameters.put("show070h", "#{messages[Ticket017]}");
		            parameters.put("show071h", "#{messages[Po017]}");
		            parameters.put("show072h", "#{messages[Seat018status]}");
		            parameters.put("show073h", "#{messages[Name018]}");
		            parameters.put("show074h", "#{messages[Ticket018]}");
		            parameters.put("show075h", "#{messages[Po018]}");
		            parameters.put("show076h", "#{messages[Seat019status]}");
		            parameters.put("show077h", "#{messages[Name019]}");
		            parameters.put("show078h", "#{messages[Ticket019]}");
		            parameters.put("show079h", "#{messages[Po019]}");
		            parameters.put("show080h", "#{messages[Seat020status]}");
		            parameters.put("show081h", "#{messages[Name020]}");
		            parameters.put("show082h", "#{messages[Ticket020]}");
		            parameters.put("show083h", "#{messages[Po020]}");
		            parameters.put("show084h", "#{messages[Seat021status]}");
		            parameters.put("show085h", "#{messages[Name021]}");
		            parameters.put("show086h", "#{messages[Ticket021]}");
		            parameters.put("show087h", "#{messages[Po021]}");
		            parameters.put("show088h", "#{messages[Seat022status]}");
		            parameters.put("show089h", "#{messages[Name022]}");
		            parameters.put("show090h", "#{messages[Ticket022]}");
		            parameters.put("show091h", "#{messages[Po022]}");
		            parameters.put("show092h", "#{messages[Seat023status]}");
		            parameters.put("show093h", "#{messages[Name023]}");
		            parameters.put("show094h", "#{messages[Ticket023]}");
		            parameters.put("show095h", "#{messages[Po023]}");
		            parameters.put("show096h", "#{messages[Seat024status]}");
		            parameters.put("show097h", "#{messages[Name024]}");
		            parameters.put("show098h", "#{messages[Ticket024]}");
		            parameters.put("show099h", "#{messages[Po024]}");
		            parameters.put("show100h", "#{messages[Seat025status]}");
		            parameters.put("show101h", "#{messages[Name025]}");
		            parameters.put("show102h", "#{messages[Ticket025]}");
		            parameters.put("show103h", "#{messages[Po025]}");
		            parameters.put("show104h", "#{messages[Seat026status]}");
		            parameters.put("show105h", "#{messages[Name026]}");
		            parameters.put("show106h", "#{messages[Ticket026]}");
		            parameters.put("show107h", "#{messages[Po026]}");
		            parameters.put("show108h", "#{messages[Seat027status]}");
		            parameters.put("show109h", "#{messages[Name027]}");
		            parameters.put("show110h", "#{messages[Ticket027]}");
		            parameters.put("show111h", "#{messages[Po027]}");
		            parameters.put("show112h", "#{messages[Seat028status]}");
		            parameters.put("show113h", "#{messages[Name028]}");
		            parameters.put("show114h", "#{messages[Ticket028]}");
		            parameters.put("show115h", "#{messages[Po028]}");
		            parameters.put("show116h", "#{messages[Seat029status]}");
		            parameters.put("show117h", "#{messages[Name029]}");
		            parameters.put("show118h", "#{messages[Ticket029]}");
		            parameters.put("show119h", "#{messages[Po029]}");
		            parameters.put("show120h", "#{messages[Seat030status]}");
		            parameters.put("show121h", "#{messages[Name030]}");
		            parameters.put("show122h", "#{messages[Ticket030]}");
		            parameters.put("show123h", "#{messages[Po030]}");
		            parameters.put("show124h", "#{messages[Seat031status]}");
		            parameters.put("show125h", "#{messages[Name031]}");
		            parameters.put("show126h", "#{messages[Ticket031]}");
		            parameters.put("show127h", "#{messages[Po031]}");
		            parameters.put("show128h", "#{messages[Seat032status]}");
		            parameters.put("show129h", "#{messages[Name032]}");
		            parameters.put("show130h", "#{messages[Ticket032]}");
		            parameters.put("show131h", "#{messages[Po032]}");
		            parameters.put("show132h", "#{messages[Seat033status]}");
		            parameters.put("show133h", "#{messages[Name033]}");
		            parameters.put("show134h", "#{messages[Ticket033]}");
		            parameters.put("show135h", "#{messages[Po033]}");
		            parameters.put("show136h", "#{messages[Seat034status]}");
		            parameters.put("show137h", "#{messages[Name034]}");
		            parameters.put("show138h", "#{messages[Ticket034]}");
		            parameters.put("show139h", "#{messages[Po034]}");
		            parameters.put("show140h", "#{messages[Seat035status]}");
		            parameters.put("show141h", "#{messages[Name035]}");
		            parameters.put("show142h", "#{messages[Ticket035]}");
		            parameters.put("show143h", "#{messages[Po035]}");
		            parameters.put("show144h", "#{messages[Seat036status]}");
		            parameters.put("show145h", "#{messages[Name036]}");
		            parameters.put("show146h", "#{messages[Ticket036]}");
		            parameters.put("show147h", "#{messages[location]}");
		            parameters.put("show148h", "#{messages[Po036]}");
		            parameters.put("show149h", "#{messages[Seat037status]}");
		            parameters.put("show150h", "#{messages[Name037]}");
		            parameters.put("show151h", "#{messages[Ticket037]}");
		            parameters.put("show152h", "#{messages[Po037]}");
		            parameters.put("show153h", "#{messages[Seat038status]}");
		            parameters.put("show154h", "#{messages[Name038]}");
		            parameters.put("show155h", "#{messages[Ticket038]}");
		            parameters.put("show156h", "#{messages[Po038]}");
		            parameters.put("show157h", "#{messages[Seat039status]}");
		            parameters.put("show158h", "#{messages[Name039]}");
		            parameters.put("show159h", "#{messages[Ticket039]}");
		            parameters.put("show160h", "#{messages[Po039]}");
		            parameters.put("show161h", "#{messages[Seat040status]}");
		            parameters.put("show162h", "#{messages[Name040]}");
		            parameters.put("show163h", "#{messages[Ticket040]}");
		            parameters.put("show164h", "#{messages[Po040]}");
		            parameters.put("show165h", "#{messages[Seat041status]}");
		            parameters.put("show166h", "#{messages[Name041]}");
		            parameters.put("show167h", "#{messages[Ticket041]}");
		            parameters.put("show168h", "#{messages[Po041]}");
		            parameters.put("show169h", "#{messages[Seat042status]}");
		            parameters.put("show170h", "#{messages[Name042]}");
		            parameters.put("show171h", "#{messages[Ticket042]}");
		            parameters.put("show172h", "#{messages[Po042]}");
		            parameters.put("show173h", "#{messages[Seat043status]}");
		            parameters.put("show174h", "#{messages[Name043]}");
		            parameters.put("show175h", "#{messages[Ticket043]}");
		            parameters.put("show176h", "#{messages[Po043]}");
		            parameters.put("show177h", "#{messages[Seat044status]}");
		            parameters.put("show178h", "#{messages[Name044]}");
		            parameters.put("show179h", "#{messages[Ticket044]}");
		            parameters.put("show180h", "#{messages[Po044]}");
		            parameters.put("show181h", "#{messages[Seat045status]}");
		            parameters.put("show182h", "#{messages[Name045]}");
		            parameters.put("show183h", "#{messages[Ticket045]}");
		            parameters.put("show184h", "#{messages[Po045]}");
		            parameters.put("show185h", "#{messages[Seat046status]}");
		            parameters.put("show186h", "#{messages[Name046]}");
		            parameters.put("show187h", "#{messages[Ticket046]}");
		            parameters.put("show188h", "#{messages[Po046]}");
		            parameters.put("show189h", "#{messages[Seat047status]}");
		            parameters.put("show190h", "#{messages[Name047]}");
		            parameters.put("show191h", "#{messages[Ticket047]}");
		            parameters.put("show192h", "#{messages[Po047]}");
		            parameters.put("show193h", "#{messages[Seat048status]}");
		            parameters.put("show194h", "#{messages[Name048]}");
		            parameters.put("show195h", "#{messages[Ticket048]}");
		            parameters.put("show196h", "#{messages[Po048]}");
		            parameters.put("show197h", "#{messages[Seat049status]}");
		            parameters.put("show198h", "#{messages[Name049]}");
		            parameters.put("show199h", "#{messages[Ticket049]}");
		            parameters.put("show200h", "#{messages[Po049]}");
		            parameters.put("show201h", "#{messages[Seat050status]}");
		            parameters.put("show202h", "#{messages[Name050]}");
		            parameters.put("show203h", "#{messages[Ticket050]}");
		            parameters.put("show204h", "#{messages[Po050]}");
		            parameters.put("show205h", "#{messages[Owner]}");
		            parameters.put("show206h", "#{messages[Statusfl]}");
		            parameters.put("show207h", "#{messages[Statusfldt]}");
		            parameters.put("show208h", "#{messages[Owner2]}");
                 // done with labels, now load corresponding values from truefalses db or if new create 
                 loadTruefalses(); //sets bcontinue
                 // if found bcontinue is true and  report parameters shownnn are already set from db
                 // if not found then create db entry and then load default values for report prefix type
                 // and then persist truefalse
                 // and call loadTruefalses() again 
                 if (!bcontinue){//not found
                    yxxxch5a1xhhxxhxxxxxtruefalseHome.clearInstance();
                    yxxxch5a1xhhxxhxxxxxtruefalse=yxxxch5a1xhhxxhxxxxxtruefalseHome.getInstance();
                    yxxxch5a1xhhxxhxxxxxtruefalse.setA0xxukrdbvxxxxxxxxxxtablename("seat");
                    yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxuxxxbvxxxxxxxxxxqualifier(reportNamePrefix);
                  //default
                 if(reportNamePrefix.equals("de")){ 
                   //yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow001(false);//hide sid 
                 }
                 //demographic
                 if (reportNamePrefix.equals("dg")){
                  // yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow001(false); table never had sid
                  // by default showxxx are true but .ftl gen time for "me" it will put false if not type decimal
                  // but at report side it will always include some key values
                 }
                 if (reportNamePrefix.equals("me")){
                 // show001 etc refers to decimal items not the original seq, start false from show003
                 //show002 is qty
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow001(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow002(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow003(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow004(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow005(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow006(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow007(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow008(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow009(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow010(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow011(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow012(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow013(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow014(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow015(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow016(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow017(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow018(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow019(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow020(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow021(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow022(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow023(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow024(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow025(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow026(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow027(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow028(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow029(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow030(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow031(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow032(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow033(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow034(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow035(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow036(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow037(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow038(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow039(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow040(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow041(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow042(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow043(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow044(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow045(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow046(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow047(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow048(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow049(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow050(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow051(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow052(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow053(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow054(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow055(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow056(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow057(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow058(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow059(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow060(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow061(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow062(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow063(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow064(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow065(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow066(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow067(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow068(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow069(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow070(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow071(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow072(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow073(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow074(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow075(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow076(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow077(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow078(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow079(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow080(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow081(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow082(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow083(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow084(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow085(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow086(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow087(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow088(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow089(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow090(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow091(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow092(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow093(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow094(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow095(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow096(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow097(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow098(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow099(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow100(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow101(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow102(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow103(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow104(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow105(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow106(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow107(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow108(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow109(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow110(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow111(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow112(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow113(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow114(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow115(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow116(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow117(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow118(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow119(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow120(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow121(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow122(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow123(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow124(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow125(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow126(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow127(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow128(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow129(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow130(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow131(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow132(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow133(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow134(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow135(false);
                        yxxxch5a1xhhxxhxxxxxtruefalse.setA1xxyxxxbvxxxxxxxxxxshow136(false);
                 }
                 //any other prefix like adhock etc
                 if (reportNamePrefix.equals("a1") || reportNamePrefix.equals("a2")){
                 }
                 if (customIdentity.isDebug()){
                  FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                   FacesMessage.SEVERITY_WARN,bundle.getString("Report")+" "+bundle.getString("prefix")+" "+reportNamePrefix+" "+bundle.getString("setting")+" "+bundle.getString("saved"),""));
                 }
                  yxxxch5a1xhhxxhxxxxxtruefalseHome.clearInstance();           
                  yxxxch5a1xhhxxhxxxxxtruefalseHome.setInstance(yxxxch5a1xhhxxhxxxxxtruefalse);           
                  yxxxch5a1xhhxxhxxxxxtruefalseHome.persist();
                  loadTruefalses(); //load from persisted one
                 }//bcontinue
                }
                parameters.put("show001", false);//hide sid from reports
                if (bcontinue){
                 //log.info("Report file resolver Path ="
                 //+ context.getRealPath("/WEB-INF/reports/"));
                 //upgraded to jasper Report 6.17.0
                        SimpleJasperReportsContext context = new SimpleJasperReportsContext();
                        //not sure where the following can be useful,seems like getCompiledReport can be replaced
                        //FileRepositoryService fileRepository = new FileRepositoryService(context, "/WEB-INF/reports", false);
                        //context.setExtensions(RepositoryService.class, Collections.singletonList(fileRepository));
                        //context.setExtensions(PersistenceServiceFactory.class, Collections.singletonList(FileRepositoryPersistenceServiceFactory.getInstance()));
                       JasperReport jasperReport = getCompiledReport(reportNameMinusPrefix);
                        //after changing from request scope to viewscope has to get current faces context
                        // and a new resp since jsf already has a resp with state as writer, wont allow outputstream 
                        // in same resp  
                        facesContext = FacesContext.getCurrentInstance(); 
                        if(facesContext !=null){
                         externalContext = facesContext.getExternalContext(); 
                         resp = (HttpServletResponse) externalContext.getResponse(); 
                        }
                        int noOfColumns = 10;           
                        if (displayAs.toUpperCase().indexOf("HTML") >= 0) {
                          JasperPrint jasperPrint = JasperFillManager.getInstance(context).fill(
                          jasperReport, parameters,conn);
                         //JasperPrint jasperPrint = JasperFillManager.fillReport(
                         //jasperReport, parameters, conn);
                         noOfColumns = 5;//does it make smaller width?
                         jasperPrint.setPageWidth(noOfColumns * 108);
                          generateHtmlOutput(jasperPrint, req, resp);
                        }
                       else {
                          if(displayAs.toUpperCase().indexOf("PDF") >= 0){
                                JasperPrint jasperPrint = JasperFillManager.getInstance(context).fill(
                                                jasperReport, parameters,conn);
                                jasperPrint.setPageWidth(noOfColumns * 108);
                                generatePDFOutput(resp, parameters, jasperReport);
                          }
                          else {
                           if(displayAs.toUpperCase().indexOf("EXCEL") >= 0){
                                JasperPrint jasperPrint = JasperFillManager.getInstance(context).fill(
                                                jasperReport, parameters,conn);
                                jasperPrint.setPageWidth(noOfColumns * 108);
				generateEXCELOutput(jasperPrint, req, resp);
                           }
                           //wont come further here for HTML or PDF, but can be used if logic differs in future
                           else {
                            if(displayAs.toUpperCase().indexOf("EMAILPDF") >= 0){
                                JasperPrint jasperPrint = JasperFillManager.getInstance(context).fill(
                                                jasperReport, parameters,conn);
                                jasperPrint.setPageWidth(noOfColumns * 108);
		             mailingBytes = null;
		             mailingBytes = JasperRunManager.runReportToPdf(jasperReport, parameters,conn);
                            }else{
                             //handle shoppingCard print which comes as SEMAIL or PEMAIL
                             // displayAs becomes EMAIL before coming here 
                             if(displayAs.toUpperCase().indexOf("EMAIL") >= 0){
                                JasperPrint jasperPrint = JasperFillManager.getInstance(context).fill(
                                jasperReport, parameters,conn);
                                noOfColumns = 5;//does it make smaller width?
                                jasperPrint.setPageWidth(noOfColumns * 108);
				generateHtmlOutput(jasperPrint, req, resp);
                             // end of email

                            }
                            else {
                             // Assume it is  CSV report but make it harder if customer data to stop stealing
                             setDisplayAs("CSV");
                                if(ownerCode.contains("manager")){
                                JasperPrint jasperPrint = JasperFillManager.getInstance(context).fill(
                                                jasperReport, parameters,conn);
                                 jasperPrint.setPageWidth(noOfColumns * 108);
                                 generateCSVOutput(jasperPrint, req, resp);
                                }else{
                                  FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                   FacesMessage.SEVERITY_WARN,bundle.getString("only")+" "+bundle.getString("manager")+" "+bundle.getString("is")+" "+bundle.getString("allowed")+" "+bundle.getString("to")+" "+bundle.getString("run")+" "+bundle.getString("csv")+" "+bundle.getString("report"),""));
                                } 
                           }//emailhtml
                          }//emailpdf
                         }//excel
                        }//pdf
                       }//html                           
                }//bcontinue                                         
              } catch (Exception e) {
                 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                  FacesMessage.SEVERITY_WARN,bundle.getString("seat")+" "+bundle.getString("report")+" "+bundle.getString("generate")+" "+bundle.getString("failed")+" "+e.getMessage(),""));
                 bcontinue=false;// 
              } finally {
                if (conn != null) {
                  try {
                         conn.close();
                        log.info("Jasper Report Connection closed by pgm ");
	} catch (SQLException sqle) {
                  // Ignore
                 }
               }
             }
           }



    /**
    * The following method loads values from truefalse table to show or hide fields in report
    * called by print() which will initialize the table if bcontinue is set false here 
    * @return void but bcontinue set to false if error
    * @exception no select result or select failed. 
    * @see 
    *  since entiyProperty names skip sid, table entries index 1 holds say matcode, AddressCode etc not sid
    * Report showcolumn001 expects sid but it does not exist in db, so skip it and start from 002 <-001 
    */ 

      public void loadTruefalses() {  
                Yxxxch5a1xhhxxhxxxxxtruefalse truefalses =null;
                bcontinue=true;
                try {
                 List<Yxxxch5a1xhhxxhxxxxxtruefalse> results =  getEntityManager()
                  .createQuery(
                   "select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where   cc.a0xxukrdbvxxxxxxxxxxtablename=:tableName  and cc.a1xxuxxxbvxxxxxxxxxxqualifier=:qualifier and cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2")
                      .setParameter("tableName", "seat")
                      .setParameter("qualifier", reportNamePrefix)
                      .setParameter("owner2", owner2Code)
                      .getResultList();
                           if(!results.isEmpty()){
                            truefalses = results.get(0);
                           }
                           else{
                            if (customIdentity.isDebug()){
                             FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_WARN,bundle.getString("report")+" "+bundle.getString("columns")+", "+bundle.getString("selections")+" "+ bundle.getString("not")+" "+ bundle.getString("done"),""));
                             FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_INFO,bundle.getString("continuing")+" "+ bundle.getString("with")+" "+ bundle.getString("defaults"),""));
                            }
                            bcontinue=false;
                           } 

               } catch (NoResultException ex) {
                            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_WARN,bundle.getString("report")+" "+bundle.getString("columns")+", "+bundle.getString("selections")+" "+ bundle.getString("not")+" "+ bundle.getString("done"),""));

                            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_INFO,bundle.getString("continuing")+" "+ bundle.getString("with")+" "+ bundle.getString("defaults"),""));
                            bcontinue=false;
             }

               if (bcontinue){
                 //report fields starting with sid we skip it below and send show002......
                 //columns 001 has key ... no sid . 2 <-1, 3 <-2
			    parameters.put("show002", truefalses.getA1xxyxxxbvxxxxxxxxxxshow001());
			    parameters.put("show003", truefalses.getA1xxyxxxbvxxxxxxxxxxshow002());
			    parameters.put("show004", truefalses.getA1xxyxxxbvxxxxxxxxxxshow003());
			    parameters.put("show005", truefalses.getA1xxyxxxbvxxxxxxxxxxshow004());
			    parameters.put("show006", truefalses.getA1xxyxxxbvxxxxxxxxxxshow005());
			    parameters.put("show007", truefalses.getA1xxyxxxbvxxxxxxxxxxshow006());
			    parameters.put("show008", truefalses.getA1xxyxxxbvxxxxxxxxxxshow007());
			    parameters.put("show009", truefalses.getA1xxyxxxbvxxxxxxxxxxshow008());
			    parameters.put("show010", truefalses.getA1xxyxxxbvxxxxxxxxxxshow009());
			    parameters.put("show011", truefalses.getA1xxyxxxbvxxxxxxxxxxshow010());
			    parameters.put("show012", truefalses.getA1xxyxxxbvxxxxxxxxxxshow011());
			    parameters.put("show013", truefalses.getA1xxyxxxbvxxxxxxxxxxshow012());
			    parameters.put("show014", truefalses.getA1xxyxxxbvxxxxxxxxxxshow013());
			    parameters.put("show015", truefalses.getA1xxyxxxbvxxxxxxxxxxshow014());
			    parameters.put("show016", truefalses.getA1xxyxxxbvxxxxxxxxxxshow015());
			    parameters.put("show017", truefalses.getA1xxyxxxbvxxxxxxxxxxshow016());
			    parameters.put("show018", truefalses.getA1xxyxxxbvxxxxxxxxxxshow017());
			    parameters.put("show019", truefalses.getA1xxyxxxbvxxxxxxxxxxshow018());
			    parameters.put("show020", truefalses.getA1xxyxxxbvxxxxxxxxxxshow019());
			    parameters.put("show021", truefalses.getA1xxyxxxbvxxxxxxxxxxshow020());
			    parameters.put("show022", truefalses.getA1xxyxxxbvxxxxxxxxxxshow021());
			    parameters.put("show023", truefalses.getA1xxyxxxbvxxxxxxxxxxshow022());
			    parameters.put("show024", truefalses.getA1xxyxxxbvxxxxxxxxxxshow023());
			    parameters.put("show025", truefalses.getA1xxyxxxbvxxxxxxxxxxshow024());
			    parameters.put("show026", truefalses.getA1xxyxxxbvxxxxxxxxxxshow025());
			    parameters.put("show027", truefalses.getA1xxyxxxbvxxxxxxxxxxshow026());
			    parameters.put("show028", truefalses.getA1xxyxxxbvxxxxxxxxxxshow027());
			    parameters.put("show029", truefalses.getA1xxyxxxbvxxxxxxxxxxshow028());
			    parameters.put("show030", truefalses.getA1xxyxxxbvxxxxxxxxxxshow029());
			    parameters.put("show031", truefalses.getA1xxyxxxbvxxxxxxxxxxshow030());
			    parameters.put("show032", truefalses.getA1xxyxxxbvxxxxxxxxxxshow031());
			    parameters.put("show033", truefalses.getA1xxyxxxbvxxxxxxxxxxshow032());
			    parameters.put("show034", truefalses.getA1xxyxxxbvxxxxxxxxxxshow033());
			    parameters.put("show035", truefalses.getA1xxyxxxbvxxxxxxxxxxshow034());
			    parameters.put("show036", truefalses.getA1xxyxxxbvxxxxxxxxxxshow035());
			    parameters.put("show037", truefalses.getA1xxyxxxbvxxxxxxxxxxshow036());
			    parameters.put("show038", truefalses.getA1xxyxxxbvxxxxxxxxxxshow037());
			    parameters.put("show039", truefalses.getA1xxyxxxbvxxxxxxxxxxshow038());
			    parameters.put("show040", truefalses.getA1xxyxxxbvxxxxxxxxxxshow039());
			    parameters.put("show041", truefalses.getA1xxyxxxbvxxxxxxxxxxshow040());
			    parameters.put("show042", truefalses.getA1xxyxxxbvxxxxxxxxxxshow041());
			    parameters.put("show043", truefalses.getA1xxyxxxbvxxxxxxxxxxshow042());
			    parameters.put("show044", truefalses.getA1xxyxxxbvxxxxxxxxxxshow043());
			    parameters.put("show045", truefalses.getA1xxyxxxbvxxxxxxxxxxshow044());
			    parameters.put("show046", truefalses.getA1xxyxxxbvxxxxxxxxxxshow045());
			    parameters.put("show047", truefalses.getA1xxyxxxbvxxxxxxxxxxshow046());
			    parameters.put("show048", truefalses.getA1xxyxxxbvxxxxxxxxxxshow047());
			    parameters.put("show049", truefalses.getA1xxyxxxbvxxxxxxxxxxshow048());
			    parameters.put("show050", truefalses.getA1xxyxxxbvxxxxxxxxxxshow049());
			    parameters.put("show051", truefalses.getA1xxyxxxbvxxxxxxxxxxshow050());
			    parameters.put("show052", truefalses.getA1xxyxxxbvxxxxxxxxxxshow051());
			    parameters.put("show053", truefalses.getA1xxyxxxbvxxxxxxxxxxshow052());
			    parameters.put("show054", truefalses.getA1xxyxxxbvxxxxxxxxxxshow053());
			    parameters.put("show055", truefalses.getA1xxyxxxbvxxxxxxxxxxshow054());
			    parameters.put("show056", truefalses.getA1xxyxxxbvxxxxxxxxxxshow055());
			    parameters.put("show057", truefalses.getA1xxyxxxbvxxxxxxxxxxshow056());
			    parameters.put("show058", truefalses.getA1xxyxxxbvxxxxxxxxxxshow057());
			    parameters.put("show059", truefalses.getA1xxyxxxbvxxxxxxxxxxshow058());
			    parameters.put("show060", truefalses.getA1xxyxxxbvxxxxxxxxxxshow059());
			    parameters.put("show061", truefalses.getA1xxyxxxbvxxxxxxxxxxshow060());
			    parameters.put("show062", truefalses.getA1xxyxxxbvxxxxxxxxxxshow061());
			    parameters.put("show063", truefalses.getA1xxyxxxbvxxxxxxxxxxshow062());
			    parameters.put("show064", truefalses.getA1xxyxxxbvxxxxxxxxxxshow063());
			    parameters.put("show065", truefalses.getA1xxyxxxbvxxxxxxxxxxshow064());
			    parameters.put("show066", truefalses.getA1xxyxxxbvxxxxxxxxxxshow065());
			    parameters.put("show067", truefalses.getA1xxyxxxbvxxxxxxxxxxshow066());
			    parameters.put("show068", truefalses.getA1xxyxxxbvxxxxxxxxxxshow067());
			    parameters.put("show069", truefalses.getA1xxyxxxbvxxxxxxxxxxshow068());
			    parameters.put("show070", truefalses.getA1xxyxxxbvxxxxxxxxxxshow069());
			    parameters.put("show071", truefalses.getA1xxyxxxbvxxxxxxxxxxshow070());
			    parameters.put("show072", truefalses.getA1xxyxxxbvxxxxxxxxxxshow071());
			    parameters.put("show073", truefalses.getA1xxyxxxbvxxxxxxxxxxshow072());
			    parameters.put("show074", truefalses.getA1xxyxxxbvxxxxxxxxxxshow073());
			    parameters.put("show075", truefalses.getA1xxyxxxbvxxxxxxxxxxshow074());
			    parameters.put("show076", truefalses.getA1xxyxxxbvxxxxxxxxxxshow075());
			    parameters.put("show077", truefalses.getA1xxyxxxbvxxxxxxxxxxshow076());
			    parameters.put("show078", truefalses.getA1xxyxxxbvxxxxxxxxxxshow077());
			    parameters.put("show079", truefalses.getA1xxyxxxbvxxxxxxxxxxshow078());
			    parameters.put("show080", truefalses.getA1xxyxxxbvxxxxxxxxxxshow079());
			    parameters.put("show081", truefalses.getA1xxyxxxbvxxxxxxxxxxshow080());
			    parameters.put("show082", truefalses.getA1xxyxxxbvxxxxxxxxxxshow081());
			    parameters.put("show083", truefalses.getA1xxyxxxbvxxxxxxxxxxshow082());
			    parameters.put("show084", truefalses.getA1xxyxxxbvxxxxxxxxxxshow083());
			    parameters.put("show085", truefalses.getA1xxyxxxbvxxxxxxxxxxshow084());
			    parameters.put("show086", truefalses.getA1xxyxxxbvxxxxxxxxxxshow085());
			    parameters.put("show087", truefalses.getA1xxyxxxbvxxxxxxxxxxshow086());
			    parameters.put("show088", truefalses.getA1xxyxxxbvxxxxxxxxxxshow087());
			    parameters.put("show089", truefalses.getA1xxyxxxbvxxxxxxxxxxshow088());
			    parameters.put("show090", truefalses.getA1xxyxxxbvxxxxxxxxxxshow089());
			    parameters.put("show091", truefalses.getA1xxyxxxbvxxxxxxxxxxshow090());
			    parameters.put("show092", truefalses.getA1xxyxxxbvxxxxxxxxxxshow091());
			    parameters.put("show093", truefalses.getA1xxyxxxbvxxxxxxxxxxshow092());
			    parameters.put("show094", truefalses.getA1xxyxxxbvxxxxxxxxxxshow093());
			    parameters.put("show095", truefalses.getA1xxyxxxbvxxxxxxxxxxshow094());
			    parameters.put("show096", truefalses.getA1xxyxxxbvxxxxxxxxxxshow095());
			    parameters.put("show097", truefalses.getA1xxyxxxbvxxxxxxxxxxshow096());
			    parameters.put("show098", truefalses.getA1xxyxxxbvxxxxxxxxxxshow097());
			    parameters.put("show099", truefalses.getA1xxyxxxbvxxxxxxxxxxshow098());
			    parameters.put("show100", truefalses.getA1xxyxxxbvxxxxxxxxxxshow099());
			    parameters.put("show101", truefalses.getA1xxyxxxbvxxxxxxxxxxshow100());
			    parameters.put("show102", truefalses.getA1xxyxxxbvxxxxxxxxxxshow101());
			    parameters.put("show103", truefalses.getA1xxyxxxbvxxxxxxxxxxshow102());
			    parameters.put("show104", truefalses.getA1xxyxxxbvxxxxxxxxxxshow103());
			    parameters.put("show105", truefalses.getA1xxyxxxbvxxxxxxxxxxshow104());
			    parameters.put("show106", truefalses.getA1xxyxxxbvxxxxxxxxxxshow105());
			    parameters.put("show107", truefalses.getA1xxyxxxbvxxxxxxxxxxshow106());
			    parameters.put("show108", truefalses.getA1xxyxxxbvxxxxxxxxxxshow107());
			    parameters.put("show109", truefalses.getA1xxyxxxbvxxxxxxxxxxshow108());
			    parameters.put("show110", truefalses.getA1xxyxxxbvxxxxxxxxxxshow109());
			    parameters.put("show111", truefalses.getA1xxyxxxbvxxxxxxxxxxshow110());
			    parameters.put("show112", truefalses.getA1xxyxxxbvxxxxxxxxxxshow111());
			    parameters.put("show113", truefalses.getA1xxyxxxbvxxxxxxxxxxshow112());
			    parameters.put("show114", truefalses.getA1xxyxxxbvxxxxxxxxxxshow113());
			    parameters.put("show115", truefalses.getA1xxyxxxbvxxxxxxxxxxshow114());
			    parameters.put("show116", truefalses.getA1xxyxxxbvxxxxxxxxxxshow115());
			    parameters.put("show117", truefalses.getA1xxyxxxbvxxxxxxxxxxshow116());
			    parameters.put("show118", truefalses.getA1xxyxxxbvxxxxxxxxxxshow117());
			    parameters.put("show119", truefalses.getA1xxyxxxbvxxxxxxxxxxshow118());
			    parameters.put("show120", truefalses.getA1xxyxxxbvxxxxxxxxxxshow119());
			    parameters.put("show121", truefalses.getA1xxyxxxbvxxxxxxxxxxshow120());
			    parameters.put("show122", truefalses.getA1xxyxxxbvxxxxxxxxxxshow121());
			    parameters.put("show123", truefalses.getA1xxyxxxbvxxxxxxxxxxshow122());
			    parameters.put("show124", truefalses.getA1xxyxxxbvxxxxxxxxxxshow123());
			    parameters.put("show125", truefalses.getA1xxyxxxbvxxxxxxxxxxshow124());
			    parameters.put("show126", truefalses.getA1xxyxxxbvxxxxxxxxxxshow125());
			    parameters.put("show127", truefalses.getA1xxyxxxbvxxxxxxxxxxshow126());
			    parameters.put("show128", truefalses.getA1xxyxxxbvxxxxxxxxxxshow127());
			    parameters.put("show129", truefalses.getA1xxyxxxbvxxxxxxxxxxshow128());
			    parameters.put("show130", truefalses.getA1xxyxxxbvxxxxxxxxxxshow129());
			    parameters.put("show131", truefalses.getA1xxyxxxbvxxxxxxxxxxshow130());
			    parameters.put("show132", truefalses.getA1xxyxxxbvxxxxxxxxxxshow131());
			    parameters.put("show133", truefalses.getA1xxyxxxbvxxxxxxxxxxshow132());
			    parameters.put("show134", truefalses.getA1xxyxxxbvxxxxxxxxxxshow133());
			    parameters.put("show135", truefalses.getA1xxyxxxbvxxxxxxxxxxshow134());
			    parameters.put("show136", truefalses.getA1xxyxxxbvxxxxxxxxxxshow135());
			    parameters.put("show137", truefalses.getA1xxyxxxbvxxxxxxxxxxshow136());
			    parameters.put("show138", truefalses.getA1xxyxxxbvxxxxxxxxxxshow137());
			    parameters.put("show139", truefalses.getA1xxyxxxbvxxxxxxxxxxshow138());
			    parameters.put("show140", truefalses.getA1xxyxxxbvxxxxxxxxxxshow139());
			    parameters.put("show141", truefalses.getA1xxyxxxbvxxxxxxxxxxshow140());
			    parameters.put("show142", truefalses.getA1xxyxxxbvxxxxxxxxxxshow141());
			    parameters.put("show143", truefalses.getA1xxyxxxbvxxxxxxxxxxshow142());
			    parameters.put("show144", truefalses.getA1xxyxxxbvxxxxxxxxxxshow143());
			    parameters.put("show145", truefalses.getA1xxyxxxbvxxxxxxxxxxshow144());
			    parameters.put("show146", truefalses.getA1xxyxxxbvxxxxxxxxxxshow145());
			    parameters.put("show147", truefalses.getA1xxyxxxbvxxxxxxxxxxshow146());
			    parameters.put("show148", truefalses.getA1xxyxxxbvxxxxxxxxxxshow147());
			    parameters.put("show149", truefalses.getA1xxyxxxbvxxxxxxxxxxshow148());
			    parameters.put("show150", truefalses.getA1xxyxxxbvxxxxxxxxxxshow149());
			    parameters.put("show151", truefalses.getA1xxyxxxbvxxxxxxxxxxshow150());
			    parameters.put("show152", truefalses.getA1xxyxxxbvxxxxxxxxxxshow151());
			    parameters.put("show153", truefalses.getA1xxyxxxbvxxxxxxxxxxshow152());
			    parameters.put("show154", truefalses.getA1xxyxxxbvxxxxxxxxxxshow153());
			    parameters.put("show155", truefalses.getA1xxyxxxbvxxxxxxxxxxshow154());
			    parameters.put("show156", truefalses.getA1xxyxxxbvxxxxxxxxxxshow155());
			    parameters.put("show157", truefalses.getA1xxyxxxbvxxxxxxxxxxshow156());
			    parameters.put("show158", truefalses.getA1xxyxxxbvxxxxxxxxxxshow157());
			    parameters.put("show159", truefalses.getA1xxyxxxbvxxxxxxxxxxshow158());
			    parameters.put("show160", truefalses.getA1xxyxxxbvxxxxxxxxxxshow159());
			    parameters.put("show161", truefalses.getA1xxyxxxbvxxxxxxxxxxshow160());
			    parameters.put("show162", truefalses.getA1xxyxxxbvxxxxxxxxxxshow161());
			    parameters.put("show163", truefalses.getA1xxyxxxbvxxxxxxxxxxshow162());
			    parameters.put("show164", truefalses.getA1xxyxxxbvxxxxxxxxxxshow163());
			    parameters.put("show165", truefalses.getA1xxyxxxbvxxxxxxxxxxshow164());
			    parameters.put("show166", truefalses.getA1xxyxxxbvxxxxxxxxxxshow165());
			    parameters.put("show167", truefalses.getA1xxyxxxbvxxxxxxxxxxshow166());
			    parameters.put("show168", truefalses.getA1xxyxxxbvxxxxxxxxxxshow167());
			    parameters.put("show169", truefalses.getA1xxyxxxbvxxxxxxxxxxshow168());
			    parameters.put("show170", truefalses.getA1xxyxxxbvxxxxxxxxxxshow169());
			    parameters.put("show171", truefalses.getA1xxyxxxbvxxxxxxxxxxshow170());
			    parameters.put("show172", truefalses.getA1xxyxxxbvxxxxxxxxxxshow171());
			    parameters.put("show173", truefalses.getA1xxyxxxbvxxxxxxxxxxshow172());
			    parameters.put("show174", truefalses.getA1xxyxxxbvxxxxxxxxxxshow173());
			    parameters.put("show175", truefalses.getA1xxyxxxbvxxxxxxxxxxshow174());
			    parameters.put("show176", truefalses.getA1xxyxxxbvxxxxxxxxxxshow175());
			    parameters.put("show177", truefalses.getA1xxyxxxbvxxxxxxxxxxshow176());
			    parameters.put("show178", truefalses.getA1xxyxxxbvxxxxxxxxxxshow177());
			    parameters.put("show179", truefalses.getA1xxyxxxbvxxxxxxxxxxshow178());
			    parameters.put("show180", truefalses.getA1xxyxxxbvxxxxxxxxxxshow179());
			    parameters.put("show181", truefalses.getA1xxyxxxbvxxxxxxxxxxshow180());
			    parameters.put("show182", truefalses.getA1xxyxxxbvxxxxxxxxxxshow181());
			    parameters.put("show183", truefalses.getA1xxyxxxbvxxxxxxxxxxshow182());
			    parameters.put("show184", truefalses.getA1xxyxxxbvxxxxxxxxxxshow183());
			    parameters.put("show185", truefalses.getA1xxyxxxbvxxxxxxxxxxshow184());
			    parameters.put("show186", truefalses.getA1xxyxxxbvxxxxxxxxxxshow185());
			    parameters.put("show187", truefalses.getA1xxyxxxbvxxxxxxxxxxshow186());
			    parameters.put("show188", truefalses.getA1xxyxxxbvxxxxxxxxxxshow187());
			    parameters.put("show189", truefalses.getA1xxyxxxbvxxxxxxxxxxshow188());
			    parameters.put("show190", truefalses.getA1xxyxxxbvxxxxxxxxxxshow189());
			    parameters.put("show191", truefalses.getA1xxyxxxbvxxxxxxxxxxshow190());
			    parameters.put("show192", truefalses.getA1xxyxxxbvxxxxxxxxxxshow191());
			    parameters.put("show193", truefalses.getA1xxyxxxbvxxxxxxxxxxshow192());
			    parameters.put("show194", truefalses.getA1xxyxxxbvxxxxxxxxxxshow193());
			    parameters.put("show195", truefalses.getA1xxyxxxbvxxxxxxxxxxshow194());
			    parameters.put("show196", truefalses.getA1xxyxxxbvxxxxxxxxxxshow195());
			    parameters.put("show197", truefalses.getA1xxyxxxbvxxxxxxxxxxshow196());
			    parameters.put("show198", truefalses.getA1xxyxxxbvxxxxxxxxxxshow197());
			    parameters.put("show199", truefalses.getA1xxyxxxbvxxxxxxxxxxshow198());
			    parameters.put("show200", truefalses.getA1xxyxxxbvxxxxxxxxxxshow199());
			    parameters.put("show201", truefalses.getA1xxyxxxbvxxxxxxxxxxshow200());
			    parameters.put("show202", truefalses.getA1xxyxxxbvxxxxxxxxxxshow201());
			    parameters.put("show203", truefalses.getA1xxyxxxbvxxxxxxxxxxshow202());
			    parameters.put("show204", truefalses.getA1xxyxxxbvxxxxxxxxxxshow203());
			    parameters.put("show205", truefalses.getA1xxyxxxbvxxxxxxxxxxshow204());
			    parameters.put("show206", truefalses.getA1xxyxxxbvxxxxxxxxxxshow205());
			    parameters.put("show207", truefalses.getA1xxyxxxbvxxxxxxxxxxshow206());
			    parameters.put("show208", truefalses.getA1xxyxxxbvxxxxxxxxxxshow207());
			    parameters.put("show209", truefalses.getA1xxyxxxbvxxxxxxxxxxshow208());
                //
                parameters.put("show001", false);

               }
      }

	private void generateHtmlOutput(JasperPrint jasperPrint,
			HttpServletRequest req, HttpServletResponse resp)
			throws IOException, JRException {

		HtmlExporter exporter = new HtmlExporter();
                Map imagesData = new HashMap();//
		req.getSession().setAttribute(ImageServlet.DEFAULT_JASPER_PRINT_SESSION_ATTRIBUTE, jasperPrint);
		resp.setContentType("text/html");
		exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                //request to send html report via email can come from backoffice or from self serve shopping cart
                // SEMAIL (order) or PEMAIL (invoice)
                //unlike report view via browser which gets it fron server, images need to be part of the email 
                //one can also put image url pf say logo in the mailing source ie just before jasper report
                //for now if barcode use pdf as attachment to email
                if(displayAs.toUpperCase().indexOf("EMAILHTML") >= 0 ||
                    displayAs.toUpperCase().indexOf("EMAIL") >= 0){
 		 exporter.setParameter(JRExporterParameter.OUTPUT_STRING_BUFFER, sBuffer);//
                 //exporter.setParameter(HtmlExporterParameter.IMAGES_URI, "cid:");//try this for logo
                 //exporter.setParameter(HtmlExporterParameter.IMAGES_MAP, imagesData);
                }else{
		 exporter.setParameter(JRExporterParameter.OUTPUT_WRITER, resp.getWriter());
  		 //exporter.setParameter(HtmlExporterParameter.IMAGES_URI,"servlets/image?image=");
                }
                //exporter.setParameter(HtmlExporterParameter.IS_USING_IMAGES_TO_ALIGN, Boolean.FALSE);

		exporter.setParameter(JRDocxExporterParameter.FRAMES_AS_NESTED_TABLES, "false");

		exporter.exportReport();
	}

	private void generatePDFOutput(HttpServletResponse resp, Map parameters,
			JasperReport jasperReport) throws JRException, NamingException,
			SQLException, IOException {

		byte[] bytes = null;

		bytes = JasperRunManager.runReportToPdf(jasperReport, parameters,
				conn);

		resp.setContentType("application/pdf");
		resp.setContentLength(bytes.length);
		ServletOutputStream ouputStream = resp.getOutputStream();
		ouputStream.write(bytes, 0, bytes.length);
		ouputStream.flush();
		ouputStream.close();
                facesContext.responseComplete();

	}
        private void generateEXCELOutput(JasperPrint jasperPrint,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, JRException {

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.addHeader("Content-disposition", "attachment; filename="+reportNameMinusPrefix+".xlsx");
        ServletOutputStream servletOutputStream=response.getOutputStream();
        JRXlsxExporter docxExporter=new JRXlsxExporter();
        docxExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        docxExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, servletOutputStream);
        docxExporter.exportReport();
       }

      private void generateCSVOutput(JasperPrint jasperPrint,
        HttpServletRequest request, HttpServletResponse response)
        throws IOException, JRException {
        response.setContentType("text/csv");
        response.addHeader("Content-disposition", "attachment; filename="+reportNameMinusPrefix+".csv");
        ServletOutputStream servletOutputStream=response.getOutputStream();
       JRCsvExporter docxExporter=new JRCsvExporter();
       docxExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
       docxExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, servletOutputStream);
       docxExporter.exportReport();
      }



	private DataSource getDataSource() throws NamingException {
                   if (ds == null) {
                   Context ctx = new InitialContext();
                     if(tomeeYN){//
                      ds = (DataSource) ctx.lookup("java:openejb/Resource/RaaspiSQLDS");  
                     }else{
                      ds = (DataSource) ctx.lookup("RaaspiSQLDS");   
                     }
                    }
                   return ds;
	}

	private Connection getConnection() throws SQLException, NamingException {
		return getDataSource().getConnection();
	}

	private JasperReport getCompiledReport(String fileName) throws JRException {

		File reportFile = new File(context.getRealPath(
				"/WEB-INF/reports/" + fileName + ".jasper"));

		// If compiled file is not found, then
		// compile XML template
		if (!reportFile.exists()) {
			File reportDesignFile = new File(context.getRealPath(
					"/WEB-INF/reports/" + fileName + ".jrxml"));
			
			JasperCompileManager.compileReportToFile(reportDesignFile.getPath());
		}
                try{

		 JasperReport jasperReport = (JasperReport) JRLoader
				.loadObjectFromFile(reportFile.getPath());
 		 return jasperReport;

                }catch(Exception e){
                 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("error")+" "+e.getMessage(), ""));
		      log.severe("report error cause "+e.getCause());

                return null;
                } 

	}

protected String getCountEjbql()
    {
        String ejbql = getRenderedEjbql();
        Matcher fromMatcher = FROM_PATTERN.matcher(ejbql);
        if(!fromMatcher.find())
        {
            throw new IllegalArgumentException("no from clause found in query");
        } else
        {
            int fromLoc = fromMatcher.start(2);
            Matcher orderMatcher = ORDER_PATTERN.matcher(ejbql);
            int orderLoc = orderMatcher.find() ? orderMatcher.start(1) : ejbql.length();
            Matcher whereMatcher = WHERE_PATTERN.matcher(ejbql);
            int whereLoc = whereMatcher.find() ? whereMatcher.start(1) : orderLoc;
            String subject = "*";
            return (new StringBuilder(ejbql.length() + 15)).append("select count(").append(subject).append(") ").append(ejbql.substring(fromLoc, whereLoc).replace("join fetch", "join")).append(ejbql.substring(whereLoc, orderLoc)).toString().trim();
        }

    }
      public Void emailRender(String content,String flag) throws MessagingException, IOException{
         /// called by send() and previewSend or from cart/txn esend to send txn and regular emails
         /// for flag e we can use variable mailingAddress to override toAddress,name and client email as cc (add as an option via client flag)
         /// for flag x we dont override, x-smtpi header has the email addresses and client email gets a copy as a real toAddress
         ///  default can stay, its better to overide with clientEmail , also ebasketin will override it, icalsend uses mailingAddress(??)  
         /// templates will replace subject and body only
         /// header("X-SMTPAPI",headers) for m:header name="X-SMTPAPI" value="#{fxxxuq1skxwwqqhxxxxxseatList.headers}" 
         /// headers xml string of all to: addresses
         //@see home emailRender to send admin type emails
         String fromName = this.owner2Code;//site name
         String fromAddress = "support@3rcomputer.com";//do not override this other than xx@3rcomputer.com to avoid spam or phising warning
         // mail relay is done using @3rcomputer.com mail service, so fromAddress should match domain name
         //esend() already put value in clientEMail
         //fromAddress=clientEMail;
         if(!mailRelayOff){
          fromAddress="via@3rcomputer.com";
         }else{
          fromAddress=getClientEMail();//useremployee/client email
         }
         String replyToName = "No Reply";
         String replyToAddress = "no-reply@3rcomputer.com";
         // stack forum says replyTo can be diff from from domain name, so use logon id user email , can create a user with no-reply email
         // for replyTo try using clientEMail which is employee email or client email sept05 check for empty
         replyToName= " ";
         if(!clientEMail.isEmpty()){
          replyToAddress=clientEMail;
         }
         String toName = " ";
         String toAddress = "support@3rcomputer.com";
 
         String ccName = "ratna";
         String ccAddress = ""; 

         String htmlBody = "<html><body><b>Hello</b> World!</body></html>";
         String textBody = "This is a Text Body!";

         String ENVELOPE_FROM_ADDRESS = "support@3rcomputer.com";

         //SessionConfig mailConfig = TestMailConfigs.standardConfig();
         String messageId = "jay@3rcomputer.com";
         String host="smtp.sendgrid.net";
         int port=587;//465 is used for ssl only, which is replaced by tls. 587 is used by both tls and non ssl
         String userName="apikey";
         String password="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";
         boolean auth=true;
         String auth_mechanisms="LOGIN PLAIN DIGEST-MD5 NTLM";
         //gmail use XOAUTH2 , if null auth will use id/password, if XOAUTH2 then email as id/access token 
         // as password. if client version 07 record has value in id (refresh token) and in secret(access token) 
         // then set XOAUTH2 so that java mail will use OAUTH. client version 01 will still hold id/pw for
         // non gmail send like sendgrid or hostpapa or zoho smtp send
         boolean ssl=false;// ssl is outdated and not supported here, disable AVG to test locally
         boolean tls=false;// in case of zoho antivirus like AVG blocks request, works ok in openshift
         mailRelayOff=false;
         Boolean smtpError=false;
         try {
          //Yxxxch522xhhxxhxxxxxclient client=yxxxch522xhhxxhxxxxxclientList.getKeyToEntity("01"); needs inject
          Yxxxch522xhhxxhxxxxxclient client =(Yxxxch522xhhxxhxxxxxclient) entityManager
					.createQuery(
							"select cc from Yxxxch522xhhxxhxxxxxclient cc where cc.a0xxukxxbvxxxxxxxxxxclientversion = :nKeyName and cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2")
					.setParameter("nKeyName","01")
					.setParameter("owner2", owner2Code)
					.getSingleResult();

          if (client == null) {
                       FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("create") +" "+bundle.getString("site") +" "+bundle.getString("first"),""));

                       return null ;
                      }
                      if(client.getP1xxfxxxbvxxxxxxxxxxconfirm()!=null ){
                        mailRelayOff=client.getP1xxfxxxbvxxxxxxxxxxconfirm();
                      }else{//null means default is mailrelay
                        mailRelayOff=false;
                      }
                      if(!mailRelayOff){
                       //sendgrid host,userName, password already set as default
                       //jay add logic to use version 08 client record to avoid hard coding and any mail relay
                      }else{
                       if(client.getZ8xxuxxxbvxxxxxxxxxxsmtpserver()!=null && !client.getZ8xxuxxxbvxxxxxxxxxxsmtpserver().isEmpty()){
                        host=client.getZ8xxuxxxbvxxxxxxxxxxsmtpserver();
                       }else{
                         smtpError=true;
                         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                           FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("host")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
                       }
                       if(client.getZ9xxuxxxbvxxxxxxxxxxsmtpuser()!=null && !client.getZ9xxuxxxbvxxxxxxxxxxsmtpuser().isEmpty()){
                        userName=client.getZ9xxuxxxbvxxxxxxxxxxsmtpuser();
                       }else{
                         smtpError=true;
                         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                           FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("userName")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
                       }
                       if(client.getZaxxuxxxssxxxxxxxxxxsmtppass()!=null && !client.getZaxxuxxxssxxxxxxxxxxsmtppass().isEmpty()){
                        password=client.getZaxxuxxxssxxxxxxxxxxsmtppass();
                       }else{
                         //smtpError=true; check record 07 then act
                         //FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                           //FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("password")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
                       }
                       if(client.getL6xxzxxrbvxxxxxxxxxxaltselen()!=null && client.getL6xxzxxrbvxxxxxxxxxxaltselen() !=0){
                        port=client.getL6xxzxxrbvxxxxxxxxxxaltselen();
                       }else{
                         smtpError=true;
                         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                           FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("port")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
                       }
                       if(client.getO9xxfxxxbvxxxxxxxxxxbeepsou()!=null ){
                        auth=client.getO9xxfxxxbvxxxxxxxxxxbeepsou();
                       }else{
                         smtpError=true;
                         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                           FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("auth")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
                       }
                       if(client.getP2xxfxxxbvxxxxxxxxxxlinefeed()!=null ){
                        tls=client.getP2xxfxxxbvxxxxxxxxxxlinefeed();
                       }else{
                         smtpError=true;
                         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                           FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("ssl")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
                       }
                       if(smtpError){
                        bcontinue=false;
                        return null;
                       } 
          }
         } catch (Exception exc) {
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
             FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
            bcontinue=false;
            return null; 
         }
         // raaspi and lraaspi record 07 holds gmail Oauth app id/secret not refresh/access 
         Yxxxch522xhhxxhxxxxxclient client = null;
         if(owner2Code.contains(masterSiteCode) || owner2Code.contains("l++masterSiteCode")
           || !mailRelayOff ){
          //skip checking record 07, will not use gmail OAuth. It will use record 01 set up
         }else{
          // check Gmail smtp or not. Note client record below points to version 07 not 01
          //Yxxxch522xhhxxhxxxxxclient client=yxxxch522xhhxxhxxxxxclientList.getKeyToEntity("07");
         try {
          client =(Yxxxch522xhhxxhxxxxxclient) entityManager
					.createQuery(
							"select cc from Yxxxch522xhhxxhxxxxxclient cc where cc.a0xxukxxbvxxxxxxxxxxclientversion = :nKeyName and cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2")
					.setParameter("nKeyName","07")
					.setParameter("owner2", owner2Code)
					.getSingleResult();
          if(client !=null && client.getDaxxuzxdssxxxxxxxxxxapiclientid() !=null && !client.getDaxxuzxdssxxxxxxxxxxapiclientid().isEmpty()
              && client.getDbxxuzxdssxxxxxxxxxxapiclientsecret() !=null && !client.getDbxxuzxdssxxxxxxxxxxapiclientsecret().isEmpty()){
           auth_mechanisms="XOAUTH2";//gmail smtp
           password=client.getDbxxuzxdssxxxxxxxxxxapiclientsecret();//access token
           //check if token expired and refresh if needed
           calendar.getTime();
           calendare.setTime(client.getZfxxcztxlxxxxxxxxxxxstatusfldt());
           calendare.add(Calendar.MINUTE, 59);
           if(calendare.before(calendar)){
            password=r3RestClient.getAccessTokenGMail(client.getDaxxuzxdssxxxxxxxxxxapiclientid(),"refresh_token",owner2Code );
           }      
           if(password == null || password.isEmpty()){
            smtpError=true; //both record 01 and 07 checked
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_INFO,bundle.getString("GMail") +" "+bundle.getString("smtp")+" "+bundle.getString("password")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
            return null;
           }
          }else{
           //access token may fail, check for it in mail send 
           // if needed use restclient to request new access but avoid user permission by using refresh token
           // in restclient use scope offline (user not needed) to get refresh token
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_ERROR,host+" "+bundle.getString("client")+" "+bundle.getString("record") +" "+bundle.getString("version")+" "+bundle.getString("07") +" "+bundle.getString("needs")+" "+bundle.getString("both") +" "+bundle.getString("id")+" "+bundle.getString("and") +" "+bundle.getString("secret"),""));
            return null;
          }
         } catch (Exception exc) {
           //ignore no record 07 normal occurrence, can use resultList 
         }
         if(password == null || password.isEmpty()){// will come here only if record 01 pw missing
          smtpError=true; //both record 01 and 07 checked
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
          FacesMessage.SEVERITY_INFO,bundle.getString("client") +" "+bundle.getString("smtp")+" "+bundle.getString("password")+" "+bundle.getString("information") +" "+bundle.getString("missing"),""));
          return null;
         }
         }//common  for both Raaspi or other sites, raaspi cannot use gmail smtp

         String smtpDomain="";
         urlIndex=host.indexOf(".");
         if (urlIndex != -1){
          smtpDomain=host.substring(urlIndex+1);
         }
         if(smtpDomain.isEmpty()){
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_ERROR,host+" "+bundle.getString("smtp")+" "+bundle.getString("domain") +" "+bundle.getString("empty"),""));
           return null;
         }
         // in case of mailRelay fromAddress matches smtp server 3rcomputer, sendgrid is not smtp server
         if(mailRelayOff && !fromAddress.contains(smtpDomain)){
          /* that's how non cpanel emails work ie use relay but spf/dkim seems to work ok
          if(fromAddress.contains("doNotReply@")){
           fromAddress="doNotReply@"+smtpDomain;
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
              FacesMessage.SEVERITY_INFO, bundle.getString("select cc from")+" "+bundle.getString("email")+" "+bundle.getString("address")+" "+bundle.getString("defaulting")+" "+bundle.getString("to")+" "+fromAddress+", "+bundle.getString("ensure")+" "+bundle.getString("it")+" "+bundle.getString("exists"),""));
          }else{
               FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                   FacesMessage.SEVERITY_WARN,bundle.getString("select cc from_address") +" "+fromAddress+", "+bundle.getString("domain") +" "+bundle.getString("not")+" "+bundle.getString("matching")+" "+bundle.getString("smtp")+" "+bundle.getString("server")+" "+bundle.getString("domain")+" "+smtpDomain,""));
               FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                   FacesMessage.SEVERITY_WARN,bundle.getString("sent") +" "+bundle.getString("emails")+" "+bundle.getString("may")+" "+bundle.getString("get")+" "+bundle.getString("rejected")+" "+bundle.getString("by")+" "+bundle.getString("email")+" "+bundle.getString("clients"),""));
               FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                   FacesMessage.SEVERITY_WARN,bundle.getString("Sender") +" "+bundle.getString("email")+" "+bundle.getString("address")+" "+bundle.getString("should")+" "+bundle.getString("be")+" "+bundle.getString("changed")+" "+bundle.getString("to")+" "+bundle.getString("avoid")+" "+bundle.getString("warning"),""));
          }
          */
         }

         
         SessionConfig mailConfig = TestMailConfigs.standardConfig(host,port,userName,password,auth,tls,auth_mechanisms);
 

         EmailMessage e;

         String uuid = java.util.UUID.randomUUID().toString();
         String subjectTemplate = "Text Message from 4.0.0 Mail - " + uuid;
         String version = "simple-mail";
         String subject = "Text Message from " + version + " Mail - " + uuid;
         String useTemplate="seatMailingContent.fmt";
         toName = this.eMailFirstName+" "+this.eMailLastName;
         //this needs to be a valid format but not used. headers have real to:list
         toAddress = "support@3rcomputer.com";
         subjectTemplate=this.mailingSubject;
         boolean anyAtt=false;
         MailMessage mm =null;
         // ios email client needs attachment suffix to match actual mime type, cannot hardcode pdf or just .txt 
         //for attacments display 3R-ATTACHMENT-1-C qualifier PIC for blob and TXT for clob. type holds mime 
         // email content is html, so image or html data can be embedded instead of attachment 
     
       try{
         //esend from cart/transaction, assume pdf rerports for now, flag is x if mailing>send>customer.
         // esend from cart/transaction can be any of pdf/html/csv etc atleast pdf or html
         //if html then it can be embedded (preferred) not as attachment
         if(flag.equals("e")){
         subjectTemplate=bundle.getString("Transaction")+" "+bundle.getString("Receipt")+" "+bundle.getString("select cc from")+" "+owner2Code;
         //emailingContent for emailing and attaching report as receipt 
          toName="";// mailingAddress set by esend using mailTo, headers are empty todo allow multilingual
          toAddress=mailingAddress;
          useTemplate="seateMailingContent.fmt";
         // esend from cart/transaction can be any of pdf/html/csv etc. If html, add report html text 
         // at end of bodyHtml
          String reportBody="";

          if(multilingualYN){
           if(!mailRelayOff){
               if(displayAs.equals("EMAILHTML") || displayAs.equals("SEMAIL")){
                reportBody=mailingSource+sBuffer.toString();
                e =
                    new MailMessageImpl(mailConfig).contentType(ContentType.ALTERNATIVE).charset("UTF-8").from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(reportBody)
                            .put("list", this).addHeader("X-SMTPAPI",this.headers).send();

               }else{
                e =
                    new MailMessageImpl(mailConfig).contentType(ContentType.ALTERNATIVE).charset("UTF-8").from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addHeader("X-SMTPAPI",this.headers).addAttachment(
                            new InputStreamAttachment("seat.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
               }
           }else{
               if(displayAs.equals("EMAILHTML") || displayAs.equals("SEMAIL")){
                reportBody=mailingSource+sBuffer.toString();
                e =
                    new MailMessageImpl(mailConfig).contentType(ContentType.ALTERNATIVE).charset("UTF-8").from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(reportBody).send();
               }else{
                e =
                    new MailMessageImpl(mailConfig).contentType(ContentType.ALTERNATIVE).charset("UTF-8").from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addAttachment(
                            new InputStreamAttachment("seat.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
               }
           }
          }else{
            if(!mailRelayOff){
               if(displayAs.equals("EMAILHTML") || displayAs.equals("SEMAIL")){
                reportBody=mailingSource+sBuffer.toString();
               e =
                    new MailMessageImpl(mailConfig).from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(reportBody)
                            .put("list", this).addHeader("X-SMTPAPI",this.headers).send();
             }else{ 
               e =
                    new MailMessageImpl(mailConfig).from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addHeader("X-SMTPAPI",this.headers).addAttachment(
                            new InputStreamAttachment("seat.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
             }
            }else{
               if(displayAs.equals("EMAILHTML") || displayAs.equals("SEMAIL")){
                reportBody=mailingSource+sBuffer.toString();
               e =
                    new MailMessageImpl(mailConfig).from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(reportBody)
                            .put("list", this).send();
              }else{
               e =
                    new MailMessageImpl(mailConfig).from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addAttachment(
                            new InputStreamAttachment("seat.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
              }
           }//relay
          }//multil
           String toS=toAddress;
           if(toS==null || toS.isEmpty()){
            toS="not selected";
           } 
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
             FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+ bundle.getString("sent")+" "+bundle.getString("to")+": "+toS,""));
          return null;
         }
         //x from send or previewsend,check for attachment blob/vlob data type and adjust mm.attach
         //flag is i if esend from cart/transaction and already checked
         if(flag.equals("x")){
          // x is MailingContent for regular emailing w optional attachments and using xsmtpi where long tolist is in header but also sends
          // to toList value , getClientEmail tries to get an email related to user employee/client site and puts the value in mailingAddress
          subjectTemplate=this.mailingSubject;
          // added ! to use sender's email, not default
          if(!getClientEMail().isEmpty() && !mailingAddress.isEmpty()){
           toAddress=mailingAddress;// should not be empty if then default is support@3rcomputer.com
          }///  value in e1mailAddress including coming from ebasketin gets added to xsmtpi header toAddress
          //if(!e1mailAddress.isEmpty()){
           //toAddress=e1mailAddress;
          //}
          if(!mailRelayOff){
           //gets toAddress+from headers
          }else{
           //if no mailRelay,multiple addresses needs to be a collection. In case of relay simpleMail was getting
           // one toaddress as relay was getting list via header, now no header and it will get all receiepients
           // could not get java.lang.String addresslist to work, so switched to adding one entry at a time
           //  didnt work before because list is String ... which is array of string, not a csv,
           // we can either use myData in to(myData) and let SimpleMail loop or use the loop below to add ourselves
            mm=new MailMessageImpl(mailConfig);
           // avoid dupl,we dont need dummy toaddress like in relay
            if(!e1mailAddress.isEmpty()){
             toAddress=e1mailAddress+", "+mailInfoTo; // added onetime e1mailAddr
            }else{
             toAddress=mailInfoTo;  
            }
            String[] myData = toAddress.split(", ");
            for (String s: myData) {
             if(s !=null && !s.trim().isEmpty()){ 
              if(!getShowAsBCCYN()){
               if(!getShowNamesYN()){
                mm.to(s);
               }else{
                mm.bcc(s);//showNames implies bcc or mailRelay which is like bcc
               }
              }else{
               mm.bcc(s);
              }
             }
            }
            ccAddress=mailInfoCC; 
            String[] myDataCC = ccAddress.split(", ");
            for (String s: myDataCC) {
             if(s !=null && !s.trim().isEmpty()){ 
              if(!getShowAsBCCYN()){
               if(!getShowNamesYN()){
                mm.cc(s);
               }else{
                mm.bcc(s);//showNames implies bcc or mailRelay which is like bcc
               }
              }else{
               mm.bcc(s);
              }
             }
            }
            //  ensure at least one To: to avoid spam if all bcc, plus it ensures a copy to fromAddress
            mm.to(fromAddress);                        
          }
          //at this point mm contains many To and cc and sent to SMTP server who will loop not here
          if(multilingualYN){
           if(!mailRelayOff){//bulk no mm with to,cc created yet
              mm= new MailMessageImpl(mailConfig).contentType(ContentType.ALTERNATIVE).charset("UTF-8").from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addHeader("X-SMTPAPI",this.headers);
           }else{
              //mm already exists with to and cc
              mm= mm.contentType(ContentType.ALTERNATIVE).charset("UTF-8").from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this);
           }
          }else{
           if(!mailRelayOff){
             mm= new MailMessageImpl(mailConfig).from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addHeader("X-SMTPAPI",this.headers);
           }else{
              //mm already exists with to
             mm= mm.from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this);
           }
          } 
           if (checkMapI[1]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach1."+this.getMailingImage1Type(), this.getMailingImage1TypeMime(), ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingImage1())));
           }
           if (checkMapI[2]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach2."+this.getMailingImage2Type(), this.getMailingImage2TypeMime(), ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingImage2())));
           }
           if (checkMapI[3]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach3."+this.getMailingImage3Type(), this.getMailingImage3TypeMime(), ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingImage3())));
           }
           if (checkMapI[4]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach4."+this.getMailingImage4Type(), this.getMailingImage4TypeMime(), ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingImage4())));
           }
           if (checkMapI[5]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach5."+this.getMailingImage5Type(), this.getMailingImage5TypeMime(), ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingImage5())));
           }
           if (checkMapT[1]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach1.text", "text/plain", ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingText1().getBytes())));
           }
           if (checkMapT[2]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach2.text", "text/plain", ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingText2().getBytes())));
           }
           if (checkMapT[3]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach3.text", "text/plain", ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingText3().getBytes())));
           }
           if (checkMapT[4]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach4.text", "text/plain", ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingText4().getBytes())));
           }
           if (checkMapT[5]) {
            anyAtt=true;
            mm.addAttachment(new InputStreamAttachment("attach5.text", "text/plain", ContentDisposition.INLINE,new ByteArrayInputStream(this.getMailingText5().getBytes())));
           }
           if(anyAtt){
            e=mm.send();
           }else{
            // why checking anyAtt , test mm.send for both ??
            if(multilingualYN){
             if(!mailRelayOff){
              e =
                    new MailMessageImpl(mailConfig).contentType(ContentType.ALTERNATIVE).charset("UTF-8").from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addHeader("X-SMTPAPI",this.headers).send();
              
             }else{
              //mm already exists 
              e =
                    mm.send();
             }
           }else{
            if(!mailRelayOff){
             e =
                    new MailMessageImpl(mailConfig).from(MailTestUtil.getAddressHeader(fromName, fromAddress)).replyTo(replyToAddress).to(MailTestUtil.getAddressHeader(toName, toAddress)).subject(
                            new FreeMarkerTemplate(subjectTemplate)).bodyHtml(new FreeMarkerTemplate(Resources.newInputStreamSupplier(Resources.getResource(useTemplate)).getInput()))
                            .put("list", this).addHeader("X-SMTPAPI",this.headers).send();
            }else{
              //mm already exists 
             e =
                    mm.send();
            }
           }
          }
          //still flag x here, not common point after send, esend (flag e) has a different point 
           String toS=toAddress;
           if(toS==null || toS.isEmpty()){
            toS="not selected";
           } 
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
             FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+ bundle.getString("sent")+" "+bundle.getString("to")+": "+toS,""));

         }else{
          // shouldnt come here ie flag not e or x
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("invalid")+" "+ bundle.getString("email")+" "+bundle.getString("content")+" "+bundle.getString("flag")+" "+flag,""));
         }
       } catch (Exception exc) {
         // new logic needed to handle gmail access token expiry. Treat it as expected
         //if exc.getMessage() contains 401? then call r3restclient new method getTokenOffline()
         //getTokenOffline() will save new token
         //then set a bypass flag called tokenReset and call this mailrender again
         log.severe("Error sending mail "+" "+ bundle.getString("exception")+ exc.getMessage());
           String toS=toAddress;
           if(toS==null || toS.isEmpty()){
            toS="not selected";
           } 
         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
          FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+ bundle.getString("send")+" "+bundle.getString("failed")+" "+bundle.getString("for")+": "+toS+", "+" "+ bundle.getString("exception")+exc.getMessage(),""));
         String cause="";
         if(exc.getCause() !=null && exc.getCause().getCause()!=null){
          cause=exc.getCause().getCause().getMessage();
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("cause")+" "+ exc.getCause().getCause().getMessage(),""));
         }
         // retry with refresh if failed on bad token or expired token then only get a new token using
         // existing refresh token(client site record 07 clientId)
         // send again using new token is there subcode for expired or check token expiry?
         if(cause.contains("334")){
          
          password=r3RestClient.getAccessTokenGMail(client.getDaxxuzxdssxxxxxxxxxxapiclientid(),"refresh_token",owner2Code );
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("Oauth")+" "+ bundle.getString("accessToken")+" "+bundle.getString("failure")+", ",""));
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("new")+" "+ bundle.getString("token")+" "+bundle.getString("received")+" "+bundle.getString("and")+" "+bundle.getString("saved"),""));
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("Please")+" "+ bundle.getString("resend")+" "+bundle.getString("the")+" "+bundle.getString("email"),""));

         }
         
       }
         return null;
      }








   public void eSend(String sendAs,String start,String end,Boolean markedOnes,String eMailTo) {
    /**
    * The following method calls xxxMailingList method Print which is another method of this bean and uses
    * filters like start/end , flag etc and then this method renders exxxMailingContent.xhtml.  
    * the print output goes to xxxmailingBytes and is shown as attachment by rendering xxxmaiingContent
    * @param args sendAs SEMAIL if from cart, PEmail if from POS ,UEmail if userEdit, EMAIL otherwise
    * @param args start order number needed by called print method which produces report
    * @param args end order number needed by called print method
    * @param args markedOnes needed by called print method
    * @param args eMailTo eMail address of recipient
    * @return -none
    * @exception EMail_send_fail
    * @see 
    * called by shoppingCart,transactions if from ShoppingCart sendAs is SEMAIL otherwise EMAIL
    * sendAs is now EMAIL or SMAIL (assumes PDF) but in future it can be EMAILPDF or EMAILEXCL or or EMAILHTML or EMAIL etc
    *  now using EMAILHTML etc which gets passed to emailRender via displayAs , HTML allows avoiding attaching report to email
    * parameters for print except last one used by rendered eMailingContent
    * calls print() to generare report which produces mailingbytes for pdf if sendAs is eMail.
    * xxxMailingContent uses mailingbytes
    * Checks how many eMails to send and gives message if none
    * otherwise renders Enity specific MailingContent.xhtml to take care of actual EMail processing
    * messages are sent to target list and from imailaddr value in client record for copy and audit 
    */

    boolean fromCart=false;
    try {
         if (eMailTo==null || eMailTo.isEmpty()){  
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+ bundle.getString("to")+" "+ bundle.getString("empty"),""));


           return;
         }
         else{
          //jay eMail validation 
          eMailTo=eMailTo.trim();
          Pattern pattern = Pattern.compile("^.+@.+\\..+$");
          Matcher matcher = pattern.matcher(eMailTo);
          if(!matcher.matches()){
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+ bundle.getString("value")+" "+ bundle.getString("invalid"),""));


           return;
          }
         }

         // before calling print setup start/end to current key value, displayAs and markedOnes flag. Based on displayAs source will be eMailBytes 
         if(sendAs.equals("SEMAIL") || sendAs.equals("PEMAIL")){
          fromCart=true;
          this.sendAs=sendAs.substring(1);
         }
         if(sendAs.equals("UEMAIL")){
          this.sendAs=sendAs.substring(1);
         }
         displayAs=sendAs;
         this.start=start;
         this.end=end;
         this.markedOnes=markedOnes;
         // reprtName holds the dropdown selected report, use it. 
          //reportName="xxFxxxuq1skxwwqqhxxxxxseat";  holds selected report
          this.print(); //generate report 
          if(customIdentity.getClientMsgLevel().contains("D")){
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_INFO, bundle.getString("Report")+" "+reportName.substring(20)+" "+bundle.getString("to")+" "+bundle.getString("send")+" "+bundle.getString("by")+" "+bundle.getString("email"),""));
          } 

         mailingAddress=eMailTo;
         // 
                Yxxxch522xhhxxhxxxxxclient client =(Yxxxch522xhhxxhxxxxxclient) getEntityManager()
		.createQuery(
		"select cc from Yxxxch522xhhxxhxxxxxclient cc  where cc.a0xxukxxbvxxxxxxxxxxclientversion = :nKeyName and cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2")
		.setParameter("nKeyName","01")
		.setParameter("owner2", owner2Code)
		.getSingleResult();

         setClientEMail("doNotReply@"+owner2Code+".com"); 
         //can come here as loggedIn or not loggedIn but eMail entered
         if(identity.isLoggedIn()){   
          //All loggedIn has customer record but may not have employee example self signedup 
          // if usertoEmployee has Email then use it , if empty then use client which should have some value
          if (jxxxbh400xwwqqhxxxxxemployeeHome.getCurrentUserToEmployee()==null || "".equals(jxxxbh400xwwqqhxxxxxemployeeHome.getCurrentUserToEmployee())){
           // try customer 
           setClientEMail(client.getD4xxhxxrbv24xxxxxxxximailaddr().trim());
          } 
          else{
           jxxxbh400xwwqqhxxxxxemployee=jxxxbh400xwwqqhxxxxxemployeeHome.getCurrentUserToEmployee();
           setClientEMail(jxxxbh400xwwqqhxxxxxemployee.getN4xxhxxrbv24xxxxxxxximailaddr().trim());
           setUserFullName(jxxxbh400xwwqqhxxxxxemployee.getB4xxu2fnbvxxxxxxxxxxfirstname()==null?"":jxxxbh400xwwqqhxxxxxemployee.getB4xxu2fnbvxxxxxxxxxxfirstname() +" "+jxxxbh400xwwqqhxxxxxemployee.getB3xxuslnbvixxxxxxxxxlastname()==null?"":jxxxbh400xwwqqhxxxxxemployee.getB3xxuslnbvixxxxxxxxxlastname());
          }
          // if demo user no email saved in employee except in user
          Yxxxuh566xwwqqwxxxxxuser theUser = yxxxuh566xwwqqwxxxxxuserList.getKeyToEntity(customIdentity.getUsername());
          if(theUser.getY1xxuxxxivxxxxxxxxxxrestrict1() != null && theUser.getY1xxuxxxivxxxxxxxxxxrestrict1().equals("D")){
           setClientEMail(theUser.getA0xxukuxbvxxxxxxxxxxid());
          }

         }else{
          if (client.getD4xxhxxrbv24xxxxxxxximailaddr() == null || client.getD4xxhxxrbv24xxxxxxxximailaddr().isEmpty()){
           setClientEMail("doNotReply@"+owner2Code+".com"); 
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_WARN,bundle.getString("client")+" "+bundle.getString("email")+" "+bundle.getString("address")+" "+bundle.getString("is")+" "+bundle.getString("missing"),""));

          }else{
           setClientEMail(client.getD4xxhxxrbv24xxxxxxxximailaddr());
          }
         } 
         // from uses clientEMail,cc uses eMailingAddress1, to uses mailingAddress
         //renderer.render("/seateMailingContent.xhtml");
         emailRender("/seateMailingContent.xhtml","e");
         //FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           //FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+bundle.getString("send")+" "+bundle.getString("for")+" "+ eMailTo,""));

    } catch (Exception e) {
         log.severe("Error sending mail"+ e);
         FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+bundle.getString("sent")+" "+bundle.getString("failed"),""));

         if(fromCart){
          if(sendAs.equals("SEMAIL")){
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_INFO,bundle.getString("check")+" "+bundle.getString("purchase")+" "+bundle.getString("history")+" "+bundle.getString("at")+" "+bundle.getString("bottom")+" "+bundle.getString("of")+" "+bundle.getString("page")+" "+bundle.getString("for")+" "+bundle.getString("status"),""));
          }else{
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
            FacesMessage.SEVERITY_INFO,bundle.getString("check")+" "+bundle.getString("invoice")+" "+bundle.getString("status")+" "+bundle.getString("using")+" "+bundle.getString("contactus")+"/"+bundle.getString("customer")+" "+bundle.getString("payment"),""));
          }

         }
    }
   }

	public void send(String sendAs,String start,String end,Boolean markedOnes,String source) {
     // needs clean ups sendAs HTML,start Email, end same for now,markedOnes ignore , source is the report output as attachment to a mailing template
     // used to send print output as attachment from any edit including cuquote etc

		try {
			//renderer.render("/itemMailingContent.xhtml");
                        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+ bundle.getString("send")+" "+ bundle.getString("done"),""));


		} catch (Exception e) {
			log.severe("Error sending mail"+ e);
                        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_INFO,bundle.getString("email")+" "+ bundle.getString("send")+" "+ bundle.getString("failed")+" "+e.getMessage(),""));

		}
	}




///added
/*
   public List<Fxxxuq1skxwwqqhxxxxxseat> getResultList(){
    return sresults;
   }
*/

    public EntityManager getEntityManager(){
        //return emf.createEntityManager();
        return entityManager;
    }
   public String getOrderColumn() {
       return orderColumn;
   }

   public void setOrderColumn(String orderColumn) {
       //this.orderColumn = sanitizeOrderColumn(orderColumn);
        this.orderColumn = orderColumn;
   }
   public String getOrder() {
       return order;
   }

   public void setOrder(String order) {
        this.order = order;
   }

   public String getOrderDirection() {
       return orderDirection;
   }

   public void setOrderDirection(String orderDirection) {
       //this.orderDirection = sanitizeOrderDirection(orderDirection);
         this.orderDirection = orderDirection; 
   }
   /**
    * Returns true if the previous page exists
    */
   public boolean isPreviousExists()
   {
      return getFirstResult()!=null && getFirstResult()!=0;
   }

   public boolean isSystemPreviousExists()
   {
      return getFirstResult()!=null && getFirstResult()!=0;
   }


   /**
    * Returns true if the query is paginated, revealing
    * whether navigation controls are needed.
    */
   /**
    * Returns true if the query is paginated, revealing
    * whether navigation controls are needed.
    */
   public boolean isPaginated() {
      return isNextExists() || isPreviousExists();
   }
   /**
    * Returns the index of the first result of the current page
    */
   public Integer getFirstResult()
   {
      return firstResult;
   }

   /**
    * Set the index at which the page to display should start
    */
   public void setFirstResult(Integer firstResult)
   {
      this.firstResult = firstResult;
      refresh();
   }
   /**
    * The page size
    */
   public Integer getMaxResults()
   {
       return maxResults;
   }

   public void setMaxResults(Integer maxResults)
   {
      this.maxResults = maxResults;
      refresh();
   }
  protected String getRenderedEjbql()
   {
   return "";
   }
  public void refresh()
   {
      clearDataModel();
   }
   protected void clearDataModel()
   {
      dataModel = null;
   }

   /**
    * Get the index of the first result of the next page
    * 
    */
   public int getNextFirstResult()
   {
      Integer fr = getFirstResult();
      return ( fr==null ? 0 : fr ) + getMaxResults();
   }

   public Integer getPageCount()
   {
      if ( getMaxResults()==null )
      {
         return null;
      }
      else
      {
         int rc = getResultCount().intValue();
         int mr = getMaxResults().intValue();
         int pages = rc / mr;
         return rc % mr == 0 ? pages : pages+1;
      }
   }

   public Integer getSystemPageCount()
   {
      if ( getMaxResults()==null )
      {
         return null;
      }
      else
      {
         int rc = getSystemResultCount().intValue();
         int mr = getMaxResults().intValue();
         int pages = rc / mr;
         return rc % mr == 0 ? pages : pages+1;
      }
   }

   /**
    * Get the index of the first result of the previous page
    * 
    */
   public int getPreviousFirstResult()
   {
      Integer fr = getFirstResult();
      Integer mr = getMaxResults();
      return mr >= ( fr==null ? 0 : fr ) ? 
               0 : fr - mr;
   }

   public Long getLastFirstResult()
   {
      Integer pc = getPageCount();
      return pc==null ? null : ( pc.longValue()-1 ) * getMaxResults();
   }
   public Long getSystemLastFirstResult()
   {
      Integer pc = getSystemPageCount();
      return pc==null ? null : ( pc.longValue()-1 ) * getMaxResults();
   }


    
}//end
