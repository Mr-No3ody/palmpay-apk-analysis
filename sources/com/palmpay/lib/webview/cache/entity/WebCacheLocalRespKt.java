package com.palmpay.lib.webview.cache.entity;

import N8.q0;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import com.google.common.net.HttpHeaders;
import com.luck.picture.lib.config.SelectMimeType;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.utils.StreamUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u001a\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u000b"}, d2 = {"createResponse", "Landroid/webkit/WebResourceResponse;", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "fileDirPath", "", "createWebResponse", "Lcom/palmpay/lib/webview/container/fast/WebResource;", "jsonParse", "jsonString", "jsonArrayParse", "", "lib_webview_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheLocalResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheLocalResp.kt\ncom/palmpay/lib/webview/cache/entity/WebCacheLocalRespKt\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,268:1\n9#2,4:269\n9#2,4:273\n9#2,4:279\n9#2,4:283\n32#3,2:277\n*S KotlinDebug\n*F\n+ 1 WebCacheLocalResp.kt\ncom/palmpay/lib/webview/cache/entity/WebCacheLocalRespKt\n*L\n166#1:269,4\n202#1:273,4\n240#1:279,4\n264#1:283,4\n232#1:277,2\n*E\n"})
public final class WebCacheLocalRespKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    @Keep
    @Nullable
    public static final WebResourceResponse createResponse(@NotNull WebCacheLocalResp webCacheLocalResp, @Nullable String str) {
        String strK;
        InputStream fileStream;
        WebCacheLog webCacheLog;
        String filename;
        Intrinsics.checkNotNullParameter(webCacheLocalResp, "<this>");
        Map<String, String> map = webCacheLocalResp.header;
        String str2 = map != null ? map.get(HttpHeaders.CONTENT_TYPE) : null;
        if (str2 != null && !StringsKt.F(str2)) {
            List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{";"}, false, 0, 6, null);
            List list = listSplit$default;
            if (list != null && !list.isEmpty() && listSplit$default.size() > 1) {
                String str3 = (String) listSplit$default.get(0);
                strK = StringsKt.A((CharSequence) listSplit$default.get(1), "charset=", false) ? y.k(StringsKt.V((String) listSplit$default.get(1)).toString(), "charset=", "") : null;
                str2 = str3;
            }
            fileStream = webCacheLocalResp.getFileStream();
            if (fileStream == null) {
                if (webCacheLocalResp.getFilename() != null) {
                    filename = null;
                } else if (str != null || (filename = q0.y(str, File.separator, webCacheLocalResp.getFilename())) == null) {
                    filename = webCacheLocalResp.getFilename();
                }
                if (filename != null || StringsKt.F(filename)) {
                    fileStream = null;
                } else {
                    File file = new File(filename);
                    if (file.exists() && file.isFile()) {
                        fileStream = new FileInputStream(filename);
                    } else {
                        fileStream = null;
                    }
                }
            }
            if (fileStream == null) {
                WebResourceResponse webResourceResponse = new WebResourceResponse(str2, strK, fileStream);
                webResourceResponse.setResponseHeaders(webCacheLocalResp.header);
                return webResourceResponse;
            }
            webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e("WebCacheLocalResp", "Error in creating response from WebCacheLocalResp, filePath or inputStream cannot be null.");
            }
            return null;
        }
        String type = webCacheLocalResp.getType();
        switch (type.hashCode()) {
            case -907685685:
                if (!type.equals("script")) {
                    str2 = "text/html";
                } else {
                    str2 = "text/txt";
                }
                break;
            case 3213227:
                type.equals("html");
                str2 = "text/html";
                break;
            case 100313435:
                if (!type.equals("image")) {
                    str2 = "text/html";
                } else {
                    str2 = SelectMimeType.SYSTEM_IMAGE;
                }
                break;
            case 158213710:
                if (!type.equals("stylesheet")) {
                    str2 = "text/html";
                } else {
                    str2 = "text/css";
                }
                break;
            default:
                str2 = "text/html";
                break;
        }
        strK = null;
        fileStream = webCacheLocalResp.getFileStream();
        if (fileStream == null) {
            if (webCacheLocalResp.getFilename() != null) {
                filename = null;
            } else if (str != null) {
                filename = webCacheLocalResp.getFilename();
            } else {
                filename = webCacheLocalResp.getFilename();
            }
            if (filename != null) {
                fileStream = null;
            } else {
                fileStream = null;
            }
        }
        if (fileStream == null) {
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(str2, strK, fileStream);
            webResourceResponse2.setResponseHeaders(webCacheLocalResp.header);
            return webResourceResponse2;
        }
        webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog()) {
            webCacheLog.e("WebCacheLocalResp", "Error in creating response from WebCacheLocalResp, filePath or inputStream cannot be null.");
        }
        return null;
    }

    public static /* synthetic */ WebResourceResponse createResponse$default(WebCacheLocalResp webCacheLocalResp, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        return createResponse(webCacheLocalResp, str);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    @Keep
    @Nullable
    public static final WebResource createWebResponse(@NotNull WebCacheLocalResp webCacheLocalResp, @Nullable String str) {
        String filename;
        Intrinsics.checkNotNullParameter(webCacheLocalResp, "<this>");
        InputStream fileStream = webCacheLocalResp.getFileStream();
        if (fileStream == null) {
            if (webCacheLocalResp.getFilename() == null) {
                filename = null;
            } else if (str == null || (filename = q0.y(str, File.separator, webCacheLocalResp.getFilename())) == null) {
                filename = webCacheLocalResp.getFilename();
            }
            if (filename == null || StringsKt.F(filename)) {
                fileStream = null;
            } else {
                File file = new File(filename);
                if (file.exists() && file.isFile()) {
                    fileStream = new FileInputStream(filename);
                } else {
                    fileStream = null;
                }
            }
        }
        if (fileStream == null) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e("WebCacheLocalResp", "Error in creating response from WebCacheLocalResp, filePath or inputStream cannot be null.");
            }
            return null;
        }
        WebResource webResource = new WebResource();
        webResource.setReasonPhrase("success");
        webResource.setResponseCode(200);
        webResource.setOriginBytes(StreamUtils.streamToBytes(fileStream));
        webResource.setResponseHeaders(webCacheLocalResp.header);
        webResource.setModified(false);
        return webResource;
    }

    public static /* synthetic */ WebResource createWebResponse$default(WebCacheLocalResp webCacheLocalResp, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        return createWebResponse(webCacheLocalResp, str);
    }

    @Keep
    @Nullable
    public static final List<WebCacheLocalResp> jsonArrayParse(@Nullable String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        WebCacheLocalResp webCacheLocalRespJsonParse = jsonParse(jSONArray.get(i7).toString());
                        if (webCacheLocalRespJsonParse != null) {
                            arrayList.add(webCacheLocalRespJsonParse);
                        }
                    }
                }
                return arrayList;
            } catch (JSONException e10) {
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.e("WebCacheLocalResp", e10);
                }
            }
        }
        return null;
    }

    @Keep
    @Nullable
    public static final WebCacheLocalResp jsonParse(@Nullable String str) {
        HashMap map;
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("url");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject.getString("type");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
                if (jSONObjectOptJSONObject != null) {
                    HashMap map2 = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map2.put(next, jSONObjectOptJSONObject.getString(next));
                    }
                    map = map2;
                } else {
                    map = null;
                }
                return new WebCacheLocalResp(string, string2, map, jSONObject.getString("filename"), null, false, 48, null);
            } catch (JSONException e10) {
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.e("WebCacheLocalResp", e10);
                }
            }
        }
        return null;
    }
}
