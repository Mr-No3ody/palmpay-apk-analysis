package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f21039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f21040b;

    public e(f fVar, View view) {
        this.f21040b = fVar;
        this.f21039a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        J1.o.f().post(new d(this, this));
    }
}
