package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1181p extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f17194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f17195b;

    public C1181p(DialogFragment dialogFragment, H h7) {
        this.f17195b = dialogFragment;
        this.f17194a = h7;
    }

    @Override // androidx.fragment.app.H
    public final View a(int i7) {
        H h7 = this.f17194a;
        return h7.b() ? h7.a(i7) : this.f17195b.onFindViewById(i7);
    }

    @Override // androidx.fragment.app.H
    public final boolean b() {
        return this.f17194a.b() || this.f17195b.onHasView();
    }
}
