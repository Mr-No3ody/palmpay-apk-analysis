package com.nimbusds.jose.shaded.gson.reflect;

import com.nimbusds.jose.shaded.gson.internal.d;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f23689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f23690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23691c;

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = d.a(type);
        this.f23690b = typeA;
        this.f23689a = d.g(typeA);
        this.f23691c = typeA.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return d.d(this.f23690b, ((a) obj).f23690b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23691c;
    }

    public final String toString() {
        return d.i(this.f23690b);
    }
}
