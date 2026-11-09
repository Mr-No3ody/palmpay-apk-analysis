package com.palmpay.lib.bridgewrapper.page;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.camera.video.u;
import com.didi.drouter.annotation.Service;
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
@Service(alias = {"/page/browser"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/page/BrowserBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/page/BrowserBridge$BrowserParam;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "BrowserParam", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BrowserBridge extends SyncBridge<BrowserParam> {

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/page/BrowserBridge$BrowserParam;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class BrowserParam {

        @Nullable
        private String url;

        public BrowserParam(@Nullable String str) {
            this.url = str;
        }

        public static /* synthetic */ BrowserParam copy$default(BrowserParam browserParam, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = browserParam.url;
            }
            return browserParam.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final BrowserParam copy(@Nullable String url) {
            return new BrowserParam(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BrowserParam) && Intrinsics.c(this.url, ((BrowserParam) other).url);
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        @NotNull
        public String toString() {
            return u.p(new StringBuilder("BrowserParam(url="), this.url, ')');
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable BrowserParam params, @Nullable IBridgeCallback callback) {
        Unit unit;
        Unit unit2;
        if (params != null) {
            String url = params.getUrl();
            if (url != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                Activity activity = getActivity();
                if (activity != null) {
                    activity.startActivity(intent);
                    unit2 = Unit.f38893a;
                } else {
                    unit2 = null;
                }
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                handleIllegalArgument("url is empty");
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
