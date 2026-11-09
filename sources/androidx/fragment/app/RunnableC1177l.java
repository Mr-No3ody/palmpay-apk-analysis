package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1177l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17179b;

    public /* synthetic */ RunnableC1177l(Object obj, int i7) {
        this.f17178a = i7;
        this.f17179b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17178a) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) this.f17179b;
                dialogFragment.mOnDismissListener.onDismiss(dialogFragment.mDialog);
                break;
            case 1:
                ((D0) this.f17179b).c();
                break;
            default:
                ((Z) this.f17179b).y(true);
                break;
        }
    }
}
