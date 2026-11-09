package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1iSDK {
    private final int getMediationNetwork;

    public AFd1iSDK(int i7) {
        this.getMediationNetwork = i7;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    @NonNull
    private static String getRevenue(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e10) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e10.getMessage() != null ? e10.getMessage() : "", e10, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z3 = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                        if (!z3) {
                            sb2.append('\n');
                        }
                        sb2.append(line);
                        z3 = false;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            throw th;
                        }
                        bufferedReader.close();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            throw th;
        }
        bufferedReader.close();
        throw th;
    }

    public final AFe1wSDK<String> getMediationNetwork(AFd1aSDK aFd1aSDK) throws IOException {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrAFAdRevenueData = aFd1aSDK.AFAdRevenueData();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1aSDK.getMonetizationNetwork);
            sb2.append(":");
            sb2.append(aFd1aSDK.AFAdRevenueData);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] bArrAFAdRevenueData2 = aFd1aSDK.AFAdRevenueData();
            if (aFd1aSDK.getMediationNetwork() && bArrAFAdRevenueData2 != null) {
                try {
                    String str = aFd1aSDK.getCurrencyIso4217Code() ? "<encrypted>" : new String(bArrAFAdRevenueData2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                    try {
                        AFd1bSDK aFd1bSDK = new AFd1bSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(th);
                        sb4.append("\n took ");
                        sb4.append(aFd1bSDK.getCurrencyIso4217Code);
                        sb4.append("ms");
                        String string = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder("[");
                        sb5.append(aFd1aSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(string);
                        aFLogger.e(aFg1cSDK, sb5.toString(), th, false, false, false);
                        throw new HttpException(th, aFd1bSDK);
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1aSDK.getCurrencyIso4217Code.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1aSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb6.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aFd1aSDK.AFAdRevenueData).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(aFd1aSDK.getMonetizationNetwork);
                if (aFd1aSDK.getRevenue()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1aSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i7 = this.getMediationNetwork;
                    int i10 = aFd1aSDK.component1;
                    if (i10 != -1) {
                        i7 = i10;
                    }
                    httpURLConnection2.setConnectTimeout(i7);
                    httpURLConnection2.setReadTimeout(i7);
                    httpURLConnection2.addRequestProperty(HttpHeaders.CONTENT_TYPE, aFd1aSDK.getCurrencyIso4217Code() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1aSDK.getCurrencyIso4217Code.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (bArrAFAdRevenueData != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(bArrAFAdRevenueData.length);
                        httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, sb7.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(bArrAFAdRevenueData);
                                bufferedOutputStream2.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z3 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String revenue = aFd1aSDK.getMonetizationNetwork() ? getRevenue(httpURLConnection2) : "";
                    AFd1bSDK aFd1bSDK2 = new AFd1bSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb8 = new StringBuilder("response code:");
                    sb8.append(httpURLConnection2.getResponseCode());
                    sb8.append(" ");
                    sb8.append(httpURLConnection2.getResponseMessage());
                    sb8.append("\n body:");
                    sb8.append(revenue);
                    sb8.append("\n took ");
                    sb8.append(aFd1bSDK2.getCurrencyIso4217Code);
                    sb8.append("ms");
                    String string2 = sb8.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb9 = new StringBuilder("[");
                    sb9.append(aFd1aSDK.hashCode());
                    sb9.append("] ");
                    sb9.append(string2);
                    aFLogger2.d(aFg1cSDK2, sb9.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFe1wSDK<String> aFe1wSDK = new AFe1wSDK<>(revenue, httpURLConnection2.getResponseCode(), z3, map, aFd1bSDK2);
                    httpURLConnection2.disconnect();
                    return aFe1wSDK;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    AFd1bSDK aFd1bSDK3 = new AFd1bSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb10 = new StringBuilder("error: ");
                    sb10.append(th);
                    sb10.append("\n took ");
                    sb10.append(aFd1bSDK3.getCurrencyIso4217Code);
                    sb10.append("ms");
                    String string3 = sb10.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb11 = new StringBuilder("[");
                    sb11.append(aFd1aSDK.hashCode());
                    sb11.append("] ");
                    sb11.append(string3);
                    aFLogger3.e(aFg1cSDK3, sb11.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1bSDK3);
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }
}
