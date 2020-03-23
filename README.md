# Base Web UI Test

Automated test for Web UI using Selenium, Serenity and Cucumber

## Getting Started

You can use feature Fork, Clone or Download to use this project

### Prerequisites

What things you need to install the software and how to install them

```
- IntelliJ IDEA
- Java 1.8
- Maven 3.5.x
- Webdriver (ChromeDriver)
- Web Browser (Google Chrome)
```

## Foldering
You can find the "features" folder under this
src/test/resources/features/

You can find the "Steps" , "Pages",and "Calculator" folder under this
src/test/java/


## Running the tests

you can use `mvn clean verify` to run all test or 
use `mvn clean verify -Dcucumber.option="--tag @TagN_Name"` for specific test using Cucumber

### Report

you can open the report on folder `target/site/index.html`