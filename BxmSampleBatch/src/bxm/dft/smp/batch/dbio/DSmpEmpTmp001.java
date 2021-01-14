/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Tue Jan 05 13:10:52 KST 2021
 */
package bxm.dft.smp.batch.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.container.das.ExecutorType;
import bxm.container.das.DasListUpdate;
import bxm.container.das.DasExecutor;

/**
 * 샘플직원 입력 DBIO
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/batch/dbio/DSmpEmpTmp001.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "샘플직원 입력 DBIO", author = "bankware")
public interface DSmpEmpTmp001
{

	/**
	 * 샘플 직원정보 입력
	 * @TestValues 	feduEmpNo=1577;	feduEmpNm=김길숙;	feduOccpNm=백수;	feduMngrEmpNo=7934;	feduHireDt=sysdate;	feduPayAmt=50000;	feduDeptNo=10;
	 */
	@DasExecutor(executor = ExecutorType.CONNECTED_BATCH)
	@BxmCategory(logicalName = "샘플 직원정보 입력", author = "bankware")
	int insert001(bxm.dft.smp.batch.dbio.dto.DSmpEmpTmp001Dto dSmpEmpTmp001Dto);

	/**
	 * 샘플 직원정보 입력
	 * @TestValues 	feduEmpNo=1577;	feduEmpNm=김길숙;	feduOccpNm=백수;	feduMngrEmpNo=7934;	feduHireDt=sysdate;	feduPayAmt=50000;	feduDeptNo=10;
	 */
	@DasListUpdate()
	@DasExecutor(executor = ExecutorType.CONNECTED_BATCH)
	@BxmCategory(logicalName = "샘플 직원정보 입력", author = "bankware")
	int insert001(java.util.List<bxm.dft.smp.batch.dbio.dto.DSmpEmpTmp001Dto> dSmpEmpTmp001Dto);
}