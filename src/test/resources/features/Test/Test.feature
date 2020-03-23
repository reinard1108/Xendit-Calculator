Feature: Test online calculator scenarios
  @Test
  Scenario Outline: Test subtraction, division and CE functionalities
    Given Open chrome browser and start application
    When I enter following values and press CE button
      |value1 | value2 | operator |
      |<value1> | <value2>| <operator>|
    Then I should be able to see
      |	expected   |
      | <expected> |
    Examples:
      | value1  		| value2 		| operator			| expected	|
      | 	2 			|   2			|		/			| 1			|
      | 	3 			|   0			|		/			| Error		|
      | 	0 			|   4			|		/			| 0			|
      | 	10 			|   20			|		/			| 0.5		|
      | 	-15 		|   50			|		/			| -0.3		|
      | 	1 			|   1			|		-			| 0			|
      | 	1 			|   2			|		-			| -1		|
      | 	-5 			|   4			|		-			| -9		|