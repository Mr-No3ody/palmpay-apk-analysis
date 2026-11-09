package com.palmpay.lib.webview.cache.service.base;

import C0.G;
import N8.q0;
import androidx.annotation.Keep;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/NetState;", "T", "", "<init>", "()V", "toString", "", "OnStart", "OnProgress", "Redirect", "Error", "Complete", "Lcom/palmpay/lib/webview/cache/service/base/NetState$Complete;", "Lcom/palmpay/lib/webview/cache/service/base/NetState$Error;", "Lcom/palmpay/lib/webview/cache/service/base/NetState$OnProgress;", "Lcom/palmpay/lib/webview/cache/service/base/NetState$OnStart;", "Lcom/palmpay/lib/webview/cache/service/base/NetState$Redirect;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NetState<T> {

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J!\u0010\u0018\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\u000e\u0010\u001a\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0015JT\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0005\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/NetState$Complete;", "T", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "code", "", "headers", "", "", "", "length", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ILjava/util/Map;JLjava/lang/Object;)V", "getCode", "()I", "getHeaders", "()Ljava/util/Map;", "getLength", "()J", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(ILjava/util/Map;JLjava/lang/Object;)Lcom/palmpay/lib/webview/cache/service/base/NetState$Complete;", "equals", "", "other", "", "hashCode", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Complete<T> extends NetState<T> {
        private final int code;
        private final T data;

        @Nullable
        private final Map<String, List<String>> headers;
        private final long length;

        /* JADX WARN: Multi-variable type inference failed */
        public Complete(int i7, @Nullable Map<String, ? extends List<String>> map, long j6, T t) {
            super(null);
            this.code = i7;
            this.headers = map;
            this.length = j6;
            this.data = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete copy$default(Complete complete, int i7, Map map, long j6, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                i7 = complete.code;
            }
            if ((i10 & 2) != 0) {
                map = complete.headers;
            }
            if ((i10 & 4) != 0) {
                j6 = complete.length;
            }
            if ((i10 & 8) != 0) {
                obj = complete.data;
            }
            Object obj3 = obj;
            return complete.copy(i7, map, j6, obj3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final Map<String, List<String>> component2() {
            return this.headers;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getLength() {
            return this.length;
        }

        public final T component4() {
            return this.data;
        }

        @NotNull
        public final Complete<T> copy(int code, @Nullable Map<String, ? extends List<String>> headers, long length, T data) {
            return new Complete<>(code, headers, length, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return this.code == complete.code && Intrinsics.c(this.headers, complete.headers) && this.length == complete.length && Intrinsics.c(this.data, complete.data);
        }

        public final int getCode() {
            return this.code;
        }

        public final T getData() {
            return this.data;
        }

        @Nullable
        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public final long getLength() {
            return this.length;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            Map<String, List<String>> map = this.headers;
            int iB = q0.b((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.length);
            T t = this.data;
            return iB + (t != null ? t.hashCode() : 0);
        }

        @Override // com.palmpay.lib.webview.cache.service.base.NetState
        @NotNull
        public String toString() {
            return "Complete(code=" + this.code + ", headers=" + this.headers + ", length=" + this.length + ", data=" + this.data + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/NetState$Error;", "T", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "code", "", "throwable", "", "<init>", "(ILjava/lang/Throwable;)V", "getCode", "()I", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error<T> extends NetState<T> {
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
        public final Error<T> copy(int code, @Nullable Throwable throwable) {
            return new Error<>(code, throwable);
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

        @Override // com.palmpay.lib.webview.cache.service.base.NetState
        @NotNull
        public String toString() {
            return "Error(code=" + this.code + ", throwable=" + this.throwable + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/NetState$OnProgress;", "T", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", ReactProgressBarViewManager.PROP_PROGRESS, "", "max", "<init>", "(JJ)V", "getProgress", "()J", "getMax", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProgress<T> extends NetState<T> {
        private final long max;
        private final long progress;

        public OnProgress(long j6, long j10) {
            super(null);
            this.progress = j6;
            this.max = j10;
        }

        public static /* synthetic */ OnProgress copy$default(OnProgress onProgress, long j6, long j10, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j6 = onProgress.progress;
            }
            if ((i7 & 2) != 0) {
                j10 = onProgress.max;
            }
            return onProgress.copy(j6, j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getMax() {
            return this.max;
        }

        @NotNull
        public final OnProgress<T> copy(long progress, long max) {
            return new OnProgress<>(progress, max);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProgress)) {
                return false;
            }
            OnProgress onProgress = (OnProgress) other;
            return this.progress == onProgress.progress && this.max == onProgress.max;
        }

        public final long getMax() {
            return this.max;
        }

        public final long getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return Long.hashCode(this.max) + (Long.hashCode(this.progress) * 31);
        }

        @Override // com.palmpay.lib.webview.cache.service.base.NetState
        @NotNull
        public String toString() {
            long j6 = this.progress;
            return q0.n(u.r(j6, "OnProgress(progress=", ", max="), ")", this.max);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/NetState$OnStart;", "T", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStart<T> extends NetState<T> {

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
        public final OnStart<T> copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OnStart<>(url);
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

        @Override // com.palmpay.lib.webview.cache.service.base.NetState
        @NotNull
        public String toString() {
            return q0.k("OnStart(url=", this.url, ")");
        }
    }

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012 \u0010\u0005\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J#\u0010\u0013\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u0005\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/NetState$Redirect;", "T", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "code", "", "headers", "", "", "", FirebaseAnalytics.Param.LOCATION, "<init>", "(ILjava/util/Map;Ljava/lang/String;)V", "getCode", "()I", "getHeaders", "()Ljava/util/Map;", "getLocation", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Redirect<T> extends NetState<T> {
        private final int code;

        @Nullable
        private final Map<String, List<String>> headers;

        @Nullable
        private final String location;

        /* JADX WARN: Multi-variable type inference failed */
        public Redirect(int i7, @Nullable Map<String, ? extends List<String>> map, @Nullable String str) {
            super(null);
            this.code = i7;
            this.headers = map;
            this.location = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Redirect copy$default(Redirect redirect, int i7, Map map, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = redirect.code;
            }
            if ((i10 & 2) != 0) {
                map = redirect.headers;
            }
            if ((i10 & 4) != 0) {
                str = redirect.location;
            }
            return redirect.copy(i7, map, str);
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
        public final String getLocation() {
            return this.location;
        }

        @NotNull
        public final Redirect<T> copy(int code, @Nullable Map<String, ? extends List<String>> headers, @Nullable String location) {
            return new Redirect<>(code, headers, location);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) other;
            return this.code == redirect.code && Intrinsics.c(this.headers, redirect.headers) && Intrinsics.c(this.location, redirect.location);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        @Nullable
        public final String getLocation() {
            return this.location;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            Map<String, List<String>> map = this.headers;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.location;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // com.palmpay.lib.webview.cache.service.base.NetState
        @NotNull
        public String toString() {
            int i7 = this.code;
            Map<String, List<String>> map = this.headers;
            String str = this.location;
            StringBuilder sb2 = new StringBuilder("Redirect(code=");
            sb2.append(i7);
            sb2.append(", headers=");
            sb2.append(map);
            sb2.append(", location=");
            return G.r(sb2, str, ")");
        }
    }

    public /* synthetic */ NetState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof OnStart) {
            return G.o("NetResult[OnStart] url: ", ((OnStart) this).getUrl());
        }
        if (this instanceof OnProgress) {
            OnProgress onProgress = (OnProgress) this;
            long progress = onProgress.getProgress();
            long max = onProgress.getMax();
            StringBuilder sbR = u.r(progress, "NetResult[OnProgress] ", "/");
            sbR.append(max);
            return sbR.toString();
        }
        if (this instanceof Complete) {
            Complete complete = (Complete) this;
            return "NetResult[Complete, code=" + complete.getCode() + "] data: " + complete.getData();
        }
        if (!(this instanceof Error)) {
            if (!(this instanceof Redirect)) {
                throw new l();
            }
            Redirect redirect = (Redirect) this;
            return d.j("NetResult[Redirect, code=", redirect.getCode(), "] location: ", redirect.getLocation());
        }
        Error error = (Error) this;
        int code = error.getCode();
        Throwable throwable = error.getThrowable();
        return "NetResult[Error, code=" + code + "] exception: " + (throwable != null ? throwable.getMessage() : null) + "]";
    }

    private NetState() {
    }
}
