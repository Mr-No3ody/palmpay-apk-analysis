package com.nimbusds.jose.shaded.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f23643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f23644b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f23646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23647e;

    public i(l lVar, int i7) {
        this.f23647e = i7;
        this.f23646d = lVar;
        this.f23643a = lVar.f23665f.f23653d;
        this.f23645c = lVar.f23664e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f23643a;
        l lVar = this.f23646d;
        if (kVar == lVar.f23665f) {
            throw new NoSuchElementException();
        }
        if (lVar.f23664e != this.f23645c) {
            throw new ConcurrentModificationException();
        }
        this.f23643a = kVar.f23653d;
        this.f23644b = kVar;
        return kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23643a != this.f23646d.f23665f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f23647e) {
            case 1:
                return b().f23655f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        k kVar = this.f23644b;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        l lVar = this.f23646d;
        lVar.c(kVar, true);
        this.f23644b = null;
        this.f23645c = lVar.f23664e;
    }
}
