package com.transsnet.palmpay.core.rnbridge.bridge;

import N8.q0;
import android.app.Activity;
import androidx.annotation.Keep;
import androidx.lifecycle.LifecycleOwner;
import com.didi.drouter.annotation.Service;
import com.flexibank.sdk.g;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/richTextAlertView/show"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ShowRichTextDialogBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/rnbridge/bridge/ShowRichTextDialogBridge$DialogParam;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "DialogParam", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShowRichTextDialogBridge extends SyncBridge<DialogParam> {

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ShowRichTextDialogBridge$DialogParam;", "", "addition", "", "<init>", "(Ljava/lang/String;)V", "getAddition", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DialogParam {

        @NotNull
        private final String addition;

        public DialogParam(@NotNull String addition) {
            Intrinsics.checkNotNullParameter(addition, "addition");
            this.addition = addition;
        }

        public static /* synthetic */ DialogParam copy$default(DialogParam dialogParam, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = dialogParam.addition;
            }
            return dialogParam.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAddition() {
            return this.addition;
        }

        @NotNull
        public final DialogParam copy(@NotNull String addition) {
            Intrinsics.checkNotNullParameter(addition, "addition");
            return new DialogParam(addition);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DialogParam) && Intrinsics.c(this.addition, ((DialogParam) other).addition);
        }

        @NotNull
        public final String getAddition() {
            return this.addition;
        }

        public int hashCode() {
            return this.addition.hashCode();
        }

        @NotNull
        public String toString() {
            return q0.k("DialogParam(addition=", this.addition, ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$1$lambda$0(Activity activity, DialogParam dialogParam) {
        String addition;
        if (dialogParam == null || (addition = dialogParam.getAddition()) == null) {
            addition = "";
        }
        h.v(activity, addition, null, null, 14);
    }

    @Override // com.palmpay.lib.bridge.SyncBridge, com.palmpay.lib.bridge.BaseBridge, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable DialogParam params, @Nullable IBridgeCallback callback) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new g(16, activity, params));
        }
    }
}
