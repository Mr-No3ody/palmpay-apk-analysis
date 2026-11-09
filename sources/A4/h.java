package A4;

import G4.i;
import android.graphics.Paint;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f58j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f59k = Float.POSITIVE_INFINITY;

    public h(g gVar) {
        this.f43b = 0.0f;
    }

    public final float b(Paint paint) {
        paint.setTextSize(this.f44c);
        return (this.f43b * 2.0f) + i.a(paint, a());
    }

    public final float c(Paint paint) {
        paint.setTextSize(this.f44c);
        String strA = a();
        DisplayMetrics displayMetrics = i.f3002a;
        float fMeasureText = (this.f42a * 2.0f) + ((int) paint.measureText(strA));
        float fB = this.f59k;
        if (fB > 0.0f && fB != Float.POSITIVE_INFINITY) {
            fB = i.b(fB);
        }
        if (fB <= 0.0d) {
            fB = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fB));
    }

    public final boolean d() {
        return this.f38f && this.f58j == 1;
    }
}
