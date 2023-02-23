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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nimccbs.gov.ng/')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nimccbs.gov.ng/')

WebUI.click(findTestObject('Object Repository/Page_NIMC  CBS/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to ncbs/input_Username or email_username'), 'prod_bdcs_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to ncbs/input_Password_password'), 'iFGeFYmXIrWl+1q0scI6aQ==')

WebUI.click(findTestObject('Object Repository/Page_Log in to ncbs/input_Forgot Password_login'))

