package com.facebook.cache.disk;

/* JADX INFO: loaded from: classes.dex */
public final class e implements EntryEvictionComparator {
    @Override // java.util.Comparator
    public final int compare(DiskStorage.Entry entry, DiskStorage.Entry entry2) {
        long timestamp = entry.getTimestamp();
        long timestamp2 = entry2.getTimestamp();
        if (timestamp < timestamp2) {
            return -1;
        }
        return timestamp2 == timestamp ? 0 : 1;
    }
}
