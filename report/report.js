$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/ICICI.feature");
formatter.feature({
  "name": "To validate the login page in ICICI application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@snaity"
    }
  ]
});
formatter.step({
  "name": "To launch The Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ICICIlogin.to_launch_The_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of ICICI application",
  "keyword": "When "
});
formatter.match({
  "location": "ICICIlogin.to_launch_url_of_ICICI_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ICICIlogin.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});