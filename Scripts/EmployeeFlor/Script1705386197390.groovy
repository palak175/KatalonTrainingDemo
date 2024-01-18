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

WebUI.navigateToUrl('http://localhost:63772/')

WebUI.setText(findTestObject('Object Repository/Page_Index/input_UserId'), 'rahul')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Index/input_Password'), 'jN5yUvyTe4o=')

WebUI.click(findTestObject('Object Repository/Page_Index/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Index/button_Login here'))

WebUI.setText(findTestObject('Object Repository/Page_Index/input_UserId'), 'rahul')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Index/input_Password'), 'jN5yUvyTe4o=')

WebUI.click(findTestObject('Object Repository/Page_Index/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Index/button_Login here'))

WebUI.click(findTestObject('Object Repository/Page_Home/iIToggleMenuIcon'))

WebUI.setText(findTestObject('Object Repository/Page_Home/inputmySearch'), 'em')

WebUI.click(findTestObject('Object Repository/Page_Home/strong_Em'))

WebUI.click(findTestObject('Object Repository/Page_MainView/input_Name'))

WebUI.click(findTestObject('Object Repository/Page_MainView/i_add'))

WebUI.click(findTestObject('Object Repository/Page_MainView/button_OK'))

WebUI.setText(findTestObject('Object Repository/Page_MainView/input_Name'), 'Floor9')

WebUI.click(findTestObject('Object Repository/Page_MainView/i_add'))

WebUI.click(findTestObject('Object Repository/Page_MainView/i_edit'))

WebUI.setText(findTestObject('Object Repository/Page_MainView/input_Name'), 'Floor10')

WebUI.click(findTestObject('Object Repository/Page_MainView/i_add'))

WebUI.click(findTestObject('Object Repository/Page_MainView/i_material-icons md-18 Icon'))

WebUI.click(findTestObject('Object Repository/Page_MainView/button_OK'))

