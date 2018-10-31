import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.NetRevealPackage.NetRevealCoreMethods as NR
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

CustomKeywords.'com.NetRevealPackage.NetRevealCoreMethods.login_NetReveal'(GlobalVariable.G_SiteURL, 'l090879', 'Westpac@2')

boolean bflag = CustomKeywords.'com.NetRevealPackage.NetRevealCoreMethods.navigate_NetReveal'('a_All Alerts')

if (bflag) {
    log.logPassed('Successfully navigated to All Alerts screen')

    WebUI.takeScreenshot()
} else {
    log.logFailed('Failed to navigate to All Alerts screen')

    WebUI.takeScreenshot()
}

bflag = CustomKeywords.'com.NetRevealPackage.NetRevealCoreMethods.logout_NetReveal'()

if (bflag) {
	log.logPassed('Successfully logged out of application')

	WebUI.takeScreenshot()
} else {
	log.logFailed('Failed to log out of application')

	WebUI.takeScreenshot()
}

WebUI.closeBrowser()

