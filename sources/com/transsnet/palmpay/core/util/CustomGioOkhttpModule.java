package com.transsnet.palmpay.core.util;

import Dg.c;
import Pa.C0519p;
import Y4.d;
import android.content.Context;
import com.growingio.android.sdk.b;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.S;
import okhttp3.U;

/* JADX INFO: loaded from: classes3.dex */
public class CustomGioOkhttpModule extends b {
    public static U a(U u6) {
        S sA = u6 != null ? u6.a() : new S();
        TimeUnit unit = TimeUnit.SECONDS;
        sA.b(10L, unit);
        sA.f(15L, unit);
        sA.e(20L, unit);
        Intrinsics.checkNotNullParameter(unit, "unit");
        sA.f40637x = c.b("timeout", 30L, unit);
        sA.a(new d());
        return new U(sA);
    }

    @Override // com.growingio.android.sdk.b
    public final void registerComponents(Context context, p247q5.c cVar) {
        cVar.b(p138j5.c.class, p138j5.b.class, new Y4.b(new C0519p()));
    }
}
