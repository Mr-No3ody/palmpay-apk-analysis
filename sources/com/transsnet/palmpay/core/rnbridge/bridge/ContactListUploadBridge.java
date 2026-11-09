package com.transsnet.palmpay.core.rnbridge.bridge;

import Ga.k;
import Pa.i0;
import android.app.Activity;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.common.export.bean.req.SystemContactReq;
import com.transsnet.palmpay.core.activityresult.IActivityPermissionResult;
import com.transsnet.palmpay.core.callback.Argument1Callback;
import com.transsnet.palmpay.core.dialog.ContactsPermissionDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/contacts/upload"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ContactListUploadBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/common/export/bean/req/SystemContactReq;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lca/a;", "appDetailsSettingsLauncher", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "showRequestPermissionDialog", "(Landroid/app/Activity;Lca/a;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "req", "onHandle", "(Lcom/transsnet/palmpay/common/export/bean/req/SystemContactReq;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContactListUploadBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListUploadBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/ContactListUploadBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class ContactListUploadBridge extends SyncBridge<SystemContactReq> {

    @NotNull
    public static final String TAG = "ContactListUploadBridge";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$4$lambda$1(Activity activity, ContactListUploadBridge contactListUploadBridge) {
        if (!l.o(activity, "android.permission.READ_CONTACTS")) {
            contactListUploadBridge.handleReject("Permission Reject");
        } else if (k.f3214b.upload()) {
            contactListUploadBridge.handleSuccess();
        } else {
            contactListUploadBridge.handleReject("Upload Failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$4$lambda$2(ContactListUploadBridge contactListUploadBridge, Activity activity, IBridgeCallback iBridgeCallback, p038ca.a aVar) {
        if (aVar != null) {
            contactListUploadBridge.showRequestPermissionDialog(activity, aVar, iBridgeCallback);
        }
        contactListUploadBridge.handleReject("Permission Reject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$4$lambda$3(ContactListUploadBridge contactListUploadBridge, Activity activity, IBridgeCallback iBridgeCallback, p038ca.a aVar) {
        if (aVar != null) {
            contactListUploadBridge.showRequestPermissionDialog(activity, aVar, iBridgeCallback);
        }
        contactListUploadBridge.handleReject("Permission Reject");
    }

    public final void showRequestPermissionDialog(@NotNull Activity activity, @NotNull final p038ca.a appDetailsSettingsLauncher, @Nullable IBridgeCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appDetailsSettingsLauncher, "appDetailsSettingsLauncher");
        ContactsPermissionDialog contactsPermissionDialog = new ContactsPermissionDialog(activity, new ContactsPermissionDialog.ContactsPermissionCallBack() { // from class: com.transsnet.palmpay.core.rnbridge.bridge.ContactListUploadBridge$showRequestPermissionDialog$permissionDialog$1
            @Override // com.transsnet.palmpay.core.dialog.ContactsPermissionDialog.ContactsPermissionCallBack
            public void close() {
                this.handleReject("Permission Reject");
            }

            @Override // com.transsnet.palmpay.core.dialog.ContactsPermissionDialog.ContactsPermissionCallBack
            public void confirm() {
                p038ca.a.f(appDetailsSettingsLauncher);
            }
        });
        if (i0.W(activity)) {
            contactsPermissionDialog.setCanceledOnTouchOutside(false);
            contactsPermissionDialog.show();
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable SystemContactReq req, @Nullable final IBridgeCallback callback) {
        final Activity activity = getActivity();
        if (activity != null) {
            if (!(activity instanceof IActivityPermissionResult)) {
                activity = null;
            }
            if (activity != null) {
                final int i7 = 0;
                final int i10 = 1;
                ((IActivityPermissionResult) activity).getF28605j().f("android.permission.READ_CONTACTS", new b(3, activity, this), new Argument1Callback(this) { // from class: com.transsnet.palmpay.core.rnbridge.bridge.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ContactListUploadBridge f27398b;

                    {
                        this.f27398b = this;
                    }

                    @Override // com.transsnet.palmpay.core.callback.Argument1Callback
                    public final void invoke(Object obj) {
                        p038ca.a aVar = (p038ca.a) obj;
                        switch (i7) {
                            case 0:
                                ContactListUploadBridge.onHandle$lambda$4$lambda$2(this.f27398b, activity, callback, aVar);
                                break;
                            default:
                                ContactListUploadBridge.onHandle$lambda$4$lambda$3(this.f27398b, activity, callback, aVar);
                                break;
                        }
                    }
                }, new Argument1Callback(this) { // from class: com.transsnet.palmpay.core.rnbridge.bridge.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ContactListUploadBridge f27398b;

                    {
                        this.f27398b = this;
                    }

                    @Override // com.transsnet.palmpay.core.callback.Argument1Callback
                    public final void invoke(Object obj) {
                        p038ca.a aVar = (p038ca.a) obj;
                        switch (i10) {
                            case 0:
                                ContactListUploadBridge.onHandle$lambda$4$lambda$2(this.f27398b, activity, callback, aVar);
                                break;
                            default:
                                ContactListUploadBridge.onHandle$lambda$4$lambda$3(this.f27398b, activity, callback, aVar);
                                break;
                        }
                    }
                });
            }
        }
    }
}
