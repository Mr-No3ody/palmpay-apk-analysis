package com.airbnb.lottie.animation.keyframe;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements BaseKeyframeAnimation$AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19831b;

    public /* synthetic */ p(Object obj, int i7) {
        this.f19830a = i7;
        this.f19831b = obj;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        switch (this.f19830a) {
            case 0:
                ((q) this.f19831b).f19842k = true;
                break;
            case 1:
                ((q) this.f19831b).f19842k = true;
                break;
            case 2:
                ((q) this.f19831b).f19842k = true;
                break;
            default:
                com.airbnb.lottie.model.layer.a aVar = (com.airbnb.lottie.model.layer.a) this.f19831b;
                boolean z3 = aVar.f20023r.l() == 1.0f;
                if (z3 != aVar.f20028x) {
                    aVar.f20028x = z3;
                    aVar.f20020o.invalidateSelf();
                }
                break;
        }
    }
}
