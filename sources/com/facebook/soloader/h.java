package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21889a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21890b;

    /* JADX WARN: Bottom block not found for handler: all -> 0x0105 */
    /* JADX WARN: Code duplicated, block: B:6:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(com.facebook.soloader.j r18, com.facebook.soloader.j r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.h.<init>(com.facebook.soloader.j, com.facebook.soloader.j):void");
    }

    @Override // com.facebook.soloader.C
    public final B[] b() {
        switch (this.f21889a) {
            case 0:
                return (i[]) this.f21890b;
            default:
                ArrayList arrayList = new ArrayList();
                for (m mVar : ((C1392b) this.f21890b).f21870e) {
                    mVar.getClass();
                    l lVar = new l(mVar, mVar);
                    try {
                        k[] kVarArrD = lVar.f21894a;
                        if (kVarArrD == null) {
                            kVarArrD = lVar.d();
                            lVar.f21894a = kVarArrD;
                        }
                        arrayList.addAll(Arrays.asList(kVarArrD));
                        lVar.close();
                    } catch (Throwable th) {
                        try {
                            lVar.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return (B[]) arrayList.toArray(new B[arrayList.size()]);
        }
    }

    @Override // com.facebook.soloader.C
    public final void c(File file) throws IOException {
        switch (this.f21889a) {
            case 0:
                byte[] bArr = new byte[32768];
                for (i iVar : (i[]) this.f21890b) {
                    FileInputStream fileInputStream = new FileInputStream(iVar.f21891c);
                    try {
                        n nVar = new n(iVar, fileInputStream);
                        fileInputStream = null;
                        try {
                            C.a(nVar, bArr, file);
                            nVar.close();
                        } catch (Throwable th) {
                            try {
                                nVar.close();
                                break;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th3;
                    }
                }
                return;
            default:
                for (m mVar : ((C1392b) this.f21890b).f21870e) {
                    mVar.getClass();
                    l lVar = new l(mVar, mVar);
                    try {
                        lVar.c(file);
                        lVar.close();
                    } catch (Throwable th4) {
                        try {
                            lVar.close();
                            break;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                return;
        }
    }

    public h(C1392b c1392b) {
        this.f21890b = c1392b;
    }
}
