package p318v1;

import Eg.g;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f43039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File[] f43040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File[] f43041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f43043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f43044g;

    public b(c cVar, String str) {
        this.f43044g = cVar;
        this.f43038a = str;
        int i7 = cVar.f43051g;
        this.f43039b = new long[i7];
        this.f43040c = new File[i7];
        this.f43041d = new File[i7];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < cVar.f43051g; i10++) {
            sb2.append(i10);
            File[] fileArr = this.f43040c;
            String string = sb2.toString();
            File file = cVar.f43045a;
            fileArr[i10] = new File(file, string);
            sb2.append(".tmp");
            this.f43041d[i10] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j6 : this.f43039b) {
            sb2.append(' ');
            sb2.append(j6);
        }
        return sb2.toString();
    }
}
