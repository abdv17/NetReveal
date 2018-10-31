
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement


def static "com.example.WebUICustomKeywords.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new com.example.WebUICustomKeywords()).isElementPresent(
        	to
         , 	timeout)
}

def static "com.example.WebUICustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.example.WebUICustomKeywords.getHtmlTableColumns"(
    	WebElement row	
     , 	String tagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableColumns(
        	row
         , 	tagName)
}

def static "com.NetRevealPackage.NetRevealCoreMethods.login_NetReveal"(
    	String sURL	
     , 	String sUserName	
     , 	String sPassword	) {
    (new com.NetRevealPackage.NetRevealCoreMethods()).login_NetReveal(
        	sURL
         , 	sUserName
         , 	sPassword)
}

def static "com.NetRevealPackage.NetRevealCoreMethods.navigate_NetReveal"(
    	String sPath	) {
    (new com.NetRevealPackage.NetRevealCoreMethods()).navigate_NetReveal(
        	sPath)
}

def static "com.NetRevealPackage.NetRevealCoreMethods.logout_NetReveal"() {
    (new com.NetRevealPackage.NetRevealCoreMethods()).logout_NetReveal()
}

def static "com.AppInteractions.AppInteractions.ClickUsingJS"(
    	TestObject to	
     , 	int timeout	) {
    (new com.AppInteractions.AppInteractions()).ClickUsingJS(
        	to
         , 	timeout)
}
