package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1185u extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f17214a;

    public C1185u(Fragment fragment) {
        this.f17214a = fragment;
    }

    @Override // androidx.fragment.app.H
    public final View a(int i7) {
        Fragment fragment = this.f17214a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i7);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // androidx.fragment.app.H
    public final boolean b() {
        return this.f17214a.mView != null;
    }
}
