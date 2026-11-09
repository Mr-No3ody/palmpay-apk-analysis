package com.facebook.imagepipeline.nativecode;

import E.AbstractC0198c;
import android.graphics.ColorSpace;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.i;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p213o2.c;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(p245q3.a.f41451a)
public class NativeJpegTranscoder implements ImageTranscoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21448c;

    public static void a(InputStream inputStream, OutputStream outputStream, int i7, int i10, int i11) throws IOException {
        b.m();
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 <= 100)) {
            throw new IllegalArgumentException();
        }
        c cVar = p196n3.b.f39823a;
        if (!(i7 >= 0 && i7 <= 270 && i7 % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        e.b((i10 == 8 && i7 == 0) ? false : true, "no transformation requested");
        outputStream.getClass();
        nativeTranscodeJpeg(inputStream, outputStream, i7, i10, i11);
    }

    public static void b(InputStream inputStream, OutputStream outputStream, int i7, int i10, int i11) throws IOException {
        boolean z3;
        b.m();
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 <= 100)) {
            throw new IllegalArgumentException();
        }
        c cVar = p196n3.b.f39823a;
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (!z3) {
            throw new IllegalArgumentException();
        }
        e.b((i10 == 8 && i7 == 1) ? false : true, "no transformation requested");
        outputStream.getClass();
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i7, i10, i11);
    }

    @DoNotStrip
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i7, int i10, int i11) throws IOException;

    @DoNotStrip
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i7, int i10, int i11) throws IOException;

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final boolean canResize(p109h3.e eVar, i iVar, g gVar) {
        if (iVar == null) {
            iVar = i.f21434c.autoRotate();
        }
        return p196n3.b.c(iVar, gVar, eVar, this.f21446a) < 8;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final boolean canTranscode(W2.e eVar) {
        return eVar == W2.c.f10530a;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public final p196n3.a transcode(p109h3.e eVar, OutputStream outputStream, i iVar, g gVar, W2.e eVar2, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (iVar == null) {
            iVar = i.f21434c.autoRotate();
        }
        int iL = AbstractC0198c.l(iVar, gVar, eVar, this.f21447b);
        try {
            int iC = p196n3.b.c(iVar, gVar, eVar, this.f21446a);
            int iMax = Math.max(1, 8 / iL);
            if (this.f21448c) {
                iC = iMax;
            }
            InputStream inputStreamE = eVar.e();
            c cVar = p196n3.b.f39823a;
            eVar.k();
            if (cVar.contains(Integer.valueOf(eVar.f37277d))) {
                int iA = p196n3.b.a(iVar, eVar);
                e.e(inputStreamE, "Cannot transcode from null input stream!");
                b(inputStreamE, outputStream, iA, iC, num.intValue());
            } else {
                int iB = p196n3.b.b(iVar, eVar);
                e.e(inputStreamE, "Cannot transcode from null input stream!");
                a(inputStreamE, outputStream, iB, iC, num.intValue());
            }
            p213o2.a.b(inputStreamE);
            return new p196n3.a(iL != 1 ? 0 : 1);
        } catch (Throwable th) {
            p213o2.a.b(null);
            throw th;
        }
    }
}
