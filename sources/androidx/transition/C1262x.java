package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.transition.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1262x implements GhostView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f18130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f18131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f18132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f18133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f18134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f18135g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18136a;

    public C1262x(View view) {
        this.f18136a = view;
    }

    @Override // androidx.transition.GhostView
    public final void reserveEndViewTransition(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.GhostView
    public final void setVisibility(int i7) {
        this.f18136a.setVisibility(i7);
    }
}
