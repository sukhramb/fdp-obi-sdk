Goal
---
Flex Debt Planner (FDP) is a web app built to solve problems for customers/borrowers. Idea is to build app which can provide useful insights/tips via dashboard so that customer can take informed decisiion to manage term loans in difficult situation.

FDP provides customer with tools / calculators that reccomend them to extend the payment or take payment holiday. This also comes with simple illustration on how extending the payment will chnage interest and pricipal payments.

## Archiitecture
![](https://github.com/sukhramb/fdp-obi-sdk/blob/master/fdp-architecture.png)



Usage
-----
This is extension of Open Banking API SDK  https://github.com/HashApithon/openbanking-java-sdk. The APIs for FDP application were added as below:

* '/fdp/accounts' - Fetch all banking accounts for mullipple banks/brands on open banking architecture.
* '/fdp/extend-payments' - Save requests for extension of payments

### Install

mvn install

### Running the app

mvn spring-boot:run
