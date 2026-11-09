package Me;

import Ab.C;
import C9.C0158z;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC0456a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f5979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ModelPalmPrizeBanner f5980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SingleAdView f5981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5982f;

    public l(LinearLayout linearLayout, boolean z3) {
        super(0);
        this.f5982f = CommonViewExtKt.getDp(34);
        this.f5949a = e(linearLayout, Ac.d.main_reward_lucky_wish_skeleton_bg);
        View viewG = AbstractC0456a.g(this, linearLayout, Ac.f.main_home_rewards_tab_palmprize_stub, 4);
        this.f5979c = viewG;
        ModelPalmPrizeBanner modelPalmPrizeBanner = viewG != null ? (ModelPalmPrizeBanner) viewG.findViewById(Ac.e.modelPalmPrizeBanner) : null;
        this.f5980d = modelPalmPrizeBanner;
        SingleAdView singleAdView = viewG != null ? (SingleAdView) viewG.findViewById(Ac.e.palmPrizeBottomAdView) : null;
        this.f5981e = singleAdView;
        if (singleAdView != null) {
            p220oa.h.c(singleAdView);
        }
        if (singleAdView != null) {
            singleAdView.setAdListenerInternal(new C0158z(this, 11));
        }
        if (((AppCompatImageView) this.f5949a) == null) {
            if (modelPalmPrizeBanner != null) {
                modelPalmPrizeBanner.d();
                return;
            }
            return;
        }
        if (modelPalmPrizeBanner != null) {
            p220oa.h.c(modelPalmPrizeBanner);
        }
        if (modelPalmPrizeBanner != null) {
            C listener = new C(this, 24);
            Intrinsics.checkNotNullParameter(listener, "listener");
            modelPalmPrizeBanner.f35302c = listener;
        }
    }
}
