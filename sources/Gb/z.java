package Gb;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.palmpay.lib.scanplus.view.BoxView;
import com.rollingtextview.RollingTextView;
import com.rollingtextview.strategy.CharOrderStrategy;
import com.swmansion.rnscreens.bottomsheet.DimmingView;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.transsnet.palmpay.credit.view.MultiLoanCtaLightView;
import com.transsnet.palmpay.custom_view.ReboundScrollView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3321b;

    public /* synthetic */ z(Object obj, int i7) {
        this.f3320a = i7;
        this.f3321b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        float f10;
        Object obj = this.f3321b;
        switch (this.f3320a) {
            case 0:
                int i7 = MultiLoanCtaLightView.f30800p;
                Intrinsics.checkNotNullParameter(animator, "animator");
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                MultiLoanCtaLightView multiLoanCtaLightView = (MultiLoanCtaLightView) obj;
                multiLoanCtaLightView.f30804d = ((Float) animatedValue).floatValue();
                multiLoanCtaLightView.invalidate();
                break;
            case 1:
                int i10 = BoxView.f23968k0;
                BoxView this$0 = (BoxView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animator, "it");
                Object animatedValue2 = animator.getAnimatedValue();
                Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                this$0.f23988w = ((Float) animatedValue2).floatValue();
                this$0.postInvalidateOnAnimation();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animator, "it");
                DimmingView dimmingView = ((N7.c) obj).f6103b;
                Object animatedValue3 = animator.getAnimatedValue();
                Intrinsics.f(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                dimmingView.setAlpha(((Float) animatedValue3).floatValue());
                break;
            case 3:
                int i11 = SheetDelegate.f25393p;
                Intrinsics.checkNotNullParameter(animator, "animator");
                Object animatedValue4 = animator.getAnimatedValue();
                Float f11 = animatedValue4 instanceof Float ? (Float) animatedValue4 : null;
                if (f11 != null) {
                    ((N7.d) obj).f6108a.setAlpha(f11.floatValue());
                }
                break;
            case 4:
                StatusBarModule.AnonymousClass1.runGuarded$lambda$0((Activity) obj, animator);
                break;
            case 5:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$1((ClippableRoundedCornerLayout) obj, animator);
                break;
            case 6:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) obj, animator);
                break;
            case 7:
                ((DeterminateDrawable) obj).lambda$maybeInitializeAmplitudeAnimator$1(animator);
                break;
            case 8:
                int i12 = ReboundScrollView.f31096J0;
                ReboundScrollView reboundScrollView = (ReboundScrollView) obj;
                int iIntValue = ((Integer) animator.getAnimatedValue()).intValue();
                View view = reboundScrollView.f31107z0;
                Rect rect = reboundScrollView.f31102F0;
                view.layout(rect.left, iIntValue, rect.right, rect.height() + iIntValue);
                break;
            default:
                int i13 = RollingTextView.f24998w;
                RollingTextView this$1 = (RollingTextView) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(animator, "it");
                p365y7.e eVar = this$1.f25003e;
                float animatedFraction = animator.getAnimatedFraction();
                eVar.getClass();
                p365y7.b previousProgress = new p365y7.b(0, 0.0d, animatedFraction, (char) 0, 0.0f);
                ArrayList arrayList = eVar.f44142d;
                if (!arrayList.isEmpty()) {
                    for (ListIterator listIterator = arrayList.listIterator(arrayList.size()); listIterator.hasPrevious(); listIterator = listIterator) {
                        int iPreviousIndex = listIterator.previousIndex();
                        p365y7.c cVar = (p365y7.c) listIterator.previous();
                        List<? extends List<Character>> columns = eVar.f44143e;
                        int i14 = cVar.f44136j;
                        p039cb.c cVar2 = eVar.f44140b;
                        Intrinsics.checkNotNullParameter(previousProgress, "previousProgress");
                        Intrinsics.checkNotNullParameter(columns, "columns");
                        p365y7.a aVarNextProgress = ((CharOrderStrategy) cVar2.f18901b).nextProgress(previousProgress, iPreviousIndex, columns, i14);
                        int i15 = aVarNextProgress.f44119a;
                        cVar.f44136j = i15;
                        char cCharValue = ((Character) cVar.f44129c.get(i15)).charValue();
                        cVar.f44132f = cCharValue;
                        double d2 = cVar.f44134h;
                        double d10 = aVarNextProgress.f44121c;
                        double d11 = (1.0d - d10) * d2;
                        p379z7.b bVar = cVar.f44130d;
                        int i16 = bVar.f44500b;
                        double d12 = aVarNextProgress.f44120b;
                        int i17 = bVar.f44499a;
                        cVar.f44135i = i16 == 0 ? (((double) cVar.f44131e) * d12 * ((double) i17)) + d11 : (((double) cVar.f44127a.f44145g) * d12 * ((double) i17)) + d11;
                        if (cCharValue > 0) {
                            float f12 = cVar.f44138l;
                            float f13 = cVar.f44137k;
                            f10 = ((f12 - f13) * ((float) d10)) + f13;
                        } else {
                            f10 = 0.0f;
                        }
                        cVar.f44131e = f10;
                        previousProgress = new p365y7.b(cVar.f44136j, d12, d10, cCharValue, f10);
                    }
                }
                this$1.requestLayout();
                this$1.invalidate();
                break;
        }
    }
}
