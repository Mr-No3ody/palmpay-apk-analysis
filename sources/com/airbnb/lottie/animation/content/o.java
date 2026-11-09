package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Content, BaseKeyframeAnimation$AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19778c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19782g;

    public o(com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.o oVar) {
        this.f19776a = oVar.f19997a;
        this.f19777b = oVar.f20002f;
        this.f19779d = oVar.f19998b;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = oVar.f19999c.createAnimation();
        this.f19780e = hVarCreateAnimation;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation2 = oVar.f20000d.createAnimation();
        this.f19781f = hVarCreateAnimation2;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation3 = oVar.f20001e.createAnimation();
        this.f19782g = hVarCreateAnimation3;
        aVar.a(hVarCreateAnimation);
        aVar.a(hVarCreateAnimation2);
        aVar.a(hVarCreateAnimation3);
        hVarCreateAnimation.a(this);
        hVarCreateAnimation2.a(this);
        hVarCreateAnimation3.a(this);
    }

    public final void a(BaseKeyframeAnimation$AnimationListener baseKeyframeAnimation$AnimationListener) {
        this.f19778c.add(baseKeyframeAnimation$AnimationListener);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19776a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f19778c;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation$AnimationListener) arrayList.get(i7)).onValueChanged();
            i7++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
    }
}
