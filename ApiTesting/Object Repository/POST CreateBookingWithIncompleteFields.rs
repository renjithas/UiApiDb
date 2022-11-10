<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST CreateBookingWithIncompleteFields</name>
   <tag></tag>
   <elementGuidId>4e22d58f-f1b7-41e8-a836-65dfafe21370</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;lastname\&quot; : \&quot;${lastName}\&quot;,\n    \&quot;totalprice\&quot; : ${price},\n    \&quot;depositpaid\&quot; : ${depositpaid},\n    \&quot;bookingdates\&quot; : {\n        \&quot;checkin\&quot; : \&quot;${checkinDate}\&quot;,\n        \&quot;checkout\&quot; : \&quot;${checkoutDate}\&quot;\n    },\n    \&quot;additionalneeds\&quot; : \&quot;${additionalNeeds}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>64f35da0-257b-4de0-b099-f68ef83472b5</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d7c580f6-8429-40e1-9461-6b6b8c5dc92e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.baseUrl}/booking</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Brown'</defaultValue>
      <description></description>
      <id>97e4270f-9642-4c13-84ca-1a698894f49b</id>
      <masked>false</masked>
      <name>lastName</name>
   </variables>
   <variables>
      <defaultValue>111</defaultValue>
      <description></description>
      <id>b022c6e5-833f-4965-b0dd-3581d452885a</id>
      <masked>false</masked>
      <name>price</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>c6dcb078-0f60-426e-bc85-4500f9d3b00c</id>
      <masked>false</masked>
      <name>depositpaid</name>
   </variables>
   <variables>
      <defaultValue>'2018-01-01'</defaultValue>
      <description></description>
      <id>389febb5-51bf-47c6-8313-5dcc5763d523</id>
      <masked>false</masked>
      <name>checkinDate</name>
   </variables>
   <variables>
      <defaultValue>'2019-01-01'</defaultValue>
      <description></description>
      <id>461196a9-3722-414b-8ed4-5bce362c565c</id>
      <masked>false</masked>
      <name>checkoutDate</name>
   </variables>
   <variables>
      <defaultValue>'Breakfast'</defaultValue>
      <description></description>
      <id>506f99ec-4d55-4b39-a8d3-f9c17a713a96</id>
      <masked>false</masked>
      <name>additionalNeeds</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getStatusCode()).isNotEqualTo(GlobalVariable.responseCodeSuccess)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
