package com.txh.yyq.gooddetails.lottery;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 计算过程 从GoodDetails.lottery进入计算过程页面
 * 
 * @author xiaohua
 * 
 */
public class Lottery extends UiAutomatorTestCase {
	// 计算公式
	public static UiObject computing = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/rl_computing"));
	// 已揭晓/等待揭晓：计算数值：A\B
	public static UiObject cumputingNumberA = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_computing_tv_numbera"));
	public static UiObject cumputingNumberB = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_computing_tv_numberb"));
	//已揭晓/等待揭晓： 计算出幸运号码
	public static UiObject computingLuckyNumber = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_computing_tv_luckynumber"));
	// 等待揭晓：数值B时时彩期号
	public static UiObject computingIssue = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_computing_tv_issue"));
	// 等待揭晓：刷新按钮
	public static UiObject refreshBtn = new UiObject(
			new UiSelector()
					.resourceId("com.mappn.gfan:id/gm3_yyq_computing_tv_luckynumber"));

}
