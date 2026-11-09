package com.google.firebase.sessions;

import Ff.h;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "mayLogSession", "", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "attemptLoggingSessionEvent", "sessionEvent", "Lcom/google/firebase/sessions/SessionEvent;", "shouldLogSession", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldCollectEvents", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionFirelogPublisher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionFirelogPublisher.kt\ncom/google/firebase/sessions/SessionFirelogPublisherImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n2632#2,3:130\n*S KotlinDebug\n*F\n+ 1 SessionFirelogPublisher.kt\ncom/google/firebase/sessions/SessionFirelogPublisherImpl\n*L\n99#1:130,3\n*E\n"})
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    private static final double randomValueForSampling = Math.random();

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final EventGDTLoggerInterface eventGDTLogger;

    @NotNull
    private final FirebaseApp firebaseApp;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallations;

    @NotNull
    private final SessionsSettings sessionSettings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", i = {2}, l = {70, 71, 77}, m = "invokeSuspend", n = {"installationId"}, s = {"L$0"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionDetails $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SessionDetails sessionDetails, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sessionDetails = sessionDetails;
        }

        @Override // Ff.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new AnonymousClass1(this.$sessionDetails, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        @Override // Ff.a
        public final Object invokeSuspend(Object obj) {
            InstallationId installationId;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            SessionEvents sessionEvents;
            FirebaseApp firebaseApp;
            SessionDetails sessionDetails;
            SessionsSettings sessionsSettings;
            Object registeredSubscribers$com_google_firebase_firebase_sessions;
            FirebaseApp firebaseApp2;
            SessionDetails sessionDetails2;
            SessionEvents sessionEvents2;
            SessionsSettings sessionsSettings2;
            Ef.a aVar = Ef.a.f2423a;
            int i7 = this.label;
            if (i7 == 0) {
                g.M(obj);
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = SessionFirelogPublisherImpl.this;
                this.label = 1;
                obj = sessionFirelogPublisherImpl2.shouldLogSession(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i7 == 1) {
                g.M(obj);
            } else {
                if (i7 == 2) {
                    g.M(obj);
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    sessionEvents = SessionEvents.INSTANCE;
                    firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != aVar) {
                        firebaseApp2 = firebaseApp;
                        obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                        sessionDetails2 = sessionDetails;
                        sessionEvents2 = sessionEvents;
                        sessionsSettings2 = sessionsSettings;
                    }
                    return aVar;
                }
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SessionsSettings sessionsSettings3 = (SessionsSettings) this.L$5;
                SessionDetails sessionDetails3 = (SessionDetails) this.L$4;
                FirebaseApp firebaseApp3 = (FirebaseApp) this.L$3;
                SessionEvents sessionEvents3 = (SessionEvents) this.L$2;
                sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$1;
                installationId = (InstallationId) this.L$0;
                g.M(obj);
                sessionsSettings2 = sessionsSettings3;
                sessionEvents2 = sessionEvents3;
                sessionDetails2 = sessionDetails3;
                firebaseApp2 = firebaseApp3;
            }
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = sessionFirelogPublisherImpl;
            Map<SessionSubscriber.Name, ? extends SessionSubscriber> map = (Map) obj;
            InstallationId installationId2 = installationId;
            sessionFirelogPublisherImpl3.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, map, installationId2.getFid(), installationId2.getAuthToken()));
            return Unit.f38893a;
            if (((Boolean) obj).booleanValue()) {
                InstallationId.Companion companion = InstallationId.INSTANCE;
                FirebaseInstallationsApi firebaseInstallationsApi = SessionFirelogPublisherImpl.this.firebaseInstallations;
                this.label = 2;
                obj = companion.create(firebaseInstallationsApi, this);
                if (obj != aVar) {
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    sessionEvents = SessionEvents.INSTANCE;
                    firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != aVar) {
                        firebaseApp2 = firebaseApp;
                        obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                        sessionDetails2 = sessionDetails;
                        sessionEvents2 = sessionEvents;
                        sessionsSettings2 = sessionsSettings;
                        SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = sessionFirelogPublisherImpl;
                        Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = (Map) obj;
                        InstallationId installationId3 = installationId;
                        sessionFirelogPublisherImpl4.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, map2, installationId3.getFid(), installationId3.getAuthToken()));
                    }
                }
                return aVar;
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {}, l = {HomeDialogState.PRIORITY_DARK_MODE_NOTIFICATION, 104}, m = "shouldLogSession", n = {}, s = {})
    public static final class C13991 extends Ff.c {
        int label;
        /* synthetic */ Object result;

        public C13991(Continuation<? super C13991> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    @Inject
    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull SessionsSettings sessionSettings, @NotNull EventGDTLoggerInterface eventGDTLogger, @Background @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
        } catch (RuntimeException e10) {
            Log.e(FirebaseSessions.TAG, "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shouldLogSession(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl.C13991
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.C13991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L7b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L44
        L36:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            r0.label = r4
            java.lang.Object r6 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r6 != r1) goto L44
            goto L7a
        L44:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L5a
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5a
            goto L92
        L5a:
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()
            com.google.firebase.sessions.api.SessionSubscriber r2 = (com.google.firebase.sessions.api.SessionSubscriber) r2
            boolean r2 = r2.isDataCollectionEnabled()
            if (r2 == 0) goto L5e
            com.google.firebase.sessions.settings.SessionsSettings r6 = r5.sessionSettings
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            com.google.firebase.sessions.settings.SessionsSettings r6 = r5.sessionSettings
            boolean r6 = r6.getSessionsEnabled()
            if (r6 != 0) goto L86
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L86:
            boolean r6 = r5.shouldCollectEvents()
            if (r6 != 0) goto L8f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L8f:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L92:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.shouldLogSession(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void mayLogSession(@NotNull SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        AbstractC0780y.m(AbstractC0777v.a(this.backgroundDispatcher), null, null, new AnonymousClass1(sessionDetails, null), 3);
    }
}
