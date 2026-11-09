package Eg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f2449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f2454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f2457j;

    public i(l lVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f2457j = lVar;
        this.f2448a = key;
        lVar.getClass();
        this.f2449b = new long[2];
        this.f2450c = new ArrayList();
        this.f2451d = new ArrayList();
        StringBuilder sb2 = new StringBuilder(key);
        sb2.append('.');
        int length = sb2.length();
        for (int i7 = 0; i7 < 2; i7++) {
            sb2.append(i7);
            this.f2450c.add(new File(this.f2457j.f2481b, sb2.toString()));
            sb2.append(".tmp");
            this.f2451d.add(new File(this.f2457j.f2481b, sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final j a() {
        byte[] bArr = Dg.c.f1879a;
        if (!this.f2452e) {
            return null;
        }
        l lVar = this.f2457j;
        if (!lVar.t && (this.f2454g != null || this.f2453f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f2449b.clone();
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                Source source = lVar.f2480a.source((File) this.f2450c.get(i7));
                if (!lVar.t) {
                    this.f2455h++;
                    source = new h(source, lVar, this);
                }
                arrayList.add(source);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Dg.c.c((Source) it.next());
                }
                try {
                    lVar.k(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new j(this.f2457j, this.f2448a, this.f2456i, arrayList, jArr);
    }
}
