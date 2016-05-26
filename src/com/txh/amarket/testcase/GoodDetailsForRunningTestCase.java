package com.txh.amarket.testcase;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.amarket.homepage.HomePage;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.homepage.YYQHomePage;

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
	public void testCase()throws UiObjectNotFoundException{
		HomePage.fourthNav.clickAndWaitForNewWindow();
		YYQHomePage.homeRadio.click();
	}

}
