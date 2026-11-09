package top.zibin.luban.io;

import C0.G;
import E.C0202g;
import E.K;
import E.k0;
import G.h;
import N8.q0;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.U;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.biometric.y;
import androidx.camera.core.impl.C0975e;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.i;
import androidx.camera.core.impl.utils.futures.j;
import androidx.camera.core.impl.utils.n;
import androidx.camera.core.impl.utils.o;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.l;
import androidx.camera.core.processing.m;
import androidx.camera.video.internal.encoder.A;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.u;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.core.util.Pools$Pool;
import androidx.core.view.C1064p;
import androidx.core.view.P;
import androidx.core.view.Q;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C1331c;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.pool.FactoryPools$Factory;
import com.bumptech.glide.util.pool.FactoryPools$Poolable;
import com.bumptech.glide.util.pool.FactoryPools$Resetter;
import com.facebook.drawee.drawable.g;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.common.util.concurrent.ListenableFuture;
import com.mikepenz.iconics.view.IconicsTextView;
import com.swmansion.rnscreens.CustomSearchView;
import com.swmansion.rnscreens.gamma.tabs.TabScreen;
import com.swmansion.rnscreens.gamma.tabs.TabScreenFragment;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;
import com.transsnet.palmpay.custom_view.s;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p232p6.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements DrawableFactory, FutureCallback, ResourceTranscoder, Pools$Pool, p163l.b, CallbackToFutureAdapter$Resolver, Node, EncoderProfilesProvider {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f42641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f42642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f42643g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f42646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f42647d;

    public /* synthetic */ a(int i7, Object obj, Object obj2, Object obj3, boolean z3) {
        this.f42644a = i7;
        this.f42647d = obj;
        this.f42645b = obj2;
        this.f42646c = obj3;
    }

    public static void B(byte[] bArr, long j6) {
        bArr[7] = (byte) (j6 >>> 56);
        bArr[6] = (byte) (j6 >>> 48);
        bArr[5] = (byte) (j6 >>> 40);
        bArr[4] = (byte) (j6 >>> 32);
        bArr[3] = (byte) (j6 >>> 24);
        bArr[2] = (byte) (j6 >>> 16);
        bArr[1] = (byte) (j6 >>> 8);
        bArr[0] = (byte) (j6 & 255);
    }

    public static a d(I.b bVar) {
        a aVar = new a(9, false);
        aVar.f42645b = bVar.f3954a;
        aVar.f42646c = bVar.f3955b;
        aVar.f42647d = bVar.f3956c;
        return aVar;
    }

    public static a f() {
        if (f42641e == null) {
            synchronized (a.class) {
                try {
                    if (f42641e == null) {
                        f42641e = new a(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42641e;
    }

    public static a g(AbstractActivityC0837o abstractActivityC0837o) {
        if (f42642f == null) {
            a aVar = new a(23, false);
            aVar.f42645b = abstractActivityC0837o.getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            aVar.f42647d = new SimpleDateFormat("yyyy-MM-dd_HH-mm_ss", Locale.getDefault());
            f42642f = aVar;
        }
        return f42642f;
    }

    public static boolean l() {
        p pVar = p.f41234a;
        Context context = p.f();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("liveness_cache", "cacheName");
        SharedPreferences sharedPreferences = context.getSharedPreferences("liveness_cache", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        Intrinsics.checkNotNullParameter("key_voice_enable", "key");
        return sharedPreferences.getBoolean("key_voice_enable", false);
    }

    public static void y(int i7, byte[] bArr) {
        bArr[3] = (byte) (i7 >>> 24);
        bArr[2] = (byte) (i7 >>> 16);
        bArr[1] = (byte) (i7 >>> 8);
        bArr[0] = (byte) (i7 & 255);
    }

    public void A(ByteArrayOutputStream byteArrayOutputStream, long j6) {
        byte[] bArr = (byte[]) this.f42647d;
        B(bArr, j6);
        byteArrayOutputStream.write(bArr);
    }

    public void C(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        byte[] bArr = (byte[]) this.f42645b;
        bArr[1] = (byte) (i7 >>> 8);
        bArr[0] = (byte) (i7 & 255);
        byteArrayOutputStream.write(bArr);
    }

    public String a(String str) {
        StringBuilder sbS = u.s(str);
        sbS.append(((Context) this.f42645b).getApplicationInfo().packageName);
        String string = sbS.toString();
        StringBuilder sb2 = new StringBuilder();
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(string.getBytes());
            for (int i7 = 0; i7 < bArrDigest.length; i7++) {
                int i10 = bArrDigest[i7];
                if (i10 < 0) {
                    i10 += IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                if (i10 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i10));
            }
        } catch (NoSuchAlgorithmException e10) {
            G8.a.c(e10);
        }
        return sb2.toString();
    }

    @Override // androidx.core.util.Pools$Pool
    public Object acquire() {
        Object objAcquire = ((p058e0.b) this.f42647d).acquire();
        if (objAcquire == null) {
            objAcquire = ((FactoryPools$Factory) this.f42645b).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                objAcquire.getClass().toString();
            }
        }
        if (objAcquire instanceof FactoryPools$Poolable) {
            ((K1.b) ((FactoryPools$Poolable) objAcquire).getVerifier()).f4899a = false;
        }
        return objAcquire;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(k kVar) {
        kVar.a(new B5.c(this, 25), org.chromium.support_lib_boundary.util.b.u());
        ((androidx.camera.core.impl.utils.executor.c) this.f42647d).f14161a.set(kVar);
        return "HandlerScheduledFuture-" + ((Callable) this.f42646c).toString();
    }

    public void b(double d2, float f10) {
        int length = ((float[]) this.f42645b).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.f42646c, d2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f42646c = Arrays.copyOf((double[]) this.f42646c, length);
        this.f42645b = Arrays.copyOf((float[]) this.f42645b, length);
        this.f42647d = new double[length];
        double[] dArr = (double[]) this.f42646c;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.f42646c)[iBinarySearch] = d2;
        ((float[]) this.f42645b)[iBinarySearch] = f10;
    }

    public void c(m mVar, Map.Entry entry) {
        m mVar2 = (m) entry.getValue();
        C0202g c0202g = null;
        C0202g c0202g2 = new C0202g(mVar.f14432g.f14108a, ((H.c) entry.getKey()).f3505d, mVar.f14428c ? (CameraInternal) this.f42646c : null, ((H.c) entry.getKey()).f3507f, ((H.c) entry.getKey()).f3508g);
        int i7 = ((H.c) entry.getKey()).f3504c;
        mVar2.getClass();
        p140j8.f.b();
        mVar2.b();
        p118hf.a.k(!mVar2.f14435j, "Consumer can only be linked once.");
        mVar2.f14435j = true;
        l lVar = mVar2.f14437l;
        androidx.camera.core.impl.utils.futures.a aVarI = j.i(lVar.c(), new androidx.camera.core.processing.k(mVar2, lVar, i7, c0202g2, c0202g), org.chromium.support_lib_boundary.util.b.S());
        aVarI.addListener(new i(0, aVarI, new p1.d(this, 23, mVar2, false)), org.chromium.support_lib_boundary.util.b.S());
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public Drawable createDrawable(CloseableImage closeableImage) {
        try {
            p181m3.a.a();
            if (closeableImage instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
                BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) this.f42645b, closeableStaticBitmap.getUnderlyingBitmap());
                if ((closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) && (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0)) {
                    return bitmapDrawable;
                }
                return new g(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            }
            DrawableFactory drawableFactory = (DrawableFactory) this.f42646c;
            if (drawableFactory != null && drawableFactory.supportsImageType(closeableImage)) {
                return drawableFactory.createDrawable(closeableImage);
            }
            org.sufficientlysecure.htmltextview.f fVar = (org.sufficientlysecure.htmltextview.f) this.f42647d;
            if (fVar == null || !fVar.supportsImageType(closeableImage)) {
                return null;
            }
            return fVar.createDrawable(closeableImage);
        } finally {
            p181m3.a.a();
        }
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) this.f42647d).entrySet()) {
            sb2.append((String) entry.getKey());
            sb2.append(": ");
            sb2.append((String) entry.getValue());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return sb2.toString();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i7) {
        return i(i7);
    }

    public double h(double d2) {
        double d10;
        if (d2 < 0.0d) {
            d10 = 0.0d;
        } else {
            d10 = d2 > 1.0d ? 1.0d : d2;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) this.f42646c, d10);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i7 = -iBinarySearch;
        int i10 = i7 - 1;
        float[] fArr = (float[]) this.f42645b;
        float f10 = fArr[i10];
        int i11 = i7 - 2;
        float f11 = fArr[i11];
        double[] dArr = (double[]) this.f42646c;
        double d11 = dArr[i10];
        double d12 = dArr[i11];
        double d13 = ((double) (f10 - f11)) / (d11 - d12);
        return ((((d10 * d10) - (d12 * d12)) * d13) / 2.0d) + q0.a(d10, d12, ((double) f11) - (d13 * d12), ((double[]) this.f42647d)[i11]);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i7) {
        return ((androidx.camera.video.internal.c) this.f42645b).hasProfile(i7) && i(i7) != null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.camera.core.impl.EncoderProfilesProxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public EncoderProfilesProxy i(int i7) {
        C0977f next;
        int i10;
        String videoCodecMimeType;
        int i11;
        int i12;
        C0977f c0977f;
        C0977f c0977f2;
        ?? A5;
        HashMap map = (HashMap) this.f42647d;
        if (map.containsKey(Integer.valueOf(i7))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i7));
        }
        androidx.camera.video.internal.c cVar = (androidx.camera.video.internal.c) this.f42645b;
        if (!cVar.hasProfile(i7)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyL = cVar.l(i7);
        if (encoderProfilesProxyL == null) {
            A5 = 0;
        } else {
            ArrayList arrayList = new ArrayList(encoderProfilesProxyL.getVideoProfiles());
            Iterator<C0977f> it = encoderProfilesProxyL.getVideoProfiles().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f14057j != 0);
            if (next == null) {
                c0977f2 = null;
                c0977f = null;
            } else {
                if (1 != next.f14057j) {
                    i10 = 5;
                    videoCodecMimeType = EncoderProfilesProxy.getVideoCodecMimeType(5);
                    i11 = 2;
                } else {
                    i10 = next.f14048a;
                    videoCodecMimeType = next.f14049b;
                    i11 = next.f14054g;
                }
                int i13 = i11;
                String str = videoCodecMimeType;
                int i14 = i10;
                int i15 = next.f14050c;
                int i16 = next.f14055h;
                if (10 == i16) {
                    i12 = 10;
                    c0977f = null;
                } else {
                    i12 = 10;
                    c0977f = null;
                    int iDoubleValue = (int) (new Rational(10, i16).doubleValue() * ((double) i15));
                    if (p140j8.f.o("BackupHdrProfileEncoderProfilesProvider")) {
                        String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i15), 10, Integer.valueOf(i16), Integer.valueOf(iDoubleValue));
                        p140j8.f.G("BackupHdrProfileEncoderProfilesProvider");
                    }
                    i15 = iDoubleValue;
                }
                c0977f2 = new C0977f(i14, str, i15, next.f14051d, next.f14052e, next.f14053f, i13, i12, next.f14056i, 1);
            }
            if (c0977f2 == null) {
                c0977f2 = c0977f;
            } else {
                androidx.camera.video.internal.encoder.d dVarD = androidx.camera.video.internal.config.b.d(c0977f2);
                VideoEncoderInfo videoEncoderInfo = (VideoEncoderInfo) ((K) this.f42646c).apply(dVarD);
                if (videoEncoderInfo == null || !videoEncoderInfo.isSizeSupportedAllowSwapping(c0977f2.f14052e, c0977f2.f14053f)) {
                    c0977f2 = c0977f;
                } else {
                    Range<Integer> supportedBitrateRange = videoEncoderInfo.getSupportedBitrateRange();
                    int i17 = dVarD.f14665i;
                    int iIntValue = ((Integer) supportedBitrateRange.clamp(Integer.valueOf(i17))).intValue();
                    if (iIntValue != i17) {
                        c0977f2 = new C0977f(c0977f2.f14048a, c0977f2.f14049b, iIntValue, c0977f2.f14051d, c0977f2.f14052e, c0977f2.f14053f, c0977f2.f14054g, c0977f2.f14055h, c0977f2.f14056i, c0977f2.f14057j);
                    }
                }
            }
            if (c0977f2 != null) {
                arrayList.add(c0977f2);
            }
            A5 = arrayList.isEmpty() ? c0977f : C0975e.a(encoderProfilesProxyL.getDefaultDurationSeconds(), encoderProfilesProxyL.getRecommendedFileFormat(), encoderProfilesProxyL.getAudioProfiles(), arrayList);
        }
        map.put(Integer.valueOf(i7), A5);
        return A5;
    }

    public EditText j() {
        View viewFindViewById = ((CustomSearchView) this.f42645b).findViewById(p241q.f.search_src_text);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    public double k(double d2, double d10) {
        return Math.sin((h(d2) + d10) * 6.283185307179586d);
    }

    public boolean m(int i7, Q.e eVar, BasicMeasure$Measurer basicMeasure$Measurer) {
        Q.d[] dVarArr = eVar.f7453U;
        Q.d dVar = dVarArr[0];
        R.b bVar = (R.b) this.f42646c;
        bVar.f7852a = dVar;
        bVar.f7853b = dVarArr[1];
        bVar.f7854c = eVar.r();
        bVar.f7855d = eVar.l();
        bVar.f7860i = false;
        bVar.f7861j = i7;
        Q.d dVar2 = bVar.f7852a;
        Q.d dVar3 = Q.d.f7430c;
        boolean z3 = dVar2 == dVar3;
        boolean z8 = bVar.f7853b == dVar3;
        boolean z10 = z3 && eVar.f7457Y > 0.0f;
        boolean z11 = z8 && eVar.f7457Y > 0.0f;
        Q.d dVar4 = Q.d.f7428a;
        int[] iArr = eVar.t;
        if (z10 && iArr[0] == 4) {
            bVar.f7852a = dVar4;
        }
        if (z11 && iArr[1] == 4) {
            bVar.f7853b = dVar4;
        }
        basicMeasure$Measurer.measure(eVar, bVar);
        eVar.P(bVar.f7856e);
        eVar.M(bVar.f7857f);
        eVar.f7437E = bVar.f7859h;
        eVar.J(bVar.f7858g);
        bVar.f7861j = 0;
        return bVar.f7860i;
    }

    public b n(String str) {
        try {
            b bVar = (b) ((ConcurrentHashMap) this.f42646c).get(str);
            if (bVar == null) {
                return x(str);
            }
            bVar.reset();
            return bVar;
        } catch (Exception unused) {
            return x(str);
        }
    }

    public void o(String actionKey) {
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        if (l() && !Intrinsics.c((String) this.f42646c, actionKey)) {
            this.f42646c = actionKey;
            ((Handler) this.f42647d).removeCallbacksAndMessages(null);
            ((E6.c) this.f42645b).play(actionKey);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        boolean z3 = th instanceof CancellationException;
        k kVar = (k) this.f42646c;
        if (z3) {
            p118hf.a.k(kVar.d(new k0(G.r(new StringBuilder(), (String) this.f42647d, " cancelled."), th)), null);
        } else {
            kVar.b(null);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        j.f((ListenableFuture) this.f42645b, (k) this.f42646c);
    }

    public void p(Q.f fVar, int i7, int i10, int i11) {
        int i12 = fVar.f7464d0;
        int i13 = fVar.f7466e0;
        fVar.f7464d0 = 0;
        fVar.f7466e0 = 0;
        fVar.P(i10);
        fVar.M(i11);
        if (i12 < 0) {
            fVar.f7464d0 = 0;
        } else {
            fVar.f7464d0 = i12;
        }
        if (i13 < 0) {
            fVar.f7466e0 = 0;
        } else {
            fVar.f7466e0 = i13;
        }
        Q.f fVar2 = (Q.f) this.f42647d;
        fVar2.f7520x0 = i7;
        fVar2.V();
    }

    public void q(String str) {
        this.f42646c = str;
        HashMap map = new HashMap();
        this.f42647d = map;
        map.put("streamType", String.valueOf(4));
        ((HashMap) this.f42647d).put("utteranceId", ReactTextInputShadowNode.PROP_TEXT);
        ((TextToSpeech) this.f42645b).speak(str, 1, (HashMap) this.f42647d);
    }

    public void r() {
        ((Handler) this.f42647d).removeCallbacksAndMessages(null);
        ((E6.c) this.f42645b).stop();
        this.f42646c = null;
    }

    @Override // androidx.core.util.Pools$Pool
    public boolean release(Object obj) {
        if (obj instanceof FactoryPools$Poolable) {
            ((K1.b) ((FactoryPools$Poolable) obj).getVerifier()).f4899a = true;
        }
        ((FactoryPools$Resetter) this.f42646c).reset(obj);
        return ((p058e0.b) this.f42647d).release(obj);
    }

    @Override // androidx.camera.core.processing.Node
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public h transform(androidx.camera.core.processing.c cVar) {
        int i7 = 0;
        p140j8.f.b();
        this.f42647d = new h();
        m mVar = cVar.f14379a;
        for (H.c cVar2 : cVar.f14380b) {
            h hVar = (h) this.f42647d;
            Rect rect = cVar2.f3505d;
            Matrix matrix = new Matrix(mVar.f14427b);
            RectF rectF = new RectF(rect);
            RectF rectF2 = o.f14263a;
            float f10 = 0;
            Size size = cVar2.f3506e;
            RectF rectF3 = new RectF(f10, f10, size.getWidth(), size.getHeight());
            int i10 = cVar2.f3507f;
            boolean z3 = cVar2.f3508g;
            matrix.postConcat(o.a(i10, z3, rectF, rectF3));
            p118hf.a.f(o.d(o.g(o.e(rect), i10), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            C0991m c0991mA = mVar.f14432g.a();
            c0991mA.f14102a = size;
            hVar.put(cVar2, new m(cVar2.f3503b, cVar2.f3504c, c0991mA.a(), matrix, false, rect2, mVar.f14434i - i10, -1, mVar.f14430e != z3));
        }
        ((androidx.camera.core.processing.f) this.f42645b).onInputSurface(mVar.d((CameraInternal) this.f42646c, true));
        for (Map.Entry entry : ((h) this.f42647d).entrySet()) {
            c(mVar, entry);
            ((m) entry.getValue()).a(new Da.h(this, 22, mVar, entry));
        }
        mVar.f14440o.add(new androidx.camera.core.processing.o((h) this.f42647d, i7));
        return (h) this.f42647d;
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public boolean supportsImageType(CloseableImage closeableImage) {
        return true;
    }

    public void t(Q.f fVar) {
        ArrayList arrayList = (ArrayList) this.f42645b;
        arrayList.clear();
        int size = fVar.f7517u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            Q.e eVar = (Q.e) fVar.f7517u0.get(i7);
            Q.d[] dVarArr = eVar.f7453U;
            Q.d dVar = dVarArr[0];
            Q.d dVar2 = Q.d.f7430c;
            if (dVar == dVar2 || dVarArr[1] == dVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.f7519w0.f7865b = true;
    }

    public String toString() {
        String lowerCase;
        switch (this.f42644a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f42645b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                String str = (String) this.f42646c;
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
                String str2 = (String) this.f42647d;
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
                return string;
            case 7:
                StringBuilder sb3 = new StringBuilder();
                String str3 = "************* " + ((String) this.f42645b) + " Head ****************\n";
                sb3.append(str3);
                for (Map.Entry entry : ((LinkedHashMap) this.f42646c).entrySet()) {
                    sb3.append((String) entry.getKey());
                    sb3.append(": ");
                    sb3.append((String) entry.getValue());
                    sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                sb3.append("Rom Info           : ");
                String lowerCase2 = "unknown";
                G6.b bVar = G6.c.f3046u;
                String str4 = "";
                if (bVar == null) {
                    G6.c.f3046u = new G6.b(0);
                    try {
                        String str5 = Build.BRAND;
                        lowerCase = !TextUtils.isEmpty(str5) ? str5.toLowerCase() : "unknown";
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        String str6 = Build.MANUFACTURER;
                        if (!TextUtils.isEmpty(str6)) {
                            lowerCase2 = str6.toLowerCase();
                        }
                        break;
                    } catch (Throwable unused2) {
                    }
                    String[] strArr = G6.c.f3027a;
                    if (G6.c.c(lowerCase, lowerCase2, strArr)) {
                        G6.c.f3046u.f3025b = strArr[0];
                        String strB = G6.c.b("ro.build.version.emui");
                        String[] strArrSplit = strB.split("_");
                        if (strArrSplit.length > 1) {
                            G6.c.f3046u.f3026c = strArrSplit[1];
                        } else {
                            G6.c.f3046u.f3026c = strB;
                        }
                        bVar = G6.c.f3046u;
                    } else {
                        String[] strArr2 = G6.c.f3028b;
                        if (G6.c.c(lowerCase, lowerCase2, strArr2)) {
                            G6.b bVar2 = G6.c.f3046u;
                            bVar2.f3025b = strArr2[0];
                            bVar2.f3026c = G6.c.b("ro.vivo.os.build.display.id");
                            bVar = G6.c.f3046u;
                        } else {
                            String[] strArr3 = G6.c.f3029c;
                            if (G6.c.c(lowerCase, lowerCase2, strArr3)) {
                                G6.b bVar3 = G6.c.f3046u;
                                bVar3.f3025b = strArr3[0];
                                bVar3.f3026c = G6.c.b("ro.build.version.incremental");
                                bVar = G6.c.f3046u;
                            } else {
                                String[] strArr4 = G6.c.f3030d;
                                if (G6.c.c(lowerCase, lowerCase2, strArr4)) {
                                    G6.b bVar4 = G6.c.f3046u;
                                    bVar4.f3025b = strArr4[0];
                                    bVar4.f3026c = G6.c.b("ro.build.version.opporom");
                                    bVar = G6.c.f3046u;
                                } else {
                                    String[] strArr5 = G6.c.f3031e;
                                    if (G6.c.c(lowerCase, lowerCase2, strArr5)) {
                                        G6.b bVar5 = G6.c.f3046u;
                                        bVar5.f3025b = strArr5[0];
                                        bVar5.f3026c = G6.c.b("ro.letv.release.version");
                                        bVar = G6.c.f3046u;
                                    } else {
                                        String[] strArr6 = G6.c.f3032f;
                                        if (G6.c.c(lowerCase, lowerCase2, strArr6)) {
                                            G6.b bVar6 = G6.c.f3046u;
                                            bVar6.f3025b = strArr6[0];
                                            bVar6.f3026c = G6.c.b("ro.build.uiversion");
                                            bVar = G6.c.f3046u;
                                        } else {
                                            String[] strArr7 = G6.c.f3033g;
                                            if (G6.c.c(lowerCase, lowerCase2, strArr7)) {
                                                G6.b bVar7 = G6.c.f3046u;
                                                bVar7.f3025b = strArr7[0];
                                                bVar7.f3026c = G6.c.b("ro.build.MiFavor_version");
                                                bVar = G6.c.f3046u;
                                            } else {
                                                String[] strArr8 = G6.c.f3034h;
                                                if (G6.c.c(lowerCase, lowerCase2, strArr8)) {
                                                    G6.b bVar8 = G6.c.f3046u;
                                                    bVar8.f3025b = strArr8[0];
                                                    bVar8.f3026c = G6.c.b("ro.rom.version");
                                                    bVar = G6.c.f3046u;
                                                } else {
                                                    String[] strArr9 = G6.c.f3035i;
                                                    if (G6.c.c(lowerCase, lowerCase2, strArr9)) {
                                                        G6.b bVar9 = G6.c.f3046u;
                                                        bVar9.f3025b = strArr9[0];
                                                        bVar9.f3026c = G6.c.b("ro.build.rom.id");
                                                        bVar = G6.c.f3046u;
                                                    } else {
                                                        String[] strArr10 = G6.c.f3036j;
                                                        if (G6.c.c(lowerCase, lowerCase2, strArr10)) {
                                                            G6.c.f3046u.f3025b = strArr10[0];
                                                        } else {
                                                            String[] strArr11 = G6.c.f3037k;
                                                            if (G6.c.c(lowerCase, lowerCase2, strArr11)) {
                                                                G6.c.f3046u.f3025b = strArr11[0];
                                                            } else {
                                                                String[] strArr12 = G6.c.f3038l;
                                                                if (G6.c.c(lowerCase, lowerCase2, strArr12)) {
                                                                    G6.c.f3046u.f3025b = strArr12[0];
                                                                } else {
                                                                    String[] strArr13 = G6.c.f3039m;
                                                                    if (G6.c.c(lowerCase, lowerCase2, strArr13)) {
                                                                        G6.c.f3046u.f3025b = strArr13[0];
                                                                    } else {
                                                                        String[] strArr14 = G6.c.f3040n;
                                                                        if (G6.c.c(lowerCase, lowerCase2, strArr14)) {
                                                                            G6.c.f3046u.f3025b = strArr14[0];
                                                                        } else {
                                                                            String[] strArr15 = G6.c.f3041o;
                                                                            if (G6.c.c(lowerCase, lowerCase2, strArr15)) {
                                                                                G6.c.f3046u.f3025b = strArr15[0];
                                                                            } else {
                                                                                String[] strArr16 = G6.c.f3042p;
                                                                                if (G6.c.c(lowerCase, lowerCase2, strArr16)) {
                                                                                    G6.c.f3046u.f3025b = strArr16[0];
                                                                                } else {
                                                                                    String[] strArr17 = G6.c.f3043q;
                                                                                    if (G6.c.c(lowerCase, lowerCase2, strArr17)) {
                                                                                        G6.c.f3046u.f3025b = strArr17[0];
                                                                                    } else {
                                                                                        String[] strArr18 = G6.c.f3044r;
                                                                                        if (G6.c.c(lowerCase, lowerCase2, strArr18)) {
                                                                                            G6.c.f3046u.f3025b = strArr18[0];
                                                                                        } else {
                                                                                            String[] strArr19 = G6.c.f3045s;
                                                                                            if (G6.c.c(lowerCase, lowerCase2, strArr19)) {
                                                                                                G6.c.f3046u.f3025b = strArr19[0];
                                                                                            } else {
                                                                                                String[] strArr20 = G6.c.t;
                                                                                                if (G6.c.c(lowerCase, lowerCase2, strArr20)) {
                                                                                                    G6.c.f3046u.f3025b = strArr20[0];
                                                                                                } else {
                                                                                                    G6.c.f3046u.f3025b = lowerCase2;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        G6.c.f3046u.f3026c = G6.c.b("");
                                                        bVar = G6.c.f3046u;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                sb3.append(bVar);
                sb3.append("\nDevice Manufacturer: ");
                sb3.append(Build.MANUFACTURER);
                sb3.append("\nDevice Model       : ");
                sb3.append(Build.MODEL);
                sb3.append("\nAndroid Version    : ");
                sb3.append(Build.VERSION.RELEASE);
                sb3.append("\nAndroid SDK        : ");
                sb3.append(Build.VERSION.SDK_INT);
                sb3.append("\nApp VersionName    : ");
                Application applicationL = n.l();
                if (applicationL != null) {
                    String packageName = applicationL.getPackageName();
                    if (!G6.c.d(packageName)) {
                        try {
                            PackageInfo packageInfo = n.l().getPackageManager().getPackageInfo(packageName, 0);
                            if (packageInfo != null) {
                                str4 = packageInfo.versionName;
                                break;
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                sb3.append(str4);
                sb3.append("\nApp VersionCode    : ");
                int i7 = -1;
                if (n.l() != null) {
                    String packageName2 = n.l().getPackageName();
                    if (!G6.c.d(packageName2)) {
                        try {
                            PackageInfo packageInfo2 = n.l().getPackageManager().getPackageInfo(packageName2, 0);
                            if (packageInfo2 != null) {
                                i7 = packageInfo2.versionCode;
                                break;
                            }
                        } catch (PackageManager.NameNotFoundException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                sb3.append(i7);
                sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                sb3.append(e());
                sb3.append(str3);
                sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                return sb3.toString();
            case 15:
                return "pos =" + Arrays.toString((double[]) this.f42646c) + " period=" + Arrays.toString((float[]) this.f42645b);
            default:
                return super.toString();
        }
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource transcode(Resource resource, com.bumptech.glide.load.h hVar) {
        Drawable drawable = (Drawable) resource.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C4.a) this.f42646c).transcode(C1331c.a((BitmapPool) this.f42645b, ((BitmapDrawable) drawable).getBitmap()), hVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.d) {
            return ((E1.b) this.f42647d).transcode(resource, hVar);
        }
        return null;
    }

    public void u(MenuItem menuItem, TabScreen tabScreen) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        V7.i iVar = (V7.i) this.f42647d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        if (!Intrinsics.c(menuItem.getTitle(), tabScreen.getTabTitle())) {
            menuItem.setTitle(tabScreen.getTabTitle());
        }
        if (!Intrinsics.c(menuItem.getIcon(), tabScreen.getIcon())) {
            menuItem.setIcon(tabScreen.getIcon());
        }
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        BottomNavigationView bottomNavigationView = iVar.f10103b;
        Menu menu = bottomNavigationView.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        int iE = Sf.p.e(new C1064p(menu), menuItem);
        String badgeValue = tabScreen.getBadgeValue();
        if (badgeValue == null) {
            BadgeDrawable badge = bottomNavigationView.getBadge(iE);
            if (badge != null) {
                badge.setVisible(false);
                return;
            }
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull(badgeValue);
        BadgeDrawable orCreateBadge = bottomNavigationView.getOrCreateBadge(iE);
        Intrinsics.checkNotNullExpressionValue(orCreateBadge, "getOrCreateBadge(...)");
        orCreateBadge.setVisible(true);
        orCreateBadge.clearText();
        orCreateBadge.clearNumber();
        if (intOrNull != null) {
            orCreateBadge.setNumber(intOrNull.intValue());
        } else if (!badgeValue.equals("")) {
            orCreateBadge.setText(badgeValue);
        }
        Integer tabBarItemBadgeTextColor = tabScreen.getTabBarItemBadgeTextColor();
        orCreateBadge.setBadgeTextColor(tabBarItemBadgeTextColor != null ? tabBarItemBadgeTextColor.intValue() : iVar.a(R.attr.colorOnError));
        Integer tabBarItemBadgeBackgroundColor = tabScreen.getTabBarItemBadgeBackgroundColor();
        orCreateBadge.setBackgroundColor(tabBarItemBadgeBackgroundColor != null ? tabBarItemBadgeBackgroundColor.intValue() : iVar.a(p241q.a.colorError));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0234  */
    /* JADX WARN: Code duplicated, block: B:111:0x0259  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    public void v(TabsHost tabsHost) {
        int i7;
        int iIntValue;
        Integer intOrNull;
        float dimension;
        float dimension2;
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        V7.i iVar = (V7.i) this.f42647d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        int i10 = !tabsHost.getTabBarHidden() ? 0 : 8;
        BottomNavigationView bottomNavigationView = iVar.f10103b;
        bottomNavigationView.setVisibility(i10);
        Integer tabBarBackgroundColor = tabsHost.getTabBarBackgroundColor();
        bottomNavigationView.setBackgroundColor(tabBarBackgroundColor != null ? tabBarBackgroundColor.intValue() : iVar.a(R.attr.colorSurfaceContainer));
        int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
        Integer tabBarItemTitleFontColor = tabsHost.getTabBarItemTitleFontColor();
        int iIntValue2 = tabBarItemTitleFontColor != null ? tabBarItemTitleFontColor.intValue() : iVar.a(R.attr.colorOnSurfaceVariant);
        Integer tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColorActive();
        bottomNavigationView.setItemTextColor(new ColorStateList(iArr, new int[]{iIntValue2, (tabBarItemTitleFontColorActive == null && (tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColor()) == null) ? iVar.a(R.attr.colorSecondary) : tabBarItemTitleFontColorActive.intValue()}));
        Integer tabBarItemIconColor = tabsHost.getTabBarItemIconColor();
        int iIntValue3 = tabBarItemIconColor != null ? tabBarItemIconColor.intValue() : iVar.a(R.attr.colorOnSurfaceVariant);
        Integer tabBarItemIconColorActive = tabsHost.getTabBarItemIconColorActive();
        bottomNavigationView.setItemIconTintList(new ColorStateList(iArr, new int[]{iIntValue3, (tabBarItemIconColorActive == null && (tabBarItemIconColorActive = tabsHost.getTabBarItemIconColor()) == null) ? iVar.a(R.attr.colorOnSecondaryContainer) : tabBarItemIconColorActive.intValue()}));
        String tabBarItemLabelVisibilityMode = tabsHost.getTabBarItemLabelVisibilityMode();
        if (tabBarItemLabelVisibilityMode == null) {
            i7 = -1;
        } else {
            int iHashCode = tabBarItemLabelVisibilityMode.hashCode();
            if (iHashCode != -63201645) {
                if (iHashCode != 1191572123) {
                    if (iHashCode == 1648599514 && tabBarItemLabelVisibilityMode.equals("unlabeled")) {
                        i7 = 2;
                    } else {
                        i7 = -1;
                    }
                } else if (tabBarItemLabelVisibilityMode.equals("selected")) {
                    i7 = 0;
                } else {
                    i7 = -1;
                }
            } else if (tabBarItemLabelVisibilityMode.equals("labeled")) {
                i7 = 1;
            } else {
                i7 = -1;
            }
        }
        bottomNavigationView.setLabelVisibilityMode(i7);
        Integer tabBarItemRippleColor = tabsHost.getTabBarItemRippleColor();
        bottomNavigationView.setItemRippleColor(ColorStateList.valueOf(tabBarItemRippleColor != null ? tabBarItemRippleColor.intValue() : iVar.a(R.attr.itemRippleColor)));
        Integer tabBarItemActiveIndicatorColor = tabsHost.getTabBarItemActiveIndicatorColor();
        int iIntValue4 = tabBarItemActiveIndicatorColor != null ? tabBarItemActiveIndicatorColor.intValue() : iVar.a(R.attr.colorSecondaryContainer);
        bottomNavigationView.setItemActiveIndicatorEnabled(((Boolean) tabsHost.f25441C.getValue(tabsHost, TabsHost.f25438y0[2])).booleanValue());
        bottomNavigationView.setItemActiveIndicatorColor(ColorStateList.valueOf(iIntValue4));
        BottomNavigationView bottomNavigationView2 = (BottomNavigationView) this.f42645b;
        Menu menu = bottomNavigationView2.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        int size = menu.size();
        ArrayList arrayList = (ArrayList) this.f42646c;
        if (size != arrayList.size()) {
            bottomNavigationView2.getMenu().clear();
        }
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C1850q.k();
                throw null;
            }
            TabScreenFragment tabScreenFragment = (TabScreenFragment) obj;
            Menu menu2 = bottomNavigationView2.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu2, "getMenu(...)");
            TabScreen tabScreen = tabScreenFragment.f25437a;
            MenuItem menuItemFindItem = menu2.findItem(i11);
            if (menuItemFindItem == null) {
                menuItemFindItem = menu2.add(0, i11, 0, tabScreen.getTabTitle());
                Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "add(...)");
            }
            if (menuItemFindItem.getItemId() != i11) {
                throw new IllegalStateException("[RNScreens] Illegal state: menu items are shuffled");
            }
            u(menuItemFindItem, tabScreenFragment.f25437a);
            i11 = i12;
        }
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        View childAt = bottomNavigationView.getChildAt(0);
        Intrinsics.f(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        Iterator it = new P((ViewGroup) childAt).iterator();
        while (true) {
            Q q10 = (Q) it;
            if (!q10.hasNext()) {
                return;
            }
            View view = (View) q10.next();
            TextView textView = (TextView) view.findViewById(R.id.navigation_bar_item_large_label_view);
            TextView textView2 = (TextView) view.findViewById(R.id.navigation_bar_item_small_label_view);
            boolean zC = Intrinsics.c(tabsHost.getTabBarItemTitleFontStyle(), "italic");
            if (Intrinsics.c(tabsHost.getTabBarItemTitleFontWeight(), "bold")) {
                iIntValue = 700;
            } else {
                String tabBarItemTitleFontWeight = tabsHost.getTabBarItemTitleFontWeight();
                iIntValue = (tabBarItemTitleFontWeight == null || (intOrNull = StringsKt.toIntOrNull(tabBarItemTitleFontWeight)) == null) ? 400 : intOrNull.intValue();
            }
            ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
            String tabBarItemTitleFontFamily = tabsHost.getTabBarItemTitleFontFamily();
            if (tabBarItemTitleFontFamily == null) {
                tabBarItemTitleFontFamily = "";
            }
            ContextThemeWrapper contextThemeWrapper = iVar.f10102a;
            Typeface typeface = companion.getTypeface(tabBarItemTitleFontFamily, iIntValue, zC, contextThemeWrapper.getAssets());
            Float tabBarItemTitleFontSize = tabsHost.getTabBarItemTitleFontSize();
            if (tabBarItemTitleFontSize == null) {
                dimension = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
            } else {
                if (tabBarItemTitleFontSize.floatValue() <= 0.0f) {
                    tabBarItemTitleFontSize = null;
                }
                if (tabBarItemTitleFontSize != null) {
                    dimension = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSize.floatValue(), 0.0f, 2, null);
                } else {
                    dimension = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
                }
            }
            Float tabBarItemTitleFontSizeActive = tabsHost.getTabBarItemTitleFontSizeActive();
            if (tabBarItemTitleFontSizeActive == null) {
                dimension2 = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
            } else {
                if (tabBarItemTitleFontSizeActive.floatValue() <= 0.0f) {
                    tabBarItemTitleFontSizeActive = null;
                }
                if (tabBarItemTitleFontSizeActive != null) {
                    dimension2 = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSizeActive.floatValue(), 0.0f, 2, null);
                } else {
                    dimension2 = contextThemeWrapper.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
                }
            }
            textView2.setTextSize(0, dimension);
            textView2.setTypeface(typeface);
            textView.setTextSize(0, dimension2);
            textView.setTypeface(typeface);
        }
    }

    public b w(ContentResolver contentResolver, Uri uri) {
        b bVar = null;
        try {
            b bVar2 = new b(contentResolver.openInputStream(uri));
            try {
                int iAvailable = bVar2.available();
                if (iAvailable <= 0) {
                    iAvailable = 8388608;
                }
                bVar2.mark(iAvailable);
                ((ConcurrentHashMap) this.f42646c).put(uri.toString(), bVar2);
                ((HashSet) this.f42645b).add(uri.toString());
                return bVar2;
            } catch (Exception e10) {
                e = e10;
                bVar = bVar2;
                e.printStackTrace();
                return bVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public b x(String str) {
        b bVar = null;
        try {
            b bVar2 = new b(new FileInputStream(str));
            try {
                int iAvailable = bVar2.available();
                if (iAvailable <= 0) {
                    iAvailable = 8388608;
                }
                bVar2.mark(iAvailable);
                ((ConcurrentHashMap) this.f42646c).put(str, bVar2);
                ((HashSet) this.f42645b).add(str);
                return bVar2;
            } catch (Exception e10) {
                e = e10;
                bVar = bVar2;
                e.printStackTrace();
                return bVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void z(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        byte[] bArr = (byte[]) this.f42646c;
        y(i7, bArr);
        byteArrayOutputStream.write(bArr);
    }

    public /* synthetic */ a(int i7, boolean z3) {
        this.f42644a = i7;
    }

    public a(E6.c voicePlayer) {
        this.f42644a = 6;
        Intrinsics.checkNotNullParameter(voicePlayer, "voicePlayer");
        this.f42645b = voicePlayer;
        this.f42647d = new Handler(Looper.getMainLooper());
        voicePlayer.f2253e = new Ae.j(this, 12);
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        ((androidx.camera.core.processing.f) this.f42645b).release();
        p140j8.f.B(new W8.o(this, 20));
    }

    public a(Context context) {
        this.f42644a = 22;
        this.f42645b = context;
        this.f42646c = new ReentrantLock();
        this.f42647d = new Ye.b(context);
    }

    public /* synthetic */ a(Object obj, int i7, Object obj2, Object obj3) {
        this.f42644a = i7;
        this.f42645b = obj;
        this.f42646c = obj2;
        this.f42647d = obj3;
    }

    public a(ContextThemeWrapper context, BottomNavigationView bottomNavigationView, ArrayList tabScreenFragments) {
        this.f42644a = 19;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(tabScreenFragments, "tabScreenFragments");
        this.f42645b = bottomNavigationView;
        this.f42646c = tabScreenFragments;
        this.f42647d = new V7.i(context, bottomNavigationView);
    }

    public a(int i7) {
        this.f42644a = i7;
        switch (i7) {
            case 1:
                this.f42645b = new byte[2];
                this.f42646c = new byte[4];
                this.f42647d = new byte[8];
                break;
            case 14:
                ReentrantLock reentrantLock = new ReentrantLock();
                this.f42646c = reentrantLock;
                this.f42647d = new Nb.b(reentrantLock, null);
                this.f42645b = new Nb.c();
                break;
            case 17:
                this.f42646c = "";
                this.f42645b = new TextToSpeech((Context) p267r9.a.f41645a.f4463a, new TextToSpeech.OnInitListener() { // from class: Pa.q0
                    @Override // android.speech.tts.TextToSpeech.OnInitListener
                    public final void onInit(int i10) {
                        top.zibin.luban.io.a aVar = this.f7146a;
                        if (i10 != 0) {
                            aVar.getClass();
                            F6.d.c("TTS", "Error in converting Text to Speech!");
                            return;
                        }
                        ((TextToSpeech) aVar.f42645b).setSpeechRate(0.8f);
                        int language = ((TextToSpeech) aVar.f42645b).setLanguage(Locale.US);
                        if (language == -1 || language == -2) {
                            F6.d.c("TTS", "The Language is not supported!");
                        } else {
                            F6.d.h("TTS", 4, "Language Supported.");
                            aVar.q((String) aVar.f42646c);
                        }
                    }
                });
                break;
            default:
                this.f42645b = new HashSet();
                this.f42646c = new ConcurrentHashMap();
                this.f42647d = new f();
                break;
        }
    }

    public a(View view, int i7) {
        this.f42644a = i7;
        switch (i7) {
            case 21:
                this.f42645b = view;
                this.f42646c = (TextView) view.findViewById(s.ciar_amount_title_tv);
                this.f42647d = (TextView) view.findViewById(s.ciar_fee_tv);
                break;
            default:
                this.f42645b = view;
                this.f42646c = view != null ? (IconicsTextView) view.findViewById(Ac.e.tvLevel) : null;
                this.f42647d = view != null ? (TextView) view.findViewById(Ac.e.tvUpgrade) : null;
                break;
        }
    }

    public a(AnimatedImage animatedImage) {
        this.f42644a = 20;
        this.f42645b = animatedImage;
    }

    public a(Context context, LocationManager locationManager) {
        this.f42644a = 25;
        this.f42647d = new U();
        this.f42645b = context;
        this.f42646c = locationManager;
    }

    public a(Q.f fVar) {
        this.f42644a = 18;
        this.f42645b = new ArrayList();
        this.f42646c = new R.b();
        this.f42647d = fVar;
    }

    public a(androidx.camera.video.internal.c cVar) {
        this.f42644a = 29;
        K k2 = A.f14644d;
        this.f42647d = new HashMap();
        this.f42645b = cVar;
        this.f42646c = k2;
    }

    public a(y yVar) {
        this.f42644a = 26;
        this.f42647d = yVar;
    }

    public a(CameraInternal cameraInternal, androidx.camera.core.processing.f fVar) {
        this.f42644a = 28;
        this.f42646c = cameraInternal;
        this.f42645b = fVar;
    }

    public a(Signature signature) {
        this.f42644a = 24;
        this.f42645b = signature;
        this.f42646c = null;
        this.f42647d = null;
    }

    public a(Cipher cipher) {
        this.f42644a = 24;
        this.f42646c = cipher;
        this.f42645b = null;
        this.f42647d = null;
    }

    public a(Mac mac) {
        this.f42644a = 24;
        this.f42647d = mac;
        this.f42646c = null;
        this.f42645b = null;
    }
}
