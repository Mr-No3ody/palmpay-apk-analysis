package com.appsflyer.internal;

import N8.q0;
import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAFIntentWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n+ 2 MultiCatch.kt\ncom/appsflyer/internal/util/MultiCatchKt\n*L\n1#1,111:1\n16#2,7:112\n*S KotlinDebug\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n*L\n84#1:112,7\n*E\n"})
public final class AFj1lSDK {

    @NotNull
    final Intent getMediationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1lSDK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends o implements Function0<String> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1lSDK.this.getMediationNetwork.getStringExtra(this.$getMonetizationNetwork);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1lSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getRevenue", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends o implements Function0<Boolean> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1lSDK.this.getMediationNetwork.hasExtra(this.$AFAdRevenueData));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1lSDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "J_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3<T> extends o implements Function0<T> {
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$getMediationNetwork = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1lSDK.this.getMediationNetwork.getParcelableExtra(this.$getMediationNetwork);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1lSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends o implements Function0<Intent> {
        private /* synthetic */ long $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, long j6) {
            super(0);
            this.$getRevenue = str;
            this.$getMonetizationNetwork = j6;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1lSDK.this.getMediationNetwork.putExtra(this.$getRevenue, this.$getMonetizationNetwork);
        }
    }

    public AFj1lSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getMediationNetwork = intent;
    }

    private final <T> T getMediationNetwork(Function0<? extends T> function0, String str, T t, boolean z3) {
        T tInvoke;
        Object objF;
        synchronized (this.getMediationNetwork) {
            try {
                p355xf.o oVar = q.f43977a;
                tInvoke = function0.invoke();
            } catch (Throwable th) {
                p355xf.o oVar2 = q.f43977a;
                tInvoke = (T) androidx.camera.core.impl.utils.executor.g.f(th);
            }
            KClass[] kClassArr = {G.a(ConcurrentModificationException.class), G.a(ArrayIndexOutOfBoundsException.class)};
            Throwable thA = q.a(tInvoke);
            if (thA != null) {
                try {
                    if (!C1847n.p(kClassArr, G.a(thA.getClass()))) {
                        throw thA;
                    }
                    if (z3) {
                        objF = getMediationNetwork(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, thA, false, false);
                        objF = t;
                    }
                    tInvoke = objF;
                } catch (Throwable th2) {
                    p355xf.o oVar3 = q.f43977a;
                    objF = androidx.camera.core.impl.utils.executor.g.f(th2);
                }
            }
            Throwable thA2 = q.a(tInvoke);
            if (thA2 == null) {
                t = (T) tInvoke;
            } else {
                AFLogger.afErrorLog(str, thA2, false, false);
            }
        }
        return t;
    }

    public final boolean AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getMediationNetwork(new AnonymousClass2(str), q0.k("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public final <T extends Parcelable> T H_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getMediationNetwork(new AnonymousClass3(str), q0.k("Error while trying to read ", str, " extra from intent"), null, true);
    }

    @Nullable
    public final Intent I_(@NotNull String str, long j6) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getMediationNetwork(new AnonymousClass4(str, j6), q0.k("Error while trying to write ", str, " extra to intent"), null, true);
    }

    @Nullable
    public final String getCurrencyIso4217Code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getMediationNetwork(new AnonymousClass1(str), q0.k("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
