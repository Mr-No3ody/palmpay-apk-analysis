package p305u5;

import D4.f;
import android.app.Activity;
import android.view.View;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import com.growingio.android.sdk.track.view.OnViewStateChangedListener;
import e5.b;
import p279s5.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f implements IActivityLifecycle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f42707c;

    public e() {
        super(7);
        a.f42018a.r(this);
        this.f42707c = new d();
    }

    @Override // com.growingio.android.sdk.track.listener.IActivityLifecycle
    public final void onActivityLifecycle(p182m5.a aVar) {
        Activity activityA = aVar.a();
        d dVar = this.f42707c;
        int i7 = aVar.f39477a;
        if (i7 == 3) {
            View decorView = activityA.getWindow().getDecorView();
            if (decorView.getTag(b.growing_tracker_monitoring_view_tree_enabled) != null) {
                return;
            }
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            decorView.getViewTreeObserver().addOnScrollChangedListener(dVar);
            decorView.getViewTreeObserver().addOnGlobalFocusChangeListener(dVar);
            decorView.getViewTreeObserver().addOnWindowFocusChangeListener(dVar);
            decorView.setTag(b.growing_tracker_monitoring_view_tree_enabled, new Object());
            return;
        }
        if (i7 == 5) {
            View decorView2 = activityA.getWindow().getDecorView();
            if (decorView2.getTag(b.growing_tracker_monitoring_view_tree_enabled) != null) {
                decorView2.getViewTreeObserver().removeOnGlobalLayoutListener(dVar);
                decorView2.getViewTreeObserver().removeOnGlobalFocusChangeListener(dVar);
                decorView2.getViewTreeObserver().removeOnScrollChangedListener(dVar);
                decorView2.getViewTreeObserver().removeOnWindowFocusChangeListener(dVar);
                decorView2.setTag(b.growing_tracker_monitoring_view_tree_enabled, null);
            }
        }
    }

    @Override // D4.f
    public final void u(Object obj, Object obj2) {
        ((OnViewStateChangedListener) obj).onViewStateChanged((b) obj2);
    }
}
