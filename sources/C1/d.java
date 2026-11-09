package C1;

import J1.g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.h;
import com.bumptech.glide.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Resource, Initializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f1136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1137b;

    public d(Drawable drawable, int i7) {
        this.f1137b = i7;
        g.c(drawable, "Argument must not be null");
        this.f1136a = drawable;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        Drawable drawable = this.f1136a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        switch (this.f1137b) {
            case 0:
                return this.f1136a.getClass();
            default:
                return com.bumptech.glide.load.resource.gif.d.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        switch (this.f1137b) {
            case 0:
                Drawable drawable = this.f1136a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = (h) ((com.bumptech.glide.load.resource.gif.d) this.f1136a).f20982a.f18151b;
                return hVar.f20999a.getByteSize() + hVar.f21013o;
        }
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        switch (this.f1137b) {
            case 1:
                ((h) ((com.bumptech.glide.load.resource.gif.d) this.f1136a).f20982a.f18151b).f21010l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f1136a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof com.bumptech.glide.load.resource.gif.d) {
                    ((h) ((com.bumptech.glide.load.resource.gif.d) drawable).f20982a.f18151b).f21010l.prepareToDraw();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        switch (this.f1137b) {
            case 0:
                break;
            default:
                com.bumptech.glide.load.resource.gif.d dVar = (com.bumptech.glide.load.resource.gif.d) this.f1136a;
                dVar.stop();
                dVar.f20985d = true;
                h hVar = (h) dVar.f20982a.f18151b;
                hVar.f21001c.clear();
                Bitmap bitmap = hVar.f21010l;
                if (bitmap != null) {
                    hVar.f21003e.put(bitmap);
                    hVar.f21010l = null;
                }
                hVar.f21004f = false;
                com.bumptech.glide.load.resource.gif.f fVar = hVar.f21007i;
                p pVar = hVar.f21002d;
                if (fVar != null) {
                    pVar.e(fVar);
                    hVar.f21007i = null;
                }
                com.bumptech.glide.load.resource.gif.f fVar2 = hVar.f21009k;
                if (fVar2 != null) {
                    pVar.e(fVar2);
                    hVar.f21009k = null;
                }
                com.bumptech.glide.load.resource.gif.f fVar3 = hVar.f21012n;
                if (fVar3 != null) {
                    pVar.e(fVar3);
                    hVar.f21012n = null;
                }
                hVar.f20999a.clear();
                hVar.f21008j = true;
                break;
        }
    }

    private final void a() {
    }
}
