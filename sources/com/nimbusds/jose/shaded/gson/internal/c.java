package com.nimbusds.jose.shaded.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f23629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f23630b;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.f23630b = null;
            this.f23629a = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.f23630b = d.a(typeArr2[0]);
        this.f23629a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f23630b;
        return type != null ? new Type[]{type} : d.f23631a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f23629a};
    }

    public final int hashCode() {
        Type type = this.f23630b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f23629a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f23630b;
        if (type != null) {
            return "? super " + d.i(type);
        }
        Type type2 = this.f23629a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.i(type2);
    }
}
