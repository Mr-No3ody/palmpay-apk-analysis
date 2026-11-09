package com.transsnet.palmpay.managemoney.ui.fragment;

import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxBeforeOrderConfigResp;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/CashBoxWithdrawFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxWithdrawFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxWithdrawFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxWithdrawFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n171#2,12:264\n215#2:276\n115#2,8:277\n145#2:285\n115#2,8:286\n145#2:294\n260#2,10:295\n296#2:305\n1#3:306\n*S KotlinDebug\n*F\n+ 1 CashBoxWithdrawFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxWithdrawFragment\n*L\n80#1:264,12\n80#1:276\n86#1:277,8\n86#1:285\n90#1:286,8\n90#1:294\n101#1:295,10\n101#1:305\n*E\n"})
public final class CashBoxWithdrawFragment extends BaseMvvmFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f32442H = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f32443A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f32444B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f32445C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32446j = C2131j.b(new D(this, 0));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32447o = C2131j.b(new D(this, 1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32448p = C2131j.b(new D(this, 2));
    public final p355xf.t t = C2131j.b(new D(this, 3));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32449v = C2131j.b(new D(this, 4));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GetCashBoxBeforeOrderConfigResp.CashBoxBeforeOrderConfig f32450w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxWithdrawFragment newInstance() {
            return new CashBoxWithdrawFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_cash_box_withdraw_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Pa.n0.g().v("CashBox_Withdraw_View");
        PpTitleBar ppTitleBar = (PpTitleBar) this.f32449v.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.c(S6.a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
        }
        AmountEditText amountEditTextT = t();
        if (amountEditTextT != null) {
            amountEditTextT.addTextChangedListener(new com.transsnet.palmpay.managemoney.ui.activity.P(this, 2));
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.f32446j.getValue();
        if (roundedTextView != null) {
            roundedTextView.setOnClickListener(new ViewOnClickListenerC1533v(this, 27));
        }
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = cashBoxViewModel != null ? cashBoxViewModel.t : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new F(this, this, 0), 21));
        }
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = cashBoxViewModel2 != null ? cashBoxViewModel2.f32757v : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new E(this, 0), 21));
        }
        CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = cashBoxViewModel3 != null ? cashBoxViewModel3.f32759w : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new E(this, 1), 21));
        }
        CashBoxViewModel cashBoxViewModel4 = (CashBoxViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = cashBoxViewModel4 != null ? cashBoxViewModel4.f32738M : null;
        if (lVar4 == null) {
            return 0;
        }
        lVar4.e(this, new Wd.I(new F(this, this, 1), 21));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        CashBoxViewModel cashBoxViewModel;
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel2 != null) {
            p140j8.f.s(cashBoxViewModel2, new Qc.r(2, null), cashBoxViewModel2.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) this.f27333i;
        if (cashBoxViewModel3 != null) {
            p140j8.f.s(cashBoxViewModel3, new Qc.D(1, null), cashBoxViewModel3.f32759w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        AmountEditText amountEditTextT = t();
        if (amountEditTextT == null || (cashBoxViewModel = (CashBoxViewModel) this.f27333i) == null) {
            return;
        }
        cashBoxViewModel.e(amountEditTextT.getLong());
    }

    public final AmountEditText t() {
        return (AmountEditText) this.f32448p.getValue();
    }

    public final CashBoxEstimatedInterestView u() {
        return (CashBoxEstimatedInterestView) this.f32447o.getValue();
    }

    public final void v(String title, String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog = CommonTipsDialogFragment.f31249X.createDialog(title, getResources().getString(Jc.f.mm_3_common_desc, content), getResources().getString(Jc.f.mm_check_details), new com.transsnet.palmpay.core.ui.activity.T(26));
        androidx.fragment.app.Z childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        commonTipsDialogFragmentCreateDialog.show(childFragmentManager, "showFrozenErrorDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r4.getLong() < r0.getBuyMinLimit()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.managemoney.ui.fragment.CashBoxWithdrawFragment.w():void");
    }
}
