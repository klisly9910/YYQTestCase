package com.txh.yyq.scrollable;

import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 垂直滚动
 * 
 * @author xiaohua
 * 
 */
public class Vertical extends UiAutomatorTestCase {
	public static UiScrollable scrollVertical = new UiScrollable(
			new UiSelector().scrollable(true));
	

}
