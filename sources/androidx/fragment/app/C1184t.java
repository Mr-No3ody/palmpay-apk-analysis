package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1184t extends AbstractC1189y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f17207a;

    public C1184t(Fragment fragment) {
        this.f17207a = fragment;
    }

    @Override // androidx.fragment.app.AbstractC1189y
    public final void a() {
        Fragment fragment = this.f17207a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.V.d(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
