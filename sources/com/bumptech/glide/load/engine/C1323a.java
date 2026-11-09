package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1323a extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Key f20570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Resource f20572c;

    public C1323a(Key key, s sVar, ReferenceQueue referenceQueue) {
        super(sVar, referenceQueue);
        J1.g.c(key, "Argument must not be null");
        this.f20570a = key;
        this.f20572c = null;
        this.f20571b = sVar.f20757a;
    }
}
