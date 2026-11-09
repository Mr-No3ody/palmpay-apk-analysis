package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
public final class au implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22655b;

    public au(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f22654a = anVar;
        this.f22655b = anVar2;
    }

    @Override // com.google.android.play.integrity.internal.an
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.f22654a, this.f22655b);
    }
}
