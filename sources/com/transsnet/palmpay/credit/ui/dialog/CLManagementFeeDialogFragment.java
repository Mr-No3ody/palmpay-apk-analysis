package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLManagementFeeDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLManagementFeeDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f29947C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CLManagementFeeDialogFragment newInstance() {
            return new CLManagementFeeDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        ImageView imageView;
        TextView textView;
        RoundedTextView roundedTextView;
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_management_fee_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31242g = 17;
        if (viewF != null && (roundedTextView = (RoundedTextView) viewF.findViewById(Ya.e.rtvBorrowNow)) != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.I

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLManagementFeeDialogFragment f29981b;

                {
                    this.f29981b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLManagementFeeDialogFragment cLManagementFeeDialogFragment = this.f29981b;
                    switch (i7) {
                        case 0:
                            CLManagementFeeDialogFragment.a aVar = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            Pa.i0.c0("https://h5.fleximfb.com/cash/download-guide?source=CashHome&m=" + BaseApplication.get().getUser().getMemberId());
                            break;
                        case 1:
                            CLManagementFeeDialogFragment.a aVar2 = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            break;
                        default:
                            CLManagementFeeDialogFragment.a aVar3 = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            break;
                    }
                }
            }, roundedTextView);
        }
        if (viewF != null && (textView = (TextView) viewF.findViewById(Ya.e.tvTryAgain)) != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.I

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLManagementFeeDialogFragment f29981b;

                {
                    this.f29981b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLManagementFeeDialogFragment cLManagementFeeDialogFragment = this.f29981b;
                    switch (i10) {
                        case 0:
                            CLManagementFeeDialogFragment.a aVar = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            Pa.i0.c0("https://h5.fleximfb.com/cash/download-guide?source=CashHome&m=" + BaseApplication.get().getUser().getMemberId());
                            break;
                        case 1:
                            CLManagementFeeDialogFragment.a aVar2 = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            break;
                        default:
                            CLManagementFeeDialogFragment.a aVar3 = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            break;
                    }
                }
            }, textView);
        }
        if (viewF != null && (imageView = (ImageView) viewF.findViewById(Ya.e.ivClose)) != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.I

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLManagementFeeDialogFragment f29981b;

                {
                    this.f29981b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLManagementFeeDialogFragment cLManagementFeeDialogFragment = this.f29981b;
                    switch (i11) {
                        case 0:
                            CLManagementFeeDialogFragment.a aVar = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            Pa.i0.c0("https://h5.fleximfb.com/cash/download-guide?source=CashHome&m=" + BaseApplication.get().getUser().getMemberId());
                            break;
                        case 1:
                            CLManagementFeeDialogFragment.a aVar2 = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            break;
                        default:
                            CLManagementFeeDialogFragment.a aVar3 = CLManagementFeeDialogFragment.f29947C;
                            cLManagementFeeDialogFragment.dismiss();
                            break;
                    }
                }
            }, imageView);
        }
        return baseDialog;
    }
}
