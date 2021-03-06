package com.txh.yyq.billlist;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 定义[清单]页面常用字段
 * 
 * @author xiaohua
 * 
 */
public class BillList extends UiAutomatorTestCase {
	// 底部[清单]按钮
	public static UiObject billRadio = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/billRadio"));
	// 清单为空
	public static UiObject emptyGo = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_empty_go"));
	// 清单不为空
	public static UiObject editBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_tv_edit"));
	public static UiObject billList = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_lv_list_view"));
	public static UiObject billIcon = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_iv_icon"));
	public static UiObject billDsc = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_tv_des"));
	// 总需人次，剩余人次
	public static UiObject billCount = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_tv_left"));
	public static UiObject minus = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_iv_minus"));
	public static UiObject plus = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_iv_plus"));
	public static UiObject editcount = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_et_count"));
	// 共计x元
	public static UiObject billNum = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_tv_num"));
	public static UiObject submitBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_tv_submit"));

}
