package com.txh.yyq.other.personcenter;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 定义其他用户[个人中心]常用字段 1、 点击publishedpage.awardmessage 进入此页面
 * 2、点击gooddetails.attenderName 所有参与记录的参与者进入此页面
 * 
 * @author xiaohua
 * 
 */
public class OtherPersonCenter extends UiAutomatorTestCase {
	// 共有的属性：获奖者:头像、昵称
	public static UiObject otherIcon = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/other_iv_icon"));
	public static UiObject otherName = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/other_tv_name"));
	// 共有的属性：抢宝记录:商品icon、title、期号issue、参与人次
	public static UiObject recordResultIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_iv_icon"));
	public static UiObject recordResultTitle = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_title"));
	public static UiObject recordResultIssue = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_issue"));
	public static UiObject recordResultAttendtimes = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_attends_times"));
	// 已揭晓：查看TA的详情/我的[已揭晓]
	public static UiObject recordResultInfo = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_info"));
	//进行中：查看TA的详情/[我的进行中]
	public static UiObject recordRunningInfo = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_running_tv_info"));
	
	// 已揭晓：从已揭晓页面publishedpage.awardMessage/已揭晓详情页获奖者信息GoodDetails.resultMessage
	//已揭晓页面所有参与记录GoodDetails.attenderName/往期揭晓PastDetails.pastAnnouceWinner进入
	//已揭晓详情页幸运号码GoodDetails.luckynumber
	//抢宝记录-获奖者信息：
	public static UiObject recordResultNameText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/record_item_tv"));
	public static UiObject recordResultWinName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_win_name"));
	public static UiObject recordResultCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_left_count"));
	public static UiObject recordResultBuyAgain = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_result_tv_buy_again"));
	// 进行中：从详情页参与者记录信息进入，抢宝记录-获奖者信息：
	public static UiObject recordRunningCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_running_tv_all_count"));
	public static UiObject recordRunningLeftCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_running_tv_left_count"));
	public static UiObject recordRunningProgress = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_running_progress"));
	//跟买（others的抢宝记录）/追加（我自己的抢宝记录）
	public static UiObject recordRunningBuyAgain = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/record_item_running_tv_buy_again"));

	// 中奖记录:有中奖记录
	public static UiObject awardRecordName = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/award_item_tv_name"));
	public static UiObject awardRecordIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_icon_left"));
	public static UiObject awardRecordIssue = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_issue"));
	public static UiObject awardRecordTotlaTimes = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_total_times"));
	public static UiObject awardRecordLuckyNum = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_luck_num"));
	public static UiObject awardRecordAttendCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_count"));
	public static UiObject awardRecordRevealedTime = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/award_item_tv_revealed_time"));

	// 中奖记录：没有中奖记录
	public static UiObject nullResult = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/nullResultView"));

}
