package com.facebook.imagepipeline.animated.factory;

import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.common.c;
import com.facebook.infer.annotation.Nullsafe;
import java.nio.ByteBuffer;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface AnimatedImageDecoder {
    AnimatedImage decodeFromByteBuffer(ByteBuffer byteBuffer, c options);

    AnimatedImage decodeFromNativeMemory(long nativePtr, int sizeInBytes, c options);
}
