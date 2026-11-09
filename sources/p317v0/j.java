package p317v0;

import androidx.gridlayout.widget.GridLayout;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f43033e = GridLayout.l(Integer.MIN_VALUE, 1, GridLayout.f17262H, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f43035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f43036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f43037d;

    public j(boolean z3, h hVar, a aVar, float f10) {
        this.f43034a = z3;
        this.f43035b = hVar;
        this.f43036c = aVar;
        this.f43037d = f10;
    }

    public final a a(boolean z3) {
        b bVar = GridLayout.f17262H;
        a aVar = this.f43036c;
        if (aVar != bVar) {
            return aVar;
        }
        if (this.f43037d == 0.0f) {
            return z3 ? GridLayout.f17265Q : GridLayout.f17273s0;
        }
        return GridLayout.f17274t0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f43036c.equals(jVar.f43036c) && this.f43035b.equals(jVar.f43035b);
    }

    public final int hashCode() {
        return this.f43036c.hashCode() + (this.f43035b.hashCode() * 31);
    }
}
