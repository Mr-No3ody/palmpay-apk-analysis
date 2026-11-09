package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class bp implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22701d;

    public bp(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f22698a = anVar;
        this.f22699b = anVar2;
        this.f22700c = anVar3;
        this.f22701d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f22698a.a(), (com.google.android.play.integrity.internal.s) this.f22699b.a(), ((au) this.f22700c).a(), new j());
    }
}
