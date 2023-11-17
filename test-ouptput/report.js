$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contacts.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM create Contacts",
  "description": "",
  "id": "freecrm-create-contacts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "freecrm-create-contacts;free-crm-create-a-new-contact-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters contact details firstname and lastname and position",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Test Login feature",
  "description": "",
  "id": "free-crm-login-feature;free-crm-test-login-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters user name and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.user_already_on_the_login_page()"
});
formatter.result({
  "duration": 6900256400,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.title_of_login_page_is_FreeCRM()"
});
formatter.result({
  "duration": 19090200,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_enters_user_name_and_password()"
});
formatter.result({
  "duration": 369298700,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 940924600,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 22698700,
  "status": "passed"
});
});