package com.txh.amarket.testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.amarket.homepage.HomePage;
import com.txh.uiautomatorhelper.UiAutomatorHelper;

/**
 * 首页一元抢（方法） 测试点击/判断属性是否存在
 * 
 * @param args
 */
public class HomePageyyqTestCase extends UiAutomatorTestCase {

	public static void main(String[] args) {
		String jarName = "HomePageyyqTestCase";
		String testClass = "com.txh.amarket.testcase.HomePageyyqTestCase";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

	public void testCase() throws UiObjectNotFoundException {
		HomePage.fourthNav.click();
		assertEquals(true, HomePage.yyqText.exists());
		HomePage.backBtn.click();
		HomePage.actionGo.click();
		assertEquals(true, HomePage.yyqText.exists());
		HomePage.backBtn.click();
		HomePage.homeyyq1.click();
		assertEquals(true, HomePage.yyqText.exists());
		HomePage.backBtn.click();
		HomePage.backBtn.click();
		HomePage.homeyyq2.click();
		assertEquals(true, HomePage.yyqText.exists());
		HomePage.backBtn.click();
		HomePage.backBtn.click();
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

	}

}
