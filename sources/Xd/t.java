package Xd;

import Pa.r0;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.teller.bean.BaseDataBundleItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f11171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f11172f;

    public t(v vVar, q getItemClick) {
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f11172f = vVar;
        this.f11171e = getItemClick;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        String volume;
        String volumeUnit;
        String string;
        BaseDataBundleItemBean item = (BaseDataBundleItemBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = item instanceof DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean ? (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) item : null;
        if (dataBundleWalletItemChildBean == null) {
            return;
        }
        v.d(this.f11172f, helper, dataBundleWalletItemChildBean);
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(Pd.c.amountTitle);
        Long deductionAmount = dataBundleWalletItemChildBean.getDeductionAmount();
        if (deductionAmount != null) {
            if (deductionAmount.longValue() > 0) {
                long price = dataBundleWalletItemChildBean.getPrice() - deductionAmount.longValue();
                String strB = r0.B(price >= 0 ? price : 0L, true);
                Intrinsics.checkNotNullExpressionValue(strB, "getAmountStringWithCurrency(...)");
                appCompatTextView.setText(kotlin.text.y.k(strB, ".00", ""));
                p220oa.h.o(appCompatTextView, true);
            } else {
                appCompatTextView.setText(Pd.f.qt_data_bundle_price);
                p220oa.h.o(appCompatTextView, false);
            }
        } else {
            appCompatTextView.setText(Pd.f.qt_data_bundle_price);
            p220oa.h.o(appCompatTextView, false);
        }
        String description = dataBundleWalletItemChildBean.getDescription();
        if (description == null) {
            Context contextC = c();
            int i7 = Pd.f.qt_data_bundle_default_description_format;
            volume = dataBundleWalletItemChildBean.getVolume();
            if (volume == null) {
                volume = "";
            }
            volumeUnit = dataBundleWalletItemChildBean.getVolumeUnit();
            if (volumeUnit == null) {
                volumeUnit = "";
            }
            String strConcat = volume.concat(volumeUnit);
            String validity = dataBundleWalletItemChildBean.getValidity();
            string = contextC.getString(i7, strConcat, validity != null ? validity : "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = StringsKt.F(description) ? null : description;
            if (string == null) {
                Context contextC2 = c();
                int i10 = Pd.f.qt_data_bundle_default_description_format;
                volume = dataBundleWalletItemChildBean.getVolume();
                if (volume == null) {
                    volume = "";
                }
                volumeUnit = dataBundleWalletItemChildBean.getVolumeUnit();
                if (volumeUnit == null) {
                    volumeUnit = "";
                }
                String strConcat2 = volume.concat(volumeUnit);
                String validity2 = dataBundleWalletItemChildBean.getValidity();
                string = contextC2.getString(i10, strConcat2, validity2 != null ? validity2 : "");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        }
        helper.setText(Pd.c.data_bundle_description_tv, string).setGone(Pd.c.data_bundle_description_tv, false).setGone(Pd.c.ll_data_bundle_name, !Intrinsics.c(dataBundleWalletItemChildBean.isBuyAgain(), Boolean.TRUE));
    }

    @Override // T1.b
    public final int d() {
        return 1;
    }

    @Override // T1.b
    public final int e() {
        return Pd.d.qt_item_data_bundle_wallet_item_child;
    }

    @Override // T1.b
    public final void g(BaseViewHolder helper, View view, Object obj, int i7) {
        DataBundleWalletAdapter$OnDataBundleItemClickListener dataBundleWalletAdapter$OnDataBundleItemClickListener;
        BaseDataBundleItemBean data = (BaseDataBundleItemBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = data instanceof DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean ? (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) data : null;
        if (dataBundleWalletItemChildBean == null || (dataBundleWalletAdapter$OnDataBundleItemClickListener = this.f11171e.f11166b.f11178e) == null) {
            return;
        }
        dataBundleWalletAdapter$OnDataBundleItemClickListener.onNormalItemClick(i7, dataBundleWalletItemChildBean);
    }
}
