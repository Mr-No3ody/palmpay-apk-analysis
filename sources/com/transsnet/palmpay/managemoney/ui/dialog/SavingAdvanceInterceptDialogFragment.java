package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import O6.f;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.SavingAdvanceInterceptDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/SavingAdvanceInterceptDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SavingAdvanceInterceptDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f32315X = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f32316L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f32317M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f32318Q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SavingAdvanceInterceptDialogFragment newInstance(@NotNull String orderId, @Nullable String str, @Nullable Float f10) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            SavingAdvanceInterceptDialogFragment savingAdvanceInterceptDialogFragment = new SavingAdvanceInterceptDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("orderId", orderId);
            bundle.putString("transType", str);
            bundle.putFloat("rate", f10 != null ? f10.floatValue() : 0.002f);
            savingAdvanceInterceptDialogFragment.setArguments(bundle);
            return savingAdvanceInterceptDialogFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public SavingAdvanceInterceptDialogFragment() {
        final int i7 = 0;
        this.f32316L = C2131j.b(new Function0(this) { // from class: Oc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingAdvanceInterceptDialogFragment f6795b;

            {
                this.f6795b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SavingAdvanceInterceptDialogFragment savingAdvanceInterceptDialogFragment = this.f6795b;
                switch (i7) {
                    case 0:
                        int i10 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getString("orderId", "");
                        }
                        return null;
                    case 1:
                        int i11 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments2 = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("transType", "");
                        }
                        return null;
                    default:
                        int i12 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments3 = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments3 != null) {
                            return Float.valueOf(arguments3.getFloat("rate", 0.002f));
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f32317M = C2131j.b(new Function0(this) { // from class: Oc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingAdvanceInterceptDialogFragment f6795b;

            {
                this.f6795b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SavingAdvanceInterceptDialogFragment savingAdvanceInterceptDialogFragment = this.f6795b;
                switch (i10) {
                    case 0:
                        int i11 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getString("orderId", "");
                        }
                        return null;
                    case 1:
                        int i12 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments2 = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("transType", "");
                        }
                        return null;
                    default:
                        int i13 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments3 = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments3 != null) {
                            return Float.valueOf(arguments3.getFloat("rate", 0.002f));
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f32318Q = C2131j.b(new Function0(this) { // from class: Oc.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingAdvanceInterceptDialogFragment f6795b;

            {
                this.f6795b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SavingAdvanceInterceptDialogFragment savingAdvanceInterceptDialogFragment = this.f6795b;
                switch (i11) {
                    case 0:
                        int i12 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getString("orderId", "");
                        }
                        return null;
                    case 1:
                        int i13 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments2 = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("transType", "");
                        }
                        return null;
                    default:
                        int i14 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle arguments3 = savingAdvanceInterceptDialogFragment.getArguments();
                        if (arguments3 != null) {
                            return Float.valueOf(arguments3.getFloat("rate", 0.002f));
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_saving_advance_intercept_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(c.ivClose);
        View viewFindViewById2 = viewF.findViewById(c.layoutRoot);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        View viewFindViewById3 = viewF.findViewById(c.rtvAdvance);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        PpButton ppButton = (PpButton) viewFindViewById3;
        View viewFindViewById4 = viewF.findViewById(c.rtvSetBreak);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        PpButton ppButton2 = (PpButton) viewFindViewById4;
        View viewFindViewById5 = viewF.findViewById(c.tvDailyFee);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById5;
        Float f10 = (Float) this.f32318Q.getValue();
        if (f10 != null) {
            textView.setText((f10.floatValue() * 100) + "% Daily Fee");
        }
        final int i7 = 0;
        ppButton.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingAdvanceInterceptDialogFragment f6793b;

            {
                this.f6793b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SavingAdvanceInterceptDialogFragment savingAdvanceInterceptDialogFragment = this.f6793b;
                switch (i7) {
                    case 0:
                        int i10 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle bundle = new Bundle();
                        bundle.putString("transType", (String) savingAdvanceInterceptDialogFragment.f32317M.getValue());
                        bundle.putString("orderId", (String) savingAdvanceInterceptDialogFragment.f32316L.getValue());
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "FixedSavingsApplyAdvance");
                        savingAdvanceInterceptDialogFragment.dismiss();
                        break;
                    case 1:
                        int i11 = SavingAdvanceInterceptDialogFragment.f32315X;
                        com.palmpay.lib.apm.launchcounter.util.d.H("/manage_money/plan_break_pre_activity", "orderNo", (String) savingAdvanceInterceptDialogFragment.f32316L.getValue());
                        savingAdvanceInterceptDialogFragment.dismiss();
                        break;
                    default:
                        int i12 = SavingAdvanceInterceptDialogFragment.f32315X;
                        savingAdvanceInterceptDialogFragment.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        ppButton2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingAdvanceInterceptDialogFragment f6793b;

            {
                this.f6793b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SavingAdvanceInterceptDialogFragment savingAdvanceInterceptDialogFragment = this.f6793b;
                switch (i10) {
                    case 0:
                        int i11 = SavingAdvanceInterceptDialogFragment.f32315X;
                        Bundle bundle = new Bundle();
                        bundle.putString("transType", (String) savingAdvanceInterceptDialogFragment.f32317M.getValue());
                        bundle.putString("orderId", (String) savingAdvanceInterceptDialogFragment.f32316L.getValue());
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "FixedSavingsApplyAdvance");
                        savingAdvanceInterceptDialogFragment.dismiss();
                        break;
                    case 1:
                        int i12 = SavingAdvanceInterceptDialogFragment.f32315X;
                        com.palmpay.lib.apm.launchcounter.util.d.H("/manage_money/plan_break_pre_activity", "orderNo", (String) savingAdvanceInterceptDialogFragment.f32316L.getValue());
                        savingAdvanceInterceptDialogFragment.dismiss();
                        break;
                    default:
                        int i13 = SavingAdvanceInterceptDialogFragment.f32315X;
                        savingAdvanceInterceptDialogFragment.dismiss();
                        break;
                }
            }
        });
        if (viewFindViewById != null) {
            final int i11 = 2;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SavingAdvanceInterceptDialogFragment f6793b;

                {
                    this.f6793b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SavingAdvanceInterceptDialogFragment savingAdvanceInterceptDialogFragment = this.f6793b;
                    switch (i11) {
                        case 0:
                            int i12 = SavingAdvanceInterceptDialogFragment.f32315X;
                            Bundle bundle = new Bundle();
                            bundle.putString("transType", (String) savingAdvanceInterceptDialogFragment.f32317M.getValue());
                            bundle.putString("orderId", (String) savingAdvanceInterceptDialogFragment.f32316L.getValue());
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "FixedSavingsApplyAdvance");
                            savingAdvanceInterceptDialogFragment.dismiss();
                            break;
                        case 1:
                            int i13 = SavingAdvanceInterceptDialogFragment.f32315X;
                            com.palmpay.lib.apm.launchcounter.util.d.H("/manage_money/plan_break_pre_activity", "orderNo", (String) savingAdvanceInterceptDialogFragment.f32316L.getValue());
                            savingAdvanceInterceptDialogFragment.dismiss();
                            break;
                        default:
                            int i14 = SavingAdvanceInterceptDialogFragment.f32315X;
                            savingAdvanceInterceptDialogFragment.dismiss();
                            break;
                    }
                }
            });
        }
        return baseDialog;
    }
}
