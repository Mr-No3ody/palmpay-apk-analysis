package com.google.api;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum LaunchStage implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<LaunchStage> internalValueMap = new Internal.EnumLiteMap<LaunchStage>() { // from class: com.google.api.LaunchStage.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public LaunchStage findValueByNumber(int i7) {
            return LaunchStage.forNumber(i7);
        }
    };
    private final int value;

    public static final class LaunchStageVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new LaunchStageVerifier();

        private LaunchStageVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i7) {
            return LaunchStage.forNumber(i7) != null;
        }
    }

    LaunchStage(int i7) {
        this.value = i7;
    }

    public static LaunchStage forNumber(int i7) {
        if (i7 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i7 == 1) {
            return EARLY_ACCESS;
        }
        if (i7 == 2) {
            return ALPHA;
        }
        if (i7 == 3) {
            return BETA;
        }
        if (i7 == 4) {
            return GA;
        }
        if (i7 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public static Internal.EnumLiteMap<LaunchStage> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return LaunchStageVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LaunchStage valueOf(int i7) {
        return forNumber(i7);
    }
}
