package com.txh.yyq.my.awardrecords;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 中奖记录页面
 * 
 * @author xiaohua
 * 
 */
public class AwardRecords extends UiAutomatorTestCase {
	// 没有中奖记录
	public static UiObject emptyGo = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/award_empty_go"));

	// 有中奖记录
	// 中奖记录列表list
	public static UiObject awardList = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_full_rv_recyclerview"));
	// 中奖商品name
	public static UiObject awardName = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/award_item_tv_name"));
	// 中奖商品icon
	public static UiObject awardIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_icon_left"));
	// 中奖商品参与期号
	public static UiObject awardIssue = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_issue"));
	// 总需人次
	public static UiObject awardTotalTimes = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_total_times"));
	// 幸运号码
	public static UiObject awardLuckNumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_luck_num"));
	// 本期参与次数
	public static UiObject awardLuckCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_count"));
	// 揭晓时间
	public static UiObject awardRevealedTime = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_revealed_time"));
	// 等待宝贝派发
	public static UiObject awardStaus = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/award_staus_text"));
	// 奖杯
	public static UiObject awardCup = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_icon_right"));
	// 地址管理
	public static UiObject managerADD = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/tv_address_manager"));

}
