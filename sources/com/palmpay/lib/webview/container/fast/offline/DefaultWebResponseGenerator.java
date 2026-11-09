package com.palmpay.lib.webview.container.fast.offline;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.utils.LogUtils;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultWebResponseGenerator implements WebResourceResponseGenerator {
    private static final String KEY_CONTENT_TYPE = "Content-Type";

    private String getContentType(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        String str2 = map.get(str);
        return str2 != null ? str2 : map.get(str.toLowerCase());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    @Override // com.palmpay.lib.webview.container.fast.offline.WebResourceResponseGenerator
    public WebResourceResponse generate(WebResource webResource, String str) {
        String str2;
        String str3;
        byte[] originBytes;
        if (webResource == null) {
            return null;
        }
        Map<String, String> responseHeaders = webResource.getResponseHeaders();
        if (responseHeaders != null) {
            String contentType = getContentType(responseHeaders, "Content-Type");
            if (TextUtils.isEmpty(contentType)) {
                str2 = null;
                str3 = null;
            } else {
                String[] strArrSplit = contentType.split(";");
                str2 = strArrSplit.length >= 1 ? strArrSplit[0] : null;
                if (strArrSplit.length >= 2) {
                    String str4 = strArrSplit[1];
                    String[] strArrSplit2 = str4.split("=");
                    if (strArrSplit2.length >= 2) {
                        str4 = strArrSplit2[1];
                    }
                    str3 = str4;
                } else {
                    str3 = null;
                }
            }
        } else {
            str2 = null;
            str3 = null;
        }
        String str5 = !TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str5) || (originBytes = webResource.getOriginBytes()) == null || originBytes.length < 0) {
            return null;
        }
        if (originBytes.length == 0 && webResource.getResponseCode() == 304) {
            LogUtils.d("the response bytes can not be empty if we get 304.");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(originBytes);
        int responseCode = webResource.getResponseCode();
        String reasonPhrase = webResource.getReasonPhrase();
        if (TextUtils.isEmpty(reasonPhrase)) {
            reasonPhrase = PhraseList.getPhrase(responseCode);
        }
        return new WebResourceResponse(str5, str3, responseCode, reasonPhrase, webResource.getResponseHeaders(), byteArrayInputStream);
    }
}
