package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class aa extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f22743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f22744b;

    public aa(ad adVar, IBinder iBinder) {
        this.f22744b = adVar;
        this.f22743a = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.f22744b.f22746a.f22761o = (IInterface) this.f22744b.f22746a.f22756j.a(this.f22743a);
        ae.r(this.f22744b.f22746a);
        this.f22744b.f22746a.f22754h = false;
        Iterator it = this.f22744b.f22746a.f22751e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f22744b.f22746a.f22751e.clear();
    }
}
