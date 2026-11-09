package org.sufficientlysecure.htmltextview;

import E.d0;
import U2.B;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.processing.Operation;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import com.bumptech.glide.Glide$RequestOptionsFactory;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.core.ImagePipelineExperiments$ProducerFactoryMethod;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableXml;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.storage.StorageGetBridge;
import com.transsnet.palmpay.contacts.bean.req.MobileContactReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.rnbridge.bridge.MfbNetworkingBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.WithdrawalCashierBridge;
import com.transsnet.palmpay.util.CloseUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p061e3.u;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ProfileInstaller$DiagnosticsCallback, ObservableOnSubscribe, Operation, Glide$RequestOptionsFactory, ObjectConstructor, IRouterProxy, ImagePipelineExperiments$ProducerFactoryMethod, DrawableFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41127a;

    public /* synthetic */ f(int i7) {
        this.f41127a = i7;
    }

    @Override // androidx.camera.core.processing.Operation
    public Object apply(Object obj) {
        androidx.camera.core.processing.b bVar = (androidx.camera.core.processing.b) obj;
        d0 d0Var = new d0(io.fastkv.n.e(bVar.f14374d.getWidth(), bVar.f14374d.getHeight(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 2));
        ImageProxy imageProxyB = ImageProcessingUtil.b(d0Var, (byte[]) bVar.f14371a);
        d0Var.a();
        Objects.requireNonNull(imageProxyB);
        androidx.camera.core.impl.utils.e eVar = bVar.f14372b;
        Objects.requireNonNull(eVar);
        Matrix matrix = bVar.f14377g;
        androidx.camera.core.d dVar = (androidx.camera.core.d) imageProxyB;
        Size size = new Size(dVar.getWidth(), dVar.getHeight());
        dVar.getFormat();
        return new androidx.camera.core.processing.b(imageProxyB, eVar, dVar.getFormat(), size, bVar.f14375e, bVar.f14376f, matrix, bVar.f14378h);
    }

    @Override // com.bumptech.glide.Glide$RequestOptionsFactory
    public G1.d build() {
        return new G1.d();
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41127a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return new LinkedHashMap();
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public Drawable createDrawable(CloseableImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        CloseableXml closeableXml = image instanceof CloseableXml ? (CloseableXml) image : null;
        if (closeableXml != null) {
            return closeableXml.buildDrawable();
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineExperiments$ProducerFactoryMethod
    public u createProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, p061e3.i downsampleMode, boolean z3, boolean z8, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, p262r2.g pooledByteStreams, MemoryCache bitmapMemoryCache, MemoryCache encodedMemoryCache, Supplier diskCachesStoreSupplier, CacheKeyFactory cacheKeyFactory, p032c3.b platformBitmapFactory, int i7, int i10, boolean z10, int i11, p061e3.b closeableReferenceFactory, boolean z11, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        return new u(context, byteArrayPool, imageDecoder, progressiveJpegConfig, downsampleMode, z3, z8, executorSupplier, pooledByteBufferFactory, bitmapMemoryCache, encodedMemoryCache, diskCachesStoreSupplier, cacheKeyFactory, platformBitmapFactory, i7, i10, z10, i11, closeableReferenceFactory, z11, i12);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41127a) {
            case 6:
                return new StorageGetBridge();
            case 7:
                return new MfbNetworkingBridge();
            default:
                return new WithdrawalCashierBridge();
        }
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = BaseApplication.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "display_name"}, null, null, null);
                if (cursorQuery != null) {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("data1");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("display_name");
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        String string2 = cursorQuery.getString(columnIndexOrThrow2);
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(new MobileContactReq(string2, Z4.e.k(string)));
                        }
                    }
                }
                CloseUtils.closeIO(cursorQuery);
            } catch (Exception e10) {
                F6.d.c("d", "subscribe2: ", e10);
                CloseUtils.closeIO(cursorQuery);
            }
            if (!arrayList.isEmpty()) {
                observableEmitter.onNext(arrayList);
            }
            observableEmitter.onComplete();
        } catch (Throwable th) {
            CloseUtils.closeIO(cursorQuery);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public boolean supportsImageType(CloseableImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof CloseableXml;
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onDiagnosticReceived(int i7, Object obj) {
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onResultReceived(int i7, Object obj) {
    }
}
