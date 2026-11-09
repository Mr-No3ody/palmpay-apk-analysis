package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X implements FragmentManager$OpGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f17047d;

    public X(Z z3, String str, int i7, int i10) {
        this.f17047d = z3;
        this.f17044a = str;
        this.f17045b = i7;
        this.f17046c = i10;
    }

    @Override // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.f17047d.f17090y;
        if (fragment == null || this.f17045b >= 0 || this.f17044a != null || !fragment.getChildFragmentManager().V(-1, 0)) {
            return this.f17047d.W(arrayList, arrayList2, this.f17044a, this.f17045b, this.f17046c);
        }
        return false;
    }
}
