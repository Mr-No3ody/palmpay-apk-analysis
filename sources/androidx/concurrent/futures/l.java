package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f15064a;

    public l(m mVar) {
        this.f15064a = mVar;
    }

    @Override // androidx.concurrent.futures.j
    public final String pendingToString() {
        k kVar = (k) this.f15064a.f15065a.get();
        if (kVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + kVar.f15060a + "]";
    }
}
