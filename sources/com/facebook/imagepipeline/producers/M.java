package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.JfifUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class M extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.facebook.imagepipeline.request.d f21494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f21495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, Consumer consumer, ProducerListener2 producerListener2, ProducerContext producerContext, com.facebook.imagepipeline.request.d dVar) {
        super(consumer, producerListener2, producerContext, "LocalExifThumbnailProducer");
        this.f21495g = n10;
        this.f21494f = dVar;
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final void b(Object obj) {
        p109h3.e.b((p109h3.e) obj);
    }

    @Override // com.facebook.imagepipeline.producers.j0
    public final Map c(Object obj) {
        return p213o2.d.a("createdThumbnail", Boolean.toString(((p109h3.e) obj) != null));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    @Override // com.facebook.imagepipeline.producers.j0
    public final Object d() {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        ExifInterface exifInterface;
        Uri sourceUri = this.f21494f.getSourceUri();
        N n10 = this.f21495g;
        ContentResolver contentResolver = n10.f21498c;
        String strA = p333w2.a.a(contentResolver, sourceUri);
        if (strA == null) {
            exifInterface = null;
        } else {
            try {
                File file = new File(strA);
                if (file.exists() && file.canRead()) {
                    exifInterface = new ExifInterface(strA);
                } else {
                    if (FirebaseAnalytics.Param.CONTENT.equals(p333w2.a.b(sourceUri))) {
                        try {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(sourceUri, "r");
                        } catch (FileNotFoundException unused) {
                            assetFileDescriptorOpenAssetFileDescriptor = null;
                        }
                    } else {
                        assetFileDescriptorOpenAssetFileDescriptor = null;
                    }
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        ExifInterface exifInterface2 = new ExifInterface(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                        exifInterface = exifInterface2;
                    } else {
                        exifInterface = null;
                    }
                }
            } catch (IOException unused2) {
            } catch (StackOverflowError unused3) {
                p229p2.a.e(N.class, "StackOverflowError in ExifInterface constructor");
            }
        }
        if (exifInterface == null || !exifInterface.hasThumbnail()) {
            return null;
        }
        byte[] thumbnail = exifInterface.getThumbnail();
        thumbnail.getClass();
        PooledByteBuffer pooledByteBufferNewByteBuffer = n10.f21497b.newByteBuffer(thumbnail);
        Pair<Integer, Integer> pairDecodeDimensions = BitmapUtil.decodeDimensions(new p262r2.e(pooledByteBufferNewByteBuffer));
        String attribute = exifInterface.getAttribute("Orientation");
        attribute.getClass();
        int autoRotateAngleFromOrientation = JfifUtil.getAutoRotateAngleFromOrientation(Integer.parseInt(attribute));
        int iIntValue = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.first).intValue() : -1;
        int iIntValue2 = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.second).intValue() : -1;
        com.facebook.common.references.b bVarI = CloseableReference.i(pooledByteBufferNewByteBuffer);
        try {
            p109h3.e eVar = new p109h3.e(bVarI);
            bVarI.close();
            eVar.f37275b = W2.c.f10530a;
            eVar.f37276c = autoRotateAngleFromOrientation;
            eVar.f37278e = iIntValue;
            eVar.f37279f = iIntValue2;
            return eVar;
        } catch (Throwable th) {
            CloseableReference.d(bVarI);
            throw th;
        }
    }
}
