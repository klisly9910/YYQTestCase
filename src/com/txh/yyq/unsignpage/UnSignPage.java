package com.txh.yyq.unsignpage;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 定义[未登录]页面常用字段
 * 
 * @author xiaohua
 * 
 */
public class UnSignPage extends UiAutomatorTestCase {
	public static UiObject etusername = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/et_user_name"));
	public static UiObject etpsd = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/et_user_psd"));
	public static UiObject forgetpsd = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_forget_psd"));
	public static UiObject signBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_sign_in"));
	public static UiObject weichat = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/iv_login_weichat"));
	public static UiObject loginQQ = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/iv_login_QQ"));
	public static UiObject register = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_register"));
	
	// 微信/QQ登录授权
	public static UiObject btnOk = new UiObject(
			new UiSelector().className("android.widget.Button"));
	

}
