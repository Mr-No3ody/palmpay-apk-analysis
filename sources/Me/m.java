package Me;

import Ab.C;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC0456a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f5984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ModelPremiumBenefits f5985e;

    public m(LinearLayout linearLayout, boolean z3) {
        super(0);
        this.f5983c = z3;
        this.f5949a = e(linearLayout, Ac.d.main_reward_premium_benefits_skeleton_bg);
        View viewG = AbstractC0456a.g(this, linearLayout, Ac.f.main_home_rewards_tab_premium_benefits_stub, 4);
        this.f5984d = viewG;
        ModelPremiumBenefits modelPremiumBenefits = viewG != null ? (ModelPremiumBenefits) viewG.findViewById(Ac.e.modelPremiumBenefits) : null;
        this.f5985e = modelPremiumBenefits;
        if (((AppCompatImageView) this.f5949a) == null) {
            if (modelPremiumBenefits != null) {
                modelPremiumBenefits.f35307e = z3;
                modelPremiumBenefits.d();
                return;
            }
            return;
        }
        if (modelPremiumBenefits != null) {
            C listener = new C(this, 25);
            Intrinsics.checkNotNullParameter(listener, "listener");
            modelPremiumBenefits.f35305c = listener;
        }
    }
}
