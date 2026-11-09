package p196n3;

import W2.e;
import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ImageTranscoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageTranscoderFactory f39824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f39825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39826c;

    public c(ImageTranscoderFactory imageTranscoderFactory, Integer num, boolean z3) {
        this.f39824a = imageTranscoderFactory;
        this.f39825b = num;
        this.f39826c = z3;
    }

    public final ImageTranscoder a(e eVar, boolean z3) {
        boolean z8 = this.f39826c;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(2048, Boolean.FALSE, Boolean.valueOf(z8));
            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return ((ImageTranscoderFactory) objNewInstance).createImageTranscoder(eVar, z3);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e11);
        } catch (IllegalArgumentException e12) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e13);
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e14);
        } catch (SecurityException e15) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e15);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e16);
        }
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    public final ImageTranscoder createImageTranscoder(e imageFormat, boolean z3) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        ImageTranscoder eVar = null;
        ImageTranscoderFactory imageTranscoderFactory = this.f39824a;
        ImageTranscoder imageTranscoderCreateImageTranscoder = imageTranscoderFactory != null ? imageTranscoderFactory.createImageTranscoder(imageFormat, z3) : null;
        if (imageTranscoderCreateImageTranscoder == null) {
            Integer num = this.f39825b;
            if (num != null) {
                if (num.intValue() == 0) {
                    eVar = a(imageFormat, z3);
                } else {
                    if (num.intValue() != 1) {
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                    }
                    eVar = new e(z3);
                    Intrinsics.checkNotNullExpressionValue(eVar, "createImageTranscoder(...)");
                }
            }
            imageTranscoderCreateImageTranscoder = eVar;
        }
        if (imageTranscoderCreateImageTranscoder == null) {
            imageTranscoderCreateImageTranscoder = a(imageFormat, z3);
        }
        if (imageTranscoderCreateImageTranscoder != null) {
            return imageTranscoderCreateImageTranscoder;
        }
        e eVar2 = new e(z3);
        Intrinsics.checkNotNullExpressionValue(eVar2, "createImageTranscoder(...)");
        return eVar2;
    }
}
