package G4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f2986d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2987b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2988c = 0.0f;

    static {
        f fVarA = f.a(32, new d());
        f2986d = fVarA;
        fVarA.f2996f = 0.5f;
    }

    public static d b(float f10, float f11) {
        d dVar = (d) f2986d.b();
        dVar.f2987b = f10;
        dVar.f2988c = f11;
        return dVar;
    }

    public static void c(d dVar) {
        f2986d.c(dVar);
    }

    @Override // G4.e
    public final e a() {
        return new d();
    }
}
