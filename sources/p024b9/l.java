package p024b9;

import Bc.f;
import C0.AbstractC0130w;
import F8.d;
import Pa.n0;
import Pa.r0;
import android.view.View;
import android.widget.LinearLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepBillsFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpgradeTier3StepBillsFragment f18817b;

    public /* synthetic */ l(UpgradeTier3StepBillsFragment upgradeTier3StepBillsFragment, int i7) {
        this.f18816a = i7;
        this.f18817b = upgradeTier3StepBillsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UpgradeTier3StepBillsFragment upgradeTier3StepBillsFragment = this.f18817b;
        switch (this.f18816a) {
            case 0:
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV = upgradeTier3StepBillsFragment.v();
                if (palmPayLevelUpTier3V2ActivityV != null) {
                    palmPayLevelUpTier3V2ActivityV.f25921f = null;
                }
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV2 = upgradeTier3StepBillsFragment.v();
                if (palmPayLevelUpTier3V2ActivityV2 != null) {
                    palmPayLevelUpTier3V2ActivityV2.f25917b = null;
                }
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV3 = upgradeTier3StepBillsFragment.v();
                if (palmPayLevelUpTier3V2ActivityV3 != null) {
                    palmPayLevelUpTier3V2ActivityV3.f25922g = null;
                }
                AbstractC0130w abstractC0130w = upgradeTier3StepBillsFragment.f26294j;
                if (abstractC0130w != null) {
                    abstractC0130w.h(d.fragment_tier3_step_bill_upload, null, PalmPayLevelUpTier3V2Activity.f25915o.buildSlideNavOptions(Integer.valueOf(d.fragment_tier3_step_bills), true));
                }
                break;
            case 1:
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV4 = upgradeTier3StepBillsFragment.v();
                if (palmPayLevelUpTier3V2ActivityV4 != null) {
                    palmPayLevelUpTier3V2ActivityV4.onBackPressed();
                }
                break;
            default:
                n0.g().l("KYC_UseBillVerify_Click");
                f fVar = upgradeTier3StepBillsFragment.f26296p;
                if (fVar != null) {
                    ((PpButton) fVar.f700f).b(true);
                }
                f fVar2 = upgradeTier3StepBillsFragment.f26296p;
                r0.K1(null, 0, upgradeTier3StepBillsFragment, fVar2 != null ? (LinearLayout) fVar2.f698d : null);
                break;
        }
    }
}
