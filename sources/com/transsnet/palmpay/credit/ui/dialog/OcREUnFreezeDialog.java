package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.widget.Button;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcREUnFreezeDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/widget/Button;", "btnConfirm$delegate", "Lkotlin/Lazy;", "getBtnConfirm", "()Landroid/widget/Button;", "btnConfirm", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcREUnFreezeDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: btnConfirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnConfirm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcREUnFreezeDialog(@NotNull Context context) {
        super(context, Ya.f.cs_layout_re_freeze_dialog, com.transsnet.palmpay.custom_view.w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        this.btnConfirm = C2131j.b(new X6.c(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnConfirm_delegate$lambda$0(OcREUnFreezeDialog ocREUnFreezeDialog) {
        return (Button) ocREUnFreezeDialog.findViewById(Ya.e.btnConfirm);
    }

    private final Button getBtnConfirm() {
        return (Button) this.btnConfirm.getValue();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Button btnConfirm = getBtnConfirm();
        if (btnConfirm != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 11), btnConfirm);
        }
    }
}
