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
WebUI.maximizeWindow()
WebUI.navigateToUrl('traveloka.com')
WebUI.delay(3)
// fitur flight
WebUI.click(findTestObject('Flight/img'))
WebUI.click(findTestObject('Flight/div_Flights'))
WebUI.click(findTestObject('Object Repository/Flight/h4_One-way  Round-trip'))

// memilih seat class
WebUI.click(findTestObject('Object Repository/Flight/svg_Toggle Options'))
WebUI.click(findTestObject('Object Repository/Flight/div_Economy'))
// menginput kota tujian
WebUI.setText(findTestObject('Flight/input_kota_tujuan'), 'Padang')
WebUI.scrollToElement(findTestObject('Object Repository/Flight/div_Padang, Indonesia'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Flight/div_Padang, Indonesia'), 0)
WebUI.click(findTestObject('Object Repository/Flight/div_Padang, Indonesia'))

WebUI.scrollToElement(findTestObject('Object Repository/Flight/h4_One-way  Round-trip'), 1)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Flight/div_Search Flight'))
// verifikasi
WebUI.waitForElementPresent(findTestObject('Object Repository/Flight/varifikasi/h3_Jakarta (JKTA)  Padang (PDG)'), 1)
WebUI.verifyTextPresent('Jakarta (JKTA) → Padang (PDG)', false, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot()



