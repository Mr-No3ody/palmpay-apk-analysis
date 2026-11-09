package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/FlexiOverdueDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiOverdueDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f29971C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FlexiOverdueDialogFragment newInstance(int i7) {
            FlexiOverdueDialogFragment flexiOverdueDialogFragment = new FlexiOverdueDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("status", i7);
            flexiOverdueDialogFragment.setArguments(bundle);
            return flexiOverdueDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        String string;
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_cl_flexi_overdue_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        int i7 = 0;
        this.f31245o = false;
        this.f31246p = true;
        this.f31242g = 17;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("status")) : null;
        TextView textView = (TextView) viewF.findViewById(Ya.e.tvTitle);
        ImageView imageView = (ImageView) viewF.findViewById(Ya.e.ivClose);
        RoundedTextView roundedTextView = (RoundedTextView) viewF.findViewById(Ya.e.rtvRepay);
        TextView textView2 = (TextView) viewF.findViewById(Ya.e.tvContent);
        TextView textView3 = (TextView) viewF.findViewById(Ya.e.tvBottomTips);
        if ((numValueOf == null || numValueOf.intValue() != 2) && (numValueOf == null || numValueOf.intValue() != 3)) {
            i7 = 8;
        }
        textView3.setVisibility(i7);
        String string2 = "";
        if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 1)) {
            string = getString(Ya.g.cs_cl_upgrade_failed);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            string = getString(Ya.g.cs_cl_flexi_cash_overdue);
        } else {
            string = (numValueOf != null && numValueOf.intValue() == 3) ? getString(Ya.g.cs_cl_flexi_overdue) : "";
        }
        textView.setText(string);
        if (numValueOf != null && numValueOf.intValue() == 0) {
            string2 = getString(Ya.g.cs_cl_upgrade_failed_risk_control);
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            string2 = getString(Ya.g.cs_cl_upgrade_failed_cash_unopened);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            string2 = getString(Ya.g.cs_borrow_when_flexi_cash_bill_overdue);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            string2 = getString(Ya.g.cs_borrow_when_flexi_bill_overdue);
        }
        textView2.setText(string2);
        Intrinsics.e(imageView);
        final int i10 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiOverdueDialogFragment f30160b;

            {
                this.f30160b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlexiOverdueDialogFragment flexiOverdueDialogFragment = this.f30160b;
                switch (i10) {
                    case 0:
                        FlexiOverdueDialogFragment.a aVar = FlexiOverdueDialogFragment.f29971C;
                        flexiOverdueDialogFragment.dismiss();
                        break;
                    default:
                        FlexiOverdueDialogFragment.a aVar2 = FlexiOverdueDialogFragment.f29971C;
                        com.palmpay.lib.apm.launchcounter.util.d.F("/credit_score/oc_main_activity");
                        flexiOverdueDialogFragment.dismiss();
                        break;
                }
            }
        }, imageView);
        Intrinsics.e(roundedTextView);
        final int i11 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiOverdueDialogFragment f30160b;

            {
                this.f30160b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlexiOverdueDialogFragment flexiOverdueDialogFragment = this.f30160b;
                switch (i11) {
                    case 0:
                        FlexiOverdueDialogFragment.a aVar = FlexiOverdueDialogFragment.f29971C;
                        flexiOverdueDialogFragment.dismiss();
                        break;
                    default:
                        FlexiOverdueDialogFragment.a aVar2 = FlexiOverdueDialogFragment.f29971C;
                        com.palmpay.lib.apm.launchcounter.util.d.F("/credit_score/oc_main_activity");
                        flexiOverdueDialogFragment.dismiss();
                        break;
                }
            }
        }, roundedTextView);
        return baseDialog;
    }
}
