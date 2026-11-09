package com.transsnet.adsdk.widgets.Interstitial;

import Ad.C0058e;
import Da.g;
import H1.j;
import M.q;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import Wf.v0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.AbstractActivityC0822m;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.chuanyi.ad.BaseViewGroupManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.local.database.AdDatabase;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.AdApi;
import com.transsnet.adsdk.data.network.AdRetrofitClient;
import com.transsnet.adsdk.data.network.Predicate.SingleAdPredicate;
import com.transsnet.adsdk.data.network.ReqUtil;
import com.transsnet.adsdk.data.network.function.SingleAdFunction;
import com.transsnet.adsdk.data.network.observer.AdCommonObserver;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AdZipUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.adsdk.widgets.interfaces.IAppDataInterfaces;
import df.i;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;
import p041ce.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 X2\u00020\u0001:\u0001XB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fB?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u000fB-\b\u0017\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u0012J\u000e\u0010/\u001a\u0002002\u0006\u0010\b\u001a\u00020\tJ\u000e\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0005J\u0010\u00103\u001a\u0002002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\"\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u00010.2\u0006\u00106\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u000108J\u001e\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u00010.2\n\b\u0002\u00107\u001a\u0004\u0018\u000108H\u0007J\u0018\u00109\u001a\u0002002\b\u00107\u001a\u0004\u0018\u000108H\u0082@¢\u0006\u0002\u0010:J\u001c\u0010;\u001a\u0002002\b\u00107\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u00010.H\u0002J\u001a\u0010<\u001a\u0002002\b\u00105\u001a\u0004\u0018\u00010.2\b\u00107\u001a\u0004\u0018\u000108J\u001a\u0010=\u001a\u0004\u0018\u00010.2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-H\u0002J\"\u0010>\u001a\u0002002\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0002J\"\u0010B\u001a\u0002002\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-2\b\u00107\u001a\u0004\u0018\u000108H\u0002J2\u0010C\u001a\u0002002\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010A\u001a\u00020@2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u001a\u0010E\u001a\u00020@2\b\u00105\u001a\u0004\u0018\u00010.2\u0006\u0010D\u001a\u00020\u0003H\u0002J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u0003H\u0002J\u0010\u0010G\u001a\u00020\u00162\u0006\u0010H\u001a\u00020@H\u0002J\u0010\u0010I\u001a\u0002002\b\u0010J\u001a\u0004\u0018\u00010\u0003J\u000e\u0010K\u001a\u0002002\u0006\u0010\u0004\u001a\u00020\u0005J$\u0010L\u001a\u0002002\u0010\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u001c\u0010M\u001a\u0002002\b\u0010N\u001a\u0004\u0018\u00010O2\b\u00107\u001a\u0004\u0018\u000108H\u0002J*\u0010P\u001a\u0002002\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u0010Q\u001a\u00020@2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u000e\u0010R\u001a\u0002002\u0006\u0010S\u001a\u00020\u0016J\u0010\u0010T\u001a\u0002002\u0006\u0010U\u001a\u00020\u0016H\u0016J\u0014\u0010V\u001a\u0004\u0018\u00010%2\b\u00105\u001a\u0004\u0018\u00010.H\u0002J\u000e\u0010W\u001a\u0002002\u0006\u0010&\u001a\u00020\u0016R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001eR\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/transsnet/adsdk/widgets/Interstitial/InterstitialAdView;", "Lcom/transsnet/adsdk/interfaces/IRemoteDataListener;", BaseViewGroupManager.PROP_SLOT_ID, "", "adListener", "Lcom/transsnet/adsdk/interfaces/IAdListener;", "<init>", "(Ljava/lang/String;Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "adType", "", "dataInterfaces", "Lcom/transsnet/adsdk/widgets/interfaces/IAppDataInterfaces;", "(Ljava/lang/String;ILcom/transsnet/adsdk/interfaces/IAdListener;Lcom/transsnet/adsdk/widgets/interfaces/IAppDataInterfaces;)V", "appNoShowList", "", "(Ljava/lang/String;ILjava/util/List;Lcom/transsnet/adsdk/interfaces/IAdListener;Lcom/transsnet/adsdk/widgets/interfaces/IAppDataInterfaces;)V", "adEntity", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "(Lcom/transsnet/adsdk/data/local/entity/AdEntity;ILcom/transsnet/adsdk/interfaces/IAdListener;Lcom/transsnet/adsdk/widgets/interfaces/IAppDataInterfaces;)V", "mAdData", "mSlotId", "mExpired", "", "mUseCache", "mInterstitialListener", "mDataInterfaces", "mAdType", "mNoShowList", "", "getMNoShowList", "()Ljava/util/List;", "mNoShowList$delegate", "Lkotlin/Lazy;", "mAppNoShowList", "getMAppNoShowList", "mAppNoShowList$delegate", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "useCoroutine", "isUseRemoteWebView", "()Z", "setUseRemoteWebView", "(Z)V", "bDarkMode", "weakContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "setAdType", "", "setAdListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAppDataInterfaces", "show", "context", "useCache", "showCallback", "Lcom/transsnet/adsdk/widgets/interfaces/AdShowCallback;", "fetchDataWithCoroutine", "(Lcom/transsnet/adsdk/widgets/interfaces/AdShowCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchData", "downloadZipShow", "getValidContext", "preloadImage", "getUnZipDir", "Ljava/io/File;", "zipFile", "showH5Dialog", "downloadZip", "url", "getZipFile", "getFileName", "deleteDir", "dir", "setSlotId", "positionId", "setInterstitialListener", "showAd", "showDialog", "dialog", "Lcom/transsnet/adsdk/widgets/Interstitial/InterstitialAdDialog;", "handleZipFile", "unZipDir", "switchDarkMode", "dark", "emptyData", "networkRequestSuccess", "getCoroutineScope", "setUseCoroutine", "Companion", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInterstitialAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterstitialAdView.kt\ncom/transsnet/adsdk/widgets/Interstitial/InterstitialAdView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,600:1\n774#2:601\n865#2,2:602\n1869#2,2:604\n739#2,9:606\n739#2,9:619\n37#3:615\n36#3,3:616\n37#3:628\n36#3,3:629\n*S KotlinDebug\n*F\n+ 1 InterstitialAdView.kt\ncom/transsnet/adsdk/widgets/Interstitial/InterstitialAdView\n*L\n189#1:601\n189#1:602,2\n189#1:604,2\n472#1:606,9\n473#1:619,9\n472#1:615\n472#1:616,3\n474#1:628\n474#1:629,3\n*E\n"})
public final class InterstitialAdView implements IRemoteDataListener {

