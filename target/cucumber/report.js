$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikipedia.feature");
formatter.feature({
  "name": "Wikipedia Search Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    },
    {
      "name": "@wikiTitle"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_is_on_wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" and look for it",
  "keyword": "When "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_types_and_look_for_it(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks searching button",
  "keyword": "And "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_clicks_searching_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is appear as title",
  "keyword": "Then "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_sees_is_appear_as_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Header Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    },
    {
      "name": "@wikiTitle2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on wikipedia page",
  "keyword": "Given "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_is_on_wikipedia_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User look for \"Steve Jobs\"",
  "keyword": "When "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_look_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_will_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the main header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikipediaSearchFunctionality.user_sees_is_in_the_main_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});