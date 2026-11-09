package com.transsnet.palmpay.credit.ui.activity.cashloan;

import V9.C0714c;
import Ya.e;
import Ya.f;
import Za.b;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.transsnet.palmpay.core.bean.req.PaymentMethodReq;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLAutoRepaymentExplainActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p221ob.c;
import p285sc.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit自动还款说明页", path = "/credit_score/ol_auto_repayment_explain_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLAutoRepaymentExplainActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLAutoRepaymentExplainActivity extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28799i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f28802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p351xb.b f28803g;

    public CLAutoRepaymentExplainActivity() {
        final int i7 = 0;
        this.f28800d = C2131j.b(new Function0(this) { // from class: tb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLAutoRepaymentExplainActivity f42445b;

            {
                this.f42445b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLAutoRepaymentExplainActivity cLAutoRepaymentExplainActivity = this.f42445b;
                switch (i7) {
                    case 0:
                        int i10 = CLAutoRepaymentExplainActivity.f28799i;
                        return (RecyclerView) cLAutoRepaymentExplainActivity.findViewById(e.payment_method_rv);
                    default:
                        int i11 = CLAutoRepaymentExplainActivity.f28799i;
                        return (ConstraintLayout) cLAutoRepaymentExplainActivity.findViewById(e.due_date_cl);
                }
            }
        });
        final int i10 = 1;
        this.f28801e = C2131j.b(new Function0(this) { // from class: tb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLAutoRepaymentExplainActivity f42445b;

            {
                this.f42445b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLAutoRepaymentExplainActivity cLAutoRepaymentExplainActivity = this.f42445b;
                switch (i10) {
                    case 0:
                        int i11 = CLAutoRepaymentExplainActivity.f28799i;
                        return (RecyclerView) cLAutoRepaymentExplainActivity.findViewById(e.payment_method_rv);
                    default:
                        int i12 = CLAutoRepaymentExplainActivity.f28799i;
                        return (ConstraintLayout) cLAutoRepaymentExplainActivity.findViewById(e.due_date_cl);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_auto_repay_explain_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PaymentMethodReq paymentMethodReq = new PaymentMethodReq();
        paymentMethodReq.orderAmount = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
        paymentMethodReq.transType = "04";
        c.f40268a.getInstance().getClass();
        c.a().getAutoRepaymentList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 27));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        ArrayList arrayList = new ArrayList();
        this.f28802f = arrayList;
        this.f28803g = new p351xb.b(this, arrayList);
        t tVar = this.f28800d;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value2;
        p351xb.b bVar = this.f28803g;
        if (bVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        Object value3 = this.f28801e.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.l(new x(this, 5), (ConstraintLayout) value3);
    }
}
