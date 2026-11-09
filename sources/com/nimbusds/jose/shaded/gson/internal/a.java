package com.nimbusds.jose.shaded.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f23625a;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f23625a = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f23625a;
    }

    public final int hashCode() {
        return this.f23625a.hashCode();
    }

    public final String toString() {
        return d.i(this.f23625a) + "[]";
    }
}
