package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.y;
import com.horcrux.svg.d0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ShapeModifierContent, BaseKeyframeAnimation$AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f19761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f19763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.airbnb.lottie.model.content.j f19764d;

    public l(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.i iVar) {
        this.f19761a = yVar;
        this.f19762b = iVar.f19969a;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = iVar.f19970b.createAnimation();
        this.f19763c = hVarCreateAnimation;
        aVar.a(hVarCreateAnimation);
        hVarCreateAnimation.a(this);
    }

    public static int a(int i7, int i10) {
        int i11 = i7 / i10;
        if ((i7 ^ i10) < 0 && i11 * i10 != i7) {
            i11--;
        }
        return i7 - (i11 * i10);
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public final void addUpdateListener(BaseKeyframeAnimation$AnimationListener baseKeyframeAnimation$AnimationListener) {
        this.f19763c.a(baseKeyframeAnimation$AnimationListener);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19762b;
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public final com.airbnb.lottie.model.content.j modifyShape(com.airbnb.lottie.model.content.j jVar) {
        int i7;
        com.airbnb.lottie.model.content.j jVar2 = jVar;
        ArrayList arrayList = jVar2.f19971a;
        if (arrayList.size() > 2) {
            float fFloatValue = ((Float) this.f19763c.e()).floatValue();
            if (fFloatValue != 0.0f) {
                ArrayList arrayList2 = jVar2.f19971a;
                boolean z3 = jVar2.f19973c;
                boolean z8 = true;
                int size = arrayList2.size() - 1;
                int i10 = 0;
                while (size >= 0) {
                    p212o1.a aVar = (p212o1.a) arrayList2.get(size);
                    p212o1.a aVar2 = (p212o1.a) arrayList2.get(a(size - 1, arrayList2.size()));
                    PointF pointF = (size != 0 || z3) ? aVar2.f39985c : jVar2.f19972b;
                    i10 = (((size != 0 || z3) ? aVar2.f39984b : pointF).equals(pointF) && aVar.f39983a.equals(pointF) && !(!jVar2.f19973c && (size == 0 || size == arrayList2.size() - 1))) ? i10 + 2 : i10 + 1;
                    size--;
                }
                com.airbnb.lottie.model.content.j jVar3 = this.f19764d;
                if (jVar3 == null || jVar3.f19971a.size() != i10) {
                    ArrayList arrayList3 = new ArrayList(i10);
                    for (int i11 = 0; i11 < i10; i11++) {
                        arrayList3.add(new p212o1.a());
                    }
                    this.f19764d = new com.airbnb.lottie.model.content.j(new PointF(0.0f, 0.0f), false, arrayList3);
                }
                com.airbnb.lottie.model.content.j jVar4 = this.f19764d;
                jVar4.f19973c = z3;
                PointF pointF2 = jVar2.f19972b;
                jVar4.a(pointF2.x, pointF2.y);
                ArrayList arrayList4 = jVar4.f19971a;
                boolean z10 = jVar2.f19973c;
                int i12 = 0;
                int i13 = 0;
                while (i12 < arrayList.size()) {
                    p212o1.a aVar3 = (p212o1.a) arrayList.get(i12);
                    p212o1.a aVar4 = (p212o1.a) arrayList.get(a(i12 - 1, arrayList.size()));
                    p212o1.a aVar5 = (p212o1.a) arrayList.get(a(i12 - 2, arrayList.size()));
                    PointF pointF3 = (i12 != 0 || z10) ? aVar4.f39985c : jVar2.f19972b;
                    PointF pointF4 = (i12 != 0 || z10) ? aVar4.f39984b : pointF3;
                    boolean z11 = z8;
                    PointF pointF5 = aVar3.f39983a;
                    PointF pointF6 = aVar5.f39985c;
                    boolean z12 = (jVar2.f19973c || !(i12 == 0 || i12 == arrayList.size() + (-1))) ? false : z11;
                    if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z12) {
                        float f10 = pointF3.x;
                        float f11 = f10 - pointF6.x;
                        float f12 = pointF3.y;
                        float f13 = f12 - pointF6.y;
                        PointF pointF7 = aVar3.f39985c;
                        float f14 = pointF7.x - f10;
                        float f15 = pointF7.y - f12;
                        i7 = i12;
                        float fHypot = (float) Math.hypot(f11, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = pointF3.x;
                        float fE = d0.e(pointF6.x, f16, fMin, f16);
                        float f17 = pointF3.y;
                        float fE2 = d0.e(pointF6.y, f17, fMin, f17);
                        float fE3 = d0.e(pointF7.x, f16, fMin2, f16);
                        float fE4 = d0.e(pointF7.y, f17, fMin2, f17);
                        float f18 = fE - ((fE - f16) * 0.5519f);
                        float f19 = fE2 - ((fE2 - f17) * 0.5519f);
                        float f20 = fE3 - ((fE3 - f16) * 0.5519f);
                        float f21 = fE4 - ((fE4 - f17) * 0.5519f);
                        p212o1.a aVar6 = (p212o1.a) arrayList4.get(a(i13 - 1, arrayList4.size()));
                        p212o1.a aVar7 = (p212o1.a) arrayList4.get(i13);
                        aVar6.f39984b.set(fE, fE2);
                        aVar6.f39985c.set(fE, fE2);
                        if (i7 == 0) {
                            jVar4.a(fE, fE2);
                        }
                        aVar7.f39983a.set(f18, f19);
                        p212o1.a aVar8 = (p212o1.a) arrayList4.get(i13 + 1);
                        aVar7.f39984b.set(f20, f21);
                        aVar7.f39985c.set(fE3, fE4);
                        aVar8.f39983a.set(fE3, fE4);
                        i13 += 2;
                    } else {
                        i7 = i12;
                        p212o1.a aVar9 = (p212o1.a) arrayList4.get(a(i13 - 1, arrayList4.size()));
                        p212o1.a aVar10 = (p212o1.a) arrayList4.get(i13);
                        PointF pointF8 = aVar4.f39984b;
                        aVar9.f39984b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = aVar4.f39985c;
                        aVar9.f39985c.set(pointF9.x, pointF9.y);
                        PointF pointF10 = aVar3.f39983a;
                        aVar10.f39983a.set(pointF10.x, pointF10.y);
                        i13++;
                    }
                    i12 = i7 + 1;
                    jVar2 = jVar;
                    z10 = z10;
                    z8 = z11;
                    arrayList = arrayList;
                }
                return jVar4;
            }
        }
        return jVar2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19761a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
    }
}
