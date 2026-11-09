package Yf;

import Wf.C0765i;
import kotlinx.coroutines.Waiter;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements Waiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0765i f11386a;

    public E(C0765i c0765i) {
        this.f11386a = c0765i;
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(p015ag.s sVar, int i7) {
        this.f11386a.invokeOnCancellation(sVar, i7);
    }
}
