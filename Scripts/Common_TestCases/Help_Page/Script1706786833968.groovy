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

WebUI.navigateToUrl('https://caring-connections-qa.azurewebsites.net/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/input_username'), 'sachin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/input_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/button_Next'))

WebUI.scrollToElement(findTestObject('Help_Page/Page_CaringConnections-v-1.18/button_Help'), 0)

WebUI.click(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/button_Help'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/h3_Need Help in calendar Weve got your back'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/p_You can find the answer in our collections'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/img_help1-image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/img_help-image'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/span_How do I show my availability to provi_971f37'), 
    0)

WebUI.verifyElementClickable(findTestObject('Help_Page/Page_CaringConnections-v-1.18/svg_buttonFeature'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/svg_buttonFeature'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/span_How do I show my availability to provi_971f37'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/div_Step 1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/img_step-image'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/p_A pop-up window will appear for you to en_799693'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/img_step-image_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/div_Step 3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Help_Page/Page_CaringConnections-v-1.18/p_Repeat Step 2 to set remaining availabili_73c99c'), 
    0)

WebUI.closeBrowser()

