package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DiskStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p136j2.a f21207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p121i2.d f21209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.work.impl.model.b f21210e = new androidx.work.impl.model.b(null, 11, null, false);

    public g(int i7, p136j2.a aVar, String str, p121i2.d dVar) {
        this.f21206a = i7;
        this.f21209d = dVar;
        this.f21207b = aVar;
        this.f21208c = str;
    }

    public final void a() throws p195n2.a {
        File file = new File((File) this.f21207b.get(), this.f21208c);
        try {
            D3.a.v(file);
            String absolutePath = file.getAbsolutePath();
            if (p229p2.a.f41180a.isLoggable(3)) {
                p229p2.b.a(3, g.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.f21210e = new androidx.work.impl.model.b(file, 11, new d(file, this.f21206a, this.f21209d), false);
        } catch (p195n2.a e10) {
            this.f21209d.getClass();
            throw e10;
        }
    }

    public final synchronized DiskStorage b() {
        d dVar;
        File file;
        androidx.work.impl.model.b bVar = this.f21210e;
        if (((d) bVar.f18580b) == null || (file = (File) bVar.f18581c) == null || !file.exists()) {
            if (((d) this.f21210e.f18580b) != null && ((File) this.f21210e.f18581c) != null) {
                p118hf.a.o((File) this.f21210e.f18581c);
            }
            a();
        }
        dVar = (d) this.f21210e.f18580b;
        dVar.getClass();
        return dVar;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final void clearAll() {
        ((d) b()).clearAll();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean contains(String str, Object obj) {
        return ((d) b()).contains(str, obj);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final p136j2.c getDumpInfo() {
        return ((d) b()).getDumpInfo();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final Collection getEntries() {
        return ((d) b()).getEntries();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final BinaryResource getResource(String str, Object obj) {
        return ((d) b()).getResource(str, obj);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final String getStorageName() {
        try {
            return ((d) b()).getStorageName();
        } catch (IOException unused) {
            return "";
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final DiskStorage.Inserter insert(String str, Object obj) {
        return ((d) b()).insert(str, obj);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean isEnabled() {
        try {
            b();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean isExternal() {
        try {
            return ((d) b()).f21187b;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final void purgeUnexpectedResources() {
        try {
            ((d) b()).purgeUnexpectedResources();
        } catch (IOException e10) {
            p229p2.a.f(g.class, "purgeUnexpectedResources", e10);
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final long remove(DiskStorage.Entry entry) {
        return ((d) b()).remove(entry);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean touch(String str, Object obj) {
        return ((d) b()).touch(str, obj);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final long remove(String str) {
        return ((d) b()).remove(str);
    }
}
