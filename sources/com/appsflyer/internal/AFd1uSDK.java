package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.util.Constants;
import com.google.mlkit.common.MlKitException;
import com.luck.picture.lib.config.FileSizeUnit;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1uSDK implements AFd1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 0;
    private static int hashCode = 1;
    private static int toString = 103677027;

    @NotNull
    private final Lazy AFAdRevenueData;

    @NotNull
    private final Lazy areAllFieldsValid;

    @NotNull
    private final Lazy component1;

    @NotNull
    private final String component2;

    @Nullable
    private AFd1ySDK.AFa1vSDK component3;

    @NotNull
    private final Lazy component4;

    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @NotNull
    private final Lazy getMediationNetwork;

    @NotNull
    private final Lazy getMonetizationNetwork;

    @NotNull
    private AFd1zSDK getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1pSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1pSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends o implements Function0<AFc1pSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1pSDK invoke() {
            AFc1pSDK monetizationNetwork = AFd1uSDK.getRevenue(AFd1uSDK.this).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getMonetizationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends o implements Function0<ExecutorService> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService executorServiceAFAdRevenueData = AFd1uSDK.getRevenue(AFd1uSDK.this).AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(executorServiceAFAdRevenueData, "");
            return executorServiceAFAdRevenueData;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1xSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1xSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends o implements Function0<AFd1xSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFd1xSDK invoke() {
            AFc1eSDK aFc1eSDKAFInAppEventParameterName = AFd1uSDK.getRevenue(AFd1uSDK.this).AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(aFc1eSDKAFInAppEventParameterName, "");
            return new AFd1xSDK(aFc1eSDKAFInAppEventParameterName);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1qSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends o implements Function0<AFc1qSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1qSDK invoke() {
            AFc1qSDK revenue = AFd1uSDK.getRevenue(AFd1uSDK.this).getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            return revenue;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK;", "getMonetizationNetwork", "()Lcom/appsflyer/internal/AFf1pSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends o implements Function0<AFf1pSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFf1pSDK invoke() {
            AFf1pSDK aFf1pSDKComponent4 = AFd1uSDK.getRevenue(AFd1uSDK.this).component4();
            Intrinsics.checkNotNullExpressionValue(aFf1pSDKComponent4, "");
            return aFf1pSDKComponent4;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1jSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFf1jSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass7 extends o implements Function0<AFf1jSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFf1jSDK invoke() {
            AFf1jSDK aFf1jSDKAFInAppEventType = AFd1uSDK.getRevenue(AFd1uSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(aFf1jSDKAFInAppEventType, "");
            return aFf1jSDKAFInAppEventType;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1uSDK$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1vSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1vSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass8 extends o implements Function0<AFd1vSDK> {
        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFd1vSDK invoke() {
            return new AFd1vSDK(AFd1uSDK.this.AFAdRevenueData());
        }
    }

    public AFd1uSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getRevenue = aFd1zSDK;
        this.AFAdRevenueData = C2131j.b(new AnonymousClass5());
        this.getCurrencyIso4217Code = C2131j.b(new AnonymousClass1());
        this.getMediationNetwork = C2131j.b(new AnonymousClass4());
        this.getMonetizationNetwork = C2131j.b(new AnonymousClass7());
        this.component1 = C2131j.b(new AnonymousClass2());
        this.component2 = "6.18.1";
        this.component4 = C2131j.b(new AnonymousClass3());
        this.areAllFieldsValid = C2131j.b(new AnonymousClass8());
    }

    private final AFh1aSDK areAllFieldsValid() {
        AFi1zSDK aFi1zSDK = getRevenue().getMonetizationNetwork.getMonetizationNetwork;
        if (aFi1zSDK != null) {
            hashCode = (equals + 117) % 128;
            AFh1bSDK aFh1bSDK = aFi1zSDK.getMediationNetwork;
            if (aFh1bSDK != null) {
                return aFh1bSDK.AFAdRevenueData;
            }
        }
        int i7 = hashCode + 47;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @NotNull
    private AFd1wSDK component1() {
        return (AFd1wSDK) getRevenue(new Object[]{this}, -1457409597, 1457409598, System.identityHashCode(this));
    }

    private final ExecutorService component2() {
        equals = (hashCode + 37) % 128;
        ExecutorService executorService = (ExecutorService) this.component1.getValue();
        hashCode = (equals + 81) % 128;
        return executorService;
    }

    private final AFc1qSDK component3() {
        equals = (hashCode + 101) % 128;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) this.getMediationNetwork.getValue();
        equals = (hashCode + 33) % 128;
        return aFc1qSDK;
    }

    private final AFf1jSDK component4() {
        hashCode = (equals + 83) % 128;
        AFf1jSDK aFf1jSDK = (AFf1jSDK) this.getMonetizationNetwork.getValue();
        equals = (hashCode + 105) % 128;
        return aFf1jSDK;
    }

    private final synchronized void copy() {
        boolean revenue;
        try {
            AFh1aSDK aFh1aSDKAreAllFieldsValid = areAllFieldsValid();
            if (aFh1aSDKAreAllFieldsValid != null) {
                int i7 = hashCode + 101;
                equals = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (aFh1aSDKAreAllFieldsValid.AFAdRevenueData == -1) {
                    component3().getMediationNetwork("af_send_exc_to_server_window");
                } else if (component3().getRevenue("af_send_exc_to_server_window", -1L) == -1) {
                    AFAdRevenueData(aFh1aSDKAreAllFieldsValid);
                }
                revenue = getRevenue(aFh1aSDKAreAllFieldsValid);
                throw th;
            }
            revenue = false;
            AFd1ySDK.AFa1vSDK aFa1vSDK = this.component3;
            if (aFa1vSDK != null) {
                int i10 = equals + 123;
                hashCode = i10 % 128;
                if (i10 % 2 != 0) {
                    aFa1vSDK.onConfigurationChanged(revenue);
                } else {
                    aFa1vSDK.onConfigurationChanged(revenue);
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e7 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb A[Catch: all -> 0x000a, PHI: r0
      0x00eb: PHI (r0v39 java.lang.String) = (r0v38 java.lang.String), (r0v42 java.lang.String) binds: [B:69:0x00e9, B:64:0x00e2] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0157 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0179 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0199 A[Catch: all -> 0x000a, TryCatch #4 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001d, B:14:0x003b, B:16:0x0042, B:18:0x0049, B:20:0x0051, B:22:0x0055, B:24:0x0067, B:26:0x0070, B:28:0x007b, B:30:0x007f, B:32:0x0087, B:34:0x008d, B:43:0x009c, B:45:0x00a8, B:47:0x00b3, B:49:0x00b7, B:51:0x00bd, B:57:0x00c6, B:59:0x00d2, B:61:0x00dd, B:70:0x00eb, B:72:0x00f7, B:74:0x0105, B:76:0x0108, B:78:0x010e, B:80:0x0114, B:82:0x0118, B:84:0x011e, B:86:0x0124, B:88:0x0128, B:90:0x012e, B:94:0x013f, B:101:0x01ba, B:103:0x01be, B:105:0x01c4, B:106:0x01c8, B:96:0x0157, B:98:0x0179, B:99:0x0199, B:91:0x0137, B:67:0x00e6, B:68:0x00e7, B:55:0x00c4, B:35:0x0092, B:38:0x0097, B:41:0x009a, B:100:0x01aa, B:53:0x00c2, B:63:0x00e1, B:36:0x0095, B:39:0x0098), top: B:121:0x0001, inners: #0, #1, #2, #3 }] */
    private final synchronized void copydefault() {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        int i7;
        int iIntValue;
        int i10;
        MatchGroup matchGroup;
        int iIntValue2;
        MatchGroup matchGroup2;
        int iIntValue3;
        int i11;
        int i12;
        String str4;
        Integer intOrNull;
        int i13;
        String str5;
        Integer intOrNull2;
        try {
            AFh1aSDK aFh1aSDKAreAllFieldsValid = areAllFieldsValid();
            if ((aFh1aSDKAreAllFieldsValid != null ? aFh1aSDKAreAllFieldsValid.getMediationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                component3().getMediationNetwork("af_send_exc_to_server_window");
                AFAdRevenueData().AFAdRevenueData();
                return;
            }
            AFh1aSDK aFh1aSDKAreAllFieldsValid2 = areAllFieldsValid();
            if (aFh1aSDKAreAllFieldsValid2 == null || !getCurrencyIso4217Code(aFh1aSDKAreAllFieldsValid2)) {
                component3().getMediationNetwork("af_send_exc_to_server_window");
                AFAdRevenueData().AFAdRevenueData();
            } else {
                AFh1aSDK aFh1aSDKAreAllFieldsValid3 = areAllFieldsValid();
                Pair<Integer, Integer> currencyIso4217Code = null;
                if (aFh1aSDKAreAllFieldsValid3 == null || (str3 = aFh1aSDKAreAllFieldsValid3.getRevenue) == null) {
                    numValueOf = null;
                } else {
                    Intrinsics.checkNotNullParameter(str3, "");
                    kotlin.text.o oVarA = new Regex("(\\d+).(\\d+).(\\d+).*").a(str3);
                    if (oVarA != null) {
                        MatchGroup matchGroup3 = oVarA.f39033c.get(1);
                        if (matchGroup3 != null) {
                            int i14 = equals;
                            int i15 = i14 + 51;
                            hashCode = i15 % 128;
                            if (i15 % 2 == 0) {
                                throw null;
                            }
                            String str6 = matchGroup3.f38998a;
                            if (str6 != null) {
                                int i16 = i14 + 1;
                                hashCode = i16 % 128;
                                if (i16 % 2 == 0) {
                                    StringsKt.toIntOrNull(str6);
                                    throw null;
                                }
                                Integer intOrNull3 = StringsKt.toIntOrNull(str6);
                                if (intOrNull3 != null) {
                                    iIntValue = intOrNull3.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                i10 = iIntValue * FileSizeUnit.ACCURATE_MB;
                                matchGroup = oVarA.f39033c.get(2);
                                if (matchGroup != null) {
                                    i13 = equals + 73;
                                    hashCode = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        throw null;
                                    }
                                    str5 = matchGroup.f38998a;
                                    if (str5 != null || (intOrNull2 = StringsKt.toIntOrNull(str5)) == null) {
                                        iIntValue2 = 0;
                                    } else {
                                        iIntValue2 = intOrNull2.intValue();
                                    }
                                    int i17 = (iIntValue2 * 1000) + i10;
                                    matchGroup2 = oVarA.f39033c.get(3);
                                    if (matchGroup2 != null) {
                                        i11 = hashCode;
                                        i12 = i11 + 97;
                                        equals = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            str4 = matchGroup2.f38998a;
                                            int i18 = 77 / 0;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        } else {
                                            str4 = matchGroup2.f38998a;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        }
                                        iIntValue3 = 0;
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    i7 = i17 + iIntValue3;
                                } else {
                                    iIntValue2 = 0;
                                    int i19 = (iIntValue2 * 1000) + i10;
                                    matchGroup2 = oVarA.f39033c.get(3);
                                    if (matchGroup2 != null) {
                                        i11 = hashCode;
                                        i12 = i11 + 97;
                                        equals = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            str4 = matchGroup2.f38998a;
                                            int i110 = 77 / 0;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        } else {
                                            str4 = matchGroup2.f38998a;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        }
                                        iIntValue3 = 0;
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    i7 = i19 + iIntValue3;
                                }
                            } else {
                                iIntValue = 0;
                                i10 = iIntValue * FileSizeUnit.ACCURATE_MB;
                                matchGroup = oVarA.f39033c.get(2);
                                if (matchGroup != null) {
                                    i13 = equals + 73;
                                    hashCode = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        throw null;
                                    }
                                    str5 = matchGroup.f38998a;
                                    if (str5 != null) {
                                        iIntValue2 = 0;
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    int i111 = (iIntValue2 * 1000) + i10;
                                    matchGroup2 = oVarA.f39033c.get(3);
                                    if (matchGroup2 != null) {
                                        i11 = hashCode;
                                        i12 = i11 + 97;
                                        equals = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            str4 = matchGroup2.f38998a;
                                            int i112 = 77 / 0;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        } else {
                                            str4 = matchGroup2.f38998a;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        }
                                        iIntValue3 = 0;
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    i7 = i111 + iIntValue3;
                                } else {
                                    iIntValue2 = 0;
                                    int i113 = (iIntValue2 * 1000) + i10;
                                    matchGroup2 = oVarA.f39033c.get(3);
                                    if (matchGroup2 != null) {
                                        i11 = hashCode;
                                        i12 = i11 + 97;
                                        equals = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            str4 = matchGroup2.f38998a;
                                            int i114 = 77 / 0;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        } else {
                                            str4 = matchGroup2.f38998a;
                                            if (str4 != null) {
                                                equals = (i11 + 95) % 128;
                                                intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null) {
                                                    equals = (hashCode + 25) % 128;
                                                    iIntValue3 = intOrNull.intValue();
                                                }
                                            }
                                        }
                                        iIntValue3 = 0;
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    i7 = i113 + iIntValue3;
                                }
                            }
                            throw th;
                        }
                        iIntValue = 0;
                        i10 = iIntValue * FileSizeUnit.ACCURATE_MB;
                        matchGroup = oVarA.f39033c.get(2);
                        if (matchGroup != null) {
                            i13 = equals + 73;
                            hashCode = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                            str5 = matchGroup.f38998a;
                            if (str5 != null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = 0;
                            }
                            int i115 = (iIntValue2 * 1000) + i10;
                            matchGroup2 = oVarA.f39033c.get(3);
                            if (matchGroup2 != null) {
                                i11 = hashCode;
                                i12 = i11 + 97;
                                equals = i12 % 128;
                                if (i12 % 2 != 0) {
                                    str4 = matchGroup2.f38998a;
                                    int i116 = 77 / 0;
                                    if (str4 != null) {
                                        equals = (i11 + 95) % 128;
                                        intOrNull = StringsKt.toIntOrNull(str4);
                                        if (intOrNull != null) {
                                            equals = (hashCode + 25) % 128;
                                            iIntValue3 = intOrNull.intValue();
                                        }
                                    }
                                } else {
                                    str4 = matchGroup2.f38998a;
                                    if (str4 != null) {
                                        equals = (i11 + 95) % 128;
                                        intOrNull = StringsKt.toIntOrNull(str4);
                                        if (intOrNull != null) {
                                            equals = (hashCode + 25) % 128;
                                            iIntValue3 = intOrNull.intValue();
                                        }
                                    }
                                }
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            i7 = i115 + iIntValue3;
                            throw th;
                        }
                        iIntValue2 = 0;
                        int i117 = (iIntValue2 * 1000) + i10;
                        matchGroup2 = oVarA.f39033c.get(3);
                        if (matchGroup2 != null) {
                            i11 = hashCode;
                            i12 = i11 + 97;
                            equals = i12 % 128;
                            if (i12 % 2 != 0) {
                                str4 = matchGroup2.f38998a;
                                int i118 = 77 / 0;
                                if (str4 != null) {
                                    equals = (i11 + 95) % 128;
                                    intOrNull = StringsKt.toIntOrNull(str4);
                                    if (intOrNull != null) {
                                        equals = (hashCode + 25) % 128;
                                        iIntValue3 = intOrNull.intValue();
                                    }
                                }
                            } else {
                                str4 = matchGroup2.f38998a;
                                if (str4 != null) {
                                    equals = (i11 + 95) % 128;
                                    intOrNull = StringsKt.toIntOrNull(str4);
                                    if (intOrNull != null) {
                                        equals = (hashCode + 25) % 128;
                                        iIntValue3 = intOrNull.intValue();
                                    }
                                }
                            }
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = 0;
                        }
                        i7 = i117 + iIntValue3;
                    } else {
                        i7 = -1;
                    }
                    numValueOf = Integer.valueOf(i7);
                }
                AFh1aSDK aFh1aSDKAreAllFieldsValid4 = areAllFieldsValid();
                Pair<Integer, Integer> monetizationNetwork = (aFh1aSDKAreAllFieldsValid4 == null || (str2 = aFh1aSDKAreAllFieldsValid4.getRevenue) == null) ? null : AFd1rSDK.getMonetizationNetwork(str2);
                AFh1aSDK aFh1aSDKAreAllFieldsValid5 = areAllFieldsValid();
                if (aFh1aSDKAreAllFieldsValid5 != null && (str = aFh1aSDKAreAllFieldsValid5.getRevenue) != null) {
                    currencyIso4217Code = AFd1rSDK.getCurrencyIso4217Code(str);
                }
                if (numValueOf == null) {
                    equals = (hashCode + 47) % 128;
                } else if (numValueOf.intValue() == -1) {
                    if (monetizationNetwork != null) {
                        AFAdRevenueData().AFAdRevenueData(((Number) monetizationNetwork.f38891a).intValue(), ((Number) monetizationNetwork.f38892b).intValue());
                        hashCode = (equals + 55) % 128;
                    } else if (currencyIso4217Code != null) {
                        hashCode = (equals + 27) % 128;
                        AFAdRevenueData().AFAdRevenueData(((Number) currencyIso4217Code.f38891a).intValue(), ((Number) currencyIso4217Code.f38892b).intValue());
                    } else {
                        component3().getMediationNetwork("af_send_exc_to_server_window");
                        AFAdRevenueData().AFAdRevenueData();
                    }
                }
                if (monetizationNetwork == null) {
                    hashCode = (equals + 99) % 128;
                    AFAdRevenueData().getMediationNetwork(this.component2);
                } else if (monetizationNetwork != null) {
                    AFAdRevenueData().AFAdRevenueData(((Number) monetizationNetwork.f38891a).intValue(), ((Number) monetizationNetwork.f38892b).intValue());
                    hashCode = (equals + 55) % 128;
                } else if (currencyIso4217Code != null) {
                    hashCode = (equals + 27) % 128;
                    AFAdRevenueData().AFAdRevenueData(((Number) currencyIso4217Code.f38891a).intValue(), ((Number) currencyIso4217Code.f38892b).intValue());
                } else {
                    component3().getMediationNetwork("af_send_exc_to_server_window");
                    AFAdRevenueData().AFAdRevenueData();
                }
            }
            AFd1ySDK.AFa1vSDK aFa1vSDK = this.component3;
            if (aFa1vSDK != null) {
                AFh1aSDK aFh1aSDKAreAllFieldsValid6 = areAllFieldsValid();
                aFa1vSDK.onConfigurationChanged(aFh1aSDKAreAllFieldsValid6 != null ? getRevenue(aFh1aSDKAreAllFieldsValid6) : false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void equals() {
        getRevenue(new Object[]{this}, -177398088, 177398090, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1uSDK aFd1uSDK) {
        int i7 = hashCode + 115;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            aFd1uSDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            aFd1uSDK.copydefault();
            int i10 = 28 / 0;
        }
    }

    private final AFc1pSDK getMediationNetwork() {
        equals = (hashCode + 107) % 128;
        AFc1pSDK aFc1pSDK = (AFc1pSDK) this.getCurrencyIso4217Code.getValue();
        equals = (hashCode + 59) % 128;
        return aFc1pSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1uSDK aFd1uSDK, Throwable th, String str) {
        int i7 = equals + 77;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            aFd1uSDK.areAllFieldsValid();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDKAreAllFieldsValid = aFd1uSDK.areAllFieldsValid();
        if (aFh1aSDKAreAllFieldsValid == null || !aFd1uSDK.getRevenue(aFh1aSDKAreAllFieldsValid)) {
            return;
        }
        int i10 = equals + 107;
        hashCode = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        aFd1uSDK.AFAdRevenueData().getRevenue(th, str);
        equals = (hashCode + 87) % 128;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i7, int i10, int i11) {
        int i12 = ~i10;
        int i13 = ~i11;
        int i14 = (((~(i7 | i13)) | (~(i11 | (~i7))) | i12) * 45) + (((~(i10 | i7)) | (~(i12 | i11))) * (-45)) + (((~(i12 | i13)) | i7) * (-90)) + (i10 * 46) + (i7 * 46);
        if (i14 != 1) {
            if (i14 == 2) {
                return getCurrencyIso4217Code(objArr);
            }
            if (i14 != 3) {
                return i14 != 4 ? getMediationNetwork(objArr) : AFAdRevenueData(objArr);
            }
            return getRevenue(objArr);
        }
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        equals = (hashCode + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) aFd1uSDK.areAllFieldsValid.getValue();
        equals = (hashCode + 101) % 128;
        return aFd1wSDK;
    }

    @NotNull
    public final AFc1cSDK AFAdRevenueData() {
        int i7 = hashCode + 117;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component4.getValue();
        int i10 = hashCode + 15;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 0 / 0;
        }
        return aFc1cSDK;
    }

    private static void a(int i7, int i10, boolean z3, int i11, String str, Object[] objArr) {
        int i12;
        $11 = ($10 + 123) % 128;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = new char[i7];
        aFk1oSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i13 = aFk1oSDK.getCurrencyIso4217Code;
            if (i13 >= i7) {
                break;
            }
            char c6 = cArr[i13];
            aFk1oSDK.AFAdRevenueData = c6;
            char c10 = (char) (c6 + i11);
            cArr2[i13] = c10;
            cArr2[i13] = (char) (c10 - ((int) (((long) toString) ^ (-1047448725599945728L))));
            aFk1oSDK.getCurrencyIso4217Code = i13 + 1;
        }
        if (i10 > 0) {
            aFk1oSDK.getMonetizationNetwork = i10;
            char[] cArr3 = new char[i7];
            System.arraycopy(cArr2, 0, cArr3, 0, i7);
            int i14 = aFk1oSDK.getMonetizationNetwork;
            System.arraycopy(cArr3, 0, cArr2, i7 - i14, i14);
            int i15 = aFk1oSDK.getMonetizationNetwork;
            System.arraycopy(cArr3, i15, cArr2, 0, i7 - i15);
        }
        if (z3) {
            char[] cArr4 = new char[i7];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i16 = aFk1oSDK.getCurrencyIso4217Code;
                if (i16 >= i7) {
                    break;
                }
                int i17 = $10 + 7;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr4[i16] = cArr2[i7 >> i16];
                    i12 = i16 >> 1;
                } else {
                    cArr4[i16] = cArr2[(i7 - i16) - 1];
                    i12 = i16 + 1;
                }
                aFk1oSDK.getCurrencyIso4217Code = i12;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void AFAdRevenueData(@NotNull Throwable th, @NotNull String str) {
        int i7 = equals + 81;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            component2().execute(new androidx.emoji2.text.j(this, 6, th, str));
            int i10 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            component2().execute(new androidx.emoji2.text.j(this, 6, th, str));
        }
        hashCode = (equals + 93) % 128;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void getMediationNetwork(@Nullable AFd1ySDK.AFa1vSDK aFa1vSDK) {
        int i7 = equals + 121;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            this.component3 = aFa1vSDK;
            component2().execute(new i(this, 2));
        } else {
            this.component3 = aFa1vSDK;
            component2().execute(new i(this, 2));
            int i10 = 54 / 0;
        }
    }

    public static final /* synthetic */ AFd1zSDK getRevenue(AFd1uSDK aFd1uSDK) {
        int i7 = (hashCode + 77) % 128;
        equals = i7;
        AFd1zSDK aFd1zSDK = aFd1uSDK.getRevenue;
        int i10 = i7 + 19;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    private final AFf1pSDK getRevenue() {
        equals = (hashCode + 37) % 128;
        AFf1pSDK aFf1pSDK = (AFf1pSDK) this.AFAdRevenueData.getValue();
        int i7 = equals + 67;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            return aFf1pSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        equals = (hashCode + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        getRevenue(new Object[]{aFd1uSDK}, -177398088, 177398090, System.identityHashCode(aFd1uSDK));
        int i7 = hashCode + 123;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void getCurrencyIso4217Code() {
        hashCode = (equals + 101) % 128;
        component2().execute(new i(this, 1));
        int i7 = hashCode + 23;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 35 / 0;
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        int i7 = equals + MsgEvent.MSG_EVENT_STOP_FOREGROUND;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            aFd1uSDK.copy();
            int i10 = 42 / 0;
        } else {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            aFd1uSDK.copy();
        }
        int i11 = hashCode + 53;
        equals = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 22 / 0;
        }
        return null;
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<AFc1bSDK> list) {
        equals = (hashCode + 83) % 128;
        Map<String, Object> mapG = G.g(new Pair(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, map), new Pair("excs", AFd1sSDK.getCurrencyIso4217Code(list)));
        int i7 = equals + 125;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            return mapG;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        int i7 = hashCode + 117;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            AFh1aSDK aFh1aSDKAreAllFieldsValid = aFd1uSDK.areAllFieldsValid();
            if (aFh1aSDKAreAllFieldsValid != null) {
                if (!(!aFd1uSDK.getMediationNetwork(aFh1aSDKAreAllFieldsValid))) {
                    equals = (hashCode + 61) % 128;
                    String revenue = aFd1uSDK.component4().getRevenue();
                    if (revenue != null) {
                        String string = new JSONObject(getMediationNetwork(aFd1uSDK.getMonetizationNetwork(aFh1aSDKAreAllFieldsValid), aFd1uSDK.AFAdRevenueData().getMediationNetwork())).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        Intrinsics.checkNotNullExpressionValue(revenue, "");
                        aFd1uSDK.getRevenue(string, revenue);
                    }
                    return null;
                }
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            }
            return null;
        }
        aFd1uSDK.areAllFieldsValid();
        throw null;
    }

    @WorkerThread
    private final void getRevenue(String str, String str2) {
        hashCode = (equals + 39) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        ((AFd1wSDK) getRevenue(new Object[]{this}, -1457409597, 1457409598, System.identityHashCode(this))).AFAdRevenueData(bytes, com.airbnb.lottie.model.layer.d.q(HttpHeaders.AUTHORIZATION, AFj1dSDK.getRevenue(str, str2)), Constants.MAX_URL_LENGTH);
        hashCode = (equals + 107) % 128;
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void getMonetizationNetwork() {
        hashCode = (equals + 75) % 128;
        component2().execute(new i(this, 0));
        int i7 = hashCode + 13;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 39 / 0;
        }
    }

    private final Map<String, String> getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a(5 - View.resolveSize(0, 0), 5 - (KeyEvent.getMaxKeyCode() >> 16), true, Color.red(0) + MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, "�\u0007\ufffa\u000b\ufffb", objArr);
        Map<String, String> mapG = G.g(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getCurrencyIso4217Code.getRevenue.getPackageName()), new Pair("p_ex", new AFa1tSDK().AFAdRevenueData()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component2), new Pair("uid", AFb1mSDK.getMonetizationNetwork(getMediationNetwork().AFAdRevenueData)), new Pair("exc_config", aFh1aSDK.AFAdRevenueData()));
        int i7 = hashCode + 83;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return mapG;
        }
        throw null;
    }

    private final boolean getMediationNetwork(AFh1aSDK aFh1aSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long revenue = component3().getRevenue("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            hashCode = (equals + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
            return false;
        }
        if (revenue != -1 && revenue >= jCurrentTimeMillis) {
            int monetizationNetwork = component3().getMonetizationNetwork("af_send_exc_min", -1);
            if (monetizationNetwork == -1 || AFAdRevenueData().getMonetizationNetwork() < monetizationNetwork) {
                return false;
            }
            return getCurrencyIso4217Code(aFh1aSDK);
        }
        hashCode = (equals + 95) % 128;
        return false;
    }

    private final void AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        equals = (hashCode + 113) % 128;
        int i7 = aFh1aSDK.getMonetizationNetwork;
        long millis = TimeUnit.DAYS.toMillis(aFh1aSDK.AFAdRevenueData) + System.currentTimeMillis();
        AFc1qSDK aFc1qSDKComponent3 = component3();
        aFc1qSDKComponent3.getMonetizationNetwork("af_send_exc_to_server_window", millis);
        aFc1qSDKComponent3.getCurrencyIso4217Code("af_send_exc_min", i7);
        int i10 = equals + 35;
        hashCode = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private final boolean getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        new AFd1tSDK();
        String str = this.component2;
        String str2 = aFh1aSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean zAFAdRevenueData = AFd1tSDK.AFAdRevenueData(str, str2);
        int i7 = equals + 65;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            return zAFAdRevenueData;
        }
        throw null;
    }

    private final boolean getRevenue(AFh1aSDK aFh1aSDK) {
        return ((Boolean) getRevenue(new Object[]{this, aFh1aSDK}, -1211669841, 1211669841, System.identityHashCode(this))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        getRevenue(new Object[]{aFd1uSDK}, 594988372, -594988369, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if ((r12 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r2 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r2 >= r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r12 = r1.getCurrencyIso4217Code(r12);
        r0 = com.appsflyer.internal.AFd1uSDK.hashCode + 119;
        com.appsflyer.internal.AFd1uSDK.equals = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if ((r0 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return java.lang.Boolean.valueOf(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (r12.getMediationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r12.getMediationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        r12 = com.appsflyer.internal.AFd1uSDK.hashCode + 29;
        com.appsflyer.internal.AFd1uSDK.equals = r12 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r12) {
        /*
            r0 = 0
            r1 = r12[r0]
            com.appsflyer.internal.AFd1uSDK r1 = (com.appsflyer.internal.AFd1uSDK) r1
            r2 = 1
            r12 = r12[r2]
            com.appsflyer.internal.AFh1aSDK r12 = (com.appsflyer.internal.AFh1aSDK) r12
            int r2 = com.appsflyer.internal.AFd1uSDK.equals
            int r2 = r2 + 7
            int r3 = r2 % 128
            com.appsflyer.internal.AFd1uSDK.hashCode = r3
            int r2 = r2 % 2
            java.lang.String r3 = "af_send_exc_to_server_window"
            r4 = -1
            if (r2 != 0) goto L35
            long r6 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFc1qSDK r2 = r1.component3()
            long r2 = r2.getRevenue(r3, r4)
            long r8 = r12.getMediationNetwork
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = r10.toSeconds(r6)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r9 = 3
            int r9 = r9 / r0
            if (r8 >= 0) goto L5f
            goto L4d
        L35:
            long r6 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFc1qSDK r0 = r1.component3()
            long r2 = r0.getRevenue(r3, r4)
            long r8 = r12.getMediationNetwork
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = r0.toSeconds(r6)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L5f
        L4d:
            int r12 = com.appsflyer.internal.AFd1uSDK.hashCode
            int r12 = r12 + 29
            int r0 = r12 % 128
            com.appsflyer.internal.AFd1uSDK.equals = r0
            int r12 = r12 % 2
            if (r12 == 0) goto L5c
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L5c:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L5f:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L7f
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L68
            goto L7f
        L68:
            boolean r12 = r1.getCurrencyIso4217Code(r12)
            int r0 = com.appsflyer.internal.AFd1uSDK.hashCode
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1uSDK.equals = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L7d
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L7d:
            r12 = 0
            throw r12
        L7f:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1uSDK.getMediationNetwork(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1uSDK aFd1uSDK) {
        getRevenue(new Object[]{aFd1uSDK}, -1916622998, 1916623002, (int) System.currentTimeMillis());
    }
}
