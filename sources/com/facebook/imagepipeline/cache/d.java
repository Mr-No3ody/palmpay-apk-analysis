package com.facebook.imagepipeline.cache;

import com.facebook.common.references.CloseableReference;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CloseableReference f21404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountingMemoryCache.EntryStateObserver f21407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21408f;

    public d(Object obj, CloseableReference closeableReference, CountingMemoryCache.EntryStateObserver entryStateObserver, int i7) {
        this.f21403a = obj;
        CloseableReference closeableReferenceB = closeableReference.b();
        closeableReferenceB.getClass();
        this.f21404b = closeableReferenceB;
        this.f21405c = 0;
        this.f21406d = false;
        this.f21407e = entryStateObserver;
        this.f21408f = i7;
    }
}
