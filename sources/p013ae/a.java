package p013ae;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f11901b;

    public /* synthetic */ a(e eVar, int i7) {
        this.f11900a = i7;
        this.f11901b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11900a) {
            case 0:
                this.f11901b.b();
                break;
            default:
                this.f11901b.b();
                break;
        }
    }
}
