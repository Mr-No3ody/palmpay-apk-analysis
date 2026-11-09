package p317v0;

import N8.q0;
import android.util.LogPrinter;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43029c;

    public g() {
        c();
    }

    public int a(GridLayout gridLayout, View view, a aVar, int i7, boolean z3) {
        return this.f43027a - aVar.o(view, i7, gridLayout.getLayoutMode());
    }

    public void b(int i7, int i10) {
        this.f43027a = Math.max(this.f43027a, i7);
        this.f43028b = Math.max(this.f43028b, i10);
    }

    public void c() {
        this.f43027a = Integer.MIN_VALUE;
        this.f43028b = Integer.MIN_VALUE;
        this.f43029c = 2;
    }

    public int d(boolean z3) {
        if (!z3) {
            int i7 = this.f43029c;
            LogPrinter logPrinter = GridLayout.f17266j;
            if ((i7 & 2) != 0) {
                return 100000;
            }
        }
        return this.f43027a + this.f43028b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Bounds{before=");
        sb2.append(this.f43027a);
        sb2.append(", after=");
        return q0.m(sb2, this.f43028b, '}');
    }
}
