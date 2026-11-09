package Y2;

import Pa.C0525w;
import android.graphics.Bitmap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.factory.AnimatedImageDecoder;
import com.facebook.imagepipeline.animated.factory.AnimatedImageFactory;
import com.facebook.imagepipeline.common.c;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.ArrayList;
import p032c3.b;
import p109h3.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AnimatedImageFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AnimatedImageDecoder f11284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnimatedImageDecoder f11285b;

    static {
        AnimatedImageDecoder animatedImageDecoder;
        AnimatedImageDecoder animatedImageDecoder2 = null;
        try {
            animatedImageDecoder = (AnimatedImageDecoder) Class.forName("com.facebook.animated.gif.GifImage").newInstance();
        } catch (Throwable unused) {
            animatedImageDecoder = null;
        }
        f11284a = animatedImageDecoder;
        try {
            animatedImageDecoder2 = (AnimatedImageDecoder) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
        }
        f11285b = animatedImageDecoder2;
    }

    public a(C0525w c0525w, b bVar) {
    }

    public static CloseableImage a(c cVar, AnimatedImage animatedImage) {
        cVar.getClass();
        top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(animatedImage);
        aVar.f42646c = null;
        aVar.f42647d = null;
        try {
            X2.b bVar = new X2.b(aVar);
            CloseableReference.d((CloseableReference) aVar.f42646c);
            aVar.f42646c = null;
            CloseableReference.e((ArrayList) aVar.f42647d);
            aVar.f42647d = null;
            p109h3.b bVar2 = new p109h3.b();
            bVar2.f37264a = bVar;
            bVar2.f37265b = true;
            return bVar2;
        } catch (Throwable th) {
            CloseableReference.d((CloseableReference) aVar.f42646c);
            aVar.f42646c = null;
            CloseableReference.e((ArrayList) aVar.f42647d);
            aVar.f42647d = null;
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.animated.factory.AnimatedImageFactory
    public final CloseableImage decodeGif(e eVar, c cVar, Bitmap.Config config) {
        AnimatedImageDecoder animatedImageDecoder = f11284a;
        if (animatedImageDecoder == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        CloseableReference closeableReferenceC = CloseableReference.c(eVar.f37274a);
        closeableReferenceC.getClass();
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReferenceC.f();
            return a(cVar, pooledByteBuffer.getByteBuffer() != null ? animatedImageDecoder.decodeFromByteBuffer(pooledByteBuffer.getByteBuffer(), cVar) : animatedImageDecoder.decodeFromNativeMemory(pooledByteBuffer.getNativePtr(), pooledByteBuffer.size(), cVar));
        } finally {
            closeableReferenceC.close();
        }
    }

    @Override // com.facebook.imagepipeline.animated.factory.AnimatedImageFactory
    public final CloseableImage decodeWebP(e eVar, c cVar, Bitmap.Config config) {
        AnimatedImageDecoder animatedImageDecoder = f11285b;
        if (animatedImageDecoder == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        CloseableReference closeableReferenceC = CloseableReference.c(eVar.f37274a);
        closeableReferenceC.getClass();
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReferenceC.f();
            return a(cVar, pooledByteBuffer.getByteBuffer() != null ? animatedImageDecoder.decodeFromByteBuffer(pooledByteBuffer.getByteBuffer(), cVar) : animatedImageDecoder.decodeFromNativeMemory(pooledByteBuffer.getNativePtr(), pooledByteBuffer.size(), cVar));
        } finally {
            closeableReferenceC.close();
        }
    }
}
