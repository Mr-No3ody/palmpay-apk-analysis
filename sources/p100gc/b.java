package p100gc;

import Pa.r0;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p002a.a;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements DataBundleWalletAdapter$OnDataBundleItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataBundleWalletFragment f37176a;

    public b(DataBundleWalletFragment dataBundleWalletFragment) {
        this.f37176a = dataBundleWalletFragment;
    }

    @Override // com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener
    public final void onNormalItemClick(int i7, DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (r0.U0()) {
            return;
        }
        DataBundleWalletFragment dataBundleWalletFragment = this.f37176a;
        if (dataBundleWalletFragment.isAdded()) {
            DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean = dataBundleWalletFragment.f31773C;
            Pair pair = new Pair("BUNDLE_KEY_PAYMENT_ITEM_BILLERNAME", dataBundleWalletCategoryBean != null ? dataBundleWalletCategoryBean.getBillerName() : null);
            DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean2 = dataBundleWalletFragment.f31773C;
            Pair pair2 = new Pair("BUNDLE_KEY_PAYMENT_ITEM_BILLERID", dataBundleWalletCategoryBean2 != null ? dataBundleWalletCategoryBean2.getBillerId() : null);
            DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean3 = dataBundleWalletFragment.f31773C;
            Pair pair3 = new Pair("BUNDLE_KEY_PAYMENT_ITEM_CATEGORYID", dataBundleWalletCategoryBean3 != null ? dataBundleWalletCategoryBean3.getBundleCategoryId() : null);
            DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean4 = dataBundleWalletFragment.f31773C;
            dataBundleWalletFragment.getParentFragmentManager().setFragmentResult("REQUEST_CODE_CLICK_DATA_BUNDLE_ITEM", a.e(pair, pair2, pair3, new Pair("BUNDLE_KEY_PAYMENT_ITEM_TAB", dataBundleWalletCategoryBean4 != null ? dataBundleWalletCategoryBean4.getBundleCategoryName() : null), new Pair("BUNDLE_KEY_TAB_DETAIL", (String) dataBundleWalletFragment.f31771A.getValue()), new Pair("BUNDLE_KEY_PAYMENT_ITEM_ORDER", Integer.valueOf(i7 + 1)), new Pair("BUNDLE_KEY_PAYMENT_ITEM_PAYMENTITEMID", item.getItemId()), new Pair("BUNDLE_KEY_PAYMENT_ITEM_PAYMENTITEMNAME", item.getItemName()), new Pair("BUNDLE_KEY_PAYMENT_ITEM_PAYMENT_ITEM_DES", item.getDescription()), new Pair("BUNDLE_KEY_PAYMENT_ITEM_AMOUNT", Long.valueOf(item.getPrice())), new Pair("BUNDLE_KEY_PAYMENT_ITEM_VALIDITY", item.getValidity()), new Pair("BUNDLE_KEY_PAYMENT_ITEM_PAYMENT_ITEM_VOLUME", item.getVolume()), new Pair("BUNDLE_KEY_PAYMENT_ITEM_PAYMENT_ITEM_VOLUMEUNIT", item.getVolumeUnit())));
        }
    }
}
