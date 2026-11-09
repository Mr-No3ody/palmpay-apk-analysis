package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.C0525w;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.core.bean.rsp.USSDFundResp;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/core/ussd_pay_result")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/USSDPayResultActivity;", "Lcom/transsnet/palmpay/core/base/h;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class USSDPayResultActivity extends com.transsnet.palmpay.core.base.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f27714j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f27717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f27718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f27719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public USSDFundResp.USSDDataBean f27720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27721g = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27722i = "";

    public USSDPayResultActivity() {
        final int i7 = 0;
        this.f27715a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDPayResultActivity f27767b;

            {
                this.f27767b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                USSDPayResultActivity uSSDPayResultActivity = this.f27767b;
                switch (i7) {
                    case 0:
                        int i10 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_complete_bt);
                    case 1:
                        int i11 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_call_bt);
                    case 2:
                        int i12 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_tip_tv);
                    case 3:
                        int i13 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_step_rv);
                    default:
                        int i14 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.ussd_phone_num_tv);
                }
            }
        });
        final int i10 = 1;
        this.f27716b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDPayResultActivity f27767b;

            {
                this.f27767b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                USSDPayResultActivity uSSDPayResultActivity = this.f27767b;
                switch (i10) {
                    case 0:
                        int i11 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_complete_bt);
                    case 1:
                        int i12 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_call_bt);
                    case 2:
                        int i13 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_tip_tv);
                    case 3:
                        int i14 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_step_rv);
                    default:
                        int i15 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.ussd_phone_num_tv);
                }
            }
        });
        final int i11 = 2;
        this.f27717c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDPayResultActivity f27767b;

            {
                this.f27767b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                USSDPayResultActivity uSSDPayResultActivity = this.f27767b;
                switch (i11) {
                    case 0:
                        int i12 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_complete_bt);
                    case 1:
                        int i13 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_call_bt);
                    case 2:
                        int i14 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_tip_tv);
                    case 3:
                        int i15 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_step_rv);
                    default:
                        int i16 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.ussd_phone_num_tv);
                }
            }
        });
        final int i12 = 3;
        this.f27718d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDPayResultActivity f27767b;

            {
                this.f27767b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                USSDPayResultActivity uSSDPayResultActivity = this.f27767b;
                switch (i12) {
                    case 0:
                        int i13 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_complete_bt);
                    case 1:
                        int i14 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_call_bt);
                    case 2:
                        int i15 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_tip_tv);
                    case 3:
                        int i16 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_step_rv);
                    default:
                        int i17 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.ussd_phone_num_tv);
                }
            }
        });
        final int i13 = 4;
        this.f27719e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDPayResultActivity f27767b;

            {
                this.f27767b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                USSDPayResultActivity uSSDPayResultActivity = this.f27767b;
                switch (i13) {
                    case 0:
                        int i14 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_complete_bt);
                    case 1:
                        int i15 = USSDPayResultActivity.f27714j;
                        return (Button) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_call_bt);
                    case 2:
                        int i16 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_tip_tv);
                    case 3:
                        int i17 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.core_ussd_step_rv);
                    default:
                        int i18 = USSDPayResultActivity.f27714j;
                        return (TextView) uSSDPayResultActivity.findViewById(p025ba.e.ussd_phone_num_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p025ba.g.core_activity_ussd_pay_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        C0525w c0525wF = C0525w.f();
        String stringExtra = getIntent().getStringExtra("extra_data");
        c0525wF.getClass();
        this.f27720f = (USSDFundResp.USSDDataBean) C0525w.d(stringExtra, USSDFundResp.USSDDataBean.class);
        this.f27721g = getIntent().getStringExtra("extra_type");
        this.f27722i = getIntent().getStringExtra("orderId");
        Object value = this.f27719e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        USSDFundResp.USSDDataBean uSSDDataBean = this.f27720f;
        textView.setText(uSSDDataBean != null ? uSSDDataBean.dialCode : null);
        Object value2 = this.f27718d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView textView2 = (TextView) value2;
        USSDFundResp.USSDDataBean uSSDDataBean2 = this.f27720f;
        textView2.setText(uSSDDataBean2 != null ? uSSDDataBean2.opGuide : null);
        USSDFundResp.USSDDataBean uSSDDataBean3 = this.f27720f;
        boolean zIsEmpty = TextUtils.isEmpty(uSSDDataBean3 != null ? uSSDDataBean3.opTips : null);
        p355xf.t tVar = this.f27717c;
        if (zIsEmpty) {
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setVisibility(8);
        } else {
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            TextView textView3 = (TextView) value4;
            USSDFundResp.USSDDataBean uSSDDataBean4 = this.f27720f;
            textView3.setText(uSSDDataBean4 != null ? uSSDDataBean4.opTips : null);
        }
        boolean zEquals = "01".equals(this.f27721g);
        p355xf.t tVar2 = this.f27715a;
        if (zEquals) {
            Object value5 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((Button) value5).setText(p025ba.k.core_back_fun_page);
        } else {
            Object value6 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((Button) value6).setText(p025ba.k.core_complete);
        }
        Object value7 = this.f27716b.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i7 = 0;
        ((Button) value7).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDPayResultActivity f27763b;

            {
                this.f27763b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                USSDPayResultActivity uSSDPayResultActivity = this.f27763b;
                switch (i7) {
                    case 0:
                        int i10 = USSDPayResultActivity.f27714j;
                        try {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            Object value8 = uSSDPayResultActivity.f27719e.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            Uri uri = Uri.parse("tel:" + Uri.encode(((TextView) value8).getText().toString()));
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            intent.setData(uri);
                            uSSDPayResultActivity.startActivity(intent);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            return;
                        }
                        break;
                    default:
                        if (!"01".equals(uSSDPayResultActivity.f27721g)) {
                            Ea.a.e(uSSDPayResultActivity.f27721g, uSSDPayResultActivity.f27722i, "");
                        } else if (ActivityUtils.isActivityExists("com.transsnet.palmpay.cash_in.ui.activity.instruction", "AddMoneyHomeActivity")) {
                            ActivityUtils.finishToActivity((Class<?>) AddMoneyHomeActivity.class, false);
                        } else {
                            q0.u("/cashin_out/add_money");
                        }
                        uSSDPayResultActivity.finish();
                        break;
                }
            }
        });
        Object value8 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i10 = 1;
        ((Button) value8).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDPayResultActivity f27763b;

            {
                this.f27763b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                USSDPayResultActivity uSSDPayResultActivity = this.f27763b;
                switch (i10) {
                    case 0:
                        int i11 = USSDPayResultActivity.f27714j;
                        try {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            Object value9 = uSSDPayResultActivity.f27719e.getValue();
                            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                            Uri uri = Uri.parse("tel:" + Uri.encode(((TextView) value9).getText().toString()));
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            intent.setData(uri);
                            uSSDPayResultActivity.startActivity(intent);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            return;
                        }
                        break;
                    default:
                        if (!"01".equals(uSSDPayResultActivity.f27721g)) {
                            Ea.a.e(uSSDPayResultActivity.f27721g, uSSDPayResultActivity.f27722i, "");
                        } else if (ActivityUtils.isActivityExists("com.transsnet.palmpay.cash_in.ui.activity.instruction", "AddMoneyHomeActivity")) {
                            ActivityUtils.finishToActivity((Class<?>) AddMoneyHomeActivity.class, false);
                        } else {
                            q0.u("/cashin_out/add_money");
                        }
                        uSSDPayResultActivity.finish();
                        break;
                }
            }
        });
    }
}
