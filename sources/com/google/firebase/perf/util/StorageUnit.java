package com.google.firebase.perf.util;

import com.luck.picture.lib.config.FileSizeUnit;

/* JADX INFO: loaded from: classes2.dex */
public enum StorageUnit {
    TERABYTES(1099511627776L) { // from class: com.google.firebase.perf.util.StorageUnit.1
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j6, StorageUnit storageUnit) {
            return storageUnit.toTerabytes(j6);
        }
    },
    GIGABYTES(FileSizeUnit.GB) { // from class: com.google.firebase.perf.util.StorageUnit.2
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j6, StorageUnit storageUnit) {
            return storageUnit.toGigabytes(j6);
        }
    },
    MEGABYTES(FileSizeUnit.MB) { // from class: com.google.firebase.perf.util.StorageUnit.3
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j6, StorageUnit storageUnit) {
            return storageUnit.toMegabytes(j6);
        }
    },
    KILOBYTES(FileSizeUnit.KB) { // from class: com.google.firebase.perf.util.StorageUnit.4
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j6, StorageUnit storageUnit) {
            return storageUnit.toKilobytes(j6);
        }
    },
    BYTES(1) { // from class: com.google.firebase.perf.util.StorageUnit.5
        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j6, StorageUnit storageUnit) {
            return storageUnit.toBytes(j6);
        }
    };

    long numBytes;

    public abstract long convert(long j6, StorageUnit storageUnit);

    public long toBytes(long j6) {
        return j6 * this.numBytes;
    }

    public long toGigabytes(long j6) {
        return (j6 * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long j6) {
        return (j6 * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j6) {
        return (j6 * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long j6) {
        return (j6 * this.numBytes) / TERABYTES.numBytes;
    }

    StorageUnit(long j6) {
        this.numBytes = j6;
    }
}
