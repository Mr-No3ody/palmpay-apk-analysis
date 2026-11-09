package p168l4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexiBankTitleEditView f39275b;

    public /* synthetic */ b(FlexiBankTitleEditView flexiBankTitleEditView, int i7) {
        this.f39274a = i7;
        this.f39275b = flexiBankTitleEditView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f39274a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                String str = FlexiBankTitleEditView.f22193w0;
                FlexiBankTitleEditView flexiBankTitleEditView = this.f39275b;
                flexiBankTitleEditView.d(0);
                TextView titleView = flexiBankTitleEditView.getTitleView();
                Intrinsics.e(titleView);
                titleView.setVisibility(4);
                break;
            default:
                super.onAnimationEnd(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f39274a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                String str = FlexiBankTitleEditView.f22193w0;
                FlexiBankTitleEditView flexiBankTitleEditView = this.f39275b;
                flexiBankTitleEditView.d(8);
                TextView titleView = flexiBankTitleEditView.getTitleView();
                Intrinsics.e(titleView);
                titleView.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
