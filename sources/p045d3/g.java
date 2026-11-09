package p045d3;

import Ra.a;
import U2.B;
import android.content.Context;
import android.net.Uri;
import androidx.appcompat.widget.m1;
import androidx.webkit.WebViewStartUpResult;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.d;
import com.facebook.soloader.nativeloader.NativeLoaderDelegate;
import com.luck.picture.lib.engine.CompressFileEngine;
import com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.FaceDeviceInfoBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.ShowLoadingBridge;
import com.transsnet.palmpay.credit.rnbridge.QuotaChangeBridge;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p121i2.f;
import ph.e;

/* JADX INFO: loaded from: classes.dex */
public final class g implements CacheKeyFactory, NativeLoaderDelegate, CompressFileEngine, WebViewStartUpResult, ObjectConstructor, IRouterProxy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f35507b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35508a;

    public /* synthetic */ g(int i7) {
        this.f35508a = i7;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f35508a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            case 8:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return new LinkedHashSet();
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getBitmapCacheKey(d dVar, Object obj) {
        a aVar = new a(dVar.getSourceUri().toString(), dVar.getResizeOptions(), dVar.getRotationOptions(), dVar.getImageDecodeOptions(), null, null);
        aVar.f35492g = obj;
        return aVar;
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getEncodedCacheKey(d dVar, Object obj) {
        return getEncodedCacheKey(dVar, dVar.getSourceUri(), obj);
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public String getLibraryPath(String str) {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getMaxTimePerTaskInUiThreadMillis() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getNonUiThreadBlockingStartUpLocations() {
        return null;
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getPostprocessedBitmapCacheKey(d dVar, Object obj) {
        CacheKey cacheKey;
        String name;
        Postprocessor postprocessor = dVar.getPostprocessor();
        if (postprocessor != null) {
            CacheKey postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            name = postprocessor.getClass().getName();
            cacheKey = postprocessorCacheKey;
        } else {
            cacheKey = null;
            name = null;
        }
        a aVar = new a(dVar.getSourceUri().toString(), dVar.getResizeOptions(), dVar.getRotationOptions(), dVar.getImageDecodeOptions(), cacheKey, name);
        aVar.f35492g = obj;
        return aVar;
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public int getSoSourcesVersion() {
        return 0;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getTotalTimeInUiThreadMillis() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getUiThreadBlockingStartUpLocations() {
        return null;
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public boolean loadLibrary(String str, int i7) {
        System.loadLibrary(str);
        return true;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f35508a) {
            case 6:
                return new PhotoUploadBridge();
            case 7:
                return new FaceDeviceInfoBridge();
            case 8:
                return new ShowLoadingBridge();
            default:
                return new QuotaChangeBridge();
        }
    }

    @Override // com.luck.picture.lib.engine.CompressFileEngine
    public void onStartCompress(Context context, ArrayList arrayList, OnKeyValueResultCallbackListener onKeyValueResultCallbackListener) {
        m1 m1VarC = e.c(context);
        m1VarC.d(arrayList);
        m1VarC.f12973c = new B8.d(8);
        m1VarC.f12976f = new B8.d(9);
        a aVar = new a();
        aVar.f7965a = onKeyValueResultCallbackListener;
        m1VarC.f12975e = aVar;
        m1VarC.b();
    }

    @Override // com.facebook.imagepipeline.cache.CacheKeyFactory
    public CacheKey getEncodedCacheKey(d dVar, Uri uri, Object obj) {
        return new f(uri.toString());
    }
}
