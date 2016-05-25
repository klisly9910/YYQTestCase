package com.txh.yyq.personcenter.manageraddress;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 地址管理页面
 * 
 * @author xiaohua
 * 
 */
public class ManagerAddress extends UiAutomatorTestCase {
	// 列表有已添加的地址，地址列表
	public static UiObject addressList = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/address_full_rv_recyclerview"));
	public static UiObject addBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/add_address_tv"));
	public static UiObject receiverName = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/receiver_name"));
	public static UiObject receiverPhone = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/receive_phone"));
	public static UiObject receiverADD = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/receiver_address"));
	//列表没有地址:添加地址btn
	public static UiObject btnAddAddress = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/btn_add_address"));

}
