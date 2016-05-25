package com.txh.yyq.personcenter.manageraddress.editaddress;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 添加地址
 * @author xiaohua
 *
 */
public class AddAddress extends UiAutomatorTestCase{
	public static UiObject receiver = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/receiver"));
	public static UiObject phoneNum = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/phoneNum"));
	public static UiObject province = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/spProvince"));
	public static UiObject city = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/spCity"));
	public static UiObject district = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/spDistrict"));
	public static UiObject address = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/address"));
	public static UiObject chooseADD = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/chooseAddress"));
	public static UiObject saveBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/save_tv"));

}
