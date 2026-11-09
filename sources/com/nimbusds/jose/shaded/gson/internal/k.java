package com.nimbusds.jose.shaded.gson.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f23650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f23651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f23652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f23653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f23654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f23655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23656g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f23657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23658j;

    public k(boolean z3) {
        this.f23655f = null;
        this.f23656g = z3;
        this.f23654e = this;
        this.f23653d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f23655f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f23657i;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f23655f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f23657i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f23655f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f23657i;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f23656g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f23657i;
        this.f23657i = obj;
        return obj2;
    }

    public final String toString() {
        return this.f23655f + "=" + this.f23657i;
    }

    public k(boolean z3, k kVar, Object obj, k kVar2, k kVar3) {
        this.f23650a = kVar;
        this.f23655f = obj;
        this.f23656g = z3;
        this.f23658j = 1;
        this.f23653d = kVar2;
        this.f23654e = kVar3;
        kVar3.f23653d = this;
        kVar2.f23654e = this;
    }
}
