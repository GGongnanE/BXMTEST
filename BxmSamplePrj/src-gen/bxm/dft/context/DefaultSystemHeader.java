/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.context;


import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import bxm.omm.predict.FieldInfo;
import javax.xml.bind.annotation.XmlType;
import bxm.omm.annotation.BxmOmm_Field;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlRootElement;
import bxm.omm.predict.Predictable;
import java.util.Hashtable;
import javax.xml.bind.annotation.XmlElement;

/**
 * @Description Default customizing extension을 위한 system header
 */
@XmlType(propOrder={"msgLen", "guid", "trxCd", "sysCd", "chlType", "clientIp", "msgReqDttm", "msgResDttm", "trxBranchNo", "trxTerminalNo", "userId", "apprTrxYn", "apprUserId", "screenId", "langCd", "resCd", "edayYn", "domainId", "filler", "msgCd", "msgCnt", "msgs"}, name="DefaultSystemHeader")
@XmlRootElement(name="DefaultSystemHeader")
@SuppressWarnings("all")
public class DefaultSystemHeader  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 615816395L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "Default customizing extension을 위한 system header";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << msgLen >> [[ */
	
	@XmlTransient
	private boolean isSet_msgLen = false;
	
	protected boolean isSet_msgLen()
	{
		return this.isSet_msgLen;
	}
	
	protected void setIsSet_msgLen(boolean value)
	{
		this.isSet_msgLen = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="전문길이", formatType="", format="", align="right", length=8, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Long msgLen  = 0L;
	
	/**
	 * 
	 * @Description 전문길이
	 */
	@XmlElement(nillable=true)
	public java.lang.Long getMsgLen(){
		return msgLen;
	}
	
	/**
	 * 
	 * @Description 전문길이
	 */
	@JsonProperty("msgLen")
	public void setMsgLen( java.lang.Long msgLen ) {
		isSet_msgLen = true;
		this.msgLen = msgLen;
	}
	/**
	 * 
	 * @Description 전문길이
	 */
	public void setMsgLen( int msgLen ) {
		isSet_msgLen = true;
		this.msgLen = java.lang.Long.valueOf(msgLen);
	}
	
	/** Property set << msgLen >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << guid >> [[ */
	
	@XmlTransient
	private boolean isSet_guid = false;
	
	protected boolean isSet_guid()
	{
		return this.isSet_guid;
	}
	
	protected void setIsSet_guid(boolean value)
	{
		this.isSet_guid = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="Global unique id", formatType="", format="", align="left", length=40, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String guid  = null;
	
	/**
	 * 
	 * @Description Global unique id
	 */
	@XmlElement(nillable=true)
	public java.lang.String getGuid(){
		return guid;
	}
	
	/**
	 * 
	 * @Description Global unique id
	 */
	@JsonProperty("guid")
	public void setGuid( java.lang.String guid ) {
		isSet_guid = true;
		this.guid = guid;
	}
	
	/** Property set << guid >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << trxCd >> [[ */
	
	@XmlTransient
	private boolean isSet_trxCd = false;
	
	protected boolean isSet_trxCd()
	{
		return this.isSet_trxCd;
	}
	
	protected void setIsSet_trxCd(boolean value)
	{
		this.isSet_trxCd = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="거래코드", formatType="", format="", align="left", length=12, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String trxCd  = null;
	
	/**
	 * 
	 * @Description 거래코드
	 */
	@XmlElement(nillable=true)
	public java.lang.String getTrxCd(){
		return trxCd;
	}
	
	/**
	 * 
	 * @Description 거래코드
	 */
	@JsonProperty("trxCd")
	public void setTrxCd( java.lang.String trxCd ) {
		isSet_trxCd = true;
		this.trxCd = trxCd;
	}
	
	/** Property set << trxCd >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << sysCd >> [[ */
	
	@XmlTransient
	private boolean isSet_sysCd = false;
	
	protected boolean isSet_sysCd()
	{
		return this.isSet_sysCd;
	}
	
	protected void setIsSet_sysCd(boolean value)
	{
		this.isSet_sysCd = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="시스템코드", formatType="", format="", align="left", length=3, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String sysCd  = null;
	
	/**
	 * 
	 * @Description 시스템코드
	 */
	@XmlElement(nillable=true)
	public java.lang.String getSysCd(){
		return sysCd;
	}
	
	/**
	 * 
	 * @Description 시스템코드
	 */
	@JsonProperty("sysCd")
	public void setSysCd( java.lang.String sysCd ) {
		isSet_sysCd = true;
		this.sysCd = sysCd;
	}
	
	/** Property set << sysCd >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << chlType >> [[ */
	
	@XmlTransient
	private boolean isSet_chlType = false;
	
	protected boolean isSet_chlType()
	{
		return this.isSet_chlType;
	}
	
	protected void setIsSet_chlType(boolean value)
	{
		this.isSet_chlType = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="채널유형", formatType="", format="", align="left", length=2, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String chlType  = null;
	
	/**
	 * 
	 * @Description 채널유형
	 */
	@XmlElement(nillable=true)
	public java.lang.String getChlType(){
		return chlType;
	}
	
	/**
	 * 
	 * @Description 채널유형
	 */
	@JsonProperty("chlType")
	public void setChlType( java.lang.String chlType ) {
		isSet_chlType = true;
		this.chlType = chlType;
	}
	
	/** Property set << chlType >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << clientIp >> [[ */
	
	@XmlTransient
	private boolean isSet_clientIp = false;
	
	protected boolean isSet_clientIp()
	{
		return this.isSet_clientIp;
	}
	
	protected void setIsSet_clientIp(boolean value)
	{
		this.isSet_clientIp = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="클라이언트IP", formatType="", format="", align="left", length=15, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String clientIp  = null;
	
	/**
	 * 
	 * @Description 클라이언트IP
	 */
	@XmlElement(nillable=true)
	public java.lang.String getClientIp(){
		return clientIp;
	}
	
	/**
	 * 
	 * @Description 클라이언트IP
	 */
	@JsonProperty("clientIp")
	public void setClientIp( java.lang.String clientIp ) {
		isSet_clientIp = true;
		this.clientIp = clientIp;
	}
	
	/** Property set << clientIp >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << msgReqDttm >> [[ */
	
	@XmlTransient
	private boolean isSet_msgReqDttm = false;
	
	protected boolean isSet_msgReqDttm()
	{
		return this.isSet_msgReqDttm;
	}
	
	protected void setIsSet_msgReqDttm(boolean value)
	{
		this.isSet_msgReqDttm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="전문요청시간", formatType="", format="", align="left", length=16, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String msgReqDttm  = null;
	
	/**
	 * 
	 * @Description 전문요청시간
	 */
	@XmlElement(nillable=true)
	public java.lang.String getMsgReqDttm(){
		return msgReqDttm;
	}
	
	/**
	 * 
	 * @Description 전문요청시간
	 */
	@JsonProperty("msgReqDttm")
	public void setMsgReqDttm( java.lang.String msgReqDttm ) {
		isSet_msgReqDttm = true;
		this.msgReqDttm = msgReqDttm;
	}
	
	/** Property set << msgReqDttm >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << msgResDttm >> [[ */
	
	@XmlTransient
	private boolean isSet_msgResDttm = false;
	
	protected boolean isSet_msgResDttm()
	{
		return this.isSet_msgResDttm;
	}
	
	protected void setIsSet_msgResDttm(boolean value)
	{
		this.isSet_msgResDttm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="전문응답시간", formatType="", format="", align="left", length=16, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String msgResDttm  = null;
	
	/**
	 * 
	 * @Description 전문응답시간
	 */
	@XmlElement(nillable=true)
	public java.lang.String getMsgResDttm(){
		return msgResDttm;
	}
	
	/**
	 * 
	 * @Description 전문응답시간
	 */
	@JsonProperty("msgResDttm")
	public void setMsgResDttm( java.lang.String msgResDttm ) {
		isSet_msgResDttm = true;
		this.msgResDttm = msgResDttm;
	}
	
	/** Property set << msgResDttm >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << trxBranchNo >> [[ */
	
	@XmlTransient
	private boolean isSet_trxBranchNo = false;
	
	protected boolean isSet_trxBranchNo()
	{
		return this.isSet_trxBranchNo;
	}
	
	protected void setIsSet_trxBranchNo(boolean value)
	{
		this.isSet_trxBranchNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="거래지점번호", formatType="", format="", align="left", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String trxBranchNo  = null;
	
	/**
	 * 
	 * @Description 거래지점번호
	 */
	@XmlElement(nillable=true)
	public java.lang.String getTrxBranchNo(){
		return trxBranchNo;
	}
	
	/**
	 * 
	 * @Description 거래지점번호
	 */
	@JsonProperty("trxBranchNo")
	public void setTrxBranchNo( java.lang.String trxBranchNo ) {
		isSet_trxBranchNo = true;
		this.trxBranchNo = trxBranchNo;
	}
	
	/** Property set << trxBranchNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << trxTerminalNo >> [[ */
	
	@XmlTransient
	private boolean isSet_trxTerminalNo = false;
	
	protected boolean isSet_trxTerminalNo()
	{
		return this.isSet_trxTerminalNo;
	}
	
	protected void setIsSet_trxTerminalNo(boolean value)
	{
		this.isSet_trxTerminalNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="거래단말번호", formatType="", format="", align="left", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String trxTerminalNo  = null;
	
	/**
	 * 
	 * @Description 거래단말번호
	 */
	@XmlElement(nillable=true)
	public java.lang.String getTrxTerminalNo(){
		return trxTerminalNo;
	}
	
	/**
	 * 
	 * @Description 거래단말번호
	 */
	@JsonProperty("trxTerminalNo")
	public void setTrxTerminalNo( java.lang.String trxTerminalNo ) {
		isSet_trxTerminalNo = true;
		this.trxTerminalNo = trxTerminalNo;
	}
	
	/** Property set << trxTerminalNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << userId >> [[ */
	
	@XmlTransient
	private boolean isSet_userId = false;
	
	protected boolean isSet_userId()
	{
		return this.isSet_userId;
	}
	
	protected void setIsSet_userId(boolean value)
	{
		this.isSet_userId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="조작자ID", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String userId  = null;
	
	/**
	 * 
	 * @Description 조작자ID
	 */
	@XmlElement(nillable=true)
	public java.lang.String getUserId(){
		return userId;
	}
	
	/**
	 * 
	 * @Description 조작자ID
	 */
	@JsonProperty("userId")
	public void setUserId( java.lang.String userId ) {
		isSet_userId = true;
		this.userId = userId;
	}
	
	/** Property set << userId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << apprTrxYn >> [[ */
	
	@XmlTransient
	private boolean isSet_apprTrxYn = false;
	
	protected boolean isSet_apprTrxYn()
	{
		return this.isSet_apprTrxYn;
	}
	
	protected void setIsSet_apprTrxYn(boolean value)
	{
		this.isSet_apprTrxYn = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="승인자거래여부", formatType="", format="", align="left", length=1, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String apprTrxYn  = null;
	
	/**
	 * 
	 * @Description 승인자거래여부
	 */
	@XmlElement(nillable=true)
	public java.lang.String getApprTrxYn(){
		return apprTrxYn;
	}
	
	/**
	 * 
	 * @Description 승인자거래여부
	 */
	@JsonProperty("apprTrxYn")
	public void setApprTrxYn( java.lang.String apprTrxYn ) {
		isSet_apprTrxYn = true;
		this.apprTrxYn = apprTrxYn;
	}
	
	/** Property set << apprTrxYn >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << apprUserId >> [[ */
	
	@XmlTransient
	private boolean isSet_apprUserId = false;
	
	protected boolean isSet_apprUserId()
	{
		return this.isSet_apprUserId;
	}
	
	protected void setIsSet_apprUserId(boolean value)
	{
		this.isSet_apprUserId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="승인자ID", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String apprUserId  = null;
	
	/**
	 * 
	 * @Description 승인자ID
	 */
	@XmlElement(nillable=true)
	public java.lang.String getApprUserId(){
		return apprUserId;
	}
	
	/**
	 * 
	 * @Description 승인자ID
	 */
	@JsonProperty("apprUserId")
	public void setApprUserId( java.lang.String apprUserId ) {
		isSet_apprUserId = true;
		this.apprUserId = apprUserId;
	}
	
	/** Property set << apprUserId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << screenId >> [[ */
	
	@XmlTransient
	private boolean isSet_screenId = false;
	
	protected boolean isSet_screenId()
	{
		return this.isSet_screenId;
	}
	
	protected void setIsSet_screenId(boolean value)
	{
		this.isSet_screenId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="화면ID", formatType="", format="", align="left", length=10, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String screenId  = null;
	
	/**
	 * 
	 * @Description 화면ID
	 */
	@XmlElement(nillable=true)
	public java.lang.String getScreenId(){
		return screenId;
	}
	
	/**
	 * 
	 * @Description 화면ID
	 */
	@JsonProperty("screenId")
	public void setScreenId( java.lang.String screenId ) {
		isSet_screenId = true;
		this.screenId = screenId;
	}
	
	/** Property set << screenId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << langCd >> [[ */
	
	@XmlTransient
	private boolean isSet_langCd = false;
	
	protected boolean isSet_langCd()
	{
		return this.isSet_langCd;
	}
	
	protected void setIsSet_langCd(boolean value)
	{
		this.isSet_langCd = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="언어코드", formatType="", format="", align="left", length=2, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String langCd  = null;
	
	/**
	 * 
	 * @Description 언어코드
	 */
	@XmlElement(nillable=true)
	public java.lang.String getLangCd(){
		return langCd;
	}
	
	/**
	 * 
	 * @Description 언어코드
	 */
	@JsonProperty("langCd")
	public void setLangCd( java.lang.String langCd ) {
		isSet_langCd = true;
		this.langCd = langCd;
	}
	
	/** Property set << langCd >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << resCd >> [[ */
	
	@XmlTransient
	private boolean isSet_resCd = false;
	
	protected boolean isSet_resCd()
	{
		return this.isSet_resCd;
	}
	
	protected void setIsSet_resCd(boolean value)
	{
		this.isSet_resCd = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="응답코드", formatType="", format="", align="left", length=1, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String resCd  = null;
	
	/**
	 * 
	 * @Description 응답코드
	 */
	@XmlElement(nillable=true)
	public java.lang.String getResCd(){
		return resCd;
	}
	
	/**
	 * 
	 * @Description 응답코드
	 */
	@JsonProperty("resCd")
	public void setResCd( java.lang.String resCd ) {
		isSet_resCd = true;
		this.resCd = resCd;
	}
	
	/** Property set << resCd >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << edayYn >> [[ */
	
	@XmlTransient
	private boolean isSet_edayYn = false;
	
	protected boolean isSet_edayYn()
	{
		return this.isSet_edayYn;
	}
	
	protected void setIsSet_edayYn(boolean value)
	{
		this.isSet_edayYn = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="마감여부", formatType="", format="", align="left", length=1, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String edayYn  = null;
	
	/**
	 * 
	 * @Description 마감여부
	 */
	@XmlElement(nillable=true)
	public java.lang.String getEdayYn(){
		return edayYn;
	}
	
	/**
	 * 
	 * @Description 마감여부
	 */
	@JsonProperty("edayYn")
	public void setEdayYn( java.lang.String edayYn ) {
		isSet_edayYn = true;
		this.edayYn = edayYn;
	}
	
	/** Property set << edayYn >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << domainId >> [[ */
	
	@XmlTransient
	private boolean isSet_domainId = false;
	
	protected boolean isSet_domainId()
	{
		return this.isSet_domainId;
	}
	
	protected void setIsSet_domainId(boolean value)
	{
		this.isSet_domainId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="domain id", formatType="", format="", align="left", length=14, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String domainId  = null;
	
	/**
	 * 
	 * @Description domain id
	 */
	@XmlElement(nillable=true)
	public java.lang.String getDomainId(){
		return domainId;
	}
	
	/**
	 * 
	 * @Description domain id
	 */
	@JsonProperty("domainId")
	public void setDomainId( java.lang.String domainId ) {
		isSet_domainId = true;
		this.domainId = domainId;
	}
	
	/** Property set << domainId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << filler >> [[ */
	
	@XmlTransient
	private boolean isSet_filler = false;
	
	protected boolean isSet_filler()
	{
		return this.isSet_filler;
	}
	
	protected void setIsSet_filler(boolean value)
	{
		this.isSet_filler = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="filler", formatType="", format="", align="left", length=35, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String filler  = null;
	
	/**
	 * domain id추가로 길이조정 : 49->35
	 * @Description filler
	 */
	@XmlElement(nillable=true)
	public java.lang.String getFiller(){
		return filler;
	}
	
	/**
	 * domain id추가로 길이조정 : 49->35
	 * @Description filler
	 */
	@JsonProperty("filler")
	public void setFiller( java.lang.String filler ) {
		isSet_filler = true;
		this.filler = filler;
	}
	
	/** Property set << filler >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << msgCd >> [[ */
	
	@XmlTransient
	private boolean isSet_msgCd = false;
	
	protected boolean isSet_msgCd()
	{
		return this.isSet_msgCd;
	}
	
	protected void setIsSet_msgCd(boolean value)
	{
		this.isSet_msgCd = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="메시지코드", formatType="", format="", align="left", length=9, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String msgCd  = null;
	
	/**
	 * 
	 * @Description 메시지코드
	 */
	@XmlElement(nillable=true)
	public java.lang.String getMsgCd(){
		return msgCd;
	}
	
	/**
	 * 
	 * @Description 메시지코드
	 */
	@JsonProperty("msgCd")
	public void setMsgCd( java.lang.String msgCd ) {
		isSet_msgCd = true;
		this.msgCd = msgCd;
	}
	
	/** Property set << msgCd >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << msgCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_msgCnt = false;
	
	protected boolean isSet_msgCnt()
	{
		return this.isSet_msgCnt;
	}
	
	protected void setIsSet_msgCnt(boolean value)
	{
		this.isSet_msgCnt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="메시지갯수", formatType="", format="", align="right", length=5, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer msgCnt  = 0;
	
	/**
	 * 
	 * @Description 메시지갯수
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getMsgCnt(){
		/*
		 * 이 변수는 배열 또는 BLOB, CLOB에 의해 참조 되는 변수 입니다.
		 */
		if ( isSet_msgCnt )	return msgCnt;
		else
		{
			if ( msgs == null || msgs.size() == 0 ) return 0;
			else return msgs.size();
		}
	}
	
	/**
	 * 
	 * @Description 메시지갯수
	 */
	@JsonProperty("msgCnt")
	public void setMsgCnt( java.lang.Integer msgCnt ) {
		isSet_msgCnt = true;
		this.msgCnt = msgCnt;
	}
	
	/** Property set << msgCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << msgs >> [[ */
	
	@XmlTransient
	private boolean isSet_msgs = false;
	
	protected boolean isSet_msgs()
	{
		return this.isSet_msgs;
	}
	
	protected void setIsSet_msgs(boolean value)
	{
		this.isSet_msgs = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="메시지", formatType="", format="", align="left", length=200, decimal=0, arrayReference="msgCnt", fill="", encrypt="", validationRule="")
	private java.util.List<bxm.dft.context.DefaultMessage> msgs  = new java.util.ArrayList<bxm.dft.context.DefaultMessage>();
	
	/**
	 * 
	 * @Description 메시지
	 */
	public java.util.List<bxm.dft.context.DefaultMessage>  getMsgs(){
		return msgs;
	}
	
	/**
	 * 
	 * @Description 메시지
	 */
	@JsonProperty("msgs")
	public void setMsgs( java.util.List<bxm.dft.context.DefaultMessage> msgs ) {
		isSet_msgs = true;
		this.msgs = msgs;
	}
	
	/** Property set << msgs >> ]]
	*******************************************************************************************************************************/

	@Override
	public DefaultSystemHeader clone(){
		try{
			DefaultSystemHeader object= (DefaultSystemHeader)super.clone();
			
			if ( this.msgs== null ) object.msgs = null;
			else{
				java.util.List<bxm.dft.context.DefaultMessage> clonedList = new java.util.ArrayList<bxm.dft.context.DefaultMessage>(msgs.size());
				for( bxm.dft.context.DefaultMessage item : msgs ){
					clonedList.add( (bxm.dft.context.DefaultMessage)item.clone());
				}
				object.msgs = clonedList;
			}
			
			return object;
		} 
		catch(CloneNotSupportedException e){
			throw new bxm.omm.exception.CloneFailedException();
		}
	}

	@Override
	public int hashCode(){
		final int prime=31;
		int result = 1;
		
		result = prime * result + ((msgLen==null)?0:msgLen.hashCode());
		result = prime * result + ((guid==null)?0:guid.hashCode());
		result = prime * result + ((trxCd==null)?0:trxCd.hashCode());
		result = prime * result + ((sysCd==null)?0:sysCd.hashCode());
		result = prime * result + ((chlType==null)?0:chlType.hashCode());
		result = prime * result + ((clientIp==null)?0:clientIp.hashCode());
		result = prime * result + ((msgReqDttm==null)?0:msgReqDttm.hashCode());
		result = prime * result + ((msgResDttm==null)?0:msgResDttm.hashCode());
		result = prime * result + ((trxBranchNo==null)?0:trxBranchNo.hashCode());
		result = prime * result + ((trxTerminalNo==null)?0:trxTerminalNo.hashCode());
		result = prime * result + ((userId==null)?0:userId.hashCode());
		result = prime * result + ((apprTrxYn==null)?0:apprTrxYn.hashCode());
		result = prime * result + ((apprUserId==null)?0:apprUserId.hashCode());
		result = prime * result + ((screenId==null)?0:screenId.hashCode());
		result = prime * result + ((langCd==null)?0:langCd.hashCode());
		result = prime * result + ((resCd==null)?0:resCd.hashCode());
		result = prime * result + ((edayYn==null)?0:edayYn.hashCode());
		result = prime * result + ((domainId==null)?0:domainId.hashCode());
		result = prime * result + ((filler==null)?0:filler.hashCode());
		result = prime * result + ((msgCd==null)?0:msgCd.hashCode());
		result = prime * result + ((msgCnt==null)?0:msgCnt.hashCode());
		result = prime * result + ((msgs==null)?0:msgs.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.context.DefaultSystemHeader other= (bxm.dft.context.DefaultSystemHeader)obj;
		if ( msgLen == null){
			if ( other.msgLen != null ) return false;
		}
		else if ( !msgLen.equals(other.msgLen) )
			return false;
		if ( guid == null){
			if ( other.guid != null ) return false;
		}
		else if ( !guid.equals(other.guid) )
			return false;
		if ( trxCd == null){
			if ( other.trxCd != null ) return false;
		}
		else if ( !trxCd.equals(other.trxCd) )
			return false;
		if ( sysCd == null){
			if ( other.sysCd != null ) return false;
		}
		else if ( !sysCd.equals(other.sysCd) )
			return false;
		if ( chlType == null){
			if ( other.chlType != null ) return false;
		}
		else if ( !chlType.equals(other.chlType) )
			return false;
		if ( clientIp == null){
			if ( other.clientIp != null ) return false;
		}
		else if ( !clientIp.equals(other.clientIp) )
			return false;
		if ( msgReqDttm == null){
			if ( other.msgReqDttm != null ) return false;
		}
		else if ( !msgReqDttm.equals(other.msgReqDttm) )
			return false;
		if ( msgResDttm == null){
			if ( other.msgResDttm != null ) return false;
		}
		else if ( !msgResDttm.equals(other.msgResDttm) )
			return false;
		if ( trxBranchNo == null){
			if ( other.trxBranchNo != null ) return false;
		}
		else if ( !trxBranchNo.equals(other.trxBranchNo) )
			return false;
		if ( trxTerminalNo == null){
			if ( other.trxTerminalNo != null ) return false;
		}
		else if ( !trxTerminalNo.equals(other.trxTerminalNo) )
			return false;
		if ( userId == null){
			if ( other.userId != null ) return false;
		}
		else if ( !userId.equals(other.userId) )
			return false;
		if ( apprTrxYn == null){
			if ( other.apprTrxYn != null ) return false;
		}
		else if ( !apprTrxYn.equals(other.apprTrxYn) )
			return false;
		if ( apprUserId == null){
			if ( other.apprUserId != null ) return false;
		}
		else if ( !apprUserId.equals(other.apprUserId) )
			return false;
		if ( screenId == null){
			if ( other.screenId != null ) return false;
		}
		else if ( !screenId.equals(other.screenId) )
			return false;
		if ( langCd == null){
			if ( other.langCd != null ) return false;
		}
		else if ( !langCd.equals(other.langCd) )
			return false;
		if ( resCd == null){
			if ( other.resCd != null ) return false;
		}
		else if ( !resCd.equals(other.resCd) )
			return false;
		if ( edayYn == null){
			if ( other.edayYn != null ) return false;
		}
		else if ( !edayYn.equals(other.edayYn) )
			return false;
		if ( domainId == null){
			if ( other.domainId != null ) return false;
		}
		else if ( !domainId.equals(other.domainId) )
			return false;
		if ( filler == null){
			if ( other.filler != null ) return false;
		}
		else if ( !filler.equals(other.filler) )
			return false;
		if ( msgCd == null){
			if ( other.msgCd != null ) return false;
		}
		else if ( !msgCd.equals(other.msgCd) )
			return false;
		if ( msgCnt == null){
			if ( other.msgCnt != null ) return false;
		}
		else if ( !msgCnt.equals(other.msgCnt) )
			return false;
		if ( msgs == null){
			if ( other.msgs != null ) return false;
		}
		else if ( !msgs.equals(other.msgs) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.context.DefaultSystemHeader:\n");
		sb.append("\tmsgLen: ");
		sb.append(msgLen==null?"null":getMsgLen());
		sb.append("\n");
		sb.append("\tguid: ");
		sb.append(guid==null?"null":getGuid());
		sb.append("\n");
		sb.append("\ttrxCd: ");
		sb.append(trxCd==null?"null":getTrxCd());
		sb.append("\n");
		sb.append("\tsysCd: ");
		sb.append(sysCd==null?"null":getSysCd());
		sb.append("\n");
		sb.append("\tchlType: ");
		sb.append(chlType==null?"null":getChlType());
		sb.append("\n");
		sb.append("\tclientIp: ");
		sb.append(clientIp==null?"null":getClientIp());
		sb.append("\n");
		sb.append("\tmsgReqDttm: ");
		sb.append(msgReqDttm==null?"null":getMsgReqDttm());
		sb.append("\n");
		sb.append("\tmsgResDttm: ");
		sb.append(msgResDttm==null?"null":getMsgResDttm());
		sb.append("\n");
		sb.append("\ttrxBranchNo: ");
		sb.append(trxBranchNo==null?"null":getTrxBranchNo());
		sb.append("\n");
		sb.append("\ttrxTerminalNo: ");
		sb.append(trxTerminalNo==null?"null":getTrxTerminalNo());
		sb.append("\n");
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("\tapprTrxYn: ");
		sb.append(apprTrxYn==null?"null":getApprTrxYn());
		sb.append("\n");
		sb.append("\tapprUserId: ");
		sb.append(apprUserId==null?"null":getApprUserId());
		sb.append("\n");
		sb.append("\tscreenId: ");
		sb.append(screenId==null?"null":getScreenId());
		sb.append("\n");
		sb.append("\tlangCd: ");
		sb.append(langCd==null?"null":getLangCd());
		sb.append("\n");
		sb.append("\tresCd: ");
		sb.append(resCd==null?"null":getResCd());
		sb.append("\n");
		sb.append("\tedayYn: ");
		sb.append(edayYn==null?"null":getEdayYn());
		sb.append("\n");
		sb.append("\tdomainId: ");
		sb.append(domainId==null?"null":getDomainId());
		sb.append("\n");
		sb.append("\tfiller: ");
		sb.append(filler==null?"null":getFiller());
		sb.append("\n");
		sb.append("\tmsgCd: ");
		sb.append(msgCd==null?"null":getMsgCd());
		sb.append("\n");
		sb.append("\tmsgCnt: ");
		sb.append(msgCnt==null?"null":getMsgCnt());
		sb.append("\n");
		sb.append("\tmsgs: ");
		if ( msgs == null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(msgs.size());
			sb.append("(items)\n");
	
			int max= (10<msgs.size())?10:msgs.size();
	
			for ( int i = 0; i < max; ++i ){
				sb.append("\tmsgs[");
				sb.append(i);
				sb.append("] : ");
				sb.append(msgs.get(i));
				sb.append("\n");
			}
	
			if ( max < msgs.size() ){
				sb.append("\tmsgs[.] : ").append("more ").append((msgs.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}

	/**
	 * Only for Fixed-Length Data
	 */
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
	
		messageLen+= 8; /* msgLen */
		messageLen+= 40; /* guid */
		messageLen+= 12; /* trxCd */
		messageLen+= 3; /* sysCd */
		messageLen+= 2; /* chlType */
		messageLen+= 15; /* clientIp */
		messageLen+= 16; /* msgReqDttm */
		messageLen+= 16; /* msgResDttm */
		messageLen+= 4; /* trxBranchNo */
		messageLen+= 4; /* trxTerminalNo */
		messageLen+= 8; /* userId */
		messageLen+= 1; /* apprTrxYn */
		messageLen+= 8; /* apprUserId */
		messageLen+= 10; /* screenId */
		messageLen+= 2; /* langCd */
		messageLen+= 1; /* resCd */
		messageLen+= 1; /* edayYn */
		messageLen+= 14; /* domainId */
		messageLen+= 35; /* filler */
		messageLen+= 9; /* msgCd */
		messageLen+= 5; /* msgCnt */
		{/*msgs*/
			int size=getMsgCnt();
			int count= msgs == null ? 0 : msgs.size();
			int min= size > count?count:size;
			bxm.dft.context.DefaultMessage emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					bxm.dft.context.DefaultMessage element= msgs.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Can not predict message length.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.context.DefaultMessage();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Can not predict message length.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("msgLen");
		fieldNames.add("guid");
		fieldNames.add("trxCd");
		fieldNames.add("sysCd");
		fieldNames.add("chlType");
		fieldNames.add("clientIp");
		fieldNames.add("msgReqDttm");
		fieldNames.add("msgResDttm");
		fieldNames.add("trxBranchNo");
		fieldNames.add("trxTerminalNo");
		fieldNames.add("userId");
		fieldNames.add("apprTrxYn");
		fieldNames.add("apprUserId");
		fieldNames.add("screenId");
		fieldNames.add("langCd");
		fieldNames.add("resCd");
		fieldNames.add("edayYn");
		fieldNames.add("domainId");
		fieldNames.add("filler");
		fieldNames.add("msgCd");
		fieldNames.add("msgCnt");
		fieldNames.add("msgs");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("msgLen", get("msgLen"));
		fieldValueMap.put("guid", get("guid"));
		fieldValueMap.put("trxCd", get("trxCd"));
		fieldValueMap.put("sysCd", get("sysCd"));
		fieldValueMap.put("chlType", get("chlType"));
		fieldValueMap.put("clientIp", get("clientIp"));
		fieldValueMap.put("msgReqDttm", get("msgReqDttm"));
		fieldValueMap.put("msgResDttm", get("msgResDttm"));
		fieldValueMap.put("trxBranchNo", get("trxBranchNo"));
		fieldValueMap.put("trxTerminalNo", get("trxTerminalNo"));
		fieldValueMap.put("userId", get("userId"));
		fieldValueMap.put("apprTrxYn", get("apprTrxYn"));
		fieldValueMap.put("apprUserId", get("apprUserId"));
		fieldValueMap.put("screenId", get("screenId"));
		fieldValueMap.put("langCd", get("langCd"));
		fieldValueMap.put("resCd", get("resCd"));
		fieldValueMap.put("edayYn", get("edayYn"));
		fieldValueMap.put("domainId", get("domainId"));
		fieldValueMap.put("filler", get("filler"));
		fieldValueMap.put("msgCd", get("msgCd"));
		fieldValueMap.put("msgCnt", get("msgCnt"));
		fieldValueMap.put("msgs", get("msgs"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1065040172 : /* msgLen */
			return getMsgLen();
		case 3184265 : /* guid */
			return getGuid();
		case 110642107 : /* trxCd */
			return getTrxCd();
		case 109922318 : /* sysCd */
			return getSysCd();
		case 748345473 : /* chlType */
			return getChlType();
		case 908408402 : /* clientIp */
			return getClientIp();
		case 235770374 : /* msgReqDttm */
			return getMsgReqDttm();
		case 237617416 : /* msgResDttm */
			return getMsgResDttm();
		case -1027597603 : /* trxBranchNo */
			return getTrxBranchNo();
		case 1954359991 : /* trxTerminalNo */
			return getTrxTerminalNo();
		case -836030906 : /* userId */
			return getUserId();
		case -1937151362 : /* apprTrxYn */
			return getApprTrxYn();
		case 106859543 : /* apprUserId */
			return getApprUserId();
		case -411607385 : /* screenId */
			return getScreenId();
		case -1110059281 : /* langCd */
			return getLangCd();
		case 108402977 : /* resCd */
			return getResCd();
		case -1308062068 : /* edayYn */
			return getEdayYn();
		case 1129430271 : /* domainId */
			return getDomainId();
		case -1274499728 : /* filler */
			return getFiller();
		case 104190914 : /* msgCd */
			return getMsgCd();
		case -1065048536 : /* msgCnt */
			return getMsgCnt();
		case 3361042 : /* msgs */
			return getMsgs();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1065040172 : /* msgLen */
			setMsgLen((java.lang.Long) value);
			return;
		case 3184265 : /* guid */
			setGuid((java.lang.String) value);
			return;
		case 110642107 : /* trxCd */
			setTrxCd((java.lang.String) value);
			return;
		case 109922318 : /* sysCd */
			setSysCd((java.lang.String) value);
			return;
		case 748345473 : /* chlType */
			setChlType((java.lang.String) value);
			return;
		case 908408402 : /* clientIp */
			setClientIp((java.lang.String) value);
			return;
		case 235770374 : /* msgReqDttm */
			setMsgReqDttm((java.lang.String) value);
			return;
		case 237617416 : /* msgResDttm */
			setMsgResDttm((java.lang.String) value);
			return;
		case -1027597603 : /* trxBranchNo */
			setTrxBranchNo((java.lang.String) value);
			return;
		case 1954359991 : /* trxTerminalNo */
			setTrxTerminalNo((java.lang.String) value);
			return;
		case -836030906 : /* userId */
			setUserId((java.lang.String) value);
			return;
		case -1937151362 : /* apprTrxYn */
			setApprTrxYn((java.lang.String) value);
			return;
		case 106859543 : /* apprUserId */
			setApprUserId((java.lang.String) value);
			return;
		case -411607385 : /* screenId */
			setScreenId((java.lang.String) value);
			return;
		case -1110059281 : /* langCd */
			setLangCd((java.lang.String) value);
			return;
		case 108402977 : /* resCd */
			setResCd((java.lang.String) value);
			return;
		case -1308062068 : /* edayYn */
			setEdayYn((java.lang.String) value);
			return;
		case 1129430271 : /* domainId */
			setDomainId((java.lang.String) value);
			return;
		case -1274499728 : /* filler */
			setFiller((java.lang.String) value);
			return;
		case 104190914 : /* msgCd */
			setMsgCd((java.lang.String) value);
			return;
		case -1065048536 : /* msgCnt */
			setMsgCnt((java.lang.Integer) value);
			return;
		case 3361042 : /* msgs */
			setMsgs((java.util.List<bxm.dft.context.DefaultMessage>) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
