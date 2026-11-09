package com.google.logging.type;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum LogSeverity implements Internal.EnumLite {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(CRITICAL_VALUE),
    ALERT(700),
    EMERGENCY(EMERGENCY_VALUE),
    UNRECOGNIZED(-1);

    public static final int ALERT_VALUE = 700;
    public static final int CRITICAL_VALUE = 600;
    public static final int DEBUG_VALUE = 100;
    public static final int DEFAULT_VALUE = 0;
    public static final int EMERGENCY_VALUE = 800;
    public static final int ERROR_VALUE = 500;
    public static final int INFO_VALUE = 200;
    public static final int NOTICE_VALUE = 300;
    public static final int WARNING_VALUE = 400;
    private static final Internal.EnumLiteMap<LogSeverity> internalValueMap = new Internal.EnumLiteMap<LogSeverity>() { // from class: com.google.logging.type.LogSeverity.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public LogSeverity findValueByNumber(int i7) {
            return LogSeverity.forNumber(i7);
        }
    };
    private final int value;

    public static final class LogSeverityVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new LogSeverityVerifier();

        private LogSeverityVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i7) {
            return LogSeverity.forNumber(i7) != null;
        }
    }

    LogSeverity(int i7) {
        this.value = i7;
    }

    public static LogSeverity forNumber(int i7) {
        if (i7 == 0) {
            return DEFAULT;
        }
        if (i7 == 100) {
            return DEBUG;
        }
        if (i7 == 200) {
            return INFO;
        }
        if (i7 == 300) {
            return NOTICE;
        }
        if (i7 == 400) {
            return WARNING;
        }
        if (i7 == 500) {
            return ERROR;
        }
        if (i7 == 600) {
            return CRITICAL;
        }
        if (i7 == 700) {
            return ALERT;
        }
        if (i7 != 800) {
            return null;
        }
        return EMERGENCY;
    }

    public static Internal.EnumLiteMap<LogSeverity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return LogSeverityVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LogSeverity valueOf(int i7) {
        return forNumber(i7);
    }
}
