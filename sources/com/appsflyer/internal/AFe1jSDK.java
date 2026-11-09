package com.appsflyer.internal;

import C0.G;
import N8.q0;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000e\u0010\u0019J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u0014\u001a\u00020\u001b*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u0014\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0014\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\tR\u001b\u0010\u000e\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\tR\u0014\u0010#\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0015\u0010*\u001a\u00020\u00138BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b*\u0010&"}, d2 = {"Lcom/appsflyer/internal/AFe1jSDK;", "Lcom/appsflyer/internal/AFe1sSDK;", "Lcom/appsflyer/internal/AFh1sSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;)V", "", "equals", "()Z", "", "AFAdRevenueData", "(I)Z", "getMediationNetwork", "getMonetizationNetwork", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;)Z", "", "getRevenue", "()J", "Lcom/appsflyer/internal/AFe1qSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFe1qSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1sSDK;Ljava/lang/String;)V", "component1", "Lcom/appsflyer/internal/AFh1sSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "component3", "Lcom/appsflyer/internal/AFc1eSDK;", "Lcom/appsflyer/internal/AFc1pSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFc1pSDK;", "copy", "Lkotlin/Lazy;", "component2", "Lcom/appsflyer/internal/AFc1fSDK;", "Lcom/appsflyer/internal/AFc1fSDK;", "component4", "AFa1zSDK", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFetchAdvertisingIdTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n39#2:397\n1#3:398\n*S KotlinDebug\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n*L\n202#1:397\n*E\n"})
public final class AFe1jSDK extends AFe1sSDK<AFh1sSDK> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK getRevenue;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AFh1sSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AFc1fSDK areAllFieldsValid;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFc1eSDK getMediationNetwork;

    @NotNull
    private final Lazy component4;

    /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1jSDK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends o implements Function0<Long> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            Long lU;
            String monetizationNetwork = AFe1jSDK.this.getRevenue.getMonetizationNetwork("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((monetizationNetwork == null || (lU = StringsKt.U(monetizationNetwork)) == null) ? 1000L : lU.longValue());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1jSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends o implements Function0<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1jSDK.this.getRevenue.getMonetizationNetwork("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1vSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1vSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFg1gSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, G.o("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AFa1vSDK {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public AFa1vSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1vSDK copy$default(AFa1vSDK aFa1vSDK, String str, Boolean bool, boolean z3, StringBuilder sb2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = aFa1vSDK.advertisingId;
            }
            if ((i7 & 2) != 0) {
                bool = aFa1vSDK.isLimitAdTrackingEnabled;
            }
            if ((i7 & 4) != 0) {
                z3 = aFa1vSDK.advertisingIdWithGps;
            }
            if ((i7 & 8) != 0) {
                sb2 = aFa1vSDK.gaidError;
            }
            return aFa1vSDK.copy(str, bool, z3, sb2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1vSDK copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1vSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) other;
            return Intrinsics.c(this.advertisingId, aFa1vSDK.advertisingId) && Intrinsics.c(this.isLimitAdTrackingEnabled, aFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1vSDK.advertisingIdWithGps && Intrinsics.c(this.gaidError, aFa1vSDK.gaidError);
        }

        @JvmName(name = "getAdvertisingId")
        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @JvmName(name = "getAdvertisingIdWithGps")
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @JvmName(name = "getGaidError")
        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z3 = this.advertisingIdWithGps;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            return this.gaidError.hashCode() + ((iHashCode2 + r3) * 31);
        }

        @JvmName(name = "isLimitAdTrackingEnabled")
        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @JvmName(name = "setAdvertisingId")
        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        @JvmName(name = "setAdvertisingIdWithGps")
        public final void setAdvertisingIdWithGps(boolean z3) {
            this.advertisingIdWithGps = z3;
        }

        @JvmName(name = "setLimitAdTrackingEnabled")
        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1vSDK(@Nullable String str, @Nullable Boolean bool, boolean z3, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z3;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1vSDK(String str, Boolean bool, boolean z3, StringBuilder sb2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : bool, (i7 & 4) != 0 ? false : z3, (i7 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(@NotNull AFd1zSDK aFd1zSDK) {
        super(AFe1nSDK.FETCH_ADVERTISING_ID, new AFe1nSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        AFc1eSDK aFc1eSDKAFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKAFInAppEventParameterName, "");
        this.getMediationNetwork = aFc1eSDKAFInAppEventParameterName;
        AFc1pSDK monetizationNetwork = aFd1zSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.getRevenue = monetizationNetwork;
        AFc1fSDK aFc1fSDKI = aFd1zSDK.i();
        Intrinsics.checkNotNullExpressionValue(aFc1fSDKI, "");
        this.areAllFieldsValid = aFc1fSDKI;
        this.getCurrencyIso4217Code = new AFh1sSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component4 = C2131j.b(new AnonymousClass1());
        this.getMonetizationNetwork = C2131j.b(new AnonymousClass2());
    }

    @JvmName(name = "component2")
    private final boolean component2() {
        return ((Boolean) this.getMonetizationNetwork.getValue()).booleanValue();
    }

    @JvmName(name = "component3")
    private static boolean component3() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : G.o("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, null);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    private final boolean equals() {
        boolean z3 = false;
        for (int i7 = 2; i7 > 0; i7--) {
            if (component2() && getMonetizationNetwork(i7)) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                if (AFAdRevenueData(i7)) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
            }
            z3 = true;
            if (!z3) {
                break;
                break;
            }
        }
        this.areAllFieldsValid.areAllFieldsValid = this.getCurrencyIso4217Code;
        return z3;
    }

    private static int getMonetizationNetwork(Context p3) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p3);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @VisibleForTesting(otherwise = 4)
    @NotNull
    public final AFe1qSDK getCurrencyIso4217Code() {
        if (this.areAllFieldsValid.getCurrencyIso4217Code()) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1qSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(equals());
        Boolean bool = Boolean.FALSE;
        AFe1qSDK aFe1qSDK = C1850q.h(boolValueOf, bool, bool).contains(Boolean.TRUE) ? AFe1qSDK.SUCCESS : AFe1qSDK.FAILURE;
        AFc1fSDK aFc1fSDK = this.areAllFieldsValid;
        AFd1bSDK aFd1bSDK = new AFd1bSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1bSDK.getCurrencyIso4217Code + "ms", false, 4, null);
        aFc1fSDK.getRevenue(aFd1bSDK);
        return aFe1qSDK;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @VisibleForTesting(otherwise = 4)
    public final long getRevenue() {
        return ((Number) this.component4.getValue()).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    private final boolean AFAdRevenueData(int p3) {
        boolean z3;
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
        Context context = this.getMediationNetwork.getRevenue;
        Intrinsics.e(context);
        int monetizationNetwork = getMonetizationNetwork(context);
        Context context2 = this.getMediationNetwork.getRevenue;
        Intrinsics.e(context2);
        if (!AFAdRevenueData(context2, aFa1vSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getMediationNetwork.getRevenue;
                Intrinsics.e(context3);
                if (getMonetizationNetwork(context3, aFa1vSDK)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            String string = aFa1vSDK.getGaidError().toString();
            if (string != null && !StringsKt.F(string)) {
                string = monetizationNetwork + ": " + StringsKt.V(string).toString();
            }
            getRevenue(this.getCurrencyIso4217Code, string);
            if (!z3) {
                return false;
            }
        }
        AFh1sSDK aFh1sSDK = this.getCurrencyIso4217Code;
        aFh1sSDK.getMonetizationNetwork = aFa1vSDK.getAdvertisingId();
        aFh1sSDK.component3 = aFa1vSDK.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = aFa1vSDK.isLimitAdTrackingEnabled();
        aFh1sSDK.AFAdRevenueData = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        aFh1sSDK.getRevenue = Boolean.valueOf(aFa1vSDK.getAdvertisingIdWithGps());
        aFh1sSDK.getMediationNetwork = Boolean.FALSE;
        aFh1sSDK.component2 = Boolean.valueOf(p3 != 2);
        return true;
    }

    @RequiresApi(23)
    private final boolean getMediationNetwork(int p3) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component3()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getMediationNetwork.getRevenue;
            Intrinsics.e(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getMediationNetwork.getRevenue;
                    Intrinsics.e(context2);
                    cloudDevSdk2.request(context2, C1849p.c("gaid"), new AFa1uSDK(aFa1vSDK, countDownLatch));
                    countDownLatch.await(((Number) this.component4.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1vSDK.getGaidError().length() > 0) {
                        getRevenue(this.getCurrencyIso4217Code, aFa1vSDK.getGaidError().toString());
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, null);
                        StringBuilder gaidError = aFa1vSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1vSDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th2) {
                        if (aFa1vSDK.getGaidError().length() > 0) {
                            getRevenue(this.getCurrencyIso4217Code, aFa1vSDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
                String advertisingId = aFa1vSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1sSDK aFh1sSDK = this.getCurrencyIso4217Code;
                aFh1sSDK.getMonetizationNetwork = aFa1vSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1sSDK.component3 = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1sSDK.AFAdRevenueData = bool2;
                aFh1sSDK.getRevenue = bool;
                aFh1sSDK.getMediationNetwork = bool2;
                aFh1sSDK.component2 = Boolean.valueOf(p3 != 2);
                return true;
            }
        }
        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private static void getRevenue(AFh1sSDK aFh1sSDK, String str) {
        String strY;
        if (str == null) {
            return;
        }
        String str2 = aFh1sSDK.getCurrencyIso4217Code;
        if (str2 != null && (strY = q0.y(str2, " | ", str)) != null) {
            str = strY;
        }
        aFh1sSDK.getCurrencyIso4217Code = str;
    }

    private final boolean getMonetizationNetwork(Context p3, AFa1vSDK p10) throws IllegalStateException {
        try {
            AFb1qSDK.AFa1zSDK monetizationNetwork = AFb1qSDK.getMonetizationNetwork(p3);
            p10.setAdvertisingId(monetizationNetwork.AFAdRevenueData);
            p10.setLimitAdTrackingEnabled(Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            String advertisingId = p10.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p10.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.f38893a != null) {
                return true;
            }
            p10.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, G.o("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p10.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean getMonetizationNetwork(int p3) {
        return getMediationNetwork(p3);
    }

    private final boolean AFAdRevenueData(Context p3, AFa1vSDK p10) throws IllegalStateException {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p3);
            if (advertisingIdInfo != null) {
                p10.setAdvertisingId(advertisingIdInfo.getId());
                p10.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p10.setAdvertisingIdWithGps(true);
                String advertisingId = p10.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p10.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p10.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, G.o("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p10.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }
}
