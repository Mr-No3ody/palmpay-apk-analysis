package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import E.AbstractC0198c;
import Eb.n;
import Hb.L;
import Pa.r0;
import V9.C0714c;
import Ya.f;
import Ya.g;
import Za.b;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.req.CLCurrentBillReq;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillData;
import com.transsnet.palmpay.credit.bean.resp.InsRepaymentPlanDetail;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLInterestDialog;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p002a.a;
import p025ba.k;
import p220oa.h;
import p294tb.C2042d;
import p294tb.C2043e;
import p351xb.o;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit账单详情页", path = "/credit_score/cl_bill_detail_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLBillDetailActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLBillDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLBillDetailActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLBillDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
public final class CLBillDetailActivity extends b {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ int f28804I0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public o f28810C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f28811D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f28812E0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public CLCurrentBillData f28814G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public n f28816H0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28823d = C2131j.b(new C2042d(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28824e = C2131j.b(new C2042d(this, 13));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28825f = C2131j.b(new C2042d(this, 24));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28826g = C2131j.b(new C2042d(this, 29));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28827i = C2131j.b(new C2043e(this, 0));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28828j = C2131j.b(new C2043e(this, 1));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28830o = C2131j.b(new C2043e(this, 2));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28831p = C2131j.b(new C2043e(this, 3));
    public final t t = C2131j.b(new C2043e(this, 4));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28838v = C2131j.b(new C2043e(this, 5));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28840w = C2131j.b(new C2042d(this, 3));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28805A = C2131j.b(new C2042d(this, 4));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28807B = C2131j.b(new C2042d(this, 5));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f28809C = C2131j.b(new C2042d(this, 6));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28815H = C2131j.b(new C2042d(this, 7));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f28817L = C2131j.b(new C2042d(this, 8));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f28818M = C2131j.b(new C2042d(this, 9));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f28819Q = C2131j.b(new C2042d(this, 10));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f28820X = C2131j.b(new C2042d(this, 11));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f28821Y = C2131j.b(new C2042d(this, 12));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f28822Z = C2131j.b(new C2042d(this, 14));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f28829k0 = C2131j.b(new C2042d(this, 15));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f28832p0 = C2131j.b(new C2042d(this, 16));

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f28833q0 = C2131j.b(new C2042d(this, 17));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f28834r0 = C2131j.b(new C2042d(this, 18));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f28835s0 = C2131j.b(new C2042d(this, 19));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f28836t0 = C2131j.b(new C2042d(this, 20));

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f28837u0 = C2131j.b(new C2042d(this, 21));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f28839v0 = C2131j.b(new C2042d(this, 22));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f28841w0 = C2131j.b(new C2042d(this, 23));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f28842x0 = C2131j.b(new C2042d(this, 25));

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f28843y0 = C2131j.b(new C2042d(this, 26));

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f28844z0 = C2131j.b(new C2042d(this, 27));

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f28806A0 = C2131j.b(new C2042d(this, 28));

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final ArrayList f28808B0 = new ArrayList();

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Long f28813F0 = 0L;

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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_bill_detail_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        m();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (i7 >= 35) {
            initStatusBar(0, false);
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initStatusBar(0, false);
        BarUtils.setStatusBarLightMode((Activity) this, false);
    }

    public final TextView n() {
        Object value = this.f28818M.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final RecyclerView o() {
        Object value = this.f28824e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        n nVar = this.f28816H0;
        if (nVar != null) {
            nVar.b();
        }
        this.f28816H0 = null;
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 358 || eventType == 359) {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        m();
    }

    public final Button p() {
        Object value = this.f28828j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).clGetCurrentBillDetail(new CLCurrentBillReq(this.f28813F0, this.f28812E0, null, 4, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 28));
    }

    public final TextView q() {
        Object value = this.f28807B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView r() {
        Object value = this.f28835s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView s() {
        Object value = this.f28836t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        if (!c.b().e(this)) {
            c.b().j(this);
        }
        this.f28811D0 = getIntent().getStringExtra("cl_bill_apply_id");
        this.f28812E0 = getIntent().getStringExtra("cl_bill_loan_no");
        this.f28813F0 = Long.valueOf(getIntent().getLongExtra("cl_bill_id", 0L));
        this.f28810C0 = new o(this, this.f28808B0);
        o().setLayoutManager(new LinearLayoutManager(this, 1, false));
        o().setAdapter(this.f28810C0);
        t tVar = this.f28823d;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).getPaint().setFlags(8);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).getPaint().setAntiAlias(true);
        Object value3 = this.f28819Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i7 = 0;
        ((PpTitleBar) value3).setRightTextViewClickListener(new View.OnClickListener(this) { // from class: tb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailActivity f42449b;

            {
                this.f42449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double serviceFeeRate;
                String str = null;
                CLBillDetailActivity cLBillDetailActivity = this.f42449b;
                switch (i7) {
                    case 0:
                        d.x(a.e(new Pair("applyId", cLBillDetailActivity.f28811D0), new Pair("loanNo", cLBillDetailActivity.f28812E0), new Pair("billId", cLBillDetailActivity.f28813F0)), "LoanAmountDetails");
                        break;
                    case 1:
                        int i10 = CLBillDetailActivity.f28804I0;
                        CLCurrentBillData cLCurrentBillData = cLBillDetailActivity.f28814G0;
                        new CLInterestDialog(cLBillDetailActivity, cLCurrentBillData != null ? cLCurrentBillData.getInterestPrompt() : null).show();
                        break;
                    case 2:
                        int i11 = CLBillDetailActivity.f28804I0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar = new O6.c(cLBillDetailActivity);
                        cVar.f6596b = O6.d.f(cLBillDetailActivity.getString(k.core_title_attention));
                        int i12 = g.cs_cl_service_fee_description;
                        CLCurrentBillData cLCurrentBillData2 = cLBillDetailActivity.f28814G0;
                        String str2 = decimalFormat.format((cLCurrentBillData2 == null || (serviceFeeRate = cLCurrentBillData2.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLCurrentBillData cLCurrentBillData3 = cLBillDetailActivity.f28814G0;
                        String strA = d.a(cLCurrentBillData3 != null ? cLCurrentBillData3.getMaxServiceFee() : null);
                        CLCurrentBillData cLCurrentBillData4 = cLBillDetailActivity.f28814G0;
                        cVar.f6598d = cLBillDetailActivity.getString(i12, str2, strA, d.a(cLCurrentBillData4 != null ? cLCurrentBillData4.getMinServiceFee() : null));
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    case 3:
                        int i13 = CLBillDetailActivity.f28804I0;
                        Bundle bundle = new Bundle();
                        CLCurrentBillData cLCurrentBillData5 = cLBillDetailActivity.f28814G0;
                        bundle.putString("loanNo", cLCurrentBillData5 != null ? cLCurrentBillData5.getLoanNo() : null);
                        d.x(bundle, "LoanOverview");
                        break;
                    case 4:
                        int i14 = CLBillDetailActivity.f28804I0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity");
                        Long l5 = cLBillDetailActivity.f28813F0;
                        postcardBuild.withLong("cl_repayment_list_bill_id", l5 != null ? l5.longValue() : 0L).navigation();
                        break;
                    default:
                        CLCurrentBillData cLCurrentBillData6 = cLBillDetailActivity.f28814G0;
                        Integer accountType = cLCurrentBillData6 != null ? cLCurrentBillData6.getAccountType() : null;
                        if (accountType != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        } else if (accountType != null && accountType.intValue() == 14) {
                            str = "PALMPAY_BUSINESS_LOAN";
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("billId", String.valueOf(cLBillDetailActivity.f28813F0));
                        bundle2.putString("loanProduct", str);
                        bundle2.putBoolean("repayAllFlag", false);
                        d.x(bundle2, "LoanRepayHome");
                        break;
                }
            }
        });
        Object value4 = this.f28840w.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailActivity f42449b;

            {
                this.f42449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double serviceFeeRate;
                String str = null;
                CLBillDetailActivity cLBillDetailActivity = this.f42449b;
                switch (i10) {
                    case 0:
                        d.x(a.e(new Pair("applyId", cLBillDetailActivity.f28811D0), new Pair("loanNo", cLBillDetailActivity.f28812E0), new Pair("billId", cLBillDetailActivity.f28813F0)), "LoanAmountDetails");
                        break;
                    case 1:
                        int i11 = CLBillDetailActivity.f28804I0;
                        CLCurrentBillData cLCurrentBillData = cLBillDetailActivity.f28814G0;
                        new CLInterestDialog(cLBillDetailActivity, cLCurrentBillData != null ? cLCurrentBillData.getInterestPrompt() : null).show();
                        break;
                    case 2:
                        int i12 = CLBillDetailActivity.f28804I0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar = new O6.c(cLBillDetailActivity);
                        cVar.f6596b = O6.d.f(cLBillDetailActivity.getString(k.core_title_attention));
                        int i13 = g.cs_cl_service_fee_description;
                        CLCurrentBillData cLCurrentBillData2 = cLBillDetailActivity.f28814G0;
                        String str2 = decimalFormat.format((cLCurrentBillData2 == null || (serviceFeeRate = cLCurrentBillData2.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLCurrentBillData cLCurrentBillData3 = cLBillDetailActivity.f28814G0;
                        String strA = d.a(cLCurrentBillData3 != null ? cLCurrentBillData3.getMaxServiceFee() : null);
                        CLCurrentBillData cLCurrentBillData4 = cLBillDetailActivity.f28814G0;
                        cVar.f6598d = cLBillDetailActivity.getString(i13, str2, strA, d.a(cLCurrentBillData4 != null ? cLCurrentBillData4.getMinServiceFee() : null));
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    case 3:
                        int i14 = CLBillDetailActivity.f28804I0;
                        Bundle bundle = new Bundle();
                        CLCurrentBillData cLCurrentBillData5 = cLBillDetailActivity.f28814G0;
                        bundle.putString("loanNo", cLCurrentBillData5 != null ? cLCurrentBillData5.getLoanNo() : null);
                        d.x(bundle, "LoanOverview");
                        break;
                    case 4:
                        int i15 = CLBillDetailActivity.f28804I0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity");
                        Long l5 = cLBillDetailActivity.f28813F0;
                        postcardBuild.withLong("cl_repayment_list_bill_id", l5 != null ? l5.longValue() : 0L).navigation();
                        break;
                    default:
                        CLCurrentBillData cLCurrentBillData6 = cLBillDetailActivity.f28814G0;
                        Integer accountType = cLCurrentBillData6 != null ? cLCurrentBillData6.getAccountType() : null;
                        if (accountType != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        } else if (accountType != null && accountType.intValue() == 14) {
                            str = "PALMPAY_BUSINESS_LOAN";
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("billId", String.valueOf(cLBillDetailActivity.f28813F0));
                        bundle2.putString("loanProduct", str);
                        bundle2.putBoolean("repayAllFlag", false);
                        d.x(bundle2, "LoanRepayHome");
                        break;
                }
            }
        }, (TextView) value4);
        Object value5 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailActivity f42449b;

            {
                this.f42449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double serviceFeeRate;
                String str = null;
                CLBillDetailActivity cLBillDetailActivity = this.f42449b;
                switch (i11) {
                    case 0:
                        d.x(a.e(new Pair("applyId", cLBillDetailActivity.f28811D0), new Pair("loanNo", cLBillDetailActivity.f28812E0), new Pair("billId", cLBillDetailActivity.f28813F0)), "LoanAmountDetails");
                        break;
                    case 1:
                        int i12 = CLBillDetailActivity.f28804I0;
                        CLCurrentBillData cLCurrentBillData = cLBillDetailActivity.f28814G0;
                        new CLInterestDialog(cLBillDetailActivity, cLCurrentBillData != null ? cLCurrentBillData.getInterestPrompt() : null).show();
                        break;
                    case 2:
                        int i13 = CLBillDetailActivity.f28804I0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar = new O6.c(cLBillDetailActivity);
                        cVar.f6596b = O6.d.f(cLBillDetailActivity.getString(k.core_title_attention));
                        int i14 = g.cs_cl_service_fee_description;
                        CLCurrentBillData cLCurrentBillData2 = cLBillDetailActivity.f28814G0;
                        String str2 = decimalFormat.format((cLCurrentBillData2 == null || (serviceFeeRate = cLCurrentBillData2.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLCurrentBillData cLCurrentBillData3 = cLBillDetailActivity.f28814G0;
                        String strA = d.a(cLCurrentBillData3 != null ? cLCurrentBillData3.getMaxServiceFee() : null);
                        CLCurrentBillData cLCurrentBillData4 = cLBillDetailActivity.f28814G0;
                        cVar.f6598d = cLBillDetailActivity.getString(i14, str2, strA, d.a(cLCurrentBillData4 != null ? cLCurrentBillData4.getMinServiceFee() : null));
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    case 3:
                        int i15 = CLBillDetailActivity.f28804I0;
                        Bundle bundle = new Bundle();
                        CLCurrentBillData cLCurrentBillData5 = cLBillDetailActivity.f28814G0;
                        bundle.putString("loanNo", cLCurrentBillData5 != null ? cLCurrentBillData5.getLoanNo() : null);
                        d.x(bundle, "LoanOverview");
                        break;
                    case 4:
                        int i16 = CLBillDetailActivity.f28804I0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity");
                        Long l5 = cLBillDetailActivity.f28813F0;
                        postcardBuild.withLong("cl_repayment_list_bill_id", l5 != null ? l5.longValue() : 0L).navigation();
                        break;
                    default:
                        CLCurrentBillData cLCurrentBillData6 = cLBillDetailActivity.f28814G0;
                        Integer accountType = cLCurrentBillData6 != null ? cLCurrentBillData6.getAccountType() : null;
                        if (accountType != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        } else if (accountType != null && accountType.intValue() == 14) {
                            str = "PALMPAY_BUSINESS_LOAN";
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("billId", String.valueOf(cLBillDetailActivity.f28813F0));
                        bundle2.putString("loanProduct", str);
                        bundle2.putBoolean("repayAllFlag", false);
                        d.x(bundle2, "LoanRepayHome");
                        break;
                }
            }
        }, (TextView) value5);
        Object value6 = this.f28817L.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i12 = 3;
        h.l(new View.OnClickListener(this) { // from class: tb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailActivity f42449b;

            {
                this.f42449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double serviceFeeRate;
                String str = null;
                CLBillDetailActivity cLBillDetailActivity = this.f42449b;
                switch (i12) {
                    case 0:
                        d.x(a.e(new Pair("applyId", cLBillDetailActivity.f28811D0), new Pair("loanNo", cLBillDetailActivity.f28812E0), new Pair("billId", cLBillDetailActivity.f28813F0)), "LoanAmountDetails");
                        break;
                    case 1:
                        int i13 = CLBillDetailActivity.f28804I0;
                        CLCurrentBillData cLCurrentBillData = cLBillDetailActivity.f28814G0;
                        new CLInterestDialog(cLBillDetailActivity, cLCurrentBillData != null ? cLCurrentBillData.getInterestPrompt() : null).show();
                        break;
                    case 2:
                        int i14 = CLBillDetailActivity.f28804I0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar = new O6.c(cLBillDetailActivity);
                        cVar.f6596b = O6.d.f(cLBillDetailActivity.getString(k.core_title_attention));
                        int i15 = g.cs_cl_service_fee_description;
                        CLCurrentBillData cLCurrentBillData2 = cLBillDetailActivity.f28814G0;
                        String str2 = decimalFormat.format((cLCurrentBillData2 == null || (serviceFeeRate = cLCurrentBillData2.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLCurrentBillData cLCurrentBillData3 = cLBillDetailActivity.f28814G0;
                        String strA = d.a(cLCurrentBillData3 != null ? cLCurrentBillData3.getMaxServiceFee() : null);
                        CLCurrentBillData cLCurrentBillData4 = cLBillDetailActivity.f28814G0;
                        cVar.f6598d = cLBillDetailActivity.getString(i15, str2, strA, d.a(cLCurrentBillData4 != null ? cLCurrentBillData4.getMinServiceFee() : null));
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    case 3:
                        int i16 = CLBillDetailActivity.f28804I0;
                        Bundle bundle = new Bundle();
                        CLCurrentBillData cLCurrentBillData5 = cLBillDetailActivity.f28814G0;
                        bundle.putString("loanNo", cLCurrentBillData5 != null ? cLCurrentBillData5.getLoanNo() : null);
                        d.x(bundle, "LoanOverview");
                        break;
                    case 4:
                        int i17 = CLBillDetailActivity.f28804I0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity");
                        Long l5 = cLBillDetailActivity.f28813F0;
                        postcardBuild.withLong("cl_repayment_list_bill_id", l5 != null ? l5.longValue() : 0L).navigation();
                        break;
                    default:
                        CLCurrentBillData cLCurrentBillData6 = cLBillDetailActivity.f28814G0;
                        Integer accountType = cLCurrentBillData6 != null ? cLCurrentBillData6.getAccountType() : null;
                        if (accountType != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        } else if (accountType != null && accountType.intValue() == 14) {
                            str = "PALMPAY_BUSINESS_LOAN";
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("billId", String.valueOf(cLBillDetailActivity.f28813F0));
                        bundle2.putString("loanProduct", str);
                        bundle2.putBoolean("repayAllFlag", false);
                        d.x(bundle2, "LoanRepayHome");
                        break;
                }
            }
        }, (TextView) value6);
        Object value7 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i13 = 4;
        h.l(new View.OnClickListener(this) { // from class: tb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailActivity f42449b;

            {
                this.f42449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double serviceFeeRate;
                String str = null;
                CLBillDetailActivity cLBillDetailActivity = this.f42449b;
                switch (i13) {
                    case 0:
                        d.x(a.e(new Pair("applyId", cLBillDetailActivity.f28811D0), new Pair("loanNo", cLBillDetailActivity.f28812E0), new Pair("billId", cLBillDetailActivity.f28813F0)), "LoanAmountDetails");
                        break;
                    case 1:
                        int i14 = CLBillDetailActivity.f28804I0;
                        CLCurrentBillData cLCurrentBillData = cLBillDetailActivity.f28814G0;
                        new CLInterestDialog(cLBillDetailActivity, cLCurrentBillData != null ? cLCurrentBillData.getInterestPrompt() : null).show();
                        break;
                    case 2:
                        int i15 = CLBillDetailActivity.f28804I0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar = new O6.c(cLBillDetailActivity);
                        cVar.f6596b = O6.d.f(cLBillDetailActivity.getString(k.core_title_attention));
                        int i16 = g.cs_cl_service_fee_description;
                        CLCurrentBillData cLCurrentBillData2 = cLBillDetailActivity.f28814G0;
                        String str2 = decimalFormat.format((cLCurrentBillData2 == null || (serviceFeeRate = cLCurrentBillData2.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLCurrentBillData cLCurrentBillData3 = cLBillDetailActivity.f28814G0;
                        String strA = d.a(cLCurrentBillData3 != null ? cLCurrentBillData3.getMaxServiceFee() : null);
                        CLCurrentBillData cLCurrentBillData4 = cLBillDetailActivity.f28814G0;
                        cVar.f6598d = cLBillDetailActivity.getString(i16, str2, strA, d.a(cLCurrentBillData4 != null ? cLCurrentBillData4.getMinServiceFee() : null));
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    case 3:
                        int i17 = CLBillDetailActivity.f28804I0;
                        Bundle bundle = new Bundle();
                        CLCurrentBillData cLCurrentBillData5 = cLBillDetailActivity.f28814G0;
                        bundle.putString("loanNo", cLCurrentBillData5 != null ? cLCurrentBillData5.getLoanNo() : null);
                        d.x(bundle, "LoanOverview");
                        break;
                    case 4:
                        int i18 = CLBillDetailActivity.f28804I0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity");
                        Long l5 = cLBillDetailActivity.f28813F0;
                        postcardBuild.withLong("cl_repayment_list_bill_id", l5 != null ? l5.longValue() : 0L).navigation();
                        break;
                    default:
                        CLCurrentBillData cLCurrentBillData6 = cLBillDetailActivity.f28814G0;
                        Integer accountType = cLCurrentBillData6 != null ? cLCurrentBillData6.getAccountType() : null;
                        if (accountType != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        } else if (accountType != null && accountType.intValue() == 14) {
                            str = "PALMPAY_BUSINESS_LOAN";
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("billId", String.valueOf(cLBillDetailActivity.f28813F0));
                        bundle2.putString("loanProduct", str);
                        bundle2.putBoolean("repayAllFlag", false);
                        d.x(bundle2, "LoanRepayHome");
                        break;
                }
            }
        }, (TextView) value7);
        final int i14 = 5;
        h.l(new View.OnClickListener(this) { // from class: tb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailActivity f42449b;

            {
                this.f42449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double serviceFeeRate;
                String str = null;
                CLBillDetailActivity cLBillDetailActivity = this.f42449b;
                switch (i14) {
                    case 0:
                        d.x(a.e(new Pair("applyId", cLBillDetailActivity.f28811D0), new Pair("loanNo", cLBillDetailActivity.f28812E0), new Pair("billId", cLBillDetailActivity.f28813F0)), "LoanAmountDetails");
                        break;
                    case 1:
                        int i15 = CLBillDetailActivity.f28804I0;
                        CLCurrentBillData cLCurrentBillData = cLBillDetailActivity.f28814G0;
                        new CLInterestDialog(cLBillDetailActivity, cLCurrentBillData != null ? cLCurrentBillData.getInterestPrompt() : null).show();
                        break;
                    case 2:
                        int i16 = CLBillDetailActivity.f28804I0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar = new O6.c(cLBillDetailActivity);
                        cVar.f6596b = O6.d.f(cLBillDetailActivity.getString(k.core_title_attention));
                        int i17 = g.cs_cl_service_fee_description;
                        CLCurrentBillData cLCurrentBillData2 = cLBillDetailActivity.f28814G0;
                        String str2 = decimalFormat.format((cLCurrentBillData2 == null || (serviceFeeRate = cLCurrentBillData2.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLCurrentBillData cLCurrentBillData3 = cLBillDetailActivity.f28814G0;
                        String strA = d.a(cLCurrentBillData3 != null ? cLCurrentBillData3.getMaxServiceFee() : null);
                        CLCurrentBillData cLCurrentBillData4 = cLBillDetailActivity.f28814G0;
                        cVar.f6598d = cLBillDetailActivity.getString(i17, str2, strA, d.a(cLCurrentBillData4 != null ? cLCurrentBillData4.getMinServiceFee() : null));
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    case 3:
                        int i18 = CLBillDetailActivity.f28804I0;
                        Bundle bundle = new Bundle();
                        CLCurrentBillData cLCurrentBillData5 = cLBillDetailActivity.f28814G0;
                        bundle.putString("loanNo", cLCurrentBillData5 != null ? cLCurrentBillData5.getLoanNo() : null);
                        d.x(bundle, "LoanOverview");
                        break;
                    case 4:
                        int i19 = CLBillDetailActivity.f28804I0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity");
                        Long l5 = cLBillDetailActivity.f28813F0;
                        postcardBuild.withLong("cl_repayment_list_bill_id", l5 != null ? l5.longValue() : 0L).navigation();
                        break;
                    default:
                        CLCurrentBillData cLCurrentBillData6 = cLBillDetailActivity.f28814G0;
                        Integer accountType = cLCurrentBillData6 != null ? cLCurrentBillData6.getAccountType() : null;
                        if (accountType != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        } else if (accountType != null && accountType.intValue() == 14) {
                            str = "PALMPAY_BUSINESS_LOAN";
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("billId", String.valueOf(cLBillDetailActivity.f28813F0));
                        bundle2.putString("loanProduct", str);
                        bundle2.putBoolean("repayAllFlag", false);
                        d.x(bundle2, "LoanRepayHome");
                        break;
                }
            }
        }, p());
    }

    public final void t(boolean z3) {
        Object value = this.f28820X.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((View) value).setVisibility(z3 ? 8 : 0);
        Object value2 = this.f28833q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((View) value2).setVisibility(z3 ? 0 : 8);
        r().setVisibility(z3 ? 8 : 0);
        Object value3 = this.f28834r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((ImageView) value3).setVisibility(z3 ? 8 : 0);
        s().setVisibility(8);
        Object value4 = this.f28837u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((View) value4).setVisibility(8);
        Object value5 = this.f28841w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((LinearLayout) value5).setVisibility(8);
    }

    public final void u(long j6) {
        Object value = this.f28842x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        Object value2 = this.f28843y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView textView2 = (TextView) value2;
        Object value3 = this.f28844z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        TextView textView3 = (TextView) value3;
        Object value4 = this.f28806A0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        Eb.a.e(this, textView, textView2, textView3, (TextView) value4, j6);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0413  */
    /* JADX WARN: Code duplicated, block: B:135:0x0419  */
    /* JADX WARN: Code duplicated, block: B:136:0x041e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0426  */
    /* JADX WARN: Code duplicated, block: B:140:0x0442  */
    /* JADX WARN: Code duplicated, block: B:142:0x0448  */
    /* JADX WARN: Code duplicated, block: B:143:0x044d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0491  */
    /* JADX WARN: Code duplicated, block: B:147:0x0496  */
    /* JADX WARN: Code duplicated, block: B:153:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0124  */
    public final void v() {
        long j6;
        Long loanDate;
        long jLongValue;
        Long loanDate2;
        long jLongValue2;
        long jFloor;
        Long loanDate3;
        long jLongValue3;
        String strX1;
        Long unpaidAmount;
        Long validUntil;
        Long validUntil2;
        List<InsRepaymentPlanDetail> repaymentPlanBOList;
        CLCurrentBillData cLCurrentBillData = this.f28814G0;
        if (cLCurrentBillData == null) {
            ToastUtils.showLong(getString(g.cs_cl_service_busy), new Object[0]);
            return;
        }
        boolean zQ = Eb.a.q(cLCurrentBillData.getWaiverInfo());
        t tVar = this.f28809C;
        long jLongValue4 = 0;
        if (zQ) {
            t(false);
            CLCurrentBillData cLCurrentBillData2 = this.f28814G0;
            Intrinsics.e(cLCurrentBillData2);
            WaiverInfo waiverInfo = cLCurrentBillData2.getWaiverInfo();
            Intrinsics.e(waiverInfo);
            final int i7 = 1;
            Eb.a.g(waiverInfo.getBadgeText(), new Function1(this) { // from class: tb.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBillDetailActivity f42453b;

                {
                    this.f42453b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CLBillDetailActivity cLBillDetailActivity = this.f42453b;
                    String it = (String) obj;
                    switch (i7) {
                        case 0:
                            int i10 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            cLBillDetailActivity.r().setText(it);
                            cLBillDetailActivity.r().setVisibility(0);
                            break;
                        case 1:
                            int i11 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = cLBillDetailActivity.f28821Y.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((TextView) value).setText(it);
                            Object value2 = cLBillDetailActivity.f28821Y.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((TextView) value2).setVisibility(0);
                            break;
                        default:
                            int i12 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value3 = cLBillDetailActivity.f28822Z.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((TextView) value3).setText(it);
                            Object value4 = cLBillDetailActivity.f28829k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((View) value4).setVisibility(0);
                            break;
                    }
                    return Unit.f38893a;
                }
            }, new C2043e(this, 6));
            final int i10 = 2;
            Eb.a.g(waiverInfo.getSummaryText(), new Function1(this) { // from class: tb.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBillDetailActivity f42453b;

                {
                    this.f42453b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CLBillDetailActivity cLBillDetailActivity = this.f42453b;
                    String it = (String) obj;
                    switch (i10) {
                        case 0:
                            int i11 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            cLBillDetailActivity.r().setText(it);
                            cLBillDetailActivity.r().setVisibility(0);
                            break;
                        case 1:
                            int i12 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = cLBillDetailActivity.f28821Y.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((TextView) value).setText(it);
                            Object value2 = cLBillDetailActivity.f28821Y.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((TextView) value2).setVisibility(0);
                            break;
                        default:
                            int i13 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value3 = cLBillDetailActivity.f28822Z.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((TextView) value3).setText(it);
                            Object value4 = cLBillDetailActivity.f28829k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((View) value4).setVisibility(0);
                            break;
                    }
                    return Unit.f38893a;
                }
            }, new C2043e(this, 7));
            Object value = this.f28832p0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ImageView) value).setImageResource(Intrinsics.c(waiverInfo.getWaiverType(), WaiverInfo.TYPE_FULL) ? Ya.d.cs_cl_loan_repayment_fully_date_bj_item1 : Ya.d.cs_cl_loan_repayment_fully_date_bj_item2);
            final int i11 = 0;
            Eb.a.g(waiverInfo.getAmountLabel(), new Function1(this) { // from class: tb.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBillDetailActivity f42453b;

                {
                    this.f42453b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CLBillDetailActivity cLBillDetailActivity = this.f42453b;
                    String it = (String) obj;
                    switch (i11) {
                        case 0:
                            int i12 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            cLBillDetailActivity.r().setText(it);
                            cLBillDetailActivity.r().setVisibility(0);
                            break;
                        case 1:
                            int i13 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value2 = cLBillDetailActivity.f28821Y.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((TextView) value2).setText(it);
                            Object value3 = cLBillDetailActivity.f28821Y.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((TextView) value3).setVisibility(0);
                            break;
                        default:
                            int i14 = CLBillDetailActivity.f28804I0;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value4 = cLBillDetailActivity.f28822Z.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((TextView) value4).setText(it);
                            Object value5 = cLBillDetailActivity.f28829k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            ((View) value5).setVisibility(0);
                            break;
                    }
                    return Unit.f38893a;
                }
            }, new C2042d(this, 0));
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            TextView textView = (TextView) value2;
            Long currentOutstandingAmount = waiverInfo.getCurrentOutstandingAmount();
            textView.setText(d.a(Long.valueOf(currentOutstandingAmount != null ? currentOutstandingAmount.longValue() : 0L)));
            Long originalOutstandingAmount = waiverInfo.getOriginalOutstandingAmount();
            if ((originalOutstandingAmount != null ? originalOutstandingAmount.longValue() : 0L) > 0) {
                s().setVisibility(0);
                TextView textViewS = s();
                Intrinsics.e(originalOutstandingAmount);
                textViewS.setText(d.a(originalOutstandingAmount));
                s().setPaintFlags(s().getPaintFlags() | 16);
            }
            String strL = Eb.a.l(waiverInfo.getWaiverAmount());
            if (strL != null && !StringsKt.F(strL)) {
                Object value3 = this.f28837u0.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((View) value3).setVisibility(0);
                Object value4 = this.f28839v0.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((TextView) value4).setText(strL);
            }
            Button buttonP = p();
            String ctaText = waiverInfo.getCtaText();
            if (ctaText == null) {
                ctaText = getString(g.cs_cl_waiver_activate_default);
                Intrinsics.checkNotNullExpressionValue(ctaText, "getString(...)");
            } else {
                if (StringsKt.F(ctaText)) {
                    ctaText = null;
                }
                if (ctaText == null) {
                    ctaText = getString(g.cs_cl_waiver_activate_default);
                    Intrinsics.checkNotNullExpressionValue(ctaText, "getString(...)");
                }
            }
            buttonP.setText(ctaText);
            Long validUntil3 = waiverInfo.getValidUntil();
            if (validUntil3 != null) {
                Object value5 = this.f28841w0.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((LinearLayout) value5).setVisibility(0);
                u(validUntil3.longValue());
                n nVar = this.f28816H0;
                if (nVar != null) {
                    nVar.b();
                }
                this.f28816H0 = null;
                n nVar2 = new n(validUntil3.longValue(), new L(27, this, validUntil3), new C2042d(this, 1));
                nVar2.a();
                this.f28816H0 = nVar2;
            }
        } else {
            n nVar3 = this.f28816H0;
            if (nVar3 != null) {
                nVar3.b();
            }
            this.f28816H0 = null;
            t(true);
        }
        CLCurrentBillData cLCurrentBillData3 = this.f28814G0;
        Intrinsics.e(cLCurrentBillData3);
        Integer pendingPaidTerm = cLCurrentBillData3.getPendingPaidTerm();
        if ((pendingPaidTerm != null ? pendingPaidTerm.intValue() : 0) > 1) {
            n().setText(getString(g.cs_cl_multiple_terms));
            n().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            ArrayList arrayList = this.f28808B0;
            arrayList.clear();
            Long loanDate4 = cLCurrentBillData3.getLoanDate();
            if (loanDate4 != null) {
                jLongValue4 = loanDate4.longValue();
            }
            Calendar calendar = Calendar.getInstance();
            j6 = 0;
            calendar.setTime(new Date(jLongValue4));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            if (calendar.getTimeInMillis() < calendar2.getTimeInMillis() && (repaymentPlanBOList = cLCurrentBillData3.getRepaymentPlanBOList()) != null && !repaymentPlanBOList.isEmpty()) {
                List<InsRepaymentPlanDetail> repaymentPlanBOList2 = cLCurrentBillData3.getRepaymentPlanBOList();
                Intrinsics.e(repaymentPlanBOList2);
                arrayList.addAll(repaymentPlanBOList2);
            }
            o oVar = this.f28810C0;
            if (oVar != null) {
                Integer largeLoanTerm = cLCurrentBillData3.getLargeLoanTerm();
                oVar.f43802d = largeLoanTerm != null ? largeLoanTerm.intValue() : 0;
            }
            o oVar2 = this.f28810C0;
            if (oVar2 != null) {
                oVar2.notifyDataSetChanged();
            }
            try {
                boolean zIsEmpty = arrayList.isEmpty();
                t tVar2 = this.f28825f;
                if (zIsEmpty) {
                    Object value6 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    ((TextView) value6).setVisibility(8);
                    o().setVisibility(8);
                } else {
                    Object value7 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    ((TextView) value7).setVisibility(0);
                    o().setVisibility(0);
                    Object value8 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                    ((TextView) value8).setText(getString(g.cs_cl_outstanding_terms, Integer.valueOf(arrayList.size())));
                }
            } catch (Exception unused) {
            }
        } else {
            j6 = 0;
            TextView textViewN = n();
            int i12 = g.cs_cl_bill_repayment_amount;
            Long loanTime = cLCurrentBillData3.getLoanTime();
            textViewN.setText(getString(i12, r0.X1(Long.valueOf(loanTime != null ? loanTime.longValue() : 0L), "dd MMM")));
            n().setCompoundDrawablesWithIntrinsicBounds(Ya.d.cs_cl_bill_apply_date_icon, 0, 0, 0);
        }
        WaiverInfo waiverInfo2 = cLCurrentBillData3.getWaiverInfo();
        if (waiverInfo2 == null || !Intrinsics.c(waiverInfo2.getWaiverEnable(), Boolean.TRUE) || (validUntil2 = waiverInfo2.getValidUntil()) == null || validUntil2.longValue() <= System.currentTimeMillis()) {
            Object value9 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ((TextView) value9).setText(d.a(cLCurrentBillData3.getUnpaidAmount()));
        }
        Object value10 = this.f28805A.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        ((TextView) value10).setText(d.a(cLCurrentBillData3.getUnpaidPrincipal()));
        Object value11 = this.f28838v.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        ((TextView) value11).setText(d.a(cLCurrentBillData3.getUnpaidInterest()));
        Object value12 = this.f28831p.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        ((TextView) value12).setText(d.a(cLCurrentBillData3.getUnpaidServiceFee()));
        Object value13 = this.f28830o.getValue();
        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
        ((TextView) value13).setText(d.a(cLCurrentBillData3.getUnpaidPenalty()));
        Integer extensionTag = cLCurrentBillData3.getExtensionTag();
        t tVar3 = this.f28826g;
        t tVar4 = this.f28827i;
        if (extensionTag != null && extensionTag.intValue() == 1) {
            Object value14 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
            ((TextView) value14).setVisibility(0);
            Object value15 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
            ((TextView) value15).setVisibility(0);
        } else {
            Object value16 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
            ((TextView) value16).setVisibility(8);
            Object value17 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
            ((TextView) value17).setVisibility(8);
        }
        Integer loanType = cLCurrentBillData3.getLoanType();
        t tVar5 = this.f28815H;
        if (loanType != null && loanType.intValue() == 2) {
            Object value18 = tVar5.getValue();
            Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
            ((TextView) value18).setVisibility(0);
        } else {
            Object value19 = tVar5.getValue();
            Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
            ((TextView) value19).setVisibility(8);
        }
        Long unpaidAmount2 = cLCurrentBillData3.getUnpaidAmount();
        if ((unpaidAmount2 != null ? unpaidAmount2.longValue() : j6) <= j6) {
            loanDate = cLCurrentBillData3.getLoanDate();
            if (loanDate != null) {
                jLongValue = loanDate.longValue();
            } else {
                jLongValue = j6;
            }
            if (DateUtils.isToday(jLongValue)) {
                q().setTextColor(getColor(Ya.b.cs_due_txt_color));
                q().setText(getString(g.cs_due_today));
            } else {
                loanDate2 = cLCurrentBillData3.getLoanDate();
                if (loanDate2 != null) {
                    jLongValue2 = loanDate2.longValue();
                } else {
                    jLongValue2 = j6;
                }
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(new Date(jLongValue2));
                calendar3.set(11, 0);
                calendar3.set(12, 0);
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.set(11, 0);
                calendar4.set(12, 0);
                calendar4.set(13, 0);
                calendar4.set(14, 0);
                jFloor = (long) Math.floor((calendar3.getTimeInMillis() - calendar4.getTimeInMillis()) / ((double) 86400000));
                loanDate3 = cLCurrentBillData3.getLoanDate();
                if (loanDate3 != null) {
                    jLongValue3 = loanDate3.longValue();
                } else {
                    jLongValue3 = j6;
                }
                strX1 = r0.X1(Long.valueOf(jLongValue3), "MMM dd");
                F6.d.h(this.TAG, 3, "leftDays = " + jFloor + ", dueDate = " + strX1);
                if (1 <= jFloor || jFloor >= 4) {
                    q().setTextColor(getColor(Ya.b.cs_color_amount));
                    q().setText(getString(g.cs_cl_bill_in_days, strX1));
                } else {
                    q().setTextColor(getColor(L6.b.ppColorWarning));
                    q().setText(getString(g.cs_cl_bill_in_days, strX1));
                }
            }
        } else {
            Long loanDate5 = cLCurrentBillData3.getLoanDate();
            if (AbstractC0198c.K(loanDate5 != null ? loanDate5.longValue() : j6)) {
                q().setTextColor(getColor(Ya.b.cs_due_txt_color));
                Long loanDate6 = cLCurrentBillData3.getLoanDate();
                long jD = AbstractC0198c.D(loanDate6 != null ? loanDate6.longValue() : j6);
                q().setText(jD <= 1 ? getString(g.cs_cl_bill_overdue_days_one) : getString(g.cs_cl_bill_overdue_days, Long.valueOf(jD)));
            } else {
                loanDate = cLCurrentBillData3.getLoanDate();
                if (loanDate != null) {
                    jLongValue = loanDate.longValue();
                } else {
                    jLongValue = j6;
                }
                if (DateUtils.isToday(jLongValue)) {
                    q().setTextColor(getColor(Ya.b.cs_due_txt_color));
                    q().setText(getString(g.cs_due_today));
                } else {
                    loanDate2 = cLCurrentBillData3.getLoanDate();
                    if (loanDate2 != null) {
                        jLongValue2 = loanDate2.longValue();
                    } else {
                        jLongValue2 = j6;
                    }
                    Calendar calendar5 = Calendar.getInstance();
                    calendar5.setTime(new Date(jLongValue2));
                    calendar5.set(11, 0);
                    calendar5.set(12, 0);
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                    Calendar calendar6 = Calendar.getInstance();
                    calendar6.set(11, 0);
                    calendar6.set(12, 0);
                    calendar6.set(13, 0);
                    calendar6.set(14, 0);
                    jFloor = (long) Math.floor((calendar5.getTimeInMillis() - calendar6.getTimeInMillis()) / ((double) 86400000));
                    loanDate3 = cLCurrentBillData3.getLoanDate();
                    if (loanDate3 != null) {
                        jLongValue3 = loanDate3.longValue();
                    } else {
                        jLongValue3 = j6;
                    }
                    strX1 = r0.X1(Long.valueOf(jLongValue3), "MMM dd");
                    F6.d.h(this.TAG, 3, "leftDays = " + jFloor + ", dueDate = " + strX1);
                    if (1 <= jFloor) {
                        q().setTextColor(getColor(Ya.b.cs_color_amount));
                        q().setText(getString(g.cs_cl_bill_in_days, strX1));
                    } else {
                        q().setTextColor(getColor(Ya.b.cs_color_amount));
                        q().setText(getString(g.cs_cl_bill_in_days, strX1));
                    }
                }
            }
        }
        Long l5 = this.f28813F0;
        if ((l5 != null ? l5.longValue() : j6) <= j6) {
            p().setVisibility(8);
            return;
        }
        CLCurrentBillData cLCurrentBillData4 = this.f28814G0;
        WaiverInfo waiverInfo3 = cLCurrentBillData4 != null ? cLCurrentBillData4.getWaiverInfo() : null;
        if (waiverInfo3 != null && Intrinsics.c(waiverInfo3.getWaiverEnable(), Boolean.TRUE) && (validUntil = waiverInfo3.getValidUntil()) != null && validUntil.longValue() > System.currentTimeMillis()) {
            p().setVisibility(0);
            return;
        }
        Button buttonP2 = p();
        CLCurrentBillData cLCurrentBillData5 = this.f28814G0;
        buttonP2.setVisibility(((cLCurrentBillData5 == null || (unpaidAmount = cLCurrentBillData5.getUnpaidAmount()) == null) ? j6 : unpaidAmount.longValue()) <= j6 ? 8 : 0);
    }
}
