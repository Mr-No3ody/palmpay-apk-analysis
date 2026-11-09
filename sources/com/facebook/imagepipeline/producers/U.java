package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.common.memory.PooledByteBufferFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class U extends P {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T f21506d = new T(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f21507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f21507c = resources;
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final p109h3.e b(com.facebook.imagepipeline.request.d imageRequest) {
        int length;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        T t = f21506d;
        int resourceId = t.getResourceId(imageRequest);
        Resources resources = this.f21507c;
        InputStream inputStreamOpenRawResource = resources.openRawResource(resourceId);
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(t.getResourceId(imageRequest));
            length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
            } catch (IOException unused) {
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return a(length, inputStreamOpenRawResource);
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final String c() {
        return "LocalResourceFetchProducer";
    }
}
