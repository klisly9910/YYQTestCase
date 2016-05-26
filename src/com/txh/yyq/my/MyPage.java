package com.txh.yyq.my;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
/**
 * 定义[我的]页面常用字段
 * @author xiaohua
 *
 */
public class MyPage extends UiAutomatorTestCase {
	public static UiObject loggedIcon = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/logged_iv_icon"));
	public static UiObject loggedName = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/logged_tv_name"));
	//机锋券余额改为【幸运币余额】
	public static UiObject luckyTicket = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/logged_tv_luck_coin_num"));
	//2.2.1版本已去掉【充值】按钮
	public static UiObject chargeBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/logged_tv_charge"));
	public static UiObject runningBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/logged_tv_running"));
	public static UiObject resultBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/logged_tv_result"));
	public static UiObject allrecords = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/logged_tv_all_records"));
	public static UiObject awardrecords = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/logged_tv_award_records"));
	public static UiObject chargerecords = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/logged_tv_charge_records"));
	public static UiObject aboutyyq = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/logged_tv_about_yyq"));

}
