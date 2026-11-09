package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.core.graphics.g[] f18180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18182c;

    public m() {
        this.f18180a = null;
        this.f18182c = 0;
    }

    public androidx.core.graphics.g[] getPathData() {
        return this.f18180a;
    }

    public String getPathName() {
        return this.f18181b;
    }

    public void setPathData(androidx.core.graphics.g[] gVarArr) {
        androidx.core.graphics.g[] gVarArr2 = this.f18180a;
        boolean z3 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i7 = 0;
            while (true) {
                if (i7 >= gVarArr2.length) {
                    z3 = true;
                    break;
                }
                androidx.core.graphics.g gVar = gVarArr2[i7];
                char c6 = gVar.f16063a;
                androidx.core.graphics.g gVar2 = gVarArr[i7];
                if (c6 != gVar2.f16063a || gVar.f16064b.length != gVar2.f16064b.length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (!z3) {
            this.f18180a = androidx.core.graphics.o.m(gVarArr);
            return;
        }
        androidx.core.graphics.g[] gVarArr3 = this.f18180a;
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            gVarArr3[i10].f16063a = gVarArr[i10].f16063a;
            int i11 = 0;
            while (true) {
                float[] fArr = gVarArr[i10].f16064b;
                if (i11 < fArr.length) {
                    gVarArr3[i10].f16064b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f18180a = null;
        this.f18182c = 0;
        this.f18181b = mVar.f18181b;
        this.f18180a = androidx.core.graphics.o.m(mVar.f18180a);
    }
}
