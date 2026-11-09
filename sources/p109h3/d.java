package p109h3;

import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableXml;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements CloseableXml {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f37272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37273e;

    @Override // com.facebook.imagepipeline.image.CloseableXml
    public final Drawable buildDrawable() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f37272d;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37272d = null;
        this.f37273e = true;
    }

    public final void finalize() throws Throwable {
        if (this.f37273e) {
            return;
        }
        a.x("CloseableImage", "finalize: %s %x still open.", d.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final int getHeight() {
        Drawable drawable = this.f37272d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final int getSizeInBytes() {
        return getHeight() * getWidth() * 4;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final int getWidth() {
        Drawable drawable = this.f37272d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public final boolean isClosed() {
        return this.f37273e;
    }
}
