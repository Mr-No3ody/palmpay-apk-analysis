package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Internal$EnumVerifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f16450b = new D(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f16451c = new D(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f16452d = new D(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f16453e = new D(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f16454f = new D(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D f16455g = new D(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f16456h = new D(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D f16457i = new D(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final D f16458j = new D(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D f16459k = new D(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D f16460l = new D(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final D f16461m = new D(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final D f16462n = new D(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final D f16463o = new D(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final D f16464p = new D(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final D f16465q = new D(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final D f16466r = new D(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16467a;

    public /* synthetic */ D(int i7) {
        this.f16467a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
    public final boolean isInRange(int i7) {
        T t;
        switch (this.f16467a) {
            case 0:
                return E.a(i7) != null;
            case 1:
                if (i7 != 0) {
                    t = i7 != 1 ? null : T.UNVERIFIED;
                } else {
                    t = T.DECLARATION;
                }
                return t != null;
            case 2:
                return W.a(i7) != null;
            case 3:
                return X.a(i7) != null;
            case 4:
                return Y.a(i7) != null;
            case 5:
                return Z.a(i7) != null;
            case 6:
                return EnumC1075a0.a(i7) != null;
            case 7:
                return EnumC1079b0.a(i7) != null;
            case 8:
                return EnumC1099g0.a(i7) != null;
            case 9:
                return EnumC1103h0.a(i7) != null;
            case 10:
                return EnumC1115k0.a(i7) != null;
            case 11:
                return EnumC1130p0.a(i7) != null;
            case 12:
                return EnumC1133q0.a(i7) != null;
            case 13:
                return EnumC1135r0.a(i7) != null;
            case 14:
                return EnumC1150w0.a(i7) != null;
            case 15:
                return EnumC1159z0.a(i7) != null;
            default:
                return G0.a(i7) != null;
        }
    }
}
