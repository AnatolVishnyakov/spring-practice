package ru.vish.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ScanLogger {
    private static final Logger logger = LoggerFactory.getLogger("ScanLogger");
    private static final ScanLogger scanLogger = new ScanLogger();

    private ScanLogger() {}

    public static ScanLogger getLogger() {
        return scanLogger;
    }

    public void info(String cellTo, String cellFrom) {
        logger.info("Ok {} {}", "1", "2");
    }
}
