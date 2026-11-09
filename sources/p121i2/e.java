package p121i2;

import C0.G;
import E.I;
import E.Q;
import E.d0;
import F6.d;
import U2.B;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.c;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.b;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.systrace.FrescoSystrace$ArgsBuilder;
import com.facebook.imagepipeline.systrace.FrescoSystrace$Systrace;
import com.facebook.soloader.AsyncInitSoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.x;
import com.facebook.soloader.z;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import com.flexibank.sdk.k;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.picker.DateRangePickerBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.rnbridge.bridge.LogEventBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.StorageSetBridge;
import io.fastkv.n;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1623u;
import p181m3.a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements CacheEventListener, RecoveryStrategy, ObservableOnSubscribe, Operation, ResourceReleaser, ObjectConstructor, IRouterProxy, FlexiBankAuthorizationCallback, FrescoSystrace$Systrace {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f37415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f37416c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37417a;

    public /* synthetic */ e(int i7) {
        this.f37417a = i7;
    }

    public static e a() {
        if (f37416c == null) {
            f37416c = new e(4);
        }
        return f37416c;
    }

    @Override // androidx.camera.core.processing.Operation
    public Object apply(Object obj) throws Throwable {
        d0 d0Var;
        Bitmap bitmapCreateBitmap;
        b bVar = (b) obj;
        d0 d0Var2 = null;
        try {
            try {
                int i7 = bVar.f14373c;
                Object obj2 = bVar.f14371a;
                int i10 = bVar.f14376f;
                if (i7 == 35) {
                    ImageProxy imageProxy = (ImageProxy) obj2;
                    boolean z3 = i10 % 180 != 0;
                    d0Var = new d0(n.e(z3 ? imageProxy.getHeight() : imageProxy.getWidth(), z3 ? imageProxy.getWidth() : imageProxy.getHeight(), 1, 2));
                    try {
                        I iD = ImageProcessingUtil.d(imageProxy, d0Var, ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4), i10, false);
                        imageProxy.close();
                        if (iD == null) {
                            throw new Q(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = c.a(iD);
                        iD.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new Q(0, "Can't convert " + (bVar.f14373c == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        d0Var2 = d0Var;
                        if (d0Var2 != null) {
                            d0Var2.close();
                        }
                        throw th;
                    }
                } else {
                    if (i7 != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + bVar.f14373c);
                    }
                    ImageProxy imageProxy2 = (ImageProxy) obj2;
                    Bitmap bitmapA = c.a(imageProxy2);
                    imageProxy2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i10);
                    d0Var = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                }
                if (d0Var != null) {
                    d0Var.close();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (UnsupportedOperationException e11) {
            e = e11;
        }
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$Systrace
    public void beginSection(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$Systrace
    public FrescoSystrace$ArgsBuilder beginSectionWithArgs(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a.f39473a;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f37417a) {
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
        return new ConcurrentSkipListMap();
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$Systrace
    public boolean isTracing() {
        return false;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f37417a) {
            case 6:
                return new DateRangePickerBridge();
            case 7:
                return new LogEventBridge();
            default:
                return new StorageSetBridge();
        }
    }

    @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
    public void onError(String str, String str2) {
        d.c("LoginPresenter", G.o("FlexiBank authorization failed, errorCode=", str));
        try {
            k.n();
        } catch (Exception e10) {
            d.c("LoginPresenter", "Clear FlexiBank session failed", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        for (z zVar : xVarArr) {
            if (zVar instanceof AsyncInitSoSource) {
                Log.e("SoLoader", "Waiting on SoSource ".concat(zVar.b()));
                ((AsyncInitSoSource) zVar).waitUntilInitCompleted();
            }
        }
        return true;
    }

    @Override // com.facebook.common.references.ResourceReleaser
    public void release(Object obj) {
        ((Bitmap) obj).recycle();
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
                        cursorQuery.getString(columnIndexOrThrow2);
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e10) {
                d.c("queryPhoneContact", e10);
                if (cursorQuery != null) {
                }
            }
            if (!arrayList.isEmpty()) {
                observableEmitter.onNext(arrayList);
            }
            observableEmitter.onComplete();
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    public e(C1623u c1623u) {
        this.f37417a = 9;
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$Systrace
    public void endSection() {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onCleared() {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onEviction(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onHit(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onMiss(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onReadException(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onWriteAttempt(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onWriteException(CacheEvent cacheEvent) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void onWriteSuccess(CacheEvent cacheEvent) {
    }

    @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
    public void onSuccess(String str, String str2, String str3, boolean z3, boolean z8) {
    }
}
