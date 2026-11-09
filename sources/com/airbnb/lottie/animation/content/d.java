package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements PathContent, BaseKeyframeAnimation$AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f19669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.i f19670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f19671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.a f19672f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19674h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19667a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F1.b f19673g = new F1.b(2);

    public d(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.a aVar2) {
        this.f19668b = aVar2.f19917a;
        this.f19669c = yVar;
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation = aVar2.f19919c.createAnimation();
        this.f19670d = (com.airbnb.lottie.animation.keyframe.i) dVarCreateAnimation;
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation2 = aVar2.f19918b.createAnimation();
        this.f19671e = dVarCreateAnimation2;
        this.f19672f = aVar2;
        aVar.a(dVarCreateAnimation);
        aVar.a(dVarCreateAnimation2);
        dVarCreateAnimation.a(this);
        dVarCreateAnimation2.a(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        if (obj == LottieProperty.f19613f) {
            this.f19670d.j(cVar);
        } else if (obj == LottieProperty.f19616i) {
            this.f19671e.j(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19668b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        boolean z3 = this.f19674h;
        Path path = this.f19667a;
        if (z3) {
            return path;
        }
        path.reset();
        com.airbnb.lottie.model.content.a aVar = this.f19672f;
        if (aVar.f19921e) {
            this.f19674h = true;
            return path;
        }
        PointF pointF = (PointF) this.f19670d.e();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f19920d) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f19671e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f19673g.f(path);
        this.f19674h = true;
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19674h = false;
        this.f19669c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Content content = (Content) list.get(i7);
            if (content instanceof o) {
                o oVar = (o) content;
                if (oVar.f19779d == 1) {
                    this.f19673g.f2516a.add(oVar);
                    oVar.a(this);
                }
            }
        }
    }
}
