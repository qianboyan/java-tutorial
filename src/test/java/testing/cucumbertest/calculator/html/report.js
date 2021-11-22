$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/testing/cucumbertest/calculator/calculator.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator",
  "description": "As a user, I want to use a calculator to add numbers",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.before({
  "duration": 82094,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I want to begin",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 126101372,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.beginPrint()"
});
formatter.result({
  "duration": 35874,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add two numbers -2 \u0026 3",
  "description": "",
  "id": "calculator;add-two-numbers--2-\u0026-3",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I add -2 and 3",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the result should be 1",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 12316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-2",
      "offset": 6
    },
    {
      "val": "3",
      "offset": 13
    }
  ],
  "location": "CalculatorSteps.testAdd(int,int)"
});
formatter.result({
  "duration": 1380759,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.validateResult(int)"
});
formatter.result({
  "duration": 59776,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Add two numbers \u003cnum1\u003e \u0026 \u003cnum2\u003e",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I add \u003cnum1\u003e and \u003cnum2\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result should be \u003ctotal\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;",
  "rows": [
    {
      "cells": [
        "num1",
        "num2",
        "total"
      ],
      "line": 26,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;1"
    },
    {
      "cells": [
        "-2",
        "3",
        "1"
      ],
      "line": 27,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;2"
    },
    {
      "cells": [
        "10",
        "15",
        "25"
      ],
      "line": 28,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;3"
    },
    {
      "cells": [
        "99",
        "-99",
        "0"
      ],
      "line": 29,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;4"
    },
    {
      "cells": [
        "-1",
        "-10",
        "-11"
      ],
      "line": 30,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 36792,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I want to begin",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 21326,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.beginPrint()"
});
formatter.result({
  "duration": 107481,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Add two numbers -2 \u0026 3",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I add -2 and 3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result should be 1",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 15368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-2",
      "offset": 6
    },
    {
      "val": "3",
      "offset": 13
    }
  ],
  "location": "CalculatorSteps.testAdd(int,int)"
});
formatter.result({
  "duration": 158091,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.validateResult(int)"
});
formatter.result({
  "duration": 120949,
  "status": "passed"
});
formatter.before({
  "duration": 34130,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I want to begin",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 14561,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.beginPrint()"
});
formatter.result({
  "duration": 27128,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Add two numbers 10 \u0026 15",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I add 10 and 15",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result should be 25",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 30444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 6
    },
    {
      "val": "15",
      "offset": 13
    }
  ],
  "location": "CalculatorSteps.testAdd(int,int)"
});
formatter.result({
  "duration": 111163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.validateResult(int)"
});
formatter.result({
  "duration": 46907,
  "status": "passed"
});
formatter.before({
  "duration": 32541,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I want to begin",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 13800,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.beginPrint()"
});
formatter.result({
  "duration": 57157,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Add two numbers 99 \u0026 -99",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I add 99 and -99",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result should be 0",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 18716,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99",
      "offset": 6
    },
    {
      "val": "-99",
      "offset": 13
    }
  ],
  "location": "CalculatorSteps.testAdd(int,int)"
});
formatter.result({
  "duration": 102151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.validateResult(int)"
});
formatter.result({
  "duration": 40241,
  "status": "passed"
});
formatter.before({
  "duration": 31147,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I want to begin",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 12906,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.beginPrint()"
});
formatter.result({
  "duration": 26022,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Add two numbers -1 \u0026 -10",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I add -1 and -10",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the result should be -11",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.initializeCalculator()"
});
formatter.result({
  "duration": 35218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-1",
      "offset": 6
    },
    {
      "val": "-10",
      "offset": 13
    }
  ],
  "location": "CalculatorSteps.testAdd(int,int)"
});
formatter.result({
  "duration": 152242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-11",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.validateResult(int)"
});
formatter.result({
  "duration": 91885,
  "status": "passed"
});
});