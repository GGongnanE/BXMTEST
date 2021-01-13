package bxm.test.sample.service;

import bxm.container.annotation.BxmService;
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
@BxmService("bxmDeployTestService")
@BxmCategory(logicalName = "배포테스트용서비스", author = "bankware")
public class bxmDeployTestService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
}

