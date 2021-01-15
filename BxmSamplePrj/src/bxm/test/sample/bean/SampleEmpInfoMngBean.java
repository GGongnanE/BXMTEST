package bxm.test.sample.bean;

import bxm.container.annotation.BxmBean;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.test.sample.dbio.Sample001Dto;
import bxm.test.sample.dbio.SampleEmpTest001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bxm.common.annotaion.BxmCategory;

/**
 * <b>BXM Business class</b>
 * <pre> 
 * 2020.12.31 : New creation
 * 2021.01.13 : git commit-push test    *asdzxc324234
 * </pre>                             
 *
 * @since 2020.12.31
 * @version 1.0.0
 * @author bankware
 */



@BxmBean
@BxmCategory(logicalName = "사원정보 조회 테스트 BEAN", author = "bankware")
public class SampleEmpInfoMngBean {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private SampleEmpTest001 sampleEmpTest001;
	
	@BxmCategory(logicalName = "사원정보 조회 메소드")
	public Sample001Dto getEmpInfo(Sample001Dto input) throws DefaultApplicationException {
		
		
		logger.debug("================ getEmpInfo's start !!!!! ===========");
		logger.debug("input Value = {} ", input);
		
		sampleEmpTest001 = DefaultApplicationContext.getBean(sampleEmpTest001, SampleEmpTest001.class);
		/**
		 * @BXMType VariableDeclaration
		 */
		Sample001Dto output = new Sample001Dto();
		
		/**
		 * @BXMType DbioCall
		 * Employee ID number selectOne
		 */
		 output = sampleEmpTest001.selectOne001(input);
		
		 logger.debug("output = {}", output);
		 logger.debug("============== END ==============");
		 
		return output;
		
	}
	
	
}

