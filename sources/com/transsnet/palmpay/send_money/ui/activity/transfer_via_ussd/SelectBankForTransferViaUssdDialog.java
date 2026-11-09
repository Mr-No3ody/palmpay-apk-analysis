package com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd;

import L6.b;
import O6.f;
import Wf.AbstractC0780y;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.l;
import p159kd.e;
import p173ld.m;
import p327vd.c;
import p353xd.v;
import p355xf.C2131j;
import p355xf.t;
import p382zb.A;
import p382zb.b0;
import x9.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/transfer_via_ussd/SelectBankForTransferViaUssdDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SelectBankForTransferViaUssdDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final a f33621Y = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f33622C = C2131j.b(new u(10));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f33623H = C2131j.b(new u(11));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public RecyclerView f33624L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ImageView f33625M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CompatStateEditText f33626Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SideBarView f33627X;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectBankForTransferViaUssdDialog newInstance() {
            return new SelectBankForTransferViaUssdDialog();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(requireContext()), p159kd.f.sm_dialog_select_bank_for_transfer_via_ussd, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = true;
        this.f31241f = false;
        this.f31243i = l.dialog_bottom_in_out;
        this.f33624L = (RecyclerView) viewF.findViewById(e.bank_rv);
        this.f33625M = (ImageView) viewF.findViewById(e.search_iv);
        this.f33626Q = (CompatStateEditText) viewF.findViewById(e.search_et);
        this.f33627X = (SideBarView) viewF.findViewById(e.side_bar);
        PpTitleBar ppTitleBar = (PpTitleBar) viewF.findViewById(e.title_bar);
        if (ppTitleBar != null) {
            ppTitleBar.c(S6.a.pay_Close, requireContext().getColor(b.ppColorTextPrimary));
        }
        ppTitleBar.setBackButtonClickListener(new c(this, 23));
        CompatStateEditText compatStateEditText = this.f33626Q;
        if (compatStateEditText != null) {
            compatStateEditText.setOnFocusChangeListener(new v(this, 2));
        }
        CompatStateEditText compatStateEditText2 = this.f33626Q;
        if (compatStateEditText2 != null) {
            compatStateEditText2.addTextChangedListener(new A(this, 1));
        }
        SideBarView sideBarView = this.f33627X;
        if (sideBarView != null) {
            sideBarView.setLetters(getResources().getStringArray(p159kd.a.sm_select_bank_slide_bar_value_new));
        }
        SideBarView sideBarView2 = this.f33627X;
        if (sideBarView2 != null) {
            sideBarView2.setOnLetterChangeListener(new p384zd.f(this));
        }
        RecyclerView recyclerView = this.f33624L;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        RecyclerView recyclerView2 = this.f33624L;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(c1548f);
        }
        RecyclerView recyclerView3 = this.f33624L;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(j());
        }
        RecyclerView recyclerView4 = this.f33624L;
        if (recyclerView4 != null) {
            recyclerView4.setNestedScrollingEnabled(false);
        }
        m mVarJ = j();
        if (mVarJ != null) {
            mVarJ.setOnItemClickListener(new b0(this));
        }
        return baseDialog;
    }

    public final m j() {
        return (m) this.f33622C.getValue();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC0780y.m(V.f(this), null, null, new p384zd.b(this, null), 3);
    }
}
