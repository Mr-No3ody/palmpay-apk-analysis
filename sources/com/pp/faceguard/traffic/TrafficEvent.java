package com.pp.faceguard.traffic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TrafficEvent {
    private final String deviceId;
    private final long durationMs;
    private final String method;
    private final byte[] requestBody;
    private final String requestContentType;
    private final Map<String, List<String>> requestHeaders;
    private final byte[] responseBody;
    private final int responseCode;
    private final String responseContentType;
    private final Map<String, List<String>> responseHeaders;
    private final String url;

    public TrafficEvent(String str, String str2, String str3, Map<String, List<String>> map, byte[] bArr, String str4, int i7, Map<String, List<String>> map2, byte[] bArr2, String str5, long j6) {
        this.deviceId = str;
        this.url = str2;
        this.method = str3;
        this.requestHeaders = copyHeaders(map);
        this.requestBody = bArr == null ? new byte[0] : (byte[]) bArr.clone();
        this.requestContentType = str4;
        this.responseCode = i7;
        this.responseHeaders = copyHeaders(map2);
        this.responseBody = bArr2 == null ? new byte[0] : (byte[]) bArr2.clone();
        this.responseContentType = str5;
        this.durationMs = j6;
    }

    private static Map<String, List<String>> copyHeaders(Map<String, List<String>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), Collections.unmodifiableList(new ArrayList(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    public String getMethod() {
        return this.method;
    }

    public byte[] getRequestBody() {
        return (byte[]) this.requestBody.clone();
    }

    public String getRequestContentType() {
        return this.requestContentType;
    }

    public Map<String, List<String>> getRequestHeaders() {
        return this.requestHeaders;
    }

    public byte[] getResponseBody() {
        return (byte[]) this.responseBody.clone();
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getResponseContentType() {
        return this.responseContentType;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    public String getUrl() {
        return this.url;
    }
}
