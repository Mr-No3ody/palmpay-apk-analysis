package p005a2;

import com.daimajia.swipe.SwipeLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SwipeLayout.OnLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11818b;

    public a(d dVar, int i7) {
        this.f11818b = dVar;
        this.f11817a = i7;
    }

    @Override // com.daimajia.swipe.SwipeLayout.OnLayout
    public final void onLayout(SwipeLayout swipeLayout) {
        if (this.f11818b.isOpen(this.f11817a)) {
            swipeLayout.i(false, false);
        } else {
            swipeLayout.b(false, false);
        }
    }
}
