package com.txh.yyq.sign;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.my.MyPage;
import com.txh.yyq.unsignpage.UnSignPage;

public class SignQQ extends UiAutomatorTestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String jarName = "SignQQ";
		String testClass = "com.txh.yyq.sign.SignQQ";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

	public void testCase() throws UiObjectNotFoundException {
		UnSignPage.loginQQ.clickAndWaitForNewWindow();
		UnSignPage.btnOk.clickAndWaitForNewWindow(2000);
		assertEquals("登录成功", true, MyPage.loggedName.exists());

	}

}
