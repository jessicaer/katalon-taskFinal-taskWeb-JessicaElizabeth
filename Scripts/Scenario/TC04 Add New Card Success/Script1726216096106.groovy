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

WebUI.callTestCase(findTestCase('Blocks/Login'), [('email') : 'jessica1@gmail.com', ('password') : 'YINYHPdEauSZ3521MwnC1g=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Home/lbl_Home-All-Products'), 0)

WebUI.verifyElementVisible(findTestObject('page_Home/lbl_Home-All-Products'))

WebUI.click(findTestObject('page_Home/button_Account'))

WebUI.click(findTestObject('btn_Account/btn_Orders-Payment'))

WebUI.click(findTestObject('btn_Account/btn_Payment-Options-Card'))

WebUI.waitForElementVisible(findTestObject('page_Add-Card/txt_My-Payment-Options'), 0)

WebUI.verifyElementVisible(findTestObject('page_Add-Card/txt_My-Payment-Options'))

WebUI.click(findTestObject('page_Add-Card/expansion-panel_Add-New-Card'))

WebUI.setText(findTestObject('page_Add-Card/input_Name'), 'Jessica')

WebUI.setText(findTestObject('page_Add-Card/input_Card-Number'), '1234567891012131')

WebUI.selectOptionByLabel(findTestObject('page_Add-Card/select_Expiry-Month'), '10', false)

WebUI.selectOptionByLabel(findTestObject('page_Add-Card/select_Expiry-Year'), '2090', false)

WebUI.click(findTestObject('page_Add-Card/button_send-Submit'))

WebUI.waitForElementVisible(findTestObject('page_Add-Card/txt_My-Payment-Options'), 15)

WebUI.verifyElementVisible(findTestObject('page_Add-Card/txt_My-Payment-Options'))

WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

