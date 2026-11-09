package com.transsnet.palmpay.ui.activity.detail;

import Ac.e;
import Ac.f;
import Bc.C0105b;
import L6.b;
import Pe.H;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.viewmodule.InterBankCashInOrderDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p141j9.s;
import p141j9.t;
import p160ke.d;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/interbank_cashin_order_detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/detail/InterBankCashInOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/InterBankCashInOrderDetailViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInterBankCashInOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterBankCashInOrderDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/detail/InterBankCashInOrderDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n171#2,12:301\n215#2:313\n1869#3,2:314\n1869#3,2:317\n1#4:316\n*S KotlinDebug\n*F\n+ 1 InterBankCashInOrderDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/detail/InterBankCashInOrderDetailActivity\n*L\n96#1:301,12\n96#1:313\n168#1:314,2\n182#1:317,2\n*E\n"})
public final class InterBankCashInOrderDetailActivity extends BaseMvvmActivity<InterBankCashInOrderDetailViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34699f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34701d = TransType.TRANS_TYPE_INTERBANK_CASH_IN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0105b f34702e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_inter_bank_cash_in, (ViewGroup) null, false);
        int i7 = e.awrd_sv;
        if (((ScrollView) a.m(i7, viewInflate)) != null) {
            i7 = e.btn_view_receipt;
            if (((OrderResultViewReceiptModel) a.m(i7, viewInflate)) != null) {
                i7 = e.layout_fixed_savings;
                FixedSavingsLayout fixedSavingsLayout = (FixedSavingsLayout) a.m(i7, viewInflate);
                if (fixedSavingsLayout != null) {
                    i7 = e.ll_fee_detail;
                    LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                    if (linearLayout != null) {
                        i7 = e.ll_head_item;
                        LinearLayout linearLayout2 = (LinearLayout) a.m(i7, viewInflate);
                        if (linearLayout2 != null) {
                            i7 = e.m_customer_service;
                            OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) a.m(i7, viewInflate);
                            if (orderResultCustomerServiceModel != null) {
                                i7 = e.orhm_head;
                                OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) a.m(i7, viewInflate);
                                if (orderResultHeaderModel != null) {
                                    i7 = e.titleBar;
                                    if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                                        C0105b c0105b = new C0105b((LinearLayout) viewInflate, fixedSavingsLayout, linearLayout, linearLayout2, orderResultCustomerServiceModel, orderResultHeaderModel, 1);
                                        this.f34702e = c0105b;
                                        return c0105b;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        InterBankCashInOrderDetailViewModel interBankCashInOrderDetailViewModel = (InterBankCashInOrderDetailViewModel) l();
        String str = this.f34700c;
        String str2 = this.f34701d;
        interBankCashInOrderDetailViewModel.getClass();
        p140j8.f.s(interBankCashInOrderDetailViewModel, new H(str, str2, null), interBankCashInOrderDetailViewModel.f35374e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((InterBankCashInOrderDetailViewModel) l()).f35374e;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 5), (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        OrderResultCustomerServiceModel orderResultCustomerServiceModel;
        OrderResultCustomerServiceModel orderResultCustomerServiceModel2;
        super.setupView();
        ARouter.getInstance().inject(this);
        if (TextUtils.isEmpty(this.f34700c)) {
            this.f34700c = getQueryParameter("orderId");
        }
        C0105b c0105b = this.f34702e;
        if (c0105b != null && (orderResultCustomerServiceModel2 = (OrderResultCustomerServiceModel) c0105b.f666f) != null) {
            orderResultCustomerServiceModel2.d(Boolean.FALSE);
        }
        C0105b c0105b2 = this.f34702e;
        if (c0105b2 == null || (orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) c0105b2.f666f) == null) {
            return;
        }
        orderResultCustomerServiceModel.setOnCustomerServiceModelListener(new d());
    }
}
