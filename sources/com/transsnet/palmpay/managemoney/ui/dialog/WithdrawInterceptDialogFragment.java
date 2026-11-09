package com.transsnet.palmpay.managemoney.ui.dialog;

import C9.C0139f;
import Ce.S;
import Fd.G;
import Jc.c;
import Jc.d;
import M3.f;
import Oc.j;
import Qc.J;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawInterceptDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.l;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/WithdrawInterceptDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawInterceptDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawInterceptDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/WithdrawInterceptDialogFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,161:1\n115#2,8:162\n145#2:170\n115#2,8:171\n145#2:179\n115#2,8:180\n145#2:188\n*S KotlinDebug\n*F\n+ 1 WithdrawInterceptDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/WithdrawInterceptDialogFragment\n*L\n95#1:162,8\n95#1:170\n113#1:171,8\n113#1:179\n126#1:180,8\n126#1:188\n*E\n"})
public final class WithdrawInterceptDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f32335L = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WithdrawInterceptDialogFragment newInstance$default(a aVar, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "";
            }
            return aVar.newInstance(str);
        }

        @NotNull
        public final WithdrawInterceptDialogFragment newInstance(@NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            WithdrawInterceptDialogFragment withdrawInterceptDialogFragment = new WithdrawInterceptDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("source", source);
            withdrawInterceptDialogFragment.setArguments(bundle);
            return withdrawInterceptDialogFragment;
        }

        private a() {
        }
    }

    public WithdrawInterceptDialogFragment() {
        C2131j.b(new f(this, 11));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_withdraw_intercept_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(c.ivClose);
        View viewFindViewById2 = viewF.findViewById(c.layoutRoot);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = viewF.findViewById(c.tvAggainNot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = viewF.findViewById(c.rtvAgree);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        PpButton ppButton = (PpButton) viewFindViewById4;
        View viewFindViewById5 = viewF.findViewById(c.rtvSetMethod);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        PpButton ppButton2 = (PpButton) viewFindViewById5;
        final int i7 = 0;
        ppButton.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawInterceptDialogFragment f6751b;

            {
                this.f6751b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawInterceptDialogFragment withdrawInterceptDialogFragment = this.f6751b;
                switch (i7) {
                    case 0:
                        WithdrawInterceptDialogFragment.a aVar = WithdrawInterceptDialogFragment.f32335L;
                        withdrawInterceptDialogFragment.dismiss();
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                        break;
                    case 1:
                        WithdrawInterceptDialogFragment.a aVar2 = WithdrawInterceptDialogFragment.f32335L;
                        p059e1.a.X("SHOW_INTERCEPT_DIALOG", false);
                        withdrawInterceptDialogFragment.dismiss();
                        break;
                    default:
                        WithdrawInterceptDialogFragment.a aVar3 = WithdrawInterceptDialogFragment.f32335L;
                        withdrawInterceptDialogFragment.dismiss();
                        break;
                }
            }
        });
        ppButton2.setOnClickListener(new j(2, ppButton2, this));
        final int i10 = 1;
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener(this) { // from class: Oc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawInterceptDialogFragment f6751b;

            {
                this.f6751b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawInterceptDialogFragment withdrawInterceptDialogFragment = this.f6751b;
                switch (i10) {
                    case 0:
                        WithdrawInterceptDialogFragment.a aVar = WithdrawInterceptDialogFragment.f32335L;
                        withdrawInterceptDialogFragment.dismiss();
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                        break;
                    case 1:
                        WithdrawInterceptDialogFragment.a aVar2 = WithdrawInterceptDialogFragment.f32335L;
                        p059e1.a.X("SHOW_INTERCEPT_DIALOG", false);
                        withdrawInterceptDialogFragment.dismiss();
                        break;
                    default:
                        WithdrawInterceptDialogFragment.a aVar3 = WithdrawInterceptDialogFragment.f32335L;
                        withdrawInterceptDialogFragment.dismiss();
                        break;
                }
            }
        });
        if (viewFindViewById != null) {
            final int i11 = 2;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WithdrawInterceptDialogFragment f6751b;

                {
                    this.f6751b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WithdrawInterceptDialogFragment withdrawInterceptDialogFragment = this.f6751b;
                    switch (i11) {
                        case 0:
                            WithdrawInterceptDialogFragment.a aVar = WithdrawInterceptDialogFragment.f32335L;
                            withdrawInterceptDialogFragment.dismiss();
                            ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            break;
                        case 1:
                            WithdrawInterceptDialogFragment.a aVar2 = WithdrawInterceptDialogFragment.f32335L;
                            p059e1.a.X("SHOW_INTERCEPT_DIALOG", false);
                            withdrawInterceptDialogFragment.dismiss();
                            break;
                        default:
                            WithdrawInterceptDialogFragment.a aVar3 = WithdrawInterceptDialogFragment.f32335L;
                            withdrawInterceptDialogFragment.dismiss();
                            break;
                    }
                }
            });
        }
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) j()).f32748k0;
        if (lVar != null) {
            lVar.e(this, new G(new S(this, 5, constraintLayout, ppButton), 12));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CashBoxViewModel) j()).f32760w0;
        if (lVar2 != null) {
            lVar2.e(this, new G(new C0139f(ppButton2, 21), 12));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((CashBoxViewModel) j()).f32758v0;
        if (lVar3 != null) {
            lVar3.e(this, new G(new S(ppButton2, 6, this, ppButton2), 12));
        }
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) j();
        if (cashBoxViewModel != null) {
            p140j8.f.s(cashBoxViewModel, new J(1, null), cashBoxViewModel.f32760w0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        return baseDialog;
    }
}
