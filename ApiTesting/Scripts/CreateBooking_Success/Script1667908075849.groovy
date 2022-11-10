/*TC coverage
To verify if the user is able to create a booking providing valid data in all the required fields
To verify if the response status is 200
 */

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


def response = WS.sendRequestAndVerify(findTestObject('Object Repository/POST CreateBooking'))