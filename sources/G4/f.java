package G4;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f2990g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f2993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f2995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2996f;

    public static synchronized f a(int i7, e eVar) {
        f fVar;
        fVar = new f();
        if (i7 <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        fVar.f2992b = i7;
        fVar.f2993c = new Object[i7];
        fVar.f2994d = 0;
        fVar.f2995e = eVar;
        fVar.f2996f = 1.0f;
        fVar.d();
        int i10 = f2990g;
        fVar.f2991a = i10;
        f2990g = i10 + 1;
        return fVar;
    }

    public final synchronized e b() {
        e eVar;
        try {
            if (this.f2994d == -1 && this.f2996f > 0.0f) {
                d();
            }
            Object[] objArr = this.f2993c;
            int i7 = this.f2994d;
            eVar = (e) objArr[i7];
            eVar.f2989a = -1;
            this.f2994d = i7 - 1;
        } catch (Throwable th) {
            throw th;
        }
        return eVar;
    }

    public final synchronized void c(e eVar) {
        try {
            int i7 = eVar.f2989a;
            if (i7 != -1) {
                if (i7 == this.f2991a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + eVar.f2989a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i10 = this.f2994d + 1;
            this.f2994d = i10;
            if (i10 >= this.f2993c.length) {
                int i11 = this.f2992b;
                int i12 = i11 * 2;
                this.f2992b = i12;
                Object[] objArr = new Object[i12];
                for (int i13 = 0; i13 < i11; i13++) {
                    objArr[i13] = this.f2993c[i13];
                }
                this.f2993c = objArr;
            }
            eVar.f2989a = this.f2991a;
            this.f2993c[this.f2994d] = eVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f10 = this.f2996f;
        int i7 = this.f2992b;
        int i10 = (int) (i7 * f10);
        if (i10 < 1) {
            i7 = 1;
        } else if (i10 <= i7) {
            i7 = i10;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            this.f2993c[i11] = this.f2995e.a();
        }
        this.f2994d = i7 - 1;
    }
}
