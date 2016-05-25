package com.txh.yyq.personcenter.manageraddress.editaddress;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 点击地址
 * 
 * @author xiaohua
 * 
 */
public class EditAddress extends UiAutomatorTestCase {
	public static UiObject edReceiver = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/ed_receiver"));
	public static UiObject edPhoneNum = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/ed_phoneNum"));
	public static UiObject edProvince = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/ed_spProvince"));
	public static UiObject edCity = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/ed_spCity"));
	public static UiObject edDistrict = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/ed_spDistrict"));
	public static UiObject edAddress = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/ed_address"));
	public static UiObject chooseADD = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/chooseAddress"));
	public static UiObject deleteADD = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/delete_address"));
	public static UiObject saveBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/save_tv"));

}
