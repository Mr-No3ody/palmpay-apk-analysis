package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1sSDK extends AFe1sSDK<AFf1mSDK> {

    @Nullable
    private final AFc1fSDK AFInAppEventParameterName;
    public AFi1ySDK areAllFieldsValid;

    @Nullable
    public AFf1mSDK component1;
    private final AFc1pSDK component2;
    private final AFf1oSDK component3;

    @Nullable
    public final AFf1tSDK component4;
    private final String copy;
    private final AFf1qSDK copydefault;
    private final AFf1jSDK equals;
    private final AFd1kSDK hashCode;
    private final AFf1nSDK toString;

    public AFf1sSDK(@NonNull AFf1oSDK aFf1oSDK, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFf1jSDK aFf1jSDK, @NonNull AFf1qSDK aFf1qSDK, @NonNull AFd1kSDK aFd1kSDK, @NonNull AFf1nSDK aFf1nSDK, @NonNull String str, @Nullable AFf1tSDK aFf1tSDK, @Nullable AFc1fSDK aFc1fSDK) {
        super(AFe1nSDK.RC_CDN, new AFe1nSDK[0], "UpdateRemoteConfiguration");
        this.component1 = null;
        this.component3 = aFf1oSDK;
        this.component2 = aFc1pSDK;
        this.equals = aFf1jSDK;
        this.copydefault = aFf1qSDK;
        this.hashCode = aFd1kSDK;
        this.toString = aFf1nSDK;
        this.copy = str;
        this.component4 = aFf1tSDK;
        this.AFInAppEventParameterName = aFc1fSDK;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066 A[Catch: all -> 0x00a9, IOException -> 0x00ad, TryCatch #5 {IOException -> 0x00ad, all -> 0x00a9, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x0091, B:23:0x0099, B:25:0x009f, B:30:0x00b1, B:32:0x00cc, B:35:0x00d9, B:37:0x00e5, B:43:0x0156, B:53:0x0174, B:55:0x0186, B:57:0x018c, B:59:0x01ac), top: B:79:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[Catch: all -> 0x00a9, IOException -> 0x00ad, TryCatch #5 {IOException -> 0x00ad, all -> 0x00a9, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x0091, B:23:0x0099, B:25:0x009f, B:30:0x00b1, B:32:0x00cc, B:35:0x00d9, B:37:0x00e5, B:43:0x0156, B:53:0x0174, B:55:0x0186, B:57:0x018c, B:59:0x01ac), top: B:79:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x018c A[Catch: all -> 0x00a9, IOException -> 0x00ad, TryCatch #5 {IOException -> 0x00ad, all -> 0x00a9, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x0091, B:23:0x0099, B:25:0x009f, B:30:0x00b1, B:32:0x00cc, B:35:0x00d9, B:37:0x00e5, B:43:0x0156, B:53:0x0174, B:55:0x0186, B:57:0x018c, B:59:0x01ac), top: B:79:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ac A[Catch: all -> 0x00a9, IOException -> 0x00ad, TRY_LEAVE, TryCatch #5 {IOException -> 0x00ad, all -> 0x00a9, blocks: (B:15:0x005e, B:17:0x0066, B:19:0x008d, B:21:0x0091, B:23:0x0099, B:25:0x009f, B:30:0x00b1, B:32:0x00cc, B:35:0x00d9, B:37:0x00e5, B:43:0x0156, B:53:0x0174, B:55:0x0186, B:57:0x018c, B:59:0x01ac), top: B:79:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:79:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFf1mSDK component3() throws InterruptedException, InterruptedIOException {
        String revenue;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        AFe1wSDK<AFi1zSDK> mediationNetwork;
        String revenue2;
        String monetizationNetwork;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.copy;
        String revenue3 = this.equals.getRevenue();
        if (revenue3 == null || revenue3.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else {
            if (str == null) {
                AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                revenue = AFj1dSDK.getRevenue(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.component2.getCurrencyIso4217Code.getRevenue.getPackageName()}), revenue3);
            }
            if (revenue == null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1mSDK.FAILURE;
            }
            try {
                if (this.toString.getRevenue()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1mSDK.USE_CACHED;
                }
                aFLogger = AFLogger.INSTANCE;
                aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1cSDK, "Cached config is expired or net token is null, updating...");
                mediationNetwork = this.hashCode.getCurrencyIso4217Code(this.toString.getMediationNetwork(), this.toString.getCurrencyIso4217Code(), revenue, 1500).getMediationNetwork();
                if (mediationNetwork.isSuccessful()) {
                    getCurrencyIso4217Code(revenue, jCurrentTimeMillis, null, null, mediationNetwork);
                    StringBuilder sb2 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb2.append(mediationNetwork.getStatusCode());
                    aFLogger.w(aFg1cSDK, sb2.toString());
                    return AFf1mSDK.FAILURE;
                }
                if (this.AFInAppEventParameterName != null && (monetizationNetwork = mediationNetwork.getMonetizationNetwork("af-net-tkn")) != null && !monetizationNetwork.isEmpty()) {
                    this.AFInAppEventParameterName.copy = monetizationNetwork;
                    aFLogger.d(aFg1cSDK, "Network token saved");
                }
                AFi1zSDK body = mediationNetwork.getBody();
                String monetizationNetwork2 = mediationNetwork.getMonetizationNetwork("x-amz-meta-af-auth-v1");
                String monetizationNetwork3 = mediationNetwork.getMonetizationNetwork("CF-Cache-Status");
                revenue2 = this.equals.getRevenue();
                if (revenue2 != null || revenue2.trim().length() == 0) {
                    aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                    return AFf1mSDK.FAILURE;
                }
                AFi1xSDK currencyIso4217Code = this.component3.getCurrencyIso4217Code(body, monetizationNetwork2, revenue, revenue2);
                if (!currencyIso4217Code.getCurrencyIso4217Code()) {
                    getCurrencyIso4217Code(revenue, jCurrentTimeMillis, currencyIso4217Code.getMonetizationNetwork, monetizationNetwork3, mediationNetwork);
                    aFLogger.w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1mSDK.FAILURE;
                }
                long jAFAdRevenueData = this.toString.AFAdRevenueData();
                StringBuilder sb3 = new StringBuilder("using max-age fallback: ");
                sb3.append(jAFAdRevenueData);
                sb3.append(" seconds");
                aFLogger.v(aFg1cSDK, sb3.toString());
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                AFf1qSDK aFf1qSDK = this.copydefault;
                String str2 = revenue;
                try {
                    try {
                        aFf1qSDK.getRevenue.getMonetizationNetwork("af_remote_config", Base64.encodeToString(body.getRevenue.getBytes(Charset.defaultCharset()), 2));
                        aFf1qSDK.AFAdRevenueData = aFf1qSDK.getMonetizationNetwork;
                        aFf1qSDK.getRevenue.getMonetizationNetwork("af_rc_timestamp", jCurrentTimeMillis2);
                        aFf1qSDK.getRevenue.getMonetizationNetwork("af_rc_max_age", jAFAdRevenueData);
                        aFf1qSDK.getMonetizationNetwork = body;
                        aFf1qSDK.getCurrencyIso4217Code = jCurrentTimeMillis2;
                        aFf1qSDK.getMediationNetwork = jAFAdRevenueData;
                        StringBuilder sb4 = new StringBuilder("Config successfully updated, timeToLive: ");
                        sb4.append(jAFAdRevenueData);
                        sb4.append(" seconds");
                        aFLogger.d(aFg1cSDK, sb4.toString());
                        getCurrencyIso4217Code(str2, jCurrentTimeMillis, currencyIso4217Code.getMonetizationNetwork, monetizationNetwork3, mediationNetwork);
                        return AFf1mSDK.SUCCESS;
                    } catch (IOException e10) {
                        e = e10;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        IOException iOException = e;
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb5 = new StringBuilder("failed to fetch remote config: ");
                        sb5.append(iOException.getMessage());
                        aFLogger2.e(aFg1cSDK2, sb5.toString(), iOException, true, false, false);
                        getMediationNetwork(revenue, jCurrentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                        if (iOException.getCause() instanceof InterruptedIOException) {
                            throw ((InterruptedIOException) iOException.getCause());
                        }
                        return AFf1mSDK.FAILURE;
                    } catch (Throwable th) {
                        th = th;
                        revenue = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        Throwable th2 = th;
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb6 = new StringBuilder("failed to update remote config: ");
                        sb6.append(th2.getMessage());
                        aFLogger3.e(aFg1cSDK3, sb6.toString(), th2, true, false, false);
                        getMediationNetwork(revenue, jCurrentTimeMillis, null, null, null, null, th2);
                        if (th2.getCause() instanceof InterruptedException) {
                            throw ((InterruptedException) th2.getCause());
                        }
                        return AFf1mSDK.FAILURE;
                    }
                } catch (IOException e11) {
                    e = e11;
                    revenue = str2;
                } catch (Throwable th3) {
                    th = th3;
                    revenue = str2;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        revenue = null;
        if (revenue == null) {
            AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFf1mSDK.FAILURE;
        }
        if (this.toString.getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
            return AFf1mSDK.USE_CACHED;
        }
        aFLogger = AFLogger.INSTANCE;
        aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
        aFLogger.i(aFg1cSDK, "Cached config is expired or net token is null, updating...");
        mediationNetwork = this.hashCode.getCurrencyIso4217Code(this.toString.getMediationNetwork(), this.toString.getCurrencyIso4217Code(), revenue, 1500).getMediationNetwork();
        if (mediationNetwork.isSuccessful()) {
            getCurrencyIso4217Code(revenue, jCurrentTimeMillis, null, null, mediationNetwork);
            StringBuilder sb7 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb7.append(mediationNetwork.getStatusCode());
            aFLogger.w(aFg1cSDK, sb7.toString());
            return AFf1mSDK.FAILURE;
        }
        if (this.AFInAppEventParameterName != null) {
            this.AFInAppEventParameterName.copy = monetizationNetwork;
            aFLogger.d(aFg1cSDK, "Network token saved");
        }
        AFi1zSDK body2 = mediationNetwork.getBody();
        String monetizationNetwork4 = mediationNetwork.getMonetizationNetwork("x-amz-meta-af-auth-v1");
        String monetizationNetwork5 = mediationNetwork.getMonetizationNetwork("CF-Cache-Status");
        revenue2 = this.equals.getRevenue();
        if (revenue2 != null) {
        }
        aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
        return AFf1mSDK.FAILURE;
    }

    private void getMediationNetwork(String str, long j6, @Nullable AFe1wSDK<?> aFe1wSDK, AFi1zSDK aFi1zSDK, AFi1uSDK aFi1uSDK, @Nullable String str2, @Nullable Throwable th) {
        long j10;
        int statusCode;
        Throwable th2;
        if (aFe1wSDK != null) {
            j10 = aFe1wSDK.getRevenue.getCurrencyIso4217Code;
            statusCode = aFe1wSDK.getStatusCode();
        } else {
            j10 = 0;
            statusCode = 0;
        }
        int i7 = statusCode;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j10 = ((HttpException) th).getMetrics().getCurrencyIso4217Code;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.areAllFieldsValid = new AFi1ySDK(aFi1zSDK != null ? aFi1zSDK.getCurrencyIso4217Code : null, str, j10, System.currentTimeMillis() - j6, i7, aFi1uSDK, str2, th2);
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1qSDK getCurrencyIso4217Code() throws Exception {
        try {
            AFf1mSDK aFf1mSDKComponent3 = component3();
            this.component1 = aFf1mSDKComponent3;
            return aFf1mSDKComponent3 == AFf1mSDK.FAILURE ? AFe1qSDK.FAILURE : AFe1qSDK.SUCCESS;
        } catch (InterruptedIOException e10) {
            e = e10;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1mSDK.FAILURE;
            return AFe1qSDK.TIMEOUT;
        } catch (InterruptedException e11) {
            e = e11;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1mSDK.FAILURE;
            return AFe1qSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component1 = AFf1mSDK.FAILURE;
            return AFe1qSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return 1500L;
    }

    private void getCurrencyIso4217Code(String str, long j6, AFi1uSDK aFi1uSDK, @Nullable String str2, @Nullable AFe1wSDK<AFi1zSDK> aFe1wSDK) {
        getMediationNetwork(str, j6, aFe1wSDK, aFe1wSDK != null ? aFe1wSDK.getBody() : null, aFi1uSDK, str2 != null ? str2 : null, null);
    }
}
