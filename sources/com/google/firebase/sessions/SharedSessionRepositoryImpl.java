package com.google.firebase.sessions;

import Ff.h;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.DataStore;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.mlkit.common.MlKitException;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u00010BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016J\u001e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "sessionDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/SessionData;", "processDataManager", "Lcom/google/firebase/sessions/ProcessDataManager;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/SessionGenerator;Lcom/google/firebase/sessions/SessionFirelogPublisher;Lcom/google/firebase/sessions/TimeProvider;Landroidx/datastore/core/DataStore;Lcom/google/firebase/sessions/ProcessDataManager;Lkotlin/coroutines/CoroutineContext;)V", "localSessionData", "getLocalSessionData$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SessionData;", "setLocalSessionData$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;)V", "value", "", "isInForeground", "()Z", "pendingForegroundCheck", "previousNotificationType", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;)V", "previousSessionId", "", "appBackground", "", "appForeground", "notifySubscribers", "sessionId", "type", "(Ljava/lang/String;Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSessionExpired", "sessionData", "isColdStart", "isMyProcessStale", "NotificationType", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedSessionRepository.kt\ncom/google/firebase/sessions/SharedSessionRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1863#2,2:265\n*S KotlinDebug\n*F\n+ 1 SharedSessionRepository.kt\ncom/google/firebase/sessions/SharedSessionRepositoryImpl\n*L\n206#1:265,2\n*E\n"})
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {

    @NotNull
    private final CoroutineContext backgroundDispatcher;
    private boolean isInForeground;
    public SessionData localSessionData;
    private boolean pendingForegroundCheck;

    @NotNull
    private NotificationType previousNotificationType;

    @NotNull
    private String previousSessionId;

    @NotNull
    private final ProcessDataManager processDataManager;

    @NotNull
    private final DataStore<SessionData> sessionDataStore;

    @NotNull
    private final SessionFirelogPublisher sessionFirelogPublisher;

    @NotNull
    private final SessionGenerator sessionGenerator;

    @NotNull
    private final SessionsSettings sessionsSettings;

    @NotNull
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/google/firebase/sessions/SessionData;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00401 extends h implements Function3<FlowCollector<? super SessionData>, Throwable, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00401(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super C00401> continuation) {
                super(3, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // Ff.a
            public final Object invokeSuspend(Object obj) {
                Ef.a aVar = Ef.a.f2423a;
                int i7 = this.label;
                if (i7 == 0) {
                    g.M(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Throwable th = (Throwable) this.L$1;
                    SessionData sessionData = new SessionData(this.this$0.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    th.getMessage();
                    sessionData.getSessionDetails().getSessionId();
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(sessionData, this) == aVar) {
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

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super SessionData> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C00401 c00401 = new C00401(this.this$0, continuation);
                c00401.L$0 = flowCollector;
                c00401.L$1 = th;
                return c00401.invokeSuspend(Unit.f38893a);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new AnonymousClass1(continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                C1888u c1888u = new C1888u(SharedSessionRepositoryImpl.this.sessionDataStore.getData(), new C00401(SharedSessionRepositoryImpl.this, null));
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SessionData) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SessionData sessionData, Continuation<? super Unit> continuation) {
                        sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(sessionData);
                        if (sharedSessionRepositoryImpl.pendingForegroundCheck) {
                            sharedSessionRepositoryImpl.pendingForegroundCheck = false;
                            sharedSessionRepositoryImpl.appForeground();
                        }
                        Object objNotifySubscribers = sharedSessionRepositoryImpl.notifySubscribers(sessionData.getSessionDetails().getSessionId(), NotificationType.GENERAL, continuation);
                        return objNotifySubscribers == Ef.a.f2423a ? objNotifySubscribers : Unit.f38893a;
                    }
                };
                this.label = 1;
                if (c1888u.collect(flowCollector, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "FALLBACK", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum NotificationType {
        GENERAL,
        FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.n(values());

        @NotNull
        public static EnumEntries<NotificationType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14001 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "sessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00411 extends h implements Function2<SessionData, Continuation<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00411(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super C00411> continuation) {
                super(2, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // Ff.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00411 c00411 = new C00411(this.this$0, continuation);
                c00411.L$0 = obj;
                return c00411;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((C00411) create(sessionData, continuation)).invokeSuspend(Unit.f38893a);
            }

            @Override // Ff.a
            public final Object invokeSuspend(Object obj) {
                Ef.a aVar = Ef.a.f2423a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
                return SessionData.copy$default((SessionData) this.L$0, null, this.this$0.timeProvider.currentTime(), null, 5, null);
            }
        }

        public C14001(Continuation<? super C14001> continuation) {
            super(2, continuation);
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new C14001(continuation);
        }

        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    g.M(obj);
                    DataStore dataStore = SharedSessionRepositoryImpl.this.sessionDataStore;
                    C00411 c00411 = new C00411(SharedSessionRepositoryImpl.this, null);
                    this.label = 1;
                    if (dataStore.updateData(c00411, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.M(obj);
                }
            } catch (Exception e10) {
                e10.getMessage();
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(sharedSessionRepositoryImpl.getLocalSessionData$com_google_firebase_firebase_sessions(), null, SharedSessionRepositoryImpl.this.timeProvider.currentTime(), null, 5, null));
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14001) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", i = {}, l = {142, 193}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14011 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionData $sessionData;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00421 extends h implements Function2<SessionData, Continuation<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00421(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation<? super C00421> continuation) {
                super(2, continuation);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // Ff.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00421 c00421 = new C00421(this.this$0, continuation);
                c00421.L$0 = obj;
                return c00421;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((C00421) create(sessionData, continuation)).invokeSuspend(Unit.f38893a);
            }

            @Override // Ff.a
            public final Object invokeSuspend(Object obj) {
                Map<String, ProcessData> mapUpdateProcessDataMap;
                Ef.a aVar = Ef.a.f2423a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
                SessionData sessionData = (SessionData) this.L$0;
                boolean zIsSessionExpired = this.this$0.isSessionExpired(sessionData);
                boolean zIsColdStart = this.this$0.isColdStart(sessionData);
                boolean zIsMyProcessStale = this.this$0.isMyProcessStale(sessionData);
                if (zIsColdStart) {
                    mapUpdateProcessDataMap = this.this$0.processDataManager.generateProcessDataMap();
                } else {
                    mapUpdateProcessDataMap = zIsMyProcessStale ? this.this$0.processDataManager.updateProcessDataMap(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                }
                SessionDetails sessionDetails = zIsColdStart ? null : sessionData.getSessionDetails();
                if (!zIsSessionExpired && !zIsColdStart) {
                    return zIsMyProcessStale ? SessionData.copy$default(sessionData, null, null, this.this$0.processDataManager.updateProcessDataMap(mapUpdateProcessDataMap), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsGenerateNewSession = this.this$0.sessionGenerator.generateNewSession(sessionDetails);
                this.this$0.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                this.this$0.processDataManager.onSessionGenerated();
                return sessionData.copy(sessionDetailsGenerateNewSession, null, mapUpdateProcessDataMap);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14011(SessionData sessionData, Continuation<? super C14011> continuation) {
            super(2, continuation);
            this.$sessionData = sessionData;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedSessionRepositoryImpl.this.new C14011(this.$sessionData, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            if (r10.updateData(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        
            if (r10.notifySubscribers(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        
            return r1;
         */
        @Override // Ff.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                Ef.a r1 = Ef.a.f2423a
                int r0 = r9.label
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L18
                if (r0 != r2) goto L10
                androidx.camera.core.impl.utils.executor.g.M(r10)
                goto L7f
            L10:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L18:
                androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Exception -> L1c
                goto L7f
            L1c:
                r0 = move-exception
                r10 = r0
                goto L39
            L1f:
                androidx.camera.core.impl.utils.executor.g.M(r10)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L1c
                androidx.datastore.core.DataStore r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionDataStore$p(r10)     // Catch: java.lang.Exception -> L1c
                com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 r0 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1     // Catch: java.lang.Exception -> L1c
                com.google.firebase.sessions.SharedSessionRepositoryImpl r4 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L1c
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L1c
                r9.label = r3     // Catch: java.lang.Exception -> L1c
                java.lang.Object r10 = r10.updateData(r0, r9)     // Catch: java.lang.Exception -> L1c
                if (r10 != r1) goto L7f
                goto L7e
            L39:
                r10.getMessage()
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r0 = r9.$sessionData
                boolean r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$isSessionExpired(r10, r0)
                if (r10 == 0) goto L7f
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionGenerator r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionGenerator$p(r10)
                com.google.firebase.sessions.SessionData r0 = r9.$sessionData
                com.google.firebase.sessions.SessionDetails r0 = r0.getSessionDetails()
                com.google.firebase.sessions.SessionDetails r4 = r10.generateNewSession(r0)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r3 = r9.$sessionData
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                com.google.firebase.sessions.SessionData r0 = com.google.firebase.sessions.SessionData.copy$default(r3, r4, r5, r6, r7, r8)
                r10.setLocalSessionData$com_google_firebase_firebase_sessions(r0)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionFirelogPublisher r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionFirelogPublisher$p(r10)
                r10.mayLogSession(r4)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                java.lang.String r0 = r4.getSessionId()
                com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r3 = com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.FALLBACK
                r9.label = r2
                java.lang.Object r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$notifySubscribers(r10, r0, r3, r9)
                if (r10 != r1) goto L7f
            L7e:
                return r1
            L7f:
                kotlin.Unit r10 = kotlin.Unit.f38893a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C14011.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14011) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", i = {0, 0}, l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "notifySubscribers", n = {"sessionId", "type"}, s = {"L$0", "L$1"})
    public static final class C14021 extends Ff.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C14021(Continuation<? super C14021> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSessionRepositoryImpl.this.notifySubscribers(null, null, this);
        }
    }

    @Inject
    public SharedSessionRepositoryImpl(@NotNull SessionsSettings sessionsSettings, @NotNull SessionGenerator sessionGenerator, @NotNull SessionFirelogPublisher sessionFirelogPublisher, @NotNull TimeProvider timeProvider, @NotNull DataStore<SessionData> sessionDataStore, @NotNull ProcessDataManager processDataManager, @Background @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        Intrinsics.checkNotNullParameter(sessionFirelogPublisher, "sessionFirelogPublisher");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionDataStore, "sessionDataStore");
        Intrinsics.checkNotNullParameter(processDataManager, "processDataManager");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = sessionDataStore;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = backgroundDispatcher;
        this.previousNotificationType = NotificationType.GENERAL;
        this.previousSessionId = "";
        AbstractC0780y.m(AbstractC0777v.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isColdStart(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap != null) {
            return this.processDataManager.isColdStart(processDataMap);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMyProcessStale(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            this.processDataManager.getMyProcessName();
            return true;
        }
        boolean zIsMyProcessStale = this.processDataManager.isMyProcessStale(processDataMap);
        if (zIsMyProcessStale) {
            this.processDataManager.getMyProcessName();
        }
        return zIsMyProcessStale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSessionExpired(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            sessionData.getSessionDetails().getSessionId();
            return false;
        }
        boolean z3 = Tf.c.c(this.timeProvider.currentTime().m96minus5sfh64U(backgroundTime), this.sessionsSettings.m100getSessionRestartTimeoutUwyO8pc()) > 0;
        if (z3) {
            sessionData.getSessionDetails().getSessionId();
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object notifySubscribers(String str, NotificationType notificationType, Continuation<? super Unit> continuation) {
        C14021 c14021;
        if (continuation instanceof C14021) {
            c14021 = (C14021) continuation;
            int i7 = c14021.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c14021.label = i7 - Integer.MIN_VALUE;
            } else {
                c14021 = new C14021(continuation);
            }
        } else {
            c14021 = new C14021(continuation);
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = c14021.result;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = c14021.label;
        if (i10 == 0) {
            g.M(registeredSubscribers$com_google_firebase_firebase_sessions);
            this.previousNotificationType = notificationType;
            if (Intrinsics.c(this.previousSessionId, str)) {
                return Unit.f38893a;
            }
            this.previousSessionId = str;
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            c14021.L$0 = str;
            c14021.L$1 = notificationType;
            c14021.label = 1;
            registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(c14021);
            if (registeredSubscribers$com_google_firebase_firebase_sessions == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationType = (NotificationType) c14021.L$1;
            str = (String) c14021.L$0;
            g.M(registeredSubscribers$com_google_firebase_firebase_sessions);
        }
        for (SessionSubscriber sessionSubscriber : ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            int i11 = WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()];
            if (i11 == 1) {
                Objects.toString(sessionSubscriber.getSessionSubscriberName());
            } else {
                if (i11 != 2) {
                    throw new l();
                }
                Objects.toString(sessionSubscriber.getSessionSubscriberName());
            }
        }
        return Unit.f38893a;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appBackground() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            return;
        }
        this.processDataManager.getMyProcessName();
        AbstractC0780y.m(AbstractC0777v.a(this.backgroundDispatcher), null, null, new C14001(null), 3);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appForeground() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            this.pendingForegroundCheck = true;
            return;
        }
        SessionData localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        this.processDataManager.getMyProcessName();
        if (isSessionExpired(localSessionData$com_google_firebase_firebase_sessions) || isMyProcessStale(localSessionData$com_google_firebase_firebase_sessions)) {
            AbstractC0780y.m(AbstractC0777v.a(this.backgroundDispatcher), null, null, new C14011(localSessionData$com_google_firebase_firebase_sessions, null), 3);
        }
    }

    @NotNull
    public final SessionData getLocalSessionData$com_google_firebase_firebase_sessions() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        Intrinsics.n("localSessionData");
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreviousNotificationType$com_google_firebase_firebase_sessions, reason: from getter */
    public final NotificationType getPreviousNotificationType() {
        return this.previousNotificationType;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public boolean getIsInForeground() {
        return this.isInForeground;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(@NotNull SessionData sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "<set-?>");
        this.localSessionData = sessionData;
    }

    public final void setPreviousNotificationType$com_google_firebase_firebase_sessions(@NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(notificationType, "<set-?>");
        this.previousNotificationType = notificationType;
    }
}
