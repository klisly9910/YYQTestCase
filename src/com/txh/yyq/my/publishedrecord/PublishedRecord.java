package com.txh.yyq.my.publishedrecord;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 抢宝记录-揭晓页面
 * 
 * @author xiaohua
 * 
 */
public class PublishedRecord extends UiAutomatorTestCase {
	//揭晓列表
	public static UiObject recordAllList = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_all_recycler_view"));
	//获奖信息：商品icon、名称、期号、参与时间、查看详情、奖杯icon、获奖者、winername、参与次数、再抢一次
	public static UiObject resultIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_iv_icon"));
	public static UiObject resultTitle = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_title"));
	public static UiObject resultIssue = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_issue"));
	public static UiObject resultAttendTimes = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_attends_times"));
	public static UiObject resultInfo = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_info"));
	public static UiObject awardCup = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_award_cup"));
	public static UiObject awardUserText = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_tv"));
	public static UiObject winName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_win_name"));
	public static UiObject resultLeftCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_left_count"));
	public static UiObject resultBuyAgain = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_buy_again"));



}
