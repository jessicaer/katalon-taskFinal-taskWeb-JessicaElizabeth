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

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Home/lbl_Home-All-Products'))

WebUI.callTestCase(findTestCase('Blocks/Login'), [('email') : 'jessica1@gmail.com', ('password') : 'YINYHPdEauSZ3521MwnC1g=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Home/lbl_Home-All-Products'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Home/lbl_Home-All-Products'))

WebUI.click(findTestObject('Object Repository/page_Home/button_Add-Basket-Apple-Juice'))

WebUI.click(findTestObject('Object Repository/page_Home/button_Add-Basket-Apple-Pomace'))

WebUI.click(findTestObject('Object Repository/page_Home/btn_Your-Basket'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Your-Basket'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Your-Basket'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/btn_Checkout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Select-Address'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Select-Address'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/New Folder (1)/span_Select an address_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/button_Continue-1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Choose-Delivery'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Choose-Delivery'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/New Folder (1)/span_Expected Delivery_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/button_Continue-2'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Make-Order/New Folder/lbl_Payment-Options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Make-Order/New Folder/lbl_Payment-Options'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/New Folder (1)/span_My Payment Options_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/btn_Continue-3'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Order-Summary'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Order-Summary'))

WebUI.click(findTestObject('Object Repository/page_Make-Order/btn_Checkout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Thank-for-Purchase'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_Make-Order/lbl_Thank-for-Purchase'))

WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

