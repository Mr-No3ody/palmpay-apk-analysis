package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1hSDK<ResponseBody> {
    private final AtomicBoolean AFAdRevenueData = new AtomicBoolean(false);
    private final AFd1iSDK getCurrencyIso4217Code;
    public final AFd1aSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;
    private final AFe1xSDK<ResponseBody> getRevenue;

    public AFd1hSDK(AFd1aSDK aFd1aSDK, ExecutorService executorService, AFd1iSDK aFd1iSDK, AFe1xSDK<ResponseBody> aFe1xSDK) {
        this.getMediationNetwork = aFd1aSDK;
        this.getMonetizationNetwork = executorService;
        this.getCurrencyIso4217Code = aFd1iSDK;
        this.getRevenue = aFe1xSDK;
    }

    public final AFe1wSDK<ResponseBody> getMediationNetwork() throws IOException {
        if (this.AFAdRevenueData.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFe1wSDK<String> mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork(this.getMediationNetwork);
        try {
            return new AFe1wSDK<>(this.getRevenue.getCurrencyIso4217Code(mediationNetwork.getBody()), mediationNetwork.getMonetizationNetwork, mediationNetwork.getCurrencyIso4217Code, mediationNetwork.AFAdRevenueData, mediationNetwork.getRevenue);
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e10);
            throw new ParsingException(e10.getMessage(), e10, mediationNetwork);
        }
    }
}
