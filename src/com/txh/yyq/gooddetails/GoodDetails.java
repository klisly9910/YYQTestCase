package com.txh.yyq.gooddetails;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
/**
 * 定义[商品详情页]常用字段，包括进行中、已揭晓
 * @author xiaohua
 *
 */
public class GoodDetails extends UiAutomatorTestCase {
	// 商品详情title
	public static UiObject productDetailText = new UiObject(
			new UiSelector().className("android.widget.TextView"));
	// 商品图片
	public static UiObject pictures = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_vp_pictures"));
	// 进行中：商品name
	public static UiObject name = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_tv_name"));
	// 进行中：期号、参与人次、进度条
	public static UiObject normal = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_rl_normal"));
	// 已揭晓：商品publishedName/获奖者信息resultMessage/幸运号码luckynumger/计算过程lottery
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
	//计算过程
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
	// 往期揭晓
	public static UiObject past = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_rl_past"));

	// 进行中：宝贝图文
	public static UiObject gooddesc = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_rl_gooddesc"));

	// 所有参与记录
	public static UiObject allattendrecords = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_tv_time"));
	// 参与者信息
	public static UiObject attenderIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_records_item_riv_icon"));
	public static UiObject attenderName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_records_item_tv_name"));
	public static UiObject attenderIP = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_records_item_tv_ip"));
	public static UiObject attenderCountTime = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_records_item_tv_count"));
	// 进行中：详情页的一元抢button
	public static UiObject btnLayout = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_detail_bottom_layout"));
	public static UiObject yyqBtn = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_btn_in_indiana_normal"));
	// 已揭晓：详情页的一元抢button
	public static UiObject newBtnLayout = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_rl_bottom"));
	public static UiObject newBtn = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_detail_btn_newactivity"));

}
