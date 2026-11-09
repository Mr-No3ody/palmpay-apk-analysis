package com.google.android.gms.internal.maps;

import N8.q0;

/* JADX INFO: loaded from: classes2.dex */
final class zzbf {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(q0.k("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
