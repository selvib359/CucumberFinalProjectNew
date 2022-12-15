$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/SkyBlueColor.feature");
formatter.feature({
  "line": 2,
  "name": "Sky Blue Background Functionality",
  "description": "",
  "id": "sky-blue-background-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Bluebackgroundpage"
    }
  ]
});
formatter.before({
  "duration": 3366476300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "1 User should be able to change the background color to skyblue",
  "description": "",
  "id": "sky-blue-background-functionality;1-user-should-be-able-to-change-the-background-color-to-skyblue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "\"Set Skyblue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button as \"Set Skyblue Background\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set Skyblue Background",
      "offset": 1
    }
  ],
  "location": "StepDefinition.button_exists(String)"
});
formatter.result({
  "duration": 207143700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set Skyblue Background",
      "offset": 26
    }
  ],
  "location": "StepDefinition.i_click_on_the_button_as(String)"
});
formatter.result({
  "duration": 3118757900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 3041602100,
  "status": "passed"
});
formatter.after({
  "duration": 766197100,
  "status": "passed"
});
formatter.before({
  "duration": 1924108200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "2 User should be able to change the background color to white",
  "description": "",
  "id": "sky-blue-background-functionality;2-user-should-be-able-to-change-the-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "\"Set SkyWhite Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the button as \"Set White background\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyWhite Background",
      "offset": 1
    }
  ],
  "location": "StepDefinition.button_exists(String)"
});
formatter.result({
  "duration": 79010400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set White background",
      "offset": 26
    }
  ],
  "location": "StepDefinition.i_click_on_the_button_as(String)"
});
formatter.result({
  "duration": 3071810700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 3049300500,
  "status": "passed"
});
formatter.after({
  "duration": 773956300,
  "status": "passed"
});
});