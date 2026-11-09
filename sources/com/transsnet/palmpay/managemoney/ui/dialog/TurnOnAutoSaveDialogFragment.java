package com.transsnet.palmpay.managemoney.ui.dialog;

import C9.C0155w;
import Jc.c;
import Jc.d;
import La.i;
import O6.f;
import Pa.AbstractC0511h;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/TurnOnAutoSaveDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurnOnAutoSaveDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f32323L = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Function0 f32324C = new i(24);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Function0 f32325H = new i(25);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TurnOnAutoSaveDialogFragment newInstance(@Nullable String str) {
            TurnOnAutoSaveDialogFragment turnOnAutoSaveDialogFragment = new TurnOnAutoSaveDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("agreement_url", str);
            turnOnAutoSaveDialogFragment.setArguments(bundle);
            return turnOnAutoSaveDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_cash_box_turn_on_auto_save_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31242g = 17;
        this.f31246p = false;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("agreement_url") : null;
        TextView textView = (TextView) viewF.findViewById(c.tvProtocol);
        RoundedTextView roundedTextView = (RoundedTextView) viewF.findViewById(c.rtvCancel);
        RoundedTextView roundedTextView2 = (RoundedTextView) viewF.findViewById(c.rtvTurnOn);
        AbstractC0511h.f7089a.richText(textView, getString(Jc.f.mm_cashbox_auto_save_transfer_agreement), "Automatic Saving Service Agreement", new C0155w(2, string, this));
        final int i7 = 0;
        roundedTextView.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TurnOnAutoSaveDialogFragment f6797b;

            {
                this.f6797b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TurnOnAutoSaveDialogFragment turnOnAutoSaveDialogFragment = this.f6797b;
                switch (i7) {
                    case 0:
                        TurnOnAutoSaveDialogFragment.a aVar = TurnOnAutoSaveDialogFragment.f32323L;
                        turnOnAutoSaveDialogFragment.dismiss();
                        turnOnAutoSaveDialogFragment.f32325H.invoke();
                        break;
                    default:
                        TurnOnAutoSaveDialogFragment.a aVar2 = TurnOnAutoSaveDialogFragment.f32323L;
                        turnOnAutoSaveDialogFragment.dismiss();
                        turnOnAutoSaveDialogFragment.f32324C.invoke();
                        break;
                }
            }
        });
        final int i10 = 1;
        roundedTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TurnOnAutoSaveDialogFragment f6797b;

            {
                this.f6797b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TurnOnAutoSaveDialogFragment turnOnAutoSaveDialogFragment = this.f6797b;
                switch (i10) {
                    case 0:
                        TurnOnAutoSaveDialogFragment.a aVar = TurnOnAutoSaveDialogFragment.f32323L;
                        turnOnAutoSaveDialogFragment.dismiss();
                        turnOnAutoSaveDialogFragment.f32325H.invoke();
                        break;
                    default:
                        TurnOnAutoSaveDialogFragment.a aVar2 = TurnOnAutoSaveDialogFragment.f32323L;
                        turnOnAutoSaveDialogFragment.dismiss();
                        turnOnAutoSaveDialogFragment.f32324C.invoke();
                        break;
                }
            }
        });
        return baseDialog;
    }
}
