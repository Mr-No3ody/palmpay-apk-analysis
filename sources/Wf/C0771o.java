package Wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Wf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0771o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10890b = AtomicIntegerFieldUpdater.newUpdater(C0771o.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10891a;

    public C0771o(Throwable th, boolean z3) {
        this.f10891a = th;
        this._handled$volatile = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f10891a + ']';
    }
}
