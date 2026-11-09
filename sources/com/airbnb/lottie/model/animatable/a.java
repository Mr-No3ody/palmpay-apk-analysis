package com.airbnb.lottie.model.animatable;

import D4.f;
import com.airbnb.lottie.animation.keyframe.e;
import com.airbnb.lottie.animation.keyframe.i;
import com.airbnb.lottie.animation.keyframe.m;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, int i7) {
        super(list, 5);
        this.f19901c = i7;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final com.airbnb.lottie.animation.keyframe.d createAnimation() {
        switch (this.f19901c) {
            case 0:
                return new e((List) this.f1592b, 0);
            case 1:
                return new i((List) this.f1592b, 0);
            case 2:
                return new e((List) this.f1592b, 1);
            case 3:
                return new i((List) this.f1592b, 1);
            case 4:
                return new i((List) this.f1592b, 2);
            case 5:
                return new m((List) this.f1592b);
            default:
                return new e((List) this.f1592b, 2);
        }
    }
}
