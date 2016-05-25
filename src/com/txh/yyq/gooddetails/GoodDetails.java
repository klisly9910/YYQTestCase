package com.txh.yyq.gooddetails;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class GoodDetails extends UiAutomatorTestCase {
	// 商品详情title
	public static UiObject productDetailText = new UiObject(
			new UiSelector().className("android.widget.TextView"));
	public static UiObject pictures = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_vp_pictures"));
	// 进行中的商品描述
	public static UiObject name = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_tv_name"));
	public static UiObject normal = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_rl_normal"));
	// 已揭晓
	public static UiObject publishedName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_tv_name"));
	public static UiObject resultMessage = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/rl_lottery_result"));
	public static UiObject luckynumberText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_lucky_number"));
	public static UiObject luckynumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_tv_lucky_number"));
	public static UiObject lottery = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_tv_lottery_result"));

	// 已登录未参与/未登录(通过clickable是否可点击判断是否已登录(true/false))
	public static UiObject logindec = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_tv_logindesc"));
	// 已登录已参与
	public static UiObject attendNumbers = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detaiil_rl_lucky_numbers"));

}
