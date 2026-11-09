package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {
    private final EventInternal event;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22460id;
    private final TransportContext transportContext;

    public AutoValue_PersistedEvent(long j6, TransportContext transportContext, EventInternal eventInternal) {
        this.f22460id = j6;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.transportContext = transportContext;
        if (eventInternal == null) {
            throw new NullPointerException("Null event");
        }
        this.event = eventInternal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedEvent) {
            PersistedEvent persistedEvent = (PersistedEvent) obj;
            if (this.f22460id == persistedEvent.getId() && this.transportContext.equals(persistedEvent.getTransportContext()) && this.event.equals(persistedEvent.getEvent())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.f22460id;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    public int hashCode() {
        long j6 = this.f22460id;
        return ((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003) ^ this.event.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f22460id + ", transportContext=" + this.transportContext + ", event=" + this.event + "}";
    }
}
