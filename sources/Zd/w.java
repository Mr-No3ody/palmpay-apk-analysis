package Zd;

import Rd.g0;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentResultListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.dialog.InputPaymentItemAmountDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements FragmentResultListener, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentTvHomeFragment f11692a;

    public /* synthetic */ w(BillPaymentTvHomeFragment billPaymentTvHomeFragment) {
        this.f11692a = billPaymentTvHomeFragment;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i7) {
        String businessCategoryName;
        int i10 = BillPaymentTvHomeFragment.f34295v0;
        Intrinsics.checkNotNullParameter(tab, "tab");
        TvListByCategoryIdResp.TvCategoryBean tvCategoryBean = (TvListByCategoryIdResp.TvCategoryBean) CollectionsKt.G(i7, this.f11692a.f34297B);
        if (tvCategoryBean == null || (businessCategoryName = tvCategoryBean.getBusinessCategoryName()) == null) {
            businessCategoryName = "";
        }
        tab.setText(businessCategoryName);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        String billerId;
        String billerName;
        String itemName;
        String remark;
        Long maxAmount;
        Long maxAmount2;
        Long maxAmount3;
        Long maxAmount4;
        BillerListItemBean billerListItemBean;
        Long minAmount;
        Long minAmount2;
        int i7 = BillPaymentTvHomeFragment.f34295v0;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11692a;
        if (TextUtils.isEmpty(billPaymentTvHomeFragment.A())) {
            g0 g0Var = (g0) billPaymentTvHomeFragment.f27335j;
            if (g0Var != null) {
                g0Var.f8316c.setExpanded(true, true);
            }
            g0 g0Var2 = (g0) billPaymentTvHomeFragment.f27335j;
            if (g0Var2 != null) {
                g0Var2.f8325v.setErrorMessage(billPaymentTvHomeFragment.getString(com.transsnet.palmpay.custom_view.v.cv_msg_enter_smartcard_number));
                return;
            }
            return;
        }
        BillerListItemBean billerListItemBean2 = billPaymentTvHomeFragment.f34306k0;
        if (billerListItemBean2 == null) {
            g0 g0Var3 = (g0) billPaymentTvHomeFragment.f27335j;
            if (g0Var3 != null) {
                g0Var3.f8310H.e(billPaymentTvHomeFragment.getString(Pd.f.qt_service_temporarily_unavailable));
                return;
            }
            return;
        }
        Integer status = billerListItemBean2.getStatus();
        String str2 = "";
        if (status == null || status.intValue() != 1) {
            g0 g0Var4 = (g0) billPaymentTvHomeFragment.f27335j;
            if (g0Var4 != null) {
                ModelItemSelection modelItemSelection = g0Var4.f8310H;
                int i10 = Pd.f.qt_service_temporarily_unavailable_3;
                String billerName2 = billerListItemBean2.getBillerName();
                modelItemSelection.e(billPaymentTvHomeFragment.getString(i10, billerName2 != null ? billerName2 : ""));
                return;
            }
            return;
        }
        BillerListItemBean billerListItemBean3 = billPaymentTvHomeFragment.f34306k0;
        if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
            billerId = "";
        }
        String string = bundle.getString("DATA_KEY_BILLER_ID", billerId);
        BillerListItemBean billerListItemBean4 = billPaymentTvHomeFragment.f34306k0;
        if (billerListItemBean4 == null || (billerName = billerListItemBean4.getBillerName()) == null) {
            billerName = "";
        }
        String string2 = bundle.getString("DATA_KEY_BILLER_NAME", billerName);
        kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        String string3 = bundle.getString("DATA_KEY_PAYMENT_ITEM", "");
        TvListByCategoryIdResp.TvItemChildBean tvItemChildBean = string3 != null ? (TvListByCategoryIdResp.TvItemChildBean) d0.l(TvListByCategoryIdResp.TvItemChildBean.class, string3) : null;
        f10.f38951a = tvItemChildBean;
        if (tvItemChildBean != null) {
            Boolean suspend = tvItemChildBean.getSuspend();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.c(suspend, bool)) {
                String itemName2 = ((TvListByCategoryIdResp.TvItemChildBean) f10.f38951a).getItemName();
                str2 = itemName2 != null ? itemName2 : "";
                androidx.fragment.app.E eRequireActivity = billPaymentTvHomeFragment.requireActivity();
                String string4 = billPaymentTvHomeFragment.getString(Pd.f.qt_service_temporarily_unavailable_3, str2);
                ToastDialog toastDialog = new ToastDialog(eRequireActivity, com.transsnet.palmpay.custom_view.t.cv_toast_dialog);
                toastDialog.setMessage(string4);
                toastDialog.setTitle((String) null);
                toastDialog.setIcon(0);
                toastDialog.setIcon((Drawable) null);
                toastDialog.setBackground(0);
                toastDialog.show(4000L);
                return;
            }
            if (Intrinsics.c(((TvListByCategoryIdResp.TvItemChildBean) f10.f38951a).isAmountFixed(), bool)) {
                Intrinsics.e(string);
                Intrinsics.e(string2);
                Long price = ((TvListByCategoryIdResp.TvItemChildBean) f10.f38951a).getPrice();
                billPaymentTvHomeFragment.H(string, string2, price != null ? price.longValue() : 0L, (TvListByCategoryIdResp.TvItemChildBean) f10.f38951a);
                return;
            }
            TvListByCategoryIdResp.TvItemChildBean tvItemChildBean2 = (TvListByCategoryIdResp.TvItemChildBean) f10.f38951a;
            p339wb.g gVar = new p339wb.g(billPaymentTvHomeFragment, string, string2, f10, 2);
            long j6 = billPaymentTvHomeFragment.f34310s0;
            BillerListItemBean billerListItemBean5 = billPaymentTvHomeFragment.f34306k0;
            long jMax = Math.max(j6, Math.max((billerListItemBean5 == null || (minAmount2 = billerListItemBean5.getMinAmount()) == null) ? 0L : minAmount2.longValue(), (tvItemChildBean2 == null || (minAmount = tvItemChildBean2.getMinAmount()) == null) ? 0L : minAmount.longValue()));
            long jLongValue = Long.MAX_VALUE;
            if (billPaymentTvHomeFragment.f34309r0 == 0) {
                billPaymentTvHomeFragment.f34309r0 = Long.MAX_VALUE;
            }
            BillerListItemBean billerListItemBean6 = billPaymentTvHomeFragment.f34306k0;
            if (billerListItemBean6 != null && (maxAmount4 = billerListItemBean6.getMaxAmount()) != null && maxAmount4.longValue() == 0 && (billerListItemBean = billPaymentTvHomeFragment.f34306k0) != null) {
                billerListItemBean.setMaxAmount(Long.MAX_VALUE);
            }
            if (((tvItemChildBean2 == null || (maxAmount3 = tvItemChildBean2.getMaxAmount()) == null) ? 0L : maxAmount3.longValue()) == 0 && tvItemChildBean2 != null) {
                tvItemChildBean2.setMaxAmount(Long.MAX_VALUE);
            }
            long j10 = billPaymentTvHomeFragment.f34309r0;
            BillerListItemBean billerListItemBean7 = billPaymentTvHomeFragment.f34306k0;
            long jLongValue2 = (billerListItemBean7 == null || (maxAmount2 = billerListItemBean7.getMaxAmount()) == null) ? Long.MAX_VALUE : maxAmount2.longValue();
            if (tvItemChildBean2 != null && (maxAmount = tvItemChildBean2.getMaxAmount()) != null) {
                jLongValue = maxAmount.longValue();
            }
            InputPaymentItemAmountDialog maxAmount5 = ((InputPaymentItemAmountDialog) billPaymentTvHomeFragment.f34314w.getValue()).setMaxAmount(Math.min(j10, Math.min(jLongValue2, jLongValue)));
            if (tvItemChildBean2 == null || (itemName = tvItemChildBean2.getItemName()) == null) {
                itemName = "";
            }
            InputPaymentItemAmountDialog minAmount3 = maxAmount5.setPaymentItemName(itemName).setMinAmount(jMax);
            if (tvItemChildBean2 != null && (remark = tvItemChildBean2.getRemark()) != null) {
                str2 = remark;
            }
            minAmount3.setCashback(str2).setItemAmountList(tvItemChildBean2 != null ? tvItemChildBean2.getCustomerAmounts() : null).setCallback(gVar).show();
        }
    }
}
