package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f22721a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22726f;

    public /* synthetic */ s(Context context, r rVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.f22722b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(ac.f22612a);
        this.f22723c = anVarB;
        au auVar = new au(akVarB, l.f22714a);
        this.f22724d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new al(akVarB, anVarB, auVar, l.f22714a));
        this.f22725e = anVarB2;
        this.f22726f = com.google.android.play.integrity.internal.aj.b(new ab(anVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f22726f.a();
    }
}
