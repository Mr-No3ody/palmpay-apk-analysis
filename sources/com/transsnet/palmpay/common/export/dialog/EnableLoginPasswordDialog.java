package com.transsnet.palmpay.common.export.dialog;

import N9.c;
import N9.d;
import Pa.n0;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.common.export.dialog.EnableLoginPasswordDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000eR(\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/common/export/dialog/EnableLoginPasswordDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/common/export/dialog/EnableLoginPasswordDialog$OnEnableTouchIdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnEnableTouchIdListener", "(Lcom/transsnet/palmpay/common/export/dialog/EnableLoginPasswordDialog$OnEnableTouchIdListener;)Lcom/transsnet/palmpay/common/export/dialog/EnableLoginPasswordDialog;", "show", "Lcom/transsnet/palmpay/common/export/dialog/EnableLoginPasswordDialog$OnEnableTouchIdListener;", "", "", "kotlin.jvm.PlatformType", "params", "Ljava/util/Map;", "OnEnableTouchIdListener", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnableLoginPasswordDialog extends b {

    @Nullable
    private OnEnableTouchIdListener listener;

    @NotNull
    private final Map<String, String> params;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/common/export/dialog/EnableLoginPasswordDialog$OnEnableTouchIdListener;", "", "onEnableClick", "", "v", "Landroid/view/View;", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnEnableTouchIdListener {
        void onEnableClick(@NotNull View v3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableLoginPasswordDialog(@NotNull Context context) {
        super(context, d.cm_dialog_enable_login_password);
        Intrinsics.checkNotNullParameter(context, "context");
        this.params = G.g(new Pair("memberid", C0.G.k()), new Pair("functionType", "4"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(EnableLoginPasswordDialog enableLoginPasswordDialog, View view) {
        n0.g().n("ResultPage_FunctionGuideLater_Click", enableLoginPasswordDialog.params);
        enableLoginPasswordDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(EnableLoginPasswordDialog enableLoginPasswordDialog, View view) {
        n0.g().n("ResultPage_FunctionGuideEnable_Click", enableLoginPasswordDialog.params);
        OnEnableTouchIdListener onEnableTouchIdListener = enableLoginPasswordDialog.listener;
        if (onEnableTouchIdListener != null) {
            Intrinsics.e(view);
            onEnableTouchIdListener.onEnableClick(view);
        }
        enableLoginPasswordDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        showAtBottom(getWindow());
        final int i7 = 0;
        findViewById(c.btn_later).setOnClickListener(new View.OnClickListener(this) { // from class: P9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableLoginPasswordDialog f7002b;

            {
                this.f7002b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        EnableLoginPasswordDialog.initViews$lambda$0(this.f7002b, view);
                        break;
                    default:
                        EnableLoginPasswordDialog.initViews$lambda$1(this.f7002b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        findViewById(c.btn_enbale).setOnClickListener(new View.OnClickListener(this) { // from class: P9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableLoginPasswordDialog f7002b;

            {
                this.f7002b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        EnableLoginPasswordDialog.initViews$lambda$0(this.f7002b, view);
                        break;
                    default:
                        EnableLoginPasswordDialog.initViews$lambda$1(this.f7002b, view);
                        break;
                }
            }
        });
    }

    @NotNull
    public final EnableLoginPasswordDialog setOnEnableTouchIdListener(@NotNull OnEnableTouchIdListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        n0.g().w("ResultPage_FunctionGuide_View", this.params);
        super.show();
    }
}
