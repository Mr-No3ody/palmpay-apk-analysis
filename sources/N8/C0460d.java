package N8;

import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.rsp.InterestRateConfigResp;
import com.transsnet.palmpay.account.bean.rsp.TrialCalculation;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: N8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0460d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnableCashBoxAutoSaveActivity f6204b;

    public /* synthetic */ C0460d(EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity, int i7) {
        this.f6203a = i7;
        this.f6204b = enableCashBoxAutoSaveActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a A[PHI: r10
      0x005a: PHI (r10v37 Bc.D) = (r10v35 Bc.D), (r10v36 Bc.D), (r10v44 Bc.D) binds: [B:23:0x0084, B:18:0x0068, B:13:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterestRateConfigResp interestRateConfigResp;
        String str;
        List<TrialCalculation> list;
        Bc.D d2;
        switch (this.f6203a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess() && (interestRateConfigResp = (InterestRateConfigResp) commonBeanResult.data) != null && (str = interestRateConfigResp.productRateV2) != null) {
                            if (str.length() <= 0) {
                                str = null;
                            }
                            if (str != null) {
                                String strK = q0.k("(", str, " p.a.)");
                                int i7 = L6.b.ppColorPrimary;
                                EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity = this.f6204b;
                                int iColorInt = CommonViewExtKt.colorInt(i7, enableCashBoxAutoSaveActivity);
                                Bc.D d10 = enableCashBoxAutoSaveActivity.f25852c;
                                if (d10 != null) {
                                    d10.f622i.setText(new SpanUtils().append("Use CashBox as an available balance that pays you interest daily! ").append(strK).setForegroundColor(iColorInt).setBackgroundColor(0).create());
                                }
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonListResultV2.isSuccess() && (list = commonListResultV2.data) != null) {
                            if (list.isEmpty()) {
                                list = null;
                            }
                            if (list != null) {
                                EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity2 = this.f6204b;
                                Bc.D d11 = enableCashBoxAutoSaveActivity2.f25852c;
                                if (d11 != null) {
                                    ((ConstraintLayout) d11.t).setVisibility(0);
                                }
                                Bc.D d12 = enableCashBoxAutoSaveActivity2.f25852c;
                                if (d12 != null) {
                                    ((LinearLayout) d12.f618d).removeAllViews();
                                }
                                Collections.reverse(list);
                                for (TrialCalculation trialCalculation : list) {
                                    Bc.D d13 = enableCashBoxAutoSaveActivity2.f25852c;
                                    if (d13 != null) {
                                        LinearLayout linearLayout = (LinearLayout) d13.f618d;
                                        View viewInflate = LayoutInflater.from(enableCashBoxAutoSaveActivity2).inflate(F8.e.ac_item_earn_estimated_interest, (ViewGroup) null);
                                        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                                        if (trialCalculation != null) {
                                            View viewFindViewById = viewInflate.findViewById(F8.d.tvInterestDay);
                                            Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                                            ((TextView) viewFindViewById).setText(trialCalculation.daysDesc);
                                            View viewFindViewById2 = viewInflate.findViewById(F8.d.tvInterestAmount);
                                            Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                                            TextView textView = (TextView) viewFindViewById2;
                                            r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
                                            Long l5 = trialCalculation.interest;
                                            textView.setText(r0.B(l5 != null ? l5.longValue() : 0L, true));
                                        }
                                        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
                                        linearLayout.addView(viewInflate);
                                    }
                                }
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    boolean z3 = it3 instanceof com.transsnet.palmpay.core.base.p;
                    EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity3 = this.f6204b;
                    if (z3) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            p220oa.h.z(enableCashBoxAutoSaveActivity3, "CashBox AutoSave Activated", null, new Ce.T(enableCashBoxAutoSaveActivity3, 3), 29);
                        } else {
                            String respMsg = commonBeanResult2.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                            int i10 = F8.h.ac_confirm;
                            int i11 = p025ba.k.core_opps;
                            O6.c cVar = new O6.c(enableCashBoxAutoSaveActivity3);
                            cVar.f6614u = 1;
                            cVar.e(i11);
                            cVar.f6598d = respMsg;
                            cVar.d(i10, null);
                            cVar.f6605k = true;
                            cVar.f6606l = 1;
                            C0.G.v(cVar, false, false);
                        }
                        d2 = enableCashBoxAutoSaveActivity3.f25852c;
                        if (d2 != null) {
                            ((PpButton) d2.f625p).b(false);
                        }
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        d2 = enableCashBoxAutoSaveActivity3.f25852c;
                        if (d2 != null) {
                            ((PpButton) d2.f625p).b(false);
                        }
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        d2 = enableCashBoxAutoSaveActivity3.f25852c;
                        if (d2 != null) {
                            ((PpButton) d2.f625p).b(false);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}
