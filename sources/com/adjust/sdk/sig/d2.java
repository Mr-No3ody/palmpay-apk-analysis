package com.adjust.sdk.sig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements l2, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f19430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19431b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f19432c = {"[UNINITIALIZED]"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List[] f19433d = new List[1];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f19434e = new boolean[1];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f19435f = d0.f19429a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1 f19436g = v1.a(new C1303r(this, 0));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u1 f19437h = v1.a(new C1303r(this, 1));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1 f19438i = v1.a(new C1303r(this, 2));

    public d2(z zVar) {
        this.f19430a = zVar;
    }

    public static final int a(d2 d2Var) {
        int iHashCode = Arrays.hashCode((l2[]) d2Var.f19437h.getValue()) + 1231163861;
        int i7 = 1;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (i10 <= 0) {
                break;
            }
            int i12 = i10 - 1;
            int i13 = i11 * 31;
            String strB = d2Var.b(1 - i10).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i11 = i13 + iHashCode2;
            i10 = i12;
        }
        int iHashCode3 = 1;
        while (i7 > 0) {
            int i14 = i7 - 1;
            int i15 = iHashCode3 * 31;
            p2 p2VarD = d2Var.b(d2Var.e() - i7).d();
            iHashCode3 = i15 + (p2VarD != null ? p2VarD.toString().hashCode() : 0);
            i7 = i14;
        }
        return (((iHashCode * 31) + i11) * 31) + iHashCode3;
    }

    @Override // com.adjust.sdk.sig.l2
    public final String b() {
        return "com.adjust.sdk.sig.755f89ae93acbe52c30f8a09";
    }

    @Override // com.adjust.sdk.sig.h
    public final Set c() {
        return this.f19435f.keySet();
    }

    @Override // com.adjust.sdk.sig.l2
    public final p2 d() {
        return e3.f19448a;
    }

    @Override // com.adjust.sdk.sig.l2
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return "com.adjust.sdk.sig.755f89ae93acbe52c30f8a09".equals(l2Var.b()) && Arrays.equals((l2[]) this.f19437h.getValue(), (l2[]) ((d2) obj).f19437h.getValue()) && 1 == l2Var.e() && g1.a(b(0).b(), l2Var.b(0).b()) && g1.a(b(0).d(), l2Var.b(0).d());
    }

    @Override // com.adjust.sdk.sig.l2
    public final List getAnnotations() {
        return c0.f19427a;
    }

    public final int hashCode() {
        return ((Number) this.f19438i.getValue()).intValue();
    }

    public final String toString() {
        return e2.a(this);
    }

    public static final r1[] b(d2 d2Var) {
        z zVar = d2Var.f19430a;
        return new r1[]{new z1()};
    }

    public static final l2[] c(d2 d2Var) {
        l2[] l2VarArr;
        z zVar = d2Var.f19430a;
        ArrayList arrayList = new ArrayList(0);
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return (arrayList == null || (l2VarArr = (l2[]) arrayList.toArray(new l2[0])) == null) ? c2.f19428a : l2VarArr;
    }

    @Override // com.adjust.sdk.sig.l2
    public final l2 b(int i7) {
        return ((r1[]) this.f19436g.getValue())[i7].a();
    }

    @Override // com.adjust.sdk.sig.l2
    public final String a(int i7) {
        return this.f19432c[i7];
    }
}
