package p068ec;

import Pa.r0;
import Rd.C0599o;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36272a;

    public n(BuyBundleHomePageActivity buyBundleHomePageActivity) {
        this.f36272a = buyBundleHomePageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        RecommendedItem item = (RecommendedItem) obj2;
        Intrinsics.checkNotNullParameter(item, "item");
        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
        BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36272a;
        if (r0.b1(buyBundleHomePageActivity.s())) {
            DataBundleWalletItemBean dataBundleWalletItemBean = new DataBundleWalletItemBean();
            dataBundleWalletItemBean.setBillerName(item.billerName);
            dataBundleWalletItemBean.setBillerId(item.billerId);
            dataBundleWalletItemBean.setItemId(item.itemId);
            dataBundleWalletItemBean.setInstitutionLogo(item.billerIcon);
            dataBundleWalletItemBean.setItemName(item.itemName);
            dataBundleWalletItemBean.setValidity(item.validity);
            dataBundleWalletItemBean.setVolume(item.volume);
            dataBundleWalletItemBean.setVolumeUnit(item.volumeUnit);
            dataBundleWalletItemBean.setDiscountPackageId(item.discountPackageId);
            buyBundleHomePageActivity.p(dataBundleWalletItemBean, buyBundleHomePageActivity.s(), item.price, true, (24 & 16) != 0 ? null : TransType.TRANS_TYPE_CASH_LOAN);
        } else {
            C0599o c0599o = (C0599o) buyBundleHomePageActivity.f27334c;
            if (c0599o != null) {
                c0599o.f8429d.setError(buyBundleHomePageActivity.getString(v.cv_msg_enter_recipient_mobile_number));
            }
            buyBundleHomePageActivity.u();
        }
        return Unit.f38893a;
    }
}
