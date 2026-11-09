package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.E;
import com.airbnb.lottie.PerformanceTracker$FrameListener;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements DrawingContent, BaseKeyframeAnimation$AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f20003A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f20004B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public com.airbnb.lottie.animation.a f20005C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f20006a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f20007b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f20008c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20009d = new com.airbnb.lottie.animation.a(1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f20014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f20015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f20016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f20017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f20018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f20019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y f20020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f20021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.camera.video.internal.c f20022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f20023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f20024s;
    public a t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f20025u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f20026v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f20027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20029y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.airbnb.lottie.animation.a f20030z;

    public a(y yVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f20010e = new com.airbnb.lottie.animation.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f20011f = new com.airbnb.lottie.animation.a(mode2);
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1, 0);
        this.f20012g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        com.airbnb.lottie.animation.a aVar2 = new com.airbnb.lottie.animation.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f20013h = aVar2;
        this.f20014i = new RectF();
        this.f20015j = new RectF();
        this.f20016k = new RectF();
        this.f20017l = new RectF();
        this.f20018m = new RectF();
        this.f20019n = new Matrix();
        this.f20026v = new ArrayList();
        this.f20028x = true;
        this.f20003A = 0.0f;
        this.f20020o = yVar;
        this.f20021p = eVar;
        if (eVar.f20070u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        com.airbnb.lottie.model.animatable.d dVar = eVar.f20059i;
        dVar.getClass();
        q qVar = new q(dVar);
        this.f20027w = qVar;
        qVar.b(this);
        List list = eVar.f20058h;
        if (list != null && !list.isEmpty()) {
            androidx.camera.video.internal.c cVar = new androidx.camera.video.internal.c(list);
            this.f20022q = cVar;
            Iterator it = ((ArrayList) cVar.f14621b).iterator();
            while (it.hasNext()) {
                ((com.airbnb.lottie.animation.keyframe.d) it.next()).a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.d dVar2 : (ArrayList) this.f20022q.f14623d) {
                a(dVar2);
                dVar2.a(this);
            }
        }
        e eVar2 = this.f20021p;
        if (eVar2.t.isEmpty()) {
            if (true != this.f20028x) {
                this.f20028x = true;
                this.f20020o.invalidateSelf();
                return;
            }
            return;
        }
        com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(eVar2.t);
        this.f20023r = hVar;
        hVar.f19790b = true;
        hVar.a(new p(this, 3));
        boolean z3 = ((Float) this.f20023r.e()).floatValue() == 1.0f;
        if (z3 != this.f20028x) {
            this.f20028x = z3;
            this.f20020o.invalidateSelf();
        }
        a(this.f20023r);
    }

    public final void a(com.airbnb.lottie.animation.keyframe.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f20026v.add(dVar);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void addValueCallback(Object obj, p243q1.c cVar) {
        this.f20027w.c(obj, cVar);
    }

    public final void b() {
        if (this.f20025u != null) {
            return;
        }
        if (this.t == null) {
            this.f20025u = Collections.EMPTY_LIST;
            return;
        }
        this.f20025u = new ArrayList();
        for (a aVar = this.t; aVar != null; aVar = aVar.t) {
            this.f20025u.add(aVar);
        }
    }

    public final void c(Canvas canvas) {
        RectF rectF = this.f20014i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f20013h);
    }

    public abstract void d(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar);

    /* JADX WARN: Code duplicated, block: B:100:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:110:0x0220  */
    /* JADX WARN: Code duplicated, block: B:112:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0239  */
    /* JADX WARN: Code duplicated, block: B:118:0x0268  */
    /* JADX WARN: Code duplicated, block: B:120:0x026d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0270  */
    /* JADX WARN: Code duplicated, block: B:124:0x0273  */
    /* JADX WARN: Code duplicated, block: B:126:0x027c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0282  */
    /* JADX WARN: Code duplicated, block: B:129:0x0284  */
    /* JADX WARN: Code duplicated, block: B:132:0x028b  */
    /* JADX WARN: Code duplicated, block: B:136:0x029b A[LOOP:2: B:130:0x0285->B:136:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:141:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:142:0x0307  */
    /* JADX WARN: Code duplicated, block: B:144:0x030d  */
    /* JADX WARN: Code duplicated, block: B:145:0x031b  */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:148:0x034c  */
    /* JADX WARN: Code duplicated, block: B:149:0x035d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0367  */
    /* JADX WARN: Code duplicated, block: B:152:0x0394  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0296 A[EDGE_INSN: B:169:0x0296->B:134:0x0296 BREAK  A[LOOP:2: B:130:0x0285->B:136:0x029b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:72:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:81:0x01af  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d3  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        androidx.camera.video.internal.c cVar;
        Path path;
        float f10;
        RectF rectF;
        RectF rectF2;
        Matrix matrix2;
        com.airbnb.lottie.animation.a aVar2;
        com.airbnb.lottie.animation.a aVar3;
        int i10;
        androidx.core.graphics.b bVar;
        Paint paint;
        int i11;
        List list;
        ArrayList arrayList;
        com.airbnb.lottie.animation.keyframe.d dVar;
        com.airbnb.lottie.animation.keyframe.d dVar2;
        int i12;
        int i13;
        Paint paint2;
        boolean z3;
        Path path2;
        int i14;
        Integer num;
        if (this.f20028x) {
            e eVar = this.f20021p;
            if (eVar.f20071v) {
                return;
            }
            b();
            Matrix matrix3 = this.f20007b;
            matrix3.reset();
            matrix3.set(matrix);
            for (int size = this.f20025u.size() - 1; size >= 0; size--) {
                matrix3.preConcat(((a) this.f20025u.get(size)).f20027w.e());
            }
            q qVar = this.f20027w;
            com.airbnb.lottie.animation.keyframe.d dVar3 = qVar.f19847p;
            int iIntValue = (int) ((((i7 / 255.0f) * ((dVar3 == null || (num = (Integer) dVar3.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            boolean z8 = this.f20024s != null;
            int i15 = eVar.f20074y;
            if (!z8 && !f() && i15 == 1) {
                matrix3.preConcat(qVar.e());
                d(canvas, matrix3, iIntValue, aVar);
                g();
                return;
            }
            RectF rectF3 = this.f20014i;
            getBounds(rectF3, matrix3, false);
            if (this.f20024s != null && eVar.f20070u != 3) {
                RectF rectF4 = this.f20017l;
                rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f20024s.getBounds(rectF4, matrix, true);
                if (!rectF3.intersect(rectF4)) {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix3.preConcat(qVar.e());
            RectF rectF5 = this.f20016k;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zF = f();
            Path path3 = this.f20006a;
            androidx.camera.video.internal.c cVar2 = this.f20022q;
            if (zF) {
                int size2 = ((List) cVar2.f14622c).size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        com.airbnb.lottie.model.content.e eVar2 = (com.airbnb.lottie.model.content.e) ((List) cVar2.f14622c).get(i16);
                        Path path4 = (Path) ((com.airbnb.lottie.animation.keyframe.d) ((ArrayList) cVar2.f14621b).get(i16)).e();
                        if (path4 == null) {
                            cVar = cVar2;
                        } else {
                            path3.set(path4);
                            path3.transform(matrix3);
                            int i17 = F.i(eVar2.f19945a);
                            cVar = cVar2;
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    if (i17 != 2) {
                                        if (i17 == 3) {
                                        }
                                        rectF = this.f20018m;
                                        path3.computeBounds(rectF, false);
                                        if (i16 == 0) {
                                            rectF5.set(rectF);
                                        } else {
                                            rectF5.set(Math.min(rectF5.left, rectF.left), Math.min(rectF5.top, rectF.top), Math.max(rectF5.right, rectF.right), Math.max(rectF5.bottom, rectF.bottom));
                                        }
                                        i16++;
                                        cVar2 = cVar;
                                        size2 = size2;
                                        path3 = path3;
                                    }
                                }
                            }
                            if (eVar2.f19948d) {
                            }
                            rectF = this.f20018m;
                            path3.computeBounds(rectF, false);
                            if (i16 == 0) {
                                rectF5.set(rectF);
                            } else {
                                rectF5.set(Math.min(rectF5.left, rectF.left), Math.min(rectF5.top, rectF.top), Math.max(rectF5.right, rectF.right), Math.max(rectF5.bottom, rectF.bottom));
                            }
                            i16++;
                            cVar2 = cVar;
                            size2 = size2;
                            path3 = path3;
                        }
                        i16++;
                        cVar2 = cVar;
                        size2 = size2;
                        path3 = path3;
                    } else {
                        cVar = cVar2;
                        path = path3;
                        if (rectF3.intersect(rectF5)) {
                            f10 = 0.0f;
                        } else {
                            f10 = 0.0f;
                            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                    rectF2 = this.f20015j;
                    rectF2.set(f10, f10, canvas.getWidth(), canvas.getHeight());
                    matrix2 = this.f20008c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF2);
                    }
                    if (!rectF3.intersect(rectF2)) {
                        rectF3.set(f10, f10, f10, f10);
                    }
                    if (rectF3.width() >= 1.0f && rectF3.height() >= 1.0f) {
                        aVar3 = this.f20009d;
                        aVar3.setAlpha(255);
                        i10 = F.i(i15);
                        if (i10 != 1) {
                            if (i10 != 2) {
                                bVar = androidx.core.graphics.b.SCREEN;
                            } else if (i10 != 3) {
                                bVar = androidx.core.graphics.b.OVERLAY;
                            } else if (i10 != 4) {
                                bVar = androidx.core.graphics.b.DARKEN;
                            } else if (i10 != 5) {
                                bVar = androidx.core.graphics.b.LIGHTEN;
                            } else if (i10 != 16) {
                                bVar = null;
                            } else {
                                bVar = androidx.core.graphics.b.PLUS;
                            }
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            bVar = androidx.core.graphics.b.MULTIPLY;
                        } else {
                            bVar = androidx.core.graphics.b.MODULATE;
                        }
                        androidx.core.graphics.f.a(aVar3, bVar);
                        Matrix matrix4 = com.airbnb.lottie.utils.i.f20269a;
                        canvas.saveLayer(rectF3, aVar3);
                        if (i15 != 2) {
                            c(canvas);
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                if (this.f20005C == null) {
                                    com.airbnb.lottie.animation.a aVar4 = new com.airbnb.lottie.animation.a();
                                    this.f20005C = aVar4;
                                    aVar4.setColor(-1);
                                }
                                canvas.drawRect(rectF3.left - 1.0f, rectF3.top - 1.0f, rectF3.right + 1.0f, rectF3.bottom + 1.0f, this.f20005C);
                            }
                            d(canvas, matrix3, iIntValue, aVar);
                            if (f()) {
                                paint = this.f20010e;
                                canvas.saveLayer(rectF3, paint);
                                if (Build.VERSION.SDK_INT < 28) {
                                    c(canvas);
                                }
                                i11 = 0;
                                while (i11 < ((List) cVar.f14622c).size()) {
                                    list = (List) cVar.f14622c;
                                    com.airbnb.lottie.model.content.e eVar3 = (com.airbnb.lottie.model.content.e) list.get(i11);
                                    arrayList = (ArrayList) cVar.f14621b;
                                    dVar = (com.airbnb.lottie.animation.keyframe.d) arrayList.get(i11);
                                    dVar2 = (com.airbnb.lottie.animation.keyframe.d) ((ArrayList) cVar.f14623d).get(i11);
                                    i12 = F.i(eVar3.f19945a);
                                    i13 = i11;
                                    paint2 = this.f20011f;
                                    z3 = eVar3.f19948d;
                                    if (i12 != 0) {
                                        path2 = path;
                                        if (z3) {
                                            Matrix matrix5 = com.airbnb.lottie.utils.i.f20269a;
                                            canvas.saveLayer(rectF3, aVar3);
                                            canvas.drawRect(rectF3, aVar3);
                                            path2.set((Path) dVar.e());
                                            path2.transform(matrix3);
                                            aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                            canvas.drawPath(path2, paint2);
                                            canvas.restore();
                                        } else {
                                            path2.set((Path) dVar.e());
                                            path2.transform(matrix3);
                                            aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                            canvas.drawPath(path2, aVar3);
                                        }
                                    } else if (i12 != 1) {
                                        path2 = path;
                                        if (i13 == 0) {
                                            aVar3.setColor(-16777216);
                                            aVar3.setAlpha(255);
                                            canvas.drawRect(rectF3, aVar3);
                                        }
                                        if (z3) {
                                            Matrix matrix6 = com.airbnb.lottie.utils.i.f20269a;
                                            canvas.saveLayer(rectF3, paint2);
                                            canvas.drawRect(rectF3, aVar3);
                                            paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                            path2.set((Path) dVar.e());
                                            path2.transform(matrix3);
                                            canvas.drawPath(path2, paint2);
                                            canvas.restore();
                                        } else {
                                            path2.set((Path) dVar.e());
                                            path2.transform(matrix3);
                                            canvas.drawPath(path2, paint2);
                                        }
                                    } else if (i12 != 2) {
                                        if (i12 != 3) {
                                            path2 = path;
                                        } else {
                                            if (arrayList.isEmpty()) {
                                                i14 = 0;
                                                while (true) {
                                                    if (i14 < list.size()) {
                                                        aVar3.setAlpha(255);
                                                        canvas.drawRect(rectF3, aVar3);
                                                        break;
                                                    } else if (((com.airbnb.lottie.model.content.e) list.get(i14)).f19945a != 4) {
                                                        break;
                                                    } else {
                                                        i14++;
                                                    }
                                                }
                                            }
                                            path2 = path;
                                        }
                                    } else if (z3) {
                                        Matrix matrix7 = com.airbnb.lottie.utils.i.f20269a;
                                        canvas.saveLayer(rectF3, paint);
                                        canvas.drawRect(rectF3, aVar3);
                                        paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                        path2 = path;
                                        path2.set((Path) dVar.e());
                                        path2.transform(matrix3);
                                        canvas.drawPath(path2, paint2);
                                        canvas.restore();
                                    } else {
                                        path2 = path;
                                        Matrix matrix8 = com.airbnb.lottie.utils.i.f20269a;
                                        canvas.saveLayer(rectF3, paint);
                                        path2.set((Path) dVar.e());
                                        path2.transform(matrix3);
                                        aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                        canvas.drawPath(path2, aVar3);
                                        canvas.restore();
                                    }
                                    i11 = i13 + 1;
                                    path = path2;
                                }
                                canvas.restore();
                            }
                            if (this.f20024s != null) {
                                canvas.saveLayer(rectF3, this.f20012g);
                                c(canvas);
                                this.f20024s.draw(canvas, matrix, i7, null);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        d(canvas, matrix3, iIntValue, aVar);
                        if (f()) {
                            paint = this.f20010e;
                            canvas.saveLayer(rectF3, paint);
                            if (Build.VERSION.SDK_INT < 28) {
                                c(canvas);
                            }
                            i11 = 0;
                            while (i11 < ((List) cVar.f14622c).size()) {
                                list = (List) cVar.f14622c;
                                com.airbnb.lottie.model.content.e eVar4 = (com.airbnb.lottie.model.content.e) list.get(i11);
                                arrayList = (ArrayList) cVar.f14621b;
                                dVar = (com.airbnb.lottie.animation.keyframe.d) arrayList.get(i11);
                                dVar2 = (com.airbnb.lottie.animation.keyframe.d) ((ArrayList) cVar.f14623d).get(i11);
                                i12 = F.i(eVar4.f19945a);
                                i13 = i11;
                                paint2 = this.f20011f;
                                z3 = eVar4.f19948d;
                                if (i12 != 0) {
                                    path2 = path;
                                    if (z3) {
                                        Matrix matrix9 = com.airbnb.lottie.utils.i.f20269a;
                                        canvas.saveLayer(rectF3, aVar3);
                                        canvas.drawRect(rectF3, aVar3);
                                        path2.set((Path) dVar.e());
                                        path2.transform(matrix3);
                                        aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                        canvas.drawPath(path2, paint2);
                                        canvas.restore();
                                    } else {
                                        path2.set((Path) dVar.e());
                                        path2.transform(matrix3);
                                        aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                        canvas.drawPath(path2, aVar3);
                                    }
                                } else if (i12 != 1) {
                                    path2 = path;
                                    if (i13 == 0) {
                                        aVar3.setColor(-16777216);
                                        aVar3.setAlpha(255);
                                        canvas.drawRect(rectF3, aVar3);
                                    }
                                    if (z3) {
                                        Matrix matrix10 = com.airbnb.lottie.utils.i.f20269a;
                                        canvas.saveLayer(rectF3, paint2);
                                        canvas.drawRect(rectF3, aVar3);
                                        paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                        path2.set((Path) dVar.e());
                                        path2.transform(matrix3);
                                        canvas.drawPath(path2, paint2);
                                        canvas.restore();
                                    } else {
                                        path2.set((Path) dVar.e());
                                        path2.transform(matrix3);
                                        canvas.drawPath(path2, paint2);
                                    }
                                } else if (i12 != 2) {
                                    if (i12 != 3) {
                                        path2 = path;
                                    } else {
                                        if (arrayList.isEmpty()) {
                                            i14 = 0;
                                            while (true) {
                                                if (i14 < list.size()) {
                                                    aVar3.setAlpha(255);
                                                    canvas.drawRect(rectF3, aVar3);
                                                    break;
                                                } else {
                                                    if (((com.airbnb.lottie.model.content.e) list.get(i14)).f19945a != 4) {
                                                        break;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                            }
                                        }
                                        path2 = path;
                                    }
                                } else if (z3) {
                                    Matrix matrix11 = com.airbnb.lottie.utils.i.f20269a;
                                    canvas.saveLayer(rectF3, paint);
                                    canvas.drawRect(rectF3, aVar3);
                                    paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                    path2 = path;
                                    path2.set((Path) dVar.e());
                                    path2.transform(matrix3);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2 = path;
                                    Matrix matrix12 = com.airbnb.lottie.utils.i.f20269a;
                                    canvas.saveLayer(rectF3, paint);
                                    path2.set((Path) dVar.e());
                                    path2.transform(matrix3);
                                    aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, aVar3);
                                    canvas.restore();
                                }
                                i11 = i13 + 1;
                                path = path2;
                            }
                            canvas.restore();
                        }
                        if (this.f20024s != null) {
                            canvas.saveLayer(rectF3, this.f20012g);
                            c(canvas);
                            this.f20024s.draw(canvas, matrix, i7, null);
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    if (this.f20029y && (aVar2 = this.f20030z) != null) {
                        aVar2.setStyle(Paint.Style.STROKE);
                        this.f20030z.setColor(-251901);
                        this.f20030z.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF3, this.f20030z);
                        this.f20030z.setStyle(Paint.Style.FILL);
                        this.f20030z.setColor(1357638635);
                        canvas.drawRect(rectF3, this.f20030z);
                    }
                    g();
                }
            }
            cVar = cVar2;
            path = path3;
            f10 = 0.0f;
            rectF2 = this.f20015j;
            rectF2.set(f10, f10, canvas.getWidth(), canvas.getHeight());
            matrix2 = this.f20008c;
            canvas.getMatrix(matrix2);
            if (!matrix2.isIdentity()) {
                matrix2.invert(matrix2);
                matrix2.mapRect(rectF2);
            }
            if (!rectF3.intersect(rectF2)) {
                rectF3.set(f10, f10, f10, f10);
            }
            if (rectF3.width() >= 1.0f) {
                aVar3 = this.f20009d;
                aVar3.setAlpha(255);
                i10 = F.i(i15);
                if (i10 != 1) {
                    if (i10 != 2) {
                        bVar = androidx.core.graphics.b.SCREEN;
                    } else if (i10 != 3) {
                        bVar = androidx.core.graphics.b.OVERLAY;
                    } else if (i10 != 4) {
                        bVar = androidx.core.graphics.b.DARKEN;
                    } else if (i10 != 5) {
                        bVar = androidx.core.graphics.b.LIGHTEN;
                    } else if (i10 != 16) {
                        bVar = null;
                    } else {
                        bVar = androidx.core.graphics.b.PLUS;
                    }
                } else if (Build.VERSION.SDK_INT >= 29) {
                    bVar = androidx.core.graphics.b.MULTIPLY;
                } else {
                    bVar = androidx.core.graphics.b.MODULATE;
                }
                androidx.core.graphics.f.a(aVar3, bVar);
                Matrix matrix13 = com.airbnb.lottie.utils.i.f20269a;
                canvas.saveLayer(rectF3, aVar3);
                if (i15 != 2) {
                    c(canvas);
                } else {
                    if (Build.VERSION.SDK_INT < 29) {
                        if (this.f20005C == null) {
                            com.airbnb.lottie.animation.a aVar5 = new com.airbnb.lottie.animation.a();
                            this.f20005C = aVar5;
                            aVar5.setColor(-1);
                        }
                        canvas.drawRect(rectF3.left - 1.0f, rectF3.top - 1.0f, rectF3.right + 1.0f, rectF3.bottom + 1.0f, this.f20005C);
                    }
                    d(canvas, matrix3, iIntValue, aVar);
                    if (f()) {
                        paint = this.f20010e;
                        canvas.saveLayer(rectF3, paint);
                        if (Build.VERSION.SDK_INT < 28) {
                            c(canvas);
                        }
                        i11 = 0;
                        while (i11 < ((List) cVar.f14622c).size()) {
                            list = (List) cVar.f14622c;
                            com.airbnb.lottie.model.content.e eVar5 = (com.airbnb.lottie.model.content.e) list.get(i11);
                            arrayList = (ArrayList) cVar.f14621b;
                            dVar = (com.airbnb.lottie.animation.keyframe.d) arrayList.get(i11);
                            dVar2 = (com.airbnb.lottie.animation.keyframe.d) ((ArrayList) cVar.f14623d).get(i11);
                            i12 = F.i(eVar5.f19945a);
                            i13 = i11;
                            paint2 = this.f20011f;
                            z3 = eVar5.f19948d;
                            if (i12 != 0) {
                                path2 = path;
                                if (z3) {
                                    Matrix matrix14 = com.airbnb.lottie.utils.i.f20269a;
                                    canvas.saveLayer(rectF3, aVar3);
                                    canvas.drawRect(rectF3, aVar3);
                                    path2.set((Path) dVar.e());
                                    path2.transform(matrix3);
                                    aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) dVar.e());
                                    path2.transform(matrix3);
                                    aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, aVar3);
                                }
                            } else if (i12 != 1) {
                                path2 = path;
                                if (i13 == 0) {
                                    aVar3.setColor(-16777216);
                                    aVar3.setAlpha(255);
                                    canvas.drawRect(rectF3, aVar3);
                                }
                                if (z3) {
                                    Matrix matrix15 = com.airbnb.lottie.utils.i.f20269a;
                                    canvas.saveLayer(rectF3, paint2);
                                    canvas.drawRect(rectF3, aVar3);
                                    paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                    path2.set((Path) dVar.e());
                                    path2.transform(matrix3);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) dVar.e());
                                    path2.transform(matrix3);
                                    canvas.drawPath(path2, paint2);
                                }
                            } else if (i12 != 2) {
                                if (i12 != 3) {
                                    path2 = path;
                                } else {
                                    if (arrayList.isEmpty()) {
                                        i14 = 0;
                                        while (true) {
                                            if (i14 < list.size()) {
                                                aVar3.setAlpha(255);
                                                canvas.drawRect(rectF3, aVar3);
                                                break;
                                            } else {
                                                if (((com.airbnb.lottie.model.content.e) list.get(i14)).f19945a != 4) {
                                                    break;
                                                    break;
                                                }
                                                i14++;
                                            }
                                        }
                                    }
                                    path2 = path;
                                }
                            } else if (z3) {
                                Matrix matrix16 = com.airbnb.lottie.utils.i.f20269a;
                                canvas.saveLayer(rectF3, paint);
                                canvas.drawRect(rectF3, aVar3);
                                paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                path2 = path;
                                path2.set((Path) dVar.e());
                                path2.transform(matrix3);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2 = path;
                                Matrix matrix17 = com.airbnb.lottie.utils.i.f20269a;
                                canvas.saveLayer(rectF3, paint);
                                path2.set((Path) dVar.e());
                                path2.transform(matrix3);
                                aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, aVar3);
                                canvas.restore();
                            }
                            i11 = i13 + 1;
                            path = path2;
                        }
                        canvas.restore();
                    }
                    if (this.f20024s != null) {
                        canvas.saveLayer(rectF3, this.f20012g);
                        c(canvas);
                        this.f20024s.draw(canvas, matrix, i7, null);
                        canvas.restore();
                    }
                    canvas.restore();
                }
                d(canvas, matrix3, iIntValue, aVar);
                if (f()) {
                    paint = this.f20010e;
                    canvas.saveLayer(rectF3, paint);
                    if (Build.VERSION.SDK_INT < 28) {
                        c(canvas);
                    }
                    i11 = 0;
                    while (i11 < ((List) cVar.f14622c).size()) {
                        list = (List) cVar.f14622c;
                        com.airbnb.lottie.model.content.e eVar6 = (com.airbnb.lottie.model.content.e) list.get(i11);
                        arrayList = (ArrayList) cVar.f14621b;
                        dVar = (com.airbnb.lottie.animation.keyframe.d) arrayList.get(i11);
                        dVar2 = (com.airbnb.lottie.animation.keyframe.d) ((ArrayList) cVar.f14623d).get(i11);
                        i12 = F.i(eVar6.f19945a);
                        i13 = i11;
                        paint2 = this.f20011f;
                        z3 = eVar6.f19948d;
                        if (i12 != 0) {
                            path2 = path;
                            if (z3) {
                                Matrix matrix18 = com.airbnb.lottie.utils.i.f20269a;
                                canvas.saveLayer(rectF3, aVar3);
                                canvas.drawRect(rectF3, aVar3);
                                path2.set((Path) dVar.e());
                                path2.transform(matrix3);
                                aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) dVar.e());
                                path2.transform(matrix3);
                                aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, aVar3);
                            }
                        } else if (i12 != 1) {
                            path2 = path;
                            if (i13 == 0) {
                                aVar3.setColor(-16777216);
                                aVar3.setAlpha(255);
                                canvas.drawRect(rectF3, aVar3);
                            }
                            if (z3) {
                                Matrix matrix19 = com.airbnb.lottie.utils.i.f20269a;
                                canvas.saveLayer(rectF3, paint2);
                                canvas.drawRect(rectF3, aVar3);
                                paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                                path2.set((Path) dVar.e());
                                path2.transform(matrix3);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) dVar.e());
                                path2.transform(matrix3);
                                canvas.drawPath(path2, paint2);
                            }
                        } else if (i12 != 2) {
                            if (i12 != 3) {
                                path2 = path;
                            } else {
                                if (arrayList.isEmpty()) {
                                    i14 = 0;
                                    while (true) {
                                        if (i14 < list.size()) {
                                            aVar3.setAlpha(255);
                                            canvas.drawRect(rectF3, aVar3);
                                            break;
                                        } else {
                                            if (((com.airbnb.lottie.model.content.e) list.get(i14)).f19945a != 4) {
                                                break;
                                                break;
                                            }
                                            i14++;
                                        }
                                    }
                                }
                                path2 = path;
                            }
                        } else if (z3) {
                            Matrix matrix110 = com.airbnb.lottie.utils.i.f20269a;
                            canvas.saveLayer(rectF3, paint);
                            canvas.drawRect(rectF3, aVar3);
                            paint2.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                            path2 = path;
                            path2.set((Path) dVar.e());
                            path2.transform(matrix3);
                            canvas.drawPath(path2, paint2);
                            canvas.restore();
                        } else {
                            path2 = path;
                            Matrix matrix111 = com.airbnb.lottie.utils.i.f20269a;
                            canvas.saveLayer(rectF3, paint);
                            path2.set((Path) dVar.e());
                            path2.transform(matrix3);
                            aVar3.setAlpha((int) (((Integer) dVar2.e()).intValue() * 2.55f));
                            canvas.drawPath(path2, aVar3);
                            canvas.restore();
                        }
                        i11 = i13 + 1;
                        path = path2;
                    }
                    canvas.restore();
                }
                if (this.f20024s != null) {
                    canvas.saveLayer(rectF3, this.f20012g);
                    c(canvas);
                    this.f20024s.draw(canvas, matrix, i7, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f20029y) {
                aVar2.setStyle(Paint.Style.STROKE);
                this.f20030z.setColor(-251901);
                this.f20030z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF3, this.f20030z);
                this.f20030z.setStyle(Paint.Style.FILL);
                this.f20030z.setColor(1357638635);
                canvas.drawRect(rectF3, this.f20030z);
            }
            g();
        }
    }

    public p1.c e() {
        return this.f20021p.f20072w;
    }

    public final boolean f() {
        androidx.camera.video.internal.c cVar = this.f20022q;
        return (cVar == null || ((ArrayList) cVar.f14621b).isEmpty()) ? false : true;
    }

    public final void g() {
        E e10 = this.f20020o.f20304a.f19874a;
        String str = this.f20021p.f20053c;
        if (e10.f19564a) {
            HashMap map = e10.f19566c;
            com.airbnb.lottie.utils.f fVar = (com.airbnb.lottie.utils.f) map.get(str);
            if (fVar == null) {
                fVar = new com.airbnb.lottie.utils.f();
                map.put(str, fVar);
            }
            int i7 = fVar.f20240a + 1;
            fVar.f20240a = i7;
            if (i7 == Integer.MAX_VALUE) {
                fVar.f20240a = i7 / 2;
            }
            if (str.equals("__container")) {
                M.g gVar = e10.f19565b;
                gVar.getClass();
                M.b bVar = new M.b(gVar);
                while (bVar.hasNext()) {
                    ((PerformanceTracker$FrameListener) bVar.next()).onFrameRendered(0.0f);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        this.f20014i.set(0.0f, 0.0f, 0.0f, 0.0f);
        b();
        Matrix matrix2 = this.f20019n;
        matrix2.set(matrix);
        if (z3) {
            List list = this.f20025u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((a) this.f20025u.get(size)).f20027w.e());
                }
            } else {
                a aVar = this.t;
                if (aVar != null) {
                    matrix2.preConcat(aVar.f20027w.e());
                }
            }
        }
        matrix2.preConcat(this.f20027w.e());
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f20021p.f20053c;
    }

    public final void h(com.airbnb.lottie.animation.keyframe.d dVar) {
        this.f20026v.remove(dVar);
    }

    public void j(boolean z3) {
        if (z3 && this.f20030z == null) {
            this.f20030z = new com.airbnb.lottie.animation.a();
        }
        this.f20029y = z3;
    }

    public void k(float f10) {
        q qVar = this.f20027w;
        com.airbnb.lottie.animation.keyframe.d dVar = qVar.f19847p;
        if (dVar != null) {
            dVar.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.d dVar2 = qVar.f19852v;
        if (dVar2 != null) {
            dVar2.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.d dVar3 = qVar.f19853w;
        if (dVar3 != null) {
            dVar3.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.d dVar4 = qVar.f19843l;
        if (dVar4 != null) {
            dVar4.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.d dVar5 = qVar.f19844m;
        if (dVar5 != null) {
            dVar5.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.d dVar6 = qVar.f19845n;
        if (dVar6 != null) {
            dVar6.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.d dVar7 = qVar.f19846o;
        if (dVar7 != null) {
            dVar7.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.h hVar = qVar.f19848q;
        if (hVar != null) {
            hVar.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.h hVar2 = qVar.f19849r;
        if (hVar2 != null) {
            hVar2.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.h hVar3 = qVar.f19850s;
        if (hVar3 != null) {
            hVar3.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.h hVar4 = qVar.t;
        if (hVar4 != null) {
            hVar4.i(f10);
        }
        com.airbnb.lottie.animation.keyframe.h hVar5 = qVar.f19851u;
        if (hVar5 != null) {
            hVar5.i(f10);
        }
        androidx.camera.video.internal.c cVar = this.f20022q;
        int i7 = 0;
        if (cVar != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) cVar.f14621b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((com.airbnb.lottie.animation.keyframe.d) arrayList.get(i10)).i(f10);
                i10++;
            }
        }
        com.airbnb.lottie.animation.keyframe.h hVar6 = this.f20023r;
        if (hVar6 != null) {
            hVar6.i(f10);
        }
        a aVar = this.f20024s;
        if (aVar != null) {
            aVar.k(f10);
        }
        while (true) {
            ArrayList arrayList2 = this.f20026v;
            if (i7 >= arrayList2.size()) {
                return;
            }
            ((com.airbnb.lottie.animation.keyframe.d) arrayList2.get(i7)).i(f10);
            i7++;
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f20020o.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        a aVar = this.f20024s;
        e eVar3 = this.f20021p;
        if (aVar != null) {
            String str = aVar.f20021p.f20053c;
            eVar2.getClass();
            p212o1.e eVar4 = new p212o1.e(eVar2);
            eVar4.f40009a.add(str);
            if (eVar.a(i7, this.f20024s.f20021p.f20053c)) {
                a aVar2 = this.f20024s;
                p212o1.e eVar5 = new p212o1.e(eVar4);
                eVar5.f40010b = aVar2;
                list.add(eVar5);
            }
            if (eVar.c(i7, this.f20024s.f20021p.f20053c) && eVar.d(i7, eVar3.f20053c)) {
                this.f20024s.i(eVar, eVar.b(i7, this.f20024s.f20021p.f20053c) + i7, list, eVar4);
            }
        }
        if (eVar.c(i7, eVar3.f20053c)) {
            String str2 = eVar3.f20053c;
            if (!"__container".equals(str2)) {
                eVar2.getClass();
                p212o1.e eVar6 = new p212o1.e(eVar2);
                eVar6.f40009a.add(str2);
                if (eVar.a(i7, str2)) {
                    p212o1.e eVar7 = new p212o1.e(eVar6);
                    eVar7.f40010b = this;
                    list.add(eVar7);
                }
                eVar2 = eVar6;
            }
            if (eVar.d(i7, str2)) {
                i(eVar, eVar.b(i7, str2) + i7, list, eVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
    }

    public void i(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
    }
}
