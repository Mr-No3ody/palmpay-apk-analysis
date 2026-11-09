package com.nimbusds.jose.shaded.gson.internal;

import com.nimbusds.jose.shaded.gson.ExclusionStrategy;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.z;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements TypeAdapterFactory, Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f23638c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f23639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f23640b;

    static {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f23639a = list;
        fVar.f23640b = list;
        f23638c = fVar;
    }

    public static boolean b(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public final boolean a(Class cls, boolean z3) {
        Iterator it = (z3 ? this.f23639a : this.f23640b).iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final z create(com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        Class cls = aVar.f23689a;
        boolean zB = b(cls);
        boolean z3 = zB || a(cls, true);
        boolean z8 = zB || a(cls, false);
        if (z3 || z8) {
            return new e(this, z8, z3, mVar, aVar);
        }
        return null;
    }
}
