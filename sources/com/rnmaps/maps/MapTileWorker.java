package com.rnmaps.maps;

import V0.C0695n;
import V0.C0704x;
import V0.C0705y;
import V0.C0706z;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class MapTileWorker extends Worker {
    public MapTileWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.ByteArrayOutputStream] */
    @Override // androidx.work.Worker
    public final V0.A c() throws Throwable {
        InputStream inputStream;
        Object obj;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r3;
        ?? r10;
        byte[] byteArray;
        FileOutputStream fileOutputStream;
        Throwable e10;
        WorkerParameters workerParameters = this.f9857b;
        ?? A5 = workerParameters.f18346b.a("filename");
        try {
            C0695n c0695n = workerParameters.f18346b;
            c0695n.getClass();
            Intrinsics.checkNotNullParameter("maxAge", "key");
            Object obj2 = c0695n.f9958a.get("maxAge");
            int iIntValue = ((Number) (obj2 instanceof Integer ? obj2 : 0)).intValue();
            if (iIntValue >= 0) {
                if ((System.currentTimeMillis() - new File((String) A5).lastModified()) / 1000 < iIntValue) {
                    return new C0704x();
                }
            }
            try {
                URL url = new URL(workerParameters.f18346b.a("url"));
                try {
                    try {
                        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[16384];
                                while (true) {
                                    int i7 = inputStreamOpenStream.read(bArr, 0, 16384);
                                    if (i7 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i7);
                                }
                                byteArrayOutputStream.flush();
                                byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    inputStreamOpenStream.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused2) {
                                }
                            } catch (IOException e11) {
                                e = e11;
                                inputStream2 = inputStreamOpenStream;
                                e.printStackTrace();
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception unused3) {
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                }
                                byteArray = null;
                            } catch (OutOfMemoryError e12) {
                                e = e12;
                                inputStream2 = inputStreamOpenStream;
                                e.printStackTrace();
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                byteArray = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            byteArrayOutputStream = null;
                            inputStream2 = inputStreamOpenStream;
                            e.printStackTrace();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            byteArray = null;
                            if (byteArray == null) {
                                return new C0705y();
                            }
                            try {
                                if (A5 != 0) {
                                    try {
                                        File file = new File((String) A5);
                                        file.getParentFile().mkdirs();
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            fileOutputStream.write(byteArray);
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception unused5) {
                                            }
                                            return new C0706z();
                                        } catch (IOException e14) {
                                            e10 = e14;
                                            e10.printStackTrace();
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception unused6) {
                                                }
                                            }
                                            return new C0704x();
                                        } catch (OutOfMemoryError e15) {
                                            e10 = e15;
                                            e10.printStackTrace();
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            return new C0704x();
                                        }
                                    } catch (IOException e16) {
                                        e = e16;
                                        Throwable th = e;
                                        fileOutputStream = null;
                                        e10 = th;
                                        e10.printStackTrace();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        return new C0704x();
                                    } catch (OutOfMemoryError e17) {
                                        e = e17;
                                        Throwable th2 = e;
                                        fileOutputStream = null;
                                        e10 = th2;
                                        e10.printStackTrace();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        return new C0704x();
                                    } catch (Throwable th3) {
                                        A5 = 0;
                                        th = th3;
                                        if (A5 != 0) {
                                            try {
                                                A5.close();
                                            } catch (Exception unused7) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                return new C0704x();
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (OutOfMemoryError e18) {
                            e = e18;
                            byteArrayOutputStream = null;
                            inputStream2 = inputStreamOpenStream;
                            e.printStackTrace();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            byteArray = null;
                            if (byteArray == null) {
                                return new C0705y();
                            }
                            if (A5 != 0) {
                                File file2 = new File((String) A5);
                                file2.getParentFile().mkdirs();
                                fileOutputStream = new FileOutputStream(file2);
                                fileOutputStream.write(byteArray);
                                fileOutputStream.close();
                                return new C0706z();
                            }
                            return new C0704x();
                        } catch (Throwable th5) {
                            th = th5;
                            obj = null;
                            inputStream = inputStreamOpenStream;
                            th = th;
                            r10 = inputStream;
                            r3 = obj;
                            if (r10 != 0) {
                                try {
                                    r10.close();
                                } catch (Exception unused8) {
                                }
                            }
                            if (r3 != 0) {
                                throw th;
                            }
                            try {
                                r3.close();
                                throw th;
                            } catch (Exception unused9) {
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r10 = url;
                        r3 = "url";
                        if (r10 != 0) {
                            r10.close();
                        }
                        if (r3 != 0) {
                            throw th;
                        }
                        r3.close();
                        throw th;
                    }
                } catch (IOException e19) {
                    e = e19;
                    inputStream2 = null;
                    byteArrayOutputStream = null;
                    e.printStackTrace();
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    byteArray = null;
                    if (byteArray == null) {
                        return new C0705y();
                    }
                    if (A5 != 0) {
                        File file3 = new File((String) A5);
                        file3.getParentFile().mkdirs();
                        fileOutputStream = new FileOutputStream(file3);
                        fileOutputStream.write(byteArray);
                        fileOutputStream.close();
                        return new C0706z();
                    }
                    return new C0704x();
                } catch (OutOfMemoryError e20) {
                    e = e20;
                    inputStream2 = null;
                    byteArrayOutputStream = null;
                    e.printStackTrace();
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    byteArray = null;
                    if (byteArray == null) {
                        return new C0705y();
                    }
                    if (A5 != 0) {
                        File file4 = new File((String) A5);
                        file4.getParentFile().mkdirs();
                        fileOutputStream = new FileOutputStream(file4);
                        fileOutputStream.write(byteArray);
                        fileOutputStream.close();
                        return new C0706z();
                    }
                    return new C0704x();
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = null;
                    obj = null;
                }
                if (byteArray == null) {
                    return new C0705y();
                }
                if (A5 != 0) {
                    File file5 = new File((String) A5);
                    file5.getParentFile().mkdirs();
                    fileOutputStream = new FileOutputStream(file5);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.close();
                    return new C0706z();
                }
                return new C0704x();
            } catch (MalformedURLException e21) {
                throw new AssertionError(e21);
            }
        } catch (Error unused10) {
            return new C0704x();
        }
    }
}
