package com.nimbusds.jose.shaded.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23671c;

    public p(Method method, Object obj) {
        this.f23670b = method;
        this.f23671c = obj;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.t
    public final Object a(Class cls) {
        String strA = F1.f.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f23670b.invoke(this.f23671c, cls);
    }
}
