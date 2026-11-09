package Ed;

import Kd.C0399n1;
import Pa.i0;
import Pa.n0;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class N implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFragment f2333b;

    public /* synthetic */ N(TransferToBankHomeFragment transferToBankHomeFragment, int i7) {
        this.f2332a = i7;
        this.f2333b = transferToBankHomeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BannerEntranceBean bannerEntranceBean;
        switch (this.f2332a) {
            case 0:
                ARouter.getInstance().build("/sm/transfer_via_ussd").navigation(this.f2333b.requireActivity());
                break;
            case 1:
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    TransferToBankHomeFragment transferToBankHomeFragment = this.f2333b;
                    List list = transferToBankHomeFragment.f33776C;
                    String jumpUrl = (list == null || (bannerEntranceBean = (BannerEntranceBean) CollectionsKt.firstOrNull(list)) == null) ? null : bannerEntranceBean.getJumpUrl();
                    if (jumpUrl == null || jumpUrl.length() == 0) {
                        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) transferToBankHomeFragment.f27333i;
                        if (transferToBankHomeViewModel != null) {
                            ArrayList transTypes = C1850q.e("03");
                            Intrinsics.checkNotNullParameter(transTypes, "transTypes");
                            AbstractC0780y.m(androidx.lifecycle.V.h(transferToBankHomeViewModel), null, null, new C0399n1(transferToBankHomeViewModel.f34047e, C0.G.p("Pref_", "queryTransactionLink_" + transTypes, "_", BaseApplication.getCountryLocale()), null, transTypes), 3);
                        }
                    } else {
                        ActivityUtils.startActivity(Pa.F.a(transferToBankHomeFragment.requireContext(), jumpUrl));
                    }
                    n0.g().l("Transfer_ToBank_TransferHistory_Click");
                }
                break;
            case 2:
                Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
                this.f2333b.requireActivity().finish();
                if (activityIsActivityExistsInStack == null) {
                    i0.j0();
                }
                break;
            default:
                n0.g().q(new ClickEvent("Transfer_ToBank_Search_Click"));
                Postcard postcardBuild = ARouter.getInstance().build("/sm/back_account_beneficiary");
                TransferToBankHomeFragment transferToBankHomeFragment2 = this.f2333b;
                postcardBuild.withString("core_order_source_type", transferToBankHomeFragment2.f33778o).withBoolean("extra_data", false).navigation(transferToBankHomeFragment2.requireContext());
                break;
        }
    }
}
