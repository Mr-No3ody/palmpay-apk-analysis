package C2;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.m1;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import org.sufficientlysecure.htmltextview.f;
import p061e3.k;
import p061e3.s;
import p180m2.d;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f1152c;

    public c(Context context, Sd.b bVar) {
        E2.a aVar;
        s sVar = s.f36098p;
        e.e(sVar, "ImagePipelineFactory was not initialized!");
        this.f1150a = context;
        k kVarE = sVar.e();
        this.f1151b = kVarE;
        m1 m1Var = new m1();
        this.f1152c = m1Var;
        Resources resources = context.getResources();
        synchronized (E2.a.class) {
            try {
                if (E2.a.f2180g == null) {
                    E2.a.f2180g = new E2.a(0);
                }
                aVar = E2.a.f2180g;
            } catch (Throwable th) {
                throw th;
            }
        }
        AnimatedFactory animatedFactoryA = sVar.a();
        DrawableFactory animatedDrawableFactory = animatedFactoryA == null ? null : animatedFactoryA.getAnimatedDrawableFactory(context);
        f fVar = sVar.f36101b.f36081z.f36097i ? new f(10) : null;
        d dVarB = d.b();
        androidx.work.impl.model.b bVar2 = kVarE.f36037f;
        Q2.a aVar2 = (Q2.a) bVar.f8871b;
        m1Var.f12971a = resources;
        m1Var.f12972b = aVar;
        m1Var.f12973c = animatedDrawableFactory;
        m1Var.f12974d = fVar;
        m1Var.f12975e = dVarB;
        m1Var.f12976f = bVar2;
        m1Var.f12977g = aVar2;
    }

    @Override // com.facebook.common.internal.Supplier
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b get() {
        return new b(this.f1150a, this.f1152c, this.f1151b);
    }
}
