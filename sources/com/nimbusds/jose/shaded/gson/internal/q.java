package com.nimbusds.jose.shaded.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23673c;

    public q(Method method, int i7) {
        this.f23672b = method;
        this.f23673c = i7;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.t
    public final Object a(Class cls) {
        String strA = F1.f.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f23672b.invoke(null, cls, Integer.valueOf(this.f23673c));
    }
}
