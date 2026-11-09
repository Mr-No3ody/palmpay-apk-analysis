package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f12869b;

    public /* synthetic */ a1(Toolbar toolbar, int i7) {
        this.f12868a = i7;
        this.f12869b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12868a) {
            case 0:
                this.f12869b.collapseActionView();
                break;
            default:
                this.f12869b.invalidateMenu();
                break;
        }
    }
}
