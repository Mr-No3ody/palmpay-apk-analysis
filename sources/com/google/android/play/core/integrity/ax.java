package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f22656a;

    public static synchronized aw a(Context context) {
        try {
            if (f22656a == null) {
                u uVar = new u(null);
                uVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f22656a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22656a;
    }
}
