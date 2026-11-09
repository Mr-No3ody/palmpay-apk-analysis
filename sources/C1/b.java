package C1;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.h;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f1135b;

    public b(ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f1134a = arrayList;
        this.f1135b = fVar;
    }

    public static B1.b a(ImageDecoder.Source source, int i7, int i10, h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new A1.d(i7, i10, hVar));
        if (A1.a.v(drawableDecodeDrawable)) {
            return new B1.b(A1.a.d(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
