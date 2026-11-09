package com.transsnet.palmpay.credit.view;

import Ae.j;
import Eb.n;
import Eb.o;
import Gb.C0295s;
import Gb.C0296t;
import Gb.r;
import Gb.u;
import Pa.n0;
import Pa.r0;
import Ya.b;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfoV2;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p099gb.c;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/view/LoanOutstandingSummaryView;", "Lcom/transsnet/palmpay/credit/view/BaseLoanView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoanOutstandingSummaryView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanOutstandingSummaryView.kt\ncom/transsnet/palmpay/credit/view/LoanOutstandingSummaryView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class LoanOutstandingSummaryView extends BaseLoanView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30796d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f30798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OutstandingContentInfoV2 f30799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanOutstandingSummaryView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewFindViewById = View.inflate(context, f.cs_cl_outstanding_summary_view_v2, this).findViewById(e.rootOutstandingSummary);
        int i7 = e.layoutLegacy;
        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewFindViewById);
        if (constraintLayout != null) {
            i7 = e.layoutWaiver;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
            if (linearLayout != null) {
                i7 = e.llCountdownHms;
                LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
                if (linearLayout2 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) viewFindViewById;
                    i7 = e.tvCountdownDayHour;
                    TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                    if (textView != null) {
                        i7 = e.tvCountdownHour;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewFindViewById);
                        if (textView2 != null) {
                            i7 = e.tvCountdownMinute;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewFindViewById);
                            if (textView3 != null) {
                                i7 = e.tvCountdownSecond;
                                TextView textView4 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                if (textView4 != null) {
                                    i7 = e.tvRepay;
                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                    if (textView5 != null) {
                                        i7 = e.tvSettleNow;
                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                        if (textView6 != null) {
                                            i7 = e.tvSubtitle;
                                            TextView textView7 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                            if (textView7 != null) {
                                                i7 = e.tvTitle;
                                                TextView textView8 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                if (textView8 != null) {
                                                    i7 = e.tvWaiverAmountLabel;
                                                    TextView textView9 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                    if (textView9 != null) {
                                                        i7 = e.tvWaiverBadge;
                                                        TextView textView10 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                        if (textView10 != null) {
                                                            i7 = e.tvWaiverCurrentAmount;
                                                            TextView textView11 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                            if (textView11 != null) {
                                                                i7 = e.tvWaiverOriginalAmount;
                                                                TextView textView12 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                if (textView12 != null) {
                                                                    i7 = e.tvWaiverSummary;
                                                                    TextView textView13 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                    if (textView13 != null) {
                                                                        this.f30797a = new c(linearLayout3, constraintLayout, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void e(long j6) {
        boolean zV = Eb.a.v(j6);
        c cVar = this.f30797a;
        if (cVar != null) {
            cVar.f37055e.setVisibility(zV ? 8 : 0);
        }
        if (cVar != null) {
            cVar.f37054d.setVisibility(zV ? 0 : 8);
        }
        if (!zV) {
            if (cVar != null) {
                TextView textView = cVar.f37055e;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String strK = Eb.a.k(context, j6);
                textView.setText(strK != null ? strK : "");
                return;
            }
            return;
        }
        o oVarW = Eb.a.w(j6, System.currentTimeMillis());
        if (cVar != null) {
            TextView textView2 = cVar.f37056f;
            String str = oVarW != null ? oVarW.f2294a : null;
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
        }
        if (cVar != null) {
            TextView textView3 = cVar.f37057g;
            String str2 = oVarW != null ? oVarW.f2295b : null;
            if (str2 == null) {
                str2 = "";
            }
            textView3.setText(str2);
        }
        if (cVar != null) {
            TextView textView4 = cVar.f37058i;
            String str3 = oVarW != null ? oVarW.f2296c : null;
            textView4.setText(str3 != null ? str3 : "");
        }
    }

    public final void f() {
        n nVar = this.f30798b;
        if (nVar != null) {
            nVar.b();
        }
        this.f30798b = null;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    public final void g(final OutstandingContentInfoV2 outstandingContentInfoV2) {
        boolean z3;
        int i7;
        String strB;
        int i10;
        long j6;
        String string;
        Long validUntil;
        this.f30799c = outstandingContentInfoV2;
        setVisibility(outstandingContentInfoV2 == null ? 8 : 0);
        if (outstandingContentInfoV2 == null) {
            f();
            return;
        }
        WaiverInfo waiverInfo = outstandingContentInfoV2.waiverInfo;
        boolean z8 = waiverInfo != null && Intrinsics.c(waiverInfo.getWaiverEnable(), Boolean.TRUE) && (validUntil = waiverInfo.getValidUntil()) != null && validUntil.longValue() > System.currentTimeMillis();
        c cVar = this.f30797a;
        if (!z8) {
            f();
            if (cVar != null) {
                cVar.f37053c.setVisibility(8);
            }
            if (cVar != null) {
                cVar.f37052b.setVisibility(0);
            }
            if (outstandingContentInfoV2.getRepaymentTime() != null) {
                Long repaymentTime = outstandingContentInfoV2.getRepaymentTime();
                Intrinsics.e(repaymentTime);
                if (repaymentTime.longValue() < System.currentTimeMillis()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            Long repaymentTime2 = outstandingContentInfoV2.getRepaymentTime();
            Integer numValueOf = repaymentTime2 == null ? null : Integer.valueOf((int) TimeUnit.MILLISECONDS.toDays(repaymentTime2.longValue() - System.currentTimeMillis()));
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            if (cVar != null) {
                TextView textView = cVar.t;
                textView.setText(outstandingContentInfoV2.title);
                textView.setVisibility(TextUtils.isEmpty(outstandingContentInfoV2.title) ? 8 : 0);
            }
            if (cVar != null) {
                TextView textView2 = cVar.f37061p;
                if (!TextUtils.isEmpty(outstandingContentInfoV2.subTitle)) {
                    strB = outstandingContentInfoV2.subTitle;
                } else if (TextUtils.isEmpty(outstandingContentInfoV2.subTitle2)) {
                    Long l5 = outstandingContentInfoV2.billOutstandingAmount;
                    if (l5 == null) {
                        l5 = outstandingContentInfoV2.amount;
                    }
                    if ((l5 != null ? l5.longValue() : 0L) > 0) {
                        strB = r0.B(l5 != null ? l5.longValue() : 0L, true);
                    } else {
                        strB = null;
                    }
                } else {
                    strB = outstandingContentInfoV2.subTitle2;
                }
                textView2.setText(strB);
                textView2.setVisibility(TextUtils.isEmpty(textView2.getText()) ? 8 : 0);
                if (z3) {
                    i10 = b.cs_cl_overdue_txt_color;
                } else {
                    i10 = iIntValue > 7 ? L6.b.ppColorTextNormal : L6.b.ppColorWarning;
                }
                textView2.setTextColor(textView2.getContext().getColor(i10));
            }
            if (cVar != null) {
                final TextView textView3 = cVar.f37059j;
                String string2 = outstandingContentInfoV2.button;
                if (string2 == null) {
                    string2 = textView3.getContext().getString(k.core_repay);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                }
                textView3.setText(string2);
                if (z3) {
                    i7 = b.cs_cl_overdue_txt_color;
                } else {
                    i7 = iIntValue > 7 ? L6.b.ppColorFlexiCashPrimary : L6.b.ppColorWarning;
                }
                textView3.setBackgroundTintList(ColorStateList.valueOf(textView3.getContext().getColor(i7)));
                final int i11 = 0;
                h.l(new View.OnClickListener() { // from class: Gb.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Long validUntil2;
                        OutstandingAccount outstandingAccount;
                        OutstandingContentInfoV2 info = outstandingContentInfoV2;
                        TextView textView4 = textView3;
                        switch (i11) {
                            case 0:
                                int i12 = LoanOutstandingSummaryView.f30796d;
                                Context context = textView4.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                Intrinsics.checkNotNullParameter(context, "context");
                                if (info != null) {
                                    org.chromium.support_lib_boundary.util.b.A(context, info.outstandingAccounts, true);
                                    break;
                                }
                                break;
                            default:
                                int i13 = LoanOutstandingSummaryView.f30796d;
                                Context context2 = textView4.getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                Intrinsics.checkNotNullParameter(context2, "context");
                                Intrinsics.checkNotNullParameter(info, "info");
                                WaiverInfo waiverInfo2 = info.waiverInfo;
                                if (waiverInfo2 != null && Intrinsics.c(waiverInfo2.getWaiverEnable(), Boolean.TRUE) && (validUntil2 = waiverInfo2.getValidUntil()) != null && validUntil2.longValue() > System.currentTimeMillis()) {
                                    Set set = Eb.b.f2269a;
                                    n0.g().q(new ClickEvent("Loan_Home_Repay_Click"));
                                    Integer num = null;
                                    if (!TextUtils.isEmpty(info.androidLink)) {
                                        Pa.F.f(info.androidLink, null, null);
                                    } else {
                                        Intrinsics.checkNotNullParameter(info, "info");
                                        if (Fb.i.d(info.outstandingAccounts) > 1) {
                                            Fb.i.h(context2);
                                        } else {
                                            List<OutstandingAccount> list = info.outstandingAccounts;
                                            if (list != null && (outstandingAccount = (OutstandingAccount) CollectionsKt.firstOrNull(list)) != null) {
                                                num = outstandingAccount.accountType;
                                            }
                                            Fb.i.g(context2, num, info.outstandingAccounts);
                                        }
                                    }
                                } else {
                                    Intrinsics.checkNotNullParameter(context2, "context");
                                    org.chromium.support_lib_boundary.util.b.A(context2, info.outstandingAccounts, true);
                                }
                                break;
                        }
                    }
                }, textView3);
                return;
            }
            return;
        }
        if (cVar != null) {
            cVar.f37052b.setVisibility(8);
        }
        if (cVar != null) {
            cVar.f37053c.setVisibility(0);
        }
        Intrinsics.e(waiverInfo);
        if (cVar != null) {
            TextView textView4 = cVar.f37063w;
            String badgeText = waiverInfo.getBadgeText();
            r apply = new r(textView4, waiverInfo, 0);
            j6 = 0;
            C0295s hide = new C0295s(textView4, 0);
            Intrinsics.checkNotNullParameter(apply, "apply");
            Intrinsics.checkNotNullParameter(hide, "hide");
            if (TextUtils.isEmpty(badgeText)) {
                hide.invoke();
            } else {
                Intrinsics.e(badgeText);
                apply.invoke(badgeText);
            }
        } else {
            j6 = 0;
        }
        if (cVar != null) {
            TextView textView5 = cVar.f37062v;
            String amountLabel = waiverInfo.getAmountLabel();
            C0296t apply2 = new C0296t(textView5, 0);
            C0295s hide2 = new C0295s(textView5, 1);
            Intrinsics.checkNotNullParameter(apply2, "apply");
            Intrinsics.checkNotNullParameter(hide2, "hide");
            if (TextUtils.isEmpty(amountLabel)) {
                hide2.invoke();
            } else {
                Intrinsics.e(amountLabel);
                apply2.invoke(amountLabel);
            }
        }
        if (cVar != null) {
            TextView textView6 = cVar.f37048A;
            Long currentOutstandingAmount = waiverInfo.getCurrentOutstandingAmount();
            textView6.setText(r0.B(currentOutstandingAmount != null ? currentOutstandingAmount.longValue() : j6, true));
        }
        if (cVar != null) {
            TextView textView7 = cVar.f37049B;
            Long originalOutstandingAmount = waiverInfo.getOriginalOutstandingAmount();
            if ((originalOutstandingAmount != null ? originalOutstandingAmount.longValue() : j6) > j6) {
                textView7.setVisibility(0);
                Intrinsics.e(originalOutstandingAmount);
                textView7.setText(r0.B(originalOutstandingAmount.longValue(), true));
                textView7.setPaintFlags(textView7.getPaintFlags() | 16);
            } else {
                textView7.setVisibility(8);
            }
        }
        if (cVar != null) {
            TextView textView8 = cVar.f37050C;
            String summaryText = waiverInfo.getSummaryText();
            C0296t apply3 = new C0296t(textView8, 1);
            C0295s hide3 = new C0295s(textView8, 2);
            Intrinsics.checkNotNullParameter(apply3, "apply");
            Intrinsics.checkNotNullParameter(hide3, "hide");
            if (TextUtils.isEmpty(summaryText)) {
                hide3.invoke();
            } else {
                Intrinsics.e(summaryText);
                apply3.invoke(summaryText);
            }
        }
        if (cVar != null) {
            final TextView textView9 = cVar.f37060o;
            String ctaText = waiverInfo.getCtaText();
            if (ctaText == null) {
                string = textView9.getContext().getString(g.cs_cl_waiver_settle_now);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = !StringsKt.F(ctaText) ? ctaText : null;
                if (string == null) {
                    string = textView9.getContext().getString(g.cs_cl_waiver_settle_now);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
            }
            textView9.setText(string);
            final int i12 = 1;
            h.l(new View.OnClickListener() { // from class: Gb.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Long validUntil2;
                    OutstandingAccount outstandingAccount;
                    OutstandingContentInfoV2 info = outstandingContentInfoV2;
                    TextView textView10 = textView9;
                    switch (i12) {
                        case 0:
                            int i13 = LoanOutstandingSummaryView.f30796d;
                            Context context = textView10.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (info != null) {
                                org.chromium.support_lib_boundary.util.b.A(context, info.outstandingAccounts, true);
                                break;
                            }
                            break;
                        default:
                            int i14 = LoanOutstandingSummaryView.f30796d;
                            Context context2 = textView10.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(info, "info");
                            WaiverInfo waiverInfo2 = info.waiverInfo;
                            if (waiverInfo2 != null && Intrinsics.c(waiverInfo2.getWaiverEnable(), Boolean.TRUE) && (validUntil2 = waiverInfo2.getValidUntil()) != null && validUntil2.longValue() > System.currentTimeMillis()) {
                                Set set = Eb.b.f2269a;
                                n0.g().q(new ClickEvent("Loan_Home_Repay_Click"));
                                Integer num = null;
                                if (!TextUtils.isEmpty(info.androidLink)) {
                                    Pa.F.f(info.androidLink, null, null);
                                } else {
                                    Intrinsics.checkNotNullParameter(info, "info");
                                    if (Fb.i.d(info.outstandingAccounts) > 1) {
                                        Fb.i.h(context2);
                                    } else {
                                        List<OutstandingAccount> list = info.outstandingAccounts;
                                        if (list != null && (outstandingAccount = (OutstandingAccount) CollectionsKt.firstOrNull(list)) != null) {
                                            num = outstandingAccount.accountType;
                                        }
                                        Fb.i.g(context2, num, info.outstandingAccounts);
                                    }
                                }
                            } else {
                                Intrinsics.checkNotNullParameter(context2, "context");
                                org.chromium.support_lib_boundary.util.b.A(context2, info.outstandingAccounts, true);
                            }
                            break;
                    }
                }
            }, textView9);
        }
        Long validUntil2 = waiverInfo.getValidUntil();
        if (validUntil2 == null) {
            f();
            return;
        }
        e(validUntil2.longValue());
        long jLongValue = validUntil2.longValue();
        f();
        n nVar = new n(jLongValue, new u(this, jLongValue, 0), new j(this, 15));
        nVar.a();
        this.f30798b = nVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f();
        super.onDetachedFromWindow();
    }
}
