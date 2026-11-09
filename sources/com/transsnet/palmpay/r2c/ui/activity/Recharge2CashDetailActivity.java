package com.transsnet.palmpay.r2c.ui.activity;

import L6.b;
import Pd.c;
import Pd.d;
import Rd.N;
import T8.o;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.model.OrderDetailInfoListModel;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashResultViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p059e1.a;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/airtime/recharge_2_cash_detail")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/r2c/ui/activity/Recharge2CashDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/r2c/viewmodel/Recharge2CashResultViewModel;", "LRd/N;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecharge2CashDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recharge2CashDetailActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n260#2,10:251\n296#2:261\n1#3:262\n*S KotlinDebug\n*F\n+ 1 Recharge2CashDetailActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashDetailActivity\n*L\n74#1:251,10\n74#1:261\n*E\n"})
public final class Recharge2CashDetailActivity extends BaseMvvmVBActivity<Recharge2CashResultViewModel, N> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33114f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public R2COrderDetailResp f33116e;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f33115d)) {
            this.f33115d = getQueryParameter("orderNo");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_airtime_share_detail_layout, (ViewGroup) null, false);
        int i7 = c.layout_result_amount_list;
        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = c.layout_result_info_list;
            OrderDetailInfoListModel orderDetailInfoListModel = (OrderDetailInfoListModel) a.m(i7, viewInflate);
            if (orderDetailInfoListModel != null) {
                i7 = c.model_order_result_customer_service;
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) a.m(i7, viewInflate);
                if (orderResultCustomerServiceModel != null) {
                    i7 = c.model_order_result_header;
                    OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) a.m(i7, viewInflate);
                    if (orderResultHeaderModel != null) {
                        i7 = c.model_order_result_view_receipt;
                        OrderResultViewReceiptModel orderResultViewReceiptModel = (OrderResultViewReceiptModel) a.m(i7, viewInflate);
                        if (orderResultViewReceiptModel != null) {
                            i7 = c.scrollView;
                            if (((NestedScrollView) a.m(i7, viewInflate)) != null) {
                                i7 = c.titleBar;
                                if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                                    N n10 = new N((LinearLayout) viewInflate, linearLayout, orderDetailInfoListModel, orderResultCustomerServiceModel, orderResultHeaderModel, orderResultViewReceiptModel);
                                    Intrinsics.checkNotNullExpressionValue(n10, "inflate(...)");
                                    return n10;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final String n(int i7) {
        if (i7 == 1) {
            String string = getString(k.core_success);
            Intrinsics.e(string);
            return string;
        }
        if (i7 != 2) {
            String string2 = getString(k.core_pending);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getString(k.core_failed);
        Intrinsics.e(string3);
        return string3;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Recharge2CashResultViewModel recharge2CashResultViewModel = (Recharge2CashResultViewModel) l();
        String str = this.f33115d;
        recharge2CashResultViewModel.getClass();
        f.s(recharge2CashResultViewModel, new p085fd.c(str, null), recharge2CashResultViewModel.f33138e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        l lVar = ((Recharge2CashResultViewModel) l()).f33138e;
        if (lVar != null) {
            lVar.e(this, new T8.f(new o(22, this, this), (byte) 0, (short) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        N n10 = (N) this.f27334c;
        if (n10 != null) {
            n10.f8117d.d(Boolean.FALSE);
        }
        N n11 = (N) this.f27334c;
        if (n11 != null) {
            n11.f8117d.setOnCustomerServiceModelListener(new p054dd.a(this));
        }
    }
}
