package com.txh.amarket.testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.amarket.homepage.HomePage;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.gooddetails.GoodDetails;
import com.txh.yyq.gooddetails.pastdetails.PastDetails;
import com.txh.yyq.homepage.YYQHomePage;
import com.txh.yyq.sign.SignImapp;

/**
 * 一元抢页面的商品详情：running
 * 
 * @param args
 */
public class GoodDetailsForRunningTestCase extends UiAutomatorTestCase {

	public static void main(String[] args) {
		String jarName = "GoodDetailsForRunningTestCase";
		String testClass = "com.txh.amarket.testcase.GoodDetailsForRunningTestCase";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

	public void testCase() throws UiObjectNotFoundException {
		HomePage.fourthNav.clickAndWaitForNewWindow();
		YYQHomePage.homeRadio.click();
		HomePage.homeyyqIcon.clickAndWaitForNewWindow();
		assertEquals("详情也商品pictures是否存在", true, GoodDetails.pictures.exists());
		assertEquals("详情也商品name是否存在", true, GoodDetails.name.exists());
		assertEquals("详情也商品进度条、人次、期号是否存在", true, GoodDetails.normal.exists());
		if (GoodDetails.logindec.isClickable()) {
			System.out.println("clickable is true=未登录");
			System.out.println("=====点击登录，使用机锋账号登录=====");
			GoodDetails.logindec.click();
			SignImapp.testCase();
			System.out.println("=====登录成功=====");
		} else {
			System.out.println("clickable is false=已登录");
		}
		System.out.println("=====登录后检查是否参与过本期夺宝=====");
		if (GoodDetails.logindec.exists()) {
			System.out.println("未参与本期夺宝");
		} else if (GoodDetails.attendNumbers.exists()) {
			System.out.println("已参与本期夺宝");
			System.out.println("抢宝幸运数字：" + GoodDetails.luckyNumb.getText());
		}
		System.out.println("======往期揭晓=====");
		assertEquals("往期揭晓是否存在", true, GoodDetails.past.exists());
		GoodDetails.past.click();
		if (PastDetails.pastAnnouceNullResult.exists()) {
			System.out.println("往期揭晓页面没有数据");
			System.out.println("往期揭晓没有数据提示： "
					+ PastDetails.pastAnnoucePromptText.getText());
			HomePage.backBtn.click();
		} else {
			assertEquals("往期揭晓数据列表", true,
					PastDetails.pastAnnounceLists.exists());
			assertEquals("单条获奖记录", true, PastDetails.pastAnnouceWinner.exists());
			assertEquals("期号", true, PastDetails.pastAnnouceNumber.exists());
			System.out.println("中奖期号："
					+ PastDetails.pastAnnouceNumber.getText());
			assertEquals("揭晓时间", true, PastDetails.pastAnnouceTime.exists());
			System.out.println("揭晓时间：" + PastDetails.pastAnnouceTime.getText());
			assertEquals("获奖者头像", true, PastDetails.pastAnnouceIcon.exists());
			assertEquals("获奖者", true, PastDetails.pastAnnouceName.exists());
			System.out.println("获奖者：" + PastDetails.pastAnnouceName.getText());
			assertEquals("幸运号码", true,
					PastDetails.pastAnnouceLuckNumber.exists());
			System.out.println("幸运号码："
					+ PastDetails.pastAnnouceLuckNumber.getText());
			assertEquals("本期参与次数", true,
					PastDetails.pastAnnouceLuckCount.exists());
			System.out.println("本期参与次数："
					+ PastDetails.pastAnnouceLuckCount.getText());
			assertEquals("参与IP地址", true, PastDetails.pastAnnouceLuckIP.exists());
			System.out.println("参与IP地址："
					+ PastDetails.pastAnnouceLuckIP.getText());
			HomePage.backBtn.click();
		}
		System.out.println("====宝贝图文====");
		assertEquals("宝贝图文", true, GoodDetails.gooddesc.exists());
		GoodDetails.gooddesc.click();
		HomePage.backBtn.click();
		System.out.println("=====所有参与记录=====");
		if (GoodDetails.allattendrecords.exists()) {
			System.out
					.println("参与时间：" + GoodDetails.allattendrecords.getText());
			assertEquals("参与者头像", true, GoodDetails.attenderIcon.exists());
			assertEquals("参与者name", true, GoodDetails.attenderName.exists());
			assertEquals("参与者IP", true, GoodDetails.attenderIP.exists());
			assertEquals("参与人次、时间", true,
					GoodDetails.attenderCountTime.exists());
			HomePage.backBtn.click();
			HomePage.backBtn.click();
			HomePage.backBtn.click();// 返回商店首页
		} else {
			System.out.println("没有参与记录!!");
			HomePage.backBtn.click();
			HomePage.backBtn.click();// 返回商店首页
		}

	}

}
