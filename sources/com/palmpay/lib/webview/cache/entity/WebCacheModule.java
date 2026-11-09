package com.palmpay.lib.webview.cache.entity;

import Pf.d;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J3\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b¨\u0006'"}, d2 = {"Lcom/palmpay/lib/webview/cache/entity/WebCacheModule;", "", "configId", "", "url", "urlType", "", "createTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;SJ)V", "getConfigId", "()Ljava/lang/String;", "setConfigId", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getUrlType", "()S", "setUrlType", "(S)V", "getCreateTime", "()J", "setCreateTime", "(J)V", "isRegexpUrl", "", "()Z", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WebCacheModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final short URL_TYPE_NORMAL = 1;
    public static final short URL_TYPE_REGEXP = 2;

    @NotNull
    private String configId;
    private long createTime;

    @Nullable
    private String url;
    private short urlType;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/palmpay/lib/webview/cache/entity/WebCacheModule$Companion;", "", "<init>", "()V", "URL_TYPE_NORMAL", "", "URL_TYPE_REGEXP", "generateRandomId", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String generateRandomId() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            d.f7329a.getClass();
            return jCurrentTimeMillis + "-" + d.f7330b.d(100, 1000);
        }

        private Companion() {
        }
    }

    public WebCacheModule() {
        this(null, null, (short) 0, 0L, 15, null);
    }

    public static /* synthetic */ WebCacheModule copy$default(WebCacheModule webCacheModule, String str, String str2, short s3, long j6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = webCacheModule.configId;
        }
        if ((i7 & 2) != 0) {
            str2 = webCacheModule.url;
        }
        if ((i7 & 4) != 0) {
            s3 = webCacheModule.urlType;
        }
        if ((i7 & 8) != 0) {
            j6 = webCacheModule.createTime;
        }
        short s8 = s3;
        return webCacheModule.copy(str, str2, s8, j6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getUrlType() {
        return this.urlType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final WebCacheModule copy(@NotNull String configId, @Nullable String url, short urlType, long createTime) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        return new WebCacheModule(configId, url, urlType, createTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof WebCacheModule)) {
            return false;
        }
        return Intrinsics.c(this.configId, ((WebCacheModule) other).configId);
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final short getUrlType() {
        return this.urlType;
    }

    public int hashCode() {
        return this.configId.hashCode();
    }

    public final boolean isRegexpUrl() {
        return 2 == this.urlType && !TextUtils.isEmpty(this.url);
    }

    public final void setConfigId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.configId = str;
    }

    public final void setCreateTime(long j6) {
        this.createTime = j6;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setUrlType(short s3) {
        this.urlType = s3;
    }

    @NotNull
    public String toString() {
        String str = this.configId;
        String str2 = this.url;
        short s3 = this.urlType;
        long j6 = this.createTime;
        StringBuilder sbF = F.f("WebCacheModule(configId=", str, ", url=", str2, ", urlType=");
        sbF.append((int) s3);
        sbF.append(", createTime=");
        sbF.append(j6);
        sbF.append(")");
        return sbF.toString();
    }

    public WebCacheModule(@NotNull String configId, @Nullable String str, short s3, long j6) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        this.configId = configId;
        this.url = str;
        this.urlType = s3;
        this.createTime = j6;
    }

    public /* synthetic */ WebCacheModule(String str, String str2, short s3, long j6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? INSTANCE.generateRandomId() : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? (short) 1 : s3, (i7 & 8) != 0 ? System.currentTimeMillis() : j6);
    }
}
