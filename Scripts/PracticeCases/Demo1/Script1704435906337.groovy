import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/contact.htm')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Customer Care/input_name'), 'Palak')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Customer Care/input_email'), 'palak@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Customer Care/input_phone'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Customer Care/textarea_message'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Customer Care/input_button'))

