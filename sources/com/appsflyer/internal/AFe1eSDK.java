package com.appsflyer.internal;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1eSDK<Result> extends AFe1sSDK<AFe1wSDK<Result>> {

    @Nullable
    public AFe1wSDK<Result> areAllFieldsValid;
    protected final AFd1kSDK component1;
    public final AFf1jSDK component2;
    private AFc1uSDK component3;
    protected final AFd1oSDK component4;

    @Nullable
    private String equals;

    private AFe1eSDK(@NonNull AFe1nSDK aFe1nSDK, @NonNull AFe1nSDK[] aFe1nSDKArr, @NonNull AFd1kSDK aFd1kSDK, @NonNull AFf1jSDK aFf1jSDK, @NonNull AFd1oSDK aFd1oSDK, @NonNull AFc1uSDK aFc1uSDK, @Nullable String str) {
        super(aFe1nSDK, aFe1nSDKArr, str);
        this.component1 = aFd1kSDK;
        this.component2 = aFf1jSDK;
        this.component4 = aFd1oSDK;
        this.component3 = aFc1uSDK;
    }

    @Nullable
    @WorkerThread
    public abstract AFd1hSDK<Result> AFAdRevenueData(@NonNull String str);

    @Override // com.appsflyer.internal.AFe1sSDK
    public boolean AFAdRevenueData() {
        if (component4() instanceof AFe1pSDK) {
            return false;
        }
        if (this.getMonetizationNetwork == AFe1qSDK.TIMEOUT) {
            return true;
        }
        Throwable thComponent4 = component4();
        return (thComponent4 instanceof IOException) && !(thComponent4 instanceof ParsingException);
    }

    public boolean a_() {
        return true;
    }

    public abstract boolean component3();

    @Nullable
    public abstract AppsFlyerRequestListener copydefault();

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    @CallSuper
    public AFe1qSDK getCurrencyIso4217Code() throws Exception {
        if (a_() && this.component2.getMediationNetwork()) {
            AppsFlyerRequestListener appsFlyerRequestListenerCopydefault = copydefault();
            if (appsFlyerRequestListenerCopydefault != null) {
                appsFlyerRequestListenerCopydefault.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFe1pSDK();
        }
        String revenue = this.component2.getRevenue();
        if (revenue == null || revenue.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerCopydefault2 = copydefault();
            if (appsFlyerRequestListenerCopydefault2 != null) {
                appsFlyerRequestListenerCopydefault2.onError(41, "No dev key");
            }
            throw new AFe1lSDK();
        }
        AFd1hSDK<Result> aFd1hSDKAFAdRevenueData = AFAdRevenueData(revenue);
        if (aFd1hSDKAFAdRevenueData == null) {
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
            return AFe1qSDK.FAILURE;
        }
        if (component3()) {
            getRevenue(aFd1hSDKAFAdRevenueData.getMediationNetwork);
        }
        AFe1wSDK<Result> mediationNetwork = aFd1hSDKAFAdRevenueData.getMediationNetwork();
        this.areAllFieldsValid = mediationNetwork;
        this.component4.getMediationNetwork(aFd1hSDKAFAdRevenueData.getMediationNetwork.AFAdRevenueData, mediationNetwork.getStatusCode(), mediationNetwork.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerCopydefault3 = copydefault();
        if (appsFlyerRequestListenerCopydefault3 != null) {
            if (mediationNetwork.isSuccessful()) {
                appsFlyerRequestListenerCopydefault3.onSuccess();
            } else {
                StringBuilder sb2 = new StringBuilder("Status code failure ");
                sb2.append(mediationNetwork.getStatusCode());
                appsFlyerRequestListenerCopydefault3.onError(50, sb2.toString());
            }
        }
        return mediationNetwork.isSuccessful() ? AFe1qSDK.SUCCESS : AFe1qSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @CallSuper
    public void getMediationNetwork() {
        String str;
        if (this.getMonetizationNetwork == AFe1qSDK.SUCCESS) {
            String str2 = this.equals;
            if (str2 != null) {
                this.component3.getMediationNetwork(str2);
                return;
            }
            return;
        }
        if (AFAdRevenueData() || (str = this.equals) == null) {
            return;
        }
        this.component3.getMediationNetwork(str);
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final void getMonetizationNetwork() {
        String revenue;
        super.getMonetizationNetwork();
        if (!component3() || (revenue = this.component2.getRevenue()) == null || revenue.trim().isEmpty()) {
            return;
        }
        AFd1hSDK<Result> aFd1hSDKAFAdRevenueData = AFAdRevenueData(revenue);
        if (aFd1hSDKAFAdRevenueData != null) {
            getRevenue(aFd1hSDKAFAdRevenueData.getMediationNetwork);
        } else {
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public long getRevenue() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @CallSuper
    public final void getRevenue(Throwable th) {
        Throwable th2;
        boolean z3 = !(th instanceof HttpException);
        if (th instanceof AFe1pSDK) {
            th2 = th;
            AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th2, true, false);
        } else {
            th2 = th;
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            aFLogger.e(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, false, false, z3);
            aFLogger.w(aFg1cSDK, "Error while sending request to server: ".concat(String.valueOf(th2)));
        }
        AppsFlyerRequestListener appsFlyerRequestListenerCopydefault = copydefault();
        if (appsFlyerRequestListenerCopydefault != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerCopydefault.onError(40, message);
        }
    }

    public AFe1eSDK(@NonNull AFe1nSDK aFe1nSDK, @NonNull AFe1nSDK[] aFe1nSDKArr, @NonNull AFd1zSDK aFd1zSDK, @Nullable String str) {
        this(aFe1nSDK, aFe1nSDKArr, aFd1zSDK.getCurrencyIso4217Code(), aFd1zSDK.AFInAppEventType(), aFd1zSDK.copy(), aFd1zSDK.AFLogger(), str);
    }

    @VisibleForTesting
    @WorkerThread
    private void getRevenue(AFd1aSDK aFd1aSDK) {
        String str = this.equals;
        this.equals = this.component3.getCurrencyIso4217Code(new AFc1vSDK(aFd1aSDK.AFAdRevenueData, aFd1aSDK.AFAdRevenueData(), "6.18.1", this.getMediationNetwork, aFd1aSDK.getCurrencyIso4217Code));
        if (str != null) {
            this.component3.getMediationNetwork(str);
        }
    }

    public AFe1eSDK(@NonNull AFe1nSDK aFe1nSDK, @NonNull AFe1nSDK[] aFe1nSDKArr, @NonNull AFd1zSDK aFd1zSDK, @Nullable String str, @Nullable String str2) {
        this(aFe1nSDK, aFe1nSDKArr, aFd1zSDK.getCurrencyIso4217Code(), aFd1zSDK.AFInAppEventType(), aFd1zSDK.copy(), aFd1zSDK.AFLogger(), str);
        this.equals = str2;
    }
}
