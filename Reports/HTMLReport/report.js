$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/fblogin/LoginFB.feature");
formatter.feature({
  "name": "To validate Login functionality in Facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@alpha"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginFunctionality.userIsInFacebookLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate forgetten password scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@alpha"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User click the forgetten password button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginFunctionality.userClickTheForgettenPasswordButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the mail address or phone number",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mailId"
      ]
    },
    {
      "cells": [
        "smartskill",
        "javaselenium",
        "srikeerthana10@gmail.com"
      ]
    },
    {
      "cells": [
        "897655",
        "git",
        "smartskill123@gmail.com"
      ]
    },
    {
      "cells": [
        "smartskill@gmail.com",
        "jenkins",
        "skill76@Gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginFunctionality.userEnterTheMailAddressOrPhoneNumber(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the search btn",
  "keyword": "And "
});
formatter.match({
  "location": "LoginFunctionality.userClickTheSearchBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter into invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFunctionality.userEnterIntoInvalidCredentialsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});