package com.nimbusds.jose.shaded.gson.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f23669a;

    static {
        o mVar;
        if (g.f23641a >= 9) {
            try {
                mVar = new m(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                mVar = null;
            }
        } else {
            mVar = null;
        }
        if (mVar == null) {
            mVar = new n();
        }
        f23669a = mVar;
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
