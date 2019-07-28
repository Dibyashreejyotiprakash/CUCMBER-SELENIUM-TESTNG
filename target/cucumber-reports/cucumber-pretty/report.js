$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 8567839433,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Open application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.open_application()"
});
formatter.result({
  "duration": 98443747,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login_with_valid_credentials()"
});
formatter.result({
  "duration": 206759937,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_Home_Page()"
});
formatter.result({
  "duration": 48321,
  "status": "passed"
});
formatter.after({
  "duration": 393899905,
  "status": "passed"
});
formatter.before({
  "duration": 8593071350,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Open application",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verify Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.open_application()"
});
formatter.result({
  "duration": 57060,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login_with_valid_credentials()"
});
formatter.result({
  "duration": 206599552,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_Home_Page()"
});
formatter.result({
  "duration": 57061,
  "status": "passed"
});
formatter.after({
  "duration": 206868917,
  "status": "passed"
});
});