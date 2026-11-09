package com.pp.faceguard.traffic;

import Pg.l;
import Pg.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TrafficJsonEncoder {
    private TrafficJsonEncoder() {
    }

    private static void appendHeaders(StringBuilder sb2, String str, Map<String, List<String>> map) {
        appendName(sb2, str);
        sb2.append('{');
        boolean z3 = true;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!z3) {
                sb2.append(',');
            }
            appendQuoted(sb2, entry.getKey());
            sb2.append(':');
            sb2.append('[');
            boolean z8 = true;
            for (String str2 : entry.getValue()) {
                if (!z8) {
                    sb2.append(',');
                }
                appendQuoted(sb2, str2);
                z8 = false;
            }
            sb2.append(']');
            z3 = false;
        }
        sb2.append('}');
    }

    private static void appendName(StringBuilder sb2, String str) {
        if (sb2.length() > 1) {
            sb2.append(',');
        }
        appendQuoted(sb2, str);
        sb2.append(':');
    }

    private static void appendNumber(StringBuilder sb2, String str, long j6) {
        appendName(sb2, str);
        sb2.append(j6);
    }

    private static void appendQuoted(StringBuilder sb2, String str) {
        sb2.append('\"');
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt == '\\') {
                sb2.append("\\\\");
            } else if (cCharAt < ' ') {
                sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
    }

    private static void appendString(StringBuilder sb2, String str, String str2) {
        appendName(sb2, str);
        if (str2 == null) {
            str2 = "";
        }
        appendQuoted(sb2, str2);
    }

    public static String encode(TrafficEvent trafficEvent) {
        StringBuilder sb2 = new StringBuilder("{");
        appendString(sb2, "deviceId", trafficEvent.getDeviceId());
        appendString(sb2, "url", trafficEvent.getUrl());
        appendString(sb2, FirebaseAnalytics.Param.METHOD, trafficEvent.getMethod());
        appendHeaders(sb2, "requestHeaders", trafficEvent.getRequestHeaders());
        byte[] requestBody = trafficEvent.getRequestBody();
        l lVar = m.f7359d;
        appendString(sb2, "requestBodyBase64", lVar.of(requestBody).a());
        appendNumber(sb2, "requestBodyBytes", trafficEvent.getRequestBody().length);
        appendString(sb2, "requestContentType", trafficEvent.getRequestContentType());
        appendNumber(sb2, "responseCode", trafficEvent.getResponseCode());
        appendHeaders(sb2, "responseHeaders", trafficEvent.getResponseHeaders());
        appendString(sb2, "responseBodyBase64", lVar.of(trafficEvent.getResponseBody()).a());
        appendNumber(sb2, "responseBodyBytes", trafficEvent.getResponseBody().length);
        appendString(sb2, "responseContentType", trafficEvent.getResponseContentType());
        appendNumber(sb2, "durationMs", trafficEvent.getDurationMs());
        sb2.append('}');
        return sb2.toString();
    }
}
