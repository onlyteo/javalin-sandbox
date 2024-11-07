package com.onlyteo.sandbox.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory

inline val <reified T> T.buildLogger: Logger get() = LoggerFactory.getLogger(T::class.java)
inline val buildApplicationLogger: Logger get() = LoggerFactory.getLogger("com.onlyteo.sandbox.logger.application")