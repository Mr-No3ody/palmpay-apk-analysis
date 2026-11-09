package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendResultActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p025ba.k;
import p220oa.h;
import p221ob.c;
import p294tb.g0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit展期还款结果页", path = "/credit_score/cl_repayment_extend_result__activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepaymentExtendResultActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentExtendResultActivity extends b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f29091B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29092A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29096g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29098j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29100p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f29101v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f29102w;

    public CLRepaymentExtendResultActivity() {
        final int i7 = 1;
        this.f29093d = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i11 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i12 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i13 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i14 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i15 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i16 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
        final int i10 = 2;
        this.f29094e = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i12 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i13 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i14 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i15 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i16 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i18 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
        final int i11 = 3;
        this.f29095f = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i11) {
                    case 0:
                        int i12 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i13 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i14 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i15 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i16 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i18 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i19 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
        final int i12 = 4;
        this.f29096g = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i12) {
                    case 0:
                        int i13 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i14 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i15 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i16 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i18 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i19 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i110 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
        final int i13 = 5;
        this.f29097i = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i13) {
                    case 0:
                        int i14 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i15 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i16 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i18 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i19 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i110 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i111 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
        final int i14 = 6;
        this.f29098j = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i14) {
                    case 0:
                        int i15 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i16 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i18 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i19 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i110 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i111 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i112 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
        final int i15 = 7;
        this.f29099o = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i15) {
                    case 0:
                        int i16 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i18 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i19 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i110 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i111 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i112 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i113 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
        final int i16 = 0;
        this.f29100p = C2131j.b(new Function0(this) { // from class: tb.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42467b;

            {
                this.f42467b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42467b;
                switch (i16) {
                    case 0:
                        int i17 = CLRepaymentExtendResultActivity.f29091B;
                        return (ImageView) cLRepaymentExtendResultActivity.findViewById(e.repayment_status_img);
                    case 1:
                        int i18 = CLRepaymentExtendResultActivity.f29091B;
                        return (SingleAdView) cLRepaymentExtendResultActivity.findViewById(e.cl_extend_result_sav);
                    case 2:
                        int i19 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_complete_bt);
                    case 3:
                        int i110 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.repay_left_bt);
                    case 4:
                        int i111 = CLRepaymentExtendResultActivity.f29091B;
                        return (Button) cLRepaymentExtendResultActivity.findViewById(e.view_extension_bt);
                    case 5:
                        int i112 = CLRepaymentExtendResultActivity.f29091B;
                        return (LinearLayout) cLRepaymentExtendResultActivity.findViewById(e.failed_ll);
                    case 6:
                        int i113 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_content_tv);
                    default:
                        int i114 = CLRepaymentExtendResultActivity.f29091B;
                        return (TextView) cLRepaymentExtendResultActivity.findViewById(e.status_title_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_repayment_extend_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final Button m() {
        Object value = this.f29094e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        G.h(c.f40268a).getOcRepayResult(this.f29102w, null).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new g0(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.t = getIntent().getStringExtra("payStatus");
        this.f29102w = getIntent().getStringExtra("orderNo");
        this.f29101v = getIntent().getStringExtra("orderDesc");
        String str = this.t;
        Integer num = 1;
        boolean zC = Intrinsics.c(str, num.toString());
        t tVar = this.f29097i;
        t tVar2 = this.f29098j;
        t tVar3 = this.f29099o;
        t tVar4 = this.f29100p;
        if (zC) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_REPAYMENT_SUCCESS));
            Object value = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ImageView) value).setImageResource(d.cs_cl_borrow_success_icon);
            Object value2 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(getString(g.cs_cl_repayment_success));
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setText(getString(g.cs_cl_all_repay_success_content));
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((LinearLayout) value4).setVisibility(0);
            m().setVisibility(8);
            Object value5 = this.f29093d.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((SingleAdView) value5).setSlotId(getString(g.cl_repayment_extend_result_slot_id));
        } else {
            Integer num2 = 2;
            if (Intrinsics.c(str, num2.toString())) {
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_REPAYMENT_FAILED));
                Object value6 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((ImageView) value6).setImageResource(d.cs_operation_fail_icon);
                Object value7 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((TextView) value7).setText(getString(g.cs_cl_repayment_failed));
                Object value8 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((TextView) value8).setText(getString(g.cs_cl_check_your_bank_account));
                m().setText(getString(k.core_back));
                Object value9 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((LinearLayout) value9).setVisibility(8);
                m().setVisibility(0);
            } else {
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_REPAYMENT_PENDING));
                Object value10 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((ImageView) value10).setImageResource(d.cs_cl_borrow_pending_icon);
                Object value11 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                ((TextView) value11).setText(getString(g.cs_cl_sixty_sec));
                Object value12 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                ((TextView) value12).setText(getString(g.cs_cl_borrow_pending_content));
                m().setText(getString(k.core_back));
                Object value13 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                ((LinearLayout) value13).setVisibility(8);
                m().setVisibility(0);
            }
        }
        if (!TextUtils.isEmpty(this.f29101v)) {
            try {
                String str2 = this.f29101v;
                Intrinsics.e(str2);
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("amountInfo"));
                jSONObject.optInt("payType");
                jSONObject2.optLong("transAmount");
                jSONObject.optString("bankName");
                jSONObject.optString("bankCard");
                jSONObject.optString("receiveAccount");
                jSONObject.optLong("billId");
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42463b;

            {
                this.f42463b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42463b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepaymentExtendResultActivity.f29091B;
                        ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                        cLRepaymentExtendResultActivity.finish();
                        break;
                    case 1:
                        int i11 = CLRepaymentExtendResultActivity.f29091B;
                        ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                        cLRepaymentExtendResultActivity.finish();
                        break;
                    default:
                        int i12 = CLRepaymentExtendResultActivity.f29091B;
                        cLRepaymentExtendResultActivity.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("loanNo", cLRepaymentExtendResultActivity.f29092A);
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                        cLRepaymentExtendResultActivity.finish();
                        break;
                }
            }
        }, m());
        Object value14 = this.f29095f.getValue();
        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42463b;

            {
                this.f42463b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42463b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepaymentExtendResultActivity.f29091B;
                        ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                        cLRepaymentExtendResultActivity.finish();
                        break;
                    case 1:
                        int i12 = CLRepaymentExtendResultActivity.f29091B;
                        ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                        cLRepaymentExtendResultActivity.finish();
                        break;
                    default:
                        int i13 = CLRepaymentExtendResultActivity.f29091B;
                        cLRepaymentExtendResultActivity.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("loanNo", cLRepaymentExtendResultActivity.f29092A);
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                        cLRepaymentExtendResultActivity.finish();
                        break;
                }
            }
        }, (Button) value14);
        Object value15 = this.f29096g.getValue();
        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendResultActivity f42463b;

            {
                this.f42463b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42463b;
                switch (i11) {
                    case 0:
                        int i12 = CLRepaymentExtendResultActivity.f29091B;
                        ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                        cLRepaymentExtendResultActivity.finish();
                        break;
                    case 1:
                        int i13 = CLRepaymentExtendResultActivity.f29091B;
                        ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                        cLRepaymentExtendResultActivity.finish();
                        break;
                    default:
                        int i14 = CLRepaymentExtendResultActivity.f29091B;
                        cLRepaymentExtendResultActivity.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("loanNo", cLRepaymentExtendResultActivity.f29092A);
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                        cLRepaymentExtendResultActivity.finish();
                        break;
                }
            }
        }, (Button) value15);
    }
}
