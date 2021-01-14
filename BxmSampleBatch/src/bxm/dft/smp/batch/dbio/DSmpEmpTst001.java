/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Tue Jan 05 12:31:07 KST 2021
 */
package bxm.dft.smp.batch.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.container.das.ExecutorType;
import bxm.container.das.DasExecutor;

/**
 * 샘플용 직원정보 조회 
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/batch/dbio/DSmpEmpTst001.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "샘플직원용조회 DBIO", author = "bankware")
public interface DSmpEmpTst001
{

	/**
	 * @TestValues 	feduDeptNo=10;
	 */
	@DasExecutor(executor = ExecutorType.CONNECTED_BATCH)
	@BxmCategory(author = "bankware")
	java.util.List<bxm.dft.smp.batch.dbio.dto.DSmpEmpTst001selectList01OutDto> selectList001(
			bxm.dft.smp.batch.dbio.dto.DSmpEmpTst001selectList01InDto dSmpEmpTst001selectList01InDto);
}