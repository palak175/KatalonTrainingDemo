import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

