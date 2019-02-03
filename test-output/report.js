$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:TeamJanjua"
    }
  ],
  "line": 2,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4496124,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Valid Login",
  "description": "Validating valid login",
  "id": "loginfeature;valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I navigate to the FreeCRM",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"janjuana\" and \"Leeban1man\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_browser()"
});
formatter.result({
  "duration": 8510766558,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_the_FreeCRM()"
});
formatter.result({
  "duration": 7050355601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "janjuana",
      "offset": 9
    },
    {
      "val": "Leeban1man",
      "offset": 24
    }
  ],
  "location": "LoginSteps.i_enter_and(String,String)"
});
formatter.result({
  "duration": 1219085865,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "duration": 8522597210,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_successfully_logged_in()"
});
formatter.result({
  "duration": 202586256,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_close_browser()"
});
formatter.result({
  "duration": 1279730988,
  "status": "passed"
});
formatter.after({
  "duration": 966388,
  "status": "passed"
});
});