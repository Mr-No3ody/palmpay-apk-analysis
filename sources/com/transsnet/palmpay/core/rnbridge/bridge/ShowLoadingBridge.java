package com.transsnet.palmpay.core.rnbridge.bridge;

import Da.f;
import N8.q0;
import android.app.Activity;
import androidx.annotation.Keep;
import androidx.lifecycle.LifecycleOwner;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.callback.ShowDialogCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/loadingDialog/show"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ShowLoadingBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/rnbridge/bridge/ShowLoadingBridge$LoadingParam;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "LoadingParam", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShowLoadingBridge extends SyncBridge<LoadingParam> {

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ShowLoadingBridge$LoadingParam;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadingParam {

        @NotNull
        private final String message;

        public LoadingParam(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ LoadingParam copy$default(LoadingParam loadingParam, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = loadingParam.message;
            }
            return loadingParam.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final LoadingParam copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new LoadingParam(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingParam) && Intrinsics.c(this.message, ((LoadingParam) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return q0.k("LoadingParam(message=", this.message, ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDestroy$lambda$3$lambda$2(Activity activity) {
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).showLoadingDialog(false);
        } else if (activity instanceof ShowDialogCallback) {
            ((ShowDialogCallback) activity).showLoadingDialog(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onHandle$lambda$1$lambda$0(Activity activity) {
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).showLoadingDialog(true);
        } else if (activity instanceof ShowDialogCallback) {
            ((ShowDialogCallback) activity).showLoadingDialog(true);
        }
    }

    @Override // com.palmpay.lib.bridge.SyncBridge, com.palmpay.lib.bridge.BaseBridge, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new f(activity, 4));
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable LoadingParam params, @Nullable IBridgeCallback callback) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new f(activity, 3));
        }
    }
}
