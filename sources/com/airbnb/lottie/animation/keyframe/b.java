package com.airbnb.lottie.animation.keyframe;

import androidx.camera.video.u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements BaseKeyframeAnimation$KeyframesWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19783a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p243q1.a f19785c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19786d = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p243q1.a f19784b = a(0.0f);

    public b(List list) {
        this.f19783a = list;
    }

    public final p243q1.a a(float f10) {
        List list = this.f19783a;
        p243q1.a aVar = (p243q1.a) u.e(1, list);
        if (f10 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            p243q1.a aVar2 = (p243q1.a) list.get(size);
            if (this.f19784b != aVar2 && f10 >= aVar2.b() && f10 < aVar2.a()) {
                return aVar2;
            }
        }
        return (p243q1.a) list.get(0);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final p243q1.a getCurrentKeyframe() {
        return this.f19784b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final float getEndProgress() {
        return ((p243q1.a) u.e(1, this.f19783a)).a();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final float getStartDelayProgress() {
        return ((p243q1.a) this.f19783a.get(0)).b();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isCachedValueEnabled(float f10) {
        p243q1.a aVar = this.f19785c;
        p243q1.a aVar2 = this.f19784b;
        if (aVar == aVar2 && this.f19786d == f10) {
            return true;
        }
        this.f19785c = aVar2;
        this.f19786d = f10;
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isValueChanged(float f10) {
        p243q1.a aVar = this.f19784b;
        if (f10 >= aVar.b() && f10 < aVar.a()) {
            return !this.f19784b.c();
        }
        this.f19784b = a(f10);
        return true;
    }
}
