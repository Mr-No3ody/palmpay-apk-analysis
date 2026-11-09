package p137j3;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BitmapPool;
import p262r2.c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c implements BitmapPool {
    public j(c cVar, x xVar, u uVar) {
        super(cVar, xVar, uVar);
        cVar.registerMemoryTrimmable(this);
        uVar.setBasePool(this);
    }

    @Override // p137j3.c
    public final Object a(int i7) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // p137j3.c
    public final void c(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // p137j3.c
    public final int f(Object obj) {
        return ((Bitmap) obj).getAllocationByteCount();
    }

    @Override // p137j3.c
    public final Object h(h hVar) {
        Bitmap bitmap = (Bitmap) super.h(hVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // p137j3.c
    public final boolean j(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // p137j3.c
    public final int e(int i7) {
        return i7;
    }

    @Override // p137j3.c
    public final int g(int i7) {
        return i7;
    }
}
