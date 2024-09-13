import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Home/lbl_Home-All-Products'), 0)

WebUI.verifyElementVisible(findTestObject('page_Home/lbl_Home-All-Products'))

WebUI.click(findTestObject('Object Repository/page_Home/button_account'))

WebUI.click(findTestObject('Object Repository/page_Home/button_Login'))

WebUI.waitForElementVisible(findTestObject('page_Login/lbl_Login'), 0)

WebUI.verifyElementVisible(findTestObject('page_Login/lbl_Login'))

WebUI.setText(findTestObject('Object Repository/page_Login/input_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/page_Login/input_password'), password)

WebUI.click(findTestObject('Object Repository/page_Login/btn_login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Home/lbl_Home-All-Products'), 0)

WebUI.verifyElementVisible(findTestObject('page_Home/lbl_Home-All-Products'))

WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

