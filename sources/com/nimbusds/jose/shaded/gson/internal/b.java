package com.nimbusds.jose.shaded.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f23626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f23627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f23628c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z3 = true;
            boolean z8 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z8) {
                z3 = false;
            }
            d.b(z3);
        }
        this.f23626a = type == null ? null : d.a(type);
        this.f23627b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f23628c = typeArr2;
        int length = typeArr2.length;
        for (int i7 = 0; i7 < length; i7++) {
            Objects.requireNonNull(this.f23628c[i7]);
            d.c(this.f23628c[i7]);
            Type[] typeArr3 = this.f23628c;
            typeArr3[i7] = d.a(typeArr3[i7]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f23628c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f23626a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f23627b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f23628c) ^ this.f23627b.hashCode();
        Type type = this.f23626a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f23628c;
        int length = typeArr.length;
        Type type = this.f23627b;
        if (length == 0) {
            return d.i(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(d.i(type));
        sb2.append("<");
        sb2.append(d.i(typeArr[0]));
        for (int i7 = 1; i7 < length; i7++) {
            sb2.append(", ");
            sb2.append(d.i(typeArr[i7]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
