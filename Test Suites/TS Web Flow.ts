<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS Web Flow</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>ec991e2c-94cb-4829-b0b0-eb9efec445a1</testSuiteGuid>
   <testCaseLink>
      <guid>07774111-32e8-4a89-9d74-fa2c48fa14c1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC01 Registration Success</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>bc479f9f-48bc-47ab-b197-80a23887eafb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>b5ea691f-3636-4758-939b-5dc32549bfa0</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>d919835a-37b3-4fc3-b472-7e78e177612a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC02 Login Success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>6aadde6c-aeb1-40bd-8822-0c1367637439</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Katalon Data/data-login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>6aadde6c-aeb1-40bd-8822-0c1367637439</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>ccb78266-0865-40a1-a01d-f533efd3f22d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>6aadde6c-aeb1-40bd-8822-0c1367637439</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>912ec2d8-24a9-43de-8a0d-0c8722067ce6</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>6a622264-451a-47f1-822e-18a1f77808b2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC03 Add New Address Success</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>2045f434-fe9a-4f55-a885-8296d7f4ae33</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC04 Add New Card Success</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>f39bf975-8520-43c6-b496-bbab8421035b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC05 Make Order</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
