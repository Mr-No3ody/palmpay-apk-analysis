package B1;

import J1.g;
import J1.o;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Resource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f359a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f360b;

    public b(byte[] bArr) {
        g.c(bArr, "Argument must not be null");
        this.f360b = bArr;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        switch (this.f359a) {
            case 0:
                return (byte[]) this.f360b;
            case 1:
                return (AnimatedImageDrawable) this.f360b;
            default:
                return (File) this.f360b;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        switch (this.f359a) {
            case 0:
                return byte[].class;
            case 1:
                return Drawable.class;
            default:
                return ((File) this.f360b).getClass();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        switch (this.f359a) {
            case 0:
                return ((byte[]) this.f360b).length;
            case 1:
                return o.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f360b).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f360b).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        switch (this.f359a) {
            case 1:
                ((AnimatedImageDrawable) this.f360b).stop();
                ((AnimatedImageDrawable) this.f360b).clearAnimationCallbacks();
                break;
        }
    }

    public b(File file) {
        g.c(file, "Argument must not be null");
        this.f360b = file;
    }

    public b(AnimatedImageDrawable animatedImageDrawable) {
        this.f360b = animatedImageDrawable;
    }

    private final void a() {
    }

    private final void b() {
    }
}
