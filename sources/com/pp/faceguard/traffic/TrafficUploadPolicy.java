package com.pp.faceguard.traffic;

import com.adjust.sdk.Constants;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class TrafficUploadPolicy {
    private static final String BINDING_PATH = "/api/rcp-device-service/device-token/bindings";
    private static final String DEBUG_ENDPOINT = "https://ng-apptest.transspay.net/api/rcp-device-service/faceguard/report";
    private static final String RELEASE_ENDPOINT = "https://ng-m.palmpay.app/api/rcp-device-service/faceguard/report";

    private TrafficUploadPolicy() {
    }

    private static boolean isLoopback(String str) {
        if (str == null) {
            return true;
        }
        String lowerCase = str.trim().toLowerCase();
        return AndroidInfoHelpers.DEVICE_LOCALHOST.equals(lowerCase) || "::1".equals(lowerCase) || lowerCase.startsWith("127.");
    }

    public static boolean isUploadable(TrafficEvent trafficEvent) {
        return (trafficEvent == null || trafficEvent.getUrl() == null || trafficEvent.getUrl().trim().isEmpty() || !"POST".equalsIgnoreCase(trafficEvent.getMethod())) ? false : true;
    }

    public static URL resolveBindingEndpoint() {
        URL urlResolveEndpoint = resolveEndpoint();
        if (urlResolveEndpoint == null) {
            return null;
        }
        try {
            return new URL(urlResolveEndpoint.getProtocol(), urlResolveEndpoint.getHost(), urlResolveEndpoint.getPort(), BINDING_PATH);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public static URL resolveEndpoint() {
        boolean zIsDebug = FaceGuardTraffic.isDebug();
        try {
            URL url = new URL(zIsDebug ? DEBUG_ENDPOINT : RELEASE_ENDPOINT);
            if (!zIsDebug && (!Constants.SCHEME.equalsIgnoreCase(url.getProtocol()) || isLoopback(url.getHost()))) {
                return null;
            }
            return url;
        } catch (MalformedURLException unused) {
        }
    }
}
