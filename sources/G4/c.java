package G4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f2983d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f2984b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f2985c = 0.0d;

    static {
        f fVarA = f.a(64, new c());
        f2983d = fVarA;
        fVarA.f2996f = 0.5f;
    }

    public static c b(double d2, double d10) {
        c cVar = (c) f2983d.b();
        cVar.f2984b = d2;
        cVar.f2985c = d10;
        return cVar;
    }

    @Override // G4.e
    public final e a() {
        return new c();
    }

    public final String toString() {
        return "MPPointD, x: " + this.f2984b + ", y: " + this.f2985c;
    }
}
