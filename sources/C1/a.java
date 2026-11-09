package C1;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.resource.bitmap.C1331c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ResourceDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1133b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f1132a = i7;
        this.f1133b = obj;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i7, int i10, h hVar) {
        switch (this.f1132a) {
            case 0:
                return b.a(ImageDecoder.createSource((ByteBuffer) obj), i7, i10, hVar);
            case 1:
                return b.a(ImageDecoder.createSource(J1.c.b((InputStream) obj)), i7, i10, hVar);
            default:
                return C1331c.a((BitmapPool) this.f1133b, ((GifDecoder) obj).getNextFrame());
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, h hVar) throws IOException {
        switch (this.f1132a) {
            case 0:
                ImageHeaderParser.ImageType imageTypeC = com.bumptech.glide.load.e.c(((b) this.f1133b).f1134a, (ByteBuffer) obj);
                return imageTypeC == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeC == ImageHeaderParser.ImageType.ANIMATED_AVIF);
            case 1:
                b bVar = (b) this.f1133b;
                ImageHeaderParser.ImageType imageTypeB = com.bumptech.glide.load.e.b(bVar.f1134a, (InputStream) obj, bVar.f1135b);
                return imageTypeB == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeB == ImageHeaderParser.ImageType.ANIMATED_AVIF);
            default:
                return true;
        }
    }
}
