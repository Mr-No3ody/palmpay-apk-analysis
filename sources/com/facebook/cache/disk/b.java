package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DiskStorage.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p108h2.b f21178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21180d;

    public b(File file, String str) {
        str.getClass();
        this.f21177a = str;
        this.f21178b = p108h2.b.f37259b.create(file);
        this.f21179c = -1L;
        this.f21180d = -1L;
    }

    @Override // com.facebook.cache.disk.DiskStorage.Entry
    public final String getId() {
        return this.f21177a;
    }

    @Override // com.facebook.cache.disk.DiskStorage.Entry
    public final BinaryResource getResource() {
        return this.f21178b;
    }

    @Override // com.facebook.cache.disk.DiskStorage.Entry
    public final long getSize() {
        if (this.f21179c < 0) {
            this.f21179c = this.f21178b.f37260a.length();
        }
        return this.f21179c;
    }

    @Override // com.facebook.cache.disk.DiskStorage.Entry
    public final long getTimestamp() {
        if (this.f21180d < 0) {
            this.f21180d = this.f21178b.f37260a.lastModified();
        }
        return this.f21180d;
    }
}
