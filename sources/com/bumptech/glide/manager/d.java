package com.bumptech.glide.manager;

import android.view.View;
import com.bumptech.glide.load.resource.bitmap.u;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f21037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21038b;

    public d(e eVar, e eVar2) {
        this.f21038b = eVar;
        this.f21037a = eVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVarA = u.a();
        uVarA.getClass();
        J1.o.a();
        uVarA.f20955d.set(true);
        this.f21038b.f21040b.f21042b = true;
        View view = this.f21038b.f21039a;
        view.getViewTreeObserver().removeOnDrawListener(this.f21037a);
        this.f21038b.f21040b.f21041a.clear();
    }
}
