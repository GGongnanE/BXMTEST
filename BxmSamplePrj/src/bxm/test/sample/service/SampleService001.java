package bxm.test.sample.service;

import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.test.sample.bean.SampleEmpInfoMngBean;
import bxm.test.sample.dbio.Sample001Dto;
import bxm.test.sample.service.dto.Sample001InDto;
import bxm.test.sample.service.dto.Sample001OutDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bxm.common.annotaion.BxmCategory;

/**
 * <b>BXM Service class</b>
 * <p>
 * <b>Revision history</b><br>
 * <pre>
 * 2020.12.31 : New creation
 * </pre>
 *
 * @since 2020.12.31
 * @version 1.0.0
 * @author bankware
 */
@BxmService("SampleService001")
@BxmCategory(logicalName = "사원정보 서비스", author = "bankware")
public class SampleService001 {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private SampleEmpInfoMngBean sampleEmpInfoMngBean;
	
	@BxmServiceOperation("sampleService00101")
	@BxmCategory(logicalName = "사원정보를 조회하는 BEAN 호출 메소드")
	public Sample001OutDto sampleService00101(Sample001InDto input) throws DefaultApplicationException {
		
		logger.debug("============== SampleService001 START ==============");
		logger.debug("input = {}", input);
		
		
		sampleEmpInfoMngBean = DefaultApplicationContext.getBean(sampleEmpInfoMngBean, SampleEmpInfoMngBean.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		 Sample001Dto beanInput = new Sample001Dto();

		 /**
		 * @BXMType VariableDeclaration
		 */
		 Sample001OutDto output = new Sample001OutDto();
		
		 
		 /**
		  * @BXMType IF
		  */
		  if (input.getFeduEmpNo() == 9877) {
			  logger.error("Pre-Deploy Test Exception for FeduEmpNo [9877].");
			  throw new DefaultApplicationException("BXME30000", new Object[] {},new Object[] { "Pre-Deploy Test Exception." });
		  }

		 /**
		  * @BXMType LogicalArea
		  * @Desc DTO mapping
		  */
		   {
			   beanInput.setFeduEmpNo(input.getFeduEmpNo());
		   }
		   
		   /**
		    * @BXMType BeanCall
		    * @Desc Call bean single select method
		    */
		   Sample001Dto beanOutput = sampleEmpInfoMngBean.getEmpInfo(beanInput);
		   
		   logger.debug("beanOutput = {}", beanOutput);
		   
		   /**
		    * @BXMType IF
		    * @Desc DTO mapping if bean out is not null
		    */
		    if (beanOutput != null) {
			    output.setFeduEmpNo(beanOutput.getFeduEmpNo());
			    output.setFeduEmpNm(beanOutput.getFeduEmpNm());
			    output.setFeduOccpNm(beanOutput.getFeduOccpNm());
			    output.setFeduMngrEmpNo(beanOutput.getFeduMngrEmpNo());
			    output.setFeduHireDt(beanOutput.getFeduHireDt());
			    output.setFeduPayAmt(beanOutput.getFeduPayAmt());
			    output.setFeduDeptNo(beanOutput.getFeduDeptNo());
		    }

		    /**
		     * @BXMType LogicalArea
		     * @Desc add message
		     */
		     {
		    	 DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] {});
		     }
		     
		     logger.debug("output = {}", output);
		     logger.debug("============== SERVICE END ==============");
		
		return output;
		
	}
	
}

