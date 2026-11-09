package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.LifecycleEventObserver;

/* JADX INFO: loaded from: classes.dex */
public final class W implements FragmentResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1205o f17041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentResultListener f17042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LifecycleEventObserver f17043c;

    public W(AbstractC1205o abstractC1205o, FragmentResultListener fragmentResultListener, LifecycleEventObserver lifecycleEventObserver) {
        this.f17041a = abstractC1205o;
        this.f17042b = fragmentResultListener;
        this.f17043c = lifecycleEventObserver;
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public final void onFragmentResult(String str, Bundle bundle) {
        this.f17042b.onFragmentResult(str, bundle);
    }
}
