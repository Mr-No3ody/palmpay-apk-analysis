package com.appsflyer;

import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1gSDK;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.v;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p024b9.g;
import p355xf.C2131j;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0016J3\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u000bJ'\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&JG\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010&J!\u00100\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b2\u00101J'\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010&R\u0015\u00106\u001a\u0002058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b9\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1gSDK;", "<init>", "()V", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFg1gSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "getMediationNetwork", "Lkotlin/Lazy;", "", "getMonetizationNetwork", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAFLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n36#2:279\n36#2:280\n36#2:281\n36#2:282\n36#2:283\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n*L\n177#1:279\n189#1:280\n208#1:281\n224#1:282\n243#1:283\n35#1:284,2\n*E\n"})
public final class AFLogger extends AFg1gSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    @NotNull
    private static final Lazy getMonetizationNetwork = C2131j.b(AnonymousClass8.getMediationNetwork);

    @NotNull
    private static final Lazy getMediationNetwork = C2131j.b(AnonymousClass5.AFAdRevenueData);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends o implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z3) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$getRevenue = str;
            this.$getMediationNetwork = z3;
        }

        public final void getMediationNetwork(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.d(this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMediationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getMediationNetwork(aFg1gSDK);
            return Unit.f38893a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends o implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $AFAdRevenueData;
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1cSDK aFg1cSDK, String str, boolean z3) {
            super(1);
            this.$AFAdRevenueData = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$getRevenue = z3;
        }

        public final void getCurrencyIso4217Code(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.i(this.$AFAdRevenueData, this.$getMediationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getCurrencyIso4217Code(aFg1gSDK);
            return Unit.f38893a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends o implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ Throwable $AFAdRevenueData;
        private /* synthetic */ boolean $component2;
        private /* synthetic */ boolean $component3;
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z3, boolean z8, boolean z10, boolean z11) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$AFAdRevenueData = th;
            this.$getRevenue = z3;
            this.$getMonetizationNetwork = z8;
            this.$component3 = z10;
            this.$component2 = z11;
        }

        public final void getMediationNetwork(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.e(this.$getCurrencyIso4217Code, this.$getMediationNetwork, this.$AFAdRevenueData, this.$getRevenue, this.$getMonetizationNetwork, this.$component3, this.$component2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getMediationNetwork(aFg1gSDK);
            return Unit.f38893a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends o implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $AFAdRevenueData;
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$AFAdRevenueData = aFg1cSDK;
            this.$getMonetizationNetwork = str;
        }

        public final void getRevenue(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.force(this.$AFAdRevenueData, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getRevenue(aFg1gSDK);
            return Unit.f38893a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getMonetizationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends o implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFAdRevenueData = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1kSDK.getCurrencyIso4217Code();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass6 extends o implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AFg1cSDK aFg1cSDK, String str, boolean z3) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$getRevenue = str;
            this.$getMediationNetwork = z3;
        }

        public final void getMonetizationNetwork(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.w(this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMediationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getMonetizationNetwork(aFg1gSDK);
            return Unit.f38893a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/appsflyer/internal/AFg1gSDK;", "getMonetizationNetwork", "()Ljava/util/Set;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass8 extends o implements Function0<Set<AFg1gSDK>> {
        public static final AnonymousClass8 getMediationNetwork = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1gSDK> invoke() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass9 extends o implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z3) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getCurrencyIso4217Code = z3;
        }

        public final void getMediationNetwork(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.v(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getMediationNetwork(aFg1gSDK);
            return Unit.f38893a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", FirebaseAnalytics.Param.LEVEL, "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i7) {
            this.level = i7;
        }

        @JvmName(name = "getLevel")
        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex, "");
        AFg1gSDK.e$default(INSTANCE, AFg1cSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.F(errorLogMessage)) {
            errorLogMessage = BuildConfig.TRAVIS;
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, true, false, 64, null);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    public static final void afLogForce(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFg1cSDK.OTHER, logMessage);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afRDLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, true);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, false);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFg1cSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        ((Set) getMonetizationNetwork.getValue()).removeAll(C1847n.A(aFg1gSDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        v.p((Set) getMonetizationNetwork.getValue(), aFg1gSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new g(new AnonymousClass1(tag, msg, shouldRemoteDebug), 2));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(@NotNull AFg1cSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new g(new AnonymousClass3(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug), 2));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(@NotNull AFg1cSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new g(new AnonymousClass4(tag, msg), 2));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new g(new AnonymousClass2(tag, msg, shouldRemoteDebug), 2));
    }

    public final void registerClient(@NotNull AFg1gSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(client, 0));
    }

    public final void unregisterClient(@NotNull AFg1gSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new a(client, 1));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new g(new AnonymousClass9(tag, msg, shouldRemoteDebug), 2));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMediationNetwork.getValue()).execute(new g(new AnonymousClass6(tag, msg, shouldRemoteDebug), 2));
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, true);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, true);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFg1gSDK.w$default(INSTANCE, AFg1cSDK.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getMonetizationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFg1gSDK) it.next());
        }
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.F(errorLogMessage)) {
            errorLogMessage = BuildConfig.TRAVIS;
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.F(errorLogMessage)) {
            errorLogMessage = BuildConfig.TRAVIS;
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.F(errorLogMessage)) {
            errorLogMessage = BuildConfig.TRAVIS;
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.F(errorLogMessage)) {
            errorLogMessage = BuildConfig.TRAVIS;
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
