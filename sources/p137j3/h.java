package p137j3;

import java.util.LinkedList;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f38233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38234d;

    public h(int i7, int i10, int i11) {
        e.f(i7 > 0);
        e.f(i10 >= 0);
        e.f(i11 >= 0);
        this.f38231a = i7;
        this.f38232b = i10;
        this.f38233c = new LinkedList();
        this.f38234d = i11;
    }

    public Object a() {
        return this.f38233c.poll();
    }
}
