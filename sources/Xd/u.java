package Xd;

import Pa.r0;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BaseDataBundleItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleDescInfoDialog;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f11173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f11174f;

    public u(v vVar, q getItemClick) {
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f11174f = vVar;
        this.f11173e = getItemClick;
        a(Pd.c.ll_data_bundle_name);
    }

    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        BaseDataBundleItemBean item = (BaseDataBundleItemBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Long l5 = null;
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = item instanceof DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean ? (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) item : null;
        if (dataBundleWalletItemChildBean == null) {
            return;
        }
        v.d(this.f11174f, helper, dataBundleWalletItemChildBean);
        Long deductionAmount = dataBundleWalletItemChildBean.getDeductionAmount();
        if (deductionAmount != null && deductionAmount.longValue() > 0) {
            l5 = deductionAmount;
        }
        boolean z3 = true;
        if (l5 != null) {
            long price = dataBundleWalletItemChildBean.getPrice() - l5.longValue();
            long j6 = price >= 0 ? price : 0L;
            SpanUtils spanUtils = new SpanUtils();
            String strB = r0.B(j6, true);
            Intrinsics.checkNotNullExpressionValue(strB, "getAmountStringWithCurrency(...)");
            SpanUtils spanUtilsAppendSpace = spanUtils.append(kotlin.text.y.k(strB, ".00", "")).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, c())).appendSpace(CommonViewExtKt.getDp(4));
            String strB2 = r0.B(dataBundleWalletItemChildBean.getPrice(), true);
            Intrinsics.checkNotNullExpressionValue(strB2, "getAmountStringWithCurrency(...)");
            helper.setText(Pd.c.amount_tv, spanUtilsAppendSpace.append(kotlin.text.y.k(strB2, ".00", "")).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, c())).setStrikethrough().create());
        }
        int i7 = Pd.c.data_bundle_name_tv;
        String validityExtDesc = dataBundleWalletItemChildBean.getValidityExtDesc();
        BaseViewHolder text = helper.setText(i7, validityExtDesc != null ? validityExtDesc : "");
        int i10 = Pd.c.ll_data_bundle_name;
        String validityExtDesc2 = dataBundleWalletItemChildBean.getValidityExtDesc();
        BaseViewHolder gone = text.setGone(i10, validityExtDesc2 == null || validityExtDesc2.length() == 0);
        int i11 = Pd.c.data_bundle_name_iv;
        String description = dataBundleWalletItemChildBean.getDescription();
        if (description != null && description.length() != 0) {
            z3 = false;
        }
        gone.setGone(i11, z3).setVisible(Pd.c.recent_purchase_group, Intrinsics.c(dataBundleWalletItemChildBean.isBuyAgain(), Boolean.TRUE));
    }

    @Override // T1.b
    public final int d() {
        return 2;
    }

    @Override // T1.b
    public final int e() {
        return Pd.d.qt_item_data_bundle_wallet_item_single;
    }

    @Override // T1.b
    public final void f(BaseViewHolder helper, View view, Object obj, int i7) {
        BaseDataBundleItemBean data = (BaseDataBundleItemBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = data instanceof DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean ? (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) data : null;
        if (dataBundleWalletItemChildBean != null && view.getId() == Pd.c.ll_data_bundle_name) {
            v vVar = this.f11174f;
            vVar.getClass();
            String description = dataBundleWalletItemChildBean.getDescription();
            if (description == null || StringsKt.F(description)) {
                return;
            }
            new DataBundleDescInfoDialog(vVar.getContext(), dataBundleWalletItemChildBean, new r(vVar, i7, dataBundleWalletItemChildBean, 0)).show();
        }
    }

    @Override // T1.b
    public final void g(BaseViewHolder helper, View view, Object obj, int i7) {
        DataBundleWalletAdapter$OnDataBundleItemClickListener dataBundleWalletAdapter$OnDataBundleItemClickListener;
        BaseDataBundleItemBean data = (BaseDataBundleItemBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = data instanceof DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean ? (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) data : null;
        if (dataBundleWalletItemChildBean == null || (dataBundleWalletAdapter$OnDataBundleItemClickListener = this.f11173e.f11166b.f11178e) == null) {
            return;
        }
        dataBundleWalletAdapter$OnDataBundleItemClickListener.onNormalItemClick(i7, dataBundleWalletItemChildBean);
    }
}
