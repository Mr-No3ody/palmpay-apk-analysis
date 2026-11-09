package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AFa1tSDK {
    private final AFa1zSDK getCurrencyIso4217Code = new AFa1zSDK() { // from class: com.appsflyer.internal.AFa1tSDK.5
        @Override // com.appsflyer.internal.AFa1tSDK.AFa1zSDK
        public final Class<?> getCurrencyIso4217Code(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    public enum AFa1vSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        final String getMonetizationNetwork;
        final String getRevenue;

        AFa1vSDK(String str, String str2) {
            this.getMonetizationNetwork = str;
            this.getRevenue = str2;
        }
    }

    public interface AFa1zSDK {
        Class<?> getCurrencyIso4217Code(String str) throws ClassNotFoundException;
    }

    private boolean getMonetizationNetwork(String str) {
        try {
            this.getCurrencyIso4217Code.getCurrencyIso4217Code(str);
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is found.");
            AFLogger.afRDLog(sb2.toString());
            return true;
        } catch (ClassNotFoundException e10) {
            StringBuilder sb3 = new StringBuilder("Class: ");
            sb3.append(str);
            sb3.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb3.toString(), e10, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    public final String AFAdRevenueData() {
        for (AFa1vSDK aFa1vSDK : AFa1vSDK.values()) {
            if (getMonetizationNetwork(aFa1vSDK.getRevenue)) {
                return aFa1vSDK.getMonetizationNetwork;
            }
        }
        return AFa1vSDK.DEFAULT.getMonetizationNetwork;
    }
}
