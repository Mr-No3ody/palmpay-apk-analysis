package org.greenrobot.eventbus;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f41103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f41104c = true;

    public l(Object obj, i iVar) {
        this.f41102a = obj;
        this.f41103b = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f41102a == lVar.f41102a && this.f41103b.equals(lVar.f41103b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41103b.f41092f.hashCode() + this.f41102a.hashCode();
    }
}
