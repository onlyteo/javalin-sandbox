# Javalin REST API

This example shows a React frontend and Javalin REST API.

## Prerequisites

* Java Runtime - e.g. [Temurin JDK](https://adoptium.net), [OpenJDK](https://openjdk.org) or [Oracle JDK](https://www.oracle.com/java)
* [NodeJS Runtime](https://nodejs.org)
* [NPM](https://www.npmjs.com) or [Yarn](https://yarnpkg.com)
* [Docker](https://www.docker.com)

## Run

Start Backend application:
```bash
../gradlew :javalin-rest-api:backend:run
```

Start Frontend API application:

```bash
../gradlew :javalin-rest-api:frontend-api:run
```

Start Frontend application (this should open a browser window):
```bash
yarn --cwd ./frontend install
yarn --cwd ./frontend start
```

## Architecture

The example consists of a `Frontend` and a `Backend` application.

```mermaid
graph TD
    subgraph Frontend
        A[REST Client]:::react
    end
    subgraph Frontend API
        B[REST API]:::javalin
    end
    subgraph Backend
        C[REST API]:::javalin
    end

    A -- REST --> B
    B-- REST --> C

    classDef react fill: #58c4dc, stroke: #000000, color: #000000
    classDef javalin fill: #007ea3, stroke: #000000, color: #000000
```

### Backend

The Backend is a REST API application based on Javalin.

### Frontend API

The Frontend API is a REST API application based on Javalin.

### Frontend

The Frontend is a JavaScript web application based on ReactJS and using the React Bootstrap framework.
