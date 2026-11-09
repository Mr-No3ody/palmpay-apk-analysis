package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcInviteDiscoverDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/ui/dialog/OcInviteDiscoverDialog$OcInviteDiscoverListener;", "ocInviteDiscoverListener", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/ui/dialog/OcInviteDiscoverDialog$OcInviteDiscoverListener;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/credit/ui/dialog/OcInviteDiscoverDialog$OcInviteDiscoverListener;", "Landroid/widget/Button;", "btnConfirm$delegate", "Lkotlin/Lazy;", "getBtnConfirm", "()Landroid/widget/Button;", "btnConfirm", "Landroidx/constraintlayout/widget/ConstraintLayout;", "viewContainer$delegate", "getViewContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "viewContainer", "OcInviteDiscoverListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcInviteDiscoverDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: btnConfirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnConfirm;

    @NotNull
    private final OcInviteDiscoverListener ocInviteDiscoverListener;

    /* JADX INFO: renamed from: viewContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewContainer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcInviteDiscoverDialog$OcInviteDiscoverListener;", "", "confirm", "", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OcInviteDiscoverListener {
        void confirm(boolean confirm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcInviteDiscoverDialog(@NotNull Context context, @NotNull OcInviteDiscoverListener ocInviteDiscoverListener) {
        super(context, Ya.f.cs_layout_re_invite_discover_dialog, com.transsnet.palmpay.custom_view.w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ocInviteDiscoverListener, "ocInviteDiscoverListener");
        this.ocInviteDiscoverListener = ocInviteDiscoverListener;
        final int i7 = 0;
        this.btnConfirm = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInviteDiscoverDialog f30228b;

            {
                this.f30228b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcInviteDiscoverDialog.btnConfirm_delegate$lambda$0(this.f30228b);
                    default:
                        return OcInviteDiscoverDialog.viewContainer_delegate$lambda$1(this.f30228b);
                }
            }
        });
        final int i10 = 1;
        this.viewContainer = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInviteDiscoverDialog f30228b;

            {
                this.f30228b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcInviteDiscoverDialog.btnConfirm_delegate$lambda$0(this.f30228b);
                    default:
                        return OcInviteDiscoverDialog.viewContainer_delegate$lambda$1(this.f30228b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnConfirm_delegate$lambda$0(OcInviteDiscoverDialog ocInviteDiscoverDialog) {
        return (Button) ocInviteDiscoverDialog.findViewById(Ya.e.btnConfirm);
    }

    private final Button getBtnConfirm() {
        return (Button) this.btnConfirm.getValue();
    }

    private final ConstraintLayout getViewContainer() {
        return (ConstraintLayout) this.viewContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(OcInviteDiscoverDialog ocInviteDiscoverDialog, View view) {
        ocInviteDiscoverDialog.dismiss();
        ocInviteDiscoverDialog.ocInviteDiscoverListener.confirm(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintLayout viewContainer_delegate$lambda$1(OcInviteDiscoverDialog ocInviteDiscoverDialog) {
        return (ConstraintLayout) ocInviteDiscoverDialog.findViewById(Ya.e.viewContainer);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ConstraintLayout viewContainer = getViewContainer();
        if (viewContainer != null) {
            viewContainer.setBackground(androidx.vectordrawable.graphics.drawable.q.a(getContext().getTheme(), getContext().getResources(), p025ba.d.core_oc_refer_earn_details_bg));
        }
        Button btnConfirm = getBtnConfirm();
        if (btnConfirm != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 10), btnConfirm);
        }
    }
}
