package Wf;

import kotlinx.coroutines.Incomplete;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements Incomplete {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10813a;

    public L(boolean z3) {
        this.f10813a = z3;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final q0 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return this.f10813a;
    }

    public final String toString() {
        return androidx.camera.video.u.p(new StringBuilder("Empty{"), this.f10813a ? "Active" : "New", '}');
    }
}
