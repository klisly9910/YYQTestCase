package com.txh.yyq.homepage;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * 一元抢首页（属性） 商品信息属性与首页中的商品信息属性一致，测试方法直接调用首页的商品信息属性即可
 * 
 * @param args
 */
public class YYQHomePage extends UiAutomatorTestCase {
	//底部[一元抢]按钮
	public static UiObject homeRadio = new UiObject(
			new UiSelector().resourceId("com.mappn.gfan:id/homeRadio"));

}
