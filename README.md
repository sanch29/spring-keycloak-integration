# spring-keycloak-integration
This repo is created to integrate spring boot application with a keycloak server and to use the keycloak token for authentication and custom authorization

To run Keycloak server:
1. Download keycloak standalone server v9.0.3 from https://www.keycloak.org/downloads.html
2. Unzip it.
3. Run following command from CMD--> standalone.bat -Djboss.socket.binding.port-offset=100
4. Keycloak server will be accessible on http://localhost:8180/auth

Keycloak configuration on server:
1. Click Add Realm
2. Set the name of realm to "Spring-keycloak"
3. Create a Client and name it as "login-app"
4. In the next screen, set the “Valid Redirect URIs field” to /element/*
5. Create a Role and name it as "user"
6. Create a User with any username and password (do not forget this username and password as it will be required for authentication)
7. Map the "user" role to the newly created User.

To run this project:
1. Clone it on your machine
2. Build this project and run it.
3. API: http://localhost:8081/element/{elementId} --> you can give any elementId, it will give a default output: {"elementId":"1","elementName":"hydrogen"} as in this project focus was more on integrating Keycloak with Spring.
