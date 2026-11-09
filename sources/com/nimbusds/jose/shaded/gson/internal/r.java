package com.nimbusds.jose.shaded.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23674b;

    public r(Method method) {
        this.f23674b = method;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.t
    public final Object a(Class cls) {
        String strA = F1.f.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f23674b.invoke(null, cls, Object.class);
    }
}
