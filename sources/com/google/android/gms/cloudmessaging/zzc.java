package com.google.android.gms.cloudmessaging;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z3) throws ClassNotFoundException {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? zzd.class : super.loadClass(str, z3);
    }
}
