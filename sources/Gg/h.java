package Gg;

import Pg.C0559f;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends C0559f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3436a;

    public h(i iVar) {
        this.f3436a = iVar;
    }

    @Override // Pg.C0559f
    public final void timedOut() {
        this.f3436a.cancel();
    }
}
