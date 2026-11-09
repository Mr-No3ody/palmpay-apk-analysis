package com.appsflyer.share;

import C0.G;
import N8.q0;
import android.content.Context;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1gSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;
import com.appsflyer.internal.AFj1cSDK;
import com.appsflyer.internal.AFk1zSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class LinkGenerator {
    private final String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String copy;
    private final Map<String, String> copydefault = new HashMap();
    String getCurrencyIso4217Code;
    private String getMediationNetwork;
    String getMonetizationNetwork;
    private String getRevenue;
    private String hashCode;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFAdRevenueData = str;
    }

    private Map<String, String> getMediationNetwork() {
        HashMap map = new HashMap();
        map.put("pid", this.AFAdRevenueData);
        String str = this.component3;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getMediationNetwork;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component4;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getRevenue;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.component2;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.areAllFieldsValid;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.copy != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.copy);
            String str7 = this.component1;
            if (str7 != null) {
                this.component1 = str7.replaceFirst("^[/]", "");
                sb2.append(this.copy.endsWith("/") ? "" : "/");
                sb2.append(this.component1);
            }
            map.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.copydefault.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1cSDK.getRevenue(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.copydefault.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.copydefault.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.getMonetizationNetwork;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(AFk1zSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getHostName()));
        } else {
            sb2.append(this.getMonetizationNetwork);
        }
        if (this.getCurrencyIso4217Code != null) {
            sb2.append('/');
            sb2.append(this.getCurrencyIso4217Code);
        }
        Map<String, String> mediationNetwork = getMediationNetwork();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : mediationNetwork.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.hashCode;
    }

    public String getCampaign() {
        return this.getRevenue;
    }

    public String getChannel() {
        return this.getMediationNetwork;
    }

    public String getMediaSource() {
        return this.AFAdRevenueData;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.copydefault);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.copy = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMonetizationNetwork = G.p("https://", q0.y(AppsFlyerLib.getInstance().getHostPrefix(), "app.", ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getHostName()), "/", str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.getMonetizationNetwork = G.p("https://", str2, "/", str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.hashCode = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getRevenue = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getMediationNetwork = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component3 = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.hashCode;
        Map<String, String> mediationNetwork = getMediationNetwork();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getMediationNetwork(context);
        AFd1zSDK revenue = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue();
        AFe1gSDK aFe1gSDK = new AFe1gSDK(revenue, UUID.randomUUID(), string, mediationNetwork, str, responseListener, this);
        AFe1tSDK aFe1tSDKCopydefault = revenue.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFe1gSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.2
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
