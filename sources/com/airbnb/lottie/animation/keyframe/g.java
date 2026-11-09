package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class g implements BaseKeyframeAnimation$AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f19799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f19800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f19801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f19802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f19803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f19804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f19805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f19806h;

    public g(com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.layer.a aVar2, E2.a aVar3) {
        this.f19800b = aVar;
        this.f19799a = aVar2;
        d dVarCreateAnimation = ((com.airbnb.lottie.model.animatable.a) aVar3.f2183b).createAnimation();
        this.f19801c = (e) dVarCreateAnimation;
        dVarCreateAnimation.a(this);
        aVar2.a(dVarCreateAnimation);
        h hVarCreateAnimation = ((com.airbnb.lottie.model.animatable.b) aVar3.f2184c).createAnimation();
        this.f19802d = hVarCreateAnimation;
        hVarCreateAnimation.a(this);
        aVar2.a(hVarCreateAnimation);
        h hVarCreateAnimation2 = ((com.airbnb.lottie.model.animatable.b) aVar3.f2185d).createAnimation();
        this.f19803e = hVarCreateAnimation2;
        hVarCreateAnimation2.a(this);
        aVar2.a(hVarCreateAnimation2);
        h hVarCreateAnimation3 = ((com.airbnb.lottie.model.animatable.b) aVar3.f2186e).createAnimation();
        this.f19804f = hVarCreateAnimation3;
        hVarCreateAnimation3.a(this);
        aVar2.a(hVarCreateAnimation3);
        h hVarCreateAnimation4 = ((com.airbnb.lottie.model.animatable.b) aVar3.f2187f).createAnimation();
        this.f19805g = hVarCreateAnimation4;
        hVarCreateAnimation4.a(this);
        aVar2.a(hVarCreateAnimation4);
    }

    public final com.airbnb.lottie.utils.a a(Matrix matrix, int i7) {
        float fL = this.f19803e.l() * 0.017453292f;
        float fFloatValue = ((Float) this.f19804f.e()).floatValue();
        double d2 = fL;
        float fSin = ((float) Math.sin(d2)) * fFloatValue;
        float fCos = ((float) Math.cos(d2 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f19805g.e()).floatValue();
        int iIntValue = ((Integer) this.f19801c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f19802d.e()).floatValue() * i7) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        com.airbnb.lottie.utils.a aVar = new com.airbnb.lottie.utils.a();
        aVar.f20216a = fFloatValue2 * 0.33f;
        aVar.f20217b = fSin;
        aVar.f20218c = fCos;
        aVar.f20219d = iArgb;
        aVar.f20220e = null;
        aVar.c(matrix);
        if (this.f19806h == null) {
            this.f19806h = new Matrix();
        }
        this.f19799a.f20027w.e().invert(this.f19806h);
        aVar.c(this.f19806h);
        return aVar;
    }

    public final void b(p243q1.c cVar) {
        h hVar = this.f19802d;
        if (cVar == null) {
            hVar.j(null);
        } else {
            hVar.j(new f(cVar));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19800b.onValueChanged();
    }
}
