package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class u implements av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22727a;

    private u() {
    }

    public final u a(Context context) {
        context.getClass();
        this.f22727a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        com.google.android.play.integrity.internal.am.a(this.f22727a, Context.class);
        return new w(this.f22727a, null);
    }

    public /* synthetic */ u(t tVar) {
    }
}
