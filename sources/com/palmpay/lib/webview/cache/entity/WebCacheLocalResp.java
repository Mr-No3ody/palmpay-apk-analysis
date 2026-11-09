package com.palmpay.lib.webview.cache.entity;

import C0.G;
import androidx.annotation.Keep;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.maps.android.BuildConfig;
import com.palmpay.lib.webview.cache.util.IUsefulCheck;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006J\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0019\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\"\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00062"}, d2 = {"Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "Lcom/palmpay/lib/webview/cache/util/IUsefulCheck;", "url", "", "type", "header", "", "filename", "fileStream", "Ljava/io/InputStream;", "needSafeChangeHeader", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/io/InputStream;Z)V", "getUrl", "()Ljava/lang/String;", "getType", "getFilename", "setFilename", "(Ljava/lang/String;)V", "getFileStream", "()Ljava/io/InputStream;", "setFileStream", "(Ljava/io/InputStream;)V", "getNeedSafeChangeHeader", "()Z", "setHeader", "", "getHeader", "safeChangeHeader", "toUpperCamelCase", ReactTextInputShadowNode.PROP_TEXT, "delimiter", "", "useful", "toString", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheLocalResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheLocalResp.kt\ncom/palmpay/lib/webview/cache/entity/WebCacheLocalResp\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,268:1\n457#2:269\n403#2:270\n1238#3,2:271\n1241#3:274\n1#4:273\n215#5,2:275\n*S KotlinDebug\n*F\n+ 1 WebCacheLocalResp.kt\ncom/palmpay/lib/webview/cache/entity/WebCacheLocalResp\n*L\n49#1:269\n49#1:270\n49#1:271,2\n49#1:274\n97#1:275,2\n*E\n"})
public final /* data */ class WebCacheLocalResp implements IUsefulCheck {

    @Nullable
    private transient InputStream fileStream;

    @Nullable
    private String filename;

    @JvmField
    @Nullable
    public Map<String, String> header;
    private final transient boolean needSafeChangeHeader;

    @NotNull
    private final String type;

    @NotNull
    private final String url;

    public WebCacheLocalResp(@NotNull String url, @NotNull String type, @Nullable Map<String, String> map, @Nullable String str, @Nullable InputStream inputStream, boolean z3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.url = url;
        this.type = type;
        this.header = map;
        this.filename = str;
        this.fileStream = inputStream;
        this.needSafeChangeHeader = z3;
        if (z3) {
            safeChangeHeader();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebCacheLocalResp copy$default(WebCacheLocalResp webCacheLocalResp, String str, String str2, Map map, String str3, InputStream inputStream, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = webCacheLocalResp.url;
        }
        if ((i7 & 2) != 0) {
            str2 = webCacheLocalResp.type;
        }
        if ((i7 & 4) != 0) {
            map = webCacheLocalResp.header;
        }
        if ((i7 & 8) != 0) {
            str3 = webCacheLocalResp.filename;
        }
        if ((i7 & 16) != 0) {
            inputStream = webCacheLocalResp.fileStream;
        }
        if ((i7 & 32) != 0) {
            z3 = webCacheLocalResp.needSafeChangeHeader;
        }
        InputStream inputStream2 = inputStream;
        boolean z8 = z3;
        return webCacheLocalResp.copy(str, str2, map, str3, inputStream2, z8);
    }

    private final void safeChangeHeader() {
        Map<String, String> map = this.header;
        LinkedHashMap linkedHashMap = null;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.a(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                linkedHashMap2.put(str != null ? toUpperCamelCase(str, '-') : null, entry.getValue());
            }
            linkedHashMap = linkedHashMap2;
        }
        this.header = K.c(linkedHashMap);
    }

    private final String toUpperCamelCase(String text, char delimiter) {
        StringBuilder sb2 = new StringBuilder();
        int length = text.length();
        boolean z3 = true;
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = text.charAt(i7);
            if (cCharAt == delimiter) {
                sb2.append(cCharAt);
                z3 = true;
            } else if (z3) {
                sb2.append(Character.toUpperCase(cCharAt));
                z3 = false;
            } else {
                sb2.append(Character.toLowerCase(cCharAt));
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.header;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InputStream getFileStream() {
        return this.fileStream;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNeedSafeChangeHeader() {
        return this.needSafeChangeHeader;
    }

    @NotNull
    public final WebCacheLocalResp copy(@NotNull String url, @NotNull String type, @Nullable Map<String, String> header, @Nullable String filename, @Nullable InputStream fileStream, boolean needSafeChangeHeader) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        return new WebCacheLocalResp(url, type, header, filename, fileStream, needSafeChangeHeader);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebCacheLocalResp)) {
            return false;
        }
        WebCacheLocalResp webCacheLocalResp = (WebCacheLocalResp) other;
        return Intrinsics.c(this.url, webCacheLocalResp.url) && Intrinsics.c(this.type, webCacheLocalResp.type) && Intrinsics.c(this.header, webCacheLocalResp.header) && Intrinsics.c(this.filename, webCacheLocalResp.filename) && Intrinsics.c(this.fileStream, webCacheLocalResp.fileStream) && this.needSafeChangeHeader == webCacheLocalResp.needSafeChangeHeader;
    }

    @Nullable
    public final InputStream getFileStream() {
        return this.fileStream;
    }

    @Nullable
    public final String getFilename() {
        return this.filename;
    }

    @Nullable
    public final Map<String, String> getHeader() {
        return this.header;
    }

    public final boolean getNeedSafeChangeHeader() {
        return this.needSafeChangeHeader;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = G.c(this.url.hashCode() * 31, 31, this.type);
        Map<String, String> map = this.header;
        int iHashCode = (iC + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.filename;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InputStream inputStream = this.fileStream;
        return Boolean.hashCode(this.needSafeChangeHeader) + ((iHashCode2 + (inputStream != null ? inputStream.hashCode() : 0)) * 31);
    }

    public final void setFileStream(@Nullable InputStream inputStream) {
        this.fileStream = inputStream;
    }

    public final void setFilename(@Nullable String str) {
        this.filename = str;
    }

    public final void setHeader(@Nullable Map<String, String> header) {
        this.header = header;
        if (this.needSafeChangeHeader) {
            safeChangeHeader();
        }
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", this.url);
        jSONObject.put("type", this.type);
        String str = this.filename;
        if (str != null) {
            jSONObject.put("filename", str);
        }
        InputStream inputStream = this.fileStream;
        if (inputStream != null) {
            jSONObject.put("fileStream", inputStream);
        }
        Map<String, String> map = this.header;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    key = BuildConfig.TRAVIS;
                }
                jSONObject2.put(key, entry.getValue());
            }
            jSONObject.put("header", jSONObject2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        String string = toJson().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.palmpay.lib.webview.cache.util.IUsefulCheck
    public boolean useful() {
        String str = this.filename;
        return ((str == null || str.length() == 0) && this.fileStream == null) ? false : true;
    }

    public /* synthetic */ WebCacheLocalResp(String str, String str2, Map map, String str3, InputStream inputStream, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : map, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : inputStream, (i7 & 32) != 0 ? true : z3);
    }
}
