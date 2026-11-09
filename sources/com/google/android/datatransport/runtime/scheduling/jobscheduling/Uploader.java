package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.V;
import androidx.camera.core.impl.L;
import androidx.camera.video.internal.encoder.m;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
public class Uploader {
    private static final String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final ClientHealthMetricsStore clientHealthMetricsStore;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final Clock uptimeClock;
    private final WorkScheduler workScheduler;

    @Inject
    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
        this.uptimeClock = clock2;
        this.clientHealthMetricsStore = clientHealthMetricsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$logAndUpdateState$2(TransportContext transportContext) {
        return Boolean.valueOf(this.eventStore.hasPendingEventsFor(transportContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable lambda$logAndUpdateState$3(TransportContext transportContext) {
        return this.eventStore.loadBatch(transportContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$4(Iterable iterable, TransportContext transportContext, long j6) {
        this.eventStore.recordFailure(iterable);
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j6);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$5(Iterable iterable) {
        this.eventStore.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$6() {
        this.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$7(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.clientHealthMetricsStore.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$logAndUpdateState$8(TransportContext transportContext, long j6) {
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j6);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$upload$0(TransportContext transportContext, int i7) {
        this.workScheduler.schedule(transportContext, i7 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$upload$1(TransportContext transportContext, int i7, Runnable runnable) {
        try {
            SynchronizationGuard synchronizationGuard = this.guard;
            EventStore eventStore = this.eventStore;
            Objects.requireNonNull(eventStore);
            synchronizationGuard.runCriticalSection(new L(eventStore, 17));
            if (isNetworkAvailable()) {
                logAndUpdateState(transportContext, i7);
            } else {
                this.guard.runCriticalSection(new V(i7, this, transportContext));
            }
        } catch (SynchronizationException unused) {
            this.workScheduler.schedule(transportContext, i7 + 1);
        } finally {
            runnable.run();
        }
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.guard;
        ClientHealthMetricsStore clientHealthMetricsStore = this.clientHealthMetricsStore;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.clock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE).setEncodedPayload(new EncodedPayload(Encoding.of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new L(clientHealthMetricsStore, 18))).toByteArray())).build());
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @CanIgnoreReturnValue
    @RestrictTo({c.f39801b})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i7) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        BackendResponse backendResponseOk = BackendResponse.ok(0L);
        long j6 = 0;
        while (((Boolean) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uploader f22454b;

            {
                this.f22454b = this;
            }

            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                switch (i) {
                    case 0:
                        return this.f22454b.lambda$logAndUpdateState$2(transportContext);
                    default:
                        return this.f22454b.lambda$logAndUpdateState$3(transportContext);
                }
            }
        })).booleanValue()) {
            final int i10 = 1;
            Iterable iterable = (Iterable) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Uploader f22454b;

                {
                    this.f22454b = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    switch (i10) {
                        case 0:
                            return this.f22454b.lambda$logAndUpdateState$2(transportContext);
                        default:
                            return this.f22454b.lambda$logAndUpdateState$3(transportContext);
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseOk;
            }
            if (transportBackend == null) {
                Logging.d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseSend = BackendResponse.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).getEvent());
                }
                if (transportContext.shouldUploadClientHealthMetrics()) {
                    arrayList.add(createMetricsEvent(transportBackend));
                }
                backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            backendResponseOk = backendResponseSend;
            if (backendResponseOk.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                long j10 = j6;
                TransportContext transportContext2 = transportContext;
                this.guard.runCriticalSection(new b(this, iterable, transportContext2, j10));
                this.workScheduler.schedule(transportContext2, i7 + 1, true);
                return backendResponseOk;
            }
            TransportContext transportContext3 = transportContext;
            this.guard.runCriticalSection(new U8.a(24, this, iterable));
            if (backendResponseOk.getStatus() == BackendResponse.Status.OK) {
                long jMax = Math.max(j6, backendResponseOk.getNextRequestWaitMillis());
                if (transportContext3.shouldUploadClientHealthMetrics()) {
                    this.guard.runCriticalSection(new L(this, 19));
                }
                j6 = jMax;
            } else if (backendResponseOk.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String transportName = ((PersistedEvent) it2.next()).getEvent().getTransportName();
                    if (map.containsKey(transportName)) {
                        map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    } else {
                        map.put(transportName, 1);
                    }
                }
                this.guard.runCriticalSection(new U8.a(25, this, map));
            }
            transportContext = transportContext3;
        }
        this.guard.runCriticalSection(new androidx.camera.core.impl.utils.futures.c(this, transportContext, j6, 2));
        return backendResponseOk;
    }

    public void upload(TransportContext transportContext, int i7, Runnable runnable) {
        this.executor.execute(new m(this, transportContext, i7, runnable, 2));
    }
}
