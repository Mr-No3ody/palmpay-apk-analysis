package androidx.camera.core.impl;

import androidx.biometric.RunnableC0903g;
import androidx.lifecycle.Observer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.camera.core.impl.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0986j0 implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14091a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable.Observer f14092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f14093c;

    public C0986j0(Executor executor, Observable.Observer observer) {
        this.f14093c = executor;
        this.f14092b = observer;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f14093c.execute(new RunnableC0903g(15, this, (C0988k0) obj));
    }
}
