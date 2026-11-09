package com.transsnet.palmpay.credit.view;

import Ae.j;
import C0.G;
import Ce.ViewOnClickListenerC0159a;
import Eb.n;
import Eb.o;
import F6.d;
import Gb.C0295s;
import Gb.C0296t;
import Gb.S;
import Gb.T;
import Gb.r;
import Gb.u;
import L6.b;
import Pa.n0;
import Pa.r0;
import Ya.e;
import Ya.g;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.Button;
import com.transsnet.palmpay.credit.bean.Card;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfo;
import com.transsnet.palmpay.credit.bean.OutstandingThemeInfo;
import com.transsnet.palmpay.credit.bean.Tag;
import com.transsnet.palmpay.credit.bean.Text;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.credit.bean.TopLine;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p099gb.f;
import p220oa.h;
import p339wb.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/view/TotalOutstandingView;", "Lcom/transsnet/palmpay/credit/view/BaseLoanView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", ViewProps.VISIBLE, "", "setLegacyControlsVisible", "(Z)V", "setWaiverRepayControlsVisible", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTotalOutstandingView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalOutstandingView.kt\ncom/transsnet/palmpay/credit/view/TotalOutstandingView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,589:1\n1761#2,3:590\n1#3:593\n*S KotlinDebug\n*F\n+ 1 TotalOutstandingView.kt\ncom/transsnet/palmpay/credit/view/TotalOutstandingView\n*L\n91#1:590,3\n*E\n"})
public final class TotalOutstandingView extends BaseLoanView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30883d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f30884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f30885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OutstandingContentInfo f30886c;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalOutstandingView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30884a = f.bind(View.inflate(context, Ya.f.cs_cl_total_outstanding_view, this).findViewById(e.rootView));
    }

    public static void g(OutstandingAccount outstandingAccount) {
        d.h("TotalOutstandingView", 3, "gotoPalmPayCardOverView >>> " + outstandingAccount);
        Integer num = outstandingAccount.outstandingBillCount;
        if ((num != null ? num.intValue() : 0) > 1) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "PalmPayCardMultiTerms");
            return;
        }
        Bundle bundle = new Bundle();
        Long l5 = outstandingAccount.billId;
        bundle.putLong("billId", l5 != null ? l5.longValue() : 0L);
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "PalmPayCardRepayment");
    }

    private final void setLegacyControlsVisible(boolean visible) {
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        ImageView imageView;
        ImageView imageView2;
        TextView textView3;
        ImageView imageView3;
        TextView textView4;
        ImageView imageView4;
        TextView textView5;
        int visibility = 8;
        int i7 = visible ? 0 : 8;
        f fVar = this.f30884a;
        if (fVar != null && (textView5 = fVar.tvTitle) != null) {
            textView5.setVisibility(i7);
        }
        if (fVar != null && (imageView4 = fVar.ivTitleIcon) != null) {
            imageView4.setVisibility(i7);
        }
        if (fVar != null && (textView4 = fVar.tvCouponAmount) != null) {
            textView4.setVisibility(i7);
        }
        if (fVar != null && (imageView3 = fVar.ivArrowRight) != null) {
            if (visible && fVar != null && imageView3 != null) {
                visibility = imageView3.getVisibility();
            }
            imageView3.setVisibility(visibility);
        }
        if (fVar != null && (textView3 = fVar.tvOutstandingAmount) != null) {
            textView3.setVisibility(i7);
        }
        if (fVar != null && (imageView2 = fVar.ivAmountIcon) != null) {
            imageView2.setVisibility(i7);
        }
        if (fVar != null && (imageView = fVar.tvRepaymentIcon) != null) {
            imageView.setVisibility(i7);
        }
        if (fVar != null && (textView2 = fVar.tvRepaymentDate) != null) {
            textView2.setVisibility(i7);
        }
        if (fVar != null && (textView = fVar.tvSubtitle) != null) {
            textView.setVisibility(i7);
        }
        if (fVar == null || (linearLayout = fVar.repayBtnContainer) == null) {
            return;
        }
        linearLayout.setVisibility(i7);
    }

    private final void setWaiverRepayControlsVisible(boolean visible) {
        LinearLayout linearLayout;
        f fVar = this.f30884a;
        if (fVar == null || (linearLayout = fVar.repayBtnContainer2) == null) {
            return;
        }
        linearLayout.setVisibility(visible ? 0 : 8);
    }

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
    public final void e(OutstandingContentInfo outstandingContentInfo, TextView textView) {
        View view;
        Float f10;
        String str;
        View view2;
        OutstandingThemeInfo outstandingThemeInfoB = b(outstandingContentInfo.style);
        if (outstandingThemeInfoB != null) {
            f fVar = this.f30884a;
            if (fVar != null && (view = fVar.topLine) != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    TopLine topLine = outstandingThemeInfoB.topLine;
                    if (topLine != null && (f10 = topLine.height) != null) {
                        layoutParams2.height = SizeUtils.dp2px(f10.floatValue());
                        TopLine topLine2 = outstandingThemeInfoB.topLine;
                        if (topLine2 != null && (str = topLine2.color) != null && (view2 = fVar.topLine) != null) {
                            List listC = C1849p.c(str);
                            CornerRadius cornerRadius = new CornerRadius();
                            cornerRadius.setTopLeft(Integer.MAX_VALUE);
                            cornerRadius.setTopRight(Integer.MAX_VALUE);
                            cornerRadius.setBottomLeft(Integer.MAX_VALUE);
                            cornerRadius.setBottomRight(Integer.MAX_VALUE);
                            Unit unit = Unit.f38893a;
                            view2.setBackground(Eb.a.i(listC, cornerRadius, 0, -1));
                        }
                    }
                } else {
                    layoutParams2 = null;
                }
                view.setLayoutParams(layoutParams2);
            }
            Card card = outstandingThemeInfoB.card;
            if (TextUtils.isEmpty(card != null ? card.bgImage : null)) {
                Card card2 = outstandingThemeInfoB.card;
                if (card2 != null) {
                    card2.applyBackground(fVar != null ? fVar.rootOutstandingView : null);
                }
            } else {
                ConstraintLayout constraintLayout = fVar != null ? fVar.rootOutstandingView : null;
                Card card3 = outstandingThemeInfoB.card;
                r0.n1(constraintLayout, card3 != null ? card3.bgImage : null);
            }
            Button button = outstandingThemeInfoB.button;
            if (button != null) {
                button.applyTheme(textView);
            }
        }
    }

    public final void f(OutstandingContentInfo outstandingContentInfo, boolean z3) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        TextView textView;
        RecyclerView recyclerView3;
        DashLine dashLine;
        List<OutstandingAccount> list = outstandingContentInfo.outstandingAccounts;
        boolean z8 = (list != null ? list.size() : 0) > 1;
        f fVar = this.f30884a;
        if (fVar != null && (dashLine = fVar.divideLine) != null) {
            h.s(dashLine, z8);
        }
        if (fVar != null && (recyclerView3 = fVar.rvOutstandingDetail) != null) {
            h.s(recyclerView3, z8);
        }
        if (z8) {
            d.h("TotalOutstandingView", 3, "handle outstanding detail >>>");
            List<OutstandingAccount> listU = null;
            if (z3 && fVar != null && (textView = fVar.tvSubtitle) != null) {
                textView.setText((CharSequence) null);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            p pVar = new p(context);
            Integer num = outstandingContentInfo.outstandingMaxCount;
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                List<OutstandingAccount> list2 = outstandingContentInfo.outstandingAccounts;
                if (list2 != null) {
                    listU = CollectionsKt.U(list2, iIntValue);
                }
            } else {
                listU = outstandingContentInfo.outstandingAccounts;
            }
            pVar.f4985b = listU;
            if (fVar != null && (recyclerView2 = fVar.rvOutstandingDetail) != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            }
            if (fVar != null && (recyclerView = fVar.rvOutstandingDetail) != null) {
                recyclerView.setAdapter(pVar);
            }
            pVar.f4986c = new Dg.a(this, 14);
        }
    }

    public final void h(OutstandingContentInfo outstandingContentInfo) {
        List<OutstandingAccount> list = outstandingContentInfo.outstandingAccounts;
        List<OutstandingAccount> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            n0.g().k((ClickEvent) G.f("loan_product_overview_click", "loanProduct", "multiple"));
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanRepayMix");
            return;
        }
        OutstandingAccount outstandingAccount = list.get(0);
        Integer num = outstandingAccount.accountType;
        Long l5 = outstandingAccount.billOutstandingAmount;
        boolean z3 = (l5 != null ? l5.longValue() : -1L) > 0;
        n0.g().k(new ClickEvent("loan_product_overview_click").add("loanProduct", outstandingAccount.loanProduct));
        if (num != null && num.intValue() == 6 && z3) {
            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, outstandingAccount.cardNo).navigation(getContext());
            return;
        }
        Integer[] elements = {7, 9, 14};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!CollectionsKt.A(C1847n.A(elements), num) || !z3) {
            if (num != null && num.intValue() == 13 && z3) {
                g(outstandingAccount);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("billId", String.valueOf(outstandingAccount.billId));
        bundle.putString("accountType", String.valueOf(outstandingAccount.accountType));
        bundle.putString("cardNo", String.valueOf(outstandingAccount.cardNo));
        bundle.putString("loanProduct", String.valueOf(outstandingAccount.loanProduct));
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOutstandingBill");
    }

    public final void i(long j6) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        LinearLayout linearLayout;
        TextView textView5;
        boolean zV = Eb.a.v(j6);
        f fVar = this.f30884a;
        if (fVar != null && (textView5 = fVar.tvCountdownDayHour) != null) {
            textView5.setVisibility(zV ? 8 : 0);
        }
        if (fVar != null && (linearLayout = fVar.llCountdownHms) != null) {
            linearLayout.setVisibility(zV ? 0 : 8);
        }
        if (!zV) {
            if (fVar == null || (textView = fVar.tvCountdownDayHour) == null) {
                return;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strK = Eb.a.k(context, j6);
            textView.setText(strK != null ? strK : "");
            return;
        }
        o oVarW = Eb.a.w(j6, System.currentTimeMillis());
        if (fVar != null && (textView4 = fVar.tvCountdownHour) != null) {
            String str = oVarW != null ? oVarW.f2294a : null;
            if (str == null) {
                str = "";
            }
            textView4.setText(str);
        }
        if (fVar != null && (textView3 = fVar.tvCountdownMinute) != null) {
            String str2 = oVarW != null ? oVarW.f2295b : null;
            if (str2 == null) {
                str2 = "";
            }
            textView3.setText(str2);
        }
        if (fVar == null || (textView2 = fVar.tvCountdownSecond) == null) {
            return;
        }
        String str3 = oVarW != null ? oVarW.f2296c : null;
        textView2.setText(str3 != null ? str3 : "");
    }

    public final void j() {
        n nVar = this.f30885b;
        if (nVar != null) {
            nVar.b();
        }
        this.f30885b = null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    public final void k(OutstandingContentInfo outstandingContentInfo) {
        ImageView imageView;
        TextView textView;
        String str;
        TextView textView2;
        TextView textView3;
        TitleFont titleFont;
        String str2;
        String str3;
        TextView textView4;
        TitleFont titleFont2;
        Float f10;
        TextView textView5;
        TitleFont titleFont3;
        String str4;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        ImageView imageView2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ImageView imageView3;
        TextView textView13;
        ImageView imageView4;
        TextView textView14;
        ImageView imageView5;
        TextView textView15;
        TextView textView16;
        TextView textView17;
        LinearLayout linearLayout4;
        Long validUntil;
        String string;
        ImageView imageView6;
        TextView textView18;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        TextView textView19;
        TextView textView20;
        TextView textView21;
        TextView textView22;
        TextView textView23;
        TextView textView24;
        LinearLayout linearLayout8;
        this.f30886c = outstandingContentInfo;
        int i7 = 0;
        setVisibility(outstandingContentInfo != null ? 0 : 8);
        if (outstandingContentInfo == null) {
            j();
            return;
        }
        WaiverInfo waiverInfo = outstandingContentInfo.waiverInfo;
        f fVar = this.f30884a;
        if (waiverInfo != null && Intrinsics.c(waiverInfo.getWaiverEnable(), Boolean.TRUE) && (validUntil = waiverInfo.getValidUntil()) != null && validUntil.longValue() > System.currentTimeMillis()) {
            List<OutstandingAccount> list = outstandingContentInfo.outstandingAccounts;
            List<OutstandingAccount> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                List<OutstandingAccount> list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Integer num = ((OutstandingAccount) it.next()).accountType;
                            if ((num != null && num.intValue() == 6) || ((num != null && num.intValue() == 7) || (num != null && num.intValue() == 9))) {
                            }
                        }
                    }
                }
            }
            if (fVar != null && (linearLayout8 = fVar.layoutWaiver) != null) {
                linearLayout8.setVisibility(0);
            }
            setLegacyControlsVisible(false);
            setWaiverRepayControlsVisible(true);
            e(outstandingContentInfo, fVar != null ? fVar.repayBtn2 : null);
            if (fVar != null && (textView24 = fVar.tvWaiverBadge) != null) {
                String badgeText = waiverInfo.getBadgeText();
                r apply = new r(textView24, waiverInfo, 1);
                C0295s hide = new C0295s(textView24, 3);
                Intrinsics.checkNotNullParameter(apply, "apply");
                Intrinsics.checkNotNullParameter(hide, "hide");
                if (TextUtils.isEmpty(badgeText)) {
                    hide.invoke();
                } else {
                    Intrinsics.e(badgeText);
                    apply.invoke(badgeText);
                }
            }
            if (fVar != null && (textView23 = fVar.tvWaiverAmountLabel) != null) {
                String amountLabel = waiverInfo.getAmountLabel();
                C0296t apply2 = new C0296t(textView23, 2);
                C0295s hide2 = new C0295s(textView23, 4);
                Intrinsics.checkNotNullParameter(apply2, "apply");
                Intrinsics.checkNotNullParameter(hide2, "hide");
                if (TextUtils.isEmpty(amountLabel)) {
                    hide2.invoke();
                } else {
                    Intrinsics.e(amountLabel);
                    apply2.invoke(amountLabel);
                }
            }
            if (fVar != null && (textView22 = fVar.tvWaiverCurrentAmount) != null) {
                Long currentOutstandingAmount = waiverInfo.getCurrentOutstandingAmount();
                textView22.setText(r0.B(currentOutstandingAmount != null ? currentOutstandingAmount.longValue() : 0L, true));
            }
            if (fVar != null && (textView21 = fVar.tvWaiverSummary) != null) {
                String summaryText = waiverInfo.getSummaryText();
                C0296t apply3 = new C0296t(textView21, 3);
                C0295s hide3 = new C0295s(textView21, 5);
                Intrinsics.checkNotNullParameter(apply3, "apply");
                Intrinsics.checkNotNullParameter(hide3, "hide");
                if (TextUtils.isEmpty(summaryText)) {
                    hide3.invoke();
                } else {
                    Intrinsics.e(summaryText);
                    apply3.invoke(summaryText);
                }
            }
            String ctaText = waiverInfo.getCtaText();
            if (ctaText == null) {
                string = getContext().getString(g.cs_cl_waiver_settle_now);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = !StringsKt.F(ctaText) ? ctaText : null;
                if (string == null) {
                    string = getContext().getString(g.cs_cl_waiver_settle_now);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
            }
            if (fVar != null && (textView20 = fVar.repayBtn2) != null) {
                textView20.setText(string);
            }
            Integer num2 = outstandingContentInfo.enable;
            boolean z3 = num2 != null && num2.intValue() == 1;
            if (fVar != null && (textView19 = fVar.repayBtn2) != null) {
                textView19.setEnabled(z3);
            }
            if (fVar != null && (linearLayout7 = fVar.repayBtnContainer2) != null) {
                linearLayout7.setEnabled(z3);
            }
            if (fVar != null && (linearLayout6 = fVar.repayBtnContainer2) != null) {
                h.s(linearLayout6, !TextUtils.isEmpty(string));
            }
            if (fVar != null && (linearLayout5 = fVar.repayBtnContainer2) != null) {
                h.l(new S(this, outstandingContentInfo, 2), linearLayout5);
            }
            if (fVar != null && (textView18 = fVar.tvWaiverCurrentAmount) != null) {
                h.l(new S(outstandingContentInfo, this, 3), textView18);
            }
            if (fVar != null && (imageView6 = fVar.ivWaiverAmountIcon) != null) {
                h.l(new S(outstandingContentInfo, this, 4), imageView6);
            }
            Long validUntil2 = waiverInfo.getValidUntil();
            if (validUntil2 != null) {
                i(validUntil2.longValue());
                long jLongValue = validUntil2.longValue();
                j();
                n nVar = new n(jLongValue, new u(this, jLongValue, 1), new j(this, 17));
                nVar.a();
                this.f30885b = nVar;
            } else {
                j();
            }
            f(outstandingContentInfo, false);
            return;
        }
        j();
        if (fVar != null && (linearLayout4 = fVar.layoutWaiver) != null) {
            linearLayout4.setVisibility(8);
        }
        setWaiverRepayControlsVisible(false);
        setLegacyControlsVisible(true);
        m mVar = new m();
        mVar.e(fVar != null ? fVar.rootOutstandingView : null);
        if (TextUtils.equals("delay", outstandingContentInfo.style)) {
            mVar.h(e.tvSubtitle, 1, e.tvRepaymentDate, 1, 0);
            mVar.h(e.tvSubtitle, 3, e.tvRepaymentDate, 4, 0);
        } else {
            mVar.h(e.tvSubtitle, 1, e.tvRepaymentDate, 2, SizeUtils.dp2px(8.0f));
            mVar.h(e.tvSubtitle, 3, e.tvRepaymentDate, 3, 0);
        }
        mVar.b(fVar != null ? fVar.rootOutstandingView : null);
        if (fVar != null && (textView17 = fVar.tvTitle) != null) {
            textView17.setText(outstandingContentInfo.title);
        }
        if (fVar != null && (textView16 = fVar.tvCouponAmount) != null) {
            textView16.setText(outstandingContentInfo.coupon);
        }
        if (fVar != null && (textView15 = fVar.tvCouponAmount) != null) {
            h.s(textView15, !TextUtils.isEmpty(outstandingContentInfo.coupon));
        }
        if (fVar != null && (imageView5 = fVar.ivTitleIcon) != null) {
            h.s(imageView5, TextUtils.equals(outstandingContentInfo.style, "currentSettled"));
        }
        if (fVar != null && (textView14 = fVar.tvOutstandingAmount) != null) {
            h.s(textView14, outstandingContentInfo.amount != null);
        }
        if (fVar != null && (imageView4 = fVar.ivAmountIcon) != null) {
            h.s(imageView4, outstandingContentInfo.amount != null);
        }
        if (fVar != null && (textView13 = fVar.tvOutstandingAmount) != null) {
            Long l5 = outstandingContentInfo.amount;
            textView13.setText(r0.B(l5 != null ? l5.longValue() : 0L, true));
        }
        if (d()) {
            r0.l1(outstandingContentInfo.iconDark, fVar != null ? fVar.tvRepaymentIcon : null);
            if (fVar != null && (imageView3 = fVar.tvRepaymentIcon) != null) {
                h.s(imageView3, !TextUtils.isEmpty(outstandingContentInfo.iconDark));
            }
        } else {
            r0.l1(outstandingContentInfo.icon, fVar != null ? fVar.tvRepaymentIcon : null);
            if (fVar != null && (imageView = fVar.tvRepaymentIcon) != null) {
                h.s(imageView, !TextUtils.isEmpty(outstandingContentInfo.icon));
            }
        }
        if (fVar != null && (textView12 = fVar.tvRepaymentDate) != null) {
            textView12.setText(outstandingContentInfo.subTitle);
        }
        if (TextUtils.isEmpty(outstandingContentInfo.subTitle2)) {
            if (fVar != null && (textView = fVar.tvSubtitle) != null) {
                h.s(textView, false);
            }
        } else if (fVar != null) {
            try {
                TextView textView25 = fVar.tvSubtitle;
                if (textView25 != null) {
                    h.f(textView25, outstandingContentInfo.subTitle2);
                }
                if (fVar != null && (textView11 = fVar.tvSubtitle) != null) {
                    h.s(textView11, true);
                    Unit unit = Unit.f38893a;
                }
            } catch (Exception unused) {
                Unit unit2 = Unit.f38893a;
            }
        } else if (fVar != null) {
            h.s(textView11, true);
            Unit unit3 = Unit.f38893a;
        }
        f(outstandingContentInfo, true);
        if (fVar != null && (textView10 = fVar.repayBtn) != null) {
            textView10.setText(outstandingContentInfo.button);
        }
        if (fVar != null && (textView9 = fVar.repayBtn) != null) {
            Integer num3 = outstandingContentInfo.enable;
            textView9.setEnabled(num3 != null && num3.intValue() == 1);
        }
        if (fVar != null && (linearLayout3 = fVar.repayBtnContainer) != null) {
            Integer num4 = outstandingContentInfo.enable;
            linearLayout3.setEnabled(num4 != null && num4.intValue() == 1);
        }
        if (fVar != null && (linearLayout2 = fVar.repayBtnContainer) != null) {
            h.s(linearLayout2, !TextUtils.isEmpty(outstandingContentInfo.button));
        }
        List<OutstandingAccount> list4 = outstandingContentInfo.outstandingAccounts;
        if (fVar != null && (linearLayout = fVar.repayBtnContainer) != null) {
            h.l(new T(i7, this, list4), linearLayout);
        }
        if (fVar != null && (imageView2 = fVar.ivAmountIcon) != null) {
            h.l(new S(this, outstandingContentInfo, 0), imageView2);
        }
        if (fVar != null && (textView8 = fVar.tvOutstandingAmount) != null) {
            h.l(new S(this, outstandingContentInfo, 1), textView8);
        }
        if (fVar != null && (textView7 = fVar.tvSubtitle) != null) {
            h.l(new ViewOnClickListenerC0159a(outstandingContentInfo, 21), textView7);
        }
        e(outstandingContentInfo, fVar != null ? fVar.repayBtn : null);
        OutstandingThemeInfo outstandingThemeInfoB = b(outstandingContentInfo.style);
        if (outstandingThemeInfoB != null) {
            TextView textView26 = fVar != null ? fVar.tvCouponAmount : null;
            Tag tag = outstandingThemeInfoB.tag;
            r0.n1(textView26, tag != null ? tag.bgImage : null);
            ImageView imageView7 = fVar != null ? fVar.ivTitleIcon : null;
            Tag tag2 = outstandingThemeInfoB.tag;
            r0.n1(imageView7, tag2 != null ? tag2.bgImage : null);
            Text text = outstandingThemeInfoB.text;
            if (text != null && (str4 = text.titleColor) != null && fVar != null && (textView6 = fVar.tvTitle) != null) {
                textView6.setTextColor(Color.parseColor(str4));
            }
            Text text2 = outstandingThemeInfoB.text;
            if (text2 != null && (titleFont3 = text2.titleFont) != null) {
                titleFont3.applyTheme(fVar != null ? fVar.tvTitle : null);
            }
            Text text3 = outstandingThemeInfoB.text;
            if (text3 != null && (titleFont2 = text3.amountFont) != null && (f10 = titleFont2.fontSize) != null) {
                float fFloatValue = f10.floatValue();
                if (fVar != null && (textView5 = fVar.tvOutstandingAmount) != null) {
                    textView5.setTextSize(1, fFloatValue);
                }
            }
            Text text4 = outstandingThemeInfoB.text;
            if (text4 != null && (str3 = text4.amountColor) != null && fVar != null && (textView4 = fVar.tvOutstandingAmount) != null) {
                textView4.setTextColor(Color.parseColor(str3));
            }
            Text text5 = outstandingThemeInfoB.text;
            if (text5 != null && (str2 = text5.amountIconUrl) != null) {
                r0.l1(str2, fVar != null ? fVar.ivAmountIcon : null);
            }
            Text text6 = outstandingThemeInfoB.text;
            if (text6 != null && (titleFont = text6.subTitleFont) != null) {
                titleFont.applyTheme(fVar != null ? fVar.tvRepaymentDate : null);
            }
            Text text7 = outstandingThemeInfoB.text;
            if (text7 == null || (str = text7.subTitleColor) == null) {
                return;
            }
            List<OutstandingAccount> list5 = outstandingContentInfo.outstandingAccounts;
            if ((list5 != null ? list5.size() : 0) > 1) {
                if (fVar == null || (textView3 = fVar.tvRepaymentDate) == null) {
                    return;
                }
                textView3.setTextColor(getContext().getColor(b.ppColorTextNormal));
                return;
            }
            if (fVar == null || (textView2 = fVar.tvRepaymentDate) == null) {
                return;
            }
            textView2.setTextColor(Color.parseColor(str));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j();
        super.onDetachedFromWindow();
    }
}
