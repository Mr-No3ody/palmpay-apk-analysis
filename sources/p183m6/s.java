package p183m6;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39548h;

    public s(r rVar) {
        long seconds;
        this.f39545e = "NG";
        this.f39542b = rVar.f39534b;
        int i7 = rVar.f39535c;
        this.f39543c = i7;
        if (i7 == 4 || 3 == i7) {
            long j6 = rVar.f39533a;
            TimeUnit timeUnit = TimeUnit.HOURS;
            seconds = j6 < timeUnit.toSeconds(8L) ? timeUnit.toSeconds(8L) : rVar.f39533a;
        } else if (i7 == 0 || i7 == 1) {
            seconds = rVar.f39533a;
            if (seconds < 30) {
                seconds = 30;
            }
        } else {
            long j10 = rVar.f39533a;
            TimeUnit timeUnit2 = TimeUnit.HOURS;
            seconds = j10 < timeUnit2.toSeconds(1L) ? timeUnit2.toSeconds(1L) : rVar.f39533a;
        }
        this.f39541a = seconds;
        this.f39544d = rVar.f39536d;
        this.f39545e = rVar.f39537e;
        this.f39546f = rVar.f39538f;
        this.f39547g = rVar.f39539g;
        this.f39548h = rVar.f39540h;
    }
}
