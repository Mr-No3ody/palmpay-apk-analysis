package com.transsnet.palmpay.airtime.ui;

import L6.b;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.F;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeDownTimeOrderUpdateRsp;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;
import com.transsnet.palmpay.custom_view.model.TransactionDetailHeaderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "话费/维护期交易结果", path = "/airtime/airtime_down_time_transaction_result_activity", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/DownTimeTransactionResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "LRd/F;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DownTimeTransactionResultActivity extends BaseMvvmVBActivity<BaseViewModel, F> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26469e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate f26470d;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_airtime_activity_down_time_order_detail, (ViewGroup) null, false);
        int i7 = c.layout_bottom;
        if (((LinearLayout) a.m(i7, viewInflate)) != null) {
            i7 = c.model_bill_type_item;
            ModelPreviewItem modelPreviewItem = (ModelPreviewItem) a.m(i7, viewInflate);
            if (modelPreviewItem != null) {
                i7 = c.model_order_result_header;
                TransactionDetailHeaderModel transactionDetailHeaderModel = (TransactionDetailHeaderModel) a.m(i7, viewInflate);
                if (transactionDetailHeaderModel != null) {
                    i7 = c.model_phone_item;
                    ModelPreviewItem modelPreviewItem2 = (ModelPreviewItem) a.m(i7, viewInflate);
                    if (modelPreviewItem2 != null) {
                        i7 = c.model_provider_item;
                        ModelPreviewItem modelPreviewItem3 = (ModelPreviewItem) a.m(i7, viewInflate);
                        if (modelPreviewItem3 != null) {
                            i7 = c.scrollView;
                            if (((NestedScrollView) a.m(i7, viewInflate)) != null) {
                                i7 = c.tv_complete;
                                TextView textView = (TextView) a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = c.tv_top_up_again;
                                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        F f10 = new F((LinearLayout) viewInflate, modelPreviewItem, transactionDetailHeaderModel, modelPreviewItem2, modelPreviewItem3, textView, textView2);
                                        Intrinsics.checkNotNullExpressionValue(f10, "inflate(...)");
                                        return f10;
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        F f10 = (F) this.f27334c;
        if (f10 != null) {
            f10.f8047g.setOnClickListener(new ViewOnClickListenerC1649v(this, 17));
        }
        F f11 = (F) this.f27334c;
        if (f11 != null) {
            f11.f8046f.setOnClickListener(new p054dd.d(16));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        F f10;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate airtimeDownTimeOrderUpdate = this.f26470d;
        if (airtimeDownTimeOrderUpdate != null) {
            Long status = airtimeDownTimeOrderUpdate.getStatus();
            if (status != null && ((int) status.longValue()) == 21 && (f10 = (F) this.f27334c) != null) {
                f10.f8043c.e(getString(f.qt_airtime_down_time_order_success_tips));
            }
            F f11 = (F) this.f27334c;
            if (f11 != null) {
                f11.f8043c.d(TransactionDetailHeaderModel.f31640f.getTransactionStatusIconByDes(airtimeDownTimeOrderUpdate.getStatusDesc()));
            }
            F f12 = (F) this.f27334c;
            if (f12 != null) {
                f12.f8043c.f(airtimeDownTimeOrderUpdate.getStatusDesc());
            }
            F f13 = (F) this.f27334c;
            if (f13 != null) {
                TransactionDetailHeaderModel transactionDetailHeaderModel = f13.f8043c;
                Long amount = airtimeDownTimeOrderUpdate.getAmount();
                transactionDetailHeaderModel.c(r0.B(amount != null ? amount.longValue() : 0L, false));
            }
            F f14 = (F) this.f27334c;
            if (f14 != null) {
                f14.f8044d.setContent(airtimeDownTimeOrderUpdate.getPhone());
            }
            F f15 = (F) this.f27334c;
            if (f15 != null) {
                f15.f8045e.setContent(airtimeDownTimeOrderUpdate.getBillerName());
            }
            String string = getString(k.core_airtime);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY.equals(airtimeDownTimeOrderUpdate.getTransType())) {
                string = getString(f.qt_airtime_special_top_up);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            F f16 = (F) this.f27334c;
            if (f16 != null) {
                f16.f8042b.setContent(string);
            }
        }
    }
}
