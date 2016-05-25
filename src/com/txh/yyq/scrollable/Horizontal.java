package com.txh.yyq.scrollable;

import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 水平滚动
 * 
 * @author xiaohua
 * 
 */
public class Horizontal extends UiAutomatorTestCase {
	public static UiScrollable scrollHorizontal = new UiScrollable(
			new UiSelector().scrollable(true));

}
