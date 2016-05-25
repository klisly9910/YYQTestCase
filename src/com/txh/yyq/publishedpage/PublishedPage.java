package com.txh.yyq.publishedpage;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 揭晓页面（属性）
 * 
 * @author xiaohua
 * 
 */
public class PublishedPage extends UiAutomatorTestCase {
	// 揭晓list属性
	public static UiObject awardList = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_open_award_rlv_list"));
	// 商品属性
	public static UiObject awardIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_item_iv_icon"));
	public static UiObject awardName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_item_tv_name"));
	public static UiObject awardMessage = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_item_rl_do_open"));
	public static UiObject goodNumberText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_good_number"));
	public static UiObject goodNumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_tv_good_number"));
	public static UiObject userText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_user"));
	public static UiObject userName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_tv_user_name"));
	public static UiObject countText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_count"));
	public static UiObject buyCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_tv_buy_count"));
	public static UiObject luckynumberText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_lucky_number"));
	public static UiObject luckyNumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_tv_lucky_number"));
	public static UiObject luckytimeText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_lucky_time"));
	public static UiObject luckyTime = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_award_tv_realtime"));
	// 获奖者个人中心属性
	public static UiObject otherIcon = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/other_iv_icon"));

}
