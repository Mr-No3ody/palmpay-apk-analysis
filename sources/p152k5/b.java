package p152k5;

import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f38668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long[] f38669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f38671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f38672e;

    public b(d dVar, g gVar, long[] jArr, long j6, long j10) {
        this.f38672e = dVar;
        this.f38668a = gVar;
        this.f38669b = jArr;
        this.f38670c = j6;
        this.f38671d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f38672e;
        MappedByteBuffer mappedByteBuffer = dVar.f38683e;
        g gVar = this.f38668a;
        Long l5 = (Long) gVar.a(mappedByteBuffer);
        long jLongValue = (l5 != null ? l5.longValue() : this.f38670c) + this.f38671d;
        this.f38669b[0] = jLongValue;
        MappedByteBuffer mappedByteBuffer2 = dVar.f38683e;
        mappedByteBuffer2.position(gVar.f38695c);
        mappedByteBuffer2.put((byte) 2);
        mappedByteBuffer2.putShort((short) 8);
        mappedByteBuffer2.putLong(jLongValue);
    }
}
