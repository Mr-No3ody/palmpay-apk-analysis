package com.transsnet.palmpay.cash_in.ui.activity;

import A8.b;
import A9.a;
import Ab.D;
import C9.B;
import C9.C;
import Pa.C0525w;
import Pa.r0;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.cash_in.network.IRechargeService;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeUSSDResultActivity;
import com.transsnet.palmpay.cash_in.ui.view.ModelUssdInfo;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.rsp.QueryPaymentRewardRsp;
import com.transsnet.palmpay.core.bean.rsp.USSDFundResp;
import com.transsnet.palmpay.core.dialog.PaymentRewardsDialog;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashin/ussd_result")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/RechargeUSSDResultActivity;", "Lcom/transsnet/palmpay/core/base/h;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RechargeUSSDResultActivity extends h implements View.OnClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f26885p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f26886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f26887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public USSDFundResp.USSDDataBean f26892g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public QueryPaymentRewardRsp.DataBean f26893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26894j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PaymentRewardsDialog f26895o;

    public RechargeUSSDResultActivity() {
        final int i7 = 0;
        this.f26886a = C2131j.b(new Function0(this) { // from class: C9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeUSSDResultActivity f1249b;

            {
                this.f1249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeUSSDResultActivity rechargeUSSDResultActivity = this.f1249b;
                switch (i7) {
                    case 0:
                        int i10 = RechargeUSSDResultActivity.f26885p;
                        return (ModelUssdInfo) rechargeUSSDResultActivity.findViewById(p366y9.b.ussdInfo);
                    case 1:
                        int i11 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemPoints);
                    case 2:
                        int i12 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemFee);
                    case 3:
                        int i13 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemAmount);
                    case 4:
                        int i14 = RechargeUSSDResultActivity.f26885p;
                        return (TextView) rechargeUSSDResultActivity.findViewById(p366y9.b.tvAmount);
                    default:
                        int i15 = RechargeUSSDResultActivity.f26885p;
                        return (IconicsImageView) rechargeUSSDResultActivity.findViewById(p366y9.b.ivClose);
                }
            }
        });
        final int i10 = 1;
        this.f26887b = C2131j.b(new Function0(this) { // from class: C9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeUSSDResultActivity f1249b;

            {
                this.f1249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeUSSDResultActivity rechargeUSSDResultActivity = this.f1249b;
                switch (i10) {
                    case 0:
                        int i11 = RechargeUSSDResultActivity.f26885p;
                        return (ModelUssdInfo) rechargeUSSDResultActivity.findViewById(p366y9.b.ussdInfo);
                    case 1:
                        int i12 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemPoints);
                    case 2:
                        int i13 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemFee);
                    case 3:
                        int i14 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemAmount);
                    case 4:
                        int i15 = RechargeUSSDResultActivity.f26885p;
                        return (TextView) rechargeUSSDResultActivity.findViewById(p366y9.b.tvAmount);
                    default:
                        int i16 = RechargeUSSDResultActivity.f26885p;
                        return (IconicsImageView) rechargeUSSDResultActivity.findViewById(p366y9.b.ivClose);
                }
            }
        });
        final int i11 = 2;
        this.f26888c = C2131j.b(new Function0(this) { // from class: C9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeUSSDResultActivity f1249b;

            {
                this.f1249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeUSSDResultActivity rechargeUSSDResultActivity = this.f1249b;
                switch (i11) {
                    case 0:
                        int i12 = RechargeUSSDResultActivity.f26885p;
                        return (ModelUssdInfo) rechargeUSSDResultActivity.findViewById(p366y9.b.ussdInfo);
                    case 1:
                        int i13 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemPoints);
                    case 2:
                        int i14 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemFee);
                    case 3:
                        int i15 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemAmount);
                    case 4:
                        int i16 = RechargeUSSDResultActivity.f26885p;
                        return (TextView) rechargeUSSDResultActivity.findViewById(p366y9.b.tvAmount);
                    default:
                        int i17 = RechargeUSSDResultActivity.f26885p;
                        return (IconicsImageView) rechargeUSSDResultActivity.findViewById(p366y9.b.ivClose);
                }
            }
        });
        final int i12 = 3;
        this.f26889d = C2131j.b(new Function0(this) { // from class: C9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeUSSDResultActivity f1249b;

            {
                this.f1249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeUSSDResultActivity rechargeUSSDResultActivity = this.f1249b;
                switch (i12) {
                    case 0:
                        int i13 = RechargeUSSDResultActivity.f26885p;
                        return (ModelUssdInfo) rechargeUSSDResultActivity.findViewById(p366y9.b.ussdInfo);
                    case 1:
                        int i14 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemPoints);
                    case 2:
                        int i15 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemFee);
                    case 3:
                        int i16 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemAmount);
                    case 4:
                        int i17 = RechargeUSSDResultActivity.f26885p;
                        return (TextView) rechargeUSSDResultActivity.findViewById(p366y9.b.tvAmount);
                    default:
                        int i18 = RechargeUSSDResultActivity.f26885p;
                        return (IconicsImageView) rechargeUSSDResultActivity.findViewById(p366y9.b.ivClose);
                }
            }
        });
        final int i13 = 4;
        this.f26890e = C2131j.b(new Function0(this) { // from class: C9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeUSSDResultActivity f1249b;

            {
                this.f1249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeUSSDResultActivity rechargeUSSDResultActivity = this.f1249b;
                switch (i13) {
                    case 0:
                        int i14 = RechargeUSSDResultActivity.f26885p;
                        return (ModelUssdInfo) rechargeUSSDResultActivity.findViewById(p366y9.b.ussdInfo);
                    case 1:
                        int i15 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemPoints);
                    case 2:
                        int i16 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemFee);
                    case 3:
                        int i17 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemAmount);
                    case 4:
                        int i18 = RechargeUSSDResultActivity.f26885p;
                        return (TextView) rechargeUSSDResultActivity.findViewById(p366y9.b.tvAmount);
                    default:
                        int i19 = RechargeUSSDResultActivity.f26885p;
                        return (IconicsImageView) rechargeUSSDResultActivity.findViewById(p366y9.b.ivClose);
                }
            }
        });
        final int i14 = 5;
        this.f26891f = C2131j.b(new Function0(this) { // from class: C9.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeUSSDResultActivity f1249b;

            {
                this.f1249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeUSSDResultActivity rechargeUSSDResultActivity = this.f1249b;
                switch (i14) {
                    case 0:
                        int i15 = RechargeUSSDResultActivity.f26885p;
                        return (ModelUssdInfo) rechargeUSSDResultActivity.findViewById(p366y9.b.ussdInfo);
                    case 1:
                        int i16 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemPoints);
                    case 2:
                        int i17 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemFee);
                    case 3:
                        int i18 = RechargeUSSDResultActivity.f26885p;
                        return (ModelItemFee) rechargeUSSDResultActivity.findViewById(p366y9.b.itemAmount);
                    case 4:
                        int i19 = RechargeUSSDResultActivity.f26885p;
                        return (TextView) rechargeUSSDResultActivity.findViewById(p366y9.b.tvAmount);
                    default:
                        int i110 = RechargeUSSDResultActivity.f26885p;
                        return (IconicsImageView) rechargeUSSDResultActivity.findViewById(p366y9.b.ivClose);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_activity_ussd_add_money_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        C0525w c0525wF = C0525w.f();
        String stringExtra = getIntent().getStringExtra("extra_data");
        c0525wF.getClass();
        this.f26892g = (USSDFundResp.USSDDataBean) C0525w.d(stringExtra, USSDFundResp.USSDDataBean.class);
        Object value = this.f26886a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ModelUssdInfo modelUssdInfo = (ModelUssdInfo) value;
        USSDFundResp.USSDDataBean uSSDDataBean = this.f26892g;
        modelUssdInfo.g(uSSDDataBean != null ? uSSDDataBean.dialCode : null);
        Object value2 = this.f26891f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((IconicsImageView) value2).setOnClickListener(new b(this, 22));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        if (this.f26894j) {
            finish();
            return;
        }
        PaymentRewardsDialog paymentRewardsDialog = new PaymentRewardsDialog(this);
        this.f26895o = paymentRewardsDialog;
        paymentRewardsDialog.setMCallback(new B(this));
        PaymentRewardsDialog paymentRewardsDialog2 = this.f26895o;
        Intrinsics.e(paymentRewardsDialog2);
        paymentRewardsDialog2.show();
        PaymentRewardsDialog paymentRewardsDialog3 = this.f26895o;
        Intrinsics.e(paymentRewardsDialog3);
        String string = getString(k.core_transaction_not_complete);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        paymentRewardsDialog3.setTitleString(string);
        PaymentRewardsDialog paymentRewardsDialog4 = this.f26895o;
        Intrinsics.e(paymentRewardsDialog4);
        paymentRewardsDialog4.fillData(this.f26893i);
        this.f26894j = true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        if (v3 == null || v3.getId() != p366y9.b.ussd_call_bt) {
            return;
        }
        finish();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i7 != 4 || event.getRepeatCount() != 0) {
            return false;
        }
        m();
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String stringExtra;
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("orderId")) != null) {
            showLoadingDialog(true);
            ((IRechargeService) a.f95a.f35518b).queryCashInDetail(stringExtra).k(f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 3));
        }
        ((PayApiService) p324va.c.f43141a.f14621b).queryPaymentReward(23, "01").k(f.f42629b).i(p071ef.b.a()).subscribe(new C(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Object value = this.f26890e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(r0.B(0L, false));
    }
}
