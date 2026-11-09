package p005a2;

import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11820b;

    public b(d dVar, int i7) {
        this.f11820b = dVar;
        this.f11819a = i7;
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public final void onClose(SwipeLayout swipeLayout) {
        d dVar = this.f11820b;
        if (dVar.f11823a == p018b2.a.f18759b) {
            dVar.f11825c.remove(Integer.valueOf(this.f11819a));
        } else {
            dVar.f11824b = -1;
        }
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public final void onOpen(SwipeLayout swipeLayout) {
        d dVar = this.f11820b;
        if (dVar.f11823a == p018b2.a.f18759b) {
            dVar.f11825c.add(Integer.valueOf(this.f11819a));
        } else {
            dVar.closeAllExcept(swipeLayout);
            dVar.f11824b = this.f11819a;
        }
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public final void onStartOpen(SwipeLayout swipeLayout) {
        d dVar = this.f11820b;
        if (dVar.f11823a == p018b2.a.f18758a) {
            dVar.closeAllExcept(swipeLayout);
        }
    }
}
