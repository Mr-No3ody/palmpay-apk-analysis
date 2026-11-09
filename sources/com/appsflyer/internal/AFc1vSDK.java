package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.google.maps.android.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1vSDK {
    public String AFAdRevenueData;
    private byte[] areAllFieldsValid;
    public AFe1nSDK getCurrencyIso4217Code;
    public Map<String, String> getMediationNetwork;
    String getMonetizationNetwork;
    public String getRevenue;

    public AFc1vSDK(String str, byte[] bArr, String str2, AFe1nSDK aFe1nSDK, Map<String, String> map) {
        this.getRevenue = str;
        this.areAllFieldsValid = bArr;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = aFe1nSDK;
        this.getMediationNetwork = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1vSDK.class == obj.getClass()) {
            AFc1vSDK aFc1vSDK = (AFc1vSDK) obj;
            if (Objects.equals(this.getMonetizationNetwork, aFc1vSDK.getMonetizationNetwork) && Arrays.equals(this.areAllFieldsValid, aFc1vSDK.areAllFieldsValid) && Objects.equals(this.getRevenue, aFc1vSDK.getRevenue) && Objects.equals(this.AFAdRevenueData, aFc1vSDK.AFAdRevenueData) && Objects.equals(this.getMediationNetwork, aFc1vSDK.getMediationNetwork) && this.getCurrencyIso4217Code == aFc1vSDK.getCurrencyIso4217Code) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getMediationNetwork() {
        return this.areAllFieldsValid;
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int iHashCode = (Arrays.hashCode(this.areAllFieldsValid) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.getRevenue;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFAdRevenueData;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1nSDK aFe1nSDK = this.getCurrencyIso4217Code;
        int iHashCode4 = (iHashCode3 + (aFe1nSDK != null ? aFe1nSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.getMediationNetwork;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public AFc1vSDK(char[] cArr) {
        Map<String, String> mapC;
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                String strNextLine = scanner.nextLine();
                if (strNextLine.startsWith("url=")) {
                    this.getRevenue = strNextLine.substring(4).trim();
                } else if (strNextLine.startsWith("version=")) {
                    this.getMonetizationNetwork = strNextLine.substring(8).trim();
                } else if (strNextLine.startsWith("headers=")) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(strNextLine.substring(8).trim(), 2), Charset.defaultCharset()));
                        Intrinsics.checkNotNullParameter(jSONObject, "");
                        if (jSONObject.length() == 0) {
                            mapC = G.c();
                        } else {
                            Iterator<String> itKeys = jSONObject.keys();
                            Intrinsics.checkNotNullExpressionValue(itKeys, "");
                            Sf.a aVarA = Sf.m.a(itKeys);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj : aVarA) {
                                Object obj2 = jSONObject.get((String) obj);
                                linkedHashMap.put(obj, Intrinsics.c(obj2, JSONObject.NULL) ? BuildConfig.TRAVIS : obj2.toString());
                            }
                            mapC = linkedHashMap;
                        }
                        this.getMediationNetwork = mapC;
                    } catch (Exception e10) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error parsing headers", e10);
                        this.getMediationNetwork = new HashMap();
                    }
                } else if (strNextLine.startsWith("data=")) {
                    this.areAllFieldsValid = Base64.decode(strNextLine.substring(5).trim(), 2);
                } else if (strNextLine.startsWith("type=")) {
                    String strTrim = strNextLine.substring(5).trim();
                    try {
                        this.getCurrencyIso4217Code = AFe1nSDK.valueOf(strTrim);
                    } catch (Exception e11) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Unknown task type: ".concat(String.valueOf(strTrim)), e11);
                    }
                }
            } catch (Throwable th) {
                try {
                    scanner.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        scanner.close();
    }
}
