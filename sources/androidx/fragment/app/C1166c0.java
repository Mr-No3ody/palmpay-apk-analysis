package androidx.fragment.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1166c0 extends androidx.lifecycle.a0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1164b0 f17100o = new C1164b0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17104g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f17101d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f17102e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f17103f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17105i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17106j = false;

    public C1166c0(boolean z3) {
        this.f17104g = z3;
    }

    @Override // androidx.lifecycle.a0
    public final void b() {
        if (Z.L(3)) {
            toString();
        }
        this.f17105i = true;
    }

    public final void d(Fragment fragment) {
        if (this.f17106j) {
            return;
        }
        HashMap map = this.f17101d;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (Z.L(2)) {
            fragment.toString();
        }
    }

    public final void e(String str, boolean z3) {
        HashMap map = this.f17102e;
        C1166c0 c1166c0 = (C1166c0) map.get(str);
        if (c1166c0 != null) {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c1166c0.f17102e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c1166c0.e((String) it.next(), true);
                }
            }
            c1166c0.b();
            map.remove(str);
        }
        HashMap map2 = this.f17103f;
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) map2.get(str);
        if (i0Var != null) {
            i0Var.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1166c0.class == obj.getClass()) {
            C1166c0 c1166c0 = (C1166c0) obj;
            if (this.f17101d.equals(c1166c0.f17101d) && this.f17102e.equals(c1166c0.f17102e) && this.f17103f.equals(c1166c0.f17103f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(Fragment fragment) {
        if (this.f17106j || this.f17101d.remove(fragment.mWho) == null || !Z.L(2)) {
            return;
        }
        fragment.toString();
    }

    public final int hashCode() {
        return this.f17103f.hashCode() + ((this.f17102e.hashCode() + (this.f17101d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f17101d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f17102e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f17103f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
