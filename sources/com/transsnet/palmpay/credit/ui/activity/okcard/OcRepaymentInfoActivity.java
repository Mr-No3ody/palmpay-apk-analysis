package com.transsnet.palmpay.credit.ui.activity.okcard;

import E.AbstractC0198c;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaymentInfoActivity;
import com.transsnet.palmpay.credit.viewmodel.OcEmptyViewModel;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC还款信息页", path = "/credit_score/oc_repayment_info_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepaymentInfoActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcEmptyViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepaymentInfoActivity extends CreditBaseMvvmActivity<OcEmptyViewModel> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f29856i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29858g;

    public OcRepaymentInfoActivity() {
        final int i7 = 0;
        this.f29857f = C2131j.b(new Function0(this) { // from class: ub.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentInfoActivity f42909b;

            {
                this.f42909b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepaymentInfoActivity ocRepaymentInfoActivity = this.f42909b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepaymentInfoActivity.f29856i;
                        return (TextView) ocRepaymentInfoActivity.findViewById(e.second_repayment_date_tv);
                    default:
                        int i11 = OcRepaymentInfoActivity.f29856i;
                        return (TextView) ocRepaymentInfoActivity.findViewById(e.first_repayment_date_tv);
                }
            }
        });
        final int i10 = 1;
        this.f29858g = C2131j.b(new Function0(this) { // from class: ub.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentInfoActivity f42909b;

            {
                this.f42909b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepaymentInfoActivity ocRepaymentInfoActivity = this.f42909b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepaymentInfoActivity.f29856i;
                        return (TextView) ocRepaymentInfoActivity.findViewById(e.second_repayment_date_tv);
                    default:
                        int i12 = OcRepaymentInfoActivity.f29856i;
                        return (TextView) ocRepaymentInfoActivity.findViewById(e.first_repayment_date_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repayment_info_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Object value = this.f29858g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(AbstractC0198c.C(1));
        Object value2 = this.f29857f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(AbstractC0198c.C(16));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }
}
