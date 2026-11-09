package com.facebook.cache.disk;

import C0.G;
import C9.N;
import android.os.Environment;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.binaryresource.BinaryResource;
import com.rnmaps.maps.MapModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.sufficientlysecure.htmltextview.n;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DiskStorage {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f21184f = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21185g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f21186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f21188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p121i2.d f21189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v2.a f21190e;

    public d(File file, int i7, p121i2.d dVar) {
        this.f21186a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    dVar.getClass();
                }
            }
        } catch (Exception unused2) {
            dVar.getClass();
        }
        this.f21187b = zContains;
        File file2 = new File(this.f21186a, G.m(i7, "v2.ols100."));
        this.f21188c = file2;
        this.f21189d = dVar;
        File file3 = this.f21186a;
        if (!file3.exists()) {
            D3.a.v(file2);
        } else if (!file2.exists()) {
            p118hf.a.o(file3);
            try {
                D3.a.v(file2);
            } catch (p195n2.a unused3) {
                file2.toString();
                this.f21189d.getClass();
            }
        }
        this.f21190e = v2.a.f43065a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static G6.b a(d dVar, File file) {
        G6.b bVar;
        dVar.getClass();
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            bVar = null;
        } else {
            String strSubstring = name.substring(iLastIndexOf);
            String str = ".cnt";
            if (!".cnt".equals(strSubstring)) {
                str = ".tmp".equals(strSubstring) ? ".tmp" : null;
            }
            if (str == null) {
                bVar = null;
            } else {
                String strSubstring2 = name.substring(0, iLastIndexOf);
                if (str.equals(".tmp")) {
                    int iLastIndexOf2 = strSubstring2.lastIndexOf(46);
                    if (iLastIndexOf2 <= 0) {
                        bVar = null;
                    } else {
                        strSubstring2 = strSubstring2.substring(0, iLastIndexOf2);
                    }
                }
                bVar = new G6.b(str, strSubstring2);
            }
        }
        if (bVar != null && new File(dVar.c(bVar.f3026c)).equals(file.getParentFile())) {
            return bVar;
        }
        return null;
    }

    public final File b(String str) {
        return new File(F.d(u.s(c(str)), File.separator, str, ".cnt"));
    }

    public final String c(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21188c);
        return G.r(sb2, File.separator, strValueOf);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final void clearAll() {
        File[] fileArrListFiles = this.f21186a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                p118hf.a.o(file);
            }
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean contains(String str, Object obj) {
        return b(str).exists();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // com.facebook.cache.disk.DiskStorage
    public final p136j2.c getDumpInfo() throws Throwable {
        String str;
        a aVar = new a(this);
        p118hf.a.L(this.f21188c, aVar);
        List listUnmodifiableList = Collections.unmodifiableList(aVar.f21175a);
        p136j2.c cVar = new p136j2.c();
        cVar.f38190a = new ArrayList();
        cVar.f38191b = new HashMap();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            b bVar = (b) ((DiskStorage.Entry) it.next());
            byte[] bArr = bVar.f21178b.read();
            if (bArr.length < 2) {
                str = "undefined";
            } else {
                byte b7 = bArr[0];
                if (b7 == -1 && bArr[1] == -40) {
                    str = MapModule.SNAPSHOT_FORMAT_JPG;
                } else if (b7 == -119 && bArr[1] == 80) {
                    str = MapModule.SNAPSHOT_FORMAT_PNG;
                } else if (b7 == 82 && bArr[1] == 73) {
                    str = "webp";
                } else if (b7 == 71 && bArr[1] == 73) {
                    str = "gif";
                } else {
                    str = "undefined";
                }
            }
            if (str.equals("undefined") && bArr.length >= 4) {
                String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]));
            }
            bVar.f21178b.f37260a.getPath();
            bVar.getSize();
            n nVar = new n(9);
            Integer num = (Integer) cVar.f38191b.get(str);
            if (num == null) {
                cVar.f38191b.put(str, 1);
            } else {
                cVar.f38191b.put(str, Integer.valueOf(num.intValue() + 1));
            }
            cVar.f38190a.add(nVar);
        }
        return cVar;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final Collection getEntries() {
        a aVar = new a(this);
        p118hf.a.L(this.f21188c, aVar);
        return Collections.unmodifiableList(aVar.f21175a);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final BinaryResource getResource(String str, Object obj) {
        File fileB = b(str);
        if (!fileB.exists()) {
            return null;
        }
        this.f21190e.getClass();
        fileB.setLastModified(System.currentTimeMillis());
        return p108h2.b.f37259b.createOrNull(fileB);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final String getStorageName() {
        String absolutePath = this.f21186a.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final DiskStorage.Inserter insert(String str, Object obj) throws IOException {
        File file = new File(c(str));
        boolean zExists = file.exists();
        p121i2.d dVar = this.f21189d;
        if (!zExists) {
            try {
                D3.a.v(file);
            } catch (p195n2.a e10) {
                dVar.getClass();
                throw e10;
            }
        }
        try {
            return new c(this, str, File.createTempFile(str.concat(Consts.DOT), ".tmp", file));
        } catch (IOException e11) {
            dVar.getClass();
            throw e11;
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean isExternal() {
        return this.f21187b;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final void purgeUnexpectedResources() {
        p118hf.a.L(this.f21186a, new N(this, 5));
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final long remove(DiskStorage.Entry entry) {
        File file = ((b) entry).f21178b.f37260a;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final boolean touch(String str, Object obj) {
        File fileB = b(str);
        boolean zExists = fileB.exists();
        if (zExists) {
            this.f21190e.getClass();
            fileB.setLastModified(System.currentTimeMillis());
        }
        return zExists;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public final long remove(String str) {
        File fileB = b(str);
        if (!fileB.exists()) {
            return 0L;
        }
        long length = fileB.length();
        if (fileB.delete()) {
            return length;
        }
        return -1L;
    }
}
