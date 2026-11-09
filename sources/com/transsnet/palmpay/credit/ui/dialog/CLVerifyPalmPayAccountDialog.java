package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLVerifyPalmPayAccountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLVerifyPalmPayAccountDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f29949L = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f29950C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Function0 f29951H;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CLVerifyPalmPayAccountDialog newInstance$default(a aVar, List list, Function0 function0, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                function0 = null;
            }
            return aVar.newInstance(list, function0);
        }

        @NotNull
        public final CLVerifyPalmPayAccountDialog newInstance(@Nullable List<OcRouterDetail> list, @Nullable Function0<Unit> function0) {
            CLVerifyPalmPayAccountDialog cLVerifyPalmPayAccountDialog = new CLVerifyPalmPayAccountDialog();
            cLVerifyPalmPayAccountDialog.f29950C = list;
            cLVerifyPalmPayAccountDialog.f29951H = function0;
            return cLVerifyPalmPayAccountDialog;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_cl_verify_palmpay_account_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = p025ba.l.dialog_bottom_in_out;
        this.f31242g = 80;
        ImageView imageView = viewF != null ? (ImageView) viewF.findViewById(Ya.e.ivClose) : null;
        AppCompatCheckBox appCompatCheckBox = viewF != null ? (AppCompatCheckBox) viewF.findViewById(Ya.e.ck) : null;
        PpButton ppButton = viewF != null ? (PpButton) viewF.findViewById(Ya.e.btnAgree) : null;
        TextView textView = viewF != null ? (TextView) viewF.findViewById(Ya.e.tvPrivacyPolicy) : null;
        RecyclerView recyclerView = viewF != null ? (RecyclerView) viewF.findViewById(Ya.e.rvVerifyPalmPayAccount) : null;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLVerifyPalmPayAccountDialog f30109b;

                {
                    this.f30109b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLVerifyPalmPayAccountDialog cLVerifyPalmPayAccountDialog = this.f30109b;
                    switch (i7) {
                        case 0:
                            CLVerifyPalmPayAccountDialog.a aVar = CLVerifyPalmPayAccountDialog.f29949L;
                            cLVerifyPalmPayAccountDialog.dismiss();
                            break;
                        default:
                            Function0 function0 = cLVerifyPalmPayAccountDialog.f29951H;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            cLVerifyPalmPayAccountDialog.dismiss();
                            break;
                    }
                }
            }, imageView);
        }
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setOnCheckedChangeListener(new A8.g(ppButton, 7));
        }
        if (ppButton != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLVerifyPalmPayAccountDialog f30109b;

                {
                    this.f30109b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLVerifyPalmPayAccountDialog cLVerifyPalmPayAccountDialog = this.f30109b;
                    switch (i10) {
                        case 0:
                            CLVerifyPalmPayAccountDialog.a aVar = CLVerifyPalmPayAccountDialog.f29949L;
                            cLVerifyPalmPayAccountDialog.dismiss();
                            break;
                        default:
                            Function0 function0 = cLVerifyPalmPayAccountDialog.f29951H;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            cLVerifyPalmPayAccountDialog.dismiss();
                            break;
                    }
                }
            }, ppButton);
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (textView != null) {
            textView.setText(com.horcrux.svg.d0.i(requireContext(), L6.b.ppColorLink, com.horcrux.svg.d0.i(requireContext(), L6.b.ppColorTextNormal, C0.G.i("I've read and consented"), " Loan terms & conditions ").setForegroundColor(requireContext().getColor(L6.b.ppColorLink)).setClickSpan(new C1505g0(this, 0)).append("and "), " privacy policy").setForegroundColor(requireContext().getColor(L6.b.ppColorLink)).setClickSpan(new C1505g0(this, 1)).create());
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        if (recyclerView != null) {
            int i11 = Ya.f.cs_cl_item_verify_palmpay_account;
            List list = this.f29950C;
            recyclerView.setAdapter(new P8.a(i11, list != null ? CollectionsKt.Z(list) : null, 4));
        }
        return baseDialog;
    }
}
