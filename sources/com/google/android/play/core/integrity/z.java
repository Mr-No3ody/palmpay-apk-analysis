package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f22740a;

    public static synchronized s a(Context context) {
        try {
            if (f22740a == null) {
                q qVar = new q(null);
                qVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f22740a = qVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22740a;
    }
}
