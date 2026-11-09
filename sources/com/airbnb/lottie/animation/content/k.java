package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements DrawingContent, PathContent, GreedyContent, BaseKeyframeAnimation$AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f19751a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f19752b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f19753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f19754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f19759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f19760j;

    public k(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.h hVar) {
        this.f19753c = yVar;
        this.f19754d = aVar;
        this.f19755e = hVar.f19964b;
        this.f19756f = hVar.f19966d;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = hVar.f19965c.createAnimation();
        this.f19757g = hVarCreateAnimation;
        aVar.a(hVarCreateAnimation);
        hVarCreateAnimation.a(this);
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation2 = ((com.airbnb.lottie.model.animatable.b) hVar.f19967e).createAnimation();
        this.f19758h = hVarCreateAnimation2;
        aVar.a(hVarCreateAnimation2);
        hVarCreateAnimation2.a(this);
        com.airbnb.lottie.model.animatable.d dVar = (com.airbnb.lottie.model.animatable.d) hVar.f19968f;
        dVar.getClass();
        q qVar = new q(dVar);
        this.f19759i = qVar;
        qVar.a(aVar);
        qVar.b(this);
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public final void absorbContent(ListIterator listIterator) {
        if (this.f19760j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((Content) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f19760j = new c(this.f19753c, this.f19754d, "Repeater", this.f19756f, arrayList, null);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        if (this.f19759i.c(obj, cVar)) {
            return;
        }
        if (obj == LottieProperty.f19626s) {
            this.f19757g.j(cVar);
        } else if (obj == LottieProperty.t) {
            this.f19758h.j(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        float fFloatValue = ((Float) this.f19757g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f19758h.e()).floatValue();
        q qVar = this.f19759i;
        float fFloatValue3 = ((Float) qVar.f19852v.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) qVar.f19853w.e()).floatValue() / 100.0f;
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f19751a;
            matrix2.set(matrix);
            float f10 = i10;
            matrix2.preConcat(qVar.f(f10 + fFloatValue2));
            this.f19760j.draw(canvas, matrix2, (int) (com.airbnb.lottie.utils.g.f(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i7), aVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        this.f19760j.getBounds(rectF, matrix, z3);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19755e;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Path path = this.f19760j.getPath();
        Path path2 = this.f19752b;
        path2.reset();
        float fFloatValue = ((Float) this.f19757g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f19758h.e()).floatValue();
        for (int i7 = ((int) fFloatValue) - 1; i7 >= 0; i7--) {
            Matrix matrix = this.f19751a;
            matrix.set(this.f19759i.f(i7 + fFloatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19753c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, this);
        for (int i10 = 0; i10 < this.f19760j.f19663i.size(); i10++) {
            Content content = (Content) this.f19760j.f19663i.get(i10);
            if (content instanceof KeyPathElementContent) {
                com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, (KeyPathElementContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        this.f19760j.setContents(list, list2);
    }
}
