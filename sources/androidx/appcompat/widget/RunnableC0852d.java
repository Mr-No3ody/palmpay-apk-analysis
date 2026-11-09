package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0852d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f12876b;

    public /* synthetic */ RunnableC0852d(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f12875a = i7;
        this.f12876b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12875a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12876b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f12563p0 = actionBarOverlayLayout.f12554d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f12564q0);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12876b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f12563p0 = actionBarOverlayLayout2.f12554d.animate().translationY(-actionBarOverlayLayout2.f12554d.getHeight()).setListener(actionBarOverlayLayout2.f12564q0);
                break;
        }
    }
}
