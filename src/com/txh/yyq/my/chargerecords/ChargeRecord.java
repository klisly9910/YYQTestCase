package com.txh.yyq.my.chargerecords;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 充值记录页面
 * 2.2.1版本已去掉【充值记录】模块
 * @author xiaohua
 * 
 */
public class ChargeRecord extends UiAutomatorTestCase {
	// 充值说明
	public static UiObject descText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_describe"));
	// 充值按钮
	public static UiObject rechargeBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/recharge_tv"));
	// 有充值记录：充值列表
	public static UiObject chargeList = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/recharge_records_fl_frame_layout"));
	public static UiObject payType = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/payType"));

	// 没有充值记录

}
