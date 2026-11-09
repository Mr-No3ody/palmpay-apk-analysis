package com.nimbusds.jose.shaded.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23668b;

    public m(Method method) {
        this.f23668b = method;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.o
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.f23668b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e10) {
            throw new RuntimeException("Failed invoking canAccess", e10);
        }
    }
}
