package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.common.memory.PooledByteBufferFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I extends P {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f21486d = new H(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f21487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, AssetManager assetManager) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f21487c = assetManager;
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final p109h3.e b(com.facebook.imagepipeline.request.d imageRequest) throws IOException {
        int length;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        H h7 = f21486d;
        String assetName = h7.getAssetName(imageRequest);
        AssetManager assetManager = this.f21487c;
        InputStream inputStreamOpen = assetManager.open(assetName, 2);
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = assetManager.openFd(h7.getAssetName(imageRequest));
            length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return a(length, inputStreamOpen);
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final String c() {
        return "LocalAssetFetchProducer";
    }
}
