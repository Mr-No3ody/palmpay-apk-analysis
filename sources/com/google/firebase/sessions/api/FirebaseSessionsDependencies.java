package com.google.firebase.sessions.api;

import androidx.annotation.VisibleForTesting;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\tH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002RN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "<init>", "()V", "dependencies", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "kotlin.jvm.PlatformType", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "addDependency", "", "subscriberName", GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP, "subscriber", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getRegisteredSubscribers", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriber", "getSubscriber$com_google_firebase_firebase_sessions", "reset", "reset$com_google_firebase_firebase_sessions", "getDependency", "Dependency", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebaseSessionsDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n462#2:105\n412#2:106\n1246#3,4:107\n*S KotlinDebug\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n*L\n75#1:105\n75#1:106\n75#1:107,4\n*E\n"})
public final class FirebaseSessionsDependencies {

    @NotNull
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    private FirebaseSessionsDependencies() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void addDependency(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            Objects.toString(subscriberName);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(new CountDownLatch(1), null, 2, 0 == true ? 1 : 0));
        Objects.toString(subscriberName);
    }

    private final Dependency getDependency(SessionSubscriber.Name subscriberName) {
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(subscriberName);
        if (dependency != null) {
            Intrinsics.checkNotNullExpressionValue(dependency, "getOrElse(...)");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getRegisteredSubscribers$lambda$2$lambda$1(Dependency dependency) throws InterruptedException {
        dependency.getLatch().await();
        return Unit.f38893a;
    }

    @JvmStatic
    public static final void register(@NotNull SessionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            Objects.toString(sessionSubscriberName);
            return;
        }
        dependency.setSubscriber(subscriber);
        Objects.toString(sessionSubscriberName);
        dependency.getLatch().countDown();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009e -> B:21:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r2 = r0.L$4
            java.lang.Object r4 = r0.L$3
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r5 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r5
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$0
            java.util.Map r7 = (java.util.Map) r7
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L9f
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L41:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = kotlin.collections.F.a(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r6 = r11
            r4 = r2
        L62:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto Laa
            java.lang.Object r11 = r6.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            com.google.firebase.sessions.api.SessionSubscriber$Name r5 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r5
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            com.google.firebase.sessions.api.a r7 = new com.google.firebase.sessions.api.a
            r7.<init>(r11)
            r0.L$0 = r4
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r4
            r0.L$4 = r2
            r0.label = r3
            kotlin.coroutines.f r11 = kotlin.coroutines.f.f38943a
            Wf.Y r8 = new Wf.Y
            r9 = 0
            r8.<init>(r7, r9)
            java.lang.Object r11 = Wf.AbstractC0780y.s(r11, r8, r0)
            if (r11 != r1) goto L9e
            return r1
        L9e:
            r7 = r4
        L9f:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r5)
            r4.put(r2, r11)
            r4 = r7
            goto L62
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @VisibleForTesting
    @NotNull
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "latch", "Ljava/util/concurrent/CountDownLatch;", "subscriber", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "<init>", "(Ljava/util/concurrent/CountDownLatch;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "getSubscriber", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dependency {

        @NotNull
        private final CountDownLatch latch;

        @Nullable
        private SessionSubscriber subscriber;

        public Dependency(@NotNull CountDownLatch latch, @Nullable SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(latch, "latch");
            this.latch = latch;
            this.subscriber = sessionSubscriber;
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, CountDownLatch countDownLatch, SessionSubscriber sessionSubscriber, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                countDownLatch = dependency.latch;
            }
            if ((i7 & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(countDownLatch, sessionSubscriber);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        @NotNull
        public final Dependency copy(@NotNull CountDownLatch latch, @Nullable SessionSubscriber subscriber) {
            Intrinsics.checkNotNullParameter(latch, "latch");
            return new Dependency(latch, subscriber);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return Intrinsics.c(this.latch, dependency.latch) && Intrinsics.c(this.subscriber, dependency.subscriber);
        }

        @NotNull
        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Nullable
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int iHashCode = this.latch.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(@Nullable SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        @NotNull
        public String toString() {
            return "Dependency(latch=" + this.latch + ", subscriber=" + this.subscriber + ')';
        }

        public /* synthetic */ Dependency(CountDownLatch countDownLatch, SessionSubscriber sessionSubscriber, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(countDownLatch, (i7 & 2) != 0 ? null : sessionSubscriber);
        }
    }
}
