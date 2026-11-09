package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Pa.r0;
import Ya.e;
import Ya.f;
import Za.b;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInterestDetailActivity;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit利息详情页", path = "/credit_score/cl_interest_detail_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLInterestDetailActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInterestDetailActivity extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28935g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28938f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public CLInterestDetailActivity() {
        final int i7 = 0;
        this.f28936d = C2131j.b(new Function0(this) { // from class: tb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInterestDetailActivity f42504b;

            {
                this.f42504b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInterestDetailActivity cLInterestDetailActivity = this.f42504b;
                switch (i7) {
                    case 0:
                        int i10 = CLInterestDetailActivity.f28935g;
                        return (TextView) cLInterestDetailActivity.findViewById(e.overdue_days_interest_tv);
                    case 1:
                        int i11 = CLInterestDetailActivity.f28935g;
                        return (TextView) cLInterestDetailActivity.findViewById(e.in_days_interest_tv);
                    default:
                        int i12 = CLInterestDetailActivity.f28935g;
                        return (ImageView) cLInterestDetailActivity.findViewById(e.topBg);
                }
            }
        });
        final int i10 = 1;
        this.f28937e = C2131j.b(new Function0(this) { // from class: tb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInterestDetailActivity f42504b;

            {
                this.f42504b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInterestDetailActivity cLInterestDetailActivity = this.f42504b;
                switch (i10) {
                    case 0:
                        int i11 = CLInterestDetailActivity.f28935g;
                        return (TextView) cLInterestDetailActivity.findViewById(e.overdue_days_interest_tv);
                    case 1:
                        int i12 = CLInterestDetailActivity.f28935g;
                        return (TextView) cLInterestDetailActivity.findViewById(e.in_days_interest_tv);
                    default:
                        int i13 = CLInterestDetailActivity.f28935g;
                        return (ImageView) cLInterestDetailActivity.findViewById(e.topBg);
                }
            }
        });
        final int i11 = 2;
        this.f28938f = C2131j.b(new Function0(this) { // from class: tb.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInterestDetailActivity f42504b;

            {
                this.f42504b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInterestDetailActivity cLInterestDetailActivity = this.f42504b;
                switch (i11) {
                    case 0:
                        int i12 = CLInterestDetailActivity.f28935g;
                        return (TextView) cLInterestDetailActivity.findViewById(e.overdue_days_interest_tv);
                    case 1:
                        int i13 = CLInterestDetailActivity.f28935g;
                        return (TextView) cLInterestDetailActivity.findViewById(e.in_days_interest_tv);
                    default:
                        int i14 = CLInterestDetailActivity.f28935g;
                        return (ImageView) cLInterestDetailActivity.findViewById(e.topBg);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_interest_detail_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
        double doubleExtra = getIntent().getDoubleExtra("cl_bill_interest", 0.0d);
        double doubleExtra2 = getIntent().getDoubleExtra("cl_bill_penalty_interest", 0.0d);
        Object value = this.f28937e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(decimalFormat.format(doubleExtra));
        Object value2 = this.f28936d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(decimalFormat.format(doubleExtra2));
        r0.l1(r0.y0("cs_cl_repayment_date_img.webp"), (ImageView) this.f28938f.getValue());
    }
}
