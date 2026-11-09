package androidx.multidex;

import C0.G;
import android.content.SharedPreferences;
import androidx.camera.core.impl.utils.m;
import androidx.camera.core.impl.utils.n;
import androidx.camera.video.u;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f17491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f17493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f17494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FileChannel f17495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FileLock f17496f;

    public e(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.f17491a = file;
        this.f17493c = file2;
        this.f17492b = b(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f17494d = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.f17495e = channel;
                try {
                    file3.getPath();
                    this.f17496f = channel.lock();
                    file3.getPath();
                } catch (IOException e10) {
                    e = e10;
                    try {
                        this.f17495e.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e11) {
                    e = e11;
                    this.f17495e.close();
                    throw e;
                } catch (RuntimeException e12) {
                    e = e12;
                    this.f17495e.close();
                    throw e;
                }
            } catch (IOException e13) {
                e = e13;
                try {
                    this.f17494d.close();
                } catch (IOException unused2) {
                }
                throw e;
            }
        } catch (Error e14) {
            e = e14;
            this.f17494d.close();
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            this.f17494d.close();
            throw e;
        }
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, d dVar, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(G.o("tmp-", str), OfflineConstant.ZIP_SUFFIX, dVar.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i7 = inputStream.read(bArr); i7 != -1; i7 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i7);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + dVar.getAbsolutePath() + "\")");
                }
                dVar.getPath();
                if (fileCreateTempFile.renameTo(dVar)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + dVar.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static long b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            m mVarH = n.h(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j6 = mVarH.f14248c;
            randomAccessFile.seek(mVarH.f14247b);
            byte[] bArr = new byte[16384];
            int i7 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j6));
            while (i7 != -1) {
                crc32.update(bArr, 0, i7);
                j6 -= (long) i7;
                if (j6 == 0) {
                    break;
                }
                i7 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j6));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void f(b bVar, long j6, long j10, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = bVar.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j6);
        editorEdit.putLong("crc", j10);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i7 = 2;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            editorEdit.putLong(G.m(i7, "dex.crc."), dVar.f17490a);
            editorEdit.putLong("dex.time." + i7, dVar.lastModified());
            i7++;
        }
        editorEdit.commit();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public final ArrayList c(b bVar, boolean z3) {
        long jLastModified;
        ArrayList arrayListD;
        File file = this.f17491a;
        file.getPath();
        if (!this.f17496f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z3) {
            ArrayList arrayListE = e();
            jLastModified = file.lastModified();
            if (jLastModified == -1) {
                jLastModified--;
            }
            f(bVar, jLastModified, this.f17492b, arrayListE);
            arrayListD = arrayListE;
        } else {
            SharedPreferences sharedPreferences = bVar.getSharedPreferences("multidex.version", 4);
            long j6 = sharedPreferences.getLong("timestamp", -1L);
            long jLastModified2 = file.lastModified();
            if (jLastModified2 == -1) {
                jLastModified2--;
            }
            if (j6 == jLastModified2 && sharedPreferences.getLong("crc", -1L) == this.f17492b) {
                try {
                    arrayListD = d(bVar);
                } catch (IOException unused) {
                    ArrayList arrayListE2 = e();
                    long jLastModified3 = file.lastModified();
                    if (jLastModified3 == -1) {
                        jLastModified3--;
                    }
                    f(bVar, jLastModified3, this.f17492b, arrayListE2);
                    arrayListD = arrayListE2;
                }
            } else {
                ArrayList arrayListE3 = e();
                jLastModified = file.lastModified();
                if (jLastModified == -1) {
                    jLastModified--;
                }
                f(bVar, jLastModified, this.f17492b, arrayListE3);
                arrayListD = arrayListE3;
            }
        }
        arrayListD.size();
        return arrayListD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17496f.release();
        this.f17495e.close();
        this.f17494d.close();
    }

    public final ArrayList d(b bVar) throws IOException {
        String str = this.f17491a.getName() + ".classes";
        SharedPreferences sharedPreferences = bVar.getSharedPreferences("multidex.version", 4);
        int i7 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i7 - 1);
        for (int i10 = 2; i10 <= i7; i10++) {
            d dVar = new d(this.f17493c, str + i10 + OfflineConstant.ZIP_SUFFIX);
            if (!dVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + dVar.getPath() + "'");
            }
            dVar.f17490a = b(dVar);
            long j6 = sharedPreferences.getLong("dex.crc." + i10, -1L);
            long j10 = sharedPreferences.getLong("dex.time." + i10, -1L);
            long jLastModified = dVar.lastModified();
            if (j10 != jLastModified || j6 != dVar.f17490a) {
                StringBuilder sb2 = new StringBuilder("Invalid extracted dex: ");
                sb2.append(dVar);
                sb2.append(" (key \"\"), expected modification time: ");
                sb2.append(j10);
                u.v(sb2, ", modification time: ", jLastModified, ", expected crc: ");
                sb2.append(j6);
                sb2.append(", file crc: ");
                sb2.append(dVar.f17490a);
                throw new IOException(sb2.toString());
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public final ArrayList e() {
        StringBuilder sb2 = new StringBuilder();
        File file = this.f17491a;
        sb2.append(file.getName());
        sb2.append(".classes");
        String string = sb2.toString();
        c cVar = new c(0);
        File file2 = this.f17493c;
        File[] fileArrListFiles = file2.listFiles(cVar);
        if (fileArrListFiles == null) {
            file2.getPath();
        } else {
            for (File file3 : fileArrListFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("classes");
            int i7 = 2;
            sb3.append(2);
            sb3.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb3.toString());
            while (entry != null) {
                d dVar = new d(file2, string + i7 + OfflineConstant.ZIP_SUFFIX);
                arrayList.add(dVar);
                dVar.toString();
                int i10 = 0;
                boolean z3 = false;
                while (i10 < 3 && !z3) {
                    i10++;
                    a(zipFile, entry, dVar, string);
                    try {
                        dVar.f17490a = b(dVar);
                        z3 = true;
                    } catch (IOException unused) {
                        dVar.getAbsolutePath();
                        z3 = false;
                    }
                    dVar.getAbsolutePath();
                    dVar.length();
                    if (!z3) {
                        dVar.delete();
                        if (dVar.exists()) {
                            dVar.getPath();
                        }
                    }
                }
                if (!z3) {
                    throw new IOException("Could not create zip file " + dVar.getAbsolutePath() + " for secondary dex (" + i7 + ")");
                }
                i7++;
                entry = zipFile.getEntry("classes" + i7 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
