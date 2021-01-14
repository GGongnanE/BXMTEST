/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.smp.batch.dbio.dto;


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
 * @Description 샘플부서번호 조회 입력 IO
 */
@XmlType(propOrder={"feduDeptNo"}, name="DSmpEmpTst001selectList01InDto")
@XmlRootElement(name="DSmpEmpTst001selectList01InDto")
@SuppressWarnings("all")
public class DSmpEmpTst001selectList01InDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 1963289479L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "샘플부서번호 조회 입력 IO";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << feduDeptNo >> [[ */
	
	@XmlTransient
	private boolean isSet_feduDeptNo = false;
	
	protected boolean isSet_feduDeptNo()
	{
		return this.isSet_feduDeptNo;
	}
	
	protected void setIsSet_feduDeptNo(boolean value)
	{
		this.isSet_feduDeptNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 부서번호", formatType="", format="", align="right", length=2, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer feduDeptNo  = 0;
	
	/**
	 * 
	 * @Description FW샘플 부서번호
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getFeduDeptNo(){
		return feduDeptNo;
	}
	
	/**
	 * 
	 * @Description FW샘플 부서번호
	 */
	@JsonProperty("feduDeptNo")
	public void setFeduDeptNo( java.lang.Integer feduDeptNo ) {
		isSet_feduDeptNo = true;
		this.feduDeptNo = feduDeptNo;
	}
	
	/** Property set << feduDeptNo >> ]]
	*******************************************************************************************************************************/

	@Override
	public DSmpEmpTst001selectList01InDto clone(){
		try{
			DSmpEmpTst001selectList01InDto object= (DSmpEmpTst001selectList01InDto)super.clone();
			
			
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
		
		result = prime * result + ((feduDeptNo==null)?0:feduDeptNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.batch.dbio.dto.DSmpEmpTst001selectList01InDto other= (bxm.dft.smp.batch.dbio.dto.DSmpEmpTst001selectList01InDto)obj;
		if ( feduDeptNo == null){
			if ( other.feduDeptNo != null ) return false;
		}
		else if ( !feduDeptNo.equals(other.feduDeptNo) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.batch.dbio.dto.DSmpEmpTst001selectList01InDto:\n");
		sb.append("\tfeduDeptNo: ");
		sb.append(feduDeptNo==null?"null":getFeduDeptNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}

	/**
	 * Only for Fixed-Length Data
	 */
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
	
		messageLen+= 2; /* feduDeptNo */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("feduDeptNo");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("feduDeptNo", get("feduDeptNo"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 255783062 : /* feduDeptNo */
			return getFeduDeptNo();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 255783062 : /* feduDeptNo */
			setFeduDeptNo((java.lang.Integer) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
