package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AnimatableValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f19903b;

    public c(b bVar, b bVar2) {
        this.f19902a = bVar;
        this.f19903b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final com.airbnb.lottie.animation.keyframe.d createAnimation() {
        return new n(this.f19902a.createAnimation(), this.f19903b.createAnimation());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final List getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final boolean isStatic() {
        return this.f19902a.isStatic() && this.f19903b.isStatic();
    }
}
