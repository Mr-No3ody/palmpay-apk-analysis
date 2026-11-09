package A1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.u;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f23a = u.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.load.b f26d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f27e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f29g;

    public d(int i7, int i10, h hVar) {
        this.f24b = i7;
        this.f25c = i10;
        this.f26d = (com.bumptech.glide.load.b) hVar.a(o.f20933f);
        this.f27e = (m) hVar.a(m.f20930g);
        g gVar = o.f20936i;
        this.f28f = hVar.a(gVar) != null && ((Boolean) hVar.a(gVar)).booleanValue();
        this.f29g = (i) hVar.a(o.f20934g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f23a.c(this.f24b, this.f25c, this.f28f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f26d == com.bumptech.glide.load.b.f20515b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new c());
        Size size = imageInfo.getSize();
        int width = this.f24b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f25c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f27e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f29g;
        if (iVar != null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.f20808a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i7 >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
