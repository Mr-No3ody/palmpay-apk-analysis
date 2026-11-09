package C2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.e;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.d;
import com.facebook.react.uimanager.ViewProps;
import org.sufficientlysecure.htmltextview.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends F2.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public d f1141A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final top.zibin.luban.io.a f1142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.work.impl.model.b f1143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CacheKey f1144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Supplier f1145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f1147z;

    public a(Resources resources, E2.a aVar, DrawableFactory drawableFactory, f fVar, p180m2.d dVar, androidx.work.impl.model.b bVar) {
        super(aVar, dVar);
        this.f1142u = new top.zibin.luban.io.a(resources, 3, drawableFactory, fVar);
        this.f1143v = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m o(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof m) {
            return (m) drawable;
        }
        if (drawable instanceof DrawableParent) {
            return o(((DrawableParent) drawable).getDrawable());
        }
        if (!(drawable instanceof e)) {
            return null;
        }
        e eVar = (e) drawable;
        int length = eVar.f21242c.length;
        for (int i7 = 0; i7 < length; i7++) {
            m mVarO = o(eVar.c(i7));
            if (mVarO != null) {
                return mVarO;
            }
        }
        return null;
    }

    @Override // F2.c
    public final Drawable b(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        try {
            p181m3.a.a();
            p213o2.e.f(CloseableReference.h(closeableReference));
            CloseableImage closeableImage = (CloseableImage) closeableReference.f();
            p(closeableImage);
            Drawable drawableCreateDrawable = this.f1142u.createDrawable(closeableImage);
            if (drawableCreateDrawable != null) {
                p181m3.a.a();
                return drawableCreateDrawable;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + closeableImage);
        } catch (Throwable th) {
            p181m3.a.a();
            throw th;
        }
    }

    @Override // F2.c
    public final ImageInfo d(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        p213o2.e.f(CloseableReference.h(closeableReference));
        return ((CloseableImage) closeableReference.f()).getImageInfo();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final boolean isSameImageRequest(DraweeController draweeController) {
        CacheKey cacheKey = this.f1144w;
        if (cacheKey == null || !(draweeController instanceof a)) {
            return false;
        }
        return p213o2.e.h(cacheKey, ((a) draweeController).f1144w);
    }

    public final void p(CloseableImage closeableImage) {
        m mVarO;
        if (this.f1146y) {
            if (this.f2540g == null) {
                G2.a aVar = new G2.a();
                a(new H2.a(aVar));
                this.f2540g = aVar;
                SettableDraweeHierarchy settableDraweeHierarchy = this.f2539f;
                if (settableDraweeHierarchy != null) {
                    settableDraweeHierarchy.setControllerOverlay(aVar);
                }
            }
            G2.a aVar2 = this.f2540g;
            if (aVar2 != null) {
                String str = this.f2541h;
                aVar2.getClass();
                if (str == null) {
                    str = ViewProps.NONE;
                }
                aVar2.f2970a = str;
                aVar2.invalidateSelf();
                SettableDraweeHierarchy settableDraweeHierarchy2 = this.f2539f;
                aVar2.f2974e = (settableDraweeHierarchy2 == null || (mVarO = o(settableDraweeHierarchy2.getTopLevelDrawable())) == null) ? null : mVarO.f21323a;
                Object obj = this.f2542i;
                String string = obj != null ? obj.toString() : null;
                if (string != null) {
                    aVar2.f2975f.put("cc", string);
                }
                if (closeableImage == null) {
                    aVar2.b();
                    return;
                }
                int width = closeableImage.getWidth();
                int height = closeableImage.getHeight();
                aVar2.f2971b = width;
                aVar2.f2972c = height;
                aVar2.invalidateSelf();
                aVar2.f2973d = closeableImage.getSizeInBytes();
            }
        }
    }

    @Override // F2.c, com.facebook.drawee.interfaces.DraweeController
    public final void setHierarchy(DraweeHierarchy draweeHierarchy) {
        super.setHierarchy(draweeHierarchy);
        p(null);
    }

    @Override // F2.c
    public final String toString() {
        androidx.camera.video.internal.c cVarM = p213o2.e.m(this);
        cVarM.c(super.toString(), "super");
        cVarM.c(this.f1145x, "dataSourceSupplier");
        return cVarM.toString();
    }
}
