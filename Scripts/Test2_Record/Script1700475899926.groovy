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

WebUI.navigateToUrl('https://www.myntra.com/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping for Women, Men, Kids F_27b4d1/a_login  Signup'))

WebUI.setText(findTestObject('Object Repository/Page_Myntra/input_form-control mobileNumberInput'), '9904403246')

WebUI.click(findTestObject('Object Repository/Page_Myntra/div_CONTINUE'))

WebUI.click(findTestObject('Object Repository/Page_Myntra/div_CONTINUE'))

WebUI.setText(findTestObject('Object Repository/Page_Myntra/input_otp0'), '6')

WebUI.setText(findTestObject('Object Repository/Page_Myntra/input_otp1'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Myntra/input_otp2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Myntra/input_otp3'), '1')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping for Women, Men, Kids F_27b4d1/a_myntraweb-sprite desktop-logo sprites-headerLogo'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping for Women, Men, Kids F_27b4d1/a_Dresses'))

WebUI.closeBrowser()

