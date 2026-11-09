package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import androidx.camera.camera2.internal.F;
import com.didiglobal.booster.instrument.ShadowThread;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class D extends e implements AsyncInitSoSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f21852d;

    public D(Context context, String str, boolean z3) {
        super(new File(F.d(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str)), z3 ? 1 : 0);
        this.f21852d = context;
    }

    public static void j(File file, byte b7, boolean z3) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b7);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z3) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SyncFailedException unused) {
        }
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.x
    public final String a(String str) {
        File fileE = e(str);
        if (fileE == null) {
            return null;
        }
        return fileE.getCanonicalPath();
    }

    @Override // com.facebook.soloader.x
    public void d(int i7) {
        File file = this.f21877a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(androidx.camera.video.u.k(file, "cannot mkdir: "));
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                n nVarD = y.d(file, new File(file, "dso_lock"));
                try {
                    Objects.toString(file);
                    o.e(2, "fb-UnpackingSoSource");
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!i(nVarD, i7)) {
                        Objects.toString(file);
                        o.e(4, "fb-UnpackingSoSource");
                        nVar = nVarD;
                    }
                    if (nVar != null) {
                        Objects.toString(file);
                        o.e(2, "fb-UnpackingSoSource");
                        nVar.close();
                    } else {
                        Objects.toString(file);
                        o.e(2, "fb-UnpackingSoSource");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    nVar = nVarD;
                    if (nVar != null) {
                        Objects.toString(file);
                        o.e(2, "fb-UnpackingSoSource");
                        nVar.close();
                    } else {
                        Objects.toString(file);
                        o.e(2, "fb-UnpackingSoSource");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (!file.canWrite() || file.setWritable(false)) {
                throw th3;
            }
            throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
        }
    }

    public byte[] f() {
        Parcel parcelObtain = Parcel.obtain();
        C cH = h();
        try {
            B[] bArrB = cH.b();
            parcelObtain.writeInt(bArrB.length);
            for (B b7 : bArrB) {
                parcelObtain.writeString(b7.f21850a);
                parcelObtain.writeString(b7.f21851b);
            }
            cH.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                cH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public B[] g() {
        C cH = h();
        try {
            B[] bArrB = cH.b();
            cH.close();
            return bArrB;
        } catch (Throwable th) {
            try {
                cH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract C h();

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[Catch: all -> 0x007f, IOException -> 0x0081, TRY_LEAVE, TryCatch #5 {IOException -> 0x0081, blocks: (B:32:0x0070, B:34:0x0076), top: B:96:0x0070, outer: #9 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:96:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean i(n nVar, int i7) throws IOException {
        byte b7;
        boolean z3;
        RandomAccessFile randomAccessFile;
        File file = this.f21877a;
        File file2 = new File(file, "dso_state");
        byte[] bArrF = f();
        if ((i7 & 2) != 0) {
            b7 = 0;
        } else {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(file, "dso_deps"), "rw");
                try {
                    if (randomAccessFile2.length() != 0) {
                        int length = (int) randomAccessFile2.length();
                        byte[] bArr = new byte[length];
                        if (randomAccessFile2.read(bArr) != length) {
                            o.e(2, "fb-UnpackingSoSource");
                        } else {
                            z3 = !Arrays.equals(bArr, bArrF);
                            randomAccessFile2.close();
                        }
                        if (z3) {
                            b7 = 0;
                        } else {
                            randomAccessFile = new RandomAccessFile(file2, "rw");
                            try {
                                if (randomAccessFile.length() == 1) {
                                    try {
                                        b7 = randomAccessFile.readByte();
                                        if (b7 == 1) {
                                            Objects.toString(file);
                                            o.e(2, "fb-UnpackingSoSource");
                                        } else {
                                            b7 = 0;
                                        }
                                    } catch (IOException e10) {
                                        Objects.toString(file);
                                        e10.getMessage();
                                        o.e(2, "fb-UnpackingSoSource");
                                    }
                                } else {
                                    b7 = 0;
                                }
                                randomAccessFile.close();
                            } catch (Throwable th) {
                                try {
                                    randomAccessFile.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                    randomAccessFile2.close();
                } catch (Throwable th3) {
                    try {
                        randomAccessFile2.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException unused) {
            }
            z3 = true;
            if (z3) {
                randomAccessFile = new RandomAccessFile(file2, "rw");
                if (randomAccessFile.length() == 1) {
                    b7 = randomAccessFile.readByte();
                    if (b7 == 1) {
                        Objects.toString(file);
                        o.e(2, "fb-UnpackingSoSource");
                    } else {
                        b7 = 0;
                    }
                } else {
                    b7 = 0;
                }
                randomAccessFile.close();
            } else {
                b7 = 0;
            }
        }
        if (b7 == 1) {
            return false;
        }
        boolean z8 = (i7 & 4) == 0;
        o.e(2, "fb-UnpackingSoSource");
        j(file2, (byte) 0, z8);
        File[] fileArrListFiles = file.listFiles(new F6.b(1));
        if (fileArrListFiles == null) {
            throw new IOException(androidx.camera.video.u.k(file, "unable to list directory "));
        }
        for (File file3 : fileArrListFiles) {
            Objects.toString(file3);
            o.e(2, "fb-UnpackingSoSource");
            y.b(file3);
        }
        C cH = h();
        try {
            cH.c(file);
            cH.close();
            RandomAccessFile randomAccessFile3 = new RandomAccessFile(new File(file, "dso_deps"), "rw");
            try {
                randomAccessFile3.write(bArrF);
                randomAccessFile3.setLength(randomAccessFile3.getFilePointer());
                randomAccessFile3.close();
                A a3 = new A(this, z8, file2, nVar);
                if ((i7 & 1) != 0) {
                    ShadowThread.setThreadName(new ShadowThread(a3, "SoSync:" + file.getName(), "\u200bcom.facebook.soloader.UnpackingSoSource"), "\u200bcom.facebook.soloader.UnpackingSoSource").start();
                } else {
                    a3.run();
                }
                return true;
            } catch (Throwable th5) {
                try {
                    randomAccessFile3.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            try {
                cH.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    @Override // com.facebook.soloader.AsyncInitSoSource
    public final void waitUntilInitCompleted() {
        File file = this.f21877a;
        try {
            y.d(file, new File(file, "dso_lock")).close();
        } catch (Exception e10) {
            Log.e("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + file + "): ", e10);
        }
    }
}
