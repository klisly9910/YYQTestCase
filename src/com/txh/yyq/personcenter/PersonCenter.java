package com.txh.yyq.personcenter;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
/**
 * 定义[我的]-点击头像进入[个人中心页面]
 * @author xiaohua
 *
 */
public class PersonCenter extends UiAutomatorTestCase {
	public static UiObject usernamelayout = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/user_layout_username"));
	public static UiObject userText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv1"));
	public static UiObject userNameText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv_user_name"));
	public static UiObject userIconlayout = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_layout_icon"));
	public static UiObject userIconText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv2"));
	public static UiObject userIcon = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_iv_icon"));
	public static UiObject nickNamelayout = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/user_layout_nickname"));
	public static UiObject nickNameText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv3"));
	public static UiObject nickName = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv_nick_name"));
	public static UiObject psdlayout = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/user_layout_password"));
	public static UiObject editpsd = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv5"));
	public static UiObject addresslayout = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/user_layout_address"));
	public static UiObject editAddress = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv6"));
	public static UiObject exitlayout = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_layout_exit"));
	public static UiObject exitText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/user_tv7"));
	// 点击注销
	public static UiObject negtive = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/btn_negative"));
	public static UiObject positive = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/btn_positive"));

}
