package com.transsnet.palmpay.managemoney.ui.dialog;

import C9.C0138e;
import C9.Q;
import Jc.c;
import Jc.d;
import O6.f;
import Oc.C0500c;
import Oc.j;
import Pa.AbstractC0511h;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CashBoxTermsConditionsDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxTermsConditionsDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxTermsConditionsDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxTermsConditionsDialogFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n115#2,8:153\n145#2:161\n1869#3,2:162\n*S KotlinDebug\n*F\n+ 1 CashBoxTermsConditionsDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxTermsConditionsDialogFragment\n*L\n115#1:153,8\n115#1:161\n136#1:162,2\n*E\n"})
public final class CashBoxTermsConditionsDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final a f32284Q = new a(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f32285L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f32286M;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxTermsConditionsDialogFragment newInstance(@Nullable ArrayList<PayoutOption> arrayList, @Nullable PayoutOption payoutOption) {
            CashBoxTermsConditionsDialogFragment cashBoxTermsConditionsDialogFragment = new CashBoxTermsConditionsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("payout_option_list", arrayList);
            bundle.putParcelable("extra_data", payoutOption);
            cashBoxTermsConditionsDialogFragment.setArguments(bundle);
            return cashBoxTermsConditionsDialogFragment;
        }

        private a() {
        }
    }

    public CashBoxTermsConditionsDialogFragment() {
        final int i7 = 0;
        this.f32285L = C2131j.b(new Function0(this) { // from class: Oc.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTermsConditionsDialogFragment f6773b;

            {
                this.f6773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTermsConditionsDialogFragment cashBoxTermsConditionsDialogFragment = this.f6773b;
                switch (i7) {
                    case 0:
                        CashBoxTermsConditionsDialogFragment.a aVar = CashBoxTermsConditionsDialogFragment.f32284Q;
                        Bundle arguments = cashBoxTermsConditionsDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getParcelableArrayList("payout_option_list");
                        }
                        return null;
                    default:
                        CashBoxTermsConditionsDialogFragment.a aVar2 = CashBoxTermsConditionsDialogFragment.f32284Q;
                        Bundle arguments2 = cashBoxTermsConditionsDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return (PayoutOption) arguments2.getParcelable("extra_data");
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f32286M = C2131j.b(new Function0(this) { // from class: Oc.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTermsConditionsDialogFragment f6773b;

            {
                this.f6773b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxTermsConditionsDialogFragment cashBoxTermsConditionsDialogFragment = this.f6773b;
                switch (i10) {
                    case 0:
                        CashBoxTermsConditionsDialogFragment.a aVar = CashBoxTermsConditionsDialogFragment.f32284Q;
                        Bundle arguments = cashBoxTermsConditionsDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getParcelableArrayList("payout_option_list");
                        }
                        return null;
                    default:
                        CashBoxTermsConditionsDialogFragment.a aVar2 = CashBoxTermsConditionsDialogFragment.f32284Q;
                        Bundle arguments2 = cashBoxTermsConditionsDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return (PayoutOption) arguments2.getParcelable("extra_data");
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_cashbox_terms_conditions_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(c.layoutRoot);
        View viewFindViewById2 = viewF.findViewById(c.ivClose);
        TextView textView = (TextView) viewF.findViewById(c.tvContent);
        View viewFindViewById3 = viewF.findViewById(c.rtvCancel);
        View viewFindViewById4 = viewF.findViewById(c.rtvAgree);
        AbstractC0511h.f7089a.richText(textView, textView.getText().toString(), getString(Jc.f.mm_terms_and_conditions), new C0500c(this, 2));
        final int i7 = 0;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTermsConditionsDialogFragment f6768b;

            {
                this.f6768b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxTermsConditionsDialogFragment cashBoxTermsConditionsDialogFragment = this.f6768b;
                switch (i7) {
                    case 0:
                        CashBoxTermsConditionsDialogFragment.a aVar = CashBoxTermsConditionsDialogFragment.f32284Q;
                        cashBoxTermsConditionsDialogFragment.dismiss();
                        break;
                    default:
                        CashBoxTermsConditionsDialogFragment.a aVar2 = CashBoxTermsConditionsDialogFragment.f32284Q;
                        cashBoxTermsConditionsDialogFragment.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxTermsConditionsDialogFragment f6768b;

            {
                this.f6768b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxTermsConditionsDialogFragment cashBoxTermsConditionsDialogFragment = this.f6768b;
                switch (i10) {
                    case 0:
                        CashBoxTermsConditionsDialogFragment.a aVar = CashBoxTermsConditionsDialogFragment.f32284Q;
                        cashBoxTermsConditionsDialogFragment.dismiss();
                        break;
                    default:
                        CashBoxTermsConditionsDialogFragment.a aVar2 = CashBoxTermsConditionsDialogFragment.f32284Q;
                        cashBoxTermsConditionsDialogFragment.dismiss();
                        break;
                }
            }
        });
        viewFindViewById4.setOnClickListener(new j(0, this, viewFindViewById));
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) j()).f32751p0;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(24, this, viewFindViewById), (byte) 0, (short) 0));
        }
        return baseDialog;
    }
}