    @NotNull
    private static final String TAG = "InterstitialAdView";
    private boolean bDarkMode;
    private boolean isUseRemoteWebView;

    @Nullable
    private AdEntity mAdData;
    private int mAdType;

    /* JADX INFO: renamed from: mAppNoShowList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAppNoShowList;

    @Nullable
    private IAppDataInterfaces mDataInterfaces;
    private boolean mExpired;

    @Nullable
    private IAdListener mInterstitialListener;

    /* JADX INFO: renamed from: mNoShowList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNoShowList;

    @Nullable
    private String mSlotId;
    private boolean mUseCache;
    private boolean useCoroutine;

    @Nullable
    private CoroutineScope viewScope;

    @Nullable
    private WeakReference<Context> weakContext;

    /* JADX INFO: renamed from: com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView$downloadZip$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/transsnet/adsdk/widgets/Interstitial/InterstitialAdView$downloadZip$1", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/e0;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/e0;)V", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInterstitialAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterstitialAdView.kt\ncom/transsnet/adsdk/widgets/Interstitial/InterstitialAdView$downloadZip$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,600:1\n1#2:601\n*E\n"})
    public static final class AnonymousClass1 implements Callback {
        final /* synthetic */ AdShowCallback $showCallback;
        final /* synthetic */ WeakReference<Context> $weakContext;
        final /* synthetic */ File $zipFile;

