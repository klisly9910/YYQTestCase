package com.txh.yyq.sign;

import jp.jun_nama.test.utf7ime.helper.Utf7ImeHelper;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.unsignpage.UnSignPage;

public class SignImapp extends UiAutomatorTestCase {

	/**
	 * 使用机锋应用商店注册的账号登录
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String jarName = "SignImapp";
		String testClass = "com.txh.yyq.sign.SignImapp";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

	public static void testCase() throws UiObjectNotFoundException {
		UnSignPage.etusername.click();
		UnSignPage.etusername.setText(Utf7ImeHelper.e("imopan507"));
		UnSignPage.etpsd.click();
		UnSignPage.etpsd.setText(Utf7ImeHelper.e("654321"));
		UnSignPage.signBtn.clickAndWaitForNewWindow();

	}

}
