package com.palmpay.lib.webview.cache.service.base;

import N8.q0;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import com.google.firebase.messaging.Constants;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/InputStreamState;", "", "<init>", "()V", "toString", "", "OnStart", "Error", "Connected", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState$Connected;", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState$Error;", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState$OnStart;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class InputStreamState {

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J!\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR)\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/InputStreamState$Connected;", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState;", "code", "", "headers", "", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/io/InputStream;", "<init>", "(ILjava/util/Map;Ljava/io/InputStream;)V", "getCode", "()I", "getHeaders", "()Ljava/util/Map;", "getData", "()Ljava/io/InputStream;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Connected extends InputStreamState {
        private final int code;

        @Nullable
        private final InputStream data;

        @Nullable
        private final Map<String, List<String>> headers;

        /* JADX WARN: Multi-variable type inference failed */
        public Connected(int i7, @Nullable Map<String, ? extends List<String>> map, @Nullable InputStream inputStream) {
            super(null);
            this.code = i7;
            this.headers = map;
            this.data = inputStream;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Connected copy$default(Connected connected, int i7, Map map, InputStream inputStream, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = connected.code;
            }
            if ((i10 & 2) != 0) {
                map = connected.headers;
            }
            if ((i10 & 4) != 0) {
                inputStream = connected.data;
            }
            return connected.copy(i7, map, inputStream);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final Map<String, List<String>> component2() {
            return this.headers;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final InputStream getData() {
            return this.data;
        }

        @NotNull
        public final Connected copy(int code, @Nullable Map<String, ? extends List<String>> headers, @Nullable InputStream data) {
            return new Connected(code, headers, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Connected)) {
                return false;
            }
            Connected connected = (Connected) other;
            return this.code == connected.code && Intrinsics.c(this.headers, connected.headers) && Intrinsics.c(this.data, connected.data);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final InputStream getData() {
            return this.data;
        }

        @Nullable
        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            Map<String, List<String>> map = this.headers;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            InputStream inputStream = this.data;
            return iHashCode2 + (inputStream != null ? inputStream.hashCode() : 0);
        }

        @Override // com.palmpay.lib.webview.cache.service.base.InputStreamState
        @NotNull
        public String toString() {
            return "Connected(code=" + this.code + ", headers=" + this.headers + ", data=" + this.data + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/InputStreamState$Error;", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState;", "code", "", "throwable", "", "<init>", "(ILjava/lang/Throwable;)V", "getCode", "()I", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends InputStreamState {
        private final int code;

        @Nullable
        private final Throwable throwable;

        public Error(int i7, @Nullable Throwable th) {
            super(null);
            this.code = i7;
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, int i7, Throwable th, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = error.code;
            }
            if ((i10 & 2) != 0) {
                th = error.throwable;
            }
            return error.copy(i7, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public final Error copy(int code, @Nullable Throwable throwable) {
            return new Error(code, throwable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.code == error.code && Intrinsics.c(this.throwable, error.throwable);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            Throwable th = this.throwable;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // com.palmpay.lib.webview.cache.service.base.InputStreamState
        @NotNull
        public String toString() {
            return "Error(code=" + this.code + ", throwable=" + this.throwable + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/InputStreamState$OnStart;", "Lcom/palmpay/lib/webview/cache/service/base/InputStreamState;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStart extends InputStreamState {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnStart(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OnStart copy$default(OnStart onStart, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = onStart.url;
            }
            return onStart.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final OnStart copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OnStart(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStart) && Intrinsics.c(this.url, ((OnStart) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @Override // com.palmpay.lib.webview.cache.service.base.InputStreamState
        @NotNull
        public String toString() {
            return q0.k("OnStart(url=", this.url, ")");
        }
    }

    public /* synthetic */ InputStreamState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof Connected) {
            return F.c(((Connected) this).getCode(), "InputStreamState[Connected, code=", "]");
        }
        if (!(this instanceof Error)) {
            if (this instanceof OnStart) {
                return "InputStreamState[OnStart]";
            }
            throw new l();
        }
        Error error = (Error) this;
        int code = error.getCode();
        Throwable throwable = error.getThrowable();
        return "InputStreamState[Error, code=" + code + "] exception: " + (throwable != null ? throwable.getMessage() : null) + "]";
    }

    private InputStreamState() {
    }
}
