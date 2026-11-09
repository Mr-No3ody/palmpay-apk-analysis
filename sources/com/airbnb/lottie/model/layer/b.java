package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.k;
import com.airbnb.lottie.y;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public com.airbnb.lottie.animation.keyframe.d f20031D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f20032E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RectF f20033F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RectF f20034G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RectF f20035H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final com.airbnb.lottie.utils.h f20036I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C4.a f20037J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f20038K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f20039L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.g f20040M;

    public b(y yVar, e eVar, List list, k kVar) {
        a aVar;
        a bVar;
        String str;
        super(yVar, eVar);
        this.f20032E = new ArrayList();
        this.f20033F = new RectF();
        this.f20034G = new RectF();
        this.f20035H = new RectF();
        this.f20036I = new com.airbnb.lottie.utils.h();
        this.f20037J = new C4.a(8);
        this.f20039L = true;
        com.airbnb.lottie.model.animatable.b bVar2 = eVar.f20069s;
        if (bVar2 != null) {
            com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = bVar2.createAnimation();
            this.f20031D = hVarCreateAnimation;
            a(hVarCreateAnimation);
            this.f20031D.a(this);
        } else {
            this.f20031D = null;
        }
        M.j jVar = new M.j(kVar.f19883j.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i7 = 0; i7 < jVar.g(); i7++) {
                    a aVar3 = (a) jVar.b(jVar.d(i7));
                    if (aVar3 != null && (aVar = (a) jVar.b(aVar3.f20021p.f20056f)) != null) {
                        aVar3.t = aVar;
                    }
                }
                E2.a aVar4 = this.f20021p.f20073x;
                if (aVar4 != null) {
                    this.f20040M = new com.airbnb.lottie.animation.keyframe.g(this, this, aVar4);
                    return;
                }
                return;
            }
            e eVar2 = (e) list.get(size);
            int i10 = F.i(eVar2.f20055e);
            if (i10 == 0) {
                bVar = new b(yVar, eVar2, (List) kVar.f19876c.get(eVar2.f20057g), kVar);
            } else if (i10 == 1) {
                bVar = new h(yVar, eVar2);
            } else if (i10 == 2) {
                bVar = new c(yVar, eVar2);
            } else if (i10 == 3) {
                bVar = new f(yVar, eVar2);
            } else if (i10 == 4) {
                bVar = new g(yVar, eVar2, this, kVar);
            } else if (i10 != 5) {
                switch (eVar2.f20055e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = p381za.c.UNKNOWN_PROCESS_NAME;
                        break;
                    default:
                        str = BuildConfig.TRAVIS;
                        break;
                }
                com.airbnb.lottie.utils.c.b("Unknown layer type ".concat(str));
                bVar = null;
            } else {
                bVar = new j(yVar, eVar2);
            }
            if (bVar != null) {
                jVar.e(bVar.f20021p.f20054d, bVar);
                if (aVar2 != null) {
                    aVar2.f20024s = bVar;
                    aVar2 = null;
                } else {
                    this.f20032E.add(0, bVar);
                    int i11 = F.i(eVar2.f20070u);
                    if (i11 == 1 || i11 == 2) {
                        aVar2 = bVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        super.addValueCallback(obj, cVar);
        if (obj == LottieProperty.f19596C) {
            if (cVar == null) {
                com.airbnb.lottie.animation.keyframe.d dVar = this.f20031D;
                if (dVar != null) {
                    dVar.j(null);
                    return;
                }
                return;
            }
            r rVar = new r(null, cVar);
            this.f20031D = rVar;
            rVar.a(this);
            a(this.f20031D);
            return;
        }
        com.airbnb.lottie.animation.keyframe.g gVar = this.f20040M;
        if (obj == 5 && gVar != null) {
            gVar.f19801c.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19598E && gVar != null) {
            gVar.b(cVar);
            return;
        }
        if (obj == LottieProperty.f19599F && gVar != null) {
            gVar.f19803e.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19600G && gVar != null) {
            gVar.f19804f.j(cVar);
        } else {
            if (obj != LottieProperty.f19601H || gVar == null) {
                return;
            }
            gVar.f19805g.j(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void d(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        Canvas canvasE;
        com.airbnb.lottie.animation.keyframe.g gVar = this.f20040M;
        boolean z3 = false;
        boolean z8 = (aVar == null && gVar == null) ? false : true;
        y yVar = this.f20020o;
        boolean z10 = yVar.f20301X;
        ArrayList<a> arrayList = this.f20032E;
        if ((z10 && arrayList.size() > 1 && i7 != 255) || (z8 && yVar.f20302Y)) {
            z3 = true;
        }
        int i10 = z3 ? 255 : i7;
        if (gVar != null) {
            aVar = gVar.a(matrix, i10);
        }
        boolean z11 = this.f20039L;
        RectF rectF = this.f20034G;
        e eVar = this.f20021p;
        if (z11 || !"__container".equals(eVar.f20053c)) {
            rectF.set(0.0f, 0.0f, eVar.f20065o, eVar.f20066p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (a aVar2 : arrayList) {
                RectF rectF2 = this.f20035H;
                aVar2.getBounds(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        com.airbnb.lottie.utils.h hVar = this.f20036I;
        if (z3) {
            C4.a aVar3 = this.f20037J;
            aVar3.f1156c = null;
            aVar3.f1155b = i7;
            if (aVar != null) {
                if (Color.alpha(aVar.f20219d) > 0) {
                    aVar3.f1156c = aVar;
                } else {
                    aVar3.f1156c = null;
                }
                aVar = null;
            }
            canvasE = hVar.e(canvas, rectF, aVar3);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).draw(canvasE, matrix, i10, aVar);
            }
        }
        if (z3) {
            hVar.c();
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        super.getBounds(rectF, matrix, z3);
        ArrayList arrayList = this.f20032E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f20033F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a) arrayList.get(size)).getBounds(rectF2, this.f20019n, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void i(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f20032E;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).resolveKeyPath(eVar, i7, list, eVar2);
            i10++;
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void j(boolean z3) {
        super.j(z3);
        Iterator it = this.f20032E.iterator();
        while (it.hasNext()) {
            ((a) it.next()).j(z3);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void k(float f10) {
        this.f20038K = f10;
        super.k(f10);
        com.airbnb.lottie.animation.keyframe.d dVar = this.f20031D;
        e eVar = this.f20021p;
        if (dVar != null) {
            k kVar = this.f20020o.f20304a;
            f10 = ((((Float) dVar.e()).floatValue() * eVar.f20052b.f19887n) - eVar.f20052b.f19885l) / ((kVar.f19886m - kVar.f19885l) + 0.01f);
        }
        if (this.f20031D == null) {
            k kVar2 = eVar.f20052b;
            f10 -= eVar.f20064n / (kVar2.f19886m - kVar2.f19885l);
        }
        if (eVar.f20063m != 0.0f && !"__container".equals(eVar.f20053c)) {
            f10 /= eVar.f20063m;
        }
        ArrayList arrayList = this.f20032E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).k(f10);
        }
    }
}
