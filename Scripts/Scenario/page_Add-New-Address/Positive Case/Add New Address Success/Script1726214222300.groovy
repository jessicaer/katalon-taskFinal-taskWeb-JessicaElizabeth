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

WebUI.click(findTestObject('btn_Account/btn_Addresses'))

WebUI.waitForElementVisible(findTestObject('page_Address/lbl_Saved-Addresses'), 0)

WebUI.verifyElementVisible(findTestObject('page_Address/lbl_Saved-Addresses'))

WebUI.click(findTestObject('page_Address/btn_Add-New-Address'))

WebUI.waitForElementVisible(findTestObject('page_Address/page_Add-Address/lbl_Add-New-Address'), 0)

WebUI.verifyElementVisible(findTestObject('page_Address/page_Add-Address/lbl_Add-New-Address'))

WebUI.setText(findTestObject('page_Address/page_Add-Address/input_Country'), 'Indonesia')

WebUI.setText(findTestObject('Object Repository/page_Address/page_Add-Address/input_Name'), 'Kinan')

WebUI.setText(findTestObject('Object Repository/page_Address/page_Add-Address/input_Mobile-Number'), '0912378342')

WebUI.setText(findTestObject('Object Repository/page_Address/page_Add-Address/input_Zip-Code'), '12342')

WebUI.setText(findTestObject('Object Repository/page_Address/page_Add-Address/textarea_Address'), 'Jl Imam Bonjol')

WebUI.setText(findTestObject('Object Repository/page_Address/page_Add-Address/input_City'), 'Bandung')

WebUI.click(findTestObject('page_Address/page_Add-Address/btn_Submit'))

WebUI.waitForElementVisible(findTestObject('page_Address/lbl_Saved-Addresses'), 5)

WebUI.verifyElementVisible(findTestObject('page_Address/lbl_Saved-Addresses'))

WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

