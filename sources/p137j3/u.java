package p137j3;

import C0.G;
import E.Q;
import F6.d;
import Pa.r0;
import U2.B;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Size;
import androidx.camera.core.impl.utils.e;
import androidx.camera.core.impl.utils.o;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.b;
import com.abedelazizshe.lightcompressorlibrary.config.StorageConfiguration;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.imagepipeline.memory.PoolStatsTracker;
import com.facebook.imagepipeline.systrace.FrescoSystrace$ArgsBuilder;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import com.flexibank.sdk.k;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.statusbar.StatusBarHeightBridge;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import com.transsnet.palmpay.core.rnbridge.bridge.LottieFileBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.SystemContactBridge;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import p051d9.M;

/* JADX INFO: loaded from: classes.dex */
public final class u implements PoolStatsTracker, Function, Operation, StorageConfiguration, ObjectConstructor, IRouterProxy, FlexiBankAuthorizationCallback, FrescoSystrace$ArgsBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u f38255b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38256a;

    public /* synthetic */ u(int i7) {
        this.f38256a = i7;
    }

    public static synchronized u a() {
        try {
            if (f38255b == null) {
                f38255b = new u(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38255b;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) throws Q {
        List<PalmPayContact> data;
        switch (this.f38256a) {
            case 2:
                MobileContactListResp mobileContactListResp = (MobileContactListResp) obj;
                if (mobileContactListResp.isSuccess() && (data = mobileContactListResp.getData()) != null) {
                    int i7 = 0;
                    for (PalmPayContact palmPayContact : data) {
                        if (TextUtils.isEmpty(palmPayContact.getContactsMemberId())) {
                            i7++;
                            palmPayContact.setPalmPayMember(false);
                            palmPayContact.setContactsMemberId(String.valueOf(i7));
                        } else {
                            palmPayContact.setPalmPayMember(true);
                        }
                        palmPayContact.setPhone(r0.w0(palmPayContact.getPhone()));
                    }
                    Collections.sort(mobileContactListResp.getData(), new Gb.Q(6));
                    mobileContactListResp.setData(data);
                }
                return mobileContactListResp;
            default:
                b bVar = (b) obj;
                Rect rect = bVar.f14375e;
                byte[] bArr = (byte[]) bVar.f14371a;
                try {
                    Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
                    e eVar = bVar.f14372b;
                    Objects.requireNonNull(eVar);
                    Rect rect2 = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                    Matrix matrix = bVar.f14377g;
                    RectF rectF = o.f14263a;
                    Matrix matrix2 = new Matrix(matrix);
                    matrix2.postTranslate(-rect.left, -rect.top);
                    return new b(bitmapDecodeRegion, eVar, 42, new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight()), rect2, bVar.f14376f, matrix2, bVar.f14378h);
                } catch (IOException e10) {
                    throw new Q(1, "Failed to decode JPEG.", e10);
                }
        }
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$ArgsBuilder
    public FrescoSystrace$ArgsBuilder arg(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f38256a) {
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
        return new ConcurrentHashMap();
    }

    @Override // com.abedelazizshe.lightcompressorlibrary.config.StorageConfiguration
    public File createFileToSave(Context context, File videoFile, String fileName, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!new File(context.getExternalCacheDir() + '/' + fileName).exists()) {
            File parentFile = new File(context.getExternalCacheDir() + '/' + fileName).getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        }
        return new File(context.getExternalCacheDir(), fileName);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f38256a) {
            case 6:
                return new StatusBarHeightBridge();
            case 7:
                return new LottieFileBridge();
            default:
                return new SystemContactBridge();
        }
    }

    @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
    public void onError(String str, String str2) {
        d.c("SetNewPinPresenter", G.o("FlexiBank authorization failed, errorCode=", str));
        try {
            k.n();
        } catch (Exception e10) {
            d.c("SetNewPinPresenter", "Clear FlexiBank session failed", e10);
        }
    }

    public u(M m7) {
        this.f38256a = 9;
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$ArgsBuilder
    public FrescoSystrace$ArgsBuilder arg(String key, int i7) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$ArgsBuilder
    public FrescoSystrace$ArgsBuilder arg(String key, long j6) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$ArgsBuilder
    public FrescoSystrace$ArgsBuilder arg(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this;
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace$ArgsBuilder
    public void flush() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onHardCapReached() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onSoftCapReached() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onAlloc(int i7) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onFree(int i7) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onValueRelease(int i7) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onValueReuse(int i7) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void setBasePool(c cVar) {
    }

    @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
    public void onSuccess(String str, String str2, String str3, boolean z3, boolean z8) {
    }
}
