package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import La.i;
import O6.f;
import Oc.C0500c;
import Pa.AbstractC0511h;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsWithEventDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CashBoxTermsConditionsWithEventDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashBoxTermsConditionsWithEventDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f32287H = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Function0 f32288C = new i(21);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxTermsConditionsWithEventDialogFragment newInstance() {
            return new CashBoxTermsConditionsWithEventDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_other_terms_conditions_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        viewF.findViewById(c.layoutRoot);
        View viewFindViewById = viewF.findViewById(c.ivClose);
        TextView textView = (TextView) viewF.findViewById(c.tvContent);
        View viewFindViewById2 = viewF.findViewById(c.rtvCancel);
        View viewFindViewById3 = viewF.findViewById(c.rtvAgree);
        AbstractC0511h.f7089a.richText(textView, textView.getText().toString(), getString(Jc.f.mm_terms_and_conditions), new C0500c(this, 3));
        final int i7 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTermsConditionsWithEventDialogFragment f6775b;

            {
                this.f6775b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxTermsConditionsWithEventDialogFragment cashBoxTermsConditionsWithEventDialogFragment = this.f6775b;
                switch (i7) {
                    case 0:
                        CashBoxTermsConditionsWithEventDialogFragment.a aVar = CashBoxTermsConditionsWithEventDialogFragment.f32287H;
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                    case 1:
                        CashBoxTermsConditionsWithEventDialogFragment.a aVar2 = CashBoxTermsConditionsWithEventDialogFragment.f32287H;
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                    default:
                        Function0 function0 = cashBoxTermsConditionsWithEventDialogFragment.f32288C;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTermsConditionsWithEventDialogFragment f6775b;

            {
                this.f6775b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxTermsConditionsWithEventDialogFragment cashBoxTermsConditionsWithEventDialogFragment = this.f6775b;
                switch (i10) {
                    case 0:
                        CashBoxTermsConditionsWithEventDialogFragment.a aVar = CashBoxTermsConditionsWithEventDialogFragment.f32287H;
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                    case 1:
                        CashBoxTermsConditionsWithEventDialogFragment.a aVar2 = CashBoxTermsConditionsWithEventDialogFragment.f32287H;
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                    default:
                        Function0 function0 = cashBoxTermsConditionsWithEventDialogFragment.f32288C;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                }
            }
        });
        final int i11 = 2;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTermsConditionsWithEventDialogFragment f6775b;

            {
                this.f6775b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxTermsConditionsWithEventDialogFragment cashBoxTermsConditionsWithEventDialogFragment = this.f6775b;
                switch (i11) {
                    case 0:
                        CashBoxTermsConditionsWithEventDialogFragment.a aVar = CashBoxTermsConditionsWithEventDialogFragment.f32287H;
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                    case 1:
                        CashBoxTermsConditionsWithEventDialogFragment.a aVar2 = CashBoxTermsConditionsWithEventDialogFragment.f32287H;
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                    default:
                        Function0 function0 = cashBoxTermsConditionsWithEventDialogFragment.f32288C;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        cashBoxTermsConditionsWithEventDialogFragment.dismiss();
                        break;
                }
            }
        });
        return baseDialog;
    }
}
