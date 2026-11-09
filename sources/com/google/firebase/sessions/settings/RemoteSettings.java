package com.google.firebase.sessions.settings;

import E.AbstractC0198c;
import Ef.a;
import Ff.c;
import Tf.b;
import Tf.e;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.TimeProvider;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Lcom/google/firebase/sessions/settings/SettingsCache;)V", "", "s", "sanitize", "(Ljava/lang/String;)Ljava/lang/String;", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "clearCachedSettings", "Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lkotlinx/coroutines/sync/Mutex;", "fetchInProgress", "Lkotlinx/coroutines/sync/Mutex;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "LTf/c;", "getSessionRestartTimeout-FghU774", "()LTf/c;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,159:1\n116#2,11:160\n*S KotlinDebug\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n*L\n70#1:160,11\n*E\n"})
public final class RemoteSettings implements SettingsProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int defaultCacheDuration;

    @NotNull
    private static final Regex sanitizeRegex;

    @NotNull
    private final ApplicationInfo appInfo;

    @NotNull
    private final CrashlyticsSettingsFetcher configsFetcher;

    @NotNull
    private final Mutex fetchInProgress;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallationsApi;

    @NotNull
    private final SettingsCache settingsCache;

    @NotNull
    private final TimeProvider timeProvider;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "<init>", "()V", "defaultCacheDuration", "", "getDefaultCacheDuration", "()I", "sanitizeRegex", "Lkotlin/text/Regex;", "getSanitizeRegex", "()Lkotlin/text/Regex;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultCacheDuration() {
            return RemoteSettings.defaultCacheDuration;
        }

        @NotNull
        public final Regex getSanitizeRegex() {
            return RemoteSettings.sanitizeRegex;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 1, 2}, l = {165, 78, HomeDialogState.PRIORITY_AD_DIALOG}, m = "updateSettings", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0"})
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    static {
        b bVar = Tf.c.f9078b;
        defaultCacheDuration = (int) Tf.c.h(AbstractC0198c.h0(24, e.HOURS), e.SECONDS);
        sanitizeRegex = new Regex("com/google/firebase/sessions//");
    }

    @Inject
    public RemoteSettings(@NotNull TimeProvider timeProvider, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo appInfo, @NotNull CrashlyticsSettingsFetcher configsFetcher, @NotNull SettingsCache settingsCache) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(settingsCache, "settingsCache");
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = new p072eg.e();
    }

    private final String sanitize(String s3) {
        return sanitizeRegex.replace(s3, "");
    }

    @VisibleForTesting
    @Nullable
    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(@NotNull Continuation<? super Unit> continuation) {
        Object objUpdateConfigs = this.settingsCache.updateConfigs(SessionConfigsSerializer.INSTANCE.getDefaultValue(), continuation);
        return objUpdateConfigs == a.f2423a ? objUpdateConfigs : Unit.f38893a;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public Tf.c mo98getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        b bVar = Tf.c.f9078b;
        return new Tf.c(AbstractC0198c.h0(numSessionRestartTimeout.intValue(), e.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ac A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:21:0x0042, B:46:0x009e, B:48:0x00ac, B:51:0x00b2), top: B:63:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:21:0x0042, B:46:0x009e, B:48:0x00ac, B:51:0x00b2), top: B:63:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00b2, please report this as an issue */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object updateSettings(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Mutex mutex3;
        String fid;
        Map<String, String> mapG;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        a aVar = a.f2423a;
        int i10 = anonymousClass1.label;
        try {
            if (i10 == 0) {
                g.M(obj);
                if (!this.fetchInProgress.isLocked() && !this.settingsCache.hasCacheExpired()) {
                    return Unit.f38893a;
                }
                mutex = this.fetchInProgress;
                anonymousClass1.L$0 = mutex;
                anonymousClass1.label = 1;
                if (mutex.lock(null, anonymousClass1) != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) anonymousClass1.L$0;
                    try {
                        g.M(obj);
                        Unit unit = Unit.f38893a;
                        mutex2.unlock(null);
                        return Unit.f38893a;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                mutex3 = (Mutex) anonymousClass1.L$0;
                try {
                    g.M(obj);
                    fid = ((InstallationId) obj).getFid();
                    if (Intrinsics.c(fid, "")) {
                        Unit unit2 = Unit.f38893a;
                        mutex3.unlock(null);
                        return unit2;
                    }
                    Pair pair = new Pair("X-Crashlytics-Installation-ID", fid);
                    Pair pair2 = new Pair("X-Crashlytics-Device-Model", sanitize(Build.MANUFACTURER + Build.MODEL));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                    Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", sanitize(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    mapG = G.g(pair, pair2, pair3, new Pair("X-Crashlytics-OS-Display-Version", sanitize(RELEASE)), new Pair("X-Crashlytics-API-Client-Version", this.appInfo.getSessionSdkVersion()));
                    crashlyticsSettingsFetcher = this.configsFetcher;
                    remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this, null);
                    remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                    anonymousClass1.L$0 = mutex3;
                    anonymousClass1.label = 3;
                    if (crashlyticsSettingsFetcher.doConfigFetch(mapG, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) != aVar) {
                        mutex2 = mutex3;
                        Unit unit3 = Unit.f38893a;
                        mutex2.unlock(null);
                        return Unit.f38893a;
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex4 = (Mutex) anonymousClass1.L$0;
            g.M(obj);
            mutex = mutex4;
            if (!this.settingsCache.hasCacheExpired()) {
                Unit unit4 = Unit.f38893a;
                mutex.unlock(null);
                return unit4;
            }
            InstallationId.Companion companion = InstallationId.INSTANCE;
            FirebaseInstallationsApi firebaseInstallationsApi = this.firebaseInstallationsApi;
            anonymousClass1.L$0 = mutex;
            anonymousClass1.label = 2;
            Object objCreate = companion.create(firebaseInstallationsApi, anonymousClass1);
            if (objCreate != aVar) {
                mutex3 = mutex;
                obj = objCreate;
                fid = ((InstallationId) obj).getFid();
                if (Intrinsics.c(fid, "")) {
                    Unit unit5 = Unit.f38893a;
                    mutex3.unlock(null);
                    return unit5;
                }
                Pair pair4 = new Pair("X-Crashlytics-Installation-ID", fid);
                Pair pair5 = new Pair("X-Crashlytics-Device-Model", sanitize(Build.MANUFACTURER + Build.MODEL));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                Intrinsics.checkNotNullExpressionValue(INCREMENTAL2, "INCREMENTAL");
                Pair pair6 = new Pair("X-Crashlytics-OS-Build-Version", sanitize(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
                mapG = G.g(pair4, pair5, pair6, new Pair("X-Crashlytics-OS-Display-Version", sanitize(RELEASE2)), new Pair("X-Crashlytics-API-Client-Version", this.appInfo.getSessionSdkVersion()));
                crashlyticsSettingsFetcher = this.configsFetcher;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                anonymousClass1.L$0 = mutex3;
                anonymousClass1.label = 3;
                if (crashlyticsSettingsFetcher.doConfigFetch(mapG, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) != aVar) {
                    mutex2 = mutex3;
                    Unit unit6 = Unit.f38893a;
                    mutex2.unlock(null);
                    return Unit.f38893a;
                }
            }
            return aVar;
        } catch (Throwable th4) {
            mutex2 = mutex;
            th = th4;
            mutex2.unlock(null);
            throw th;
        }
    }
}
