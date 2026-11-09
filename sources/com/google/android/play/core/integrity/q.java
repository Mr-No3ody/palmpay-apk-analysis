package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22720a;

    private q() {
    }

    public final q a(Context context) {
        context.getClass();
        this.f22720a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.am.a(this.f22720a, Context.class);
        return new s(this.f22720a, null);
    }

    public /* synthetic */ q(p pVar) {
    }
}
