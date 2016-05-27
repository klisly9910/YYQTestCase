package com.txh.yyq.gooddetails.pastdetails;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 往期揭晓列表页 点击GoodDetails.past进入往期揭晓页面
 * 
 * @author xiaohua
 * 
 */
public class PastDetails extends UiAutomatorTestCase {
	// 往期揭晓：有数据
	public static UiObject pastAnnounceLists = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_rv_list"));
	//获奖者信息:单独一条获奖信息
	public static UiObject pastAnnouceWinner = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_winner"));
	//期号
	public static UiObject pastAnnouceNumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_number"));
	//揭晓时间
	public static UiObject pastAnnouceTime = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_time"));
	//获奖者头像
	public static UiObject pastAnnouceIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_item_riv_icon"));
	//获奖者名字、幸运号码、本期参与次数、ip地址
	public static UiObject pastAnnouceName = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_lucky_name"));
	public static UiObject pastAnnouceLuckNumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_lucky_number"));
	public static UiObject pastAnnouceLuckCount = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_lucky_count"));
	public static UiObject pastAnnouceLuckIP = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_lucky_ip"));

	// 往期揭晓：没有数据
	public static UiObject pastAnnouceNullResult = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/nullResultView"));
	public static UiObject pastAnnoucePromptText = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/promptText"));

}
