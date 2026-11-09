package com.palmpay.lib.webview.container.fast.loader;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.palmpay.lib.webview.container.fast.utils.StreamUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultResourceLoader implements ResourceLoader {
    private static final String TAG = "com.palmpay.lib.webview.container.fast.loader.DefaultResourceLoader";

    private void putHeader(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.loader.ResourceLoader
    public WebResource getResource(SourceRequest sourceRequest) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(sourceRequest.getUrl()).openConnection()));
            putHeader(httpURLConnection, sourceRequest.getHeaders());
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(20000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                httpURLConnection.disconnect();
                return null;
            }
            WebResource webResource = new WebResource();
            webResource.setOriginBytes(StreamUtils.streamToBytes(httpURLConnection.getInputStream()));
            webResource.setResponseCode(responseCode);
            webResource.setReasonPhrase(httpURLConnection.getResponseMessage());
            webResource.setResponseHeaders(HeaderUtils.generateHeadersMap(httpURLConnection.getHeaderFields()));
            return webResource;
        } catch (MalformedURLException e10) {
            e10.toString();
            e10.printStackTrace();
            return null;
        } catch (IOException e11) {
            e11.toString();
            e11.printStackTrace();
            return null;
        } catch (Exception e12) {
            e12.toString();
            e12.printStackTrace();
            return null;
        }
    }
}
