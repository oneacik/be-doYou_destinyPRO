## **DO you Destiny PRO**
Searching application for Destiny 2 player. It presents basic statistics of a given player.

#### Motivation

Bungie.net allows users to create fireteams. Sometimes we can't determine the skill of the player who joins our team. That's why I decided to create an application that allows you to quickly check the player's general skills and statistics.

#### Features

[**Must have**](https://github.com/FAIRit/be-doYou_destinyPRO/issues?q=is%3Aissue+is%3Aopen+label%3A%22must+have%22)

[**Nice to have**](https://github.com/FAIRit/be-doYou_destinyPRO/issues?q=is%3Aissue+is%3Aopen+label%3A%22nice+to+have%22)

#### Tech/framework used

SpringBoot, Hibernate, Docker

#### Installation

Needed: Java, Maven, Docker

To run App locally, firstly you need build project with Maven:

`$ mvn install`

Secondly with installed Java run project:

`$ java -jar target/be_doyou_destinypro-0.0.1-SNAPSHOT.jar`

#### API Documentation

Endpoint documentation is available at https://bungie-net.github.io/multi/

#### How to use?

If the application is already installed and running.

Possible endpoints:

POST

localhost:8080/findplayer/{nickname}

localhost:8080/findplayer/{nickname}/pvpstats/{characterID}

localhost:8080/findplayer/{nickname}/pvestats/{characterID}

EXAMPLE VALUES

nickname: katojido

characterID: 2305843009410040403
