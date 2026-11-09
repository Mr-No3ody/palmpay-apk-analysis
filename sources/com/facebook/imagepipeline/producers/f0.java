package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.common.memory.PooledByteBufferFactory;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f21563c;

    static {
        new e0(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f21563c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final p109h3.e b(com.facebook.imagepipeline.request.d imageRequest) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.f21563c.openInputStream(imageRequest.getSourceUri());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        p109h3.e eVarA = a(-1, inputStreamOpenInputStream);
        Intrinsics.checkNotNullExpressionValue(eVarA, "getEncodedImage(...)");
        return eVarA;
    }

    @Override // com.facebook.imagepipeline.producers.P
    public final String c() {
        return "QualifiedResourceFetchProducer";
    }
}
