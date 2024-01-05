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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/register.htm')

WebUI.setText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.firstName'), 
    'Palak')

WebUI.setText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.lastName'), 
    'Desai')

WebUI.setText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.street'), 
    'Surat')

WebUI.setText(findTestObject('Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.city'), 'Surat')

WebUI.setText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.state'), 
    'Gujarat')

WebUI.setText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.zipCode'), 
    '396320')

WebUI.setText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.phoneNumber'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.ssn'), 
    '1234')

WebUI.setText(findTestObject('Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.username'), 'Palak')

WebUI.setEncryptedText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.password'), 
    'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_repeatedPassword'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Demo2/Page_ParaBank  Register for Free Online Acc_dbf84b/input_button'))

WebUI.rightClick(findTestObject('Object Repository/Demo2/Page_ParaBank  Customer Created/p_Your account was created successfully. Yo_fafba4'))

WebUI.verifyElementText(findTestObject('Object Repository/Demo2/Page_ParaBank  Customer Created/h1_Welcome Palak'), 'Welcome Palak')

