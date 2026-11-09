package com.transsnet.palmpay.managemoney.ui.fragment;

import Pa.AbstractC0511h;
import Qc.C0580v;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxBeforeOrderConfigResp;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/CashBoxDepositFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxDepositFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxDepositFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxDepositFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,598:1\n171#2,12:599\n215#2:611\n115#2,8:612\n145#2:620\n115#2,8:621\n145#2:629\n115#2,8:630\n145#2:638\n260#2,10:639\n296#2:649\n115#2,8:650\n145#2:658\n171#2,12:659\n215#2:671\n171#2,12:672\n215#2:684\n171#2,12:685\n215#2:697\n115#2,8:698\n145#2:706\n*S KotlinDebug\n*F\n+ 1 CashBoxDepositFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxDepositFragment\n*L\n121#1:599,12\n121#1:611\n135#1:612,8\n135#1:620\n140#1:621,8\n140#1:629\n143#1:630,8\n143#1:638\n146#1:639,10\n146#1:649\n182#1:650,8\n182#1:658\n189#1:659,12\n189#1:671\n198#1:672,12\n198#1:684\n221#1:685,12\n221#1:697\n232#1:698,8\n232#1:706\n*E\n"})
public final class CashBoxDepositFragment extends BaseMvvmFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f32357p0 = new a(null);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public GetCashBoxBeforeOrderConfigResp.CashBoxBeforeOrderConfig f32365X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public GetAutoTransferConfigResp f32366Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f32367Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32368j = C2131j.b(new C1582d(this, 0));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32370o = C2131j.b(new C1582d(this, 11));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32371p = C2131j.b(new C1582d(this, 12));
    public final p355xf.t t = C2131j.b(new C1582d(this, 13));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32372v = C2131j.b(new C1582d(this, 14));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32373w = C2131j.b(new C1582d(this, 15));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32358A = C2131j.b(new C1582d(this, 16));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32359B = C2131j.b(new C1582d(this, 1));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32360C = C2131j.b(new C1582d(this, 2));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32361H = C2131j.b(new C1582d(this, 3));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32362L = C2131j.b(new C1582d(this, 4));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f32363M = C2131j.b(new C1582d(this, 9));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p355xf.t f32364Q = C2131j.b(new C1582d(this, 10));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f32369k0 = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CashBoxDepositFragment newInstance$default(a aVar, boolean z3, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z3 = false;
            }
            if ((i7 & 2) != 0) {
                str = "";
            }
            return aVar.newInstance(z3, str);
        }

        @NotNull
        public final CashBoxDepositFragment newInstance(boolean z3, @NotNull String backAmount) {
            Intrinsics.checkNotNullParameter(backAmount, "backAmount");
            CashBoxDepositFragment cashBoxDepositFragment = new CashBoxDepositFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_activity", z3);
            bundle.putString("total_back_amount", backAmount);
            cashBoxDepositFragment.setArguments(bundle);
            return cashBoxDepositFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_cash_box_deposit_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        CheckBox checkBox;
        RoundedTextView roundedTextView;
        String string;
        Pa.n0.g().v("CashBox_Save_View");
        if (getActivity() instanceof CashBoxMainActivity) {
            androidx.fragment.app.E activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity");
            ((CashBoxMainActivity) activity).f32041c = false;
        }
        p355xf.t tVar = this.f32364Q;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.c(S6.a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
        }
        Bundle arguments = getArguments();
        this.f32367Z = arguments != null ? arguments.getBoolean("from_activity") : false;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string = arguments2.getString("total_back_amount", "")) != null) {
            str = string;
        }
        this.f32369k0 = str;
        AmountEditText amountEditTextT = t();
        if (amountEditTextT != null) {
            amountEditTextT.setText(this.f32369k0);
        }
        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV = v();
        if (cashBoxEstimatedInterestViewV != null) {
            cashBoxEstimatedInterestViewV.setInterestBackAmount(this.f32369k0);
        }
        AmountEditText amountEditTextT2 = t();
        boolean zIsEmpty = TextUtils.isEmpty(amountEditTextT2 != null ? amountEditTextT2.getText() : null);
        p355xf.t tVar2 = this.f32370o;
        p355xf.t tVar3 = this.t;
        if (!zIsEmpty && (checkBox = (CheckBox) tVar3.getValue()) != null && (roundedTextView = (RoundedTextView) tVar2.getValue()) != null) {
            roundedTextView.setEnabled(checkBox.isChecked());
        }
        x();
        PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar2 != null) {
            final int i7 = 0;
            ppTitleBar2.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxDepositFragment f32604b;

                {
                    this.f32604b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
                
                    if (r3.getLong() < r2.getBuyMinLimit()) goto L12;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r14) {
                    /*
                        Method dump skipped, instruction units count: 420
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.managemoney.ui.fragment.ViewOnClickListenerC1583e.onClick(android.view.View):void");
                }
            });
        }
        PpTitleBar ppTitleBar3 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar3 != null) {
            final int i10 = 1;
            ppTitleBar3.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxDepositFragment f32604b;

                {
                    this.f32604b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
                
                    if (r3.getLong() < r2.getBuyMinLimit()) goto L12;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r14) {
                    /*
                        Method dump skipped, instruction units count: 420
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.managemoney.ui.fragment.ViewOnClickListenerC1583e.onClick(android.view.View):void");
                }
            });
        }
        AmountEditText amountEditTextT3 = t();
        if (amountEditTextT3 != null) {
            amountEditTextT3.addTextChangedListener(new com.transsnet.palmpay.managemoney.ui.activity.P(this, 1));
        }
        CheckBox checkBox2 = (CheckBox) tVar3.getValue();
        if (checkBox2 != null) {
            checkBox2.setOnCheckedChangeListener(new A8.g(this, 9));
        }
        SwitchCompat switchCompat = (SwitchCompat) this.f32373w.getValue();
        if (switchCompat != null) {
            final int i11 = 2;
            switchCompat.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxDepositFragment f32604b;

                {
                    this.f32604b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
                
                    if (r3.getLong() < r2.getBuyMinLimit()) goto L12;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r14) {
                    /*
                        Method dump skipped, instruction units count: 420
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.managemoney.ui.fragment.ViewOnClickListenerC1583e.onClick(android.view.View):void");
                }
            });
        }
        SwitchCompat switchCompatU = u();
        if (switchCompatU != null) {
            final int i12 = 3;
            switchCompatU.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxDepositFragment f32604b;

                {
                    this.f32604b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
                
                    if (r3.getLong() < r2.getBuyMinLimit()) goto L12;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r14) {
                    /*
                        Method dump skipped, instruction units count: 420
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.managemoney.ui.fragment.ViewOnClickListenerC1583e.onClick(android.view.View):void");
                }
            });
        }
        RoundedTextView roundedTextView2 = (RoundedTextView) tVar2.getValue();
        if (roundedTextView2 != null) {
            final int i13 = 4;
            roundedTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxDepositFragment f32604b;

                {
                    this.f32604b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
                
                    if (r3.getLong() < r2.getBuyMinLimit()) goto L12;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r14) {
                    /*
                        Method dump skipped, instruction units count: 420
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.managemoney.ui.fragment.ViewOnClickListenerC1583e.onClick(android.view.View):void");
                }
            });
        }
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = cashBoxViewModel != null ? cashBoxViewModel.t : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new C1585g(this, this, 0), 17));
        }
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = cashBoxViewModel2 != null ? cashBoxViewModel2.f32740X : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new C1584f(this, 0), 17));
        }
        CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = cashBoxViewModel3 != null ? cashBoxViewModel3.f32757v : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1584f(this, 1), 17));
        }
        CashBoxViewModel cashBoxViewModel4 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = cashBoxViewModel4 != null ? cashBoxViewModel4.f32759w : null;
        if (lVar4 != null) {
            lVar4.e(this, new Wd.I(new C1584f(this, 2), 17));
        }
        CashBoxViewModel cashBoxViewModel5 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar5 = cashBoxViewModel5 != null ? cashBoxViewModel5.f32737L : null;
        if (lVar5 != null) {
            lVar5.e(this, new Wd.I(new C1585g(this, this, 4), 17));
        }
        CashBoxViewModel cashBoxViewModel6 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar6 = cashBoxViewModel6 != null ? cashBoxViewModel6.f32741Y : null;
        if (lVar6 != null) {
            lVar6.e(this, new Wd.I(new C1584f(this, 3), 17));
        }
        CashBoxViewModel cashBoxViewModel7 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar7 = cashBoxViewModel7 != null ? cashBoxViewModel7.f32748k0 : null;
        if (lVar7 != null) {
            lVar7.e(this, new Wd.I(new C1585g(this, this, 1), 17));
        }
        CashBoxViewModel cashBoxViewModel8 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar8 = cashBoxViewModel8 != null ? cashBoxViewModel8.f32747j : null;
        if (lVar8 != null) {
            lVar8.e(this, new Wd.I(new C1585g(this, this, 2), 17));
        }
        CashBoxViewModel cashBoxViewModel9 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar9 = cashBoxViewModel9 != null ? cashBoxViewModel9.f32749o : null;
        if (lVar9 != null) {
            lVar9.e(this, new Wd.I(new C1585g(this, this, 3), 17));
        }
        CashBoxViewModel cashBoxViewModel10 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar10 = cashBoxViewModel10 != null ? cashBoxViewModel10.f32755t0 : null;
        if (lVar10 != null) {
            lVar10.e(this, new Wd.I(new C1584f(this, 4), 17));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        CashBoxViewModel cashBoxViewModel;
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel2 != null) {
            cashBoxViewModel2.g();
        }
        CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel3 != null) {
            p140j8.f.s(cashBoxViewModel3, new Qc.r(1, null), cashBoxViewModel3.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        AmountEditText amountEditTextT = t();
        if (amountEditTextT != null && (cashBoxViewModel = (CashBoxViewModel) this.f27333i) != null) {
            cashBoxViewModel.e(amountEditTextT.getLong());
        }
        CashBoxViewModel cashBoxViewModel4 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel4 != null) {
            p140j8.f.s(cashBoxViewModel4, new Qc.D(1, null), cashBoxViewModel4.f32759w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        CashBoxViewModel cashBoxViewModel5 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel5 != null) {
            cashBoxViewModel5.f();
        }
        CashBoxViewModel cashBoxViewModel6 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel6 != null) {
            p140j8.f.s(cashBoxViewModel6, new C0580v(1, null), cashBoxViewModel6.f32755t0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        CashBoxViewModel cashBoxViewModel7 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel7 != null) {
            p140j8.f.s(cashBoxViewModel7, new Qc.A(1, null), cashBoxViewModel7.f32749o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void onBackPressed() {
        androidx.fragment.app.Z supportFragmentManager;
        if (getActivity() instanceof CashBoxMainActivity) {
            androidx.fragment.app.E activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.S();
            return;
        }
        if (this.f32367Z) {
            N8.q0.u("/manage_money/cash_box_main_activity");
        }
        androidx.fragment.app.E activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final AmountEditText t() {
        return (AmountEditText) this.f32362L.getValue();
    }

    public final SwitchCompat u() {
        return (SwitchCompat) this.f32358A.getValue();
    }

    public final CashBoxEstimatedInterestView v() {
        return (CashBoxEstimatedInterestView) this.f32361H.getValue();
    }

    public final void w(String title, String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog = CommonTipsDialogFragment.f31249X.createDialog(title, getResources().getString(Jc.f.mm_3_common_desc, content), getResources().getString(Jc.f.mm_check_details), new com.transsnet.palmpay.core.ui.activity.T(21));
        androidx.fragment.app.Z childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        commonTipsDialogFragmentCreateDialog.show(childFragmentManager, "showFrozenErrorDialog");
    }

    public final void x() {
        long j6;
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, requireContext());
        p355xf.t tVar = this.f32371p;
        TextView textView = (TextView) tVar.getValue();
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i7 = Jc.f.mm_cash_box_protocol;
        if (t() != null) {
            AmountEditText amountEditTextT = t();
            Intrinsics.e(amountEditTextT);
            j6 = amountEditTextT.getLong();
        } else {
            j6 = 0;
        }
        String string = getString(i7, Pa.r0.B(j6, false));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            textView2.setText(new SpanUtils().append(string).setForegroundColor(iColorInt).appendSpace(SizeUtils.dp2px(4.0f)).append("Terms and Conditions for CashBox").setClickSpan(new C1586h(this)).appendSpace(SizeUtils.dp2px(4.0f)).append("and").setForegroundColor(iColorInt).appendSpace(SizeUtils.dp2px(2.0f)).append("Privacy & Cookie Policy").setClickSpan(new C1587i(this, 0)).create());
        }
        TextView textView3 = (TextView) this.f32372v.getValue();
        if (textView3 != null) {
            AbstractC0511h.f7089a.richText(textView3, getString(Jc.f.mm_cashbox_auto_save_transfer_agreement), "Automatic Saving Service Agreement", new C1587i(this, 1));
        }
    }
}
