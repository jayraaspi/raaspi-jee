



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

@Named("yxxxch5a1xhhxxhxxxxxtruefalseList")
@ViewScoped
public class Yxxxch5a1xhhxxhxxxxxtruefalseList implements Serializable
{
   private Logger log = Logger.getLogger(Yxxxch5a1xhhxxhxxxxxtruefalse.class.getCanonicalName());
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
                int listSize=gethhxxhxxxxxtruefalseKeyList().size();
                start=  listSize==0 ? "0" : String.valueOf(gethhxxhxxxxxtruefalseKeyList().get(0)) ;
                end=    listSize==0 ? "0" : String.valueOf(gethhxxhxxxxxtruefalseKeyList().get(listSize-1));

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
     List<Yxxxch5a1xhhxxhxxxxxtruefalse> sresults=null;

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

     private static final String EJBQL = "select yxxxch5a1xhhxxhxxxxxtruefalse from Yxxxch5a1xhhxxhxxxxxtruefalse yxxxch5a1xhhxxhxxxxxtruefalse "  ;

     private static final String[] RESTRICTIONS = {
        "lower(yxxxch5a1xhhxxhxxxxxtruefalse.a0xxukrdbvxxxxxxxxxxtablename) like lower( concat(#{yxxxch5a1xhhxxhxxxxxtruefalseList.yxxxch5a1xhhxxhxxxxxtruefalse.a0xxukrdbvxxxxxxxxxxtablename},'%'))",
        "lower(yxxxch5a1xhhxxhxxxxxtruefalse.a1xxuxxxbvxxxxxxxxxxqualifier) like lower( concat(#{yxxxch5a1xhhxxhxxxxxtruefalseList.yxxxch5a1xhhxxhxxxxxtruefalse.a1xxuxxxbvxxxxxxxxxxqualifier},'%'))",
        "lower(yxxxch5a1xhhxxhxxxxxtruefalse.z3xxutoxlhxxxxxxxxxxowner) like lower( concat('%',#{yxxxch5a1xhhxxhxxxxxtruefalseList.ownerCddCode}))",
        "lower(yxxxch5a1xhhxxhxxxxxtruefalse.zzxxu2oxxhxxxxxxxxxxowner2) = lower(#{yxxxch5a1xhhxxhxxxxxtruefalseList.dataOwner2Code})",
    };



    private Yxxxch5a1xhhxxhxxxxxtruefalse yxxxch5a1xhhxxhxxxxxtruefalse = new Yxxxch5a1xhhxxhxxxxxtruefalse();
 /*
  In case of non composite ie Single Field Key
 */
      /*
      ids = pojo.identifierProperty.name >>> a0xxuobxbxxxxxxxxxxxsid
      */




// add more logic here to pick up foreign fields if transaction or mailing, pks,pfs=05 efs=06,added multiple K test
   //not foreign or collection properties  property name a0xxuobxbxxxxxxxxxxxsid
   //not foreign or collection also not component  property name a0xxuobxbxxxxxxxxxxxsid
   //not foreign or collection properties  property name a0xxukrdbvxxxxxxxxxxtablename
   //not foreign or collection also not component  property name a0xxukrdbvxxxxxxxxxxtablename
      //not component keyfield property name a0xxukrdbvxxxxxxxxxxtablename
   //not foreign or collection properties  property name a1xxuxxxbvxxxxxxxxxxqualifier
   //not foreign or collection also not component  property name a1xxuxxxbvxxxxxxxxxxqualifier
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow001
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow001
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow002
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow002
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow003
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow003
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow004
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow004
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow005
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow005
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow006
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow006
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow007
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow007
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow008
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow008
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow009
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow009
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow010
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow010
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow011
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow011
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow012
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow012
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow013
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow013
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow014
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow014
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow015
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow015
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow016
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow016
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow017
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow017
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow018
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow018
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow019
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow019
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow020
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow020
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow021
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow021
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow022
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow022
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow023
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow023
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow024
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow024
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow025
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow025
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow026
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow026
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow027
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow027
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow028
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow028
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow029
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow029
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow030
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow030
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow031
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow031
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow032
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow032
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow033
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow033
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow034
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow034
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow035
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow035
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow036
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow036
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow037
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow037
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow038
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow038
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow039
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow039
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow040
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow040
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow041
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow041
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow042
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow042
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow043
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow043
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow044
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow044
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow045
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow045
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow046
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow046
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow047
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow047
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow048
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow048
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow049
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow049
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow050
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow050
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow051
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow051
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow052
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow052
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow053
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow053
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow054
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow054
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow055
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow055
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow056
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow056
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow057
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow057
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow058
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow058
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow059
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow059
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow060
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow060
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow061
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow061
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow062
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow062
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow063
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow063
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow064
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow064
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow065
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow065
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow066
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow066
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow067
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow067
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow068
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow068
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow069
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow069
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow070
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow070
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow071
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow071
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow072
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow072
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow073
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow073
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow074
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow074
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow075
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow075
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow076
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow076
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow077
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow077
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow078
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow078
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow079
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow079
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow080
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow080
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow081
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow081
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow082
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow082
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow083
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow083
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow084
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow084
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow085
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow085
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow086
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow086
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow087
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow087
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow088
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow088
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow089
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow089
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow090
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow090
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow091
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow091
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow092
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow092
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow093
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow093
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow094
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow094
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow095
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow095
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow096
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow096
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow097
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow097
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow098
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow098
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow099
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow099
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow100
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow100
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow101
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow101
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow102
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow102
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow103
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow103
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow104
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow104
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow105
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow105
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow106
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow106
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow107
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow107
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow108
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow108
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow109
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow109
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow110
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow110
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow111
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow111
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow112
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow112
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow113
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow113
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow114
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow114
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow115
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow115
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow116
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow116
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow117
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow117
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow118
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow118
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow119
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow119
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow120
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow120
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow121
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow121
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow122
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow122
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow123
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow123
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow124
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow124
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow125
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow125
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow126
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow126
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow127
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow127
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow128
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow128
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow129
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow129
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow130
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow130
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow131
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow131
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow132
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow132
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow133
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow133
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow134
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow134
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow135
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow135
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow136
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow136
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow137
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow137
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow138
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow138
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow139
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow139
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow140
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow140
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow141
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow141
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow142
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow142
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow143
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow143
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow144
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow144
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow145
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow145
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow146
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow146
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow147
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow147
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow148
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow148
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow149
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow149
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow150
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow150
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow151
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow151
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow152
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow152
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow153
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow153
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow154
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow154
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow155
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow155
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow156
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow156
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow157
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow157
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow158
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow158
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow159
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow159
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow160
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow160
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow161
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow161
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow162
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow162
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow163
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow163
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow164
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow164
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow165
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow165
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow166
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow166
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow167
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow167
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow168
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow168
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow169
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow169
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow170
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow170
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow171
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow171
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow172
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow172
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow173
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow173
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow174
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow174
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow175
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow175
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow176
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow176
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow177
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow177
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow178
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow178
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow179
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow179
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow180
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow180
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow181
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow181
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow182
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow182
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow183
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow183
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow184
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow184
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow185
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow185
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow186
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow186
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow187
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow187
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow188
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow188
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow189
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow189
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow190
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow190
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow191
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow191
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow192
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow192
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow193
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow193
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow194
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow194
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow195
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow195
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow196
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow196
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow197
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow197
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow198
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow198
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow199
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow199
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow200
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow200
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow201
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow201
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow202
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow202
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow203
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow203
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow204
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow204
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow205
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow205
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow206
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow206
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow207
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow207
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow208
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow208
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow209
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow209
   //not foreign or collection properties  property name a1xxyxxxbvxxxxxxxxxxshow210
   //not foreign or collection also not component  property name a1xxyxxxbvxxxxxxxxxxshow210
   //not foreign or collection properties  property name z3xxutoxlhxxxxxxxxxxowner
   //not foreign or collection also not component  property name z3xxutoxlhxxxxxxxxxxowner
   //not foreign or collection properties  property name zixxzzfxhhxxxxxxxxxxstatusfl
   //not foreign or collection also not component  property name zixxzzfxhhxxxxxxxxxxstatusfl
   //not foreign or collection properties  property name zjxxcztxlxxxxxxxxxxxstatusfldt
   //not foreign or collection also not component  property name zjxxcztxlxxxxxxxxxxxstatusfldt
   //not foreign or collection properties  property name zzxxu2oxxhxxxxxxxxxxowner2
   //not foreign or collection also not component  property name zzxxu2oxxhxxxxxxxxxxowner2



