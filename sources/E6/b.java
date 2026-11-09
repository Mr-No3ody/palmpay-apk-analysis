package E6;

import Ae.j;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2248b;

    public /* synthetic */ b(c cVar, int i7) {
        this.f2247a = i7;
        this.f2248b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2247a) {
            case 0:
                j jVar = this.f2248b.f2253e;
                if (jVar != null) {
                    jVar.invoke();
                }
                break;
            case 1:
                j jVar2 = this.f2248b.f2253e;
                if (jVar2 != null) {
                    jVar2.invoke();
                }
                break;
            default:
                j jVar3 = this.f2248b.f2253e;
                if (jVar3 != null) {
                    jVar3.invoke();
                }
                break;
        }
    }
}
