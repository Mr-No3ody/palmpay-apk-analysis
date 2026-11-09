package com.transsnet.palmpay.managemoney.ui.dialog;

import C9.C0155w;
import Jc.c;
import Jc.d;
import O6.f;
import Pa.AbstractC0511h;
import Pa.C0510g;
import Pa.i0;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.managemoney.ui.dialog.EstimatedInterestDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/EstimatedInterestDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EstimatedInterestDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f32295C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EstimatedInterestDialogFragment newInstance(@Nullable String str, @Nullable String str2) {
            EstimatedInterestDialogFragment estimatedInterestDialogFragment = new EstimatedInterestDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.PRODUCT_NAME, str);
            bundle.putString("total_back_amount", str2);
            estimatedInterestDialogFragment.setArguments(bundle);
            return estimatedInterestDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_estimated_interest_dialog_fragnment, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31245o = false;
        this.f31246p = false;
        this.f31243i = w.Animation_CommonDialog;
        this.f31242g = 17;
        final int i7 = 0;
        viewF.findViewById(c.rtvConfirm).setOnClickListener(new View.OnClickListener(this) { // from class: Oc.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EstimatedInterestDialogFragment f6783b;

            {
                this.f6783b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EstimatedInterestDialogFragment estimatedInterestDialogFragment = this.f6783b;
                switch (i7) {
                    case 0:
                        EstimatedInterestDialogFragment.a aVar = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        EstimatedInterestDialogFragment.a aVar2 = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        EstimatedInterestDialogFragment.a aVar3 = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        Bundle arguments = estimatedInterestDialogFragment.getArguments();
                        if (arguments != null) {
                            i0.b0("/cashbox/deposits.html?amount=" + arguments.getString("total_back_amount"));
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        viewF.findViewById(c.ivClose).setOnClickListener(new View.OnClickListener(this) { // from class: Oc.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EstimatedInterestDialogFragment f6783b;

            {
                this.f6783b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EstimatedInterestDialogFragment estimatedInterestDialogFragment = this.f6783b;
                switch (i10) {
                    case 0:
                        EstimatedInterestDialogFragment.a aVar = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        EstimatedInterestDialogFragment.a aVar2 = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        EstimatedInterestDialogFragment.a aVar3 = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        Bundle arguments = estimatedInterestDialogFragment.getArguments();
                        if (arguments != null) {
                            i0.b0("/cashbox/deposits.html?amount=" + arguments.getString("total_back_amount"));
                        }
                        break;
                }
            }
        });
        View viewFindViewById = viewF.findViewById(c.tv_link);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setFlags(8);
        }
        TextPaint paint2 = textView.getPaint();
        if (paint2 != null) {
            paint2.setAntiAlias(true);
        }
        final int i11 = 2;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EstimatedInterestDialogFragment f6783b;

            {
                this.f6783b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EstimatedInterestDialogFragment estimatedInterestDialogFragment = this.f6783b;
                switch (i11) {
                    case 0:
                        EstimatedInterestDialogFragment.a aVar = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        break;
                    case 1:
                        EstimatedInterestDialogFragment.a aVar2 = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        break;
                    default:
                        EstimatedInterestDialogFragment.a aVar3 = EstimatedInterestDialogFragment.f32295C;
                        estimatedInterestDialogFragment.dismissAllowingStateLoss();
                        Bundle arguments = estimatedInterestDialogFragment.getArguments();
                        if (arguments != null) {
                            i0.b0("/cashbox/deposits.html?amount=" + arguments.getString("total_back_amount"));
                        }
                        break;
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            View viewFindViewById2 = viewF.findViewById(c.tvPayoutTips);
            Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById2).setText(arguments.getString(FirebaseAnalytics.Param.PRODUCT_NAME));
            String string = arguments.getString("total_back_amount");
            C0510g c0510g = AbstractC0511h.f7089a;
            View viewFindViewById3 = viewF.findViewById(c.tv_link);
            Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            c0510g.richText((TextView) viewFindViewById3, "View calculation details >", "", new C0155w(1, string, this));
        }
        return baseDialog;
    }
}
