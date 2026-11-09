package Uc;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0646a0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapPage f9615b;

    public /* synthetic */ C0646a0(MapPage mapPage, int i7) {
        this.f9614a = i7;
        this.f9615b = mapPage;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f9614a) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                FrameLayout frameLayoutP = MapPage.p(this.f9615b);
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                frameLayoutP.setTranslationY(((Float) animatedValue).floatValue());
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                LinearLayout linearLayoutO = MapPage.o(this.f9615b);
                Object animatedValue2 = it.getAnimatedValue();
                Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                linearLayoutO.setTranslationY(((Float) animatedValue2).floatValue());
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                FrameLayout frameLayoutP2 = MapPage.p(this.f9615b);
                Object animatedValue3 = it.getAnimatedValue();
                Intrinsics.f(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                frameLayoutP2.setTranslationY(((Float) animatedValue3).floatValue());
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                LinearLayout linearLayoutO2 = MapPage.o(this.f9615b);
                Object animatedValue4 = it.getAnimatedValue();
                Intrinsics.f(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                linearLayoutO2.setTranslationY(((Float) animatedValue4).floatValue());
                break;
        }
    }
}
