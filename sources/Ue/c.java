package Ue;

import android.animation.ArgbEvaluator;
import android.graphics.Paint;
import com.zhpan.indicator.drawer.IDrawer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements IDrawer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f9759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArgbEvaluator f9760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ve.a f9761f;

    static {
        new a(null);
    }

    public c(Ve.a mIndicatorOptions) {
        Intrinsics.g(mIndicatorOptions, "mIndicatorOptions");
        this.f9761f = mIndicatorOptions;
        Paint paint = new Paint();
        this.f9759d = paint;
        paint.setAntiAlias(true);
        this.f9756a = new b();
        int i7 = mIndicatorOptions.f10331c;
        if (i7 == 4 || i7 == 5) {
            this.f9760e = new ArgbEvaluator();
        }
    }

    public int a() {
        return ((int) this.f9761f.a()) + 3;
    }

    @Override // com.zhpan.indicator.drawer.IDrawer
    public final b onMeasure(int i7, int i10) {
        Ve.a aVar = this.f9761f;
        float f10 = aVar.f10337i;
        float f11 = aVar.f10338j;
        float f12 = f10 < f11 ? f11 : f10;
        this.f9757b = f12;
        if (f10 > f11) {
            f10 = f11;
        }
        this.f9758c = f10;
        int i11 = aVar.f10329a;
        b bVar = this.f9756a;
        if (i11 != 1) {
            float f13 = aVar.f10332d - 1;
            int i12 = ((int) ((f13 * f10) + (aVar.f10335g * f13) + f12)) + 6;
            int iA = a();
            bVar.f9754a = i12;
            bVar.f9755b = iA;
            return bVar;
        }
        int iA2 = a();
        Ve.a aVar2 = this.f9761f;
        float f14 = aVar2.f10332d - 1;
        int i13 = ((int) ((f14 * this.f9758c) + (aVar2.f10335g * f14) + this.f9757b)) + 6;
        bVar.f9754a = iA2;
        bVar.f9755b = i13;
        return bVar;
    }

    @Override // com.zhpan.indicator.drawer.IDrawer
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }
}
