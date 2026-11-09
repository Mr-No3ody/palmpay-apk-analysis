package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.appcompat.widget.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0873n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0875o0 f12980b;

    public /* synthetic */ RunnableC0873n0(AbstractViewOnTouchListenerC0875o0 abstractViewOnTouchListenerC0875o0, int i7) {
        this.f12979a = i7;
        this.f12980b = abstractViewOnTouchListenerC0875o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12979a) {
            case 0:
                ViewParent parent = this.f12980b.f12985d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0875o0 abstractViewOnTouchListenerC0875o0 = this.f12980b;
                abstractViewOnTouchListenerC0875o0.a();
                View view = abstractViewOnTouchListenerC0875o0.f12985d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0875o0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0875o0.f12988g = true;
                    break;
                }
                break;
        }
    }
}
