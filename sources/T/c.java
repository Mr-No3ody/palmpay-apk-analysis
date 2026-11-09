package T;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f8914d;

    @Override // T.f
    public final void e(View view, float f10) {
        float fA = a(f10);
        float[] fArr = this.f8914d;
        fArr[0] = fA;
        com.palmpay.lib.apm.launchcounter.util.d.O(null, view, fArr);
    }
}
