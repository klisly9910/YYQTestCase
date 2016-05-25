package com.txh.yyq.logout;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.personcenter.PersonCenter;

public class Logout extends UiAutomatorTestCase{

	/**
	 * 注销
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String jarName = "Logout";
		String testClass = "com.txh.yyq.logout.Logout";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}
	public void testCase()throws UiObjectNotFoundException{
		PersonCenter.exitlayout.click();
		PersonCenter.negtive.click();
		PersonCenter.exitlayout.click();
		PersonCenter.positive.click();
	}

}
