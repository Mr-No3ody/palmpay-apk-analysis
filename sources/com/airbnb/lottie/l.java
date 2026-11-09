package com.airbnb.lottie;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.network.LottieFetchResult;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f19891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19893d;

    public /* synthetic */ l(Context context, int i7, String str, String str2) {
        this.f19890a = i7;
        this.f19891b = context;
        this.f19892c = str;
        this.f19893d = str2;
    }

    /* JADX INFO: Removed unreachable split cross block B:104:0x0143 */
    /* JADX INFO: Removed unreachable split cross block B:113:0x0143 */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.airbnb.lottie.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.airbnb.lottie.B] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        k kVar;
        Throwable th;
        ?? r10;
        ?? b7;
        k kVar2;
        Pair pair;
        B bI;
        p1.c cVar;
        switch (this.f19890a) {
            case 0:
                Context context = this.f19891b;
                String str = this.f19892c;
                String str2 = this.f19893d;
                p1.d dVar = AbstractC1312d.f19857a;
                if (dVar == null) {
                    synchronized (p1.d.class) {
                        try {
                            dVar = AbstractC1312d.f19857a;
                            if (dVar == null) {
                                Context applicationContext = context.getApplicationContext();
                                p1.c cVar2 = AbstractC1312d.f19858b;
                                if (cVar2 == null) {
                                    synchronized (p1.c.class) {
                                        try {
                                            cVar = AbstractC1312d.f19858b;
                                            if (cVar == null) {
                                                cVar = new p1.c(new C1311c(applicationContext), 0);
                                                AbstractC1312d.f19858b = cVar;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    cVar2 = cVar;
                                }
                                dVar = new p1.d(0, cVar2, new org.sufficientlysecure.htmltextview.k(10));
                                AbstractC1312d.f19857a = dVar;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                p1.d dVar2 = dVar;
                ?? r11 = 0;
                LottieFetchResult lottieFetchResult = null;
                r11 = 0;
                if (str2 != null) {
                    try {
                        File fileF = ((p1.c) dVar2.f41178b).f(str);
                        if (fileF == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileF);
                            p1.b bVar = fileF.getAbsolutePath().endsWith(OfflineConstant.ZIP_SUFFIX) ? p1.b.ZIP : fileF.getAbsolutePath().endsWith(".gz") ? p1.b.GZIP : p1.b.JSON;
                            fileF.getAbsolutePath();
                            com.airbnb.lottie.utils.c.a();
                            pair = new Pair(bVar, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        kVar = null;
                    } else {
                        p1.b bVar2 = (p1.b) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int iOrdinal = bVar2.ordinal();
                        if (iOrdinal == 1) {
                            bI = p.i(context, new ZipInputStream(inputStream), str2);
                        } else if (iOrdinal != 2) {
                            bI = p.d(inputStream, str2);
                        } else {
                            try {
                                bI = p.d(new GZIPInputStream(inputStream), str2);
                            } catch (IOException e10) {
                                bI = new B(e10);
                            }
                        }
                        kVar = bI.f19556a;
                        if (kVar == null) {
                            kVar = null;
                        }
                    }
                    break;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    com.airbnb.lottie.utils.c.a();
                    com.airbnb.lottie.utils.c.a();
                    try {
                        try {
                            try {
                                LottieFetchResult lottieFetchResultFetchSync = ((org.sufficientlysecure.htmltextview.k) dVar2.f41179c).fetchSync(str);
                                try {
                                    p1.a aVar = (p1.a) lottieFetchResultFetchSync;
                                    boolean zIsSuccessful = aVar.isSuccessful();
                                    if (zIsSuccessful) {
                                        InputStream inputStream2 = ((p1.a) lottieFetchResultFetchSync).f41169a.getInputStream();
                                        B bG = dVar2.g(context, str, inputStream2, ((p1.a) lottieFetchResultFetchSync).f41169a.getContentType(), str2);
                                        k kVar3 = bG.f19556a;
                                        com.airbnb.lottie.utils.c.a();
                                        aVar.close();
                                        b7 = bG;
                                        r11 = inputStream2;
                                    } else {
                                        B b10 = new B(new IllegalArgumentException(aVar.error()));
                                        aVar.close();
                                        b7 = b10;
                                        r11 = zIsSuccessful;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    lottieFetchResult = lottieFetchResultFetchSync;
                                    B b11 = new B(e);
                                    b7 = b11;
                                    r11 = lottieFetchResult;
                                    if (lottieFetchResult != null) {
                                        p1.a aVar2 = (p1.a) lottieFetchResult;
                                        aVar2.close();
                                        b7 = b11;
                                        r11 = aVar2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r10 = lottieFetchResultFetchSync;
                                    if (r10 == 0) {
                                        throw th;
                                    }
                                    try {
                                        ((p1.a) r10).close();
                                        throw th;
                                    } catch (IOException e12) {
                                        com.airbnb.lottie.utils.c.c("LottieFetchResult close failed ", e12);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r10 = r11;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } catch (IOException e14) {
                        com.airbnb.lottie.utils.c.c("LottieFetchResult close failed ", e14);
                        b7 = dVar2;
                    }
                    break;
                } else {
                    b7 = new B(kVar);
                }
                if (str2 != null && (kVar2 = b7.f19556a) != null) {
                    p212o1.f.f40011b.f40012a.put(str2, kVar2);
                }
                return b7;
            default:
                return p.b(this.f19891b, this.f19892c, this.f19893d);
        }
    }
}
