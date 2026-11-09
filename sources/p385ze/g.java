package p385ze;

import Ac.e;
import Kb.b;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f44693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LottieAnimationView f44694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f44695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f44696g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, View view) {
        super(hVar, view);
        this.f44696g = hVar;
        this.f44695f = (AppCompatTextView) view.findViewById(e.ihphm_tv);
        this.f44694e = (LottieAnimationView) view.findViewById(e.mihphm_big_icon);
        a(view);
    }

    public final LottieAnimationView d(Context context) {
        LottieAnimationView lottieAnimationView = this.f44694e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setRepeatCount(5);
            return this.f44694e;
        }
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(context);
        int iDp2px = SizeUtils.dp2px(36.0f);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iDp2px, iDp2px);
        layoutParams.t = 0;
        layoutParams.f15670v = 0;
        layoutParams.f15650i = 0;
        lottieAnimationView2.setLayoutParams(layoutParams);
        lottieAnimationView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lottieAnimationView2.setRepeatCount(5);
        View view = this.itemView;
        if (view instanceof ConstraintLayout) {
            ((ConstraintLayout) view).addView(lottieAnimationView2, layoutParams);
        }
        this.f44694e = lottieAnimationView2;
        return lottieAnimationView2;
    }
}
