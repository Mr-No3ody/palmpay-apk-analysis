package com.palmpay.lib.bridgewrapper.page;

import android.content.ComponentCallbacks2;
import androidx.annotation.Keep;
import com.didi.drouter.annotation.Service;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/page/pullRefresh"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/page/PullRefreshBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/page/PullRefreshBridge$PullRefreshParam;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "PullRefreshParam", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PullRefreshBridge extends SyncBridge<PullRefreshParam> {

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/page/PullRefreshBridge$PullRefreshParam;", "", ViewProps.ENABLED, "", "(Z)V", "getEnabled", "()Z", "setEnabled", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PullRefreshParam {
        private boolean enabled;

        public PullRefreshParam(boolean z3) {
            this.enabled = z3;
        }

        public static /* synthetic */ PullRefreshParam copy$default(PullRefreshParam pullRefreshParam, boolean z3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z3 = pullRefreshParam.enabled;
            }
            return pullRefreshParam.copy(z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final PullRefreshParam copy(boolean enabled) {
            return new PullRefreshParam(enabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PullRefreshParam) && this.enabled == ((PullRefreshParam) other).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            boolean z3 = this.enabled;
            if (z3) {
                return 1;
            }
            return z3 ? 1 : 0;
        }

        public final void setEnabled(boolean z3) {
            this.enabled = z3;
        }

        @NotNull
        public String toString() {
            return "PullRefreshParam(enabled=" + this.enabled + ')';
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable PullRefreshParam params, @Nullable IBridgeCallback callback) {
        Unit unit;
        if (params != null) {
            if (getActivity() instanceof IPullRefreshListener) {
                ComponentCallbacks2 activity = getActivity();
                Intrinsics.f(activity, "null cannot be cast to non-null type com.palmpay.lib.bridgewrapper.page.IPullRefreshListener");
                ((IPullRefreshListener) activity).setPullToRefreshEnabled(params.getEnabled());
                handleSuccess();
            } else {
                handleIllegalArgument("web container should impl IPullRefreshListener");
            }
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
    }
}
