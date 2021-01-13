/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Thu Dec 31 12:32:15 KST 2020
 */
package bxm.test.sample.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;

/**
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/test/sample/dbio/SampleEmpTest001.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "사원정보 조회 테스트", author = "bankware")
public interface SampleEmpTest001
{

	/**
	 * @TestValues 	rowId=;	feduEmpNo=7839;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduHireDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(author = "bankware")
	bxm.test.sample.dbio.Sample001Dto selectOne001(bxm.test.sample.dbio.Sample001Dto sample001Dto);
}