$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Test Registration of new user",
  "description": "",
  "id": "test-registration-of-new-user",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Test successful registration of a new user",
  "description": "",
  "id": "test-registration-of-new-user;test-successful-registration-of-a-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter email address of new user",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on CreateAccount button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my personal informations",
  "rows": [
    {
      "cells": [
        "Title",
        "CustomerFirstName",
        "CustomerLastName",
        "Email",
        "Password",
        "DateOfBirth"
      ],
      "line": 11
    },
    {
      "cells": [
        "\u003ctitle\u003e",
        "\u003ccFname\u003e",
        "\u003ccLname\u003e",
        "\u003cemail\u003e",
        "\u003cpwd\u003e",
        "\u003cdob\u003e"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter my address informations",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Company",
        "Address",
        "AddressLine2",
        "City",
        "State",
        "ZipCode",
        "Country"
      ],
      "line": 16
    },
    {
      "cells": [
        "\u003cfname\u003e",
        "\u003clname\u003e",
        "\u003ccompany\u003e",
        "\u003caddr1\u003e",
        "\u003caddr2\u003e",
        "\u003ccity\u003e",
        "\u003cstate\u003e",
        "\u003czip\u003e",
        "\u003ccountry\u003e"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter additional informations",
  "rows": [
    {
      "cells": [
        "AdditionalInformation",
        "HomePhone",
        "MobilePhone",
        "AlternateAddress"
      ],
      "line": 21
    },
    {
      "cells": [
        "\u003cremarks\u003e",
        "\u003chomephone\u003e",
        "\u003cmobile\u003e",
        "\u003caddr3\u003e"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I redirected to order summary page",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "test-registration-of-new-user;test-successful-registration-of-a-new-user;",
  "rows": [
    {
      "cells": [
        "\u003ctitle\u003e",
        "\u003ccFname\u003e",
        "\u003ccLname\u003e",
        "\u003cemail\u003e",
        "\u003cpwd\u003e",
        "\u003cdob\u003e",
        "\u003cfname\u003e",
        "\u003clname\u003e",
        "\u003ccompany\u003e",
        "\u003caddr1\u003e",
        "\u003caddr2\u003e",
        "\u003ccity\u003e",
        "\u003cstate\u003e",
        "\u003czip\u003e",
        "\u003ccountry\u003e  \u003cremarks\u003e",
        "\u003chomephone\u003e",
        "\u003cmobile\u003e",
        "\u003caddr3\u003e"
      ],
      "line": 28,
      "id": "test-registration-of-new-user;test-successful-registration-of-a-new-user;;1"
    }
  ],
  "keyword": "Examples"
});
formatter.uri("SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "To verify Sign Up feature",
  "description": "",
  "id": "to-verify-sign-up-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To verify successful sign up",
  "description": "",
  "id": "to-verify-sign-up-feature;to-verify-successful-sign-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is present in automationpractice website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Sign Up",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should get redirected to Registartion Page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpTest.user_is_present_in_automationpractice_website()"
});
formatter.result({
  "duration": 51160569019,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.user_clicks_on_Sign_Up()"
});
formatter.result({
  "duration": 3513434599,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.user_should_get_redirected_to_Registartion_Page()"
});
formatter.result({
  "duration": 973980023,
  "status": "passed"
});
