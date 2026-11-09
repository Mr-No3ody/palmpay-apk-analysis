package com.google.firebase.sessions.settings;

import Ef.a;
import Ff.c;
import Ff.h;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.DataStore;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.TimeProvider;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C1851a;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001eH\u0081@¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "sessionConfigsDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/TimeProvider;Landroidx/datastore/core/DataStore;)V", "sessionConfigsAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;", "sessionConfigs", "getSessionConfigs", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "hasCacheExpired", "", "sessionsEnabled", "()Ljava/lang/Boolean;", "sessionSamplingRate", "", "()Ljava/lang/Double;", "sessionRestartTimeout", "", "()Ljava/lang/Integer;", "updateConfigs", "", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs", "", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsCacheImpl implements SettingsCache {

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final AtomicReference<SessionConfigs> sessionConfigsAtomicReference;

    @NotNull
    private final DataStore<SessionConfigs> sessionConfigsDataStore;

    @NotNull
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C00431 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AtomicReference<SessionConfigs> $tmp0;

            public C00431(AtomicReference<SessionConfigs> atomicReference) {
                this.$tmp0 = atomicReference;
            }

            public final Object emit(SessionConfigs sessionConfigs, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$set = AnonymousClass1.invokeSuspend$set(this.$tmp0, sessionConfigs, continuation);
                return objInvokeSuspend$set == a.f2423a ? objInvokeSuspend$set : Unit.f38893a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new C1851a(this.$tmp0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((SessionConfigs) obj, (Continuation<? super Unit>) continuation);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$set(AtomicReference atomicReference, SessionConfigs sessionConfigs, Continuation continuation) {
            atomicReference.set(sessionConfigs);
            return Unit.f38893a;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SettingsCacheImpl.this.new AnonymousClass1(continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                Flow data = SettingsCacheImpl.this.sessionConfigsDataStore.getData();
                C00431 c00431 = new C00431(SettingsCacheImpl.this.sessionConfigsAtomicReference);
                this.label = 1;
                if (data.collect(c00431, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", i = {}, l = {HomeDialogState.PRIORITY_DARK_MODE_NOTIFICATION}, m = "updateConfigs", n = {}, s = {})
    public static final class C14031 extends c {
        int label;
        /* synthetic */ Object result;

        public C14031(Continuation<? super C14031> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCacheImpl.this.updateConfigs(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends h implements Function2<SessionConfigs, Continuation<? super SessionConfigs>, Object> {
        final /* synthetic */ SessionConfigs $sessionConfigs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SessionConfigs sessionConfigs, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$sessionConfigs = sessionConfigs;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$sessionConfigs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SessionConfigs sessionConfigs, Continuation<? super SessionConfigs> continuation) {
            return ((AnonymousClass2) create(sessionConfigs, continuation)).invokeSuspend(Unit.f38893a);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f2423a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return this.$sessionConfigs;
        }
    }

    @Inject
    public SettingsCacheImpl(@Background @NotNull CoroutineContext backgroundDispatcher, @NotNull TimeProvider timeProvider, @NotNull DataStore<SessionConfigs> sessionConfigsDataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.timeProvider = timeProvider;
        this.sessionConfigsDataStore = sessionConfigsDataStore;
        this.sessionConfigsAtomicReference = new AtomicReference<>();
        AbstractC0780y.m(AbstractC0777v.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    private final SessionConfigs getSessionConfigs() throws Throwable {
        if (this.sessionConfigsAtomicReference.get() == null) {
            AtomicReference<SessionConfigs> atomicReference = this.sessionConfigsAtomicReference;
            Object objP = AbstractC0780y.p(new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, (SessionConfigs) objP) && atomicReference.get() == null) {
            }
        }
        SessionConfigs sessionConfigs = this.sessionConfigsAtomicReference.get();
        Intrinsics.checkNotNullExpressionValue(sessionConfigs, "get(...)");
        return sessionConfigs;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public boolean hasCacheExpired() {
        Long cacheUpdatedTimeSeconds = getSessionConfigs().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = getSessionConfigs().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.timeProvider.currentTime().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @VisibleForTesting
    @Nullable
    public final Object removeConfigs$com_google_firebase_firebase_sessions(@NotNull Continuation<Object> continuation) {
        SettingsCacheImpl$removeConfigs$1 settingsCacheImpl$removeConfigs$1;
        if (continuation instanceof SettingsCacheImpl$removeConfigs$1) {
            settingsCacheImpl$removeConfigs$1 = (SettingsCacheImpl$removeConfigs$1) continuation;
            int i7 = settingsCacheImpl$removeConfigs$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$removeConfigs$1.label = i7 - Integer.MIN_VALUE;
            } else {
                settingsCacheImpl$removeConfigs$1 = new SettingsCacheImpl$removeConfigs$1(this, continuation);
            }
        } else {
            settingsCacheImpl$removeConfigs$1 = new SettingsCacheImpl$removeConfigs$1(this, continuation);
        }
        Object obj = settingsCacheImpl$removeConfigs$1.result;
        a aVar = a.f2423a;
        int i10 = settingsCacheImpl$removeConfigs$1.label;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
                return obj;
            }
            g.M(obj);
            DataStore<SessionConfigs> dataStore = this.sessionConfigsDataStore;
            SettingsCacheImpl$removeConfigs$2 settingsCacheImpl$removeConfigs$2 = new SettingsCacheImpl$removeConfigs$2(null);
            settingsCacheImpl$removeConfigs$1.label = 1;
            Object objUpdateData = dataStore.updateData(settingsCacheImpl$removeConfigs$2, settingsCacheImpl$removeConfigs$1);
            return objUpdateData == aVar ? aVar : objUpdateData;
        } catch (IOException e10) {
            return new Integer(Log.w(FirebaseSessions.TAG, "Failed to remove config values: " + e10));
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    @Nullable
    public Integer sessionRestartTimeout() {
        return getSessionConfigs().getSessionTimeoutSeconds();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    @Nullable
    public Double sessionSamplingRate() {
        return getSessionConfigs().getSessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    @Nullable
    public Boolean sessionsEnabled() {
        return getSessionConfigs().getSessionsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    @Nullable
    public Object updateConfigs(@NotNull SessionConfigs sessionConfigs, @NotNull Continuation<? super Unit> continuation) {
        C14031 c14031;
        if (continuation instanceof C14031) {
            c14031 = (C14031) continuation;
            int i7 = c14031.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14031.label = i7 - Integer.MIN_VALUE;
            } else {
                c14031 = new C14031(continuation);
            }
        } else {
            c14031 = new C14031(continuation);
        }
        Object obj = c14031.result;
        a aVar = a.f2423a;
        int i10 = c14031.label;
        try {
            if (i10 == 0) {
                g.M(obj);
                DataStore<SessionConfigs> dataStore = this.sessionConfigsDataStore;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(sessionConfigs, null);
                c14031.label = 1;
                if (dataStore.updateData(anonymousClass2, c14031) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
        } catch (IOException e10) {
            e10.toString();
        }
        return Unit.f38893a;
    }
}
