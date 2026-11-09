package com.airbnb.lottie.animation.keyframe;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p243q1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p243q1.c f19798c;

    public f(p243q1.c cVar) {
        this.f19798c = cVar;
    }

    @Override // p243q1.c
    public final Object a(p243q1.b bVar) {
        Float f10 = (Float) this.f19798c.a(bVar);
        if (f10 == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * 2.55f);
    }
}
