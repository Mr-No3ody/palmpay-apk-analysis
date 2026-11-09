package com.adjust.sdk.network;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UtilNetworking {

    public interface IConnectionOptions {
        void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i7);
    }

    public interface IHttpsURLConnectionProvider {
        HttpsURLConnection generateHttpsURLConnection(URL url);
    }

    public static IConnectionOptions createDefaultConnectionOptions() {
        return new b();
    }

    public static IHttpsURLConnectionProvider createDefaultHttpsURLConnectionProvider() {
        return new c();
    }

    public static int extractJsonInt(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof Integer) {
            return ((Integer) objOpt).intValue();
        }
        return -1;
    }

    public static Long extractJsonLong(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof Long) {
            return (Long) objOpt;
        }
        if (objOpt instanceof Number) {
            return Long.valueOf(((Number) objOpt).longValue());
        }
        if (!(objOpt instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) objOpt));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String extractJsonString(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        if (objOpt != null) {
            return objOpt.toString();
        }
        return null;
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }
}
