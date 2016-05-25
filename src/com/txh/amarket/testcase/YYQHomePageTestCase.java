package com.txh.amarket.testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.amarket.homepage.HomePage;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.gooddetails.GoodDetails;
import com.txh.yyq.scrollable.Vertical;

public class YYQHomePageTestCase extends UiAutomatorTestCase{

	/**
	 * 一元抢首页（方法） 测试点击/判断属性是否存在
	 * 测试垂直滚动
	 * @param args
	 */
	public static void main(String[] args) {
		String jarName = "YYQHomePageTestCase";
		String testClass = "com.txh.amarket.testcase.YYQHomePageTestCase";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}
	public void testCase()throws UiObjectNotFoundException{
		Vertical.scrollVertical.setAsVerticalList();
		Vertical.scrollVertical.flingForward();
		Vertical.scrollVertical.flingForward();
		Vertical.scrollVertical.flingBackward();
		assertEquals(true, HomePage.homeyyqIcon.exists());
		System.out.println("首页一元抢商品icon存在!");
		assertEquals(HomePage.homeyyqName.getText(), true,
				HomePage.homeyyqName.exists());
		System.out.println("首页一元抢商品name存在,name = "
				+ HomePage.homeyyqName.getText());
		assertEquals(true, HomePage.homeyyqDesc.exists());
		System.out.println("homeyyqDesc = " + HomePage.homeyyqDesc.getText());
		assertEquals(true, HomePage.homeyyqProgress.exists());
		System.out.println((HomePage.homeyyqDesc.getText())
				.concat(HomePage.homeyyqProgress.getText()));
		assertEquals(true, HomePage.homeyyqBar.exists());
		System.out.println("首页一元抢Bar存在!");
		assertEquals(true, HomePage.homeyyqBuy.exists());
		System.out.println("加入清单Buy存在!");
		HomePage.homeyyqBuy.click();
		HomePage.backBtn.click();
		HomePage.homeyyqIcon.click();
		assertEquals(true, GoodDetails.productDetailText.exists());
		HomePage.backBtn.click();
	}

}
