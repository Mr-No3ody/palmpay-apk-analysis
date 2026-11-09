package com.transsnet.palmpay.managemoney.ui.dialog;

import C9.C0138e;
import Ce.S;
import Gb.T;
import Hb.u;
import Jc.c;
import Jc.d;
import M3.f;
import Nc.x;
import Oc.C0499b;
import Oc.C0500c;
import Pa.AbstractC0511h;
import Pa.C0510g;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/CashBoxAutoSaveDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxAutoSaveDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxAutoSaveDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxAutoSaveDialogFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,166:1\n115#2,8:167\n145#2:175\n*S KotlinDebug\n*F\n+ 1 CashBoxAutoSaveDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/CashBoxAutoSaveDialogFragment\n*L\n138#1:167,8\n138#1:175\n*E\n"})
public final class CashBoxAutoSaveDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a f32279M = new a(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f32280L = C2131j.b(new f(this, 8));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CashBoxAutoSaveDialogFragment newInstance$default(a aVar, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "";
            }
            return aVar.newInstance(str);
        }

        @NotNull
        public final CashBoxAutoSaveDialogFragment newInstance(@NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            CashBoxAutoSaveDialogFragment cashBoxAutoSaveDialogFragment = new CashBoxAutoSaveDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("source", source);
            cashBoxAutoSaveDialogFragment.setArguments(bundle);
            return cashBoxAutoSaveDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_cashbox_auto_save_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(c.ivClose);
        View viewFindViewById2 = viewF.findViewById(c.layoutRoot);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = viewF.findViewById(c.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C0510g c0510g = AbstractC0511h.f7089a;
        c0510g.richText((TextView) viewFindViewById3, getString(Jc.f.mm_cashbox_auto_save_agree), "gain more interest", new C0499b(0));
        View viewFindViewById4 = viewF.findViewById(c.tvProtocol);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        c0510g.richText((TextView) viewFindViewById4, getString(Jc.f.mm_auto_save_terms), "Terms & Conditions for CashBox Auto Saving", new C0500c(this, 0));
        View viewFindViewById5 = viewF.findViewById(c.ckProtocol);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        CheckBox checkBox = (CheckBox) viewFindViewById5;
        View viewFindViewById6 = viewF.findViewById(c.rtvAgree);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        PpButton ppButton = (PpButton) viewFindViewById6;
        ppButton.setOnClickListener(new T(28, ppButton, this));
        checkBox.setOnCheckedChangeListener(new u(ppButton, checkBox, 2));
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new x(this, 4));
        }
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) j()).f32748k0;
        if (lVar != null) {
            lVar.e(this, new C0138e(new S(this, 2, constraintLayout, ppButton), (byte) 0));
        }
        return baseDialog;
    }
}
