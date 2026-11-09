package androidx.gridlayout.widget;

import C0.G;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import androidx.camera.video.internal.c;
import com.horcrux.svg.d0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p185ma.t;
import p317v0.e;
import p317v0.f;
import p317v0.g;
import p317v0.h;
import p317v0.i;
import p317v0.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17300a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f17303d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f17305f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f17307h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f17309j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f17311l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e[] f17313n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f17315p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17317r;
    public int[] t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GridLayout f17322x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17301b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17302c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17304e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17306g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17308i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17310k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17312m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17314o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17316q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17318s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17319u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f17320v = new i(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f17321w = new i(-100000);

    public a(GridLayout gridLayout, boolean z3) {
        this.f17322x = gridLayout;
        this.f17300a = z3;
    }

    public static void k(ArrayList arrayList, h hVar, i iVar, boolean z3) {
        if (hVar.a() == 0) {
            return;
        }
        if (z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((e) it.next()).f43022a.equals(hVar)) {
                    return;
                }
            }
        }
        arrayList.add(new e(hVar, iVar));
    }

    public static boolean n(int[] iArr, e eVar) {
        if (!eVar.f43024c) {
            return false;
        }
        h hVar = eVar.f43022a;
        int i7 = hVar.f43030a;
        int i10 = iArr[i7] + eVar.f43023b.f43032a;
        int i11 = hVar.f43031b;
        if (i10 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i10;
        return true;
    }

    public final String a(ArrayList arrayList) {
        String strN;
        String str = this.f17300a ? "x" : "y";
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (z3) {
                z3 = false;
            } else {
                sb2.append(", ");
            }
            h hVar = eVar.f43022a;
            int i7 = hVar.f43030a;
            int i10 = eVar.f43023b.f43032a;
            int i11 = hVar.f43031b;
            if (i7 < i11) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i11);
                sb3.append("-");
                sb3.append(str);
                sb3.append(i7);
                strN = d0.n(i10, ">=", sb3);
            } else {
                strN = str + i7 + "-" + str + i11 + "<=" + (-i10);
            }
            sb2.append(strN);
        }
        return sb2.toString();
    }

    public final void b(c cVar, boolean z3) {
        for (i iVar : (i[]) ((Object[]) cVar.f14622c)) {
            iVar.f43032a = Integer.MIN_VALUE;
        }
        g[] gVarArr = (g[]) ((Object[]) g().f14622c);
        for (int i7 = 0; i7 < gVarArr.length; i7++) {
            int iD = gVarArr[i7].d(z3);
            i iVar2 = (i) ((Object[]) cVar.f14622c)[((int[]) cVar.f14621b)[i7]];
            int i10 = iVar2.f43032a;
            if (!z3) {
                iD = -iD;
            }
            iVar2.f43032a = Math.max(i10, iD);
        }
    }

    public final void c(boolean z3) {
        int[] iArr = z3 ? this.f17309j : this.f17311l;
        GridLayout gridLayout = this.f17322x;
        int childCount = gridLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = gridLayout.getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) childAt.getLayoutParams();
                boolean z8 = this.f17300a;
                h hVar = (z8 ? layoutParams.f17299b : layoutParams.f17298a).f43035b;
                int i10 = z3 ? hVar.f43030a : hVar.f43031b;
                iArr[i10] = Math.max(iArr[i10], gridLayout.f(childAt, z8, z3));
            }
        }
    }

    public final c d(boolean z3) {
        h hVar;
        f fVar = new f(h.class, i.class);
        j[] jVarArr = (j[]) ((Object[]) g().f14623d);
        int length = jVarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z3) {
                hVar = jVarArr[i7].f43035b;
            } else {
                h hVar2 = jVarArr[i7].f43035b;
                hVar = new h(hVar2.f43031b, hVar2.f43030a);
            }
            i iVar = new i();
            iVar.f43032a = Integer.MIN_VALUE;
            fVar.add(Pair.create(hVar, iVar));
        }
        return fVar.a();
    }

    public final e[] e() {
        if (this.f17313n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f17305f == null) {
                this.f17305f = d(true);
            }
            if (!this.f17306g) {
                b(this.f17305f, true);
                this.f17306g = true;
            }
            c cVar = this.f17305f;
            int i7 = 0;
            while (true) {
                h[] hVarArr = (h[]) ((Object[]) cVar.f14623d);
                if (i7 >= hVarArr.length) {
                    break;
                }
                k(arrayList, hVarArr[i7], ((i[]) ((Object[]) cVar.f14622c))[i7], false);
                i7++;
            }
            if (this.f17307h == null) {
                this.f17307h = d(false);
            }
            if (!this.f17308i) {
                b(this.f17307h, false);
                this.f17308i = true;
            }
            c cVar2 = this.f17307h;
            int i10 = 0;
            while (true) {
                h[] hVarArr2 = (h[]) ((Object[]) cVar2.f14623d);
                if (i10 >= hVarArr2.length) {
                    break;
                }
                k(arrayList2, hVarArr2[i10], ((i[]) ((Object[]) cVar2.f14622c))[i10], false);
                i10++;
            }
            if (this.f17319u) {
                int i11 = 0;
                while (i11 < f()) {
                    int i12 = i11 + 1;
                    k(arrayList, new h(i11, i12), new i(0), true);
                    i11 = i12;
                }
            }
            int iF = f();
            k(arrayList, new h(0, iF), this.f17320v, false);
            k(arrayList2, new h(iF, 0), this.f17321w, false);
            e[] eVarArrR = r(arrayList);
            e[] eVarArrR2 = r(arrayList2);
            LogPrinter logPrinter = GridLayout.f17266j;
            Object[] objArr = (Object[]) Array.newInstance(e[].class.getComponentType(), eVarArrR.length + eVarArrR2.length);
            System.arraycopy(eVarArrR, 0, objArr, 0, eVarArrR.length);
            System.arraycopy(eVarArrR2, 0, objArr, eVarArrR.length, eVarArrR2.length);
            this.f17313n = (e[]) objArr;
        }
        if (!this.f17314o) {
            if (this.f17305f == null) {
                this.f17305f = d(true);
            }
            if (!this.f17306g) {
                b(this.f17305f, true);
                this.f17306g = true;
            }
            if (this.f17307h == null) {
                this.f17307h = d(false);
            }
            if (!this.f17308i) {
                b(this.f17307h, false);
                this.f17308i = true;
            }
            this.f17314o = true;
        }
        return this.f17313n;
    }

    public final int f() {
        return Math.max(this.f17301b, i());
    }

    public final c g() {
        int iE;
        int i7;
        c cVar = this.f17303d;
        GridLayout gridLayout = this.f17322x;
        boolean z3 = this.f17300a;
        if (cVar == null) {
            f fVar = new f(j.class, g.class);
            int childCount = gridLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) gridLayout.getChildAt(i10).getLayoutParams();
                j jVar = z3 ? layoutParams.f17299b : layoutParams.f17298a;
                fVar.add(Pair.create(jVar, jVar.a(z3).p()));
            }
            this.f17303d = fVar.a();
        }
        if (!this.f17304e) {
            for (g gVar : (g[]) ((Object[]) this.f17303d.f14622c)) {
                gVar.c();
            }
            int childCount2 = gridLayout.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt = gridLayout.getChildAt(i11);
                GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) childAt.getLayoutParams();
                j jVar2 = z3 ? layoutParams2.f17299b : layoutParams2.f17298a;
                if (childAt.getVisibility() == 8) {
                    iE = 0;
                } else {
                    iE = gridLayout.e(childAt, z3, false) + gridLayout.e(childAt, z3, true) + (z3 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (jVar2.f43037d == 0.0f) {
                    i7 = 0;
                } else {
                    if (this.t == null) {
                        this.t = new int[gridLayout.getChildCount()];
                    }
                    i7 = this.t[i11];
                }
                int i12 = iE + i7;
                c cVar2 = this.f17303d;
                g gVar2 = (g) ((Object[]) cVar2.f14622c)[((int[]) cVar2.f14621b)[i11]];
                gVar2.f43029c = ((jVar2.f43036c == GridLayout.f17262H && jVar2.f43037d == 0.0f) ? 0 : 2) & gVar2.f43029c;
                int iO = jVar2.a(z3).o(childAt, i12, gridLayout.getLayoutMode());
                gVar2.b(iO, i12 - iO);
            }
            this.f17304e = true;
        }
        return this.f17303d;
    }

    public final int[] h() {
        boolean z3;
        if (this.f17315p == null) {
            this.f17315p = new int[f() + 1];
        }
        if (!this.f17316q) {
            int[] iArr = this.f17315p;
            boolean z8 = this.f17318s;
            GridLayout gridLayout = this.f17322x;
            float f10 = 0.0f;
            boolean z10 = this.f17300a;
            if (!z8) {
                int childCount = gridLayout.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        z3 = false;
                        break;
                    }
                    View childAt = gridLayout.getChildAt(i7);
                    if (childAt.getVisibility() != 8) {
                        GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) childAt.getLayoutParams();
                        if ((z10 ? layoutParams.f17299b : layoutParams.f17298a).f43037d != 0.0f) {
                            z3 = true;
                            break;
                        }
                    }
                    i7++;
                }
                this.f17317r = z3;
                this.f17318s = true;
            }
            if (this.f17317r) {
                if (this.t == null) {
                    this.t = new int[gridLayout.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                q(e(), iArr, true);
                int childCount2 = (gridLayout.getChildCount() * this.f17320v.f43032a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        View childAt2 = gridLayout.getChildAt(i10);
                        if (childAt2.getVisibility() != 8) {
                            GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) childAt2.getLayoutParams();
                            f10 += (z10 ? layoutParams2.f17299b : layoutParams2.f17298a).f43037d;
                        }
                    }
                    int i11 = -1;
                    boolean z11 = true;
                    int i12 = 0;
                    while (i12 < childCount2) {
                        int i13 = (int) ((((long) i12) + ((long) childCount2)) / 2);
                        m();
                        p(i13, f10);
                        boolean zQ = q(e(), iArr, false);
                        if (zQ) {
                            i12 = i13 + 1;
                            i11 = i13;
                        } else {
                            childCount2 = i13;
                        }
                        z11 = zQ;
                    }
                    if (i11 > 0 && !z11) {
                        m();
                        p(i11, f10);
                        q(e(), iArr, true);
                    }
                }
            } else {
                q(e(), iArr, true);
            }
            if (!this.f17319u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f17316q = true;
        }
        return this.f17315p;
    }

    public final int i() {
        if (this.f17302c == Integer.MIN_VALUE) {
            GridLayout gridLayout = this.f17322x;
            int childCount = gridLayout.getChildCount();
            int iMax = -1;
            for (int i7 = 0; i7 < childCount; i7++) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) gridLayout.getChildAt(i7).getLayoutParams();
                h hVar = (this.f17300a ? layoutParams.f17299b : layoutParams.f17298a).f43035b;
                iMax = Math.max(Math.max(Math.max(iMax, hVar.f43030a), hVar.f43031b), hVar.a());
            }
            this.f17302c = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
        }
        return this.f17302c;
    }

    public final int j(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            this.f17320v.f43032a = 0;
            this.f17321w.f43032a = -size;
            this.f17316q = false;
            return h()[f()];
        }
        if (mode == 0) {
            this.f17320v.f43032a = 0;
            this.f17321w.f43032a = -100000;
            this.f17316q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        this.f17320v.f43032a = size;
        this.f17321w.f43032a = -size;
        this.f17316q = false;
        return h()[f()];
    }

    public final void l() {
        this.f17302c = Integer.MIN_VALUE;
        this.f17303d = null;
        this.f17305f = null;
        this.f17307h = null;
        this.f17309j = null;
        this.f17311l = null;
        this.f17313n = null;
        this.f17315p = null;
        this.t = null;
        this.f17318s = false;
        m();
    }

    public final void m() {
        this.f17304e = false;
        this.f17306g = false;
        this.f17308i = false;
        this.f17310k = false;
        this.f17312m = false;
        this.f17314o = false;
        this.f17316q = false;
    }

    public final void o(int i7) {
        if (i7 == Integer.MIN_VALUE || i7 >= i()) {
            this.f17301b = i7;
        } else {
            GridLayout.g((this.f17300a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(int i7, float f10) {
        Arrays.fill(this.t, 0);
        GridLayout gridLayout = this.f17322x;
        int childCount = gridLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = gridLayout.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) childAt.getLayoutParams();
                float f11 = (this.f17300a ? layoutParams.f17299b : layoutParams.f17298a).f43037d;
                if (f11 != 0.0f) {
                    int iRound = Math.round((i7 * f11) / f10);
                    this.t[i10] = iRound;
                    i7 -= iRound;
                    f10 -= f11;
                }
            }
        }
    }

    public final boolean q(e[] eVarArr, int[] iArr, boolean z3) {
        String str = this.f17300a ? "horizontal" : "vertical";
        int iF = f() + 1;
        boolean[] zArr = null;
        loop0: for (int i7 = 0; i7 < eVarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < iF; i10++) {
                boolean zN = false;
                for (e eVar : eVarArr) {
                    zN |= n(iArr, eVar);
                }
                if (!zN) {
                    if (zArr == null) {
                        break loop0;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < eVarArr.length; i11++) {
                        e eVar2 = eVarArr[i11];
                        if (zArr[i11]) {
                            arrayList.add(eVar2);
                        }
                        if (!eVar2.f43024c) {
                            arrayList2.add(eVar2);
                        }
                    }
                    Printer printer = this.f17322x.f17284i;
                    StringBuilder sbT = G.t(str, " constraints: ");
                    sbT.append(a(arrayList));
                    sbT.append(" are inconsistent; permanently removing: ");
                    sbT.append(a(arrayList2));
                    sbT.append(". ");
                    printer.println(sbT.toString());
                    return true;
                }
            }
            if (!z3) {
                return false;
            }
            boolean[] zArr2 = new boolean[eVarArr.length];
            for (int i12 = 0; i12 < iF; i12++) {
                int length = eVarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr2[i13] = zArr2[i13] | n(iArr, eVarArr[i13]);
                }
            }
            if (i7 == 0) {
                zArr = zArr2;
            }
            for (int i14 = 0; i14 < eVarArr.length; i14++) {
                if (zArr2[i14]) {
                    e eVar3 = eVarArr[i14];
                    h hVar = eVar3.f43022a;
                    if (hVar.f43030a >= hVar.f43031b) {
                        eVar3.f43024c = false;
                        break;
                    }
                }
            }
        }
        return true;
    }

    public final e[] r(ArrayList arrayList) {
        t tVar = new t(this, (e[]) arrayList.toArray(new e[arrayList.size()]));
        int length = ((e[][]) tVar.f39627c).length;
        for (int i7 = 0; i7 < length; i7++) {
            tVar.w(i7);
        }
        return (e[]) tVar.f39629e;
    }
}
