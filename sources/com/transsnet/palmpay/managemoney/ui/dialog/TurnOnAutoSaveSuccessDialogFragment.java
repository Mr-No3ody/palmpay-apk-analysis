package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import O6.f;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveSuccessDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/TurnOnAutoSaveSuccessDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurnOnAutoSaveSuccessDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f32326C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TurnOnAutoSaveSuccessDialogFragment newInstance() {
            return new TurnOnAutoSaveSuccessDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_cash_box_turn_on_auto_save_success_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31242g = 17;
        this.f31246p = false;
        ImageView imageView = (ImageView) viewF.findViewById(c.ivClose);
        if (imageView != null) {
            final int i7 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TurnOnAutoSaveSuccessDialogFragment f6799b;

                {
                    this.f6799b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TurnOnAutoSaveSuccessDialogFragment turnOnAutoSaveSuccessDialogFragment = this.f6799b;
                    switch (i7) {
                        case 0:
                            TurnOnAutoSaveSuccessDialogFragment.a aVar = TurnOnAutoSaveSuccessDialogFragment.f32326C;
                            turnOnAutoSaveSuccessDialogFragment.dismiss();
                            break;
                        default:
                            TurnOnAutoSaveSuccessDialogFragment.a aVar2 = TurnOnAutoSaveSuccessDialogFragment.f32326C;
                            turnOnAutoSaveSuccessDialogFragment.dismiss();
                            break;
                    }
                }
            });
        }
        PpButton ppButton = (PpButton) viewF.findViewById(c.rtvConfirm);
        if (ppButton != null) {
            final int i10 = 1;
            ppButton.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TurnOnAutoSaveSuccessDialogFragment f6799b;

                {
                    this.f6799b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TurnOnAutoSaveSuccessDialogFragment turnOnAutoSaveSuccessDialogFragment = this.f6799b;
                    switch (i10) {
                        case 0:
                            TurnOnAutoSaveSuccessDialogFragment.a aVar = TurnOnAutoSaveSuccessDialogFragment.f32326C;
                            turnOnAutoSaveSuccessDialogFragment.dismiss();
                            break;
                        default:
                            TurnOnAutoSaveSuccessDialogFragment.a aVar2 = TurnOnAutoSaveSuccessDialogFragment.f32326C;
                            turnOnAutoSaveSuccessDialogFragment.dismiss();
                            break;
                    }
                }
            });
        }
        return baseDialog;
    }
}
