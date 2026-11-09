package com.chuanyi.ad;

import C9.C0158z;
import android.app.Application;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;

/* JADX INFO: loaded from: classes.dex */
public class RNLibAdPlatformModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNLibAdPlatformModule";
    private final ReactApplicationContext reactContext;

    public RNLibAdPlatformModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNLibAdPlatform";
    }

    @ReactMethod
    public void initSDK(String str, String str2, String str3, String str4, String str5) {
        AdManager.AdConfiguration adConfiguration = new AdManager.AdConfiguration();
        adConfiguration.setUserId(str);
        adConfiguration.setEnv(3);
        adConfiguration.setAppChannel("googleplay");
        adConfiguration.setGaId("");
        AdManager.get().init((Application) this.reactContext.getBaseContext(), str2, str3, str4, str5, adConfiguration);
    }

    @ReactMethod
    public void showInterstitialAdView(String str, Callback callback) {
        new InterstitialAdView(str, new C0158z(callback, 15)).show(getCurrentActivity());
    }
}
