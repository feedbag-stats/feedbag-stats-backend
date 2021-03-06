package ch.uzh.feedbag.backend.entity;

import java.time.Duration;

public enum ActivityType {
    //          Timeout               Min. displayed Duration  svgY svgHeight svgColour
    ACTIVE(Duration.ofSeconds(60), Duration.ofSeconds(5), 50, 100, "#000000"),
    WRITE(Duration.ofSeconds(60), Duration.ofSeconds(5), 70, 30, "#3030F0"),
    TESTRUN(Duration.ofSeconds(0), Duration.ofSeconds(0), 55, 10, "#30F030"),
    DEBUG(Duration.ofSeconds(60), Duration.ofSeconds(5), 100, 20, "#F03030"),
    TESTINGSTATE(Duration.ofSeconds(0), Duration.ofSeconds(0), 100, 50, "#30F030\" fill-opacity=\"0.4");

    private final Duration timeoutDuration;
    private final Duration minDisplayedDuration;
    private final int svgYOffset;
    private final int svgHeight;
    private final String svgColour;

    private ActivityType(Duration timeoutDuration, Duration minDisplayDuration, int svgYOffset, int svgHeight, String svgColour) {
        this.timeoutDuration = timeoutDuration;
        this.minDisplayedDuration = minDisplayDuration;
        this.svgYOffset = svgYOffset;
        this.svgHeight = svgHeight;
        this.svgColour = svgColour;
    }

    public Duration timeoutDuration() {
        return timeoutDuration;
    }

    public Duration minDisplayedDuration() {
        return minDisplayedDuration;
    }

    public int svgYOffset() {
        return svgYOffset;
    }

    public int svgHeight() {
        return svgHeight;
    }

    public String svgColour() {
        return svgColour;
    }

    public static ActivityType[] getAllTypes() {
        ActivityType[] _a = new ActivityType[]{ACTIVE, WRITE, TESTRUN, DEBUG, TESTINGSTATE};
        return _a;
    }

    public static ActivityType[] getStatsTypes() {
        ActivityType[] _a = new ActivityType[]{ACTIVE, WRITE, DEBUG, TESTINGSTATE};
        return _a;
    }
}
