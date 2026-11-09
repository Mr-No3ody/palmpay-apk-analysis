package com.growingio.android.okhttp3;

import Y4.d;
import android.content.Context;
import com.growingio.android.sdk.b;
import com.growingio.sdk.annotation.GIOLibraryModule;
import java.util.concurrent.TimeUnit;
import okhttp3.S;
import okhttp3.U;
import p247q5.c;

/* JADX INFO: loaded from: classes3.dex */
@GIOLibraryModule
public class OkhttpLibraryGioModule extends b {
    @Override // com.growingio.android.sdk.b
    public final void registerComponents(Context context, c cVar) {
        if (Y4.b.f11291b == null) {
            synchronized (Y4.b.class) {
                try {
                    if (Y4.b.f11291b == null) {
                        S s3 = new S();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        s3.b(5L, timeUnit);
                        s3.e(10L, timeUnit);
                        s3.a(new d());
                        Y4.b.f11291b = new U(s3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cVar.b(p138j5.c.class, p138j5.b.class, new Y4.b(Y4.b.f11291b));
    }
}
