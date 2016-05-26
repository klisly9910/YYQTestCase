package com.txh.yyq.my.awardrecords;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 中奖记录页面
 * 
 * @author xiaohua
 * 
 */
public class AwardRecords extends UiAutomatorTestCase {
	// 没有中奖记录
	public static UiObject emptyGo = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/award_empty_go"));

	// 有中奖记录
	
	
	//地址管理
	public static UiObject managerADD = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_address_manager"));

}
