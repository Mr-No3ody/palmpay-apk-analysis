package p137j3;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import p045d3.k;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f38227e;

    public d(int i7, int i10) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f38225c = i7;
        this.f38226d = i10;
        this.f38227e = new k(this, 23);
    }

    public final synchronized void a(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        e.b(this.f38223a > 0, "No bitmaps registered.");
        long j6 = sizeInBytes;
        e.c(j6 <= this.f38224b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(sizeInBytes), Long.valueOf(this.f38224b));
        this.f38224b -= j6;
        this.f38223a--;
    }

    public final synchronized int b() {
        return this.f38226d;
    }
}
