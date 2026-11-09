package g3;

import E.AbstractC0198c;
import com.facebook.common.memory.ByteArrayPool;
import java.io.IOException;
import java.io.InputStream;
import p213o2.e;
import p262r2.d;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ByteArrayPool f36849h;

    public c(ByteArrayPool byteArrayPool) {
        byteArrayPool.getClass();
        this.f36849h = byteArrayPool;
        this.f36844c = 0;
        this.f36843b = 0;
        this.f36845d = 0;
        this.f36847f = 0;
        this.f36846e = 0;
        this.f36842a = 0;
    }

    public final boolean a(d dVar) throws Throwable {
        int i7;
        int i10 = this.f36846e;
        while (this.f36842a != 6 && (i7 = dVar.read()) != -1) {
            try {
                int i11 = this.f36844c;
                this.f36844c = i11 + 1;
                if (this.f36848g) {
                    this.f36842a = 6;
                    this.f36848g = false;
                    return false;
                }
                int i12 = this.f36842a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    this.f36842a = 5;
                                } else if (i12 != 5) {
                                    e.f(false);
                                } else {
                                    int i13 = ((this.f36843b << 8) + i7) - 2;
                                    AbstractC0198c.d0(dVar, i13);
                                    this.f36844c += i13;
                                    this.f36842a = 2;
                                }
                            } else if (i7 == 255) {
                                this.f36842a = 3;
                            } else if (i7 == 0) {
                                this.f36842a = 2;
                            } else if (i7 == 217) {
                                this.f36848g = true;
                                int i14 = i11 - 1;
                                int i15 = this.f36845d;
                                if (i15 > 0) {
                                    this.f36847f = i14;
                                }
                                this.f36845d = i15 + 1;
                                this.f36846e = i15;
                                this.f36842a = 2;
                            } else {
                                if (i7 == 218) {
                                    int i16 = i11 - 1;
                                    int i17 = this.f36845d;
                                    if (i17 > 0) {
                                        this.f36847f = i16;
                                    }
                                    this.f36845d = i17 + 1;
                                    this.f36846e = i17;
                                }
                                if (i7 == 1 || ((i7 >= 208 && i7 <= 215) || i7 == 217 || i7 == 216)) {
                                    this.f36842a = 2;
                                } else {
                                    this.f36842a = 4;
                                }
                            }
                        } else if (i7 == 255) {
                            this.f36842a = 3;
                        }
                    } else if (i7 == 216) {
                        this.f36842a = 2;
                    } else {
                        this.f36842a = 6;
                    }
                } else if (i7 == 255) {
                    this.f36842a = 1;
                } else {
                    this.f36842a = 6;
                }
                this.f36843b = i7;
            } catch (IOException e10) {
                e.j(e10);
                throw null;
            }
        }
        return (this.f36842a == 6 || this.f36846e == i10) ? false : true;
    }

    public final boolean b(p109h3.e eVar) {
        if (this.f36842a == 6 || eVar.f() <= this.f36844c) {
            return false;
        }
        InputStream inputStreamE = eVar.e();
        inputStreamE.getClass();
        ByteArrayPool byteArrayPool = this.f36849h;
        d dVar = new d(inputStreamE, byteArrayPool.get(16384), byteArrayPool);
        try {
            try {
                AbstractC0198c.d0(dVar, this.f36844c);
                boolean zA = a(dVar);
                p213o2.a.b(dVar);
                return zA;
            } catch (IOException e10) {
                e.j(e10);
                throw null;
            }
        } catch (Throwable th) {
            p213o2.a.b(dVar);
            throw th;
        }
    }
}
