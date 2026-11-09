package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class l extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k[] f21894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZipFile f21895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f21896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f21897d;

    public l(m mVar, m mVar2) {
        this.f21897d = mVar;
        this.f21895b = new ZipFile(mVar.f21898e);
        this.f21896c = mVar2;
    }

    @Override // com.facebook.soloader.C
    public final B[] b() {
        k[] kVarArr = this.f21894a;
        if (kVarArr != null) {
            return kVarArr;
        }
        k[] kVarArrD = d();
        this.f21894a = kVarArrD;
        return kVarArrD;
    }

    @Override // com.facebook.soloader.C
    public final void c(File file) throws IOException {
        k[] kVarArrD = this.f21894a;
        if (kVarArrD == null) {
            kVarArrD = d();
            this.f21894a = kVarArrD;
        }
        byte[] bArr = new byte[32768];
        for (k kVar : kVarArrD) {
            InputStream inputStream = this.f21895b.getInputStream(kVar.f21892c);
            try {
                n nVar = new n(kVar, inputStream);
                inputStream = null;
                try {
                    C.a(nVar, bArr, file);
                    nVar.close();
                } catch (Throwable th) {
                    try {
                        nVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th3;
            }
        }
    }

    @Override // com.facebook.soloader.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21895b.close();
    }

    public final k[] d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(this.f21897d.f21899f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> enumerationEntries = this.f21895b.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                int iGroupCount = matcher.groupCount();
                String strGroup = matcher.group(iGroupCount - 1);
                String strGroup2 = matcher.group(iGroupCount);
                int i7 = 0;
                while (true) {
                    if (i7 >= supportedAbis.length) {
                        i7 = -1;
                        break;
                    }
                    String str = supportedAbis[i7];
                    if (str != null && strGroup.equals(str)) {
                        break;
                    }
                    i7++;
                }
                if (i7 >= 0) {
                    linkedHashSet.add(strGroup);
                    k kVar = (k) map.get(strGroup2);
                    if (kVar == null || i7 < kVar.f21893d) {
                        map.put(strGroup2, new k(strGroup2, zipEntryNextElement, i7));
                    }
                }
            }
        }
        this.f21896c.getClass();
        k[] kVarArr = (k[]) map.values().toArray(new k[map.size()]);
        Arrays.sort(kVarArr);
        return kVarArr;
    }
}
