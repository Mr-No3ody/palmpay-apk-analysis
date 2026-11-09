package com.transsnet.palmpay.managemoney.ui.dialog;

import C9.C0139f;
import Ce.S;
import Fd.G;
import Jc.c;
import Jc.d;
import L6.b;
import M3.f;
import Nc.u;
import Nc.x;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.horcrux.svg.d0;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/SelectPayoutOptionsDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectPayoutOptionsDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectPayoutOptionsDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/SelectPayoutOptionsDialogFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n115#2,8:156\n145#2:164\n115#2,8:165\n145#2:173\n1869#3,2:174\n*S KotlinDebug\n*F\n+ 1 SelectPayoutOptionsDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/SelectPayoutOptionsDialogFragment\n*L\n110#1:156,8\n110#1:164\n114#1:165,8\n114#1:173\n138#1:174,2\n*E\n"})
public final class SelectPayoutOptionsDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f32319X = new a(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Boolean f32320L = Boolean.TRUE;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f32321M = C2131j.b(new f(this, 9));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public PayoutOption f32322Q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectPayoutOptionsDialogFragment newInstance(@Nullable ArrayList<PayoutOption> arrayList) {
            SelectPayoutOptionsDialogFragment selectPayoutOptionsDialogFragment = new SelectPayoutOptionsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("payout_option_list", arrayList);
            selectPayoutOptionsDialogFragment.setArguments(bundle);
            return selectPayoutOptionsDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_select_payout_options_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(c.ivClose);
        View viewFindViewById2 = viewF.findViewById(c.rvPayoutOptions);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewF.findViewById(c.layoutRoot);
        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById3;
        u uVar = new u((ArrayList) this.f32321M.getValue(), new defpackage.a(this, 4, recyclerView, constraintLayout));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C1548f c1548f = new C1548f(requireContext().getColor(b.ppColorDividerLine), DensityUtil.dp2px(1.0f));
        c1548f.f31336e = false;
        recyclerView.addItemDecoration(c1548f);
        recyclerView.setAdapter(uVar);
        viewFindViewById.setOnClickListener(new x(this, 9));
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) j()).f32740X;
        if (lVar != null) {
            lVar.e(this, new G(new C0139f(this, 20), 11));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CashBoxViewModel) j()).f32751p0;
        if (lVar2 != null) {
            lVar2.e(this, new G(new S(this, 3, constraintLayout, uVar), 11));
        }
        ((CashBoxViewModel) j()).g();
        return baseDialog;
    }
}
