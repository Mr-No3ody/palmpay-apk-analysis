package X8;

import F8.d;
import android.view.View;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaAgreementFragment;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaManageFragment;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Tier3QuotaAgreementFragment f11058b;

    public /* synthetic */ a(Tier3QuotaAgreementFragment tier3QuotaAgreementFragment, int i7) {
        this.f11057a = i7;
        this.f11058b = tier3QuotaAgreementFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Tier3QuotaAgreementFragment tier3QuotaAgreementFragment = this.f11058b;
        switch (this.f11057a) {
            case 0:
                if (!tier3QuotaAgreementFragment.f26241o) {
                    Tier3QuotaManageActivity tier3QuotaManageActivity = (Tier3QuotaManageActivity) tier3QuotaAgreementFragment.getActivity();
                    if (tier3QuotaManageActivity != null) {
                        tier3QuotaManageActivity.m(tier3QuotaAgreementFragment.f26240j);
                    }
                } else {
                    Tier3QuotaManageActivity tier3QuotaManageActivity2 = (Tier3QuotaManageActivity) tier3QuotaAgreementFragment.getActivity();
                    if (tier3QuotaManageActivity2 != null) {
                        h.i(tier3QuotaManageActivity2, d.fragmentContainer, (Tier3QuotaManageFragment) tier3QuotaManageActivity2.f26094e.getValue());
                    }
                }
                break;
            default:
                Tier3QuotaAgreementFragment.a aVar = Tier3QuotaAgreementFragment.f26238p;
                Tier3QuotaManageActivity tier3QuotaManageActivity3 = (Tier3QuotaManageActivity) tier3QuotaAgreementFragment.getActivity();
                if (tier3QuotaManageActivity3 != null) {
                    h.i(tier3QuotaManageActivity3, d.fragmentContainer, (Tier3QuotaManageFragment) tier3QuotaManageActivity3.f26094e.getValue());
                }
                break;
        }
    }
}
