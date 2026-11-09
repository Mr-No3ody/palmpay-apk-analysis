package com.facebook.imagepipeline.nativecode;

import W2.c;
import W2.e;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(p245q3.a.f41451a)
public class NativeJpegTranscoderFactory implements ImageTranscoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21451c;

    @DoNotStrip
    public NativeJpegTranscoderFactory(int i7, boolean z3, boolean z8) {
        this.f21449a = i7;
        this.f21450b = z3;
        this.f21451c = z8;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    @DoNotStrip
    @Nullable
    public ImageTranscoder createImageTranscoder(e eVar, boolean z3) {
        if (eVar != c.f10530a) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.f21446a = z3;
        nativeJpegTranscoder.f21447b = this.f21449a;
        nativeJpegTranscoder.f21448c = this.f21450b;
        if (this.f21451c) {
            b.m();
        }
        return nativeJpegTranscoder;
    }
}
