# Data Ingestion in Plain Java

### Description
- This simple app reads data from a remote source and writes the data to a database.
- The use case of this app shall ingest news articles from RSS sources.
- This app is a tutorial (link at bottom of page) in which an RSS Client is built which has the capability to ingest data and then write that data to a 
Relational Database Management System (RDBMS). In this case the app uses a **MySQL database** but many other options would do an equally capable job.

<br/>

|  Component             | Tech                                                                                                                                                                                                                                                                                                                             |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Demo Link    | [data-ingestion.lyle.app](https://data-ingestion.lyle.app) (inactive)                                                                                                                                                                                                                                                            |
| Tech Stack   | ![Spring Boot](https://img.shields.io/badge/spring%20boot-white.svg?style=for-the-badge&logo=springboot&logoColor=6DB33F) ![MySQL](https://img.shields.io/badge/MySQL-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) ![RSS](https://img.shields.io/badge/RSS-white.svg?style=for-the-badge&logo=rss&logoColor=#FFA500) |
| Cloud Deploy | ![Azure](https://img.shields.io/badge/microsoft%20azure-0078D4.svg?style=for-the-badge&logo=microsoft%20azure&logoColor=white)                                                                                                                                                                                               |
| Compiler     | ![Java](https://img.shields.io/badge/JAVA%20-JDK%2017-green?style=for-the-badge)                                                                                                                                                                                                                                                 |
| Top Language | ![Github Language](https://img.shields.io/github/languages/top/lylio/rss-data-ingestion?style=for-the-badge)                                                                                                                                                                                                                     |
| Last Commit  | ![Github Commit Activity](https://img.shields.io/github/last-commit/lylio/rss-data-ingestion/main?style=for-the-badge)                                                                                                                                                                                                           |

<br />

![RSS Data Feed](https://raw.githubusercontent.com/Lylio/image-library/master/system-designs/rss-data-feed.png)



### Setup & Launch

#### MySQL Database Instructions
1. Ensure MySQL is running locally on your machine
2. Final details coming soon

#### Launch Spring Boot App
1. Navigate to directory `cd rss-data-ingestion` (where `pom.xml` file is)
2. Run the terminal command `mvn spring-boot:run`
3. Full instructions coming soon

<br >

#### Acknowledgements
- This app was built using with guidance from the tutorial [Data Ingestion In Plain Java](https://asyncq.com/data-ingestion-in-plain-java?source=post_page-----42e08b6c4797--------------------------------)
- The repo badges, logos and code stats on this README are courtesy of [Simple Icons](https://simpleicons.org) and [Shields.io](https://shields.io)
