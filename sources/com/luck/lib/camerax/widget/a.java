package com.luck.lib.camerax.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CaptureButton f23560b;

    public /* synthetic */ a(CaptureButton captureButton, int i7) {
        this.f23559a = i7;
        this.f23560b = captureButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23559a) {
            case 0:
                this.f23560b.lambda$startRecordAnimation$1(valueAnimator);
                break;
            case 1:
                this.f23560b.lambda$startRecordAnimation$2(valueAnimator);
                break;
            default:
                this.f23560b.lambda$startCaptureAnimation$0(valueAnimator);
                break;
        }
    }
}
