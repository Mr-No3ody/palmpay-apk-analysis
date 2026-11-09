package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f12685b;

    public /* synthetic */ H0(SearchView searchView, int i7) {
        this.f12684a = i7;
        this.f12685b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12684a) {
            case 0:
                this.f12685b.k();
                break;
            default:
                androidx.cursoradapter.widget.b bVar = this.f12685b.f12802v0;
                if (bVar instanceof T0) {
                    bVar.changeCursor(null);
                }
                break;
        }
    }
}
