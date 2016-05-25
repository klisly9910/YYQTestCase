package com.txh.amarket.homepage;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 机锋应用商店： 首页（属性）
 * 
 * @param args
 */
public class HomePage extends UiAutomatorTestCase {
	// 顶部搜索框属性
	public static UiObject menuBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/menuBtn"));
	public static UiObject searchBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/searchBtn"));
	public static UiObject keyText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/keyText"));
	public static UiObject updateBtn = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/updateBtn"));
	public static UiObject updateNum = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/upgradeNum"));
	// 四个导航属性
	public static UiObject firstNav = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/firstNav"));
	public static UiObject secondNav = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/secondNav"));
	public static UiObject thirdNav = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/thirdNav"));
	public static UiObject fourthNav = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/fourthNav"));
	// banner属性
	public static UiObject banner = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/viewpager"));
	// 一元抢属性
	public static UiObject actionGo = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/actionGo"));
	public static UiObject homeyyq1 = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_home_yyq_widget_1"));
	public static UiObject homeyyq2 = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_home_yyq_widget_2"));
	public static UiObject homeyyqIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_home_item_iv_icon"));
	public static UiObject homeyyqName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_home_item_tv_name"));
	public static UiObject homeyyqDesc = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_home_item_tv_desc"));
	public static UiObject homeyyqProgress = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_home_item_tv_progress"));
	public static UiObject homeyyqBar = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_home_item_pb_progress"));
	public static UiObject homeyyqBuy = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_home_item_tv_buy"));
	public static UiObject yyqText = new UiObject(
			new UiSelector().className("android.widget.TextView"));
	// 应用推荐属性
	public static UiObject appIconImg = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/appIconImg"));
	public static UiObject appNameText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/appNameText"));
	public static UiObject appInfoText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/appInfoText"));
	public static UiObject downloadImg = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/downloadImg"));
	// 返回按钮属性
	public static UiObject backBtn = new UiObject(
			new UiSelector().className("android.widget.ImageButton"));

}
