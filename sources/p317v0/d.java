package p317v0;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43021d;

    @Override // p317v0.g
    public final int a(GridLayout gridLayout, View view, a aVar, int i7, boolean z3) {
        return Math.max(0, super.a(gridLayout, view, aVar, i7, z3));
    }

    @Override // p317v0.g
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.f43021d = Math.max(this.f43021d, i7 + i10);
    }

    @Override // p317v0.g
    public final void c() {
        super.c();
        this.f43021d = Integer.MIN_VALUE;
    }

    @Override // p317v0.g
    public final int d(boolean z3) {
        return Math.max(super.d(z3), this.f43021d);
    }
}
