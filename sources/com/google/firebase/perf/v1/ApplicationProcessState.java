package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum ApplicationProcessState implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final Internal.EnumLiteMap<ApplicationProcessState> internalValueMap = new Internal.EnumLiteMap<ApplicationProcessState>() { // from class: com.google.firebase.perf.v1.ApplicationProcessState.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ApplicationProcessState findValueByNumber(int i7) {
            return ApplicationProcessState.forNumber(i7);
        }
    };
    private final int value;

    public static final class ApplicationProcessStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ApplicationProcessStateVerifier();

        private ApplicationProcessStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i7) {
            return ApplicationProcessState.forNumber(i7) != null;
        }
    }

    ApplicationProcessState(int i7) {
        this.value = i7;
    }

    public static ApplicationProcessState forNumber(int i7) {
        if (i7 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i7 == 1) {
            return FOREGROUND;
        }
        if (i7 == 2) {
            return BACKGROUND;
        }
        if (i7 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static Internal.EnumLiteMap<ApplicationProcessState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ApplicationProcessStateVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i7) {
        return forNumber(i7);
    }
}
