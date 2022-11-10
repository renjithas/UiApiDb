/*TC coverage
To verify if the user is not able to create a booking if the request body is does not include all the field values
To verify if the response status is not 200
  */

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


def response = WS.sendRequestAndVerify(findTestObject('Object Repository/POST CreateBookingWithIncompleteFields'))