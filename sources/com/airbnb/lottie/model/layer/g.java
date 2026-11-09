package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.y;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.airbnb.lottie.animation.content.c f20075D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final b f20076E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.g f20077F;

    public g(y yVar, e eVar, b bVar, k kVar) {
        super(yVar, eVar);
        this.f20076E = bVar;
        com.airbnb.lottie.animation.content.c cVar = new com.airbnb.lottie.animation.content.c(yVar, this, new l("__container", eVar.f20051a, false), kVar);
        this.f20075D = cVar;
        List list = Collections.EMPTY_LIST;
        cVar.setContents(list, list);
        E2.a aVar = this.f20021p.f20073x;
        if (aVar != null) {
            this.f20077F = new com.airbnb.lottie.animation.keyframe.g(this, this, aVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        super.addValueCallback(obj, cVar);
        PointF pointF = LottieProperty.f19608a;
        com.airbnb.lottie.animation.keyframe.g gVar = this.f20077F;
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
        com.airbnb.lottie.animation.keyframe.g gVar = this.f20077F;
        if (gVar != null) {
            aVar = gVar.a(matrix, i7);
        }
        this.f20075D.draw(canvas, matrix, i7, aVar);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final p1.c e() {
        p1.c cVar = this.f20021p.f20072w;
        return cVar != null ? cVar : this.f20076E.f20021p.f20072w;
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        super.getBounds(rectF, matrix, z3);
        this.f20075D.getBounds(rectF, this.f20019n, z3);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void i(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        this.f20075D.resolveKeyPath(eVar, i7, list, eVar2);
    }
}
