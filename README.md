# Javalin Sandbox

[![Kotlin](https://img.shields.io/badge/kotlin-2.0.10-8d53f9.svg?logo=kotlin&logoColor=8d53f9)](http://kotlinlang.org)
[![Javalin](https://img.shields.io/badge/javalin-6.3.0-007ea3.svg?logo=java&logoColor=fdb71c)](https://javalin.io)
[![Gradle](https://img.shields.io/badge/gradle-stable-209bc4.svg?logo=gradle&logoColor=209bc4)](https://gradle.org)
[![TypeScript](https://img.shields.io/badge/typescript-5.2.2-3178c6.svg?logo=typescript&logoColor=3178c6)](https://www.typescriptlang.org)
[![React](https://img.shields.io/badge/react-18.3.1-58c4dc.svg?logo=react&logoColor=58c4dc)](https://react.dev)
[![Node.js](https://img.shields.io/badge/node.js-stable-417e38.svg?logo=nodedotjs&logoColor=417e38)](https://nodejs.org)
[![GitHub license](https://img.shields.io/badge/license-Apache_2.0-e97726.svg)](https://www.apache.org/licenses/LICENSE-2.0)

This repository contain sandbox projects to showcase features of the [Javalin framework](https://javalin.io).

All examples are written in [Kotlin](https://kotlinlang.org) and built using [Gradle](https://gradle.org).

## Examples
Read details about the examples in their respective project roots.

## Architecture
[Javalin](https://javalin.io) is a lightweight framework for building applications for the
[JVM runtime](https://en.wikipedia.org/wiki/Java_virtual_machine).

The examples typically consists of a `Frontend` and a `Backend` application.

```mermaid
graph TD
    A[Javalin Frontend]
    B[Javalin Backend]

    A:::javalin --> B:::javalin
    
    classDef react fill: #58c4dc, stroke: #000000, color: #000000
    classDef javalin fill: #007ea3, stroke: #000000, color: #000000
```

If the frontend is a JavaScript application then there is often also a `Frontend API` application.

```mermaid
graph TD
    A[React Frontend]
    B[Javalin Frontend API]
    C[Javalin Backend]
    
    A:::react --> B:::javalin
    B:::javalin --> C:::javalin
    
    classDef react fill: #58c4dc, stroke: #000000, color: #000000
    classDef javalin fill: #007ea3, stroke: #000000, color: #000000
```

## Use case
Most examples implement a "hello world" style logic that returns a greeting message when the user inputs a name.

* A user inputs the name "John" and clicks "Submit"
* The system generates a greeting "Hello John!" back to the user
