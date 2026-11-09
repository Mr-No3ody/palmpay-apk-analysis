package Zd;

import androidx.lifecycle.Observer;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.bean.TopUpHistoryDataResp;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleExtraItemInfo;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleWalletDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zd.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0803h implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11665b;

    public /* synthetic */ C0803h(Object obj, int i7) {
        this.f11664a = i7;
        this.f11665b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Object obj2 = this.f11665b;
        switch (this.f11664a) {
            case 0:
                ChannelDataItemBean channelDataItemBean = (ChannelDataItemBean) obj;
                if (channelDataItemBean == null) {
                    int i7 = BillPaymentElectricityHomeFragment.f34255z0;
                } else {
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = (BillPaymentElectricityHomeFragment) obj2;
                    billPaymentElectricityHomeFragment.f34260L = channelDataItemBean;
                    billPaymentElectricityHomeFragment.L(true);
                }
                break;
            case 1:
                ChannelDataItemBean channelDataItemBean2 = (ChannelDataItemBean) obj;
                if (channelDataItemBean2 == null) {
                    int i10 = BillPaymentHomeNGFragment.f34279r0;
                } else {
                    BillPaymentHomeNGFragment billPaymentHomeNGFragment = (BillPaymentHomeNGFragment) obj2;
                    billPaymentHomeNGFragment.f34281B = channelDataItemBean2;
                    billPaymentHomeNGFragment.C(true);
                }
                break;
            case 2:
                ChannelDataItemBean channelDataItemBean3 = (ChannelDataItemBean) obj;
                if (channelDataItemBean3 == null) {
                    int i11 = BillPaymentTvHomeFragment.f34295v0;
                } else {
                    BillPaymentTvHomeFragment billPaymentTvHomeFragment = (BillPaymentTvHomeFragment) obj2;
                    billPaymentTvHomeFragment.f34302Q = channelDataItemBean3;
                    ChannelDataItemBean channelDataItemBean4 = billPaymentTvHomeFragment.f34302Q;
                    if (channelDataItemBean4 != null) {
                        billPaymentTvHomeFragment.C(false, true, channelDataItemBean4.getBillerId(), channelDataItemBean4.getCustomerId());
                    }
                }
                break;
            case 3:
                DataBundleWalletFragment dataBundleWalletFragment = (DataBundleWalletFragment) obj2;
                DataBundleExtraItemInfo dataBundleExtraItemInfo = (DataBundleExtraItemInfo) ((Map) obj).get((String) dataBundleWalletFragment.f31779w.getValue());
                if (dataBundleExtraItemInfo != null) {
                    dataBundleWalletFragment.u().g(dataBundleExtraItemInfo.getBundleTips());
                    DataBundleWalletDialog dataBundleWalletDialog = dataBundleWalletFragment.f31775L;
                    if (dataBundleWalletDialog != null) {
                        dataBundleWalletDialog.updateTipsInfo(dataBundleExtraItemInfo.getBundleTips());
                    }
                }
                break;
            default:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                int i12 = TopupAirtimeActivity.f26495x0;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.p) {
                    com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it;
                    if (((TopUpHistoryDataResp) pVar.f27360a).isSuccess()) {
                        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) obj2;
                        Rd.H h7 = (Rd.H) topupAirtimeActivity.f27334c;
                        if (h7 != null) {
                            h7.f8066g.initModelInputRegexData(((TopUpHistoryDataResp) pVar.f27360a).getData(), new p141j9.x(topupAirtimeActivity, 6), new p141j9.x(topupAirtimeActivity, 7));
                        }
                    }
                }
                break;
        }
    }
}
