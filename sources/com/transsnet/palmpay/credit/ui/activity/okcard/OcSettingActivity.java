package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ya.e;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSettingActivity;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p071ef.b;
import p221ob.c;
import p294tb.C2055q;
import p298tf.f;
import p310ub.h1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC设置页面", path = "/credit_score/oc_setting_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcSettingActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcSettingActivity extends Za.b {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29872g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29874j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29876p;

    public OcSettingActivity() {
        final int i7 = 0;
        this.f29869d = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i7) {
                    case 0:
                        int i10 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i11 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i12 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i13 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i14 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i15 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i16 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
        final int i10 = 1;
        this.f29870e = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i10) {
                    case 0:
                        int i11 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i12 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i13 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i14 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i15 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i16 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i18 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
        final int i11 = 2;
        this.f29871f = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i11) {
                    case 0:
                        int i12 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i13 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i14 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i15 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i16 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i18 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i19 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
        final int i12 = 3;
        this.f29872g = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i12) {
                    case 0:
                        int i13 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i14 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i15 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i16 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i18 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i19 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i110 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
        final int i13 = 4;
        this.f29873i = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i13) {
                    case 0:
                        int i14 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i15 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i16 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i18 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i19 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i110 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i111 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
        final int i14 = 5;
        this.f29874j = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i14) {
                    case 0:
                        int i15 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i16 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i18 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i19 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i110 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i111 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i112 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
        final int i15 = 6;
        this.f29875o = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i15) {
                    case 0:
                        int i16 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i18 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i19 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i110 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i111 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i112 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i113 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
        final int i16 = 7;
        this.f29876p = C2131j.b(new Function0(this) { // from class: ub.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42925b;

            {
                this.f42925b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSettingActivity ocSettingActivity = this.f42925b;
                switch (i16) {
                    case 0:
                        int i17 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.privacy_tv);
                    case 1:
                        int i18 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.condition_tv);
                    case 2:
                        int i19 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.auto_repay_tv);
                    case 3:
                        int i110 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.repayment_info_tv);
                    case 4:
                        int i111 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.preferred_pay_tv);
                    case 5:
                        int i112 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.bill_history_tv);
                    case 6:
                        int i113 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.overpayment_tv);
                    default:
                        int i114 = OcSettingActivity.t;
                        return (TextView) ocSettingActivity.findViewById(e.increase_limit_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_setting_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode(this, !isDarkMode());
        org.greenrobot.eventbus.c.b().j(this);
        Object value = this.f29876p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        p220oa.h.l(new h1(6), (TextView) value);
        Object value2 = this.f29875o.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        p220oa.h.l(new h1(7), (TextView) value2);
        Object value3 = this.f29871f.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        p220oa.h.l(new h1(3), (TextView) value3);
        Object value4 = this.f29874j.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.u1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42931b;

            {
                this.f42931b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcSettingActivity ocSettingActivity = this.f42931b;
                switch (i7) {
                    case 0:
                        int i10 = OcSettingActivity.t;
                        ARouter.getInstance().build("/credit_score/oc_bill_history_activity").navigation(ocSettingActivity);
                        break;
                    case 1:
                        int i11 = OcSettingActivity.t;
                        ocSettingActivity.showLoadingDialog(true);
                        c.f40268a.getInstance().getClass();
                        c.a().okCardMainPage("1").k(f.f42629b).i(b.a()).subscribe(new C2055q(ocSettingActivity, 27));
                        break;
                    default:
                        int i12 = OcSettingActivity.t;
                        ARouter.getInstance().build("/credit_score/oc_set_default_pay_method_activity").navigation(ocSettingActivity);
                        break;
                }
            }
        }, (TextView) value4);
        Object value5 = this.f29872g.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        TextView textView = (TextView) value5;
        if (textView != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: ub.u1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcSettingActivity f42931b;

                {
                    this.f42931b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OcSettingActivity ocSettingActivity = this.f42931b;
                    switch (i10) {
                        case 0:
                            int i11 = OcSettingActivity.t;
                            ARouter.getInstance().build("/credit_score/oc_bill_history_activity").navigation(ocSettingActivity);
                            break;
                        case 1:
                            int i12 = OcSettingActivity.t;
                            ocSettingActivity.showLoadingDialog(true);
                            c.f40268a.getInstance().getClass();
                            c.a().okCardMainPage("1").k(f.f42629b).i(b.a()).subscribe(new C2055q(ocSettingActivity, 27));
                            break;
                        default:
                            int i13 = OcSettingActivity.t;
                            ARouter.getInstance().build("/credit_score/oc_set_default_pay_method_activity").navigation(ocSettingActivity);
                            break;
                    }
                }
            }, textView);
        }
        Object value6 = this.f29870e.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        p220oa.h.l(new h1(4), (TextView) value6);
        Object value7 = this.f29869d.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        p220oa.h.l(new h1(5), (TextView) value7);
        Object value8 = this.f29873i.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.u1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSettingActivity f42931b;

            {
                this.f42931b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcSettingActivity ocSettingActivity = this.f42931b;
                switch (i11) {
                    case 0:
                        int i12 = OcSettingActivity.t;
                        ARouter.getInstance().build("/credit_score/oc_bill_history_activity").navigation(ocSettingActivity);
                        break;
                    case 1:
                        int i13 = OcSettingActivity.t;
                        ocSettingActivity.showLoadingDialog(true);
                        c.f40268a.getInstance().getClass();
                        c.a().okCardMainPage("1").k(f.f42629b).i(b.a()).subscribe(new C2055q(ocSettingActivity, 27));
                        break;
                    default:
                        int i14 = OcSettingActivity.t;
                        ARouter.getInstance().build("/credit_score/oc_set_default_pay_method_activity").navigation(ocSettingActivity);
                        break;
                }
            }
        }, (TextView) value8);
    }
}
