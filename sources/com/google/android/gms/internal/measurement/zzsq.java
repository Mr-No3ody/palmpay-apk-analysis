package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsq {
    public static void zza(boolean z3, @Nullable String str, @Nullable Object... objArr) {
        if (!z3) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
