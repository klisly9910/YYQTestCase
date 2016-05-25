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
	//获奖者信息
	public static UiObject pastAnnouceWinner = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_winner"));
	public static UiObject pastAnnouceNumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_number"));
	public static UiObject pastAnnouceTime = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_tv_time"));
	public static UiObject pastAnnouceIcon = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/yyq_to_announce_item_riv_icon"));
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
