package com.appsflyer.internal;

import Ab.C;
import Kf.q;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000f\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u000f\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFc1aSDK;", "", "", "p0", "", "", "p1", "", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "<init>", "([BLjava/util/Map;I)V", "", "AFAdRevenueData", "()Z", "Ljava/net/HttpURLConnection;", "getMediationNetwork", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "", "getCurrencyIso4217Code", "(Ljava/net/HttpURLConnection;J)Z", "[B", "Lcom/appsflyer/internal/AFd1fSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1fSDK;", "Ljava/util/Map;", "getMonetizationNetwork", "Z", "I", "()Ljava/lang/String;", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMonitorHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n215#2,2:135\n215#2,2:138\n1#3:137\n*S KotlinDebug\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n*L\n58#1:135,2\n104#1:138,2\n*E\n"})
public abstract class AFc1aSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public int getRevenue;

    @NotNull
    public byte[] getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> AFAdRevenueData;
    private final boolean getMonetizationNetwork;

    public AFc1aSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i7) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getCurrencyIso4217Code = bArr;
        this.AFAdRevenueData = map;
        this.getRevenue = i7;
        this.getMonetizationNetwork = true;
    }

    private final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection, long j6) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb2.append("\n length: ");
        sb2.append(new String(this.getCurrencyIso4217Code, Charsets.UTF_8).length());
        Map<String, String> map = this.AFAdRevenueData;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        String mediationNetwork = getMediationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb2));
        if (getGetMonetizationNetwork()) {
            AFLogger.afRDLog(mediationNetwork);
        } else {
            AFLogger.afVerboseLog(mediationNetwork);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getRevenue);
        httpURLConnection.setConnectTimeout(this.getRevenue);
        httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, getGetCurrencyIso4217Code().getMonetizationNetwork);
        Map<String, String> map2 = this.AFAdRevenueData;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(this.getCurrencyIso4217Code.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        bufferedOutputStream.write(this.getCurrencyIso4217Code);
        bufferedOutputStream.close();
        String mediationNetwork2 = getMediationNetwork(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j6;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + mediationNetwork2 + "\n\ttook " + jCurrentTimeMillis + "ms";
        String mediationNetwork3 = getMediationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getGetMonetizationNetwork()) {
            AFLogger.afRDLog(mediationNetwork3);
        } else {
            AFLogger.afVerboseLog(mediationNetwork3);
        }
        return AFd1sSDK.getMediationNetwork(httpURLConnection);
    }

    private static String getMediationNetwork(HttpURLConnection p3) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p3.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th.getMessage();
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = p3.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), UserMetadata.MAX_INTERNAL_KEY_SIZE);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        ArrayList arrayList = new ArrayList();
        C action = new C(arrayList, 22);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            q qVar = new q(bufferedReader);
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            Iterator it = new Sf.a(qVar).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f38893a;
            bufferedReader.close();
            String strJ = CollectionsKt.J(arrayList, null, null, null, null, 63);
            bufferedReader.close();
            return strJ == null ? "" : strJ;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                org.chromium.support_lib_boundary.util.b.o(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @WorkerThread
    public final boolean AFAdRevenueData() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String currencyIso4217Code = getCurrencyIso4217Code();
            Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(currencyIso4217Code).openConnection());
            Intrinsics.f(uRLConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
            try {
                boolean currencyIso4217Code2 = getCurrencyIso4217Code(httpURLConnection2, jCurrentTimeMillis);
                httpURLConnection2.disconnect();
                return currencyIso4217Code2;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    String mediationNetwork = getMediationNetwork("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getGetMonetizationNetwork()) {
                        AFLogger.afRDLog(mediationNetwork);
                    } else {
                        AFLogger.afVerboseLog(mediationNetwork);
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    public abstract String getCurrencyIso4217Code();

    @NotNull
    public abstract String getMediationNetwork(@NotNull String str);

    @JvmName(name = "getMonetizationNetwork")
    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from getter */
    public boolean getGetMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    @JvmName(name = "getRevenue")
    @NotNull
    /* JADX INFO: renamed from: getRevenue */
    public abstract AFd1fSDK getGetCurrencyIso4217Code();
}
