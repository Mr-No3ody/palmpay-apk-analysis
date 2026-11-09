package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import La.i;
import M3.f;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawSureDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/WithdrawSureDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WithdrawSureDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f32336X = new a(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Function0 f32337L = new i(27);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Function0 f32338M = new i(28);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f32339Q = C2131j.b(new f(this, 12));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WithdrawSureDialogFragment newInstance(long j6) {
            WithdrawSureDialogFragment withdrawSureDialogFragment = new WithdrawSureDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("source", j6);
            withdrawSureDialogFragment.setArguments(bundle);
            return withdrawSureDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_withdraw_sure_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31242g = 17;
        this.f31246p = true;
        View viewFindViewById = viewF.findViewById(c.ivClose);
        View viewFindViewById2 = viewF.findViewById(c.layoutRoot);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        View viewFindViewById3 = viewF.findViewById(c.rtvAgree);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        PpButton ppButton = (PpButton) viewFindViewById3;
        View viewFindViewById4 = viewF.findViewById(c.rtvCancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        PpButton ppButton2 = (PpButton) viewFindViewById4;
        View viewFindViewById5 = viewF.findViewById(c.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById5;
        int i7 = Jc.f.mm_withdraw_lost;
        Long l5 = (Long) this.f32339Q.getValue();
        textView.setText(getString(i7, r0.B(l5 != null ? l5.longValue() : 0L, true)));
        final int i10 = 0;
        ppButton.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawSureDialogFragment f6753b;

            {
                this.f6753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawSureDialogFragment withdrawSureDialogFragment = this.f6753b;
                switch (i10) {
                    case 0:
                        WithdrawSureDialogFragment.a aVar = WithdrawSureDialogFragment.f32336X;
                        withdrawSureDialogFragment.dismiss();
                        Function0 function0 = withdrawSureDialogFragment.f32337L;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    case 1:
                        WithdrawSureDialogFragment.a aVar2 = WithdrawSureDialogFragment.f32336X;
                        withdrawSureDialogFragment.dismiss();
                        Function0 function1 = withdrawSureDialogFragment.f32338M;
                        if (function1 != null) {
                            function1.invoke();
                        }
                        break;
                    default:
                        WithdrawSureDialogFragment.a aVar3 = WithdrawSureDialogFragment.f32336X;
                        withdrawSureDialogFragment.dismiss();
                        Function0 function2 = withdrawSureDialogFragment.f32338M;
                        if (function2 != null) {
                            function2.invoke();
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        ppButton2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawSureDialogFragment f6753b;

            {
                this.f6753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawSureDialogFragment withdrawSureDialogFragment = this.f6753b;
                switch (i11) {
                    case 0:
                        WithdrawSureDialogFragment.a aVar = WithdrawSureDialogFragment.f32336X;
                        withdrawSureDialogFragment.dismiss();
                        Function0 function0 = withdrawSureDialogFragment.f32337L;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    case 1:
                        WithdrawSureDialogFragment.a aVar2 = WithdrawSureDialogFragment.f32336X;
                        withdrawSureDialogFragment.dismiss();
                        Function0 function1 = withdrawSureDialogFragment.f32338M;
                        if (function1 != null) {
                            function1.invoke();
                        }
                        break;
                    default:
                        WithdrawSureDialogFragment.a aVar3 = WithdrawSureDialogFragment.f32336X;
                        withdrawSureDialogFragment.dismiss();
                        Function0 function2 = withdrawSureDialogFragment.f32338M;
                        if (function2 != null) {
                            function2.invoke();
                        }
                        break;
                }
            }
        });
        if (viewFindViewById != null) {
            final int i12 = 2;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.F

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WithdrawSureDialogFragment f6753b;

                {
                    this.f6753b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WithdrawSureDialogFragment withdrawSureDialogFragment = this.f6753b;
                    switch (i12) {
                        case 0:
                            WithdrawSureDialogFragment.a aVar = WithdrawSureDialogFragment.f32336X;
                            withdrawSureDialogFragment.dismiss();
                            Function0 function0 = withdrawSureDialogFragment.f32337L;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            break;
                        case 1:
                            WithdrawSureDialogFragment.a aVar2 = WithdrawSureDialogFragment.f32336X;
                            withdrawSureDialogFragment.dismiss();
                            Function0 function1 = withdrawSureDialogFragment.f32338M;
                            if (function1 != null) {
                                function1.invoke();
                            }
                            break;
                        default:
                            WithdrawSureDialogFragment.a aVar3 = WithdrawSureDialogFragment.f32336X;
                            withdrawSureDialogFragment.dismiss();
                            Function0 function2 = withdrawSureDialogFragment.f32338M;
                            if (function2 != null) {
                                function2.invoke();
                            }
                            break;
                    }
                }
            });
        }
        return baseDialog;
    }
}
