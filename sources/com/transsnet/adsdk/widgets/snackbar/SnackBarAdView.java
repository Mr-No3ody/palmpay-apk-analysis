package com.transsnet.adsdk.widgets.snackbar;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import Wf.v0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.activity.AbstractActivityC0822m;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.request.transition.Transition;
import com.chuanyi.ad.BaseViewGroupManager;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.local.database.AdDatabase;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.AdApi;
import com.transsnet.adsdk.data.network.Predicate.SingleAdPredicate;
import com.transsnet.adsdk.data.network.ReqUtil;
import com.transsnet.adsdk.data.network.function.SingleAdFunction;
import com.transsnet.adsdk.data.network.observer.AdCommonObserver;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;
import p015ag.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 32\u00020\u0001:\u00013B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\nJ,\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#J\u001a\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#J$\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#J\"\u0010$\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0&H\u0002J\"\u0010'\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0&H\u0002J\"\u0010(\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0&H\u0002J\u0016\u0010)\u001a\u00020\u000f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002J*\u0010+\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0&2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020\fH\u0002J\u0018\u0010-\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0&H\u0002J\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0003J\u000e\u00100\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u00101\u001a\u00020\u001c2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tJ\u0014\u00102\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/transsnet/adsdk/widgets/snackbar/SnackBarAdView;", "", BaseViewGroupManager.PROP_SLOT_ID, "", "adListener", "Lcom/transsnet/adsdk/interfaces/IAdListener;", "<init>", "(Ljava/lang/String;Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "appNoShowList", "", "(Ljava/lang/String;Ljava/util/List;Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "mAdData", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "mSlotId", "mExpired", "", "mUseCache", "mAdListener", "mNoShowList", "", "mAppNoShowList", "mSnackBarMap", "", "Lcom/transsnet/adsdk/widgets/snackbar/SnackBarRecycle;", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "useCoroutine", "show", "", "context", "Landroid/content/Context;", "useCache", "parentView", "Landroid/view/View;", "showCallback", "Lcom/transsnet/adsdk/widgets/interfaces/AdShowCallback;", "fetchData", "weakContext", "Ljava/lang/ref/WeakReference;", "fetchDataWithCoroutine", "showAd", "handleCache", "entityList", "preloadImage", "adData", "postFailResult", "setSlotId", "positionId", "setAdListener", "setAppNoShowList", "getCoroutineScope", "Companion", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnackBarAdView {

    @NotNull
    private static final String TAG = "SnackBarAdView";

    @NotNull
    private AdEntity mAdData;

    @NotNull
    private IAdListener mAdListener;

    @NotNull
    private final List<String> mAppNoShowList;
    private boolean mExpired;

    @NotNull
    private final List<String> mNoShowList;

    @NotNull
    private String mSlotId;

    @NotNull
    private final Map<String, SnackBarRecycle> mSnackBarMap;
    private boolean mUseCache;
    private boolean useCoroutine;

    @Nullable
    private CoroutineScope viewScope;

    public SnackBarAdView(@NotNull String slotId, @NotNull IAdListener adListener) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        Intrinsics.checkNotNullParameter(adListener, "adListener");
        this.mAdData = new AdEntity();
        this.mUseCache = true;
        this.mNoShowList = new ArrayList();
        this.mAppNoShowList = new ArrayList();
        this.mSnackBarMap = new HashMap();
        this.useCoroutine = AdManager.isDebug();
        this.mSlotId = slotId;
        this.mAdListener = adListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchData(final AdShowCallback showCallback, final WeakReference<Context> weakContext) {
        C1755g c1755g = new C1755g(new a(this), 0);
        df.i iVar = p298tf.f.f42628a;
        new C1760l(new C1760l(new C1760l(new C1760l(c1755g.k(iVar).i(p071ef.b.a()), new com.google.firebase.crashlytics.internal.concurrency.b(new D6.a(this, 3, showCallback, weakContext), 19), 2), new com.google.firebase.crashlytics.internal.concurrency.b(new m(this, 8), 20), 1).i(iVar).f(new a(this)), new SingleAdFunction(this.mSlotId, null), 2), new SingleAdPredicate(null), 1).k(iVar).i(p071ef.b.a()).subscribe(new AdCommonObserver<AdEntity>(weakContext.get(), this.mAdListener) { // from class: com.transsnet.adsdk.widgets.snackbar.SnackBarAdView.fetchData.5
            @Override // com.transsnet.adsdk.data.network.INetResult
            public void onSuccess(AdEntity data) {
                Intrinsics.checkNotNullParameter(data, "data");
                SnackBarAdView.this.mAdData = data;
                SnackBarAdView.this.showAd(showCallback, weakContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$1(SnackBarAdView snackBarAdView, ObservableEmitter emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        List<AdEntity> listQueryBySlotIdLimitCount = AdDatabase.getInstance(AdManager.get().getApp()).adDao().queryBySlotIdLimitCount(snackBarAdView.mSlotId, AdManager.get().getCountryCode(), 10);
        snackBarAdView.mNoShowList.clear();
        snackBarAdView.mNoShowList.addAll(snackBarAdView.mAppNoShowList);
        for (AdEntity adEntity : listQueryBySlotIdLimitCount) {
            if (!AdManager.checkShowAd(adEntity)) {
                List<String> list = snackBarAdView.mNoShowList;
                String adId = adEntity.adId;
                Intrinsics.checkNotNullExpressionValue(adId, "adId");
                list.add(adId);
            }
        }
        if (snackBarAdView.mExpired) {
            d0.h().disableAllData(snackBarAdView.mSlotId);
            emitter.onNext(Boolean.FALSE);
        } else if (listQueryBySlotIdLimitCount.size() != 0) {
            AdEntity adEntity2 = listQueryBySlotIdLimitCount.get(0);
            Intrinsics.checkNotNullExpressionValue(adEntity2, "get(...)");
            AdEntity adEntity3 = adEntity2;
            snackBarAdView.mAdData = adEntity3;
            emitter.onNext(Boolean.valueOf(AdManager.checkShowAd(adEntity3)));
        } else {
            snackBarAdView.mExpired = true;
            d0.h().disableAllData(snackBarAdView.mSlotId);
            emitter.onNext(Boolean.FALSE);
        }
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$2(SnackBarAdView snackBarAdView, AdShowCallback adShowCallback, WeakReference weakReference, boolean z3) {
        if (z3) {
            snackBarAdView.showAd(adShowCallback, weakReference);
        }
        return Boolean.valueOf(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$3(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Boolean) function1.invoke(p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$4(SnackBarAdView snackBarAdView, Boolean bool) {
        return snackBarAdView.mExpired;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$5(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((Boolean) function1.invoke(p3)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource fetchData$lambda$6(SnackBarAdView snackBarAdView, Boolean bool) {
        AdReq commonAdReq = ReqUtil.getCommonAdReq(snackBarAdView.mSlotId, snackBarAdView.mNoShowList);
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchDataWithCoroutine(AdShowCallback showCallback, WeakReference<Context> weakContext) {
        CoroutineScope coroutineScope = getCoroutineScope(weakContext.get());
        if (coroutineScope != null) {
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new d(showCallback, this, weakContext, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CoroutineScope getCoroutineScope(Context context) {
        try {
            if (context instanceof AbstractActivityC0822m) {
                return V.f((LifecycleOwner) context);
            }
            if (this.viewScope == null) {
                p042cg.f fVar = I.f10809a;
                p0 p0Var = o.f11960a;
                v0 v0VarC = AbstractC0780y.c();
                p0Var.getClass();
                this.viewScope = AbstractC0777v.a(kotlin.coroutines.e.c(p0Var, v0VarC));
            }
            return this.viewScope;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleCache(List<? extends AdEntity> entityList) {
        if (entityList.isEmpty()) {
            this.mExpired = true;
            return false;
        }
        AdEntity adEntity = entityList.get(0);
        this.mAdData = adEntity;
        return AdManager.checkShowAd(adEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postFailResult(WeakReference<Context> weakContext) {
        CoroutineScope coroutineScope = getCoroutineScope(weakContext.get());
        if (coroutineScope != null) {
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope, o.f11960a, null, new e(weakContext, this, null), 2);
        }
    }

    private final void preloadImage(final WeakReference<Context> weakContext, final AdShowCallback showCallback, final AdEntity adData) {
        if (AppUtils.isActivityAlive(weakContext.get())) {
            Context context = weakContext.get();
            Intrinsics.e(context);
            Context context2 = context;
            com.bumptech.glide.m mVarO = com.bumptech.glide.b.c(context2).c(context2).load(adData.imageUrl).a(new G1.d().g(k.f20705d));
            mVarO.T(new H1.c() { // from class: com.transsnet.adsdk.widgets.snackbar.SnackBarAdView.preloadImage.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable placeholder) {
                    SnackBarRecycle snackBarRecycle = (SnackBarRecycle) SnackBarAdView.this.mSnackBarMap.get(adData.adId);
                    if (snackBarRecycle != null) {
                        snackBarRecycle.setValid(false);
                    }
                }

                @Override // H1.c, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable errorDrawable) {
                    SnackBarAdView.this.postFailResult(weakContext);
                }

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                    onResourceReady((Drawable) obj, (Transition<? super Drawable>) transition);
                }

                public void onResourceReady(Drawable resource, Transition<? super Drawable> transition) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    if (AppUtils.isActivityAlive(weakContext.get())) {
                        if (showCallback != null) {
                            SnackBarRecycle snackBarRecycle = new SnackBarRecycle(SnackBarAdView.this.mAdData, SnackBarAdView.this.mAdListener);
                            SnackBarAdView.this.mSnackBarMap.put(adData.adId, snackBarRecycle);
                            showCallback.showSnackBarCallback(snackBarRecycle);
                        }
                        AdSdkUtils.onLoadAdSuccess(weakContext.get(), SnackBarAdView.this.mAdListener);
                    }
                }
            }, null, mVarO, J1.g.f4461a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd(AdShowCallback showCallback, WeakReference<Context> weakContext) {
        AdEntity adEntity = this.mAdData;
        if (adEntity.adType != 2) {
            preloadImage(weakContext, showCallback, adEntity);
        } else if (showCallback != null) {
            showCallback.showAppAd(adEntity);
        }
        AdSdkUtils.onLoadAdSuccess(weakContext.get(), this.mAdListener);
    }

    public final void setAdListener(@NotNull IAdListener adListener) {
        Intrinsics.checkNotNullParameter(adListener, "adListener");
        this.mAdListener = adListener;
    }

    public final void setAppNoShowList(@Nullable List<String> appNoShowList) {
        this.mAppNoShowList.clear();
        if (appNoShowList != null) {
            this.mAppNoShowList.addAll(appNoShowList);
        }
    }

    public final void setSlotId(@NotNull String positionId) {
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        this.mSlotId = positionId;
    }

    public final void show(@Nullable Context context, boolean useCache, @Nullable View parentView, @Nullable AdShowCallback showCallback) {
        this.mUseCache = useCache;
        show(context, parentView, showCallback);
    }

    public final void show(@Nullable Context context, @Nullable AdShowCallback showCallback) {
        show(context, null, showCallback);
    }

    public final void show(@Nullable Context context, @Nullable View parentView, @Nullable AdShowCallback showCallback) {
        CoroutineScope coroutineScope = getCoroutineScope(context);
        if (coroutineScope != null) {
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new g(this, showCallback, context, null), 2);
        }
    }

    public SnackBarAdView(@NotNull String slotId, @Nullable List<String> list, @NotNull IAdListener adListener) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        Intrinsics.checkNotNullParameter(adListener, "adListener");
        this.mAdData = new AdEntity();
        this.mUseCache = true;
        this.mNoShowList = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.mAppNoShowList = arrayList;
        this.mSnackBarMap = new HashMap();
        this.useCoroutine = AdManager.isDebug();
        this.mSlotId = slotId;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        this.mAdListener = adListener;
    }
}
