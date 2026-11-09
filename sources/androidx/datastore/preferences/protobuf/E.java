package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum E implements Internal$EnumLite {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(900),
    EDITION_PROTO2(998),
    EDITION_PROTO3(999),
    EDITION_2023(1000),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(99997),
    EDITION_99998_TEST_ONLY(99998),
    EDITION_99999_TEST_ONLY(99999),
    EDITION_MAX(Integer.MAX_VALUE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16482a;

    E(int i7) {
        this.f16482a = i7;
    }

    public static E a(int i7) {
        if (i7 == 0) {
            return EDITION_UNKNOWN;
        }
        if (i7 == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i7 == 2) {
            return EDITION_2_TEST_ONLY;
        }
        if (i7 == 900) {
            return EDITION_LEGACY;
        }
        if (i7 == Integer.MAX_VALUE) {
            return EDITION_MAX;
        }
        switch (i7) {
            case 998:
                return EDITION_PROTO2;
            case 999:
                return EDITION_PROTO3;
            case 1000:
                return EDITION_2023;
            case 1001:
                return EDITION_2024;
            default:
                switch (i7) {
                    case 99997:
                        return EDITION_99997_TEST_ONLY;
                    case 99998:
                        return EDITION_99998_TEST_ONLY;
                    case 99999:
                        return EDITION_99999_TEST_ONLY;
                    default:
                        return null;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16482a;
    }
}