        public AnonymousClass1(File file, WeakReference<Context> weakReference, AdShowCallback adShowCallback) {
            this.$zipFile = file;
            this.$weakContext = weakReference;
            this.$showCallback = adShowCallback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            Log.e(InterstitialAdView.TAG, "onFailure: download h5 zip failed---->");
        }

        /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
        /* JADX WARN: Instruction removed from duplicated block: B:62:0x01b0, please report this as an issue */
        @Override // okhttp3.Callback
        public void onResponse(Call call, e0 response) throws Throwable {
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2;
            Closeable closeable;
            Closeable closeable2;
            FileOutputStream fileOutputStream3;
            boolean zDelete;
            StringBuilder sb2;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            byte[] bArr = new byte[2048];
            File unZipDir = InterstitialAdView.this.getUnZipDir(this.$zipFile);
            FileOutputStream fileOutputStream4 = null;
            fileOutputStream4 = null;
            fileOutputStream4 = null;
            fileOutputStream4 = null;
            try {
                h0 h0Var = response.f40734g;
                if (h0Var == null) {
                    Log.e(InterstitialAdView.TAG, "onResponse: responseBody is null---->");
                    AdSdkUtils.closeIO(h0Var);
                    AdSdkUtils.closeIO(null);
                    AdSdkUtils.closeIO(null);
                    if (this.$zipFile.exists()) {
                        zDelete = this.$zipFile.delete();
                        sb2 = new StringBuilder("onResponse: delete zip file result = ");
                        sb2.append(zDelete);
                        Log.e(InterstitialAdView.TAG, sb2.toString());
                    }
                }
                InputStream inputStreamByteStream = h0Var.byteStream();
                try {
                    if (this.$zipFile.exists() && !this.$zipFile.delete()) {
                        this.$zipFile.getPath();
                        AdSdkUtils.closeIO(h0Var);
                        AdSdkUtils.closeIO(inputStreamByteStream);
                        AdSdkUtils.closeIO(null);
                        if (this.$zipFile.exists()) {
                            zDelete = this.$zipFile.delete();
                            sb2 = new StringBuilder("onResponse: delete zip file result = ");
                            sb2.append(zDelete);
                            Log.e(InterstitialAdView.TAG, sb2.toString());
                        }
                    }
                    fileOutputStream3 = new FileOutputStream(this.$zipFile);
                    while (true) {
                        try {
                            int i7 = inputStreamByteStream.read(bArr);
                            if (i7 == -1) {
                                break;
                            }
                            try {
                                fileOutputStream3.write(bArr, 0, i7);
                            } catch (Exception e10) {
                                e = e10;
                            } catch (Throwable th) {
                                th = th;
                                closeable = inputStreamByteStream;
                                fileOutputStream = fileOutputStream3;
                                AdSdkUtils.closeIO(response.f40734g);
                                AdSdkUtils.closeIO(closeable);
                                AdSdkUtils.closeIO(fileOutputStream);
                                if (this.$zipFile.exists()) {
                                    Log.e(InterstitialAdView.TAG, "onResponse: delete zip file result = " + this.$zipFile.delete());
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        closeable2 = inputStreamByteStream;
                        fileOutputStream2 = fileOutputStream3;
                        try {
                            if (unZipDir.exists()) {
                                Log.e(InterstitialAdView.TAG, "onResponse: delete unZipDir" + unZipDir.getPath());
                                InterstitialAdView.this.deleteDir(unZipDir);
                            }
                            Log.e(InterstitialAdView.TAG, "onResponse: error = " + e.getMessage());
                            AdSdkUtils.closeIO(response.f40734g);
                            AdSdkUtils.closeIO(closeable2);
                            AdSdkUtils.closeIO(fileOutputStream2);
                            if (this.$zipFile.exists()) {
                                Log.e(InterstitialAdView.TAG, "onResponse: delete zip file result = " + this.$zipFile.delete());
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            closeable = closeable2;
                            fileOutputStream = fileOutputStream2;
                            AdSdkUtils.closeIO(response.f40734g);
                            AdSdkUtils.closeIO(closeable);
                            AdSdkUtils.closeIO(fileOutputStream);
                            if (this.$zipFile.exists()) {
                                Log.e(InterstitialAdView.TAG, "onResponse: delete zip file result = " + this.$zipFile.delete());
                            }
                            throw th;
                        }
                    }
                    fileOutputStream3.flush();
                    AdZipUtils.unzipFile(this.$zipFile, unZipDir);
                    unZipDir.getPath();
                    FileOutputStream fileOutputStream5 = fileOutputStream3;
                    new Handler(Looper.getMainLooper()).post(new g(InterstitialAdView.this, this.$weakContext, unZipDir, this.$showCallback, 16));
                    AdSdkUtils.closeIO(h0Var);
                    AdSdkUtils.closeIO(inputStreamByteStream);
                    AdSdkUtils.closeIO(fileOutputStream5);
                    fileOutputStream4 = fileOutputStream5;
                    if (this.$zipFile.exists()) {
                        zDelete = this.$zipFile.delete();
                        sb2 = new StringBuilder("onResponse: delete zip file result = ");
                        sb2.append(zDelete);
                        Log.e(InterstitialAdView.TAG, sb2.toString());
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream3 = null;
                }
            } catch (Exception e13) {
                e = e13;
                fileOutputStream2 = fileOutputStream4;
                closeable2 = fileOutputStream4;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = fileOutputStream4;
                closeable = fileOutputStream4;
            }
        }
    }

    public InterstitialAdView(@NotNull String slotId, @Nullable IAdListener iAdListener) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.mUseCache = true;
        this.mNoShowList = C2131j.b(new o(22));
        this.mAppNoShowList = C2131j.b(new o(23));
        this.useCoroutine = AdManager.isDebug();
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mSlotId = slotId;
        this.mInterstitialListener = iAdListener;
    }

    public static final /* synthetic */ void access$handleZipFile(InterstitialAdView interstitialAdView, WeakReference weakReference, File file, AdShowCallback adShowCallback) {
        interstitialAdView.handleZipFile(weakReference, file, adShowCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deleteDir(File dir) {
        String[] list;
        if (dir.isDirectory() && (list = dir.list()) != null) {
            q qVarA = AbstractC1859i.a(list);
            while (qVarA.hasNext()) {
                if (!deleteDir(new File(dir, (String) qVarA.next()))) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    private final void downloadZip(WeakReference<Context> weakContext, String url, File zipFile, AdShowCallback showCallback) {
        X x3 = new X();
        x3.k(url);
        x3.d();
        FirebasePerfOkHttpClient.enqueue(AdRetrofitClient.get().getOkHttpClient().newCall(x3.b()), new AnonymousClass1(zipFile, weakContext, showCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void emptyData$lambda$18(boolean z3, InterstitialAdView interstitialAdView) {
        WeakReference<Context> weakReference;
        if (!z3 || (weakReference = interstitialAdView.weakContext) == null) {
            return;
        }
        AdSdkUtils.onLoadAdFailed(weakReference != null ? weakReference.get() : null, interstitialAdView.mInterstitialListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchData(final AdShowCallback showCallback, Context context) {
        C1755g c1755g = new C1755g(new a(this), 0);
        i iVar = p298tf.f.f42628a;
        new C1760l(new C1760l(new C1760l(new C1760l(c1755g.k(iVar).i(p071ef.b.a()), new com.google.firebase.crashlytics.internal.concurrency.b(new C0058e(24, this, showCallback), 7), 2), new com.google.firebase.crashlytics.internal.concurrency.b(new m(this, 7), 8), 1).i(iVar).f(new a(this)), new SingleAdFunction(this.mSlotId, this), 2), new SingleAdPredicate(null), 1).k(iVar).i(p071ef.b.a()).subscribe(new AdCommonObserver<AdEntity>(context, this.mInterstitialListener) { // from class: com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView.fetchData.5
            @Override // com.transsnet.adsdk.data.network.INetResult
            public void onSuccess(AdEntity data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.mAdData = data;
                InterstitialAdView interstitialAdView = this;
                interstitialAdView.showAd(interstitialAdView.weakContext, showCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$10(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Boolean) function1.invoke(p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$11(InterstitialAdView interstitialAdView, Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return interstitialAdView.mExpired;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$12(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((Boolean) function1.invoke(p3)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource fetchData$lambda$13(InterstitialAdView interstitialAdView, Boolean bool) {
        AdReq commonAdReq = ReqUtil.getCommonAdReq(interstitialAdView.mSlotId, interstitialAdView.getMNoShowList());
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$8(InterstitialAdView interstitialAdView, ObservableEmitter emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        List<AdEntity> listQueryAllIdBySlotIdLimitCount = AdDatabase.getInstance(AdManager.get().getApp()).adDao().queryAllIdBySlotIdLimitCount(interstitialAdView.mSlotId, AdManager.get().getCountryCode(), 10);
        interstitialAdView.getMNoShowList().clear();
        interstitialAdView.getMNoShowList().addAll(interstitialAdView.getMAppNoShowList());
        for (AdEntity adEntity : listQueryAllIdBySlotIdLimitCount) {
            if (!AdManager.checkShowAd(adEntity)) {
                interstitialAdView.getMNoShowList().add(adEntity.adId);
            }
        }
        if (interstitialAdView.mExpired) {
            d0.h().disableAllData(interstitialAdView.mSlotId);
            emitter.onNext(Boolean.FALSE);
        } else if (listQueryAllIdBySlotIdLimitCount.size() != 0) {
            AdEntity adEntity2 = listQueryAllIdBySlotIdLimitCount.get(0);
            interstitialAdView.mAdData = adEntity2;
            emitter.onNext(Boolean.valueOf(AdManager.checkShowAd(adEntity2)));
        } else {
            interstitialAdView.mExpired = true;
            d0.h().disableAllData(interstitialAdView.mSlotId);
            emitter.onNext(Boolean.FALSE);
        }
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$9(InterstitialAdView interstitialAdView, AdShowCallback adShowCallback, boolean z3) {
        if (z3) {
            interstitialAdView.showAd(interstitialAdView.weakContext, adShowCallback);
        }
        return Boolean.valueOf(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x0134 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002b, B:20:0x003d, B:51:0x0130, B:53:0x0134, B:55:0x0141, B:57:0x0149, B:60:0x015d, B:61:0x0161, B:21:0x0042, B:46:0x0108, B:24:0x004a, B:25:0x0089, B:27:0x008f, B:29:0x009c, B:30:0x00a0, B:31:0x00a4, B:33:0x00aa, B:35:0x00b8, B:36:0x00c2, B:38:0x00c6, B:40:0x00cf, B:43:0x00f6, B:48:0x010b, B:41:0x00dc), top: B:66:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x015d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002b, B:20:0x003d, B:51:0x0130, B:53:0x0134, B:55:0x0141, B:57:0x0149, B:60:0x015d, B:61:0x0161, B:21:0x0042, B:46:0x0108, B:24:0x004a, B:25:0x0089, B:27:0x008f, B:29:0x009c, B:30:0x00a0, B:31:0x00a4, B:33:0x00aa, B:35:0x00b8, B:36:0x00c2, B:38:0x00c6, B:40:0x00cf, B:43:0x00f6, B:48:0x010b, B:41:0x00dc), top: B:66:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0161 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002b, B:20:0x003d, B:51:0x0130, B:53:0x0134, B:55:0x0141, B:57:0x0149, B:60:0x015d, B:61:0x0161, B:21:0x0042, B:46:0x0108, B:24:0x004a, B:25:0x0089, B:27:0x008f, B:29:0x009c, B:30:0x00a0, B:31:0x00a4, B:33:0x00aa, B:35:0x00b8, B:36:0x00c2, B:38:0x00c6, B:40:0x00cf, B:43:0x00f6, B:48:0x010b, B:41:0x00dc), top: B:66:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015a, code lost:
    
        if (Wf.AbstractC0780y.s(r2, r4, r0) == r1) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchDataWithCoroutine(com.transsnet.adsdk.widgets.interfaces.AdShowCallback r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView.fetchDataWithCoroutine(com.transsnet.adsdk.widgets.interfaces.AdShowCallback, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CoroutineScope getCoroutineScope(Context context) {
        try {
            if (context instanceof AbstractActivityC0822m) {
                return V.f((LifecycleOwner) context);
            }
            if (this.viewScope == null) {
                p042cg.f fVar = I.f10809a;
                p0 p0Var = p015ag.o.f11960a;
                v0 v0VarC = AbstractC0780y.c();
                p0Var.getClass();
                this.viewScope = AbstractC0777v.a(kotlin.coroutines.e.c(p0Var, v0VarC));
            }
            return this.viewScope;
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getFileName(String url) {
        Collection collectionU;
        Collection collectionU2;
        try {
            List listC = new Regex("/").c(url);
            if (!listC.isEmpty()) {
                ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionU = z.f38935a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                collectionU = z.f38935a;
                break;
            }
            String[] strArr = (String[]) collectionU.toArray(new String[0]);
            List listC2 = new Regex("/").c(url);
            if (listC2.isEmpty()) {
                collectionU2 = z.f38935a;
            } else {
                ListIterator listIterator2 = listC2.listIterator(listC2.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        collectionU2 = CollectionsKt.U(listC2, listIterator2.nextIndex() + 1);
                    }
                }
                collectionU2 = z.f38935a;
            }
            return ((String[]) collectionU2.toArray(new String[0]))[strArr.length - 1];
        } catch (Exception e10) {
            Log.e(TAG, "getFileName: ", e10);
            return "";
        }
    }

    private final List<String> getMAppNoShowList() {
        return (List) this.mAppNoShowList.getValue();
    }

    private final List<String> getMNoShowList() {
        return (List) this.mNoShowList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getUnZipDir(File zipFile) {
        String name = zipFile.getName();
        String parent = zipFile.getParent();
        Intrinsics.e(name);
        String strSubstring = name.substring(0, name.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new File(parent, strSubstring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getValidContext(WeakReference<Context> weakContext) {
        Context context = weakContext.get();
        if (context == null || !AppUtils.isActivityAlive(context)) {
            return null;
        }
        return context;
    }

    private final File getZipFile(Context context, String url) {
        File externalFilesDir = context != null ? context.getExternalFilesDir("transsnetAd") : null;
        if (externalFilesDir != null && !externalFilesDir.exists()) {
            Log.e(TAG, "getZipFile: download dir result = " + externalFilesDir.mkdir());
        }
        return new File(externalFilesDir, getFileName(url));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleZipFile(WeakReference<Context> weakContext, File unZipDir, AdShowCallback showCallback) {
        Context context = weakContext.get();
        if (context != null && AppUtils.isActivityAlive(context)) {
            unZipDir.getPath();
            AdEntity adEntity = this.mAdData;
            String str = null;
            if (TextUtils.isEmpty(adEntity != null ? adEntity.jumpParams : null)) {
                str = "";
            } else {
                AdEntity adEntity2 = this.mAdData;
                if (adEntity2 != null) {
                    str = adEntity2.jumpParams;
                }
            }
            String string = context.getString(R.string.native_url, unZipDir.getPath(), str);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            InterstitialAdDialog interstitialAdDialog = new InterstitialAdDialog(context, this.mAdData, this.mAdType, string, this.mInterstitialListener, this.mDataInterfaces);
            interstitialAdDialog.switchDarkMode(this.bDarkMode);
            interstitialAdDialog.setUseRemoteWebView(this.isUseRemoteWebView);
            showDialog(interstitialAdDialog, showCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList mAppNoShowList_delegate$lambda$1() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList mNoShowList_delegate$lambda$0() {
        return new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0051  */
    private final void preloadImage(final WeakReference<Context> weakContext, final AdShowCallback showCallback) {
        AdEntity adEntity;
        String str;
        AdEntity adEntity2 = this.mAdData;
        if (adEntity2 == null) {
            return;
        }
        String str2 = adEntity2.imageUrl;
        if (this.bDarkMode && !TextUtils.isEmpty(adEntity2.imageUrlDark)) {
            AdEntity adEntity3 = this.mAdData;
            str2 = adEntity3 != null ? adEntity3.imageUrlDark : null;
        }
        if (this.mAdType == 1) {
            AdEntity adEntity4 = this.mAdData;
            if (!TextUtils.isEmpty(adEntity4 != null ? adEntity4.h5ImageUrl : null)) {
                if (this.bDarkMode) {
                    AdEntity adEntity5 = this.mAdData;
                    if (TextUtils.isEmpty(adEntity5 != null ? adEntity5.h5ImageUrlDark : null)) {
                        adEntity = this.mAdData;
                        if (adEntity != null) {
                            str = adEntity.h5ImageUrl;
                            str2 = str;
                        } else {
                            str2 = null;
                        }
                    } else {
                        AdEntity adEntity6 = this.mAdData;
                        if (adEntity6 != null) {
                            str = adEntity6.h5ImageUrlDark;
                            str2 = str;
                        } else {
                            str2 = null;
                        }
                    }
                } else {
                    adEntity = this.mAdData;
                    if (adEntity != null) {
                        str = adEntity.h5ImageUrl;
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                }
            }
        }
        Context validContext = getValidContext(weakContext);
        if (validContext != null) {
            com.bumptech.glide.m mVarN = com.bumptech.glide.b.c(validContext).c(validContext).load(str2).a(new G1.d().g(k.f20703b)).N(new RequestListener<Drawable>() { // from class: com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView$preloadImage$1$1
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(u e10, Object model, Target<Drawable> target, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(target, "target");
                    AdSdkUtils.onLoadAdFailed(weakContext.get(), this.mInterstitialListener);
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, com.bumptech.glide.load.a dataSource, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    Intrinsics.checkNotNullParameter(model, "model");
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    Context validContext2 = this.getValidContext(weakContext);
                    if (validContext2 == null) {
                        return false;
                    }
                    InterstitialAdView interstitialAdView = this;
                    AdShowCallback adShowCallback = showCallback;
                    InterstitialAdDialog interstitialAdDialog = new InterstitialAdDialog(validContext2, interstitialAdView.mAdData, interstitialAdView.mAdType, interstitialAdView.mInterstitialListener);
                    interstitialAdDialog.switchDarkMode(interstitialAdView.bDarkMode);
                    interstitialAdView.showDialog(interstitialAdDialog, adShowCallback);
                    return false;
                }
            });
            mVarN.getClass();
            mVarN.T(new j(mVarN.f21022k0), null, mVarN, J1.g.f4461a);
        }
    }

    public static /* synthetic */ void show$default(InterstitialAdView interstitialAdView, Context context, AdShowCallback adShowCallback, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            adShowCallback = null;
        }
        interstitialAdView.show(context, adShowCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd(WeakReference<Context> weakContext, AdShowCallback showCallback) {
        AdEntity adEntity = this.mAdData;
        if (adEntity != null && adEntity.adType == 2) {
            if (showCallback != null) {
                showCallback.showAppAd(adEntity);
            }
        } else if (weakContext != null) {
            int i7 = this.mAdType;
            if (i7 == 0 || AdSdkUtils.isImageOnlyWebAd(adEntity, i7)) {
                preloadImage(weakContext, showCallback);
            } else {
                showH5Dialog(weakContext, showCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog(InterstitialAdDialog dialog, AdShowCallback showCallback) {
        if (dialog == null) {
            return;
        }
        if (showCallback != null) {
            showCallback.showCallback(dialog);
        } else {
            dialog.show();
        }
    }

    private final void showH5Dialog(WeakReference<Context> weakContext, AdShowCallback showCallback) {
        String str;
        if (weakContext.get() != null) {
            AdEntity adEntity = this.mAdData;
            if (TextUtils.isEmpty(adEntity != null ? adEntity.imageUrl : null)) {
                return;
            }
            AdEntity adEntity2 = this.mAdData;
            if (adEntity2 == null || (str = adEntity2.imageUrl) == null) {
                str = "";
            }
            File zipFile = getZipFile(weakContext.get(), str);
            File unZipDir = getUnZipDir(zipFile);
            if (unZipDir.exists()) {
                handleZipFile(weakContext, unZipDir, showCallback);
            } else {
                downloadZip(weakContext, str, zipFile, showCallback);
            }
        }
    }

    public final void downloadZipShow(@Nullable Context context, @Nullable AdShowCallback showCallback) {
        showH5Dialog(new WeakReference<>(context), showCallback);
    }

    @Override // com.transsnet.adsdk.interfaces.IRemoteDataListener
    public void emptyData(boolean networkRequestSuccess) {
        AdSdkUtils.runInMainThread(new D.b(networkRequestSuccess, this, 16));
    }

    /* JADX INFO: renamed from: isUseRemoteWebView, reason: from getter */
    public final boolean getIsUseRemoteWebView() {
        return this.isUseRemoteWebView;
    }

    public final void setAdListener(@NotNull IAdListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mInterstitialListener = listener;
    }

    public final void setAdType(int adType) {
        this.mAdType = adType;
    }

    public final void setAppDataInterfaces(@Nullable IAppDataInterfaces dataInterfaces) {
        this.mDataInterfaces = dataInterfaces;
    }

    public final void setInterstitialListener(@NotNull IAdListener adListener) {
        Intrinsics.checkNotNullParameter(adListener, "adListener");
        this.mInterstitialListener = adListener;
    }

    public final void setSlotId(@Nullable String positionId) {
        this.mSlotId = positionId;
    }

    public final void setUseCoroutine(boolean useCoroutine) {
        this.useCoroutine = useCoroutine;
    }

    public final void setUseRemoteWebView(boolean z3) {
        this.isUseRemoteWebView = z3;
    }

    @JvmOverloads
    public final void show(@Nullable Context context) {
        show$default(this, context, null, 2, null);
    }

    public final void switchDarkMode(boolean dark) {
        this.bDarkMode = dark;
    }

    public final void show(@Nullable Context context, boolean useCache, @Nullable AdShowCallback showCallback) {
        this.mUseCache = useCache;
        show(context, showCallback);
    }

    @JvmOverloads
    public final void show(@Nullable Context context, @Nullable AdShowCallback showCallback) {
        this.weakContext = new WeakReference<>(context);
        CoroutineScope coroutineScope = getCoroutineScope(context);
        if (coroutineScope != null) {
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new f(this, showCallback, context, null), 2);
        }
    }

    public InterstitialAdView(@NotNull String slotId, int i7, @Nullable IAdListener iAdListener, @Nullable IAppDataInterfaces iAppDataInterfaces) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.mUseCache = true;
        this.mNoShowList = C2131j.b(new o(22));
        this.mAppNoShowList = C2131j.b(new o(23));
        this.useCoroutine = AdManager.isDebug();
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mSlotId = slotId;
        this.mAdType = i7;
        this.mInterstitialListener = iAdListener;
        this.mDataInterfaces = iAppDataInterfaces;
    }

    public InterstitialAdView(@NotNull String slotId, int i7, @Nullable List<String> list, @Nullable IAdListener iAdListener, @Nullable IAppDataInterfaces iAppDataInterfaces) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.mUseCache = true;
        this.mNoShowList = C2131j.b(new o(22));
        this.mAppNoShowList = C2131j.b(new o(23));
        this.useCoroutine = AdManager.isDebug();
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mSlotId = slotId;
        this.mAdType = i7;
        if (list != null) {
            getMAppNoShowList().addAll(list);
        }
        this.mInterstitialListener = iAdListener;
        this.mDataInterfaces = iAppDataInterfaces;
    }

    @Deprecated(message = "")
    public InterstitialAdView(@Nullable AdEntity adEntity, int i7, @NotNull IAdListener adListener, @Nullable IAppDataInterfaces iAppDataInterfaces) {
        Intrinsics.checkNotNullParameter(adListener, "adListener");
        this.mUseCache = true;
        this.mNoShowList = C2131j.b(new o(22));
        this.mAppNoShowList = C2131j.b(new o(23));
        this.useCoroutine = AdManager.isDebug();
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mAdData = adEntity;
        this.mAdType = i7;
        this.mInterstitialListener = adListener;
        this.mDataInterfaces = iAppDataInterfaces;
    }
}
