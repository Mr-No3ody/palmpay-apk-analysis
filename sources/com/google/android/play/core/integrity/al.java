package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class al implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22637d;

    public al(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f22634a = anVar;
        this.f22635b = anVar2;
        this.f22636c = anVar3;
        this.f22637d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f22634a.a(), (com.google.android.play.integrity.internal.s) this.f22635b.a(), ((au) this.f22636c).a(), new i());
    }
}
