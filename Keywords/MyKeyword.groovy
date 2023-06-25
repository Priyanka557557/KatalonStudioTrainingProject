import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeyword {

	@Keyword

	def hello() {

		println(" hello world ")
	}

	@Keyword

	def login() {
		WebUI.setText(findTestObject('Object Repository/Page_User Management/input_User Name_username'), 'FBL_SUPER_ADMIN')
		WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Password_password'),'8SQVv/p9jVScEs4/2CZsLw==' )
		WebUI.setText(findTestObject('Object Repository/Page_User Management/input_Institution_institutionName'),'FBL' )
		WebUI.click(findTestObject('Object Repository/Page_User Management/span_Sign in'))
	}

	@Keyword

	def HelloUsers(String user) {

		println "Hello " +user
	}
}