package com.transsnet.palmpay.ui.activity.detail;

import Ac.e;
import Ac.f;
import Bc.C0107d;
import Pe.C0543o;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.BuyEarlyRefundOrderDetailRsp;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.viewmodule.BuyEarlyRefundDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p141j9.s;
import p141j9.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/buy_early_refund_billdetail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/detail/BuyEarlyRefundDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/BuyEarlyRefundDetailViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuyEarlyRefundDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyEarlyRefundDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/detail/BuyEarlyRefundDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,171:1\n171#2,12:172\n215#2:184\n*S KotlinDebug\n*F\n+ 1 BuyEarlyRefundDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/detail/BuyEarlyRefundDetailActivity\n*L\n96#1:172,12\n96#1:184\n*E\n"})
public final class BuyEarlyRefundDetailActivity extends BaseMvvmActivity<BuyEarlyRefundDetailViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34671f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BuyEarlyRefundOrderDetailRsp.DataBean f34673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0107d f34674e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((BuyEarlyRefundDetailViewModel) l()).f35361e;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 4), (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_buy_early_refund_bill_detail, (ViewGroup) null, false);
        int i7 = e.ll_head_item;
        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = e.m_customer_service;
            OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) a.m(i7, viewInflate);
            if (orderResultCustomerServiceModel != null) {
                i7 = e.m_head;
                OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) a.m(i7, viewInflate);
                if (orderResultHeaderModel != null) {
                    i7 = e.titleBar;
                    if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                        C0107d c0107d = new C0107d((ConstraintLayout) viewInflate, linearLayout, orderResultCustomerServiceModel, orderResultHeaderModel);
                        this.f34674e = c0107d;
                        return c0107d;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String str = this.f34672c;
        if (str != null) {
            BuyEarlyRefundDetailViewModel buyEarlyRefundDetailViewModel = (BuyEarlyRefundDetailViewModel) l();
            buyEarlyRefundDetailViewModel.getClass();
            p140j8.f.s(buyEarlyRefundDetailViewModel, new C0543o(str, null), buyEarlyRefundDetailViewModel.f35361e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView bodyBgIv;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(true);
        BarUtils.setStatusBarLightMode((Activity) this, true);
        if (TextUtils.isEmpty(this.f34672c)) {
            this.f34672c = getQueryParameter("orderId");
        }
        C0107d c0107d = this.f34674e;
        if (c0107d != null) {
            ((OrderResultHeaderModel) c0107d.f683e).o("Buy Early Refund");
        }
        C0107d c0107d2 = this.f34674e;
        if (c0107d2 != null) {
            ((OrderResultHeaderModel) c0107d2.f683e).e(Ea.a.c(TransType.TRANS_TYPE_BUY_EARLY_REFUND, (14 & 2) != 0 ? null : -1, null, null));
        }
        C0107d c0107d3 = this.f34674e;
        if (c0107d3 != null && (bodyBgIv = ((OrderResultHeaderModel) c0107d3.f683e).getBodyBgIv()) != null) {
            bodyBgIv.setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
        }
        C0107d c0107d4 = this.f34674e;
        if (c0107d4 != null) {
            ((OrderResultCustomerServiceModel) c0107d4.f682d).d(Boolean.FALSE);
        }
        C0107d c0107d5 = this.f34674e;
        if (c0107d5 != null) {
            ((OrderResultCustomerServiceModel) c0107d5.f682d).setOnCustomerServiceModelListener(new p160ke.a(this));
        }
    }
}
