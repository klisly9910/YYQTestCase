package com.txh.amarket.testcase;

import jp.jun_nama.test.utf7ime.helper.Utf7ImeHelper;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.txh.amarket.homepage.HomePage;
import com.txh.uiautomatorhelper.UiAutomatorHelper;
import com.txh.yyq.billlist.BillList;
import com.txh.yyq.sign.SignQQ;
import com.txh.yyq.unsignpage.UnSignPage;

public class BillListTestCase extends UiAutomatorTestCase {

	/**
	 * 清单页面测试用例
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String jarName = "BillListTestCase";
		String testClass = "com.txh.amarket.testcase.BillListTestCase";
		String testName = "testCase";
		String androidId = "1";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);

	}

	public void testCase() throws UiObjectNotFoundException {
		// 进入一元抢首页
		HomePage.fourthNav.clickAndWaitForNewWindow();
		// 进入清单页面
		BillList.billRadio.clickAndWaitForNewWindow();
		if (UnSignPage.signBtn.exists()) {
			SignQQ.testCase();
			System.out.println("使用QQ登录成功！！");
			// 再次点击[清单]进入清单页面
			BillList.billRadio.clickAndWaitForNewWindow();
		}
		// 根据清单页面是否有数据执行不同的语句
		if (BillList.emptyGo.exists()) {
			System.out.println("清单页面没有数据，开始抢宝按钮存在！！");
			BillList.emptyGo.click();
			HomePage.backBtn.click();
		} else {
			assertEquals("编辑按钮是否存在", true, BillList.editBtn.exists());
			assertEquals("清单列表是否存在", true, BillList.billList.exists());
			assertEquals("商品icon是否存在", true, BillList.billIcon.exists());
			assertEquals("商品描述是否存在", true, BillList.billDsc.exists());
			// 总需人次，剩余人次
			assertEquals("剩余参与人次是否存在", true, BillList.billCount.exists());
			System.out.println("总需人次，剩余人次：" + BillList.billCount.getText());

			// count是最小值时，-不可点击false
			if ((BillList.editcount.getText()).equals("1")
					|| (BillList.editcount.getText()).equals("2")) {
				assertEquals("-号是否可点击", false, BillList.minus.isClickable());
			}
			// +号可以点击true
			assertEquals("+号是否可点击", true, BillList.plus.isClickable());
			BillList.plus.click();
			// 再次点击-应该是可点击true
			if (!(BillList.editcount.getText()).equals("1")
					|| (BillList.editcount.getText()).equals("2")) {
				assertEquals("-号是否可点击", true, BillList.minus.isClickable());
				BillList.minus.click();
			}
			// 清空etcount-输入5
			BillList.editcount.clickBottomRight();
			BillList.editcount.clearTextField();
			BillList.editcount.setText(Utf7ImeHelper.e("5"));
			assertEquals("宝贝数量与所需金额：", true, BillList.billNum.exists());
			System.out.println("总计X件宝贝，共计x元:" + BillList.billNum.getText());

			assertEquals("结算按钮是否存在", true, BillList.submitBtn.exists());
			BillList.submitBtn.click();
			HomePage.backBtn.click();
			HomePage.backBtn.click();// 返回应用商店首页homepage
		}

	}

}
