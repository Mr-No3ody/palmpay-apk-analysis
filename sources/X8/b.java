package X8;

import Bc.D;
import F8.d;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.bean.rsp.QueryT3QuotaRsp;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaAgreementFragment;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaManageFragment;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Tier3QuotaManageFragment f11060b;

    public /* synthetic */ b(Tier3QuotaManageFragment tier3QuotaManageFragment, int i7) {
        this.f11059a = i7;
        this.f11060b = tier3QuotaManageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        D d2;
        Tier3QuotaManageFragment tier3QuotaManageFragment = this.f11060b;
        switch (this.f11059a) {
            case 0:
                E activity = tier3QuotaManageFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 1:
                Tier3QuotaManageActivity tier3QuotaManageActivity = (Tier3QuotaManageActivity) tier3QuotaManageFragment.getActivity();
                if (tier3QuotaManageActivity != null) {
                    long jT = tier3QuotaManageFragment.t();
                    tier3QuotaManageFragment.f26244o = tier3QuotaManageFragment.t();
                    QueryT3QuotaRsp queryT3QuotaRsp = tier3QuotaManageFragment.f26243j;
                    if ((queryT3QuotaRsp != null && queryT3QuotaRsp.needAuth) || !((d2 = tier3QuotaManageFragment.f26242i) == null || ((AppCompatCheckBox) d2.t).isChecked())) {
                        int i7 = Tier3QuotaManageActivity.f26091f;
                        h.i(tier3QuotaManageActivity, d.fragmentContainer, Tier3QuotaAgreementFragment.f26238p.get(jT, false));
                    } else {
                        tier3QuotaManageActivity.m(jT);
                    }
                }
                break;
            default:
                Tier3QuotaManageActivity tier3QuotaManageActivity2 = (Tier3QuotaManageActivity) tier3QuotaManageFragment.getActivity();
                if (tier3QuotaManageActivity2 != null) {
                    h.i(tier3QuotaManageActivity2, d.fragmentContainer, Tier3QuotaAgreementFragment.f26238p.get(tier3QuotaManageFragment.t(), true));
                }
                break;
        }
    }
}
