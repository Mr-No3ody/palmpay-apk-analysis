package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.j f19816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f19817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f19818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f19819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f19820m;

    public m(List list) {
        super(list);
        this.f19816i = new com.airbnb.lottie.model.content.j();
        this.f19817j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object f(p243q1.a aVar, float f10) {
        com.airbnb.lottie.model.content.j jVarModifyShape;
        com.airbnb.lottie.model.content.j jVar = (com.airbnb.lottie.model.content.j) aVar.f41421b;
        com.airbnb.lottie.model.content.j jVar2 = (com.airbnb.lottie.model.content.j) aVar.f41422c;
        com.airbnb.lottie.model.content.j jVar3 = jVar2 == null ? jVar : jVar2;
        com.airbnb.lottie.model.content.j jVar4 = this.f19816i;
        if (jVar4.f19972b == null) {
            jVar4.f19972b = new PointF();
        }
        boolean z3 = true;
        jVar4.f19973c = jVar.f19973c || jVar3.f19973c;
        ArrayList arrayList = jVar.f19971a;
        int size = arrayList.size();
        int size2 = jVar3.f19971a.size();
        ArrayList arrayList2 = jVar3.f19971a;
        if (size != size2) {
            com.airbnb.lottie.utils.c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = jVar4.f19971a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new p212o1.a());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = jVar.f19972b;
        PointF pointF2 = jVar3.f19972b;
        jVar4.a(com.airbnb.lottie.utils.g.f(pointF.x, pointF2.x, f10), com.airbnb.lottie.utils.g.f(pointF.y, pointF2.y, f10));
        int size5 = arrayList3.size() - 1;
        while (size5 >= 0) {
            p212o1.a aVar2 = (p212o1.a) arrayList.get(size5);
            p212o1.a aVar3 = (p212o1.a) arrayList2.get(size5);
            PointF pointF3 = aVar2.f39983a;
            PointF pointF4 = aVar3.f39983a;
            boolean z8 = z3;
            com.airbnb.lottie.model.content.j jVar5 = jVar4;
            ((p212o1.a) arrayList3.get(size5)).f39983a.set(com.airbnb.lottie.utils.g.f(pointF3.x, pointF4.x, f10), com.airbnb.lottie.utils.g.f(pointF3.y, pointF4.y, f10));
            p212o1.a aVar4 = (p212o1.a) arrayList3.get(size5);
            PointF pointF5 = aVar2.f39984b;
            float f11 = pointF5.x;
            PointF pointF6 = aVar3.f39984b;
            aVar4.f39984b.set(com.airbnb.lottie.utils.g.f(f11, pointF6.x, f10), com.airbnb.lottie.utils.g.f(pointF5.y, pointF6.y, f10));
            p212o1.a aVar5 = (p212o1.a) arrayList3.get(size5);
            PointF pointF7 = aVar2.f39985c;
            float f12 = pointF7.x;
            PointF pointF8 = aVar3.f39985c;
            aVar5.f39985c.set(com.airbnb.lottie.utils.g.f(f12, pointF8.x, f10), com.airbnb.lottie.utils.g.f(pointF7.y, pointF8.y, f10));
            size5--;
            z3 = z8;
            jVar4 = jVar5;
        }
        com.airbnb.lottie.model.content.j jVar6 = jVar4;
        ArrayList arrayList4 = this.f19820m;
        if (arrayList4 != null) {
            jVarModifyShape = jVar6;
            for (int size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                jVarModifyShape = ((ShapeModifierContent) this.f19820m.get(size6)).modifyShape(jVarModifyShape);
            }
        } else {
            jVarModifyShape = jVar6;
        }
        Path path = this.f19817j;
        com.airbnb.lottie.utils.g.e(jVarModifyShape, path);
        if (this.f19793e == null) {
            return path;
        }
        if (this.f19818k == null) {
            this.f19818k = new Path();
            this.f19819l = new Path();
        }
        com.airbnb.lottie.utils.g.e(jVar, this.f19818k);
        if (jVar2 != null) {
            com.airbnb.lottie.utils.g.e(jVar2, this.f19819l);
        }
        p243q1.c cVar = this.f19793e;
        float fFloatValue = aVar.f41427h.floatValue();
        Path path2 = this.f19818k;
        return (Path) cVar.b(aVar.f41426g, fFloatValue, path2, jVar2 == null ? path2 : this.f19819l, f10, d(), this.f19792d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final boolean k() {
        ArrayList arrayList = this.f19820m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
