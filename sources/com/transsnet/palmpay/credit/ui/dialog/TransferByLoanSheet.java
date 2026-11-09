package com.transsnet.palmpay.credit.ui.dialog;

import Wf.AbstractC0780y;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.fragment.app.C1161a;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import com.transsnet.palmpay.credit.ui.activity.transferbyloan.TransferByLoanResultConsumer;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/TransferByLoanSheet;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferByLoanSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferByLoanSheet.kt\ncom/transsnet/palmpay/credit/ui/dialog/TransferByLoanSheet\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,492:1\n257#2,2:493\n257#2,2:495\n257#2,2:497\n257#2,2:502\n257#2,2:505\n257#2,2:507\n1878#3,3:499\n1#4:504\n*S KotlinDebug\n*F\n+ 1 TransferByLoanSheet.kt\ncom/transsnet/palmpay/credit/ui/dialog/TransferByLoanSheet\n*L\n238#1:493,2\n239#1:495,2\n240#1:497,2\n433#1:502,2\n190#1:505,2\n200#1:507,2\n275#1:499,3\n*E\n"})
public final class TransferByLoanSheet extends BaseFragment {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f30032q0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f30033A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f30034B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f30035C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f30036H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f30037L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f30038M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CheckBox f30039Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public PpButton f30040X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public View f30041Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public View f30042Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f30043i = C2131j.b(new X6.c(this, 20));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TransferByLoanOpenParams f30044j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f30045k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ProgressBar f30046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f30047p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f30048p0;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HorizontalScrollView f30049v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f30050w;

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

    public static void t(TextView textView, TextView textView2, long j6, long j10) {
        if (textView != null) {
            textView.setText(Pa.r0.B(j6, false));
        }
        boolean z3 = j10 > j6;
        if (textView2 != null) {
            textView2.setVisibility(z3 ? 0 : 8);
        }
        if (!z3 || textView2 == null) {
            return;
        }
        textView2.setText(Pa.r0.B(j10, false));
    }

