package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1gSDK implements AFf1fSDK {

    @NotNull
    private final Context AFAdRevenueData;

    @NotNull
    private final AppsFlyerProperties getCurrencyIso4217Code;

    public AFf1gSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFAdRevenueData = context;
        this.getCurrencyIso4217Code = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    @Nullable
    public final AFf1cSDK getMonetizationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getCurrencyIso4217Code.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFAdRevenueData);
            int i7 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i10 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i11 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i7 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFf1cSDK(i11, i7, i10, i12, str);
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
            return null;
        }
    }
}
