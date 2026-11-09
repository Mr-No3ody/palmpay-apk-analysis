package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.V;
import androidx.fragment.app.Z;

/* JADX INFO: loaded from: classes.dex */
public final class a extends V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f18265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f18266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f18267c;

    public a(f fVar, Fragment fragment, FrameLayout frameLayout) {
        this.f18267c = fVar;
        this.f18265a = fragment;
        this.f18266b = frameLayout;
    }

    @Override // androidx.fragment.app.V
    public final void onFragmentViewCreated(Z z3, Fragment fragment, View view, Bundle bundle) {
        if (fragment == this.f18265a) {
            z3.l0(this);
            this.f18267c.getClass();
            f.a(view, this.f18266b);
        }
    }
}
