package Ug;

import Pa.C0505b;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9802A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9803B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9804C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9805D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9806E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9807F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public byte[] f9808G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9809H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9810I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f9811J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f9812K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f9813L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9814M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f9815N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f9816O;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f9821T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f9822U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f9823V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f9824W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f9825X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public byte[] f9826Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9828b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f9830d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9836j;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[] f9850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte[] f9851z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9827a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f9829c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f9831e = new int[3240];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9832f = new int[3240];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0505b f9837k = new C0505b((byte) 0, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0505b f9838l = new C0505b((byte) 0, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0505b f9839m = new C0505b((byte) 0, 1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f9840n = new int[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f9841o = new int[3];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f9842p = new int[6];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f9843q = {16, 15, 11, 4};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9844r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9845s = 0;
    public int t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9846u = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f9817P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f9818Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final byte[] f9819R = new byte[0];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f9820S = 0;

    public static void a(f fVar, InputStream inputStream) {
        int i7;
        if (fVar.f9827a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a aVar = fVar.f9829c;
        if (aVar.f9773d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        byte[] bArr = aVar.f9770a;
        p1.d dVar = aVar.f9772c;
        dVar.f41178b = bArr;
        dVar.f41179c = aVar.f9771b;
        aVar.f9773d = inputStream;
        aVar.f9775f = 0L;
        aVar.f9776g = 64;
        aVar.f9777h = 1024;
        aVar.f9774e = false;
        a.e(aVar);
        a.a(aVar, false);
        a.b(aVar);
        a.b(aVar);
        if (a.d(aVar, 1) == 0) {
            i7 = 16;
        } else {
            int iD = a.d(aVar, 3);
            i7 = 17;
            if (iD != 0) {
                i7 = 17 + iD;
            } else {
                int iD2 = a.d(aVar, 3);
                if (iD2 != 0) {
                    i7 = iD2 + 8;
                }
            }
        }
        if (i7 == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i10 = 1 << i7;
        fVar.f9816O = i10;
        fVar.f9815N = i10 - 16;
        fVar.f9827a = 1;
    }
}
