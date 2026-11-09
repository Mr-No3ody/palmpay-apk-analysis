package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLPenaltyPeriodActivity;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p285sc.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit罚息期限页", path = "/credit_score/cs_cl_penalty_period_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLPenaltyPeriodActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLPenaltyPeriodActivity extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29006g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29009f;

    public CLPenaltyPeriodActivity() {
        final int i7 = 0;
        this.f29007d = C2131j.b(new Function0(this) { // from class: tb.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPenaltyPeriodActivity f42419b;

            {
                this.f42419b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPenaltyPeriodActivity cLPenaltyPeriodActivity = this.f42419b;
                switch (i7) {
                    case 0:
                        int i10 = CLPenaltyPeriodActivity.f29006g;
                        return (Button) cLPenaltyPeriodActivity.findViewById(e.cl_got_it_bt);
                    case 1:
                        int i11 = CLPenaltyPeriodActivity.f29006g;
                        return (TextView) cLPenaltyPeriodActivity.findViewById(e.cl_penalty_content_tv);
                    default:
                        int i12 = CLPenaltyPeriodActivity.f29006g;
                        return (TextView) cLPenaltyPeriodActivity.findViewById(e.cl_penalty_title_tv);
                }
            }
        });
        final int i10 = 1;
        this.f29008e = C2131j.b(new Function0(this) { // from class: tb.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPenaltyPeriodActivity f42419b;

            {
                this.f42419b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPenaltyPeriodActivity cLPenaltyPeriodActivity = this.f42419b;
                switch (i10) {
                    case 0:
                        int i11 = CLPenaltyPeriodActivity.f29006g;
                        return (Button) cLPenaltyPeriodActivity.findViewById(e.cl_got_it_bt);
                    case 1:
                        int i12 = CLPenaltyPeriodActivity.f29006g;
                        return (TextView) cLPenaltyPeriodActivity.findViewById(e.cl_penalty_content_tv);
                    default:
                        int i13 = CLPenaltyPeriodActivity.f29006g;
                        return (TextView) cLPenaltyPeriodActivity.findViewById(e.cl_penalty_title_tv);
                }
            }
        });
        final int i11 = 2;
        this.f29009f = C2131j.b(new Function0(this) { // from class: tb.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPenaltyPeriodActivity f42419b;

            {
                this.f42419b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPenaltyPeriodActivity cLPenaltyPeriodActivity = this.f42419b;
                switch (i11) {
                    case 0:
                        int i12 = CLPenaltyPeriodActivity.f29006g;
                        return (Button) cLPenaltyPeriodActivity.findViewById(e.cl_got_it_bt);
                    case 1:
                        int i13 = CLPenaltyPeriodActivity.f29006g;
                        return (TextView) cLPenaltyPeriodActivity.findViewById(e.cl_penalty_content_tv);
                    default:
                        int i14 = CLPenaltyPeriodActivity.f29006g;
                        return (TextView) cLPenaltyPeriodActivity.findViewById(e.cl_penalty_title_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_penalty_period_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(Ya.b.cs_common_bg_color));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        int intExtra = getIntent().getIntExtra("cl_remain_days", 1);
        long longExtra = getIntent().getLongExtra("cl_remain_date", 0L);
        t tVar = this.f29009f;
        if (intExtra > 1) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(getString(g.cs_retry_the_upgrade_after_days, Integer.valueOf(intExtra), "s"));
        } else {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(getString(g.cs_retry_the_upgrade_after_days, Integer.valueOf(intExtra), ""));
        }
        Object value3 = this.f29008e.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(getString(g.cs_you_have_not_met_upgrading, r0.X1(Long.valueOf(longExtra), "MMM dd")));
        Object value4 = this.f29007d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        h.l(new x(this, 10), (Button) value4);
    }
}
