package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.concurrent.ThreadSafe;
import p137j3.o;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@ThreadSafe
@TargetApi(19)
@Nullsafe(a.f41451a)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    @DoNotStrip
    public KitKatPurgeableDecoder(o oVar) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap a(CloseableReference closeableReference, BitmapFactory.Options options) {
        ((PooledByteBuffer) closeableReference.f()).size();
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap b(CloseableReference closeableReference, int i7, BitmapFactory.Options options) {
        DalvikPurgeableDecoder.c(closeableReference, i7);
        if (i7 <= ((PooledByteBuffer) closeableReference.f()).size()) {
            throw null;
        }
        throw new IllegalArgumentException();
    }
}
