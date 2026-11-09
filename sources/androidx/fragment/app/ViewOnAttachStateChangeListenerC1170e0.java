package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.fragment.app.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1170e0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f17119a;

    public ViewOnAttachStateChangeListenerC1170e0(View view) {
        this.f17119a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f17119a;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        androidx.core.view.C.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
