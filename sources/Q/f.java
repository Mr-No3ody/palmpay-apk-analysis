package Q;

import R.n;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final androidx.constraintlayout.core.c f7501A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f7502B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f7503C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f7504D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f7505E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public b[] f7506F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public b[] f7507G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f7508H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f7509I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f7510J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public WeakReference f7511K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public WeakReference f7512L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public WeakReference f7513M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public WeakReference f7514N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final HashSet f7515O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final R.b f7516P0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f7517u0 = new ArrayList();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final top.zibin.luban.io.a f7518v0 = new top.zibin.luban.io.a(this);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final R.d f7519w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f7520x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public BasicMeasure$Measurer f7521y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f7522z0;

    public f() {
        R.d dVar = new R.d();
        dVar.f7865b = true;
        dVar.f7866c = true;
        dVar.f7868e = new ArrayList();
        new ArrayList();
        dVar.f7869f = null;
        dVar.f7870g = new R.b();
        dVar.f7871h = new ArrayList();
        dVar.f7864a = this;
        dVar.f7867d = this;
        this.f7519w0 = dVar;
        this.f7521y0 = null;
        this.f7522z0 = false;
        this.f7501A0 = new androidx.constraintlayout.core.c();
        this.f7504D0 = 0;
        this.f7505E0 = 0;
        this.f7506F0 = new b[4];
        this.f7507G0 = new b[4];
        this.f7508H0 = 257;
        this.f7509I0 = false;
        this.f7510J0 = false;
        this.f7511K0 = null;
        this.f7512L0 = null;
        this.f7513M0 = null;
        this.f7514N0 = null;
        this.f7515O0 = new HashSet();
        this.f7516P0 = new R.b();
    }

    public static void W(e eVar, BasicMeasure$Measurer basicMeasure$Measurer, R.b bVar) {
        int i7;
        int i10;
        if (basicMeasure$Measurer == null) {
            return;
        }
        if (eVar.i0 == 8 || (eVar instanceof i) || (eVar instanceof a)) {
            bVar.f7856e = 0;
            bVar.f7857f = 0;
            return;
        }
        d[] dVarArr = eVar.f7453U;
        bVar.f7852a = dVarArr[0];
        bVar.f7853b = dVarArr[1];
        bVar.f7854c = eVar.r();
        bVar.f7855d = eVar.l();
        bVar.f7860i = false;
        bVar.f7861j = 0;
        d dVar = bVar.f7852a;
        d dVar2 = d.f7430c;
        boolean z3 = dVar == dVar2;
        boolean z8 = bVar.f7853b == dVar2;
        boolean z10 = z3 && eVar.f7457Y > 0.0f;
        boolean z11 = z8 && eVar.f7457Y > 0.0f;
        d dVar3 = d.f7429b;
        d dVar4 = d.f7428a;
        if (z3 && eVar.u(0) && eVar.f7490r == 0 && !z10) {
            bVar.f7852a = dVar3;
            if (z8 && eVar.f7492s == 0) {
                bVar.f7852a = dVar4;
            }
            z3 = false;
        }
        if (z8 && eVar.u(1) && eVar.f7492s == 0 && !z11) {
            bVar.f7853b = dVar3;
            if (z3 && eVar.f7490r == 0) {
                bVar.f7853b = dVar4;
            }
            z8 = false;
        }
        if (eVar.B()) {
            bVar.f7852a = dVar4;
            z3 = false;
        }
        if (eVar.C()) {
            bVar.f7853b = dVar4;
            z8 = false;
        }
        int[] iArr = eVar.t;
        if (z10) {
            if (iArr[0] == 4) {
                bVar.f7852a = dVar4;
            } else if (!z8) {
                if (bVar.f7853b == dVar4) {
                    i10 = bVar.f7855d;
                } else {
                    bVar.f7852a = dVar3;
                    basicMeasure$Measurer.measure(eVar, bVar);
                    i10 = bVar.f7857f;
                }
                bVar.f7852a = dVar4;
                bVar.f7854c = (int) (eVar.f7457Y * i10);
            }
        }
        if (z11) {
            if (iArr[1] == 4) {
                bVar.f7853b = dVar4;
            } else if (!z3) {
                if (bVar.f7852a == dVar4) {
                    i7 = bVar.f7854c;
                } else {
                    bVar.f7853b = dVar3;
                    basicMeasure$Measurer.measure(eVar, bVar);
                    i7 = bVar.f7856e;
                }
                bVar.f7853b = dVar4;
                if (eVar.f7458Z == -1) {
                    bVar.f7855d = (int) (i7 / eVar.f7457Y);
                } else {
                    bVar.f7855d = (int) (eVar.f7457Y * i7);
                }
            }
        }
        basicMeasure$Measurer.measure(eVar, bVar);
        eVar.P(bVar.f7856e);
        eVar.M(bVar.f7857f);
        eVar.f7437E = bVar.f7859h;
        eVar.J(bVar.f7858g);
        bVar.f7861j = 0;
    }

    @Override // Q.e
    public final void D() {
        this.f7501A0.t();
        this.f7502B0 = 0;
        this.f7503C0 = 0;
        this.f7517u0.clear();
        super.D();
    }

    @Override // Q.e
    public final void G(androidx.camera.video.internal.c cVar) {
        super.G(cVar);
        int size = this.f7517u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.f7517u0.get(i7)).G(cVar);
        }
    }

    @Override // Q.e
    public final void Q(boolean z3, boolean z8) {
        super.Q(z3, z8);
        int size = this.f7517u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.f7517u0.get(i7)).Q(z3, z8);
        }
    }

    public final void S(e eVar, int i7) {
        if (i7 == 0) {
            int i10 = this.f7504D0 + 1;
            b[] bVarArr = this.f7507G0;
            if (i10 >= bVarArr.length) {
                this.f7507G0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f7507G0;
            int i11 = this.f7504D0;
            bVarArr2[i11] = new b(eVar, 0, this.f7522z0);
            this.f7504D0 = i11 + 1;
            return;
        }
        if (i7 == 1) {
            int i12 = this.f7505E0 + 1;
            b[] bVarArr3 = this.f7506F0;
            if (i12 >= bVarArr3.length) {
                this.f7506F0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f7506F0;
            int i13 = this.f7505E0;
            bVarArr4[i13] = new b(eVar, 1, this.f7522z0);
            this.f7505E0 = i13 + 1;
        }
    }

    public final void T(androidx.constraintlayout.core.c cVar) {
        f fVar;
        androidx.constraintlayout.core.c cVar2;
        boolean zX = X(64);
        b(cVar, zX);
        int size = this.f7517u0.size();
        boolean z3 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f7517u0.get(i7);
            boolean[] zArr = eVar.f7452T;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = (e) this.f7517u0.get(i10);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i11 = 0; i11 < aVar.f7569v0; i11++) {
                        e eVar3 = aVar.f7568u0[i11];
                        if (aVar.f7399x0 || eVar3.c()) {
                            int i12 = aVar.f7398w0;
                            if (i12 == 0 || i12 == 1) {
                                eVar3.f7452T[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                eVar3.f7452T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f7515O0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            e eVar4 = (e) this.f7517u0.get(i13);
            eVar4.getClass();
            boolean z8 = eVar4 instanceof m;
            if (z8 || (eVar4 instanceof i)) {
                if (z8) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.b(cVar, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                m mVar = (m) ((e) it.next());
                for (int i14 = 0; i14 < mVar.f7569v0; i14++) {
                    if (hashSet.contains(mVar.f7568u0[i14])) {
                        mVar.b(cVar, zX);
                        hashSet.remove(mVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).b(cVar, zX);
                }
                hashSet.clear();
            }
        }
        boolean z10 = androidx.constraintlayout.core.c.f15087p;
        d dVar = d.f7429b;
        if (z10) {
            HashSet<e> hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                e eVar5 = (e) this.f7517u0.get(i15);
                eVar5.getClass();
                if (!(eVar5 instanceof m) && !(eVar5 instanceof i)) {
                    hashSet2.add(eVar5);
                }
            }
            fVar = this;
            cVar2 = cVar;
            fVar.a(this, cVar2, hashSet2, this.f7453U[0] == dVar ? 0 : 1, false);
            for (e eVar6 : hashSet2) {
                k.b(this, cVar2, eVar6);
                eVar6.b(cVar2, zX);
            }
        } else {
            fVar = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                e eVar7 = (e) fVar.f7517u0.get(i16);
                if (eVar7 instanceof f) {
                    d[] dVarArr = eVar7.f7453U;
                    d dVar2 = dVarArr[0];
                    d dVar3 = dVarArr[1];
                    d dVar4 = d.f7428a;
                    if (dVar2 == dVar) {
                        eVar7.N(dVar4);
                    }
                    if (dVar3 == dVar) {
                        eVar7.O(dVar4);
                    }
                    eVar7.b(cVar2, zX);
                    if (dVar2 == dVar) {
                        eVar7.N(dVar2);
                    }
                    if (dVar3 == dVar) {
                        eVar7.O(dVar3);
                    }
                } else {
                    k.b(this, cVar2, eVar7);
                    if (!(eVar7 instanceof m) && !(eVar7 instanceof i)) {
                        eVar7.b(cVar2, zX);
                    }
                }
            }
        }
        if (fVar.f7504D0 > 0) {
            k.a(this, cVar2, null, 0);
        }
        if (fVar.f7505E0 > 0) {
            k.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    public final boolean U(int i7, boolean z3) {
        boolean z8;
        d dVar;
        boolean z10;
        R.d dVar2 = this.f7519w0;
        f fVar = dVar2.f7864a;
        boolean z11 = false;
        d dVarK = fVar.k(0);
        d dVarK2 = fVar.k(1);
        int iS = fVar.s();
        int iT = fVar.t();
        ArrayList<n> arrayList = dVar2.f7868e;
        d dVar3 = d.f7428a;
        if (z3 && (dVarK == (dVar = d.f7429b) || dVarK2 == dVar)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = z3;
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.f7902f == i7 && !nVar.j()) {
                    z10 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z10 && dVarK == dVar) {
                    fVar.N(dVar3);
                    fVar.P(dVar2.d(fVar, 0));
                    fVar.f7463d.f7901e.c(fVar.r());
                }
            } else if (z10 && dVarK2 == dVar) {
                fVar.O(dVar3);
                fVar.M(dVar2.d(fVar, 1));
                fVar.f7465e.f7901e.c(fVar.l());
            }
        }
        d dVar4 = d.f7431d;
        if (i7 == 0) {
            d dVar5 = fVar.f7453U[0];
            if (dVar5 == dVar3 || dVar5 == dVar4) {
                int iR = fVar.r() + iS;
                fVar.f7463d.f7905i.c(iR);
                fVar.f7463d.f7901e.c(iR - iS);
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            d dVar6 = fVar.f7453U[1];
            if (dVar6 == dVar3 || dVar6 == dVar4) {
                int iL = fVar.l() + iT;
                fVar.f7465e.f7905i.c(iL);
                fVar.f7465e.f7901e.c(iL - iT);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        dVar2.g();
        for (n nVar2 : arrayList) {
            if (nVar2.f7902f == i7 && (nVar2.f7898b != fVar || nVar2.f7903g)) {
                nVar2.d();
            }
        }
        for (n nVar3 : arrayList) {
            if (nVar3.f7902f == i7 && (z8 || nVar3.f7898b != fVar)) {
                if (!nVar3.f7904h.f7881j || !nVar3.f7905i.f7881j || (!(nVar3 instanceof R.c) && !nVar3.f7901e.f7881j)) {
                    fVar.N(dVarK);
                    fVar.O(dVarK2);
                    return z11;
                }
            }
        }
        z11 = true;
        fVar.N(dVarK);
        fVar.O(dVarK2);
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:357:0x062a  */
    /* JADX WARN: Code duplicated, block: B:371:0x065d  */
    /* JADX WARN: Code duplicated, block: B:396:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:401:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:408:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:411:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:413:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:417:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:422:0x0707 A[Catch: Exception -> 0x0715, LOOP:12: B:421:0x0705->B:422:0x0707, LOOP_END, TryCatch #7 {Exception -> 0x0715, blocks: (B:420:0x06fd, B:422:0x0707, B:426:0x071f), top: B:568:0x06fd }] */
    /* JADX WARN: Code duplicated, block: B:431:0x072c A[Catch: Exception -> 0x075d, TRY_LEAVE, TryCatch #2 {Exception -> 0x075d, blocks: (B:429:0x0726, B:431:0x072c), top: B:558:0x0726 }] */
    /* JADX WARN: Code duplicated, block: B:448:0x075f  */
    /* JADX WARN: Code duplicated, block: B:451:0x0767 A[Catch: Exception -> 0x074f, TRY_ENTER, TryCatch #0 {Exception -> 0x074f, blocks: (B:437:0x0748, B:451:0x0767, B:453:0x076d, B:456:0x078d, B:458:0x0793, B:462:0x07ab), top: B:554:0x0748 }] */
    /* JADX WARN: Code duplicated, block: B:456:0x078d A[Catch: Exception -> 0x074f, TRY_ENTER, TryCatch #0 {Exception -> 0x074f, blocks: (B:437:0x0748, B:451:0x0767, B:453:0x076d, B:456:0x078d, B:458:0x0793, B:462:0x07ab), top: B:554:0x0748 }] */
    /* JADX WARN: Code duplicated, block: B:468:0x07ba A[Catch: Exception -> 0x07e7, TryCatch #4 {Exception -> 0x07e7, blocks: (B:449:0x0763, B:454:0x0789, B:466:0x07b6, B:468:0x07ba, B:470:0x07c0), top: B:562:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:484:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:494:0x0819  */
    /* JADX WARN: Code duplicated, block: B:496:0x0832  */
    /* JADX WARN: Code duplicated, block: B:498:0x0848  */
    /* JADX WARN: Code duplicated, block: B:500:0x084c  */
    /* JADX WARN: Code duplicated, block: B:503:0x0858  */
    /* JADX WARN: Code duplicated, block: B:505:0x0861 A[LOOP:15: B:504:0x085f->B:505:0x0861, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:509:0x0874 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:524:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:527:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:530:0x090a  */
    /* JADX WARN: Code duplicated, block: B:531:0x0916  */
    /* JADX WARN: Code duplicated, block: B:533:0x0919  */
    /* JADX WARN: Code duplicated, block: B:535:0x0921 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:538:0x0929  */
    /* JADX WARN: Code duplicated, block: B:541:0x093b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:545:0x0951 A[PHI: r15 r26
      0x0951: PHI (r15v10 ??) = (r15v9 ??), (r15v14 ??), (r15v14 ??), (r15v14 ??) binds: [B:532:0x0917, B:540:0x0939, B:541:0x093b, B:543:0x0941] A[DONT_GENERATE, DONT_INLINE]
      0x0951: PHI (r26v8 boolean) = (r26v7 boolean), (r26v9 boolean), (r26v9 boolean), (r26v9 boolean) binds: [B:532:0x0917, B:540:0x0939, B:541:0x093b, B:543:0x0941] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:547:0x0957  */
    /* JADX WARN: Code duplicated, block: B:551:0x0967  */
    /* JADX WARN: Code duplicated, block: B:558:0x0726 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x0958 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r33v0, types: [Q.e, Q.f] */
    public final void V() {
        c cVar;
        int i7;
        c cVar2;
        int i10;
        int i11;
        boolean z3;
        boolean z8;
        char c6;
        d[] dVarArr;
        boolean z10;
        int i12;
        int i13;
        boolean zX;
        boolean z11;
        int i14;
        ?? r15;
        boolean z12;
        int i15;
        boolean z13;
        d dVar;
        boolean z14;
        ?? r16;
        boolean[] zArr;
        boolean[] zArr2;
        int i16;
        boolean z15;
        int iMax;
        boolean z16;
        int iMax2;
        ?? r10;
        ?? r17;
        int i17;
        ?? r18;
        boolean zX2;
        int size;
        int i18;
        boolean z17;
        e eVar;
        ?? r19;
        ?? r110;
        int i19;
        char c10;
        WeakReference weakReference;
        c cVar3;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        e eVar2;
        R.m mVar;
        R.m mVar2;
        int i20;
        int iL;
        int iB;
        int iB2;
        int i21;
        d dVar2;
        R.m mVar3;
        R.m mVar4;
        boolean z18;
        ArrayList arrayList;
        int i22;
        c cVar5;
        this.f7460a0 = 0;
        this.b0 = 0;
        this.f7509I0 = false;
        this.f7510J0 = false;
        int size2 = this.f7517u0.size();
        int iMax3 = Math.max(0, r());
        int iMax4 = Math.max(0, l());
        d[] dVarArr2 = this.f7453U;
        d dVar3 = dVarArr2[1];
        d dVar4 = dVarArr2[0];
        int i23 = this.f7520x0;
        d dVar5 = d.f7430c;
        c cVar6 = this.f7443K;
        c cVar7 = this.f7442J;
        d dVar6 = d.f7428a;
        if (i23 == 0 && k.c(this.f7508H0, 1)) {
            BasicMeasure$Measurer basicMeasure$Measurer = this.f7521y0;
            d[] dVarArr3 = this.f7453U;
            d dVar7 = dVarArr3[0];
            d dVar8 = dVarArr3[1];
            F();
            ArrayList arrayList2 = this.f7517u0;
            int size3 = arrayList2.size();
            for (int i24 = 0; i24 < size3; i24++) {
                ((e) arrayList2.get(i24)).F();
            }
            boolean z19 = this.f7522z0;
            if (dVar7 == dVar6) {
                K(0, r());
            } else {
                cVar7.l(0);
                this.f7460a0 = 0;
            }
            boolean z20 = false;
            int i25 = 0;
            boolean z21 = false;
            while (i25 < size3) {
                boolean z22 = z20;
                e eVar3 = (e) arrayList2.get(i25);
                int i26 = i25;
                if (eVar3 instanceof i) {
                    i iVar = (i) eVar3;
                    cVar5 = cVar7;
                    if (iVar.f7566y0 == 1) {
                        int i27 = iVar.f7563v0;
                        if (i27 != -1) {
                            iVar.S(i27);
                        } else if (iVar.f7564w0 != -1 && B()) {
                            iVar.S(r() - iVar.f7564w0);
                        } else if (B()) {
                            iVar.S((int) ((iVar.f7562u0 * r()) + 0.5f));
                        }
                        z22 = true;
                    }
                } else {
                    cVar5 = cVar7;
                    if ((eVar3 instanceof a) && ((a) eVar3).U() == 0) {
                        z20 = z22;
                        z21 = true;
                    }
                    i25 = i26 + 1;
                    cVar7 = cVar5;
                }
                z20 = z22;
                i25 = i26 + 1;
                cVar7 = cVar5;
            }
            cVar = cVar7;
            if (z20) {
                for (int i28 = 0; i28 < size3; i28 = i22 + 1) {
                    e eVar4 = (e) arrayList2.get(i28);
                    if (eVar4 instanceof i) {
                        i iVar2 = (i) eVar4;
                        i22 = i28;
                        if (iVar2.f7566y0 == 1) {
                            R.g.c(0, iVar2, basicMeasure$Measurer, z19);
                        }
                    } else {
                        i22 = i28;
                    }
                }
            }
            R.g.c(0, this, basicMeasure$Measurer, z19);
            if (z21) {
                for (int i29 = 0; i29 < size3; i29++) {
                    e eVar5 = (e) arrayList2.get(i29);
                    if (eVar5 instanceof a) {
                        a aVar = (a) eVar5;
                        if (aVar.U() == 0 && aVar.T()) {
                            R.g.c(1, aVar, basicMeasure$Measurer, z19);
                        }
                    }
                }
            }
            if (dVar8 == dVar6) {
                L(0, l());
            } else {
                cVar6.l(0);
                this.b0 = 0;
            }
            int i30 = 0;
            boolean z23 = false;
            boolean z24 = false;
            while (i30 < size3) {
                e eVar6 = (e) arrayList2.get(i30);
                int i31 = i30;
                if (eVar6 instanceof i) {
                    i iVar3 = (i) eVar6;
                    if (iVar3.f7566y0 == 0) {
                        int i32 = iVar3.f7563v0;
                        if (i32 != -1) {
                            iVar3.S(i32);
                        } else if (iVar3.f7564w0 != -1 && C()) {
                            iVar3.S(l() - iVar3.f7564w0);
                        } else if (C()) {
                            iVar3.S((int) ((iVar3.f7562u0 * l()) + 0.5f));
                        }
                        z23 = true;
                    }
                } else if ((eVar6 instanceof a) && ((a) eVar6).U() == 1) {
                    z24 = true;
                }
                i30 = i31 + 1;
            }
            if (z23) {
                for (int i33 = 0; i33 < size3; i33++) {
                    e eVar7 = (e) arrayList2.get(i33);
                    if (eVar7 instanceof i) {
                        i iVar4 = (i) eVar7;
                        if (iVar4.f7566y0 == 0) {
                            R.g.i(1, iVar4, basicMeasure$Measurer);
                        }
                    }
                }
            }
            R.g.i(0, this, basicMeasure$Measurer);
            if (z24) {
                for (int i34 = 0; i34 < size3; i34++) {
                    e eVar8 = (e) arrayList2.get(i34);
                    if (eVar8 instanceof a) {
                        a aVar2 = (a) eVar8;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            R.g.i(1, aVar2, basicMeasure$Measurer);
                        }
                    }
                }
            }
            for (int i35 = 0; i35 < size3; i35++) {
                e eVar9 = (e) arrayList2.get(i35);
                if (eVar9.A() && R.g.a(eVar9)) {
                    W(eVar9, basicMeasure$Measurer, R.g.f7885a);
                    if (!(eVar9 instanceof i)) {
                        R.g.c(0, eVar9, basicMeasure$Measurer, z19);
                        R.g.i(0, eVar9, basicMeasure$Measurer);
                    } else if (((i) eVar9).f7566y0 == 0) {
                        R.g.i(0, eVar9, basicMeasure$Measurer);
                    } else {
                        R.g.c(0, eVar9, basicMeasure$Measurer, z19);
                    }
                }
            }
            for (int i36 = 0; i36 < size2; i36++) {
                e eVar10 = (e) this.f7517u0.get(i36);
                if (eVar10.A() && !(eVar10 instanceof i) && !(eVar10 instanceof a) && !(eVar10 instanceof m) && !eVar10.f7439G) {
                    d dVarK = eVar10.k(0);
                    d dVarK2 = eVar10.k(1);
                    if (dVarK != dVar5 || eVar10.f7490r == 1 || dVarK2 != dVar5 || eVar10.f7492s == 1) {
                        W(eVar10, this.f7521y0, new R.b());
                    }
                }
            }
        } else {
            iMax4 = iMax4;
            cVar = cVar7;
        }
        d dVar9 = d.f7429b;
        androidx.constraintlayout.core.c cVar8 = this.f7501A0;
        if (size2 <= 2 || !((dVar4 == dVar9 || dVar3 == dVar9) && k.c(this.f7508H0, 1024))) {
            i7 = size2;
            cVar2 = cVar6;
        } else {
            BasicMeasure$Measurer basicMeasure$Measurer2 = this.f7521y0;
            ArrayList arrayList3 = this.f7517u0;
            int size4 = arrayList3.size();
            int i37 = 0;
            while (true) {
                if (i37 >= size4) {
                    i7 = size2;
                    cVar2 = cVar6;
                    int i38 = 0;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    while (i38 < size4) {
                        int i39 = i38;
                        e eVar11 = (e) arrayList3.get(i38);
                        ArrayList arrayList10 = arrayList4;
                        d[] dVarArr4 = this.f7453U;
                        d dVar10 = dVarArr4[0];
                        ArrayList arrayList11 = arrayList5;
                        d dVar11 = dVarArr4[1];
                        ArrayList arrayList12 = arrayList6;
                        d[] dVarArr5 = eVar11.f7453U;
                        ArrayList arrayList13 = arrayList7;
                        if (!R.g.h(dVar10, dVar11, dVarArr5[0], dVarArr5[1])) {
                            W(eVar11, basicMeasure$Measurer2, this.f7516P0);
                        }
                        boolean z25 = eVar11 instanceof i;
                        if (z25) {
                            i iVar5 = (i) eVar11;
                            if (iVar5.f7566y0 == 0) {
                                arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList6.add(iVar5);
                            } else {
                                arrayList6 = arrayList12;
                            }
                            z18 = z25;
                            if (iVar5.f7566y0 == 1) {
                                arrayList = arrayList10 == null ? new ArrayList() : arrayList10;
                                arrayList.add(iVar5);
                            } else {
                                arrayList = arrayList10;
                            }
                        } else {
                            z18 = z25;
                            arrayList = arrayList10;
                            arrayList6 = arrayList12;
                        }
                        if (!(eVar11 instanceof j)) {
                            arrayList5 = arrayList11;
                            arrayList7 = arrayList13;
                        } else if (eVar11 instanceof a) {
                            a aVar3 = (a) eVar11;
                            if (aVar3.U() == 0) {
                                ArrayList arrayList14 = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList14.add(aVar3);
                                arrayList11 = arrayList14;
                            }
                            if (aVar3.U() == 1) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(aVar3);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            arrayList5 = arrayList11;
                        } else {
                            j jVar = (j) eVar11;
                            arrayList5 = arrayList11 == null ? new ArrayList() : arrayList11;
                            arrayList5.add(jVar);
                            arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                            arrayList7.add(jVar);
                        }
                        if (eVar11.f7442J.f7424f == null && eVar11.f7444L.f7424f == null && !z18 && !(eVar11 instanceof a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            ArrayList arrayList15 = arrayList8;
                            arrayList15.add(eVar11);
                            arrayList8 = arrayList15;
                        }
                        if (eVar11.f7443K.f7424f == null && eVar11.f7445M.f7424f == null && eVar11.f7446N.f7424f == null && !z18 && !(eVar11 instanceof a)) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList16 = arrayList9;
                            arrayList16.add(eVar11);
                            arrayList9 = arrayList16;
                        }
                        i38 = i39 + 1;
                        arrayList4 = arrayList;
                    }
                    ArrayList arrayList17 = arrayList4;
                    ArrayList<j> arrayList18 = arrayList5;
                    ArrayList arrayList19 = arrayList6;
                    ArrayList<j> arrayList20 = arrayList7;
                    ArrayList<R.m> arrayList21 = new ArrayList();
                    if (arrayList17 != null) {
                        Iterator it = arrayList17.iterator();
                        while (it.hasNext()) {
                            R.g.b((i) it.next(), 0, arrayList21, null);
                        }
                    }
                    R.m mVar5 = null;
                    int i40 = 0;
                    if (arrayList18 != null) {
                        for (j jVar2 : arrayList18) {
                            R.m mVarB = R.g.b(jVar2, i40, arrayList21, mVar5);
                            jVar2.S(i40, mVarB, arrayList21);
                            mVarB.a(arrayList21);
                            mVar5 = null;
                            i40 = 0;
                        }
                    }
                    HashSet hashSet = j(2).f7419a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            R.g.b(((c) it2.next()).f7422d, 0, arrayList21, null);
                        }
                    }
                    HashSet hashSet2 = j(4).f7419a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            R.g.b(((c) it3.next()).f7422d, 0, arrayList21, null);
                        }
                    }
                    HashSet hashSet3 = j(7).f7419a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            R.g.b(((c) it4.next()).f7422d, 0, arrayList21, null);
                        }
                    }
                    R.m mVar6 = null;
                    if (arrayList8 != null) {
                        Iterator it5 = arrayList8.iterator();
                        while (it5.hasNext()) {
                            R.g.b((e) it5.next(), 0, arrayList21, null);
                        }
                    }
                    if (arrayList19 != null) {
                        Iterator it6 = arrayList19.iterator();
                        while (it6.hasNext()) {
                            R.g.b((i) it6.next(), 1, arrayList21, null);
                        }
                    }
                    int i41 = 1;
                    if (arrayList20 != null) {
                        for (j jVar3 : arrayList20) {
                            R.m mVarB2 = R.g.b(jVar3, i41, arrayList21, mVar6);
                            jVar3.S(i41, mVarB2, arrayList21);
                            mVarB2.a(arrayList21);
                            i41 = 1;
                            mVar6 = null;
                        }
                    }
                    HashSet hashSet4 = j(3).f7419a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            R.g.b(((c) it7.next()).f7422d, 1, arrayList21, null);
                        }
                    }
                    HashSet hashSet5 = j(6).f7419a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            R.g.b(((c) it8.next()).f7422d, 1, arrayList21, null);
                        }
                    }
                    HashSet hashSet6 = j(5).f7419a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            R.g.b(((c) it9.next()).f7422d, 1, arrayList21, null);
                        }
                    }
                    HashSet hashSet7 = j(7).f7419a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            R.g.b(((c) it10.next()).f7422d, 1, arrayList21, null);
                        }
                    }
                    if (arrayList9 != null) {
                        Iterator it11 = arrayList9.iterator();
                        while (it11.hasNext()) {
                            R.g.b((e) it11.next(), 1, arrayList21, null);
                        }
                    }
                    int i42 = 0;
                    while (i42 < size4) {
                        e eVar12 = (e) arrayList3.get(i42);
                        d[] dVarArr6 = eVar12.f7453U;
                        if (dVarArr6[0] == dVar5 && dVarArr6[1] == dVar5) {
                            int i43 = eVar12.f7493s0;
                            int size5 = arrayList21.size();
                            int i44 = 0;
                            while (true) {
                                if (i44 >= size5) {
                                    i21 = i42;
                                    dVar2 = dVar5;
                                    mVar3 = null;
                                    break;
                                }
                                i21 = i42;
                                mVar3 = (R.m) arrayList21.get(i44);
                                dVar2 = dVar5;
                                if (i43 == mVar3.f7893b) {
                                    break;
                                }
                                i44++;
                                dVar5 = dVar2;
                                i42 = i21;
                            }
                            int i45 = eVar12.f7494t0;
                            int size6 = arrayList21.size();
                            int i46 = 0;
                            while (true) {
                                if (i46 >= size6) {
                                    mVar4 = null;
                                    break;
                                }
                                mVar4 = (R.m) arrayList21.get(i46);
                                if (i45 == mVar4.f7893b) {
                                    break;
                                } else {
                                    i46++;
                                }
                            }
                            if (mVar3 != null && mVar4 != null) {
                                mVar3.c(0, mVar4);
                                mVar4.f7894c = 2;
                                arrayList21.remove(mVar3);
                            }
                        } else {
                            i21 = i42;
                            dVar2 = dVar5;
                        }
                        i42 = i21 + 1;
                        dVar5 = dVar2;
                    }
                    if (arrayList21.size() > 1) {
                        if (this.f7453U[0] == dVar9) {
                            int i47 = 0;
                            mVar = null;
                            for (R.m mVar7 : arrayList21) {
                                if (mVar7.f7894c != 1 && (iB2 = mVar7.b(cVar8, 0)) > i47) {
                                    mVar = mVar7;
                                    i47 = iB2;
                                }
                            }
                            if (mVar != null) {
                                N(dVar6);
                                P(i47);
                            } else {
                                mVar = null;
                            }
                        } else {
                            mVar = null;
                        }
                        if (this.f7453U[1] == dVar9) {
                            int i48 = 0;
                            mVar2 = null;
                            for (R.m mVar8 : arrayList21) {
                                if (mVar8.f7894c != 0 && (iB = mVar8.b(cVar8, 1)) > i48) {
                                    mVar2 = mVar8;
                                    i48 = iB;
                                }
                            }
                            if (mVar2 != null) {
                                O(dVar6);
                                M(i48);
                            } else {
                                mVar2 = null;
                            }
                        } else {
                            mVar2 = null;
                        }
                        if (mVar != null || mVar2 != null) {
                            if (dVar4 == dVar9) {
                                if (iMax3 >= r() || iMax3 <= 0) {
                                    iMax3 = r();
                                } else {
                                    P(iMax3);
                                    this.f7509I0 = true;
                                }
                            }
                            if (dVar3 == dVar9) {
                                i20 = iMax4;
                                if (i20 >= l() || i20 <= 0) {
                                    iL = l();
                                } else {
                                    M(i20);
                                    this.f7510J0 = true;
                                }
                                i10 = iL;
                                i11 = iMax3;
                                z3 = true;
                            } else {
                                i20 = iMax4;
                            }
                            iL = i20;
                            i10 = iL;
                            i11 = iMax3;
                            z3 = true;
                        }
                    }
                    if (!X(64) || X(128)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    cVar8.getClass();
                    cVar8.f15095g = false;
                    if (this.f7508H0 == 0 && z8) {
                        c6 = 1;
                        cVar8.f15095g = true;
                    } else {
                        c6 = 1;
                    }
                    ArrayList arrayList22 = this.f7517u0;
                    dVarArr = this.f7453U;
                    if (dVarArr[0] != dVar9 || dVarArr[c6] == dVar9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f7504D0 = 0;
                    this.f7505E0 = 0;
                    i12 = i7;
                    for (i13 = 0; i13 < i12; i13++) {
                        eVar2 = (e) this.f7517u0.get(i13);
                        if (eVar2 instanceof f) {
                            ((f) eVar2).V();
                        }
                    }
                    zX = X(64);
                    z11 = z3;
                    i14 = 0;
                    r15 = 1;
                    while (r15 != 0) {
                        i15 = i14 + 1;
                        try {
                            cVar8.t();
                            z13 = z10;
                            try {
                                this.f7504D0 = 0;
                                this.f7505E0 = 0;
                                h(cVar8);
                                for (i19 = 0; i19 < i12; i19++) {
                                    ((e) this.f7517u0.get(i19)).h(cVar8);
                                }
                                T(cVar8);
                                try {
                                    weakReference = this.f7511K0;
                                    if (weakReference != null) {
                                        try {
                                            if (weakReference.get() != null) {
                                                c cVar9 = (c) this.f7511K0.get();
                                                cVar3 = cVar2;
                                                try {
                                                    androidx.constraintlayout.core.g gVarK = cVar8.k(cVar3);
                                                    cVar2 = cVar3;
                                                    try {
                                                        androidx.constraintlayout.core.c cVar10 = this.f7501A0;
                                                        dVar = dVar6;
                                                        z14 = z11;
                                                        try {
                                                            cVar10.f(cVar10.k(cVar9), gVarK, 0, 5);
                                                            this.f7511K0 = null;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            r110 = 1;
                                                            r19 = r110;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            r16 = r19;
                                                            zArr = k.f7570a;
                                                            if (r16 != 0) {
                                                                zArr[2] = false;
                                                                zX2 = X(64);
                                                                R(cVar8, zX2);
                                                                size = this.f7517u0.size();
                                                                i18 = 0;
                                                                z17 = false;
                                                                while (i18 < size) {
                                                                    boolean[] zArr3 = zArr;
                                                                    eVar = (e) this.f7517u0.get(i18);
                                                                    eVar.R(cVar8, zX2);
                                                                    int i49 = i18;
                                                                    boolean z26 = zX2;
                                                                    if (eVar.f7471h == -1) {
                                                                        z17 = true;
                                                                    } else {
                                                                        z17 = true;
                                                                    }
                                                                    i18 = i49 + 1;
                                                                    zArr = zArr3;
                                                                    zX2 = z26;
                                                                    z17 = z17;
                                                                }
                                                                zArr2 = zArr;
                                                                z15 = z17;
                                                            } else {
                                                                zArr2 = zArr;
                                                                R(cVar8, zX);
                                                                for (i16 = 0; i16 < i12; i16++) {
                                                                    ((e) this.f7517u0.get(i16)).R(cVar8, zX);
                                                                }
                                                                z15 = false;
                                                            }
                                                            if (!z13) {
                                                            }
                                                            iMax = Math.max(this.f7464d0, r());
                                                            z16 = z15;
                                                            if (iMax > r()) {
                                                                P(iMax);
                                                                this.f7453U[0] = dVar;
                                                                z16 = true;
                                                                z14 = true;
                                                            }
                                                            iMax2 = Math.max(this.f7466e0, l());
                                                            if (iMax2 > l()) {
                                                                M(iMax2);
                                                                r10 = 1;
                                                                this.f7453U[1] = dVar;
                                                                r17 = 1;
                                                                z14 = true;
                                                            } else {
                                                                r10 = 1;
                                                            }
                                                            if (z14) {
                                                                r17 = z16;
                                                                z11 = z14;
                                                                i17 = 8;
                                                                r18 = r17;
                                                            } else {
                                                                r17 = z16;
                                                                if (this.f7453U[0] == dVar9) {
                                                                    r17 = r17;
                                                                    if (r() > i11) {
                                                                        this.f7509I0 = r10;
                                                                        this.f7453U[0] = dVar;
                                                                        P(i11);
                                                                        ?? r111 = r10;
                                                                        z14 = r111 == true ? 1 : 0;
                                                                        r17 = r111;
                                                                    }
                                                                }
                                                                r17 = r17;
                                                                r17 = r17;
                                                                if (this.f7453U[r10] == dVar9) {
                                                                    r17 = z16;
                                                                    z11 = z14;
                                                                    i17 = 8;
                                                                    r18 = r17;
                                                                } else {
                                                                    r17 = z16;
                                                                    z11 = z14;
                                                                    i17 = 8;
                                                                    r18 = r17;
                                                                }
                                                            }
                                                            if (i15 > i17) {
                                                                r18 = 0;
                                                            }
                                                            i14 = i15;
                                                            z10 = z13;
                                                            dVar6 = dVar;
                                                            r15 = r18;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        dVar = dVar6;
                                                        z14 = z11;
                                                        r110 = 1;
                                                        r19 = r110;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        r16 = r19;
                                                        zArr = k.f7570a;
                                                        if (r16 != 0) {
                                                            zArr[2] = false;
                                                            zX2 = X(64);
                                                            R(cVar8, zX2);
                                                            size = this.f7517u0.size();
                                                            i18 = 0;
                                                            z17 = false;
                                                            while (i18 < size) {
                                                                boolean[] zArr4 = zArr;
                                                                eVar = (e) this.f7517u0.get(i18);
                                                                eVar.R(cVar8, zX2);
                                                                int i410 = i18;
                                                                boolean z27 = zX2;
                                                                if (eVar.f7471h == -1) {
                                                                    z17 = true;
                                                                } else {
                                                                    z17 = true;
                                                                }
                                                                i18 = i410 + 1;
                                                                zArr = zArr4;
                                                                zX2 = z27;
                                                                z17 = z17;
                                                            }
                                                            zArr2 = zArr;
                                                            z15 = z17;
                                                        } else {
                                                            zArr2 = zArr;
                                                            R(cVar8, zX);
                                                            while (i16 < i12) {
                                                                ((e) this.f7517u0.get(i16)).R(cVar8, zX);
                                                            }
                                                            z15 = false;
                                                        }
                                                        if (!z13) {
                                                        }
                                                        iMax = Math.max(this.f7464d0, r());
                                                        z16 = z15;
                                                        if (iMax > r()) {
                                                            P(iMax);
                                                            this.f7453U[0] = dVar;
                                                            z16 = true;
                                                            z14 = true;
                                                        }
                                                        iMax2 = Math.max(this.f7466e0, l());
                                                        if (iMax2 > l()) {
                                                            M(iMax2);
                                                            r10 = 1;
                                                            this.f7453U[1] = dVar;
                                                            r17 = 1;
                                                            z14 = true;
                                                        } else {
                                                            r10 = 1;
                                                        }
                                                        if (z14) {
                                                            r17 = z16;
                                                            if (this.f7453U[0] == dVar9) {
                                                                r17 = r17;
                                                                if (r() > i11) {
                                                                    this.f7509I0 = r10;
                                                                    this.f7453U[0] = dVar;
                                                                    P(i11);
                                                                    ?? r112 = r10;
                                                                    z14 = r112 == true ? 1 : 0;
                                                                    r17 = r112;
                                                                }
                                                            }
                                                            r17 = r17;
                                                            r17 = r17;
                                                            if (this.f7453U[r10] == dVar9) {
                                                                r17 = z16;
                                                                z11 = z14;
                                                                i17 = 8;
                                                                r18 = r17;
                                                            } else {
                                                                r17 = z16;
                                                                z11 = z14;
                                                                i17 = 8;
                                                                r18 = r17;
                                                            }
                                                        } else {
                                                            r17 = z16;
                                                            z11 = z14;
                                                            i17 = 8;
                                                            r18 = r17;
                                                        }
                                                        if (i15 > i17) {
                                                            r18 = 0;
                                                        }
                                                        i14 = i15;
                                                        z10 = z13;
                                                        dVar6 = dVar;
                                                        r15 = r18;
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    cVar2 = cVar3;
                                                }
                                            } else {
                                                dVar = dVar6;
                                                z14 = z11;
                                            }
                                            try {
                                                weakReference2 = this.f7513M0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    c cVar11 = (c) this.f7513M0.get();
                                                    androidx.constraintlayout.core.g gVarK2 = cVar8.k(this.f7445M);
                                                    androidx.constraintlayout.core.c cVar12 = this.f7501A0;
                                                    cVar12.f(gVarK2, cVar12.k(cVar11), 0, 5);
                                                    this.f7513M0 = null;
                                                }
                                                weakReference3 = this.f7512L0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    c cVar13 = (c) this.f7512L0.get();
                                                    cVar4 = cVar;
                                                    try {
                                                        androidx.constraintlayout.core.g gVarK3 = cVar8.k(cVar4);
                                                        androidx.constraintlayout.core.c cVar14 = this.f7501A0;
                                                        cVar = cVar4;
                                                        cVar14.f(cVar14.k(cVar13), gVarK3, 0, 5);
                                                        this.f7512L0 = null;
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        cVar = cVar4;
                                                        r110 = 1;
                                                        r19 = r110;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        r16 = r19;
                                                    }
                                                }
                                                weakReference4 = this.f7514N0;
                                                if (weakReference4 != null || weakReference4.get() == null) {
                                                    c10 = 5;
                                                } else {
                                                    c cVar15 = (c) this.f7514N0.get();
                                                    androidx.constraintlayout.core.g gVarK4 = cVar8.k(this.f7444L);
                                                    try {
                                                        androidx.constraintlayout.core.c cVar16 = this.f7501A0;
                                                        c10 = 5;
                                                        try {
                                                            cVar16.f(gVarK4, cVar16.k(cVar15), 0, 5);
                                                            try {
                                                                this.f7514N0 = null;
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                r19 = 1;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                r16 = r19;
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        c10 = 5;
                                                        r19 = 1;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        r16 = r19;
                                                        zArr = k.f7570a;
                                                        if (r16 != 0) {
                                                            zArr[2] = false;
                                                            zX2 = X(64);
                                                            R(cVar8, zX2);
                                                            size = this.f7517u0.size();
                                                            i18 = 0;
                                                            z17 = false;
                                                            while (i18 < size) {
                                                                boolean[] zArr5 = zArr;
                                                                eVar = (e) this.f7517u0.get(i18);
                                                                eVar.R(cVar8, zX2);
                                                                int i411 = i18;
                                                                boolean z28 = zX2;
                                                                if (eVar.f7471h == -1) {
                                                                    z17 = true;
                                                                } else {
                                                                    z17 = true;
                                                                }
                                                                i18 = i411 + 1;
                                                                zArr = zArr5;
                                                                zX2 = z28;
                                                                z17 = z17;
                                                            }
                                                            zArr2 = zArr;
                                                            z15 = z17;
                                                        } else {
                                                            zArr2 = zArr;
                                                            R(cVar8, zX);
                                                            while (i16 < i12) {
                                                                ((e) this.f7517u0.get(i16)).R(cVar8, zX);
                                                            }
                                                            z15 = false;
                                                        }
                                                        if (!z13) {
                                                        }
                                                        iMax = Math.max(this.f7464d0, r());
                                                        z16 = z15;
                                                        if (iMax > r()) {
                                                            P(iMax);
                                                            this.f7453U[0] = dVar;
                                                            z16 = true;
                                                            z14 = true;
                                                        }
                                                        iMax2 = Math.max(this.f7466e0, l());
                                                        if (iMax2 > l()) {
                                                            M(iMax2);
                                                            r10 = 1;
                                                            this.f7453U[1] = dVar;
                                                            r17 = 1;
                                                            z14 = true;
                                                        } else {
                                                            r10 = 1;
                                                        }
                                                        if (z14) {
                                                            r17 = z16;
                                                            if (this.f7453U[0] == dVar9) {
                                                                r17 = r17;
                                                                if (r() > i11) {
                                                                    this.f7509I0 = r10;
                                                                    this.f7453U[0] = dVar;
                                                                    P(i11);
                                                                    ?? r113 = r10;
                                                                    z14 = r113 == true ? 1 : 0;
                                                                    r17 = r113;
                                                                }
                                                            }
                                                            r17 = r17;
                                                            r17 = r17;
                                                            if (this.f7453U[r10] == dVar9) {
                                                                r17 = z16;
                                                                z11 = z14;
                                                                i17 = 8;
                                                                r18 = r17;
                                                            } else {
                                                                r17 = z16;
                                                                z11 = z14;
                                                                i17 = 8;
                                                                r18 = r17;
                                                            }
                                                        } else {
                                                            r17 = z16;
                                                            z11 = z14;
                                                            i17 = 8;
                                                            r18 = r17;
                                                        }
                                                        if (i15 > i17) {
                                                            r18 = 0;
                                                        }
                                                        i14 = i15;
                                                        z10 = z13;
                                                        dVar6 = dVar;
                                                        r15 = r18;
                                                    }
                                                }
                                                cVar8.p();
                                                r16 = 1;
                                            } catch (Exception e17) {
                                                e = e17;
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                        }
                                    } else {
                                        dVar = dVar6;
                                        z14 = z11;
                                        weakReference2 = this.f7513M0;
                                        if (weakReference2 != null) {
                                            c cVar17 = (c) this.f7513M0.get();
                                            androidx.constraintlayout.core.g gVarK5 = cVar8.k(this.f7445M);
                                            androidx.constraintlayout.core.c cVar18 = this.f7501A0;
                                            cVar18.f(gVarK5, cVar18.k(cVar17), 0, 5);
                                            this.f7513M0 = null;
                                        }
                                        weakReference3 = this.f7512L0;
                                        if (weakReference3 != null) {
                                            c cVar19 = (c) this.f7512L0.get();
                                            cVar4 = cVar;
                                            androidx.constraintlayout.core.g gVarK6 = cVar8.k(cVar4);
                                            androidx.constraintlayout.core.c cVar110 = this.f7501A0;
                                            cVar = cVar4;
                                            cVar110.f(cVar110.k(cVar19), gVarK6, 0, 5);
                                            this.f7512L0 = null;
                                        }
                                        weakReference4 = this.f7514N0;
                                        if (weakReference4 != null) {
                                            c10 = 5;
                                        } else {
                                            c10 = 5;
                                        }
                                        cVar8.p();
                                        r16 = 1;
                                    }
                                } catch (Exception e19) {
                                    e = e19;
                                    dVar = dVar6;
                                    z14 = z11;
                                }
                            } catch (Exception e20) {
                                e = e20;
                                dVar = dVar6;
                                z14 = z11;
                                r110 = r15;
                                r19 = r110;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r16 = r19;
                                zArr = k.f7570a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zX2 = X(64);
                                    R(cVar8, zX2);
                                    size = this.f7517u0.size();
                                    i18 = 0;
                                    z17 = false;
                                    while (i18 < size) {
                                        boolean[] zArr6 = zArr;
                                        eVar = (e) this.f7517u0.get(i18);
                                        eVar.R(cVar8, zX2);
                                        int i412 = i18;
                                        boolean z29 = zX2;
                                        if (eVar.f7471h == -1) {
                                            z17 = true;
                                        } else {
                                            z17 = true;
                                        }
                                        i18 = i412 + 1;
                                        zArr = zArr6;
                                        zX2 = z29;
                                        z17 = z17;
                                    }
                                    zArr2 = zArr;
                                    z15 = z17;
                                } else {
                                    zArr2 = zArr;
                                    R(cVar8, zX);
                                    while (i16 < i12) {
                                        ((e) this.f7517u0.get(i16)).R(cVar8, zX);
                                    }
                                    z15 = false;
                                }
                                if (!z13) {
                                }
                                iMax = Math.max(this.f7464d0, r());
                                z16 = z15;
                                if (iMax > r()) {
                                    P(iMax);
                                    this.f7453U[0] = dVar;
                                    z16 = true;
                                    z14 = true;
                                }
                                iMax2 = Math.max(this.f7466e0, l());
                                if (iMax2 > l()) {
                                    M(iMax2);
                                    r10 = 1;
                                    this.f7453U[1] = dVar;
                                    r17 = 1;
                                    z14 = true;
                                } else {
                                    r10 = 1;
                                }
                                if (z14) {
                                    r17 = z16;
                                    if (this.f7453U[0] == dVar9) {
                                        r17 = r17;
                                        if (r() > i11) {
                                            this.f7509I0 = r10;
                                            this.f7453U[0] = dVar;
                                            P(i11);
                                            ?? r114 = r10;
                                            z14 = r114 == true ? 1 : 0;
                                            r17 = r114;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (this.f7453U[r10] == dVar9) {
                                        r17 = z16;
                                        z11 = z14;
                                        i17 = 8;
                                        r18 = r17;
                                    } else {
                                        r17 = z16;
                                        z11 = z14;
                                        i17 = 8;
                                        r18 = r17;
                                    }
                                } else {
                                    r17 = z16;
                                    z11 = z14;
                                    i17 = 8;
                                    r18 = r17;
                                }
                                if (i15 > i17) {
                                    r18 = 0;
                                }
                                i14 = i15;
                                z10 = z13;
                                dVar6 = dVar;
                                r15 = r18;
                            }
                        } catch (Exception e21) {
                            e = e21;
                            z13 = z10;
                        }
                        zArr = k.f7570a;
                        if (r16 != 0) {
                            zArr[2] = false;
                            zX2 = X(64);
                            R(cVar8, zX2);
                            size = this.f7517u0.size();
                            i18 = 0;
                            z17 = false;
                            while (i18 < size) {
                                boolean[] zArr7 = zArr;
                                eVar = (e) this.f7517u0.get(i18);
                                eVar.R(cVar8, zX2);
                                int i413 = i18;
                                boolean z210 = zX2;
                                if (eVar.f7471h == -1 || eVar.f7473i != -1) {
                                    z17 = true;
                                }
                                i18 = i413 + 1;
                                zArr = zArr7;
                                zX2 = z210;
                                z17 = z17;
                            }
                            zArr2 = zArr;
                            z15 = z17;
                        } else {
                            zArr2 = zArr;
                            R(cVar8, zX);
                            while (i16 < i12) {
                                ((e) this.f7517u0.get(i16)).R(cVar8, zX);
                            }
                            z15 = false;
                        }
                        if (!z13 && i15 < 8) {
                            if (zArr2[2]) {
                                int iMax5 = 0;
                                int iMax6 = 0;
                                for (int i50 = 0; i50 < i12; i50++) {
                                    e eVar13 = (e) this.f7517u0.get(i50);
                                    iMax6 = Math.max(iMax6, eVar13.r() + eVar13.f7460a0);
                                    iMax5 = Math.max(iMax5, eVar13.l() + eVar13.b0);
                                }
                                int iMax7 = Math.max(this.f7464d0, iMax6);
                                int iMax8 = Math.max(this.f7466e0, iMax5);
                                z15 = z15;
                                if (dVar4 == dVar9 && r() < iMax7) {
                                    z15 = z15;
                                    P(iMax7);
                                    this.f7453U[0] = dVar9;
                                    z15 = true;
                                    z14 = true;
                                }
                                if (dVar3 == dVar9 && l() < iMax8) {
                                    M(iMax8);
                                    this.f7453U[1] = dVar9;
                                    z15 = true;
                                    z14 = true;
                                }
                            }
                        }
                        iMax = Math.max(this.f7464d0, r());
                        z16 = z15;
                        if (iMax > r()) {
                            P(iMax);
                            this.f7453U[0] = dVar;
                            z16 = true;
                            z14 = true;
                        }
                        iMax2 = Math.max(this.f7466e0, l());
                        if (iMax2 > l()) {
                            M(iMax2);
                            r10 = 1;
                            this.f7453U[1] = dVar;
                            r17 = 1;
                            z14 = true;
                        } else {
                            r10 = 1;
                        }
                        if (z14) {
                            r17 = z16;
                            if (this.f7453U[0] == dVar9 && i11 > 0) {
                                r17 = r17;
                                if (r() > i11) {
                                    this.f7509I0 = r10;
                                    this.f7453U[0] = dVar;
                                    P(i11);
                                    ?? r115 = r10;
                                    z14 = r115 == true ? 1 : 0;
                                    r17 = r115;
                                }
                            }
                            r17 = r17;
                            r17 = r17;
                            if (this.f7453U[r10] == dVar9 || i10 <= 0 || l() <= i10) {
                                r17 = z16;
                                z11 = z14;
                                i17 = 8;
                                r18 = r17;
                            } else {
                                this.f7510J0 = r10;
                                this.f7453U[r10] = dVar;
                                M(i10);
                                i17 = 8;
                                z11 = true;
                                r18 = 1;
                            }
                        } else {
                            r17 = z16;
                            z11 = z14;
                            i17 = 8;
                            r18 = r17;
                        }
                        if (i15 > i17) {
                            r18 = 0;
                        }
                        i14 = i15;
                        z10 = z13;
                        dVar6 = dVar;
                        r15 = r18;
                    }
                    z12 = z11;
                    this.f7517u0 = arrayList22;
                    if (z12) {
                        d[] dVarArr7 = this.f7453U;
                        dVarArr7[0] = dVar4;
                        dVarArr7[1] = dVar3;
                    }
                    G(cVar8.f15100l);
                }
                e eVar14 = (e) arrayList3.get(i37);
                d[] dVarArr8 = this.f7453U;
                d dVar12 = dVarArr8[0];
                int i51 = i37;
                d dVar13 = dVarArr8[1];
                cVar2 = cVar6;
                d[] dVarArr9 = eVar14.f7453U;
                i7 = size2;
                if (R.g.h(dVar12, dVar13, dVarArr9[0], dVarArr9[1]) && !(eVar14 instanceof h)) {
                    i37 = i51 + 1;
                    cVar6 = cVar2;
                    size2 = i7;
                }
            }
        }
        i10 = iMax4;
        i11 = iMax3;
        z3 = false;
        if (X(64)) {
            z8 = true;
        } else {
            z8 = true;
        }
        cVar8.getClass();
        cVar8.f15095g = false;
        if (this.f7508H0 == 0) {
            c6 = 1;
        } else {
            c6 = 1;
        }
        ArrayList arrayList23 = this.f7517u0;
        dVarArr = this.f7453U;
        if (dVarArr[0] != dVar9) {
            z10 = true;
        } else {
            z10 = true;
        }
        this.f7504D0 = 0;
        this.f7505E0 = 0;
        i12 = i7;
        while (i13 < i12) {
            eVar2 = (e) this.f7517u0.get(i13);
            if (eVar2 instanceof f) {
                ((f) eVar2).V();
            }
        }
        zX = X(64);
        z11 = z3;
        i14 = 0;
        r15 = 1;
        while (r15 != 0) {
            i15 = i14 + 1;
            cVar8.t();
            z13 = z10;
            this.f7504D0 = 0;
            this.f7505E0 = 0;
            h(cVar8);
            while (i19 < i12) {
                ((e) this.f7517u0.get(i19)).h(cVar8);
            }
            T(cVar8);
            weakReference = this.f7511K0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    c cVar20 = (c) this.f7511K0.get();
                    cVar3 = cVar2;
                    androidx.constraintlayout.core.g gVarK7 = cVar8.k(cVar3);
                    cVar2 = cVar3;
                    androidx.constraintlayout.core.c cVar111 = this.f7501A0;
                    dVar = dVar6;
                    z14 = z11;
                    cVar111.f(cVar111.k(cVar20), gVarK7, 0, 5);
                    this.f7511K0 = null;
                } else {
                    dVar = dVar6;
                    z14 = z11;
                }
                weakReference2 = this.f7513M0;
                if (weakReference2 != null) {
                    c cVar112 = (c) this.f7513M0.get();
                    androidx.constraintlayout.core.g gVarK8 = cVar8.k(this.f7445M);
                    androidx.constraintlayout.core.c cVar113 = this.f7501A0;
                    cVar113.f(gVarK8, cVar113.k(cVar112), 0, 5);
                    this.f7513M0 = null;
                }
                weakReference3 = this.f7512L0;
                if (weakReference3 != null) {
                    c cVar114 = (c) this.f7512L0.get();
                    cVar4 = cVar;
                    androidx.constraintlayout.core.g gVarK9 = cVar8.k(cVar4);
                    androidx.constraintlayout.core.c cVar115 = this.f7501A0;
                    cVar = cVar4;
                    cVar115.f(cVar115.k(cVar114), gVarK9, 0, 5);
                    this.f7512L0 = null;
                }
                weakReference4 = this.f7514N0;
                if (weakReference4 != null) {
                    c10 = 5;
                } else {
                    c10 = 5;
                }
                cVar8.p();
                r16 = 1;
            } else {
                dVar = dVar6;
                z14 = z11;
                weakReference2 = this.f7513M0;
                if (weakReference2 != null) {
                    c cVar116 = (c) this.f7513M0.get();
                    androidx.constraintlayout.core.g gVarK10 = cVar8.k(this.f7445M);
                    androidx.constraintlayout.core.c cVar117 = this.f7501A0;
                    cVar117.f(gVarK10, cVar117.k(cVar116), 0, 5);
                    this.f7513M0 = null;
                }
                weakReference3 = this.f7512L0;
                if (weakReference3 != null) {
                    c cVar118 = (c) this.f7512L0.get();
                    cVar4 = cVar;
                    androidx.constraintlayout.core.g gVarK11 = cVar8.k(cVar4);
                    androidx.constraintlayout.core.c cVar119 = this.f7501A0;
                    cVar = cVar4;
                    cVar119.f(cVar119.k(cVar118), gVarK11, 0, 5);
                    this.f7512L0 = null;
                }
                weakReference4 = this.f7514N0;
                if (weakReference4 != null) {
                    c10 = 5;
                } else {
                    c10 = 5;
                }
                cVar8.p();
                r16 = 1;
            }
            zArr = k.f7570a;
            if (r16 != 0) {
                zArr[2] = false;
                zX2 = X(64);
                R(cVar8, zX2);
                size = this.f7517u0.size();
                i18 = 0;
                z17 = false;
                while (i18 < size) {
                    boolean[] zArr8 = zArr;
                    eVar = (e) this.f7517u0.get(i18);
                    eVar.R(cVar8, zX2);
                    int i414 = i18;
                    boolean z211 = zX2;
                    if (eVar.f7471h == -1) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    i18 = i414 + 1;
                    zArr = zArr8;
                    zX2 = z211;
                    z17 = z17;
                }
                zArr2 = zArr;
                z15 = z17;
            } else {
                zArr2 = zArr;
                R(cVar8, zX);
                while (i16 < i12) {
                    ((e) this.f7517u0.get(i16)).R(cVar8, zX);
                }
                z15 = false;
            }
            if (!z13) {
            }
            iMax = Math.max(this.f7464d0, r());
            z16 = z15;
            if (iMax > r()) {
                P(iMax);
                this.f7453U[0] = dVar;
                z16 = true;
                z14 = true;
            }
            iMax2 = Math.max(this.f7466e0, l());
            if (iMax2 > l()) {
                M(iMax2);
                r10 = 1;
                this.f7453U[1] = dVar;
                r17 = 1;
                z14 = true;
            } else {
                r10 = 1;
            }
            if (z14) {
                r17 = z16;
                if (this.f7453U[0] == dVar9) {
                    r17 = r17;
                    if (r() > i11) {
                        this.f7509I0 = r10;
                        this.f7453U[0] = dVar;
                        P(i11);
                        ?? r116 = r10;
                        z14 = r116 == true ? 1 : 0;
                        r17 = r116;
                    }
                }
                r17 = r17;
                r17 = r17;
                if (this.f7453U[r10] == dVar9) {
                    r17 = z16;
                    z11 = z14;
                    i17 = 8;
                    r18 = r17;
                } else {
                    r17 = z16;
                    z11 = z14;
                    i17 = 8;
                    r18 = r17;
                }
            } else {
                r17 = z16;
                z11 = z14;
                i17 = 8;
                r18 = r17;
            }
            if (i15 > i17) {
                r18 = 0;
            }
            i14 = i15;
            z10 = z13;
            dVar6 = dVar;
            r15 = r18;
        }
        z12 = z11;
        this.f7517u0 = arrayList23;
        if (z12) {
            d[] dVarArr10 = this.f7453U;
            dVarArr10[0] = dVar4;
            dVarArr10[1] = dVar3;
        }
        G(cVar8.f15100l);
    }

    public final boolean X(int i7) {
        return (this.f7508H0 & i7) == i7;
    }

    @Override // Q.e
    public final void o(StringBuilder sb2) {
        sb2.append(this.f7474j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f7455W);
        sb2.append(sb3.toString());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("  actualHeight:" + this.f7456X);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        Iterator it = this.f7517u0.iterator();
        while (it.hasNext()) {
            ((e) it.next()).o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
