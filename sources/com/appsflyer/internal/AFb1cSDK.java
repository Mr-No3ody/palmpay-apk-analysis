package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK implements AFb1gSDK {

    @NotNull
    private final AFf1jSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1eSDK getMonetizationNetwork;

    @NotNull
    private final AFc1fSDK getRevenue;

    public AFb1cSDK(@NotNull AFc1fSDK aFc1fSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AFf1jSDK aFf1jSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFf1jSDK, "");
        this.getRevenue = aFc1fSDK;
        this.getMonetizationNetwork = aFc1eSDK;
        this.getCurrencyIso4217Code = aFf1jSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        AFc1fSDK aFc1fSDK = aFb1cSDK.getRevenue;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "");
        aFc1fSDK.toString = new AFb1hSDK(scope, id2);
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final boolean getCurrencyIso4217Code() {
        return !this.getCurrencyIso4217Code.getMediationNetwork() && !this.getRevenue.getMonetizationNetwork() && AFj1gSDK.AFAdRevenueData(this.getMonetizationNetwork.getRevenue) && AFj1gSDK.getMediationNetwork(this.getMonetizationNetwork.getRevenue);
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getRevenue;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.appsflyer.internal.e
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AFb1cSDK.getRevenue(this.f20410a, (AppSetIdInfo) obj);
                    }
                }), "");
            } catch (Throwable th) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
                Unit unit = Unit.f38893a;
            }
        }
    }
}
