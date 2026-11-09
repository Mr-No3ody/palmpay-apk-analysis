package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements BaseKeyframeAnimation$AnimationListener, KeyPathElementContent, DrawingContent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f19643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f19644f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f19646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f19647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f19649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f19650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f19652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.airbnb.lottie.animation.keyframe.d f19653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19654p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f19639a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f19640b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f19641c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f19642d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f19645g = new ArrayList();

    public b(y yVar, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f10, com.airbnb.lottie.model.animatable.a aVar2, com.airbnb.lottie.model.animatable.b bVar, ArrayList arrayList, com.airbnb.lottie.model.animatable.b bVar2) {
        com.airbnb.lottie.animation.a aVar3 = new com.airbnb.lottie.animation.a(1, 0);
        this.f19647i = aVar3;
        this.f19654p = 0.0f;
        this.f19643e = yVar;
        this.f19644f = aVar;
        aVar3.setStyle(Paint.Style.STROKE);
        aVar3.setStrokeCap(cap);
        aVar3.setStrokeJoin(join);
        aVar3.setStrokeMiter(f10);
        this.f19649k = (com.airbnb.lottie.animation.keyframe.e) aVar2.createAnimation();
        this.f19648j = bVar.createAnimation();
        if (bVar2 == null) {
            this.f19651m = null;
        } else {
            this.f19651m = bVar2.createAnimation();
        }
        this.f19650l = new ArrayList(arrayList.size());
        this.f19646h = new float[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.f19650l.add(((com.airbnb.lottie.model.animatable.b) arrayList.get(i7)).createAnimation());
        }
        aVar.a(this.f19649k);
        aVar.a(this.f19648j);
        for (int i10 = 0; i10 < this.f19650l.size(); i10++) {
            aVar.a((com.airbnb.lottie.animation.keyframe.d) this.f19650l.get(i10));
        }
        com.airbnb.lottie.animation.keyframe.h hVar = this.f19651m;
        if (hVar != null) {
            aVar.a(hVar);
        }
        this.f19649k.a(this);
        this.f19648j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((com.airbnb.lottie.animation.keyframe.d) this.f19650l.get(i11)).a(this);
        }
        com.airbnb.lottie.animation.keyframe.h hVar2 = this.f19651m;
        if (hVar2 != null) {
            hVar2.a(this);
        }
        if (aVar.e() != null) {
            com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = ((com.airbnb.lottie.model.animatable.b) aVar.e().f41176b).createAnimation();
            this.f19653o = hVarCreateAnimation;
            hVarCreateAnimation.a(this);
            aVar.a(this.f19653o);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void addValueCallback(Object obj, p243q1.c cVar) {
        PointF pointF = LottieProperty.f19608a;
        if (obj == 4) {
            this.f19649k.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19624q) {
            this.f19648j.j(cVar);
            return;
        }
        ColorFilter colorFilter = LottieProperty.f19602I;
        com.airbnb.lottie.model.layer.a aVar = this.f19644f;
        if (obj == colorFilter) {
            r rVar = this.f19652n;
            if (rVar != null) {
                aVar.h(rVar);
            }
            if (cVar == null) {
                this.f19652n = null;
                return;
            }
            r rVar2 = new r(null, cVar);
            this.f19652n = rVar2;
            rVar2.a(this);
            aVar.a(this.f19652n);
            return;
        }
        if (obj == LottieProperty.f19612e) {
            com.airbnb.lottie.animation.keyframe.d dVar = this.f19653o;
            if (dVar != null) {
                dVar.j(cVar);
                return;
            }
            r rVar3 = new r(null, cVar);
            this.f19653o = rVar3;
            rVar3.a(this);
            aVar.a(this.f19653o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01f2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        int i10;
        float f10;
        MaskFilter maskFilter;
        float[] fArr;
        b bVar = this;
        float[] fArr2 = (float[]) com.airbnb.lottie.utils.i.f20273e.get();
        boolean z3 = false;
        fArr2[0] = 0.0f;
        int i11 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f11 = 100.0f;
        float fIntValue = ((Integer) bVar.f19649k.e()).intValue() / 100.0f;
        int iC = com.airbnb.lottie.utils.g.c((int) (i7 * fIntValue));
        com.airbnb.lottie.animation.a aVar2 = bVar.f19647i;
        aVar2.setAlpha(iC);
        aVar2.setStrokeWidth(bVar.f19648j.l());
        if (aVar2.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = bVar.f19650l;
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = bVar.f19646h;
                if (i12 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((com.airbnb.lottie.animation.keyframe.d) arrayList.get(i12)).e()).floatValue();
                fArr[i12] = fFloatValue;
                if (i12 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i12] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i12] = 0.1f;
                }
                i12++;
            }
            com.airbnb.lottie.animation.keyframe.h hVar = bVar.f19651m;
            aVar2.setPathEffect(new DashPathEffect(fArr, hVar == null ? 0.0f : ((Float) hVar.e()).floatValue()));
        }
        r rVar = bVar.f19652n;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        com.airbnb.lottie.animation.keyframe.d dVar = bVar.f19653o;
        if (dVar != null) {
            float fFloatValue2 = ((Float) dVar.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (fFloatValue2 != bVar.f19654p) {
                com.airbnb.lottie.model.layer.a aVar3 = bVar.f19644f;
                if (aVar3.f20003A == fFloatValue2) {
                    maskFilter = aVar3.f20004B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar3.f20004B = blurMaskFilter;
                    aVar3.f20003A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                aVar2.setMaskFilter(maskFilter);
            }
            bVar.f19654p = fFloatValue2;
        }
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), aVar2);
        }
        canvas.save();
        canvas.concat(matrix);
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = bVar.f19645g;
            if (i13 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            a aVar4 = (a) arrayList2.get(i13);
            o oVar = aVar4.f19638b;
            Path path = bVar.f19640b;
            ArrayList arrayList3 = aVar4.f19637a;
            if (oVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i11; size2 >= 0; size2--) {
                    path.addPath(((PathContent) arrayList3.get(size2)).getPath());
                }
                o oVar2 = aVar4.f19638b;
                float fFloatValue3 = ((Float) oVar2.f19780e.e()).floatValue() / f11;
                float fFloatValue4 = ((Float) oVar2.f19781f.e()).floatValue() / f11;
                float fFloatValue5 = ((Float) oVar2.f19782g.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = bVar.f19639a;
                    pathMeasure.setPath(path, z3);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f12 = fFloatValue5 * length;
                    float f13 = (fFloatValue3 * length) + f12;
                    float fMin = Math.min((fFloatValue4 * length) + f12, (f13 + length) - 1.0f);
                    int size3 = arrayList3.size() - i11;
                    float f14 = 0.0f;
                    while (size3 >= 0) {
                        int i14 = i11;
                        Path path2 = bVar.f19641c;
                        path2.set(((PathContent) arrayList3.get(size3)).getPath());
                        pathMeasure.setPath(path2, z3);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f15 = fMin - length;
                            if (f15 >= f14 + length2 || f14 >= f15) {
                                f10 = f14 + length2;
                                if (f10 < f13 && f14 <= fMin) {
                                    if (f10 > fMin || f13 >= f14) {
                                        com.airbnb.lottie.utils.i.a(path2, f13 < f14 ? 0.0f : (f13 - f14) / length2, fMin > f10 ? 1.0f : (fMin - f14) / length2, 0.0f);
                                        canvas.drawPath(path2, aVar2);
                                    } else {
                                        canvas.drawPath(path2, aVar2);
                                    }
                                }
                            } else {
                                com.airbnb.lottie.utils.i.a(path2, f13 > length ? (f13 - length) / length2 : 0.0f, Math.min(f15 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, aVar2);
                            }
                        } else {
                            f10 = f14 + length2;
                            if (f10 < f13) {
                            }
                        }
                        f14 += length2;
                        size3--;
                        bVar = this;
                        i11 = i14;
                        z3 = false;
                    }
                } else {
                    canvas.drawPath(path, aVar2);
                }
                i10 = i11;
            } else {
                i10 = i11;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((PathContent) arrayList3.get(size4)).getPath());
                }
                canvas.drawPath(path, aVar2);
            }
            i13++;
            bVar = this;
            i11 = i10;
            z3 = false;
            f11 = 100.0f;
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f19640b;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f19645g;
            if (i7 >= arrayList.size()) {
                RectF rectF2 = this.f19642d;
                path.computeBounds(rectF2, false);
                float fL = this.f19648j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i7);
            for (int i10 = 0; i10 < aVar.f19637a.size(); i10++) {
                path.addPath(((PathContent) aVar.f19637a.get(i10)).getPath(), matrix);
            }
            i7++;
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19643e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:39:0x0060 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        ArrayList arrayList;
        a aVar = null;
        o oVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = (Content) list.get(size);
            if (content instanceof o) {
                o oVar2 = (o) content;
                if (oVar2.f19779d == 2) {
                    oVar = oVar2;
                }
            }
        }
        if (oVar != null) {
            oVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f19645g;
            if (size2 < 0) {
                break;
            }
            Content content2 = (Content) list2.get(size2);
            if (content2 instanceof o) {
                o oVar3 = (o) content2;
                if (oVar3.f19779d == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(oVar3);
                    oVar3.a(this);
                    aVar = aVar2;
                } else if (!(content2 instanceof PathContent)) {
                    if (aVar == null) {
                        aVar = new a(oVar);
                    }
                    aVar.f19637a.add((PathContent) content2);
                }
            } else if (!(content2 instanceof PathContent)) {
                if (aVar == null) {
                    aVar = new a(oVar);
                }
                aVar.f19637a.add((PathContent) content2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }
}