    public final void A(boolean z3) {
        View view = this.f30041Y;
        if (view != null) {
            view.setVisibility(z3 ? 0 : 8);
        }
        View view2 = this.f30042Z;
        if (view2 != null) {
            view2.setVisibility(z3 ? 0 : 8);
        }
        View view3 = this.f30045k0;
        if (view3 != null) {
            view3.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Ya.f.cs_cl_transfer_by_loan_sheet;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (!(z().f30933g.d() instanceof Jb.G)) {
            y();
            return 0;
        }
        final int i7 = 0;
        z().f30933g.e(this, new Wd.I(new Function1(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferByLoanSheet f30175b;

            {
                this.f30175b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                String string;
                int iB;
                Long repaymentDate;
                String str;
                RepaymentPlan repaymentPlan;
                HorizontalScrollView horizontalScrollView;
                LinearLayout linearLayout;
                int i10;
                LinearLayout.LayoutParams layoutParams;
                z = false;
                boolean z3 = false;
                int i11 = 1;
                Throwable th = null;
                TransferByLoanSheet transferByLoanSheet = this.f30175b;
                switch (i7) {
                    case 0:
                        Jb.J j6 = (Jb.J) obj;
                        int i12 = TransferByLoanSheet.f30032q0;
                        boolean z8 = j6 instanceof Jb.I;
                        TransferByLoanSheet transferByLoanSheet2 = this.f30175b;
                        if (z8) {
                            ProgressBar progressBar = transferByLoanSheet2.f30046o;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                            }
                            transferByLoanSheet2.A(false);
                        } else if (j6 instanceof Jb.H) {
                            transferByLoanSheet2.y();
                        } else {
                            if (!(j6 instanceof Jb.G)) {
                                throw new p355xf.l();
                            }
                            Jb.G g7 = (Jb.G) j6;
                            transferByLoanSheet2.f30044j = g7.f4700a;
                            ProgressBar progressBar2 = transferByLoanSheet2.f30046o;
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            transferByLoanSheet2.A(true);
                            transferByLoanSheet2.u();
                            ViewGroup viewGroup = transferByLoanSheet2.f30050w;
                            ?? r12 = g7.f4702c;
                            int i13 = g7.f4703d;
                            if (viewGroup != null) {
                                int size = r12.size();
                                boolean z10 = size <= 2;
                                HorizontalScrollView horizontalScrollView2 = transferByLoanSheet2.f30049v;
                                if (horizontalScrollView2 != null) {
                                    horizontalScrollView2.setFillViewport(z10);
                                }
                                viewGroup.removeAllViews();
                                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                                layoutParams2.width = z10 ? -1 : -2;
                                viewGroup.setLayoutParams(layoutParams2);
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(transferByLoanSheet2.getContext());
                                Iterator it = ((Iterable) r12).iterator();
                                int i14 = 0;
                                while (true) {
                                    Throwable th2 = th;
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i15 = i14 + 1;
                                        if (i14 < 0) {
                                            C1850q.k();
                                            throw th2;
                                        }
                                        CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) next;
                                        View viewInflate = layoutInflaterFrom.inflate(Ya.f.cs_cl_transfer_by_loan_tenure_item, viewGroup, false);
                                        if (z10) {
                                            layoutParams = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            if (i14 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        } else {
                                            layoutParams = new LinearLayout.LayoutParams(-2, CommonViewExtKt.getDp(48));
                                            if (i14 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        }
                                        viewInflate.setLayoutParams(layoutParams);
                                        viewInflate.setMinimumWidth(z10 ? 0 : CommonViewExtKt.getDp(72));
                                        TextView textView = (TextView) viewInflate.findViewById(Ya.e.tvTenureDays);
                                        int i16 = Ya.g.cs_transfer_by_loan_tenure_days;
                                        Integer loanDays = cLRepaymentPlanData.getLoanDays();
                                        textView.setText(transferByLoanSheet2.getString(i16, Integer.valueOf(loanDays != null ? loanDays.intValue() : 0)));
                                        TextView textView2 = (TextView) viewInflate.findViewById(Ya.e.tvTenureTerms);
                                        int i17 = Ya.g.cs_transfer_by_loan_tenure_terms;
                                        Integer loanTerm = cLRepaymentPlanData.getLoanTerm();
                                        textView2.setText(transferByLoanSheet2.getString(i17, Integer.valueOf(loanTerm != null ? loanTerm.intValue() : 0)));
                                        boolean z11 = i14 == i13;
                                        viewInflate.setBackgroundResource(z11 ? Ya.d.cs_cl_transfer_by_loan_tenure_selected : Ya.d.cs_cl_transfer_by_loan_tenure_unselected);
                                        ((TextView) viewInflate.findViewById(Ya.e.tvTenureDays)).setTextColor(transferByLoanSheet2.requireContext().getColor(z11 ? L6.b.ppColorPrimary : L6.b.ppColorTextPrimary));
                                        viewInflate.setOnClickListener(new Ad.V(transferByLoanSheet2, i14, 4));
                                        viewGroup.addView(viewInflate);
                                        th = th2;
                                        i14 = i15;
                                        i11 = 1;
                                    } else {
                                        if (size == i11) {
                                            View view = new View(transferByLoanSheet2.getContext());
                                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            layoutParams3.setMarginStart(CommonViewExtKt.getDp(12));
                                            view.setLayoutParams(layoutParams3);
                                            view.setImportantForAccessibility(2);
                                            viewGroup.addView(view);
                                        }
                                        HorizontalScrollView horizontalScrollView3 = transferByLoanSheet2.f30049v;
                                        if (horizontalScrollView3 != null) {
                                            horizontalScrollView3.requestLayout();
                                        }
                                        if (!z10 && (horizontalScrollView = transferByLoanSheet2.f30049v) != null && (linearLayout = transferByLoanSheet2.f30050w) != null && (i10 = g7.f4703d) >= 0 && i10 < size) {
                                            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new q1(linearLayout, transferByLoanSheet2, i10, horizontalScrollView, size));
                                        }
                                    }
                                }
                            }
                            CLRepaymentPlanData cLRepaymentPlanData2 = (CLRepaymentPlanData) CollectionsKt.G(i13, r12);
                            boolean z12 = g7.f4704e;
                            if (cLRepaymentPlanData2 != null) {
                                Integer loanTerm2 = cLRepaymentPlanData2.getLoanTerm();
                                int iIntValue = loanTerm2 != null ? loanTerm2.intValue() : 1;
                                if (iIntValue < 1) {
                                    iIntValue = 1;
                                }
                                Long outstandingAmountSum = cLRepaymentPlanData2.getOutstandingAmountSum();
                                long jLongValue = outstandingAmountSum != null ? outstandingAmountSum.longValue() : 0L;
                                Long discountInterestSum = cLRepaymentPlanData2.getDiscountInterestSum();
                                long jLongValue2 = jLongValue + (discountInterestSum != null ? discountInterestSum.longValue() : 0L);
                                long j10 = iIntValue;
                                TransferByLoanSheet.t(transferByLoanSheet2.f30033A, transferByLoanSheet2.f30034B, jLongValue / j10, jLongValue2 / j10);
                                if (iIntValue > 0) {
                                    Integer loanDays2 = cLRepaymentPlanData2.getLoanDays();
                                    iB = Nf.b.b((loanDays2 != null ? loanDays2.intValue() : 0) / iIntValue);
                                } else {
                                    iB = 0;
                                }
                                TextView textView3 = transferByLoanSheet2.f30035C;
                                if (textView3 != null) {
                                    int i18 = Ya.g.cs_transfer_by_loan_payment_schedule_value;
                                    Integer loanTerm3 = cLRepaymentPlanData2.getLoanTerm();
                                    textView3.setText(transferByLoanSheet2.getString(i18, Integer.valueOf(loanTerm3 != null ? loanTerm3.intValue() : 0), Integer.valueOf(iB)));
                                }
                                List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData2.getRepaymentPlanList();
                                if (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.firstOrNull(repaymentPlanList)) == null || (repaymentDate = repaymentPlan.getRepaymentDate()) == null) {
                                    repaymentDate = cLRepaymentPlanData2.getRepaymentDate();
                                }
                                TextView textView4 = transferByLoanSheet2.f30036H;
                                if (textView4 != null) {
                                    if (repaymentDate == null || repaymentDate.longValue() <= 0) {
                                        str = "";
                                    } else {
                                        str = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).format(new Date(repaymentDate.longValue() < 10000000000L ? repaymentDate.longValue() * ((long) 1000) : repaymentDate.longValue()));
                                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    }
                                    textView4.setText(str);
                                }
                                TransferByLoanSheet.t(transferByLoanSheet2.f30037L, transferByLoanSheet2.f30038M, jLongValue, jLongValue2);
                                transferByLoanSheet2.f30048p0 = true;
                                CheckBox checkBox = transferByLoanSheet2.f30039Q;
                                if (checkBox != null) {
                                    checkBox.setChecked(z12);
                                }
                                transferByLoanSheet2.f30048p0 = false;
                            }
                            boolean zC = Intrinsics.c(transferByLoanSheet2.z().f30935j.d(), Boolean.TRUE);
                            PpButton ppButton = transferByLoanSheet2.f30040X;
                            if (ppButton != null) {
                                ppButton.setEnabled(z12 && !zC);
                            }
                            transferByLoanSheet2.v();
                            CLRepaymentPlanData plan = (CLRepaymentPlanData) CollectionsKt.G(i13, r12);
                            if (plan != null) {
                                Intrinsics.checkNotNullParameter(plan, "plan");
                                if (!J3.a.f4492d) {
                                    J3.a.f4492d = true;
                                    Pa.n0 n0VarG = Pa.n0.g();
                                    Integer loanDays3 = plan.getLoanDays();
                                    Pair pair = new Pair("tenure_days", String.valueOf(loanDays3 != null ? loanDays3.intValue() : 0));
                                    Double interestRatio = plan.getInterestRatio();
                                    if (interestRatio == null || (string = interestRatio.toString()) == null) {
                                        string = "0";
                                    }
                                    n0VarG.w("loan_transfer_trial_page_view", J3.a.g(pair, new Pair("interest_rate", string)));
                                }
                            }
                        }
                        return Unit.f38893a;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        int i19 = TransferByLoanSheet.f30032q0;
                        Object objD = transferByLoanSheet.z().f30933g.d();
                        Jb.G g10 = objD instanceof Jb.G ? (Jb.G) objD : null;
                        if (g10 == null) {
                            return Unit.f38893a;
                        }
                        boolean zC2 = Intrinsics.c(bool, Boolean.TRUE);
                        PpButton ppButton2 = transferByLoanSheet.f30040X;
                        if (ppButton2 != null) {
                            if (g10.f4704e && !zC2) {
                                z3 = true;
                            }
                            ppButton2.setEnabled(z3);
                        }
                        return Unit.f38893a;
                    case 2:
                        String str2 = (String) obj;
                        int i20 = TransferByLoanSheet.f30032q0;
                        if (str2 == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.z().f30936o.k(null);
                        transferByLoanSheet.y();
                        return Unit.f38893a;
                    default:
                        TransferByLoanResult transferByLoanResult = (TransferByLoanResult) obj;
                        int i21 = TransferByLoanSheet.f30032q0;
                        if (transferByLoanResult == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.w(transferByLoanResult);
                        return Unit.f38893a;
                }
            }
        }, 7));
        final int i10 = 1;
        z().f30935j.e(this, new Wd.I(new Function1(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferByLoanSheet f30175b;

            {
                this.f30175b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                String string;
                int iB;
                Long repaymentDate;
                String str;
                RepaymentPlan repaymentPlan;
                HorizontalScrollView horizontalScrollView;
                LinearLayout linearLayout;
                int i11;
                LinearLayout.LayoutParams layoutParams;
                z3 = false;
                boolean z3 = false;
                int i12 = 1;
                Throwable th = null;
                TransferByLoanSheet transferByLoanSheet = this.f30175b;
                switch (i10) {
                    case 0:
                        Jb.J j6 = (Jb.J) obj;
                        int i13 = TransferByLoanSheet.f30032q0;
                        boolean z8 = j6 instanceof Jb.I;
                        TransferByLoanSheet transferByLoanSheet2 = this.f30175b;
                        if (z8) {
                            ProgressBar progressBar = transferByLoanSheet2.f30046o;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                            }
                            transferByLoanSheet2.A(false);
                        } else if (j6 instanceof Jb.H) {
                            transferByLoanSheet2.y();
                        } else {
                            if (!(j6 instanceof Jb.G)) {
                                throw new p355xf.l();
                            }
                            Jb.G g7 = (Jb.G) j6;
                            transferByLoanSheet2.f30044j = g7.f4700a;
                            ProgressBar progressBar2 = transferByLoanSheet2.f30046o;
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            transferByLoanSheet2.A(true);
                            transferByLoanSheet2.u();
                            ViewGroup viewGroup = transferByLoanSheet2.f30050w;
                            ?? r12 = g7.f4702c;
                            int i14 = g7.f4703d;
                            if (viewGroup != null) {
                                int size = r12.size();
                                boolean z10 = size <= 2;
                                HorizontalScrollView horizontalScrollView2 = transferByLoanSheet2.f30049v;
                                if (horizontalScrollView2 != null) {
                                    horizontalScrollView2.setFillViewport(z10);
                                }
                                viewGroup.removeAllViews();
                                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                                layoutParams2.width = z10 ? -1 : -2;
                                viewGroup.setLayoutParams(layoutParams2);
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(transferByLoanSheet2.getContext());
                                Iterator it = ((Iterable) r12).iterator();
                                int i15 = 0;
                                while (true) {
                                    Throwable th2 = th;
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i16 = i15 + 1;
                                        if (i15 < 0) {
                                            C1850q.k();
                                            throw th2;
                                        }
                                        CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) next;
                                        View viewInflate = layoutInflaterFrom.inflate(Ya.f.cs_cl_transfer_by_loan_tenure_item, viewGroup, false);
                                        if (z10) {
                                            layoutParams = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            if (i15 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        } else {
                                            layoutParams = new LinearLayout.LayoutParams(-2, CommonViewExtKt.getDp(48));
                                            if (i15 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        }
                                        viewInflate.setLayoutParams(layoutParams);
                                        viewInflate.setMinimumWidth(z10 ? 0 : CommonViewExtKt.getDp(72));
                                        TextView textView = (TextView) viewInflate.findViewById(Ya.e.tvTenureDays);
                                        int i17 = Ya.g.cs_transfer_by_loan_tenure_days;
                                        Integer loanDays = cLRepaymentPlanData.getLoanDays();
                                        textView.setText(transferByLoanSheet2.getString(i17, Integer.valueOf(loanDays != null ? loanDays.intValue() : 0)));
                                        TextView textView2 = (TextView) viewInflate.findViewById(Ya.e.tvTenureTerms);
                                        int i18 = Ya.g.cs_transfer_by_loan_tenure_terms;
                                        Integer loanTerm = cLRepaymentPlanData.getLoanTerm();
                                        textView2.setText(transferByLoanSheet2.getString(i18, Integer.valueOf(loanTerm != null ? loanTerm.intValue() : 0)));
                                        boolean z11 = i15 == i14;
                                        viewInflate.setBackgroundResource(z11 ? Ya.d.cs_cl_transfer_by_loan_tenure_selected : Ya.d.cs_cl_transfer_by_loan_tenure_unselected);
                                        ((TextView) viewInflate.findViewById(Ya.e.tvTenureDays)).setTextColor(transferByLoanSheet2.requireContext().getColor(z11 ? L6.b.ppColorPrimary : L6.b.ppColorTextPrimary));
                                        viewInflate.setOnClickListener(new Ad.V(transferByLoanSheet2, i15, 4));
                                        viewGroup.addView(viewInflate);
                                        th = th2;
                                        i15 = i16;
                                        i12 = 1;
                                    } else {
                                        if (size == i12) {
                                            View view = new View(transferByLoanSheet2.getContext());
                                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            layoutParams3.setMarginStart(CommonViewExtKt.getDp(12));
                                            view.setLayoutParams(layoutParams3);
                                            view.setImportantForAccessibility(2);
                                            viewGroup.addView(view);
                                        }
                                        HorizontalScrollView horizontalScrollView3 = transferByLoanSheet2.f30049v;
                                        if (horizontalScrollView3 != null) {
                                            horizontalScrollView3.requestLayout();
                                        }
                                        if (!z10 && (horizontalScrollView = transferByLoanSheet2.f30049v) != null && (linearLayout = transferByLoanSheet2.f30050w) != null && (i11 = g7.f4703d) >= 0 && i11 < size) {
                                            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new q1(linearLayout, transferByLoanSheet2, i11, horizontalScrollView, size));
                                        }
                                    }
                                }
                            }
                            CLRepaymentPlanData cLRepaymentPlanData2 = (CLRepaymentPlanData) CollectionsKt.G(i14, r12);
                            boolean z12 = g7.f4704e;
                            if (cLRepaymentPlanData2 != null) {
                                Integer loanTerm2 = cLRepaymentPlanData2.getLoanTerm();
                                int iIntValue = loanTerm2 != null ? loanTerm2.intValue() : 1;
                                if (iIntValue < 1) {
                                    iIntValue = 1;
                                }
                                Long outstandingAmountSum = cLRepaymentPlanData2.getOutstandingAmountSum();
                                long jLongValue = outstandingAmountSum != null ? outstandingAmountSum.longValue() : 0L;
                                Long discountInterestSum = cLRepaymentPlanData2.getDiscountInterestSum();
                                long jLongValue2 = jLongValue + (discountInterestSum != null ? discountInterestSum.longValue() : 0L);
                                long j10 = iIntValue;
                                TransferByLoanSheet.t(transferByLoanSheet2.f30033A, transferByLoanSheet2.f30034B, jLongValue / j10, jLongValue2 / j10);
                                if (iIntValue > 0) {
                                    Integer loanDays2 = cLRepaymentPlanData2.getLoanDays();
                                    iB = Nf.b.b((loanDays2 != null ? loanDays2.intValue() : 0) / iIntValue);
                                } else {
                                    iB = 0;
                                }
                                TextView textView3 = transferByLoanSheet2.f30035C;
                                if (textView3 != null) {
                                    int i19 = Ya.g.cs_transfer_by_loan_payment_schedule_value;
                                    Integer loanTerm3 = cLRepaymentPlanData2.getLoanTerm();
                                    textView3.setText(transferByLoanSheet2.getString(i19, Integer.valueOf(loanTerm3 != null ? loanTerm3.intValue() : 0), Integer.valueOf(iB)));
                                }
                                List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData2.getRepaymentPlanList();
                                if (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.firstOrNull(repaymentPlanList)) == null || (repaymentDate = repaymentPlan.getRepaymentDate()) == null) {
                                    repaymentDate = cLRepaymentPlanData2.getRepaymentDate();
                                }
                                TextView textView4 = transferByLoanSheet2.f30036H;
                                if (textView4 != null) {
                                    if (repaymentDate == null || repaymentDate.longValue() <= 0) {
                                        str = "";
                                    } else {
                                        str = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).format(new Date(repaymentDate.longValue() < 10000000000L ? repaymentDate.longValue() * ((long) 1000) : repaymentDate.longValue()));
                                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    }
                                    textView4.setText(str);
                                }
                                TransferByLoanSheet.t(transferByLoanSheet2.f30037L, transferByLoanSheet2.f30038M, jLongValue, jLongValue2);
                                transferByLoanSheet2.f30048p0 = true;
                                CheckBox checkBox = transferByLoanSheet2.f30039Q;
                                if (checkBox != null) {
                                    checkBox.setChecked(z12);
                                }
                                transferByLoanSheet2.f30048p0 = false;
                            }
                            boolean zC = Intrinsics.c(transferByLoanSheet2.z().f30935j.d(), Boolean.TRUE);
                            PpButton ppButton = transferByLoanSheet2.f30040X;
                            if (ppButton != null) {
                                ppButton.setEnabled(z12 && !zC);
                            }
                            transferByLoanSheet2.v();
                            CLRepaymentPlanData plan = (CLRepaymentPlanData) CollectionsKt.G(i14, r12);
                            if (plan != null) {
                                Intrinsics.checkNotNullParameter(plan, "plan");
                                if (!J3.a.f4492d) {
                                    J3.a.f4492d = true;
                                    Pa.n0 n0VarG = Pa.n0.g();
                                    Integer loanDays3 = plan.getLoanDays();
                                    Pair pair = new Pair("tenure_days", String.valueOf(loanDays3 != null ? loanDays3.intValue() : 0));
                                    Double interestRatio = plan.getInterestRatio();
                                    if (interestRatio == null || (string = interestRatio.toString()) == null) {
                                        string = "0";
                                    }
                                    n0VarG.w("loan_transfer_trial_page_view", J3.a.g(pair, new Pair("interest_rate", string)));
                                }
                            }
                        }
                        return Unit.f38893a;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        int i110 = TransferByLoanSheet.f30032q0;
                        Object objD = transferByLoanSheet.z().f30933g.d();
                        Jb.G g10 = objD instanceof Jb.G ? (Jb.G) objD : null;
                        if (g10 == null) {
                            return Unit.f38893a;
                        }
                        boolean zC2 = Intrinsics.c(bool, Boolean.TRUE);
                        PpButton ppButton2 = transferByLoanSheet.f30040X;
                        if (ppButton2 != null) {
                            if (g10.f4704e && !zC2) {
                                z3 = true;
                            }
                            ppButton2.setEnabled(z3);
                        }
                        return Unit.f38893a;
                    case 2:
                        String str2 = (String) obj;
                        int i20 = TransferByLoanSheet.f30032q0;
                        if (str2 == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.z().f30936o.k(null);
                        transferByLoanSheet.y();
                        return Unit.f38893a;
                    default:
                        TransferByLoanResult transferByLoanResult = (TransferByLoanResult) obj;
                        int i21 = TransferByLoanSheet.f30032q0;
                        if (transferByLoanResult == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.w(transferByLoanResult);
                        return Unit.f38893a;
                }
            }
        }, 7));
        final int i11 = 2;
        z().f30937p.e(this, new Wd.I(new Function1(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferByLoanSheet f30175b;

            {
                this.f30175b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                String string;
                int iB;
                Long repaymentDate;
                String str;
                RepaymentPlan repaymentPlan;
                HorizontalScrollView horizontalScrollView;
                LinearLayout linearLayout;
                int i12;
                LinearLayout.LayoutParams layoutParams;
                z3 = false;
                boolean z3 = false;
                int i13 = 1;
                Throwable th = null;
                TransferByLoanSheet transferByLoanSheet = this.f30175b;
                switch (i11) {
                    case 0:
                        Jb.J j6 = (Jb.J) obj;
                        int i14 = TransferByLoanSheet.f30032q0;
                        boolean z8 = j6 instanceof Jb.I;
                        TransferByLoanSheet transferByLoanSheet2 = this.f30175b;
                        if (z8) {
                            ProgressBar progressBar = transferByLoanSheet2.f30046o;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                            }
                            transferByLoanSheet2.A(false);
                        } else if (j6 instanceof Jb.H) {
                            transferByLoanSheet2.y();
                        } else {
                            if (!(j6 instanceof Jb.G)) {
                                throw new p355xf.l();
                            }
                            Jb.G g7 = (Jb.G) j6;
                            transferByLoanSheet2.f30044j = g7.f4700a;
                            ProgressBar progressBar2 = transferByLoanSheet2.f30046o;
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            transferByLoanSheet2.A(true);
                            transferByLoanSheet2.u();
                            ViewGroup viewGroup = transferByLoanSheet2.f30050w;
                            ?? r12 = g7.f4702c;
                            int i15 = g7.f4703d;
                            if (viewGroup != null) {
                                int size = r12.size();
                                boolean z10 = size <= 2;
                                HorizontalScrollView horizontalScrollView2 = transferByLoanSheet2.f30049v;
                                if (horizontalScrollView2 != null) {
                                    horizontalScrollView2.setFillViewport(z10);
                                }
                                viewGroup.removeAllViews();
                                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                                layoutParams2.width = z10 ? -1 : -2;
                                viewGroup.setLayoutParams(layoutParams2);
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(transferByLoanSheet2.getContext());
                                Iterator it = ((Iterable) r12).iterator();
                                int i16 = 0;
                                while (true) {
                                    Throwable th2 = th;
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i17 = i16 + 1;
                                        if (i16 < 0) {
                                            C1850q.k();
                                            throw th2;
                                        }
                                        CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) next;
                                        View viewInflate = layoutInflaterFrom.inflate(Ya.f.cs_cl_transfer_by_loan_tenure_item, viewGroup, false);
                                        if (z10) {
                                            layoutParams = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            if (i16 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        } else {
                                            layoutParams = new LinearLayout.LayoutParams(-2, CommonViewExtKt.getDp(48));
                                            if (i16 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        }
                                        viewInflate.setLayoutParams(layoutParams);
                                        viewInflate.setMinimumWidth(z10 ? 0 : CommonViewExtKt.getDp(72));
                                        TextView textView = (TextView) viewInflate.findViewById(Ya.e.tvTenureDays);
                                        int i18 = Ya.g.cs_transfer_by_loan_tenure_days;
                                        Integer loanDays = cLRepaymentPlanData.getLoanDays();
                                        textView.setText(transferByLoanSheet2.getString(i18, Integer.valueOf(loanDays != null ? loanDays.intValue() : 0)));
                                        TextView textView2 = (TextView) viewInflate.findViewById(Ya.e.tvTenureTerms);
                                        int i19 = Ya.g.cs_transfer_by_loan_tenure_terms;
                                        Integer loanTerm = cLRepaymentPlanData.getLoanTerm();
                                        textView2.setText(transferByLoanSheet2.getString(i19, Integer.valueOf(loanTerm != null ? loanTerm.intValue() : 0)));
                                        boolean z11 = i16 == i15;
                                        viewInflate.setBackgroundResource(z11 ? Ya.d.cs_cl_transfer_by_loan_tenure_selected : Ya.d.cs_cl_transfer_by_loan_tenure_unselected);
                                        ((TextView) viewInflate.findViewById(Ya.e.tvTenureDays)).setTextColor(transferByLoanSheet2.requireContext().getColor(z11 ? L6.b.ppColorPrimary : L6.b.ppColorTextPrimary));
                                        viewInflate.setOnClickListener(new Ad.V(transferByLoanSheet2, i16, 4));
                                        viewGroup.addView(viewInflate);
                                        th = th2;
                                        i16 = i17;
                                        i13 = 1;
                                    } else {
                                        if (size == i13) {
                                            View view = new View(transferByLoanSheet2.getContext());
                                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            layoutParams3.setMarginStart(CommonViewExtKt.getDp(12));
                                            view.setLayoutParams(layoutParams3);
                                            view.setImportantForAccessibility(2);
                                            viewGroup.addView(view);
                                        }
                                        HorizontalScrollView horizontalScrollView3 = transferByLoanSheet2.f30049v;
                                        if (horizontalScrollView3 != null) {
                                            horizontalScrollView3.requestLayout();
                                        }
                                        if (!z10 && (horizontalScrollView = transferByLoanSheet2.f30049v) != null && (linearLayout = transferByLoanSheet2.f30050w) != null && (i12 = g7.f4703d) >= 0 && i12 < size) {
                                            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new q1(linearLayout, transferByLoanSheet2, i12, horizontalScrollView, size));
                                        }
                                    }
                                }
                            }
                            CLRepaymentPlanData cLRepaymentPlanData2 = (CLRepaymentPlanData) CollectionsKt.G(i15, r12);
                            boolean z12 = g7.f4704e;
                            if (cLRepaymentPlanData2 != null) {
                                Integer loanTerm2 = cLRepaymentPlanData2.getLoanTerm();
                                int iIntValue = loanTerm2 != null ? loanTerm2.intValue() : 1;
                                if (iIntValue < 1) {
                                    iIntValue = 1;
                                }
                                Long outstandingAmountSum = cLRepaymentPlanData2.getOutstandingAmountSum();
                                long jLongValue = outstandingAmountSum != null ? outstandingAmountSum.longValue() : 0L;
                                Long discountInterestSum = cLRepaymentPlanData2.getDiscountInterestSum();
                                long jLongValue2 = jLongValue + (discountInterestSum != null ? discountInterestSum.longValue() : 0L);
                                long j10 = iIntValue;
                                TransferByLoanSheet.t(transferByLoanSheet2.f30033A, transferByLoanSheet2.f30034B, jLongValue / j10, jLongValue2 / j10);
                                if (iIntValue > 0) {
                                    Integer loanDays2 = cLRepaymentPlanData2.getLoanDays();
                                    iB = Nf.b.b((loanDays2 != null ? loanDays2.intValue() : 0) / iIntValue);
                                } else {
                                    iB = 0;
                                }
                                TextView textView3 = transferByLoanSheet2.f30035C;
                                if (textView3 != null) {
                                    int i110 = Ya.g.cs_transfer_by_loan_payment_schedule_value;
                                    Integer loanTerm3 = cLRepaymentPlanData2.getLoanTerm();
                                    textView3.setText(transferByLoanSheet2.getString(i110, Integer.valueOf(loanTerm3 != null ? loanTerm3.intValue() : 0), Integer.valueOf(iB)));
                                }
                                List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData2.getRepaymentPlanList();
                                if (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.firstOrNull(repaymentPlanList)) == null || (repaymentDate = repaymentPlan.getRepaymentDate()) == null) {
                                    repaymentDate = cLRepaymentPlanData2.getRepaymentDate();
                                }
                                TextView textView4 = transferByLoanSheet2.f30036H;
                                if (textView4 != null) {
                                    if (repaymentDate == null || repaymentDate.longValue() <= 0) {
                                        str = "";
                                    } else {
                                        str = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).format(new Date(repaymentDate.longValue() < 10000000000L ? repaymentDate.longValue() * ((long) 1000) : repaymentDate.longValue()));
                                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    }
                                    textView4.setText(str);
                                }
                                TransferByLoanSheet.t(transferByLoanSheet2.f30037L, transferByLoanSheet2.f30038M, jLongValue, jLongValue2);
                                transferByLoanSheet2.f30048p0 = true;
                                CheckBox checkBox = transferByLoanSheet2.f30039Q;
                                if (checkBox != null) {
                                    checkBox.setChecked(z12);
                                }
                                transferByLoanSheet2.f30048p0 = false;
                            }
                            boolean zC = Intrinsics.c(transferByLoanSheet2.z().f30935j.d(), Boolean.TRUE);
                            PpButton ppButton = transferByLoanSheet2.f30040X;
                            if (ppButton != null) {
                                ppButton.setEnabled(z12 && !zC);
                            }
                            transferByLoanSheet2.v();
                            CLRepaymentPlanData plan = (CLRepaymentPlanData) CollectionsKt.G(i15, r12);
                            if (plan != null) {
                                Intrinsics.checkNotNullParameter(plan, "plan");
                                if (!J3.a.f4492d) {
                                    J3.a.f4492d = true;
                                    Pa.n0 n0VarG = Pa.n0.g();
                                    Integer loanDays3 = plan.getLoanDays();
                                    Pair pair = new Pair("tenure_days", String.valueOf(loanDays3 != null ? loanDays3.intValue() : 0));
                                    Double interestRatio = plan.getInterestRatio();
                                    if (interestRatio == null || (string = interestRatio.toString()) == null) {
                                        string = "0";
                                    }
                                    n0VarG.w("loan_transfer_trial_page_view", J3.a.g(pair, new Pair("interest_rate", string)));
                                }
                            }
                        }
                        return Unit.f38893a;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        int i111 = TransferByLoanSheet.f30032q0;
                        Object objD = transferByLoanSheet.z().f30933g.d();
                        Jb.G g10 = objD instanceof Jb.G ? (Jb.G) objD : null;
                        if (g10 == null) {
                            return Unit.f38893a;
                        }
                        boolean zC2 = Intrinsics.c(bool, Boolean.TRUE);
                        PpButton ppButton2 = transferByLoanSheet.f30040X;
                        if (ppButton2 != null) {
                            if (g10.f4704e && !zC2) {
                                z3 = true;
                            }
                            ppButton2.setEnabled(z3);
                        }
                        return Unit.f38893a;
                    case 2:
                        String str2 = (String) obj;
                        int i20 = TransferByLoanSheet.f30032q0;
                        if (str2 == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.z().f30936o.k(null);
                        transferByLoanSheet.y();
                        return Unit.f38893a;
                    default:
                        TransferByLoanResult transferByLoanResult = (TransferByLoanResult) obj;
                        int i21 = TransferByLoanSheet.f30032q0;
                        if (transferByLoanResult == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.w(transferByLoanResult);
                        return Unit.f38893a;
                }
            }
        }, 7));
        final int i12 = 3;
        z().f30938v.e(this, new Wd.I(new Function1(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferByLoanSheet f30175b;

            {
                this.f30175b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                String string;
                int iB;
                Long repaymentDate;
                String str;
                RepaymentPlan repaymentPlan;
                HorizontalScrollView horizontalScrollView;
                LinearLayout linearLayout;
                int i13;
                LinearLayout.LayoutParams layoutParams;
                z3 = false;
                boolean z3 = false;
                int i14 = 1;
                Throwable th = null;
                TransferByLoanSheet transferByLoanSheet = this.f30175b;
                switch (i12) {
                    case 0:
                        Jb.J j6 = (Jb.J) obj;
                        int i15 = TransferByLoanSheet.f30032q0;
                        boolean z8 = j6 instanceof Jb.I;
                        TransferByLoanSheet transferByLoanSheet2 = this.f30175b;
                        if (z8) {
                            ProgressBar progressBar = transferByLoanSheet2.f30046o;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                            }
                            transferByLoanSheet2.A(false);
                        } else if (j6 instanceof Jb.H) {
                            transferByLoanSheet2.y();
                        } else {
                            if (!(j6 instanceof Jb.G)) {
                                throw new p355xf.l();
                            }
                            Jb.G g7 = (Jb.G) j6;
                            transferByLoanSheet2.f30044j = g7.f4700a;
                            ProgressBar progressBar2 = transferByLoanSheet2.f30046o;
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            transferByLoanSheet2.A(true);
                            transferByLoanSheet2.u();
                            ViewGroup viewGroup = transferByLoanSheet2.f30050w;
                            ?? r12 = g7.f4702c;
                            int i16 = g7.f4703d;
                            if (viewGroup != null) {
                                int size = r12.size();
                                boolean z10 = size <= 2;
                                HorizontalScrollView horizontalScrollView2 = transferByLoanSheet2.f30049v;
                                if (horizontalScrollView2 != null) {
                                    horizontalScrollView2.setFillViewport(z10);
                                }
                                viewGroup.removeAllViews();
                                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                                layoutParams2.width = z10 ? -1 : -2;
                                viewGroup.setLayoutParams(layoutParams2);
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(transferByLoanSheet2.getContext());
                                Iterator it = ((Iterable) r12).iterator();
                                int i17 = 0;
                                while (true) {
                                    Throwable th2 = th;
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i18 = i17 + 1;
                                        if (i17 < 0) {
                                            C1850q.k();
                                            throw th2;
                                        }
                                        CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) next;
                                        View viewInflate = layoutInflaterFrom.inflate(Ya.f.cs_cl_transfer_by_loan_tenure_item, viewGroup, false);
                                        if (z10) {
                                            layoutParams = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            if (i17 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        } else {
                                            layoutParams = new LinearLayout.LayoutParams(-2, CommonViewExtKt.getDp(48));
                                            if (i17 > 0) {
                                                layoutParams.setMarginStart(CommonViewExtKt.getDp(12));
                                            }
                                        }
                                        viewInflate.setLayoutParams(layoutParams);
                                        viewInflate.setMinimumWidth(z10 ? 0 : CommonViewExtKt.getDp(72));
                                        TextView textView = (TextView) viewInflate.findViewById(Ya.e.tvTenureDays);
                                        int i19 = Ya.g.cs_transfer_by_loan_tenure_days;
                                        Integer loanDays = cLRepaymentPlanData.getLoanDays();
                                        textView.setText(transferByLoanSheet2.getString(i19, Integer.valueOf(loanDays != null ? loanDays.intValue() : 0)));
                                        TextView textView2 = (TextView) viewInflate.findViewById(Ya.e.tvTenureTerms);
                                        int i110 = Ya.g.cs_transfer_by_loan_tenure_terms;
                                        Integer loanTerm = cLRepaymentPlanData.getLoanTerm();
                                        textView2.setText(transferByLoanSheet2.getString(i110, Integer.valueOf(loanTerm != null ? loanTerm.intValue() : 0)));
                                        boolean z11 = i17 == i16;
                                        viewInflate.setBackgroundResource(z11 ? Ya.d.cs_cl_transfer_by_loan_tenure_selected : Ya.d.cs_cl_transfer_by_loan_tenure_unselected);
                                        ((TextView) viewInflate.findViewById(Ya.e.tvTenureDays)).setTextColor(transferByLoanSheet2.requireContext().getColor(z11 ? L6.b.ppColorPrimary : L6.b.ppColorTextPrimary));
                                        viewInflate.setOnClickListener(new Ad.V(transferByLoanSheet2, i17, 4));
                                        viewGroup.addView(viewInflate);
                                        th = th2;
                                        i17 = i18;
                                        i14 = 1;
                                    } else {
                                        if (size == i14) {
                                            View view = new View(transferByLoanSheet2.getContext());
                                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(48), 1.0f);
                                            layoutParams3.setMarginStart(CommonViewExtKt.getDp(12));
                                            view.setLayoutParams(layoutParams3);
                                            view.setImportantForAccessibility(2);
                                            viewGroup.addView(view);
                                        }
                                        HorizontalScrollView horizontalScrollView3 = transferByLoanSheet2.f30049v;
                                        if (horizontalScrollView3 != null) {
                                            horizontalScrollView3.requestLayout();
                                        }
                                        if (!z10 && (horizontalScrollView = transferByLoanSheet2.f30049v) != null && (linearLayout = transferByLoanSheet2.f30050w) != null && (i13 = g7.f4703d) >= 0 && i13 < size) {
                                            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new q1(linearLayout, transferByLoanSheet2, i13, horizontalScrollView, size));
                                        }
                                    }
                                }
                            }
                            CLRepaymentPlanData cLRepaymentPlanData2 = (CLRepaymentPlanData) CollectionsKt.G(i16, r12);
                            boolean z12 = g7.f4704e;
                            if (cLRepaymentPlanData2 != null) {
                                Integer loanTerm2 = cLRepaymentPlanData2.getLoanTerm();
                                int iIntValue = loanTerm2 != null ? loanTerm2.intValue() : 1;
                                if (iIntValue < 1) {
                                    iIntValue = 1;
                                }
                                Long outstandingAmountSum = cLRepaymentPlanData2.getOutstandingAmountSum();
                                long jLongValue = outstandingAmountSum != null ? outstandingAmountSum.longValue() : 0L;
                                Long discountInterestSum = cLRepaymentPlanData2.getDiscountInterestSum();
                                long jLongValue2 = jLongValue + (discountInterestSum != null ? discountInterestSum.longValue() : 0L);
                                long j10 = iIntValue;
                                TransferByLoanSheet.t(transferByLoanSheet2.f30033A, transferByLoanSheet2.f30034B, jLongValue / j10, jLongValue2 / j10);
                                if (iIntValue > 0) {
                                    Integer loanDays2 = cLRepaymentPlanData2.getLoanDays();
                                    iB = Nf.b.b((loanDays2 != null ? loanDays2.intValue() : 0) / iIntValue);
                                } else {
                                    iB = 0;
                                }
                                TextView textView3 = transferByLoanSheet2.f30035C;
                                if (textView3 != null) {
                                    int i111 = Ya.g.cs_transfer_by_loan_payment_schedule_value;
                                    Integer loanTerm3 = cLRepaymentPlanData2.getLoanTerm();
                                    textView3.setText(transferByLoanSheet2.getString(i111, Integer.valueOf(loanTerm3 != null ? loanTerm3.intValue() : 0), Integer.valueOf(iB)));
                                }
                                List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData2.getRepaymentPlanList();
                                if (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.firstOrNull(repaymentPlanList)) == null || (repaymentDate = repaymentPlan.getRepaymentDate()) == null) {
                                    repaymentDate = cLRepaymentPlanData2.getRepaymentDate();
                                }
                                TextView textView4 = transferByLoanSheet2.f30036H;
                                if (textView4 != null) {
                                    if (repaymentDate == null || repaymentDate.longValue() <= 0) {
                                        str = "";
                                    } else {
                                        str = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).format(new Date(repaymentDate.longValue() < 10000000000L ? repaymentDate.longValue() * ((long) 1000) : repaymentDate.longValue()));
                                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    }
                                    textView4.setText(str);
                                }
                                TransferByLoanSheet.t(transferByLoanSheet2.f30037L, transferByLoanSheet2.f30038M, jLongValue, jLongValue2);
                                transferByLoanSheet2.f30048p0 = true;
                                CheckBox checkBox = transferByLoanSheet2.f30039Q;
                                if (checkBox != null) {
                                    checkBox.setChecked(z12);
                                }
                                transferByLoanSheet2.f30048p0 = false;
                            }
                            boolean zC = Intrinsics.c(transferByLoanSheet2.z().f30935j.d(), Boolean.TRUE);
                            PpButton ppButton = transferByLoanSheet2.f30040X;
                            if (ppButton != null) {
                                ppButton.setEnabled(z12 && !zC);
                            }
                            transferByLoanSheet2.v();
                            CLRepaymentPlanData plan = (CLRepaymentPlanData) CollectionsKt.G(i16, r12);
                            if (plan != null) {
                                Intrinsics.checkNotNullParameter(plan, "plan");
                                if (!J3.a.f4492d) {
                                    J3.a.f4492d = true;
                                    Pa.n0 n0VarG = Pa.n0.g();
                                    Integer loanDays3 = plan.getLoanDays();
                                    Pair pair = new Pair("tenure_days", String.valueOf(loanDays3 != null ? loanDays3.intValue() : 0));
                                    Double interestRatio = plan.getInterestRatio();
                                    if (interestRatio == null || (string = interestRatio.toString()) == null) {
                                        string = "0";
                                    }
                                    n0VarG.w("loan_transfer_trial_page_view", J3.a.g(pair, new Pair("interest_rate", string)));
                                }
                            }
                        }
                        return Unit.f38893a;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        int i112 = TransferByLoanSheet.f30032q0;
                        Object objD = transferByLoanSheet.z().f30933g.d();
                        Jb.G g10 = objD instanceof Jb.G ? (Jb.G) objD : null;
                        if (g10 == null) {
                            return Unit.f38893a;
                        }
                        boolean zC2 = Intrinsics.c(bool, Boolean.TRUE);
                        PpButton ppButton2 = transferByLoanSheet.f30040X;
                        if (ppButton2 != null) {
                            if (g10.f4704e && !zC2) {
                                z3 = true;
                            }
                            ppButton2.setEnabled(z3);
                        }
                        return Unit.f38893a;
                    case 2:
                        String str2 = (String) obj;
                        int i20 = TransferByLoanSheet.f30032q0;
                        if (str2 == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.z().f30936o.k(null);
                        transferByLoanSheet.y();
                        return Unit.f38893a;
                    default:
                        TransferByLoanResult transferByLoanResult = (TransferByLoanResult) obj;
                        int i21 = TransferByLoanSheet.f30032q0;
                        if (transferByLoanResult == null) {
                            return Unit.f38893a;
                        }
                        transferByLoanSheet.w(transferByLoanResult);
                        return Unit.f38893a;
                }
            }
        }, 7));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        v();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        View view = this.f27318b;
        if (view != null) {
            this.f30046o = (ProgressBar) view.findViewById(Ya.e.progressLoading);
            this.f30047p = (TextView) view.findViewById(Ya.e.tvPrincipal);
            this.t = (TextView) view.findViewById(Ya.e.tvAccountNumber);
            this.f30049v = (HorizontalScrollView) view.findViewById(Ya.e.hsvTenure);
            this.f30050w = (LinearLayout) view.findViewById(Ya.e.llTenure);
            this.f30033A = (TextView) view.findViewById(Ya.e.tvPaymentPerTerm);
            this.f30034B = (TextView) view.findViewById(Ya.e.tvPaymentPerTermOrigin);
            this.f30035C = (TextView) view.findViewById(Ya.e.tvPaymentSchedule);
            this.f30036H = (TextView) view.findViewById(Ya.e.tvFirstPaymentDate);
            this.f30037L = (TextView) view.findViewById(Ya.e.tvTotalRepayment);
            this.f30038M = (TextView) view.findViewById(Ya.e.tvTotalRepaymentOrigin);
            TextView textView = this.f30034B;
            if (textView != null) {
                textView.setPaintFlags(textView.getPaintFlags() | 16);
            }
            TextView textView2 = this.f30038M;
            if (textView2 != null) {
                textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            }
            this.f30039Q = (CheckBox) view.findViewById(Ya.e.cbAgreement);
            this.f30040X = (PpButton) view.findViewById(Ya.e.btnPrimary);
            this.f30041Y = view.findViewById(Ya.e.scrollContent);
            this.f30042Z = view.findViewById(Ya.e.llBanner);
            this.f30045k0 = view.findViewById(Ya.e.llBottomBar);
            View viewFindViewById = view.findViewById(Ya.e.ivBack);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.p1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferByLoanSheet f30181b;

                {
                    this.f30181b = this;
                }

                /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String string;
                    Long repaymentDate;
                    RepaymentPlan repaymentPlan;
                    TransferByLoanSheet transferByLoanSheet = this.f30181b;
                    switch (i7) {
                        case 0:
                            int i10 = TransferByLoanSheet.f30032q0;
                            transferByLoanSheet.x();
                            return;
                        default:
                            int i11 = TransferByLoanSheet.f30032q0;
                            Object objD = transferByLoanSheet.z().f30933g.d();
                            Jb.G g7 = objD instanceof Jb.G ? (Jb.G) objD : null;
                            if (g7 != null && g7.f4704e) {
                                CLRepaymentPlanData plan = (CLRepaymentPlanData) CollectionsKt.G(g7.f4703d, g7.f4702c);
                                if (plan == null) {
                                    return;
                                }
                                TransferByLoanOpenParams transferByLoanOpenParams = transferByLoanSheet.f30044j;
                                if (transferByLoanOpenParams == null) {
                                    Intrinsics.n("params");
                                    throw null;
                                }
                                long loanAmount = transferByLoanOpenParams.getLoanAmount();
                                Intrinsics.checkNotNullParameter(plan, "plan");
                                Pa.n0 n0VarG = Pa.n0.g();
                                Pair pair = new Pair("transfer_amount", String.valueOf(loanAmount));
                                Integer loanDays = plan.getLoanDays();
                                Pair pair2 = new Pair("tenure_days", String.valueOf(loanDays != null ? loanDays.intValue() : 0));
                                Double interestRatio = plan.getInterestRatio();
                                if (interestRatio == null || (string = interestRatio.toString()) == null) {
                                    string = "0";
                                }
                                n0VarG.n("loan_transfer_submit_click", J3.a.g(pair, pair2, new Pair("interest_rate", string)));
                                TransferByLoanViewModel transferByLoanViewModelZ = transferByLoanSheet.z();
                                if (transferByLoanViewModelZ.f30929B || transferByLoanViewModelZ.f30930C) {
                                    return;
                                }
                                Object objD2 = transferByLoanViewModelZ.f30932f.d();
                                Jb.G g10 = objD2 instanceof Jb.G ? (Jb.G) objD2 : null;
                                if (g10 != null && g10.f4704e) {
                                    CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) CollectionsKt.G(g10.f4703d, g10.f4702c);
                                    if (cLRepaymentPlanData == null) {
                                        return;
                                    }
                                    String cashierContextId = g10.f4700a.getCashierContextId();
                                    List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData.getRepaymentPlanList();
                                    if (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.L(repaymentPlanList)) == null || (repaymentDate = repaymentPlan.getRepaymentDate()) == null) {
                                        repaymentDate = cLRepaymentPlanData.getRepaymentDate();
                                    }
                                    if (repaymentDate == null || repaymentDate.longValue() <= 0) {
                                        repaymentDate = null;
                                    } else if (repaymentDate.longValue() < 10000000000L) {
                                        repaymentDate = Long.valueOf(repaymentDate.longValue() * ((long) 1000));
                                    }
                                    androidx.lifecycle.F f10 = transferByLoanViewModelZ.f30936o;
                                    if (cashierContextId == null || StringsKt.F(cashierContextId) || repaymentDate == null) {
                                        f10.k("");
                                        return;
                                    }
                                    transferByLoanViewModelZ.f30929B = true;
                                    transferByLoanViewModelZ.f30934i.k(Boolean.TRUE);
                                    f10.k(null);
                                    AbstractC0780y.m(androidx.lifecycle.V.h(transferByLoanViewModelZ), null, null, new Jb.K(g10, cLRepaymentPlanData, transferByLoanViewModelZ, null), 3);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            }, viewFindViewById);
            Context context = requireContext();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
            TextView textView3 = (TextView) view.findViewById(Ya.e.tvAgreement);
            Intrinsics.checkNotNullParameter(context, "context");
            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, context);
            if (textView3 != null) {
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                textView3.setHighlightColor(0);
                textView3.setText(new SpanUtils().append("I have read, understood, and agreed to ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, context)).append("Loan Agreement").setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 4)).append(" and ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, context)).append("Direct Debit Mandate").setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 5)).create());
            }
            CheckBox checkBox = this.f30039Q;
            if (checkBox != null) {
                checkBox.setOnCheckedChangeListener(new A8.g(this, 8));
            }
            PpButton ppButton = this.f30040X;
            if (ppButton != null) {
                final int i10 = 1;
                p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.p1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TransferByLoanSheet f30181b;

                    {
                        this.f30181b = this;
                    }

                    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String string;
                        Long repaymentDate;
                        RepaymentPlan repaymentPlan;
                        TransferByLoanSheet transferByLoanSheet = this.f30181b;
                        switch (i10) {
                            case 0:
                                int i11 = TransferByLoanSheet.f30032q0;
                                transferByLoanSheet.x();
                                return;
                            default:
                                int i12 = TransferByLoanSheet.f30032q0;
                                Object objD = transferByLoanSheet.z().f30933g.d();
                                Jb.G g7 = objD instanceof Jb.G ? (Jb.G) objD : null;
                                if (g7 != null && g7.f4704e) {
                                    CLRepaymentPlanData plan = (CLRepaymentPlanData) CollectionsKt.G(g7.f4703d, g7.f4702c);
                                    if (plan == null) {
                                        return;
                                    }
                                    TransferByLoanOpenParams transferByLoanOpenParams = transferByLoanSheet.f30044j;
                                    if (transferByLoanOpenParams == null) {
                                        Intrinsics.n("params");
                                        throw null;
                                    }
                                    long loanAmount = transferByLoanOpenParams.getLoanAmount();
                                    Intrinsics.checkNotNullParameter(plan, "plan");
                                    Pa.n0 n0VarG = Pa.n0.g();
                                    Pair pair = new Pair("transfer_amount", String.valueOf(loanAmount));
                                    Integer loanDays = plan.getLoanDays();
                                    Pair pair2 = new Pair("tenure_days", String.valueOf(loanDays != null ? loanDays.intValue() : 0));
                                    Double interestRatio = plan.getInterestRatio();
                                    if (interestRatio == null || (string = interestRatio.toString()) == null) {
                                        string = "0";
                                    }
                                    n0VarG.n("loan_transfer_submit_click", J3.a.g(pair, pair2, new Pair("interest_rate", string)));
                                    TransferByLoanViewModel transferByLoanViewModelZ = transferByLoanSheet.z();
                                    if (transferByLoanViewModelZ.f30929B || transferByLoanViewModelZ.f30930C) {
                                        return;
                                    }
                                    Object objD2 = transferByLoanViewModelZ.f30932f.d();
                                    Jb.G g10 = objD2 instanceof Jb.G ? (Jb.G) objD2 : null;
                                    if (g10 != null && g10.f4704e) {
                                        CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) CollectionsKt.G(g10.f4703d, g10.f4702c);
                                        if (cLRepaymentPlanData == null) {
                                            return;
                                        }
                                        String cashierContextId = g10.f4700a.getCashierContextId();
                                        List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData.getRepaymentPlanList();
                                        if (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.L(repaymentPlanList)) == null || (repaymentDate = repaymentPlan.getRepaymentDate()) == null) {
                                            repaymentDate = cLRepaymentPlanData.getRepaymentDate();
                                        }
                                        if (repaymentDate == null || repaymentDate.longValue() <= 0) {
                                            repaymentDate = null;
                                        } else if (repaymentDate.longValue() < 10000000000L) {
                                            repaymentDate = Long.valueOf(repaymentDate.longValue() * ((long) 1000));
                                        }
                                        androidx.lifecycle.F f10 = transferByLoanViewModelZ.f30936o;
                                        if (cashierContextId == null || StringsKt.F(cashierContextId) || repaymentDate == null) {
                                            f10.k("");
                                            return;
                                        }
                                        transferByLoanViewModelZ.f30929B = true;
                                        transferByLoanViewModelZ.f30934i.k(Boolean.TRUE);
                                        f10.k(null);
                                        AbstractC0780y.m(androidx.lifecycle.V.h(transferByLoanViewModelZ), null, null, new Jb.K(g10, cLRepaymentPlanData, transferByLoanViewModelZ, null), 3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, ppButton);
            }
            u();
            PpButton ppButton2 = this.f30040X;
            if (ppButton2 != null) {
                int i11 = Ya.g.cs_transfer_by_loan_borrow_and_transfer;
                TransferByLoanOpenParams transferByLoanOpenParams = this.f30044j;
                if (transferByLoanOpenParams != null) {
                    ppButton2.setText(getString(i11, Pa.r0.B(transferByLoanOpenParams.getLoanAmount(), false)));
                    return 0;
                }
                Intrinsics.n("params");
                throw null;
            }
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object objD = z().f30933g.d();
        Jb.G g7 = objD instanceof Jb.G ? (Jb.G) objD : null;
        this.f30044j = g7 != null ? g7.f4700a : new TransferByLoanOpenParams(0L, "", null, 4, null);
    }

    public final void u() {
        TextView textView = this.f30047p;
        if (textView != null) {
            TransferByLoanOpenParams transferByLoanOpenParams = this.f30044j;
            if (transferByLoanOpenParams == null) {
                Intrinsics.n("params");
                throw null;
            }
            textView.setText(Pa.r0.B(transferByLoanOpenParams.getLoanAmount(), false));
        }
        TextView textView2 = this.t;
        if (textView2 != null) {
            TransferByLoanOpenParams transferByLoanOpenParams2 = this.f30044j;
            if (transferByLoanOpenParams2 == null) {
                Intrinsics.n("params");
                throw null;
            }
            String strW0 = Pa.r0.w0(transferByLoanOpenParams2.getAccountNumber());
            textView2.setText(strW0 != null ? Pa.r0.w(strW0) : null);
        }
    }

    public final void v() {
        LinearLayout linearLayout;
        View view;
        View view2 = getView();
        if (view2 == null || (linearLayout = (LinearLayout) view2.findViewById(Ya.e.llSheetPanel)) == null || (view = this.f30041Y) == null) {
            return;
        }
        linearLayout.post(new androidx.camera.video.internal.encoder.m(this, linearLayout, (int) (getResources().getDisplayMetrics().heightPixels * 0.85f), view, 5));
    }

    public final void w(TransferByLoanResult transferByLoanResult) {
        KeyEventDispatcher$Component activity = getActivity();
        TransferByLoanResultConsumer transferByLoanResultConsumer = activity instanceof TransferByLoanResultConsumer ? (TransferByLoanResultConsumer) activity : null;
        if (transferByLoanResultConsumer != null) {
            transferByLoanResultConsumer.onTransferByLoanResult(transferByLoanResult);
            return;
        }
        androidx.fragment.app.Z parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        C1161a c1161a = new C1161a(parentFragmentManager);
        c1161a.m(this);
        c1161a.h(true);
    }

    public final void x() {
        Map mapC;
        TransferByLoanResult transferByLoanResult;
        TransferByLoanViewModel transferByLoanViewModelZ = z();
        TransferByLoanOpenParams params = this.f30044j;
        if (params == null) {
            Intrinsics.n("params");
            throw null;
        }
        transferByLoanViewModelZ.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        if (transferByLoanViewModelZ.f30930C) {
            transferByLoanResult = null;
        } else {
            transferByLoanViewModelZ.f30930C = true;
            String cashierContextId = params.getCashierContextId();
            if (cashierContextId == null || (mapC = com.airbnb.lottie.model.layer.d.q("cashierContextId", cashierContextId)) == null) {
                mapC = kotlin.collections.G.c();
            }
            transferByLoanResult = new TransferByLoanResult(TransferByLoanResult.STATUS_CANCELLED, mapC);
        }
        if (transferByLoanResult == null) {
            return;
        }
        TransferByLoanOpenParams transferByLoanOpenParams = this.f30044j;
        if (transferByLoanOpenParams == null) {
            Intrinsics.n("params");
            throw null;
        }
        long loanAmount = transferByLoanOpenParams.getLoanAmount();
        Pa.n0 n0VarG = Pa.n0.g();
        Pair[] pairArr = {new Pair("transfer_amount", String.valueOf(loanAmount))};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = J3.a.f4490b;
        if (str != null) {
            linkedHashMap.put("trace_id", str);
        }
        String str2 = J3.a.f4491c;
        if (str2 != null) {
            linkedHashMap.put("order_id", str2);
        }
        Pair pair = pairArr[0];
        linkedHashMap.put((String) pair.f38891a, (String) pair.f38892b);
        n0VarG.n("loan_transfer_cancel", linkedHashMap);
        w(transferByLoanResult);
    }

    public final void y() {
        Map mapC;
        if (z().f30930C) {
            return;
        }
        TransferByLoanViewModel transferByLoanViewModelZ = z();
        TransferByLoanOpenParams params = this.f30044j;
        if (params == null) {
            Intrinsics.n("params");
            throw null;
        }
        transferByLoanViewModelZ.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        transferByLoanViewModelZ.f30930C = true;
        String cashierContextId = params.getCashierContextId();
        if (cashierContextId == null || (mapC = com.airbnb.lottie.model.layer.d.q("cashierContextId", cashierContextId)) == null) {
            mapC = kotlin.collections.G.c();
        }
        w(new TransferByLoanResult(TransferByLoanResult.STATUS_FAILED, mapC));
    }

    public final TransferByLoanViewModel z() {
        return (TransferByLoanViewModel) this.f30043i.getValue();
    }
}
