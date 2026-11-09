package androidx.camera.view;

import android.animation.ValueAnimator;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.ImageCapture$ScreenFlashListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z implements ImageCapture$ScreenFlash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f15023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScreenFlashView f15024c;

    public z(ScreenFlashView screenFlashView) {
        this.f15024c = screenFlashView;
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void apply(long j6, ImageCapture$ScreenFlashListener imageCapture$ScreenFlashListener) {
        p140j8.f.G("ScreenFlashView");
        final ScreenFlashView screenFlashView = this.f15024c;
        this.f15022a = screenFlashView.getBrightness();
        screenFlashView.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.f15023b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(imageCapture$ScreenFlashListener);
        y yVar = new y(imageCapture$ScreenFlashListener, 0);
        p140j8.f.G("ScreenFlashView");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(screenFlashView.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i7 = ScreenFlashView.f14913d;
                ScreenFlashView screenFlashView2 = screenFlashView;
                screenFlashView2.getClass();
                ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                p140j8.f.G("ScreenFlashView");
                screenFlashView2.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.addListener(new A(yVar));
        valueAnimatorOfFloat.start();
        this.f15023b = valueAnimatorOfFloat;
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void clear() {
        p140j8.f.G("ScreenFlashView");
        ValueAnimator valueAnimator = this.f15023b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15023b = null;
        }
        ScreenFlashView screenFlashView = this.f15024c;
        screenFlashView.setAlpha(0.0f);
        screenFlashView.setBrightness(this.f15022a);
    }
}
