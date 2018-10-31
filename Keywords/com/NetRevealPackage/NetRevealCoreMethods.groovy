package com.NetRevealPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.remote.server.DriverFactory

import com.AppInteractions.AppInteractions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
public class NetRevealCoreMethods {

	@Keyword
	def login_NetReveal(String sURL,String sUserName,String sPassword){
		WebUI.openBrowser(sURL)

		WebUI.maximizeWindow()

		WebUI.waitForElementPresent(findTestObject('Page_Login/Page_NR Login/input_username'), 30)

		WebUI.takeScreenshot()

		WebUI.mouseOver(findTestObject('Page_Login/Page_NR Login/input_username'))

		WebUI.click(findTestObject('Page_Login/Page_NR Login/input_username'))

		WebUI.setText(findTestObject('Page_Login/Page_NR Login/input_username'), sUserName)

		WebUI.click(findTestObject('Page_Login/Page_NR Login/input_password'))

		WebUI.setText(findTestObject('Page_Login/Page_NR Login/input_password'), sPassword)

		String sActualUsrName = WebUI.getAttribute(findTestObject('Page_Login/Page_NR Login/input_username'), 'value')
		String sActualPassword = WebUI.getAttribute(findTestObject('Page_Login/Page_NR Login/input_password'), 'value')

		if(sUserName != sActualUsrName || sPassword != sActualPassword){
			WebUI.click(findTestObject('Page_Login/Page_NR Login/input_username'))

			WebUI.setText(findTestObject('Page_Login/Page_NR Login/input_username'), sUserName)

			WebUI.click(findTestObject('Page_Login/Page_NR Login/input_password'))

			WebUI.setText(findTestObject('Page_Login/Page_NR Login/input_password'), sPassword)
		}

		WebUI.click(findTestObject('Page_Login/Page_NR Login/button_LoginBtn'))

		WebUI.waitForElementPresent(findTestObject('Page_NRHomePage/Page_APPS/span_Ok'), 60)

		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Page_NRHomePage/Page_APPS/span_Ok'))

		WebUI.verifyElementPresent(findTestObject('Page_NRHomePage/Page_APPS/span_NRK-HOM'), 30)

		WebUI.verifyElementText(findTestObject('Page_NRHomePage/Page_APPS/span_NRK-HOM'), 'NRK-HOM')
		WebUI.takeScreenshot()
	}

	@Keyword
	def boolean navigate_NetReveal(String sPath){
		//Provided user is successfully logged into application
		boolean bflag = false
		WebUI.waitForElementPresent(findTestObject('Page_NRHomePage/Page_APPS/button_AlertMenu'), 30)

		WebUI.click(findTestObject('Page_NRHomePage/Page_APPS/button_AlertMenu'))


		if(sPath == 'a_All Alerts'){

		}


		WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Page_NRHomePage/Page_APPS/a_All Alerts'),30)
		if( element.isEnabled() ){
			WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))
			WebUI.delay(10)
			bflag = true
			return bflag
		}

	}

	@Keyword
	def boolean logout_NetReveal(){
		//Provided user is logged into application
		boolean bFlag = false
		WebUI.waitForElementPresent(findTestObject('Page_NRHomePage/Page_APPS/button_AlertMenu'), 30)

		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Page_NRHomePage/Page_APPS/button_AlertMenu'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Page_NRHomePage/Page_APPS/a_Logout'))

		WebUI.delay(5)

		if(WebUI.verifyElementPresent(findTestObject("Page_Login/Page_NR Login/WebElement_Logout"), 10)){
			bFlag = true

		}
	}
}