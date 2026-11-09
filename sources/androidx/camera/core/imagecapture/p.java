package androidx.camera.core.imagecapture;

import E.Q;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.T;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.processing.Operation;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Operation {
    @Override // androidx.camera.core.processing.Operation
    public final Object apply(Object obj) throws Q {
        androidx.camera.core.impl.utils.e eVar;
        f fVar = (f) obj;
        ImageProxy imageProxy = fVar.f13754b;
        t tVar = fVar.f13753a;
        if (androidx.camera.core.internal.utils.c.c(imageProxy.getFormat())) {
            try {
                Hg.c cVar = androidx.camera.core.impl.utils.e.f14151b;
                ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                buffer.rewind();
                byte[] bArr = new byte[buffer.capacity()];
                buffer.get(bArr);
                eVar = new androidx.camera.core.impl.utils.e(new p242q0.g(new ByteArrayInputStream(bArr)));
                imageProxy.getPlanes()[0].getBuffer().rewind();
            } catch (IOException e10) {
                throw new Q(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            eVar = null;
        }
        if (((ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.f14321a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            C0971c c0971c = T.f13963i;
        } else if (androidx.camera.core.internal.utils.c.c(imageProxy.getFormat())) {
            p118hf.a.j(eVar, "JPEG image must have exif.");
            Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
            int iB = tVar.f13800d - eVar.b();
            Size size2 = androidx.camera.core.impl.utils.o.c(androidx.camera.core.impl.utils.o.h(iB)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = androidx.camera.core.impl.utils.o.a(iB, false, new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()));
            RectF rectF = new RectF(tVar.f13799c);
            matrixA.mapRect(rectF);
            rectF.sort();
            Size size3 = size2;
            Rect rect = new Rect();
            rectF.round(rect);
            int iB2 = eVar.b();
            Matrix matrix = new Matrix(tVar.f13802f);
            matrix.postConcat(matrixA);
            CameraCaptureResult hVar = imageProxy.getImageInfo() instanceof androidx.camera.core.internal.c ? ((androidx.camera.core.internal.c) imageProxy.getImageInfo()).f14315a : new org.sufficientlysecure.htmltextview.h(3);
            imageProxy.getFormat();
            return new androidx.camera.core.processing.b(imageProxy, eVar, imageProxy.getFormat(), size3, rect, iB2, matrix, hVar);
        }
        androidx.camera.core.impl.utils.e eVar2 = eVar;
        Rect rect2 = tVar.f13799c;
        CameraCaptureResult hVar2 = imageProxy.getImageInfo() instanceof androidx.camera.core.internal.c ? ((androidx.camera.core.internal.c) imageProxy.getImageInfo()).f14315a : new org.sufficientlysecure.htmltextview.h(3);
        int i7 = tVar.f13800d;
        Matrix matrix2 = tVar.f13802f;
        Size size4 = new Size(imageProxy.getWidth(), imageProxy.getHeight());
        if (androidx.camera.core.internal.utils.c.c(imageProxy.getFormat())) {
            p118hf.a.j(eVar2, "JPEG image must have Exif.");
        }
        return new androidx.camera.core.processing.b(imageProxy, eVar2, imageProxy.getFormat(), size4, rect2, i7, matrix2, hVar2);
    }
}
