package Q;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends j {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f7578w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f7579x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f7580y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f7581z0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f7571A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f7572B0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f7573C0 = false;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f7574D0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f7575E0 = 0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final R.b f7576F0 = new R.b();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public BasicMeasure$Measurer f7577G0 = null;

    public abstract void T(int i7, int i10, int i11, int i12);

    public final void U(e eVar, d dVar, int i7, d dVar2, int i10) {
        BasicMeasure$Measurer basicMeasure$Measurer;
        e eVar2;
        while (true) {
            basicMeasure$Measurer = this.f7577G0;
            if (basicMeasure$Measurer != null || (eVar2 = this.f7454V) == null) {
                break;
            } else {
                this.f7577G0 = ((f) eVar2).f7521y0;
            }
        }
        R.b bVar = this.f7576F0;
        bVar.f7852a = dVar;
        bVar.f7853b = dVar2;
        bVar.f7854c = i7;
        bVar.f7855d = i10;
        basicMeasure$Measurer.measure(eVar, bVar);
        eVar.P(bVar.f7856e);
        eVar.M(bVar.f7857f);
        eVar.f7437E = bVar.f7859h;
        eVar.J(bVar.f7858g);
    }

    @Override // Q.j, androidx.constraintlayout.core.widgets.Helper
    public final void updateConstraints(f fVar) {
        for (int i7 = 0; i7 < this.f7569v0; i7++) {
            e eVar = this.f7568u0[i7];
            if (eVar != null) {
                eVar.f7439G = true;
            }
        }
    }
}
