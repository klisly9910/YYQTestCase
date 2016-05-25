package com.txh.amarket.testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.amarket.homepage.HomePage;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.gooddetails.GoodDetails;
import com.txh.yyq.publishedpage.PublishedPage;
import com.txh.yyq.scrollable.Vertical;

public class PublishedPageTestCase extends UiAutomatorTestCase {

	/**
	 * 揭晓页面（方法） 测试点击/判断属性是否存在 垂直滚动
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String jarName = "PublishedPageTestCase";
		String testClass = "com.txh.amarket.testcase.PublishedPageTestCase";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

	public void testCase() throws UiObjectNotFoundException {
		Vertical.scrollVertical.setAsVerticalList();
		Vertical.scrollVertical.flingForward();
		Vertical.scrollVertical.flingBackward();
		assertEquals("商品icon是否存在", true, PublishedPage.awardIcon.exists());
		assertEquals("商品name是否存在", true, PublishedPage.awardName.exists());
		assertEquals("期号text是否存在", true, PublishedPage.goodNumberText.exists());
		assertEquals("商品期号number是否存在", true, PublishedPage.goodNumber.exists());
		System.out.println("商品期号："
				+ (PublishedPage.goodNumberText.getText())
						.concat(PublishedPage.goodNumber.getText()));
		assertEquals("获得者text", true, PublishedPage.userText.exists());
		assertEquals("获得者name", true, PublishedPage.userName.exists());
		System.err.println("获得者："
				+ PublishedPage.userText.getText().concat(
						PublishedPage.userName.getText()));
		assertEquals("参与人次text", true, PublishedPage.countText.exists());
		assertEquals("参与人次buycount", true, PublishedPage.buyCount.exists());
		System.out.println("参与人次："
				+ PublishedPage.countText.getText().concat(
						PublishedPage.buyCount.getText()));
		assertEquals("幸运号码text", true, PublishedPage.luckynumberText.exists());
		assertEquals("幸运号码luckynumber", true,
				PublishedPage.luckyNumber.exists());
		System.out.println("幸运号码："
				+ PublishedPage.luckynumberText.getText().concat(
						PublishedPage.luckyNumber.getText()));
		assertEquals("揭晓时间text", true, PublishedPage.luckytimeText.exists());
		assertEquals("揭晓时间luckytime", true, PublishedPage.luckyTime.exists());
		System.out.println("揭晓时间："
				+ PublishedPage.luckytimeText.getText().concat(
						PublishedPage.luckyTime.getText()));
		// 点击商品icon进入商品详情页
		PublishedPage.awardIcon.clickAndWaitForNewWindow();
		assertEquals("商品详情页是否存在", true, GoodDetails.productDetailText.exists());
		HomePage.backBtn.click();
		// 点击获奖信息进入获奖者个人中心
		PublishedPage.awardMessage.clickAndWaitForNewWindow();
		assertEquals("个人中心icon是否存在", true, PublishedPage.otherIcon.exists());
		HomePage.backBtn.click();

	}

}
