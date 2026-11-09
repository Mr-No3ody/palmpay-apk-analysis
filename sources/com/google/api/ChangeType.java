package com.google.api;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum ChangeType implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final Internal.EnumLiteMap<ChangeType> internalValueMap = new Internal.EnumLiteMap<ChangeType>() { // from class: com.google.api.ChangeType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ChangeType findValueByNumber(int i7) {
            return ChangeType.forNumber(i7);
        }
    };
    private final int value;

    public static final class ChangeTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ChangeTypeVerifier();

        private ChangeTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i7) {
            return ChangeType.forNumber(i7) != null;
        }
    }

    ChangeType(int i7) {
        this.value = i7;
    }

    public static ChangeType forNumber(int i7) {
        if (i7 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i7 == 1) {
            return ADDED;
        }
        if (i7 == 2) {
            return REMOVED;
        }
        if (i7 != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static Internal.EnumLiteMap<ChangeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ChangeTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ChangeType valueOf(int i7) {
        return forNumber(i7);
    }
}
