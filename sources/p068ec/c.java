package p068ec;

import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import Pd.f;
import Rd.C0599o;
import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements FragmentResultListener, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36250b;

    public /* synthetic */ c(BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36249a = i7;
        this.f36250b = buyBundleHomePageActivity;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i7) {
        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.setText(((DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) this.f36250b.f31759s0.get(i7)).getBundleCategoryName());
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        C0599o c0599o;
        BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36250b;
        switch (this.f36249a) {
            case 0:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                if (bundle.getBoolean("BUNDLE_KEY_EXPAND_APPBAR_LAYOUT") && (c0599o = (C0599o) buyBundleHomePageActivity.f27334c) != null) {
                    c0599o.t.post(new g(buyBundleHomePageActivity, 1));
                    break;
                }
                break;
            default:
                KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                n0.g().k(new ClickEvent("data_package_slot_click").add("Biller", bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_BILLERNAME", "")).add("TabDetail", bundle.getString("BUNDLE_KEY_TAB_DETAIL", "")).add("ItemDetail", ((Gson) C0525w.f().f7166b).toJson(G.f(new Pair("ItemID", bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_PAYMENTITEMID", "")), new Pair("ItemName", bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_PAYMENTITEMNAME", "")), new Pair("ItemTab", bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_TAB", "")), new Pair("ItemOrder", Integer.valueOf(bundle.getInt("BUNDLE_KEY_PAYMENT_ITEM_ORDER")))))));
                if (!r0.b1(buyBundleHomePageActivity.s())) {
                    C0599o c0599o2 = (C0599o) buyBundleHomePageActivity.f27334c;
                    if (c0599o2 != null) {
                        c0599o2.f8429d.setError(buyBundleHomePageActivity.getString(v.cv_msg_enter_recipient_mobile_number));
                    }
                    buyBundleHomePageActivity.u();
                } else if (buyBundleHomePageActivity.r() != null) {
                    MobileWalletResp.MobileWallet mobileWalletR = buyBundleHomePageActivity.r();
                    if (mobileWalletR == null || mobileWalletR.status == 1) {
                        DataBundleWalletItemBean dataBundleWalletItemBean = new DataBundleWalletItemBean();
                        dataBundleWalletItemBean.setValidity(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_VALIDITY", ""));
                        dataBundleWalletItemBean.setBillerName(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_BILLERNAME", ""));
                        dataBundleWalletItemBean.setBillerId(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_BILLERID", ""));
                        dataBundleWalletItemBean.setCategoryId(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_CATEGORYID", ""));
                        dataBundleWalletItemBean.setItemId(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_PAYMENTITEMID", ""));
                        dataBundleWalletItemBean.setItemName(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_PAYMENTITEMNAME", ""));
                        dataBundleWalletItemBean.setDescription(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_PAYMENT_ITEM_DES", ""));
                        dataBundleWalletItemBean.setPrice(Long.valueOf(bundle.getLong("BUNDLE_KEY_PAYMENT_ITEM_AMOUNT")));
                        dataBundleWalletItemBean.setVolume(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_PAYMENT_ITEM_VOLUME", ""));
                        dataBundleWalletItemBean.setVolumeUnit(bundle.getString("BUNDLE_KEY_PAYMENT_ITEM_PAYMENT_ITEM_VOLUMEUNIT", ""));
                        MobileWalletResp.MobileWallet mobileWalletR2 = buyBundleHomePageActivity.r();
                        dataBundleWalletItemBean.setInstitutionLogo(mobileWalletR2 != null ? mobileWalletR2.operatorUrl : null);
                        buyBundleHomePageActivity.p(dataBundleWalletItemBean, buyBundleHomePageActivity.s(), dataBundleWalletItemBean.getPrice(), true, (24 & 16) != 0 ? null : TransType.TRANS_TYPE_CASH_LOAN);
                    } else {
                        buyBundleHomePageActivity.x(mobileWalletR);
                    }
                } else {
                    ToastUtils.showLong(f.qt_service_temporarily_unavailable);
                }
                break;
        }
    }
}
