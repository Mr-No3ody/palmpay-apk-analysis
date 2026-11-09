package top.zibin.luban.io;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements PoolAble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.c f42658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f42660c;

    public e(p1.c cVar) {
        this.f42658a = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f42659b == eVar.f42659b && this.f42660c == eVar.f42660c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f42659b * 31;
        Class cls = this.f42660c;
        return i7 + (cls != null ? cls.hashCode() : 0);
    }

    @Override // top.zibin.luban.io.PoolAble
    public final void offer() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f42658a.f41176b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(this);
        }
    }

    public final String toString() {
        return "Key{size=" + this.f42659b + "array=" + this.f42660c + '}';
    }
}
