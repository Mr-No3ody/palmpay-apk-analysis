package com.transsnet.palmpay.contacts.ui.dialog;

import R9.d;
import R9.e;
import Uc.I0;
import android.content.Context;
import android.view.View;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/dialog/AddLinkFaveNotPPUserDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/contacts/ui/dialog/AddLinkFaveNotPPUserDialog$ConfirmInterface;", "confirmInterface", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/contacts/ui/dialog/AddLinkFaveNotPPUserDialog$ConfirmInterface;)V", "", "initViews", "()V", "mConfirmInterface", "Lcom/transsnet/palmpay/contacts/ui/dialog/AddLinkFaveNotPPUserDialog$ConfirmInterface;", "ConfirmInterface", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddLinkFaveNotPPUserDialog extends b {

    @NotNull
    private ConfirmInterface mConfirmInterface;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/dialog/AddLinkFaveNotPPUserDialog$ConfirmInterface;", "", "confirm", "", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConfirmInterface {
        void confirm();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddLinkFaveNotPPUserDialog(@NotNull Context context, @NotNull ConfirmInterface confirmInterface) {
        super(context, e.ct_dialog_manage_linked_fave_repeat, w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmInterface, "confirmInterface");
        this.mConfirmInterface = confirmInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(AddLinkFaveNotPPUserDialog addLinkFaveNotPPUserDialog, View view) {
        int id2 = view.getId();
        if (id2 == d.ivClose || id2 == d.tvCancel) {
            addLinkFaveNotPPUserDialog.dismiss();
        } else if (id2 == d.tvOk) {
            ConfirmInterface confirmInterface = addLinkFaveNotPPUserDialog.mConfirmInterface;
            if (confirmInterface != null) {
                confirmInterface.confirm();
            }
            addLinkFaveNotPPUserDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        h.q(new I0(this, 19), findViewById(d.ivClose), findViewById(d.tvOk), findViewById(d.tvCancel));
    }
}
