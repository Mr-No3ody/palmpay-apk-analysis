package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1183s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f17206b;

    public /* synthetic */ RunnableC1183s(Fragment fragment, int i7) {
        this.f17205a = i7;
        this.f17206b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17205a) {
            case 0:
                this.f17206b.startPostponedEnterTransition();
                break;
            default:
                this.f17206b.callStartTransitionListener(false);
                break;
        }
    }
}
