package p068ec;

import C0.G;
import N8.m0;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Rd.C0599o;
import Wf.AbstractC0780y;
import Wf.C0759d0;
import android.os.Trace;
import android.view.View;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.teller.viewmodel.USSDInfoDataViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p086fe.X0;
import p130ic.i;
import p130ic.m;
import p130ic.q;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36265b;

    public /* synthetic */ k(BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36264a = i7;
        this.f36265b = buyBundleHomePageActivity;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    @Override // java.lang.Runnable
    public final void run() {
        BuyBundleHomePageActivity buyBundleHomePageActivity;
        ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem;
        switch (this.f36264a) {
            case 0:
                BuyBundleHomePageActivity buyBundleHomePageActivity2 = this.f36265b;
                Trace.beginSection("delayInit");
                try {
                    if (i0.W(buyBundleHomePageActivity2)) {
                        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                        DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity2.l();
                        dataBundleHomeViewModel.getClass();
                        f.s(dataBundleHomeViewModel, new i(1, null), dataBundleHomeViewModel.f31806v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        USSDInfoDataViewModel uSSDInfoDataViewModel = (USSDInfoDataViewModel) buyBundleHomePageActivity2.t.getValue();
                        uSSDInfoDataViewModel.getClass();
                        Intrinsics.checkNotNullParameter(TransType.TRANS_TYPE_BUNDLE, "transType");
                        AbstractC0780y.m(V.h(uSSDInfoDataViewModel), null, null, new X0(uSSDInfoDataViewModel.f34433e, G.o("Pref_queryBillerUSSDInfo_34_", BaseApplication.getCountryLocale()), null), 3);
                        if (buyBundleHomePageActivity2.f31753k0 != null) {
                            buyBundleHomePageActivity = buyBundleHomePageActivity2;
                        } else {
                            C0599o c0599o = (C0599o) buyBundleHomePageActivity2.f27334c;
                            View viewInflate = c0599o != null ? c0599o.f8427b.inflate() : null;
                            ModelActivityBannerWithCoupon modelActivityBannerWithCoupon = viewInflate instanceof ModelActivityBannerWithCoupon ? (ModelActivityBannerWithCoupon) viewInflate : null;
                            buyBundleHomePageActivity2.f31753k0 = modelActivityBannerWithCoupon;
                            if (modelActivityBannerWithCoupon != null) {
                                buyBundleHomePageActivity = buyBundleHomePageActivity2;
                                modelActivityBannerWithCoupon.e(TransType.TRANS_TYPE_BUNDLE, buyBundleHomePageActivity2.isDarkMode(), new m0(buyBundleHomePageActivity2, 5), new C0759d0(1, buyBundleHomePageActivity2, BuyBundleHomePageActivity.class, "showLoadingDialog", "showLoadingDialog(Z)V", 0, 1), new C0525w(buyBundleHomePageActivity, 22));
                            } else {
                                buyBundleHomePageActivity = buyBundleHomePageActivity2;
                            }
                        }
                        ViewBinding viewBinding = buyBundleHomePageActivity.f27334c;
                        C0599o c0599o2 = (C0599o) viewBinding;
                        if ((c0599o2 != null ? c0599o2.f8437v : null) != null) {
                            C0599o c0599o3 = (C0599o) viewBinding;
                            View viewInflate2 = c0599o3 != null ? c0599o3.f8437v.inflate() : null;
                            buyBundleHomePageActivity.f31750Z = viewInflate2 instanceof ModelDataPlanFlashSaleItem ? (ModelDataPlanFlashSaleItem) viewInflate2 : null;
                            MobileWalletResp.MobileWallet mobileWalletR = buyBundleHomePageActivity.r();
                            if (mobileWalletR != null && (modelDataPlanFlashSaleItem = buyBundleHomePageActivity.f31750Z) != null) {
                                modelDataPlanFlashSaleItem.h(mobileWalletR.operatorCode);
                            }
                            ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem2 = buyBundleHomePageActivity.f31750Z;
                            if (modelDataPlanFlashSaleItem2 != null) {
                                modelDataPlanFlashSaleItem2.setOnItemClickListener(new n(buyBundleHomePageActivity));
                            }
                        }
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                BuyBundleHomePageActivity buyBundleHomePageActivity3 = this.f36265b;
                Trace.beginSection("delayInit");
                try {
                    n0.p(buyBundleHomePageActivity3.getIntent());
                    if (BaseApplication.hasLogin()) {
                        DataBundleHomeViewModel dataBundleHomeViewModel2 = (DataBundleHomeViewModel) buyBundleHomePageActivity3.l();
                        dataBundleHomeViewModel2.getClass();
                        f.s(dataBundleHomeViewModel2, new q(1, null), dataBundleHomeViewModel2.f31795B, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        DataBundleHomeViewModel dataBundleHomeViewModel3 = (DataBundleHomeViewModel) buyBundleHomePageActivity3.l();
                        dataBundleHomeViewModel3.getClass();
                        if (BaseApplication.hasLogin()) {
                            f.s(dataBundleHomeViewModel3, new m(1, null), dataBundleHomeViewModel3.f31807w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            break;
                        }
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
