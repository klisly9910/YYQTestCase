package com.txh.amarket.testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.amarket.homepage.HomePage;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.gooddetails.GoodDetails;
import com.txh.yyq.scrollable.Vertical;
import com.txh.yyq.sign.SignWeiChat;
import com.txh.yyq.unsignpage.UnSignPage;

public class YYQHomePageTestCase extends UiAutomatorTestCase {

	/**
	 * 一元抢首页（方法） 测试点击/判断属性是否存在 测试垂直滚动
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String jarName = "YYQHomePageTestCase";
		String testClass = "com.txh.amarket.testcase.YYQHomePageTestCase";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

	public void testCase() throws UiObjectNotFoundException {
		// 进入一元抢首页
		HomePage.fourthNav.clickAndWaitForNewWindow();
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
		// 使用微信登录，登录后返回应用商店首页，再次点击加入清单
		if (UnSignPage.signBtn.exists()) {
			SignWeiChat.testCase();
			System.out.println("使用微信登录成功！！");
			HomePage.homeyyqBuy.click();
			assertEquals("一元抢", true, HomePage.yyqText.exists());
		}
		HomePage.homeyyqIcon.click();
		assertEquals(true, GoodDetails.productDetailText.exists());
		HomePage.backBtn.click();
		HomePage.backBtn.click();//返回应用商店首页
	}

}
