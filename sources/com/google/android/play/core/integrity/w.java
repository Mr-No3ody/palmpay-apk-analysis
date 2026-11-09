package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f22728a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f22734g;

    public /* synthetic */ w(Context context, v vVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.f22729b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(bb.f22665a);
        this.f22730c = anVarB;
        au auVar = new au(akVarB, n.f22719a);
        this.f22731d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new bp(akVarB, anVarB, auVar, n.f22719a));
        this.f22732e = anVarB2;
        com.google.android.play.integrity.internal.an anVarB3 = com.google.android.play.integrity.internal.aj.b(new bu(anVarB2));
        this.f22733f = anVarB3;
        this.f22734g = com.google.android.play.integrity.internal.aj.b(new ba(anVarB2, anVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f22734g.a();
    }
}
