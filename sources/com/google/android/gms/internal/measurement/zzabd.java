package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
enum zzabd {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static /* synthetic */ zzabd zza(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }
}
