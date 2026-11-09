package com.facebook.cache.disk;

import androidx.camera.video.u;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.WriterCallback;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DiskStorage.Inserter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f21182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f21183c;

    public c(d dVar, String str, File file) {
        this.f21183c = dVar;
        this.f21181a = str;
        this.f21182b = file;
    }

    @Override // com.facebook.cache.disk.DiskStorage.Inserter
    public final boolean cleanUp() {
        File file = this.f21182b;
        return !file.exists() || file.delete();
    }

    @Override // com.facebook.cache.disk.DiskStorage.Inserter
    public final BinaryResource commit(Object obj) {
        this.f21183c.f21190e.getClass();
        return commit(obj, System.currentTimeMillis());
    }

    @Override // com.facebook.cache.disk.DiskStorage.Inserter
    public final void writeData(WriterCallback writerCallback, Object obj) throws IOException {
        File file = this.f21182b;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                p213o2.b bVar = new p213o2.b(fileOutputStream);
                bVar.f40017a = 0L;
                writerCallback.write(bVar);
                bVar.flush();
                long j6 = bVar.f40017a;
                fileOutputStream.close();
                if (file.length() == j6) {
                    return;
                }
                long length = file.length();
                StringBuilder sbR = u.r(j6, "File was not written completely. Expected: ", ", found: ");
                sbR.append(length);
                throw new Kf.d(sbR.toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e10) {
            d dVar = this.f21183c;
            int i7 = d.f21185g;
            dVar.f21189d.getClass();
            throw e10;
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage.Inserter
    public final BinaryResource commit(Object obj, long j6) throws p195n2.c {
        d dVar = this.f21183c;
        File fileB = dVar.b(this.f21181a);
        try {
            D3.a.A(this.f21182b, fileB);
            if (fileB.exists()) {
                fileB.setLastModified(j6);
            }
            return p108h2.b.f37259b.create(fileB);
        } catch (p195n2.c e10) {
            Throwable cause = e10.getCause();
            if (cause != null && !(cause instanceof p195n2.b)) {
                boolean z3 = cause instanceof FileNotFoundException;
            }
            int i7 = d.f21185g;
            dVar.f21189d.getClass();
            throw e10;
        }
    }
}
