# oauth2-integration-keycloak-using-spring-boot

Hi, in this project I've integrated the authentication mechanism using oauth2.0 with Keycloak authorization server.

Pre-requisite and few steps to follow to generate access token using Keycloak server: 
1. The first pre-requisite here is to install keycloak in your system.
2. After installing create your admin credentials.
3. Once created, please create your own realm provider.
4. Create the users and clients in created realm.
5. Once created update the details in application.property file.
6. In this project we have tried both client credentials and authorization grant type as well.
7. I'll post the zip file of Postman collection as well, which will demonstrate easily how the tokens are generated.
8. Postman collection link : https://github.com/initishsachdeva/oauth2-integration-keycloak/blob/main/Spring%20Security%20Keycloak.postman_collection.json
9. Here we have defined both User and Admin role in keycloak server and similarly created the User and admin access level controllers.
10. So once, token is generated we have tried switching role and was able to see user level access wasn't able to access admin listed controllers.

# For generating access token in Postman :
1. Import the added collection in this project to postman
2. For client credentials follow the post request with name 'TokenUri using client creds'
3. For authorization grant type  you need to follow 2 steps :
    
    A. Run the endpoint under get request name 'Authorization Endpt_Step1' on browser and copy the generated code on URL
    
    B. Paste the generated code on post request 'Authorization Endpt_Step2' and click on send.You will see the access token generated on Response tab.
    
    C. Copy/paste the generated access token to your controllers request end point and you will see the correct response on response tab is populating.


For any queries please reach out to me on the mentioned social platform :

LinkedIn : https://www.linkedin.com/in/nitish-sachdeva-a0a71a121/

Gmail: nitishsachdeva39@gmail.com
