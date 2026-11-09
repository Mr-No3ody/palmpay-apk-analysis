package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: androidx.transition.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1263y implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GhostViewPort f18137a;

    public ViewTreeObserverOnPreDrawListenerC1263y(GhostViewPort ghostViewPort) {
        this.f18137a = ghostViewPort;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        GhostViewPort ghostViewPort = this.f18137a;
        ghostViewPort.postInvalidateOnAnimation();
        ViewGroup viewGroup = ghostViewPort.f17941a;
        if (viewGroup == null || (view = ghostViewPort.f17942b) == null) {
            return true;
        }
        viewGroup.endViewTransition(view);
        ghostViewPort.f17941a.postInvalidateOnAnimation();
        ghostViewPort.f17941a = null;
        ghostViewPort.f17942b = null;
        return true;
    }
}
