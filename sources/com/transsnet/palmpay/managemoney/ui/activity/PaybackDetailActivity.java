package com.transsnet.palmpay.managemoney.ui.activity;

import Qc.b0;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OrderDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/pay_back_detail_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/PaybackDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/OrderDetailViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaybackDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaybackDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/PaybackDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,119:1\n71#2,8:120\n112#2:128\n*S KotlinDebug\n*F\n+ 1 PaybackDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/PaybackDetailActivity\n*L\n79#1:120,8\n79#1:128\n*E\n"})
public final class PaybackDetailActivity extends BaseMvvmActivity<OrderDetailViewModel> {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32146g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f32147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32148j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32150p;

    public PaybackDetailActivity() {
        final int i7 = 1;
        this.f32142c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i7) {
                    case 0:
                        int i10 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i11 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i12 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i13 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i14 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i15 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i16 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i17 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i18 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i10 = 2;
        this.f32143d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i10) {
                    case 0:
                        int i11 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i12 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i13 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i14 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i15 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i16 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i17 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i18 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i19 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i11 = 3;
        this.f32144e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i11) {
                    case 0:
                        int i12 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i13 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i14 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i15 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i16 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i17 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i18 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i19 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i110 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i12 = 4;
        this.f32145f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i12) {
                    case 0:
                        int i13 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i14 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i15 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i16 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i17 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i18 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i19 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i110 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i111 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i13 = 5;
        this.f32146g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i13) {
                    case 0:
                        int i14 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i15 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i16 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i17 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i18 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i19 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i110 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i111 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i112 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i14 = 6;
        this.f32147i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i14) {
                    case 0:
                        int i15 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i16 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i17 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i18 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i19 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i110 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i111 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i112 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i113 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i15 = 7;
        this.f32148j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i15) {
                    case 0:
                        int i16 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i17 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i18 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i19 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i110 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i111 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i112 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i113 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i114 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i16 = 8;
        this.f32149o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i16) {
                    case 0:
                        int i17 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i18 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i19 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i110 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i111 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i112 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i113 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i114 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i115 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
        final int i17 = 0;
        this.f32150p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaybackDetailActivity f32016b;

            {
                this.f32016b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                String stringExtra2;
                PaybackDetailActivity paybackDetailActivity = this.f32016b;
                switch (i17) {
                    case 0:
                        int i18 = PaybackDetailActivity.t;
                        Intent intent = paybackDetailActivity.getIntent();
                        return (intent == null || (stringExtra = intent.getStringExtra("transType")) == null) ? "" : stringExtra;
                    case 1:
                        int i19 = PaybackDetailActivity.t;
                        return paybackDetailActivity.findViewById(Jc.c.viewEmpty);
                    case 2:
                        int i110 = PaybackDetailActivity.t;
                        return (ConstraintLayout) paybackDetailActivity.findViewById(Jc.c.layoutCustomerService);
                    case 3:
                        int i111 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOriginalTransaction);
                    case 4:
                        int i112 = PaybackDetailActivity.t;
                        return (LinearLayout) paybackDetailActivity.findViewById(Jc.c.layoutOrderDetailInfo);
                    case 5:
                        int i113 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderStatus);
                    case 6:
                        int i114 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderAmount);
                    case 7:
                        int i115 = PaybackDetailActivity.t;
                        return (TextView) paybackDetailActivity.findViewById(Jc.c.tvOrderName);
                    default:
                        int i116 = PaybackDetailActivity.t;
                        Intent intent2 = paybackDetailActivity.getIntent();
                        return (intent2 == null || (stringExtra2 = intent2.getStringExtra("orderNo")) == null) ? "" : stringExtra2;
                }
            }
        });
    }

    public static final LinearLayout m(PaybackDetailActivity paybackDetailActivity) {
        Object value = paybackDetailActivity.f32145f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_pay_back_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((OrderDetailViewModel) l()).f32779e;
        if (lVar != null) {
            lVar.e(this, new T8.f(new T8.o(14, this, this), (byte) 0, (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        OrderDetailViewModel orderDetailViewModel = (OrderDetailViewModel) l();
        String str = (String) this.f32149o.getValue();
        String str2 = (String) this.f32150p.getValue();
        orderDetailViewModel.getClass();
        AbstractC0780y.m(androidx.lifecycle.V.h(orderDetailViewModel), null, null, new b0(str, str2, orderDetailViewModel, null), 3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(Jc.a.mm_color_f6f6fa), true);
        Object value = this.f32144e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).setOnClickListener(new ViewOnClickListenerC1533v(this, 26));
        Object value2 = this.f32143d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((ConstraintLayout) value2).setOnClickListener(new ViewOnClickListenerC1478l(14));
    }
}
