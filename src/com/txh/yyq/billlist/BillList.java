package com.txh.yyq.billlist;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 清单页面（属性）
 * 
 * @author xiaohua
 * 
 */
public class BillList extends UiAutomatorTestCase {
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
	public static UiObject billCount = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_tv_left"));
	public static UiObject minus = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_iv_minus"));
	public static UiObject plus = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_iv_plus"));
	public static UiObject editcount = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_item_et_count"));
	public static UiObject billNum = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_tv_num"));
	public static UiObject submitBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/bill_tv_submit"));
	

}
