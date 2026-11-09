package Wf;

import kotlinx.coroutines.Incomplete;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements Incomplete {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f10829a;

    public W(q0 q0Var) {
        this.f10829a = q0Var;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final q0 getList() {
        return this.f10829a;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return false;
    }
}
