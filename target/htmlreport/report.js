$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/sample4.feature");
formatter.feature({
  "name": "test login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens neutors app",
  "keyword": "Given "
});
formatter.match({
  "location": "login11.user_opens_neutors_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"mercury\" And password as \"mercury\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user submit Login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify Pass",
  "keyword": "Then "
});
formatter.match({
  "location": "login11.verify_Pass()"
});
formatter.result({
  "status": "skipped"
});
});