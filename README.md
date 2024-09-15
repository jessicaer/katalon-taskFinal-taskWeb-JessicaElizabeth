# Katalon WEB Automation Testing

This web automation test is built using Katalon Studio and integrates seamlessly with the OWASP Juice Shop web ( https://juice-shop.herokuapp.com/#/ ).

#### A.Test Cases
1. Register: Registers a new user account.
2. Login: Login with user credentials.
3. Add Address: Adds a new shipping address to the user's account.
4. Add Card: Adds a payment card to the user's account
5. Make Order: Places an order using the added address and card.

#### B. Test Suite
1. Regression Test Suite User Flow: This suite covers the entire user journey from registration through to placing an order. It ensures that the process works seamlessly from start to finish.
   * Data-Driven Testing: Specifically applied to the login test case to verify the login functionality with multiple sets of credentials.

#### C. Steps to Execute the Automation in Katalon:
1. Open Katalon and select New Project.
2. Click Clone Git and paste the repository's HTTPS link
3. Navigate to the Object Repository.
4. Open the Test Case folder.
5. Select the appropriate test cases and click Run.
