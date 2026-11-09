package com.google.android.datatransport.runtime.scheduling.persistence;

import C0.G;
import N8.q0;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    public static final class Builder extends EventStoreConfig.Builder {
        private Integer criticalSectionEnterTimeoutMs;
        private Long eventCleanUpAge;
        private Integer loadBatchSize;
        private Integer maxBlobByteSizePerRow;
        private Long maxStorageSizeInBytes;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig build() {
            String strJ = this.maxStorageSizeInBytes == null ? " maxStorageSizeInBytes" : "";
            if (this.loadBatchSize == null) {
                strJ = q0.j(strJ, " loadBatchSize");
            }
            if (this.criticalSectionEnterTimeoutMs == null) {
                strJ = q0.j(strJ, " criticalSectionEnterTimeoutMs");
            }
            if (this.eventCleanUpAge == null) {
                strJ = q0.j(strJ, " eventCleanUpAge");
            }
            if (this.maxBlobByteSizePerRow == null) {
                strJ = q0.j(strJ, " maxBlobByteSizePerRow");
            }
            if (strJ.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strJ));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i7) {
            this.criticalSectionEnterTimeoutMs = Integer.valueOf(i7);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setEventCleanUpAge(long j6) {
            this.eventCleanUpAge = Long.valueOf(j6);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setLoadBatchSize(int i7) {
            this.loadBatchSize = Integer.valueOf(i7);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxBlobByteSizePerRow(int i7) {
            this.maxBlobByteSizePerRow = Integer.valueOf(i7);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxStorageSizeInBytes(long j6) {
            this.maxStorageSizeInBytes = Long.valueOf(j6);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventStoreConfig) {
            EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
            if (this.maxStorageSizeInBytes == eventStoreConfig.getMaxStorageSizeInBytes() && this.loadBatchSize == eventStoreConfig.getLoadBatchSize() && this.criticalSectionEnterTimeoutMs == eventStoreConfig.getCriticalSectionEnterTimeoutMs() && this.eventCleanUpAge == eventStoreConfig.getEventCleanUpAge() && this.maxBlobByteSizePerRow == eventStoreConfig.getMaxBlobByteSizePerRow()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    public int hashCode() {
        long j6 = this.maxStorageSizeInBytes;
        int i7 = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003;
        long j10 = this.eventCleanUpAge;
        return ((i7 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.maxBlobByteSizePerRow;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.maxStorageSizeInBytes);
        sb2.append(", loadBatchSize=");
        sb2.append(this.loadBatchSize);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.criticalSectionEnterTimeoutMs);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.eventCleanUpAge);
        sb2.append(", maxBlobByteSizePerRow=");
        return G.n(this.maxBlobByteSizePerRow, "}", sb2);
    }

    private AutoValue_EventStoreConfig(long j6, int i7, int i10, long j10, int i11) {
        this.maxStorageSizeInBytes = j6;
        this.loadBatchSize = i7;
        this.criticalSectionEnterTimeoutMs = i10;
        this.eventCleanUpAge = j10;
        this.maxBlobByteSizePerRow = i11;
    }
}
