package F2;

import android.content.res.Resources;
import androidx.appcompat.widget.m1;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements SimpleDraweeControllerBuilder {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f2557g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final NullPointerException f2558h = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicLong f2559i = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.facebook.imagepipeline.request.d f2561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.facebook.imagepipeline.request.d f2562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ControllerListener f2563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DraweeController f2565f;

    @Override // com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2.a build() {
        C2.a aVar;
        CacheKey postprocessedBitmapCacheKey;
        com.facebook.imagepipeline.request.d dVar;
        if (this.f2561b == null && (dVar = this.f2562c) != null) {
            this.f2561b = dVar;
            this.f2562c = null;
        }
        p181m3.a.a();
        C2.b bVar = (C2.b) this;
        p181m3.a.a();
        try {
            DraweeController draweeController = bVar.f2565f;
            String strValueOf = String.valueOf(f2559i.getAndIncrement());
            if (draweeController instanceof C2.a) {
                aVar = (C2.a) draweeController;
            } else {
                m1 m1Var = bVar.f1149k;
                C2.a aVar2 = new C2.a((Resources) m1Var.f12971a, (E2.a) m1Var.f12972b, (DrawableFactory) m1Var.f12973c, (org.sufficientlysecure.htmltextview.f) m1Var.f12974d, (p180m2.d) m1Var.f12975e, (androidx.work.impl.model.b) m1Var.f12976f);
                if (((Q2.a) m1Var.f12977g) != null) {
                    aVar2.f1146y = Boolean.FALSE.booleanValue();
                }
                aVar = aVar2;
            }
            Supplier supplierC = bVar.c(aVar, strValueOf);
            com.facebook.imagepipeline.request.d dVar2 = bVar.f2561b;
            CacheKeyFactory cacheKeyFactory = bVar.f1148j.f36039h;
            if (cacheKeyFactory == null || dVar2 == null) {
                postprocessedBitmapCacheKey = null;
            } else {
                postprocessedBitmapCacheKey = dVar2.getPostprocessor() != null ? cacheKeyFactory.getPostprocessedBitmapCacheKey(dVar2, bVar.f2560a) : cacheKeyFactory.getBitmapCacheKey(dVar2, bVar.f2560a);
            }
            Object obj = bVar.f2560a;
            aVar.getClass();
            p181m3.a.a();
            aVar.f(obj, strValueOf);
            aVar.f2549p = false;
            aVar.f1145x = supplierC;
            aVar.p(null);
            aVar.f1144w = postprocessedBitmapCacheKey;
            aVar.p(null);
            p181m3.a.a();
            synchronized (aVar) {
                aVar.f1147z = bVar.f2561b;
                aVar.f1141A = bVar.f2562c;
            }
            p181m3.a.a();
            aVar.f2546m = null;
            ControllerListener controllerListener = this.f2563d;
            if (controllerListener != null) {
                aVar.a(controllerListener);
            }
            if (this.f2564e) {
                aVar.a(f2557g);
            }
            p181m3.a.a();
            return aVar;
        } catch (Throwable th) {
            p181m3.a.a();
            throw th;
        }
    }

    public final void b() {
        this.f2560a = null;
        this.f2561b = null;
        this.f2562c = null;
        this.f2563d = null;
        this.f2564e = false;
        this.f2565f = null;
    }

    public final Supplier c(C2.a aVar, String str) {
        f fVar;
        C2.a aVar2;
        String str2;
        Supplier fVar2;
        com.facebook.imagepipeline.request.d dVar = this.f2561b;
        if (dVar != null) {
            fVar = this;
            aVar2 = aVar;
            str2 = str;
            fVar2 = new e(fVar, aVar2, str2, dVar, this.f2560a, 1);
        } else {
            fVar = this;
            aVar2 = aVar;
            str2 = str;
            fVar2 = null;
        }
        if (fVar2 != null && fVar.f2562c != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(fVar2);
            arrayList.add(new e(fVar, aVar2, str2, fVar.f2562c, fVar.f2560a, 1));
            fVar2 = new p360y2.f(arrayList);
        }
        return fVar2 == null ? new Q2.a(5) : fVar2;
    }

    @Override // com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
    public final SimpleDraweeControllerBuilder setCallerContext(Object obj) {
        this.f2560a = obj;
        return this;
    }

    @Override // com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
    public final SimpleDraweeControllerBuilder setOldController(DraweeController draweeController) {
        this.f2565f = draweeController;
        return this;
    }
}
