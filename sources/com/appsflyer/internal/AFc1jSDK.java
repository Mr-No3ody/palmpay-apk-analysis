package com.appsflyer.internal;

import C0.G;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1jSDK implements AFc1qSDK {

    @NotNull
    private final AFc1gSDK<SharedPreferences> getCurrencyIso4217Code;

    @NotNull
    private final Lazy getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1jSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "m_", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends o implements Function0<SharedPreferences> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1jSDK.this.getCurrencyIso4217Code.getMonetizationNetwork.invoke();
        }
    }

    public AFc1jSDK(@NotNull AFc1gSDK<SharedPreferences> aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getCurrencyIso4217Code = aFc1gSDK;
        this.getRevenue = C2131j.b(new AnonymousClass4());
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(@Nullable String str, boolean z3) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putBoolean(str, z3).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    @Nullable
    public final String getCurrencyIso4217Code(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getString(str, str2);
        } catch (ClassCastException e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, G.o("Unexpected data type found for key ", str), e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(@Nullable String str) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getRevenue(@Nullable String str, long j6) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getLong(str, j6);
        } catch (ClassCastException e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, G.o("Unexpected data type found for key ", str), e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
            return j6;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean AFAdRevenueData(@Nullable String str) {
        return ((SharedPreferences) this.getRevenue.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMonetizationNetwork(@Nullable String str) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getBoolean(str, false);
        } catch (ClassCastException e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, G.o("Unexpected data type found for key ", str), e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getCurrencyIso4217Code(@Nullable String str, int i7) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putInt(str, i7).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(@Nullable String str, long j6) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putLong(str, j6).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int getMonetizationNetwork(@Nullable String str, int i7) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getInt(str, i7);
        } catch (ClassCastException e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, G.o("Unexpected data type found for key ", str), e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
            return i7;
        }
    }
}