     String lorderColumn = "a0xxukrdbvxxxxxxxxxxtablename";
     String lorder ="a0xxukrdbvxxxxxxxxxxtablename asc";
     String lorderDirection = "asc";
     String orderColumnPrev = "";
     String orderDirectionPrev = "";
     int urlIndex=0;





public Yxxxch5a1xhhxxhxxxxxtruefalseList()
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
          //setOrderColumn( "yxxxch5a1xhhxxhxxxxxtruefalse.a0xxukrdbvxxxxxxxxxxtablename" );
        //a0xxukrdbvxxxxxxxxxxtablename
        
}

    public Yxxxch5a1xhhxxhxxxxxtruefalse getYxxxch5a1xhhxxhxxxxxtruefalse()
    {
        return yxxxch5a1xhhxxhxxxxxtruefalse;
    }

    public boolean isBitSet(Integer a, Integer n){ 
     if (a == null){
      a=0;
     }
     return (a & (1 << n)) != 0; 
    }


      private String  reportName  = "deYxxxch5a1xhhxxhxxxxxtruefalse";
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

     public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getResultListMaxSet(Integer maxResultsVal){
      sresults=null;// reset 
      this.maxResultsVal=maxResultsVal;
      return getResultList();
     }

     public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getSystemResultListMaxSet(Integer maxResultsVal){
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
							"select count(cc) from Yxxxch5a1xhhxxhxxxxxtruefalse cc where (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) ")
					.setParameter("owner2", owner2Code)
					.getSingleResult();
                return count;

     }
     public Long getSystemResultCount(){
     // show SYSTEM only not including owner2, affected pagination

		Long count =  (Long)getEntityManager()
					.createQuery(
							"select count(cc) from Yxxxch5a1xhhxxhxxxxxtruefalse cc where (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) ")
					.setParameter("owner2", "SYSTEM")
					.getSingleResult();
                return count;

     }

     public Long getResultCountClosed(){

		Long count =  (Long)getEntityManager()
		.createQuery(
		 "select count(cc) from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
		 .setParameter("owner2", owner2Code).setParameter("flag", mclosed)
		 .getSingleResult();
                return count;

     }
     public Long getResultCountReturned(){

		Long count =  (Long)getEntityManager()
		.createQuery(
		 "select count(cc) from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
		 .setParameter("owner2", owner2Code).setParameter("flag", mreturn)
		 .getSingleResult();
                return count;

     }
     public Long getResultCountOrdered(){

		Long count =  (Long)getEntityManager()
		.createQuery(
		"select count(cc) from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
		.setParameter("owner2", owner2Code).setParameter("flag", mordered)
		.getSingleResult();
                return count;

     }


     public Long getResultCountShipped(){

	Long count =  (Long)getEntityManager()
	.createQuery(
	"select count(cc) from Yxxxch5a1xhhxxhxxxxxtruefalse  cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
	.setParameter("owner2", owner2Code).setParameter("flag", mshipped)
	.getSingleResult();
         return count;

     }
     public Long getResultCountInvoiced(){
       //invoiced refers to flag value 64 and may mean approved or ? or invoiced depending on the entity

	Long count =  (Long)getEntityManager()
	.createQuery(
	"select count(cc) from Yxxxch5a1xhhxxhxxxxxtruefalse  cc where cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2 = 'SYSTEM') ")
	.setParameter("owner2", owner2Code).setParameter("flag", minvoiced)
	.getSingleResult();
         return count;

     }









     public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getSystemResultList(){
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
		List<Yxxxch5a1xhhxxhxxxxxtruefalse> results =  getEntityManager()
                                     .createQuery(
                                       "select cc from Yxxxch5a1xhhxxhxxxxxtruefalse  cc where cc.z3xxutoxlhxxxxxxxxxxowner=:owner  and  ((zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) and (lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%'))) and (lower(a0xxukrdbvxxxxxxxxxxtablename) between :start and :end) ) order by "+ lorder)
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
		   "select cc from Yxxxch5a1xhhxxhxxxxxtruefalse  cc where ((cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 and (:searchStatus is null  or cc.zixxzzfxhhxxxxxxxxxxstatusfl = :searchStatus) ) and (lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%'))) and (cast(cc.zjxxcztxlxxxxxxxxxxxstatusfldt AS date) >= cast(:searchDate AS date)) and lower(a0xxukrdbvxxxxxxxxxxtablename) between :start and :end) ) order by "+ lorder)
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
    * @return List<Yxxxch5a1xhhxxhxxxxxtruefalse>
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

     public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getResultList(){
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
                                   List<Yxxxch5a1xhhxxhxxxxxtruefalse> results =  getEntityManager()
                                    .createQuery(
                                     "select cc from Yxxxch5a1xhhxxhxxxxxtruefalse  cc where cc.z3xxutoxlhxxxxxxxxxxowner=:owner  and ((cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 ) and (lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%'))) and (lower(a0xxukrdbvxxxxxxxxxxtablename) between :start and :end) ) order by "+ lorder)
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
		    "select cc from Yxxxch5a1xhhxxhxxxxxtruefalse  cc where (cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 and ((:searchStatus is null  or cc.zixxzzfxhhxxxxxxxxxxstatusfl = :searchStatus) ) and ((lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')) or lower(a0xxukrdbvxxxxxxxxxxtablename) like lower(concat('%',:searchVal,'%')))) and (cast(cc.zjxxcztxlxxxxxxxxxxxstatusfldt AS date) >= cast(:searchDate AS date)) and lower(a0xxukrdbvxxxxxxxxxxtablename) between :start and :end) ) order by "+ lorder)
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

     public Yxxxch5a1xhhxxhxxxxxtruefalse getSidSToEntity(String sidS){
      return getSidToEntity(Integer.parseInt(sidS));//
     }

     public Yxxxch5a1xhhxxhxxxxxtruefalse getSidToEntity(Integer sid){
      Yxxxch5a1xhhxxhxxxxxtruefalse entity=null;
      List<Yxxxch5a1xhhxxhxxxxxtruefalse> results=null;
      try{
       results = getEntityManager()
					.createQuery(
							"select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxuobxbxxxxxxxxxxxsid = :nSid and zzxxu2oxxhxxxxxxxxxxowner2 = :owner2")
					.setParameter("nSid",sid)
					.setParameter("owner2", owner2Code)
					.getResultList();
      }catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("truefalse")+" "+bundle.getString("error")+" "+e.getMessage(), ""));
       return null;
      }
      if(results.isEmpty()){
          return null;
      }
      if(results.size() >1){
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_INFO,bundle.getString("truefalse")+" "+bundle.getString("multiple")+" "+bundle.getString("entries"),""));
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString("first")+" "+bundle.getString("one")+" "+bundle.getString("used")+", "+bundle.getString("delete")+" "+bundle.getString("duplicates"), ""));
      }
      return results.get(0);

     } 













	public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getFlaggedAsList(int flag) {
		// will return objects matching flag 
		return getEntityManager()
				.createQuery(
						"select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where (cc.zixxzzfxhhxxxxxxxxxxstatusfl = :flag AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2)")
				.setParameter("flag", flag).setParameter("owner2", owner2Code).getResultList();

	}

	public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getNotFlaggedAsList(int flag) {
		// will return objects not matching flag 

		return getEntityManager()
				.createQuery(
						"select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where (cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2)")
				.setParameter("flag", flag).setParameter("owner2", owner2Code).getResultList();

	}

	public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getOldByList(int days) {
	// will return objects statusfldt < today-days
        calendar.add(Calendar.DATE, -days); //xx days in past, can check further for 15 days/7 days/ expiry
        Date searchDate= calendar.getTime();

	return getEntityManager()
	 .createQuery(
	  "select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where (cast(cc.zjxxcztxlxxxxxxxxxxxstatusfldt AS date) < cast(:searchDate AS date AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2)")
	   .setParameter("searchDate", searchDate).setParameter("owner2", owner2Code).getResultList();

	}






         public Yxxxch5a1xhhxxhxxxxxtruefalse getKeyToEntity(String key){
      Yxxxch5a1xhhxxhxxxxxtruefalse entity=null;
      List<Yxxxch5a1xhhxxhxxxxxtruefalse> results=null;
      try{
       results = getEntityManager()
	.createQuery(
	"select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxukrdbvxxxxxxxxxxtablename = :nKeyName AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')")
	.setParameter("nKeyName",key)
	.setParameter("owner2", owner2Code)
	.getResultList();
      }catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
         FacesMessage.SEVERITY_ERROR,bundle.getString("truefalse")+" "+bundle.getString("error")+" "+e.getMessage(), ""));
       return null;
      }
      if(results.isEmpty()){
          return null;
      }
      if(results.size() >1){
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("truefalse")+" "+bundle.getString("multiple")+" "+bundle.getString("entries")+" "+bundle.getString("found"),""));
          // end user may see it,FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
          // FacesMessage.SEVERITY_ERROR,bundle.getString("first")+" "+bundle.getString("one")+" "+bundle.getString("used")+", "+bundle.getString("delete")+" "+bundle.getString("duplicates"), ""));
          customIdentity.setHoldValue3(""+results.size());//caller may examine this
      }
      return results.get(0);

    } 


     public Yxxxch5a1xhhxxhxxxxxtruefalse getKeyContainsToEntity(String key){
      Yxxxch5a1xhhxxhxxxxxtruefalse entity=null;
      List<Yxxxch5a1xhhxxhxxxxxtruefalse> results=null;
      try{
       results = getEntityManager()
	.createQuery(
	"select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxukrdbvxxxxxxxxxxtablename like :nKeyName AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')")
	.setParameter("nKeyName",key+'%')
	.setParameter("owner2", owner2Code)
	.getResultList();
      }catch(Exception e){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
         FacesMessage.SEVERITY_ERROR,bundle.getString("truefalse")+" "+bundle.getString("error")+" "+e.getMessage(), ""));
       return null;
      }
      if(results.isEmpty()){
          return null;
      }
      if(results.size() >1){
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
           FacesMessage.SEVERITY_INFO,bundle.getString("truefalse")+" "+bundle.getString("multiple")+" "+bundle.getString("entries"),""));
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
      String value= getEntityManager().createQuery(" select a0xxukrdbvxxxxxxxxxxtablename from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxuobxbxxxxxxxxxxxsid = :keyOfEntity  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')   order by cc.a0xxuobxbxxxxxxxxxxxsid  ")
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
      String value= getEntityManager().createQuery(" select a0xxukrdbvxxxxxxxxxxtablename||'/'||zzxxu2oxxhxxxxxxxxxxowner2 from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxuobxbxxxxxxxxxxxsid = :keyOfEntity  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')   order by cc.a0xxuobxbxxxxxxxxxxxsid  ")
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
 
      for (Yxxxch5a1xhhxxhxxxxxtruefalse yxxxch5a1xhhxxhxxxxxtruefalse : getSuggestList(userInput)) {
         ret.add(yxxxch5a1xhhxxhxxxxxtruefalse.getA0xxukrdbvxxxxxxxxxxtablename());
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
     public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getSuggestList(String prefix,String hideTypePrefix) {
     // getSuggestList is called when non key values are also needed like item key, its price etc 
     // when is keyfield blank probably never for keyAutogen
     
			return getEntityManager().createQuery(" select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxukrdbvxxxxxxxxxxtablename >=:keyOfEntity  AND !( cc.c6xxusxrbv16xxxxxxxxtype LIKE  hideTypePrefix )  AND cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2   order by cc.a0xxukrdbvxxxxxxxxxxtablename  ")
        				.setParameter("keyOfEntity", prefix).setParameter("owner2", owner2Code)
					.getResultList();
	}
   





	public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getSystemSuggestList(String prefix) {
                if(prefix.startsWith("BI-L*")){
                //item add dont show details, only blog categories
                String owner2CodeS="SYSTEM";// test how it behaves
                 prefix="0";
                 if( customIdentity.hasRole("VW") || customIdentity.hasRole("VQ")||customIdentity.hasRole("VH")||customIdentity.hasRole("PH")){
			return getEntityManager().createQuery(" select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxukrdbvxxxxxxxxxxtablename >=:keyOfEntity AND cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND cc.c6xxusxrbv16xxxxxxxxtype LIKE  :showTypePrefix1  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2S) AND cc.zexxutoxlhxxxxxxxxxxowner=:ownerCode order by cc.a0xxukrdbvxxxxxxxxxxtablename")
        				.setParameter("keyOfEntity", prefix).setParameter("flag", mclosed).setParameter("showTypePrefix1", "BI-L%").setParameter("owner2", owner2Code).setParameter("owner2S", owner2CodeS)
					.getResultList();
                 //NC will come here
                 }else{
			return getEntityManager().createQuery(" select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxukrdbvxxxxxxxxxxtablename >=:keyOfEntity AND cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND cc.c6xxusxrbv16xxxxxxxxtype LIKE  :showTypePrefix1  AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2S)   order by cc.a0xxukrdbvxxxxxxxxxxtablename")
        				.setParameter("keyOfEntity", prefix).setParameter("flag", mclosed).setParameter("showTypePrefix1", "BI-L%").setParameter("owner2S", owner2CodeS)
					.getResultList();
                 }
                }
                return null;

        }

     public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getSuggestList(String prefix) {
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

			 return getEntityManager().createQuery(" select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxukrdbvxxxxxxxxxxtablename >=:keyOfEntity AND cc.zixxzzfxhhxxxxxxxxxxstatusfl != :flag AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')   order by cc.a0xxukrdbvxxxxxxxxxxtablename  ")
        				.setParameter("keyOfEntity", prefix).setParameter("flag", mclosed).setParameter("owner2", owner2Code)
					.getResultList();


	}
     public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getNextSids(Integer sid){
      sresults=null;// reset 
      List<Yxxxch5a1xhhxxhxxxxxtruefalse> results=null;
		results	  =  getEntityManager()
			.createQuery("select cc from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 and cc.a0xxuobxbxxxxxxxxxxxsid >=:sid order by cc.a0xxuobxbxxxxxxxxxxxsid").setParameter("owner2", owner2Code).setParameter("sid", sid)
					.getResultList();
      return results;
     }
     public List<Integer> getAllSids(){
      List<Integer> results=null;
		results	  =  getEntityManager()
			.createQuery("select cc.a0xxuobxbxxxxxxxxxxxsid from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.zzxxu2oxxhxxxxxxxxxxowner2 = :owner2 order by cc.a0xxuobxbxxxxxxxxxxxsid").setParameter("owner2", owner2Code).getResultList();
      return results;
     }










	public List<String> gethhxxhxxxxxtruefalseKeyList() {
                 // xxxxxxxxxa0xxuobxbxxxxxxxxxxxsid  java.lang.String a0xxukrdbvxxxxxxxxxxtablename
    
		       String enteredValue = "";
                        //order case insensitive
			return getEntityManager().createQuery("select cc.a0xxukrdbvxxxxxxxxxxtablename from Yxxxch5a1xhhxxhxxxxxtruefalse cc where cc.a0xxukrdbvxxxxxxxxxxtablename >=:keyOfEntity   AND (cc.zzxxu2oxxhxxxxxxxxxxowner2=:owner2 or cc.zzxxu2oxxhxxxxxxxxxxowner2='SYSTEM')  order by lower(cc.a0xxukrdbvxxxxxxxxxxtablename) ")
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
		            parameters.put("show002h", "#{messages[Tablename]}");
		            parameters.put("show003h", "#{messages[Qualifier]}");
		            parameters.put("show004h", "#{messages[Show001]}");
		            parameters.put("show005h", "#{messages[Show002]}");
		            parameters.put("show006h", "#{messages[Show003]}");
		            parameters.put("show007h", "#{messages[Show004]}");
		            parameters.put("show008h", "#{messages[Show005]}");
		            parameters.put("show009h", "#{messages[Show006]}");
		            parameters.put("show010h", "#{messages[Show007]}");
		            parameters.put("show011h", "#{messages[Show008]}");
		            parameters.put("show012h", "#{messages[Show009]}");
		            parameters.put("show013h", "#{messages[Show010]}");
		            parameters.put("show014h", "#{messages[Show011]}");
		            parameters.put("show015h", "#{messages[Show012]}");
		            parameters.put("show016h", "#{messages[Show013]}");
		            parameters.put("show017h", "#{messages[Show014]}");
		            parameters.put("show018h", "#{messages[Show015]}");
		            parameters.put("show019h", "#{messages[Show016]}");
		            parameters.put("show020h", "#{messages[Show017]}");
		            parameters.put("show021h", "#{messages[Show018]}");
		            parameters.put("show022h", "#{messages[Show019]}");
		            parameters.put("show023h", "#{messages[Show020]}");
		            parameters.put("show024h", "#{messages[Show021]}");
		            parameters.put("show025h", "#{messages[Show022]}");
		            parameters.put("show026h", "#{messages[Show023]}");
		            parameters.put("show027h", "#{messages[Show024]}");
		            parameters.put("show028h", "#{messages[Show025]}");
		            parameters.put("show029h", "#{messages[Show026]}");
		            parameters.put("show030h", "#{messages[Show027]}");
		            parameters.put("show031h", "#{messages[Show028]}");
		            parameters.put("show032h", "#{messages[Show029]}");
		            parameters.put("show033h", "#{messages[Show030]}");
		            parameters.put("show034h", "#{messages[Show031]}");
		            parameters.put("show035h", "#{messages[Show032]}");
		            parameters.put("show036h", "#{messages[Show033]}");
		            parameters.put("show037h", "#{messages[Show034]}");
		            parameters.put("show038h", "#{messages[Show035]}");
		            parameters.put("show039h", "#{messages[Show036]}");
		            parameters.put("show040h", "#{messages[Show037]}");
		            parameters.put("show041h", "#{messages[Show038]}");
		            parameters.put("show042h", "#{messages[Show039]}");
		            parameters.put("show043h", "#{messages[Show040]}");
		            parameters.put("show044h", "#{messages[Show041]}");
		            parameters.put("show045h", "#{messages[Show042]}");
		            parameters.put("show046h", "#{messages[Show043]}");
		            parameters.put("show047h", "#{messages[Show044]}");
		            parameters.put("show048h", "#{messages[Show045]}");
		            parameters.put("show049h", "#{messages[Show046]}");
		            parameters.put("show050h", "#{messages[Show047]}");
		            parameters.put("show051h", "#{messages[Show048]}");
		            parameters.put("show052h", "#{messages[Show049]}");
		            parameters.put("show053h", "#{messages[Show050]}");
		            parameters.put("show054h", "#{messages[Show051]}");
		            parameters.put("show055h", "#{messages[Show052]}");
		            parameters.put("show056h", "#{messages[Show053]}");
		            parameters.put("show057h", "#{messages[Show054]}");
		            parameters.put("show058h", "#{messages[Show055]}");
		            parameters.put("show059h", "#{messages[Show056]}");
		            parameters.put("show060h", "#{messages[Show057]}");
		            parameters.put("show061h", "#{messages[Show058]}");
		            parameters.put("show062h", "#{messages[Show059]}");
		            parameters.put("show063h", "#{messages[Show060]}");
		            parameters.put("show064h", "#{messages[Show061]}");
		            parameters.put("show065h", "#{messages[Show062]}");
		            parameters.put("show066h", "#{messages[Show063]}");
		            parameters.put("show067h", "#{messages[Show064]}");
		            parameters.put("show068h", "#{messages[Show065]}");
		            parameters.put("show069h", "#{messages[Show066]}");
		            parameters.put("show070h", "#{messages[Show067]}");
		            parameters.put("show071h", "#{messages[Show068]}");
		            parameters.put("show072h", "#{messages[Show069]}");
		            parameters.put("show073h", "#{messages[Show070]}");
		            parameters.put("show074h", "#{messages[Show071]}");
		            parameters.put("show075h", "#{messages[Show072]}");
		            parameters.put("show076h", "#{messages[Show073]}");
		            parameters.put("show077h", "#{messages[Show074]}");
		            parameters.put("show078h", "#{messages[Show075]}");
		            parameters.put("show079h", "#{messages[Show076]}");
		            parameters.put("show080h", "#{messages[Show077]}");
		            parameters.put("show081h", "#{messages[Show078]}");
		            parameters.put("show082h", "#{messages[Show079]}");
		            parameters.put("show083h", "#{messages[Show080]}");
		            parameters.put("show084h", "#{messages[Show081]}");
		            parameters.put("show085h", "#{messages[Show082]}");
		            parameters.put("show086h", "#{messages[Show083]}");
		            parameters.put("show087h", "#{messages[Show084]}");
		            parameters.put("show088h", "#{messages[Show085]}");
		            parameters.put("show089h", "#{messages[Show086]}");
		            parameters.put("show090h", "#{messages[Show087]}");
		            parameters.put("show091h", "#{messages[Show088]}");
		            parameters.put("show092h", "#{messages[Show089]}");
		            parameters.put("show093h", "#{messages[Show090]}");
		            parameters.put("show094h", "#{messages[Show091]}");
		            parameters.put("show095h", "#{messages[Show092]}");
		            parameters.put("show096h", "#{messages[Show093]}");
		            parameters.put("show097h", "#{messages[Show094]}");
		            parameters.put("show098h", "#{messages[Show095]}");
		            parameters.put("show099h", "#{messages[Show096]}");
		            parameters.put("show100h", "#{messages[Show097]}");
		            parameters.put("show101h", "#{messages[Show098]}");
		            parameters.put("show102h", "#{messages[Show099]}");
		            parameters.put("show103h", "#{messages[Show100]}");
		            parameters.put("show104h", "#{messages[Show101]}");
		            parameters.put("show105h", "#{messages[Show102]}");
		            parameters.put("show106h", "#{messages[Show103]}");
		            parameters.put("show107h", "#{messages[Show104]}");
		            parameters.put("show108h", "#{messages[Show105]}");
		            parameters.put("show109h", "#{messages[Show106]}");
		            parameters.put("show110h", "#{messages[Show107]}");
		            parameters.put("show111h", "#{messages[Show108]}");
		            parameters.put("show112h", "#{messages[Show109]}");
		            parameters.put("show113h", "#{messages[Show110]}");
		            parameters.put("show114h", "#{messages[Show111]}");
		            parameters.put("show115h", "#{messages[Show112]}");
		            parameters.put("show116h", "#{messages[Show113]}");
		            parameters.put("show117h", "#{messages[Show114]}");
		            parameters.put("show118h", "#{messages[Show115]}");
		            parameters.put("show119h", "#{messages[Show116]}");
		            parameters.put("show120h", "#{messages[Show117]}");
		            parameters.put("show121h", "#{messages[Show118]}");
		            parameters.put("show122h", "#{messages[Show119]}");
		            parameters.put("show123h", "#{messages[Show120]}");
		            parameters.put("show124h", "#{messages[Show121]}");
		            parameters.put("show125h", "#{messages[Show122]}");
		            parameters.put("show126h", "#{messages[Show123]}");
		            parameters.put("show127h", "#{messages[Show124]}");
		            parameters.put("show128h", "#{messages[Show125]}");
		            parameters.put("show129h", "#{messages[Show126]}");
		            parameters.put("show130h", "#{messages[Show127]}");
		            parameters.put("show131h", "#{messages[Show128]}");
		            parameters.put("show132h", "#{messages[Show129]}");
		            parameters.put("show133h", "#{messages[Show130]}");
		            parameters.put("show134h", "#{messages[Show131]}");
		            parameters.put("show135h", "#{messages[Show132]}");
		            parameters.put("show136h", "#{messages[Show133]}");
		            parameters.put("show137h", "#{messages[Show134]}");
		            parameters.put("show138h", "#{messages[Show135]}");
		            parameters.put("show139h", "#{messages[Show136]}");
		            parameters.put("show140h", "#{messages[Show137]}");
		            parameters.put("show141h", "#{messages[Show138]}");
		            parameters.put("show142h", "#{messages[Show139]}");
		            parameters.put("show143h", "#{messages[Show140]}");
		            parameters.put("show144h", "#{messages[Show141]}");
		            parameters.put("show145h", "#{messages[Show142]}");
		            parameters.put("show146h", "#{messages[Show143]}");
		            parameters.put("show147h", "#{messages[Show144]}");
		            parameters.put("show148h", "#{messages[Show145]}");
		            parameters.put("show149h", "#{messages[Show146]}");
		            parameters.put("show150h", "#{messages[Show147]}");
		            parameters.put("show151h", "#{messages[Show148]}");
		            parameters.put("show152h", "#{messages[Show149]}");
		            parameters.put("show153h", "#{messages[Show150]}");
		            parameters.put("show154h", "#{messages[Show151]}");
		            parameters.put("show155h", "#{messages[Show152]}");
		            parameters.put("show156h", "#{messages[Show153]}");
		            parameters.put("show157h", "#{messages[Show154]}");
		            parameters.put("show158h", "#{messages[Show155]}");
		            parameters.put("show159h", "#{messages[Show156]}");
		            parameters.put("show160h", "#{messages[Show157]}");
		            parameters.put("show161h", "#{messages[Show158]}");
		            parameters.put("show162h", "#{messages[Show159]}");
		            parameters.put("show163h", "#{messages[Show160]}");
		            parameters.put("show164h", "#{messages[Show161]}");
		            parameters.put("show165h", "#{messages[Show162]}");
		            parameters.put("show166h", "#{messages[Show163]}");
		            parameters.put("show167h", "#{messages[Show164]}");
		            parameters.put("show168h", "#{messages[Show165]}");
		            parameters.put("show169h", "#{messages[Show166]}");
		            parameters.put("show170h", "#{messages[Show167]}");
		            parameters.put("show171h", "#{messages[Show168]}");
		            parameters.put("show172h", "#{messages[Show169]}");
		            parameters.put("show173h", "#{messages[Show170]}");
		            parameters.put("show174h", "#{messages[Show171]}");
		            parameters.put("show175h", "#{messages[Show172]}");
		            parameters.put("show176h", "#{messages[Show173]}");
		            parameters.put("show177h", "#{messages[Show174]}");
		            parameters.put("show178h", "#{messages[Show175]}");
		            parameters.put("show179h", "#{messages[Show176]}");
		            parameters.put("show180h", "#{messages[Show177]}");
		            parameters.put("show181h", "#{messages[Show178]}");
		            parameters.put("show182h", "#{messages[Show179]}");
		            parameters.put("show183h", "#{messages[Show180]}");
		            parameters.put("show184h", "#{messages[Show181]}");
		            parameters.put("show185h", "#{messages[Show182]}");
		            parameters.put("show186h", "#{messages[Show183]}");
		            parameters.put("show187h", "#{messages[Show184]}");
		            parameters.put("show188h", "#{messages[Show185]}");
		            parameters.put("show189h", "#{messages[Show186]}");
		            parameters.put("show190h", "#{messages[Show187]}");
		            parameters.put("show191h", "#{messages[Show188]}");
		            parameters.put("show192h", "#{messages[Show189]}");
		            parameters.put("show193h", "#{messages[Show190]}");
		            parameters.put("show194h", "#{messages[Show191]}");
		            parameters.put("show195h", "#{messages[Show192]}");
		            parameters.put("show196h", "#{messages[Show193]}");
		            parameters.put("show197h", "#{messages[Show194]}");
		            parameters.put("show198h", "#{messages[Show195]}");
		            parameters.put("show199h", "#{messages[Show196]}");
		            parameters.put("show200h", "#{messages[Show197]}");
		            parameters.put("show201h", "#{messages[Show198]}");
		            parameters.put("show202h", "#{messages[Show199]}");
		            parameters.put("show203h", "#{messages[Show200]}");
		            parameters.put("show204h", "#{messages[Show201]}");
		            parameters.put("show205h", "#{messages[Show202]}");
		            parameters.put("show206h", "#{messages[Show203]}");
		            parameters.put("show207h", "#{messages[Show204]}");
		            parameters.put("show208h", "#{messages[Show205]}");
		            parameters.put("show209h", "#{messages[Show206]}");
		            parameters.put("show210h", "#{messages[Show207]}");
		            parameters.put("show211h", "#{messages[Show208]}");
		            parameters.put("show212h", "#{messages[Show209]}");
		            parameters.put("show213h", "#{messages[Show210]}");
		            parameters.put("show214h", "#{messages[Owner]}");
		            parameters.put("show215h", "#{messages[Statusfl]}");
		            parameters.put("show216h", "#{messages[Statusfldt]}");
		            parameters.put("show217h", "#{messages[Owner2]}");
                 // done with labels, now load corresponding values from truefalses db or if new create 
                 loadTruefalses(); //sets bcontinue
                 // if found bcontinue is true and  report parameters shownnn are already set from db
                 // if not found then create db entry and then load default values for report prefix type
                 // and then persist truefalse
                 // and call loadTruefalses() again 
                 if (!bcontinue){//not found
                    yxxxch5a1xhhxxhxxxxxtruefalseHome.clearInstance();
                    yxxxch5a1xhhxxhxxxxxtruefalse=yxxxch5a1xhhxxhxxxxxtruefalseHome.getInstance();
                    yxxxch5a1xhhxxhxxxxxtruefalse.setA0xxukrdbvxxxxxxxxxxtablename("truefalse");
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
                  FacesMessage.SEVERITY_WARN,bundle.getString("truefalse")+" "+bundle.getString("report")+" "+bundle.getString("generate")+" "+bundle.getString("failed")+" "+e.getMessage(),""));
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


	public String[] getShowColumnNames() {
		return showColumnNames;
	}

	public void setShowColumnNames(String[] showColumnNames ) {
		 this.showColumnNames = showColumnNames;
	}

	public String getSelectedClass() {
		return selectedClass;
	}

	public void setSelectedClass(String selectedClass ) {
		 this.selectedClass = selectedClass;
	}
	public String getSelectedQualifier() {
		return selectedQualifier;
	}

	public void setSelectedQualifier(String selectedQualifier ) {
		 this.selectedQualifier = selectedQualifier;
	}

    public String columnNmToProprtyNm(String jentityName, String colNm){
      //jentityName is  Class name Trexuq277xwwqqhxxxxxcpayment, colNm is column01,matcode ...
      // return genapp 20ch plus prop/column nm , in case of importcsv prop and col nm same, not allways true
      // need better logic for other tables 
      jentityName="com.rcomputer.genapp.model."+jentityName;

               try{
                   Session session = getEntityManager().unwrap(org.hibernate.Session.class);

                   ClassMetadata hibernateMetadata = session.getSessionFactory().getClassMetadata(Class.forName(jentityName));
                   String[] showPropertyNames=hibernateMetadata.getPropertyNames();
  
                   for (int i = 0; i < showPropertyNames.length; i++){
                      if(showPropertyNames[i].substring(20).equals(colNm)){
                       return showPropertyNames[i];
                      } 
                   }     
                                 
                   FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,bundle.getString(jentityName)+" "+bundle.getString("and")+" "+bundle.getString("column")+" "+bundle.getString("name")+" "+colNm+" "+bundle.getString("to")+" "+bundle.getString("property")+" "+bundle.getString("not")+" "+bundle.getString("found"),""));
                   return null;
               }catch(Exception e){
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                   FacesMessage.SEVERITY_ERROR,bundle.getString(jentityName)+" "+bundle.getString("and")+" "+bundle.getString("column")+" "+bundle.getString("name")+" "+colNm+" "+bundle.getString("to")+" "+bundle.getString("property")+" "+bundle.getString("error")+" "+e.getMessage(),""));

                return null ;
               }


     
    }

    public ArrayList<String> entityColumnNames(String jentityName,Boolean trim,Boolean upper,int size){
      //jentityName is  Class name Trexuq277xwwqqhxxxxxcpayment
      jentityName="com.rcomputer.genapp.model."+jentityName;
      mapColumnNames(jentityName,trim,upper);// create array
      ArrayList<String> ret=new ArrayList<String>();
                   for (int i = 0; i < showColumnNames.length; i++){
                    if(showColumnNames[i] != null){
                     ret.add(showColumnNames[i]);
                    }
                    if (i >= size){
                     break;
                    }
                   }     
      return ret;//first 20 ch of property name removed by called method mapColumnNames
     
    }

    /**
    * The following method loads property name values into an array which can be used 
    * as the labels for truefalse table columns to show or hide fields in report for a specific entity
    * called by truefalse edit or list 
    * @return void but populates showColumnNames array
    * @exception no entity class found 
    * @see 
    * 
    */ 

      public void mapColumnNames(String jentityName,Boolean trim,Boolean upper) {
                //jentityName is fully qualified Class name com.rcomputer.genapp.model.Trexuq277xwwqqhxxxxxcpayment 
                if(jentityName != null && jentityName.isEmpty()){
                 jentityName=selectedClass;
                } 
                try{
                   Session session = getEntityManager().unwrap(org.hibernate.Session.class);

                   ClassMetadata hibernateMetadata = session.getSessionFactory().getClassMetadata(Class.forName(jentityName));
                   String[] showPropertyNames=hibernateMetadata.getPropertyNames();
                   // need to trim off 20 ch prefix of property value
                   // skip i=2, no skip except sid
  
                   for (int i = 0; i < showPropertyNames.length; i++){
                     if(trim){
                      showColumnNames[i] = showPropertyNames[i].substring(20);
                     }else{
                      showColumnNames[i] = showPropertyNames[i];
                     }
                     if(upper){
                      showColumnNames[i] = showPropertyNames[i].toUpperCase();
                     }

                   }     
                                 
                   return  ;
               }catch(Exception e){
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                                     FacesMessage.SEVERITY_ERROR,bundle.getString(jentityName)+" "+bundle.getString("map")+" "+bundle.getString("column")+" "+bundle.getString("names")+" "+bundle.getString("names")+" "+e.getMessage(),""));

                return ;
               }

      }



    /**
    * The following method loads all table and class names into a String,String map which can be used 
    * to select table/fully qualified class for which column names will be shown
    * called by step3 importcsvHome mapRow00ToProperty > truefalselist.getClassNames(all 
    * also by step2 importMappingEdit>>ruefalseList.getClassNames('import')
    * @return map of table name,class name
    * assume table name is the same as class name without prefix, classname left as is, upto the calling method
    * or view to remove prefix
    * @exception no entity class found 
    * @see 
    * 
    */ 

      public Map<String,String> getClassNames(String purpose) {
                try{
                   showClassNames=new LinkedHashMap<String,String>();
                   Session session = getEntityManager().unwrap(org.hibernate.Session.class);
                   Map<String, ClassMetadata> m = (Map<String, ClassMetadata>) session.getSessionFactory().getAllClassMetadata();
                   for(String entityName : m.keySet()){
                    if(purpose.equals("import")){
                     //filter in a subset for now
                     if(entityName.substring(47).equals("customer") || entityName.substring(47).equals("division") 
                      || entityName.substring(47).equals("vendor")  || entityName.substring(47).equals("employee")
                      || entityName.substring(47).equals("item")  || entityName.substring(47).equals("schedule")
                      || entityName.substring(47).equals("address")  || entityName.substring(47).equals("user")
                      || entityName.substring(47).equals("rate1f")  || entityName.substring(47).equals("account")
                      || entityName.substring(47).equals("acintegr")  || entityName.substring(47).equals("blobdata")
                      || entityName.substring(47).equals("clobdata")  
                       ){
                      showClassNames.put(entityName.substring(47),entityName);
                     }                     
                    }else{
                      showClassNames.put(entityName.substring(47),entityName);
                    }
                   }//for end
                   Map<String, String> treeMap = new TreeMap<String, String>(showClassNames);
                   return  treeMap;
               }catch(Exception e){
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                 FacesMessage.SEVERITY_ERROR,bundle.getString("get")+" "+bundle.getString("class")+" "+bundle.getString("names")+" "+bundle.getString("error")+" "+e.getMessage(),""));

                return null;
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
                      .setParameter("tableName", "truefalse")
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
			    parameters.put("show002", true);
			    parameters.put("show003", true);
			    parameters.put("show004", true);
			    parameters.put("show005", true);
			    parameters.put("show006", true);
			    parameters.put("show007", true);
			    parameters.put("show008", true);
			    parameters.put("show009", true);
			    parameters.put("show010", true);
			    parameters.put("show011", true);
			    parameters.put("show012", true);
			    parameters.put("show013", true);
			    parameters.put("show014", true);
			    parameters.put("show015", true);
			    parameters.put("show016", true);
			    parameters.put("show017", true);
			    parameters.put("show018", true);
			    parameters.put("show019", true);
			    parameters.put("show020", true);
			    parameters.put("show021", true);
			    parameters.put("show022", true);
			    parameters.put("show023", true);
			    parameters.put("show024", true);
			    parameters.put("show025", true);
			    parameters.put("show026", true);
			    parameters.put("show027", true);
			    parameters.put("show028", true);
			    parameters.put("show029", true);
			    parameters.put("show030", true);
			    parameters.put("show031", true);
			    parameters.put("show032", true);
			    parameters.put("show033", true);
			    parameters.put("show034", true);
			    parameters.put("show035", true);
			    parameters.put("show036", true);
			    parameters.put("show037", true);
			    parameters.put("show038", true);
			    parameters.put("show039", true);
			    parameters.put("show040", true);
			    parameters.put("show041", true);
			    parameters.put("show042", true);
			    parameters.put("show043", true);
			    parameters.put("show044", true);
			    parameters.put("show045", true);
			    parameters.put("show046", true);
			    parameters.put("show047", true);
			    parameters.put("show048", true);
			    parameters.put("show049", true);
			    parameters.put("show050", true);
			    parameters.put("show051", true);
			    parameters.put("show052", true);
			    parameters.put("show053", true);
			    parameters.put("show054", true);
			    parameters.put("show055", true);
			    parameters.put("show056", true);
			    parameters.put("show057", true);
			    parameters.put("show058", true);
			    parameters.put("show059", true);
			    parameters.put("show060", true);
			    parameters.put("show061", true);
			    parameters.put("show062", true);
			    parameters.put("show063", true);
			    parameters.put("show064", true);
			    parameters.put("show065", true);
			    parameters.put("show066", true);
			    parameters.put("show067", true);
			    parameters.put("show068", true);
			    parameters.put("show069", true);
			    parameters.put("show070", true);
			    parameters.put("show071", true);
			    parameters.put("show072", true);
			    parameters.put("show073", true);
			    parameters.put("show074", true);
			    parameters.put("show075", true);
			    parameters.put("show076", true);
			    parameters.put("show077", true);
			    parameters.put("show078", true);
			    parameters.put("show079", true);
			    parameters.put("show080", true);
			    parameters.put("show081", true);
			    parameters.put("show082", true);
			    parameters.put("show083", true);
			    parameters.put("show084", true);
			    parameters.put("show085", true);
			    parameters.put("show086", true);
			    parameters.put("show087", true);
			    parameters.put("show088", true);
			    parameters.put("show089", true);
			    parameters.put("show090", true);
			    parameters.put("show091", true);
			    parameters.put("show092", true);
			    parameters.put("show093", true);
			    parameters.put("show094", true);
			    parameters.put("show095", true);
			    parameters.put("show096", true);
			    parameters.put("show097", true);
			    parameters.put("show098", true);
			    parameters.put("show099", true);
			    parameters.put("show100", true);
			    parameters.put("show101", true);
			    parameters.put("show102", true);
			    parameters.put("show103", true);
			    parameters.put("show104", true);
			    parameters.put("show105", true);
			    parameters.put("show106", true);
			    parameters.put("show107", true);
			    parameters.put("show108", true);
			    parameters.put("show109", true);
			    parameters.put("show110", true);
			    parameters.put("show111", true);
			    parameters.put("show112", true);
			    parameters.put("show113", true);
			    parameters.put("show114", true);
			    parameters.put("show115", true);
			    parameters.put("show116", true);
			    parameters.put("show117", true);
			    parameters.put("show118", true);
			    parameters.put("show119", true);
			    parameters.put("show120", true);
			    parameters.put("show121", true);
			    parameters.put("show122", true);
			    parameters.put("show123", true);
			    parameters.put("show124", true);
			    parameters.put("show125", true);
			    parameters.put("show126", true);
			    parameters.put("show127", true);
			    parameters.put("show128", true);
			    parameters.put("show129", true);
			    parameters.put("show130", true);
			    parameters.put("show131", true);
			    parameters.put("show132", true);
			    parameters.put("show133", true);
			    parameters.put("show134", true);
			    parameters.put("show135", true);
			    parameters.put("show136", true);
			    parameters.put("show137", true);
			    parameters.put("show138", true);
			    parameters.put("show139", true);
			    parameters.put("show140", true);
			    parameters.put("show141", true);
			    parameters.put("show142", true);
			    parameters.put("show143", true);
			    parameters.put("show144", true);
			    parameters.put("show145", true);
			    parameters.put("show146", true);
			    parameters.put("show147", true);
			    parameters.put("show148", true);
			    parameters.put("show149", true);
			    parameters.put("show150", true);
			    parameters.put("show151", true);
			    parameters.put("show152", true);
			    parameters.put("show153", true);
			    parameters.put("show154", true);
			    parameters.put("show155", true);
			    parameters.put("show156", true);
			    parameters.put("show157", true);
			    parameters.put("show158", true);
			    parameters.put("show159", true);
			    parameters.put("show160", true);
			    parameters.put("show161", true);
			    parameters.put("show162", true);
			    parameters.put("show163", true);
			    parameters.put("show164", true);
			    parameters.put("show165", true);
			    parameters.put("show166", true);
			    parameters.put("show167", true);
			    parameters.put("show168", true);
			    parameters.put("show169", true);
			    parameters.put("show170", true);
			    parameters.put("show171", true);
			    parameters.put("show172", true);
			    parameters.put("show173", true);
			    parameters.put("show174", true);
			    parameters.put("show175", true);
			    parameters.put("show176", true);
			    parameters.put("show177", true);
			    parameters.put("show178", true);
			    parameters.put("show179", true);
			    parameters.put("show180", true);
			    parameters.put("show181", true);
			    parameters.put("show182", true);
			    parameters.put("show183", true);
			    parameters.put("show184", true);
			    parameters.put("show185", true);
			    parameters.put("show186", true);
			    parameters.put("show187", true);
			    parameters.put("show188", true);
			    parameters.put("show189", true);
			    parameters.put("show190", true);
			    parameters.put("show191", true);
			    parameters.put("show192", true);
			    parameters.put("show193", true);
			    parameters.put("show194", true);
			    parameters.put("show195", true);
			    parameters.put("show196", true);
			    parameters.put("show197", true);
			    parameters.put("show198", true);
			    parameters.put("show199", true);
			    parameters.put("show200", true);
			    parameters.put("show201", true);
			    parameters.put("show202", true);
			    parameters.put("show203", true);
			    parameters.put("show204", true);
			    parameters.put("show205", true);
			    parameters.put("show206", true);
			    parameters.put("show207", true);
			    parameters.put("show208", true);
			    parameters.put("show209", true);
			    parameters.put("show210", true);
			    parameters.put("show211", true);
			    parameters.put("show212", true);
			    parameters.put("show213", true);
			    parameters.put("show214", true);
			    parameters.put("show215", true);
			    parameters.put("show216", true);
			    parameters.put("show217", true);
			    parameters.put("show218", true);
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
         /// header("X-SMTPAPI",headers) for m:header name="X-SMTPAPI" value="#{yxxxch5a1xhhxxhxxxxxtruefalseList.headers}" 
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
         String useTemplate="truefalseMailingContent.fmt";
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
          useTemplate="truefalseeMailingContent.fmt";
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
                            new InputStreamAttachment("truefalse.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
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
                            new InputStreamAttachment("truefalse.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
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
                            new InputStreamAttachment("truefalse.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
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
                            new InputStreamAttachment("truefalse.pdf", "application/pdf", ContentDisposition.ATTACHMENT,new ByteArrayInputStream(this.getMailingBytes()))).send();
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
          //reportName="xxYxxxch5a1xhhxxhxxxxxtruefalse";  holds selected report
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
         //renderer.render("/truefalseeMailingContent.xhtml");
         emailRender("/truefalseeMailingContent.xhtml","e");
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
   public List<Yxxxch5a1xhhxxhxxxxxtruefalse> getResultList(){
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
