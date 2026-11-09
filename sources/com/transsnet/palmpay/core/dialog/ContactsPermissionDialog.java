package com.transsnet.palmpay.core.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.core.dialog.ContactsPermissionDialog;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/ContactsPermissionDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/core/dialog/ContactsPermissionDialog$ContactsPermissionCallBack;", "mCallback", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/core/dialog/ContactsPermissionDialog$ContactsPermissionCallBack;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/core/dialog/ContactsPermissionDialog$ContactsPermissionCallBack;", "getMCallback", "()Lcom/transsnet/palmpay/core/dialog/ContactsPermissionDialog$ContactsPermissionCallBack;", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "getListener", "()Landroid/view/View$OnClickListener;", "setListener", "(Landroid/view/View$OnClickListener;)V", "ContactsPermissionCallBack", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactsPermissionDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private View.OnClickListener listener;

    @NotNull
    private final ContactsPermissionCallBack mCallback;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/ContactsPermissionDialog$ContactsPermissionCallBack;", "", "confirm", "", "close", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ContactsPermissionCallBack {
        void close();

        void confirm();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsPermissionDialog(@NotNull Context context, @NotNull ContactsPermissionCallBack mCallback) {
        super(context, p025ba.g.core_contacts_permission_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mCallback, "mCallback");
        this.mCallback = mCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(ContactsPermissionDialog contactsPermissionDialog, View view) {
        contactsPermissionDialog.mCallback.confirm();
        contactsPermissionDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(ContactsPermissionDialog contactsPermissionDialog, View view) {
        contactsPermissionDialog.mCallback.close();
        contactsPermissionDialog.dismiss();
    }

    @Nullable
    public final View.OnClickListener getListener() {
        return this.listener;
    }

    @NotNull
    public final ContactsPermissionCallBack getMCallback() {
        return this.mCallback;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        final int i7 = 0;
        findViewById(p025ba.e.btnOk).setOnClickListener(new View.OnClickListener(this) { // from class: ma.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsPermissionDialog f39597b;

            {
                this.f39597b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ContactsPermissionDialog.initViews$lambda$0(this.f39597b, view);
                        break;
                    default:
                        ContactsPermissionDialog.initViews$lambda$1(this.f39597b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        findViewById(p025ba.e.ivClose).setOnClickListener(new View.OnClickListener(this) { // from class: ma.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsPermissionDialog f39597b;

            {
                this.f39597b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ContactsPermissionDialog.initViews$lambda$0(this.f39597b, view);
                        break;
                    default:
                        ContactsPermissionDialog.initViews$lambda$1(this.f39597b, view);
                        break;
                }
            }
        });
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    public final void setListener(@Nullable View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }
}
