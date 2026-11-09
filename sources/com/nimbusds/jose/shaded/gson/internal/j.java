package com.nimbusds.jose.shaded.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f23649b;

    public /* synthetic */ j(l lVar, int i7) {
        this.f23648a = i7;
        this.f23649b = lVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f23648a) {
            case 0:
                this.f23649b.clear();
                break;
            default:
                this.f23649b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        k kVarA;
        switch (this.f23648a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                l lVar = this.f23649b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                        kVarA = null;
                    }
                    break;
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f23657i, entry.getValue())) {
                    kVar = kVarA;
                }
                return kVar != null;
            default:
                return this.f23649b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f23648a) {
            case 0:
                return new i(this.f23649b, 0);
            default:
                return new i(this.f23649b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        k kVarA;
        switch (this.f23648a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                l lVar = this.f23649b;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                        kVarA = null;
                    }
                    break;
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f23657i, entry.getValue())) {
                    kVar = kVarA;
                }
                if (kVar == null) {
                    return false;
                }
                lVar.c(kVar, true);
                return true;
            default:
                l lVar2 = this.f23649b;
                k kVarA2 = null;
                if (obj != null) {
                    try {
                        kVarA2 = lVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (kVarA2 != null) {
                    lVar2.c(kVarA2, true);
                }
                return kVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f23648a) {
            case 0:
                break;
        }
        return this.f23649b.f23663d;
    }
}
