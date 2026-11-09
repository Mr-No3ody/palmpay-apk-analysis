package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ExpandableListView;
import androidx.annotation.WorkerThread;
import com.appsflyer.migration.internal.MigrationDataProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1vSDK implements AFh1uSDK {

    @Nullable
    private JSONObject AFAdRevenueData;
    private boolean areAllFieldsValid;
    private boolean component2;

    @Nullable
    private Long getCurrencyIso4217Code;

    @NotNull
    private final AFj1rSDK getMediationNetwork;

    @NotNull
    private final AFc1pSDK getMonetizationNetwork;

    @Nullable
    private Long getRevenue;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1nSDK.values().length];
            try {
                iArr[AFe1nSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1nSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
        }
    }

    public AFh1vSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFj1rSDK aFj1rSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        this.getMonetizationNetwork = aFc1pSDK;
        this.getMediationNetwork = aFj1rSDK;
    }

    private final JSONObject getMonetizationNetwork() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (jSONObjectWaitForAttributionData != null) {
            this.getRevenue = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSONObjectWaitForAttributionData;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    @WorkerThread
    public final void AFAdRevenueData(@NotNull AFf1uSDK aFf1uSDK, @NotNull Function0<Unit> function0) {
        JSONObject monetizationNetwork;
        Intrinsics.checkNotNullParameter(aFf1uSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.getMonetizationNetwork.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) == 1 && aFf1uSDK.getMediationNetwork == AFe1nSDK.CONVERSION && this.getMediationNetwork.AFAdRevenueData() && !getCurrencyIso4217Code() && (monetizationNetwork = getMonetizationNetwork()) != null) {
            this.AFAdRevenueData = monetizationNetwork;
            function0.invoke();
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    @WorkerThread
    public final void getCurrencyIso4217Code(@NotNull AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        JSONObject jSONObject = this.AFAdRevenueData;
        if (jSONObject != null) {
            Intrinsics.e(jSONObject);
            getRevenue("attr", aFh1qSDK, jSONObject);
        } else {
            JSONObject monetizationNetwork = getMonetizationNetwork();
            if (monetizationNetwork != null) {
                getRevenue("attr", aFh1qSDK, monetizationNetwork);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getRevenue(@NotNull AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            getRevenue("attr", aFh1qSDK, attributionData);
            this.areAllFieldsValid = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void u_(@NotNull Intent intent, @NotNull AFa1mSDK aFa1mSDK) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component2 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1mSDK};
            Map map = AFa1jSDK.unregisterClient;
            Object declaredConstructor = map.get(1376270842);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1jSDK.getMonetizationNetwork(38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (char) (Process.myPid() >> 22))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                map.put(1376270842, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
            Object method = map.get(361466375);
            if (method == null) {
                method = ((Class) AFa1jSDK.getMonetizationNetwork(37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getOffsetAfter("", 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("getMediationNetwork", null);
                map.put(361466375, method);
            }
            Object objInvoke = ((Method) method).invoke(objNewInstance, null);
            Object method2 = map.get(-1068271674);
            if (method2 == null) {
                method2 = ((Class) AFa1jSDK.getMonetizationNetwork(TextUtils.getOffsetAfter("", 0) + 51, ImageFormat.getBitsPerPixel(0) + 38, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22660))).getMethod("getMediationNetwork", null);
                map.put(-1068271674, method2);
            }
            this.component2 = !((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void getRevenue(String str, AFh1qSDK aFh1qSDK, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put(str, jSONObject);
        HashMap map2 = new HashMap();
        map2.put("branch", map);
        HashMap map3 = new HashMap();
        map3.put("external", map2);
        aFh1qSDK.getCurrencyIso4217Code(map3);
        Map<String, Object> map4 = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        AFe1nSDK currencyIso4217Code = aFh1qSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        getRevenue(map4, currencyIso4217Code);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    @WorkerThread
    public final void getMonetizationNetwork(@NotNull AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (jSONObjectWaitForDeepLinkingData != null) {
            this.getCurrencyIso4217Code = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            getRevenue("dl", aFh1qSDK, jSONObjectWaitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final boolean getCurrencyIso4217Code() {
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void AFAdRevenueData() {
        this.component2 = false;
        MigrationDataProvider.clear();
    }

    private final void getRevenue(Map<String, Object> map, AFe1nSDK aFe1nSDK) {
        Long l5;
        int i7 = AFa1ySDK.AFAdRevenueData[aFe1nSDK.ordinal()];
        if (i7 != 1) {
            l5 = i7 != 2 ? null : this.getRevenue;
        } else {
            l5 = this.getCurrencyIso4217Code;
        }
        if (l5 != null) {
            long jLongValue = l5.longValue();
            Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("migration", F.b(new Pair("delay", Long.valueOf(jLongValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final boolean getRevenue() {
        return this.component2;
    }
}
