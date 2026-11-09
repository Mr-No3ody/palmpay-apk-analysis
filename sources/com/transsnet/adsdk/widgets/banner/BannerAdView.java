package com.transsnet.adsdk.widgets.banner;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.C0753a0;
import Wf.I;
import Wf.p0;
import Wf.v0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractActivityC0822m;
import androidx.lifecycle.V;
import androidx.viewpager2.widget.ViewPager2;
import com.chuanyi.ad.BaseViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.event.AdEvent;
import com.transsnet.adsdk.data.local.database.AdDatabase;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.AdApi;
import com.transsnet.adsdk.data.network.Predicate.MultipleAdPredicate;
import com.transsnet.adsdk.data.network.ReqUtil;
import com.transsnet.adsdk.data.network.function.BannerAdFunction;
import com.transsnet.adsdk.data.network.function.MultipleAdFunction;
import com.transsnet.adsdk.data.network.observer.AdCommonObserver;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;
import com.transsnet.analysis.contants.EventsConstants;
import df.i;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 q2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004:\u0001qB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020CH\u0016J\u000e\u0010E\u001a\u00020CH\u0082@¢\u0006\u0002\u0010FJ\b\u0010G\u001a\u00020CH\u0002J\b\u0010H\u001a\u00020CH\u0002J\b\u0010I\u001a\u00020CH\u0002J\u0018\u0010J\u001a\u00020C2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010LH\u0002J\u001e\u0010M\u001a\u00020\u000e2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020L2\u0006\u0010O\u001a\u00020\u0002H\u0002J\u0018\u0010S\u001a\u00020C2\b\u0010P\u001a\u0004\u0018\u00010\u00182\u0006\u0010U\u001a\u00020\u000eJ\u0012\u0010V\u001a\u00020C2\b\b\u0002\u0010W\u001a\u00020\u000eH\u0007J\u0018\u0010X\u001a\u00020C2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\nH\u0016J\u0018\u0010\\\u001a\u00020C2\u0006\u0010]\u001a\u00020/2\u0006\u0010^\u001a\u00020/H\u0002J\u0010\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020aH\u0016J\u0018\u0010b\u001a\u00020C2\u0006\u0010c\u001a\u00020Z2\u0006\u0010d\u001a\u00020\nH\u0014J\b\u0010e\u001a\u00020CH\u0014J\u0012\u0010f\u001a\u00020C2\b\u0010g\u001a\u0004\u0018\u000105H\u0002J\u000e\u0010h\u001a\u00020C2\u0006\u0010i\u001a\u00020\u000eJ\n\u0010j\u001a\u0004\u0018\u000108H\u0002J\u000e\u0010k\u001a\u00020C2\u0006\u0010;\u001a\u00020\u000eJ\u0016\u0010l\u001a\u00020C2\u0006\u0010m\u001a\u00020\u00182\u0006\u0010n\u001a\u00020>J\u001a\u0010l\u001a\u00020C2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020>0pR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R.\u00103\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000205\u0018\u000104j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000205\u0018\u0001`6X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R'\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020>0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0016\u001a\u0004\b?\u0010@R(\u0010P\u001a\u0004\u0018\u00010\u00182\b\u0010P\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006r"}, d2 = {"Lcom/transsnet/adsdk/widgets/banner/BannerAdView;", "Lcom/transsnet/adsdk/widgets/banner/bannerview/BannerViewPager;", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "Ljava/lang/Runnable;", "Lcom/transsnet/adsdk/widgets/banner/bannerview/BannerViewPager$OnPageClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mResult", "", "mBannerAdAdapter", "Lcom/transsnet/adsdk/widgets/banner/BannerAdAdapter;", "mAdData", "", "getMAdData", "()Ljava/util/List;", "mAdData$delegate", "Lkotlin/Lazy;", "mSlotId", "", "mUserCache", "mExpired", "adListener", "Lcom/transsnet/adsdk/interfaces/IAdListener;", "getAdListener", "()Lcom/transsnet/adsdk/interfaces/IAdListener;", "setAdListener", "(Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "mShowTime", "", "mLocationX", "mLocationY", "mManualDrag", "mLastBeginId", "mLastEndId", "mHeightMode", "mRounderCorner", "mDefaultSrc", "mDefaultDimen", "mNoShowList", "mRefresh", "mImgWidth", "", "mBannerType", "mSelectedIndicatorColor", "mUnSelectedIndicatorColor", "mEvents", "Ljava/util/HashMap;", "Lcom/transsnet/adsdk/data/event/AdEvent;", "Lkotlin/collections/HashMap;", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "viewJob", "Lkotlinx/coroutines/Job;", "useCoroutine", "extras", "", "", "getExtras", "()Ljava/util/Map;", "extras$delegate", "initData", "", "run", "fetchDataWithCoroutine", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchData", "postLoadFailResult", "initAdapter", "showData", "datas", "", "containsItem", "list", "adEntity", BaseViewGroupManager.PROP_SLOT_ID, "getSlotId", "()Ljava/lang/String;", "setSlotId", "(Ljava/lang/String;)V", "loadNow", "refreshData", "force", "onPageClick", "clickedView", "Landroid/view/View;", ViewProps.POSITION, "setDynamicHeight", "width", "height", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onVisibilityChanged", "changedView", "visibility", "onDetachedFromWindow", "addAdEvent", "adEvent", "switchDarkMode", "dark", "getCoroutineScope", "setUseCoroutine", "appendExtra", "key", "value", "extra", "", "Companion", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBannerAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerAdView.kt\ncom/transsnet/adsdk/widgets/banner/BannerAdView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,608:1\n774#2:609\n865#2,2:610\n739#2,9:612\n1869#2,2:625\n37#3:621\n36#3,3:622\n*S KotlinDebug\n*F\n+ 1 BannerAdView.kt\ncom/transsnet/adsdk/widgets/banner/BannerAdView\n*L\n182#1:609\n182#1:610,2\n395#1:612,9\n412#1:625,2\n396#1:621\n396#1:622,3\n*E\n"})
public final class BannerAdView extends BannerViewPager<AdEntity> implements Runnable, BannerViewPager.OnPageClickListener {
    public static final int BANNER_NORMAL_TYPE = 0;
    public static final int BANNER_SQUARE_TYPE = 1;

    @NotNull
    private static final String TAG = "BannerAdView";

    @Nullable
    private IAdListener adListener;

    /* JADX INFO: renamed from: extras$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extras;

    /* JADX INFO: renamed from: mAdData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdData;

    @Nullable
    private BannerAdAdapter mBannerAdAdapter;
    private int mBannerType;

    @Nullable
    private String mDefaultDimen;
    private int mDefaultSrc;

    @Nullable
    private HashMap<String, AdEvent> mEvents;
    private boolean mExpired;
    private final int mHeightMode;
    private float mImgWidth;

    @Nullable
    private String mLastBeginId;

    @Nullable
    private String mLastEndId;
    private int mLocationX;
    private int mLocationY;
    private boolean mManualDrag;

    @NotNull
    private final List<String> mNoShowList;
    private boolean mRefresh;
    private boolean mResult;
    private int mRounderCorner;
    private int mSelectedIndicatorColor;
    private long mShowTime;

    @Nullable
    private String mSlotId;
    private int mUnSelectedIndicatorColor;
    private boolean mUserCache;
    private boolean useCoroutine;

    @Nullable
    private Job viewJob;

    @Nullable
    private CoroutineScope viewScope;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAdEvent(AdEvent adEvent) {
        if (adEvent == null) {
            return;
        }
        String eventKey = adEvent.getEventKey();
        HashMap<String, AdEvent> map = this.mEvents;
        if (map == null) {
            HashMap<String, AdEvent> map2 = new HashMap<>();
            this.mEvents = map2;
            map2.put(eventKey, adEvent);
            return;
        }
        AdEvent adEvent2 = map != null ? map.get(eventKey) : null;
        if (adEvent2 == null || !adEvent2.isSameEvent(adEvent)) {
            HashMap<String, AdEvent> map3 = this.mEvents;
            if (map3 != null) {
                map3.put(eventKey, adEvent);
                return;
            }
            return;
        }
        int i7 = adEvent2.count + 1;
        adEvent2.count = i7;
        if (i7 >= 10) {
            AdSdkUtils.trackEvent(adEvent2);
            HashMap<String, AdEvent> map4 = this.mEvents;
            if (map4 != null) {
                map4.remove(eventKey);
            }
        }
    }

    private final boolean containsItem(List<? extends AdEntity> list, AdEntity adEntity) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(adEntity, list.get(i7))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap extras_delegate$lambda$1() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchData() {
        C1755g c1755g = new C1755g(new a(this), 0);
        i iVar = p298tf.f.f42628a;
        final int i7 = 0;
        C1760l c1760l = new C1760l(c1755g.k(iVar).i(p071ef.b.a()), new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.banner.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BannerAdView f25617b;

            {
                this.f25617b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return BannerAdView.fetchData$lambda$6(this.f25617b, (List) obj);
                    default:
                        return Boolean.valueOf(BannerAdView.fetchData$lambda$8(this.f25617b, (Boolean) obj));
                }
            }
        }, 17), 2);
        final int i10 = 1;
        new C1760l(new C1760l(new C1760l(new C1760l(c1760l, new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.banner.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BannerAdView f25617b;

            {
                this.f25617b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return BannerAdView.fetchData$lambda$6(this.f25617b, (List) obj);
                    default:
                        return Boolean.valueOf(BannerAdView.fetchData$lambda$8(this.f25617b, (Boolean) obj));
                }
            }
        }, 18), 1).i(iVar).f(new a(this)), new MultipleAdFunction(this.mSlotId, new a(this)), 2), new BannerAdFunction(), 2), new MultipleAdPredicate(new a(this)), 1).i(p071ef.b.a()).subscribe(new AdCommonObserver<List<? extends AdEntity>>(getContext(), this.adListener) { // from class: com.transsnet.adsdk.widgets.banner.BannerAdView.fetchData.7
            @Override // com.transsnet.adsdk.data.network.INetResult
            public void onSuccess(List<? extends AdEntity> data) {
                BannerAdView.this.showData(data);
                AdSdkUtils.onLoadAdSuccess(BannerAdView.this.getContext(), BannerAdView.this.getAdListener());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource fetchData$lambda$10(BannerAdView bannerAdView, Boolean bool) {
        AdReq commonAdReq = ReqUtil.getCommonAdReq(bannerAdView.mSlotId, bannerAdView.mNoShowList, bannerAdView.getExtras());
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$11(BannerAdView bannerAdView, boolean z3) {
        bannerAdView.mResult = z3;
        bannerAdView.postLoadFailResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$12(BannerAdView bannerAdView, boolean z3, List list) {
        if (!bannerAdView.mResult || z3) {
            return;
        }
        bannerAdView.postLoadFailResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$5(BannerAdView bannerAdView, ObservableEmitter emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        bannerAdView.mNoShowList.clear();
        if (bannerAdView.mExpired || !bannerAdView.mUserCache) {
            bannerAdView.getMAdData().clear();
            AdDatabase.getInstance(AdManager.get().getApp()).adDao().disableAllData(bannerAdView.mSlotId);
            emitter.onNext(new ArrayList());
        } else {
            List<AdEntity> listQueryBySlotIdWithOrder = d0.h().queryBySlotIdWithOrder(bannerAdView.mSlotId, AdManager.get().getCountryCode());
            Intrinsics.e(listQueryBySlotIdWithOrder);
            if (listQueryBySlotIdWithOrder.isEmpty()) {
                bannerAdView.mExpired = true;
                bannerAdView.getMAdData().clear();
                AdDatabase.getInstance(AdManager.get().getApp()).adDao().disableAllData(bannerAdView.mSlotId);
                emitter.onNext(new ArrayList());
            } else {
                ArrayList arrayList = new ArrayList();
                for (AdEntity adEntity : listQueryBySlotIdWithOrder) {
                    if (AdManager.checkShowAd(adEntity)) {
                        Intrinsics.e(adEntity);
                        arrayList.add(adEntity);
                    }
                }
                emitter.onNext(arrayList);
            }
        }
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$6(BannerAdView bannerAdView, List list) {
        List list2 = list;
        boolean z3 = list2 == null || list2.isEmpty();
        boolean z8 = !z3;
        if (!z3) {
            bannerAdView.showData(list);
            AdSdkUtils.onLoadAdSuccess(bannerAdView.getContext(), bannerAdView.adListener);
        }
        return Boolean.valueOf(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$7(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Boolean) function1.invoke(p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$8(BannerAdView bannerAdView, Boolean bool) {
        return bannerAdView.mExpired;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$9(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((Boolean) function1.invoke(p3)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[Catch: Exception -> 0x0132, PHI: r10
      0x00f4: PHI (r10v26 java.lang.Object) = (r10v12 java.lang.Object), (r10v1 java.lang.Object) binds: [B:40:0x00f1, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0132, blocks: (B:13:0x002a, B:17:0x0037, B:42:0x00f4, B:44:0x00f8, B:46:0x0111, B:49:0x0118, B:52:0x012a, B:53:0x012e, B:18:0x003c, B:36:0x00ae, B:21:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x007e, B:28:0x0084, B:30:0x0091, B:31:0x0095, B:33:0x009b, B:38:0x00b1, B:39:0x00b3), top: B:58:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:13:0x002a, B:17:0x0037, B:42:0x00f4, B:44:0x00f8, B:46:0x0111, B:49:0x0118, B:52:0x012a, B:53:0x012e, B:18:0x003c, B:36:0x00ae, B:21:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x007e, B:28:0x0084, B:30:0x0091, B:31:0x0095, B:33:0x009b, B:38:0x00b1, B:39:0x00b3), top: B:58:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0111 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:13:0x002a, B:17:0x0037, B:42:0x00f4, B:44:0x00f8, B:46:0x0111, B:49:0x0118, B:52:0x012a, B:53:0x012e, B:18:0x003c, B:36:0x00ae, B:21:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x007e, B:28:0x0084, B:30:0x0091, B:31:0x0095, B:33:0x009b, B:38:0x00b1, B:39:0x00b3), top: B:58:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012a A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:13:0x002a, B:17:0x0037, B:42:0x00f4, B:44:0x00f8, B:46:0x0111, B:49:0x0118, B:52:0x012a, B:53:0x012e, B:18:0x003c, B:36:0x00ae, B:21:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x007e, B:28:0x0084, B:30:0x0091, B:31:0x0095, B:33:0x009b, B:38:0x00b1, B:39:0x00b3), top: B:58:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012e A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #0 {Exception -> 0x0132, blocks: (B:13:0x002a, B:17:0x0037, B:42:0x00f4, B:44:0x00f8, B:46:0x0111, B:49:0x0118, B:52:0x012a, B:53:0x012e, B:18:0x003c, B:36:0x00ae, B:21:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x007e, B:28:0x0084, B:30:0x0091, B:31:0x0095, B:33:0x009b, B:38:0x00b1, B:39:0x00b3), top: B:58:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (Wf.AbstractC0780y.s(r2, r5, r0) == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchDataWithCoroutine(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.banner.BannerAdView.fetchDataWithCoroutine(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final CoroutineScope getCoroutineScope() {
        CoroutineContext coroutineContext;
        try {
            Job job = this.viewJob;
            if (job == null || !job.isActive()) {
                Context context = getContext();
                AbstractActivityC0822m abstractActivityC0822m = context instanceof AbstractActivityC0822m ? (AbstractActivityC0822m) context : null;
                this.viewJob = new v0((abstractActivityC0822m == null || (coroutineContext = V.f(abstractActivityC0822m).f17355b) == null) ? null : (Job) coroutineContext.get(C0753a0.f10836a));
            }
            if (this.viewScope == null) {
                p042cg.f fVar = I.f10809a;
                p0 p0Var = o.f11960a;
                CoroutineContext coroutineContextC = this.viewJob;
                if (coroutineContextC == null) {
                    coroutineContextC = AbstractC0780y.c();
                }
                p0Var.getClass();
                this.viewScope = AbstractC0777v.a(kotlin.coroutines.e.c(p0Var, coroutineContextC));
            }
            return this.viewScope;
        } catch (Exception unused) {
            return null;
        }
    }

    private final Map<String, Object> getExtras() {
        return (Map) this.extras.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AdEntity> getMAdData() {
        return (List) this.mAdData.getValue();
    }

    private final void initAdapter() {
        if (this.mBannerAdAdapter == null) {
            BannerAdAdapter bannerAdAdapter = new BannerAdAdapter(this.mRounderCorner, this.mBannerType);
            this.mBannerAdAdapter = bannerAdAdapter;
            bannerAdAdapter.setDefaultRes(this.mDefaultSrc);
            setCanLoop(true);
            setIndicatorStyle(0);
            setIndicatorSliderGap(getResources().getDimensionPixelOffset(R.dimen.dp_6));
            setIndicatorSliderWidth(getResources().getDimensionPixelOffset(R.dimen.dp_6), getResources().getDimensionPixelOffset(R.dimen.dp_6));
            setIndicatorSliderColor(this.mUnSelectedIndicatorColor, this.mSelectedIndicatorColor);
            setOrientation(0);
            setInterval(5500);
            setAdapter(this.mBannerAdAdapter);
            setScrollDuration(1500);
            setOnPageClickListener(this);
            registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.transsnet.adsdk.widgets.banner.BannerAdView.initAdapter.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int state) {
                    if (state == 0) {
                        BannerAdView.this.mManualDrag = false;
                    } else {
                        if (state != 1) {
                            return;
                        }
                        BannerAdView.this.mManualDrag = true;
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int position) {
                    try {
                        if (position >= BannerAdView.this.getMAdData().size()) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        AdEntity adEntity = (AdEntity) BannerAdView.this.getMAdData().get(position);
                        String str = AdManager.get().getApplicationId() + System.currentTimeMillis();
                        String str2 = AdManager.get().getApplicationId() + System.currentTimeMillis();
                        if (BannerAdView.this.mManualDrag) {
                            AdSdkUtils.trackEvent(adEntity.adId, jCurrentTimeMillis, adEntity.adSlotId, EventsConstants.SWITCH_BEGIN, "", String.valueOf(BannerAdView.this.mLocationX), String.valueOf(BannerAdView.this.mLocationX), str, BannerAdView.this.mLastBeginId);
                        } else {
                            AdEvent adEvent = new AdEvent(adEntity.adId, jCurrentTimeMillis, adEntity.adSlotId, EventsConstants.AUTO_BEGIN, "", String.valueOf(BannerAdView.this.mLocationX), String.valueOf(BannerAdView.this.mLocationX), str, BannerAdView.this.mLastBeginId);
                            jCurrentTimeMillis = jCurrentTimeMillis;
                            str = str;
                            BannerAdView.this.addAdEvent(adEvent);
                        }
                        BannerAdView.this.mShowTime = jCurrentTimeMillis;
                        BannerAdView.this.mLastBeginId = str;
                        BannerAdView.this.mLastEndId = str2;
                    } catch (Exception unused) {
                    }
                }
            });
            create(getMAdData());
        }
    }

    private final void initData() {
        int i7;
        if (this.mBannerType == 0) {
            i7 = 1;
        } else {
            setPageMargin(ConvertUtils.dp2px(6.0f));
            i7 = 2;
        }
        this.mNextCount = i7;
        int i10 = this.mDefaultSrc;
        if (i10 != -1) {
            setPlaceHolderImage(i10);
        }
        post(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList mAdData_delegate$lambda$0() {
        return new ArrayList();
    }

    private final void postLoadFailResult() {
        AdSdkUtils.runInMainThread(new p024b9.g(this, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postLoadFailResult$lambda$13(BannerAdView bannerAdView) {
        bannerAdView.setVisibility(8);
        AdSdkUtils.onLoadAdFailed(bannerAdView.getContext(), bannerAdView.adListener);
    }

    public static /* synthetic */ void refreshData$default(BannerAdView bannerAdView, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        bannerAdView.refreshData(z3);
    }

    private final void setDynamicHeight(float width, float height) {
        if (this.mBannerType == 0) {
            return;
        }
        float f10 = 3;
        this.mImgWidth = (width / f10) * Resources.getSystem().getDisplayMetrics().density;
        int width2 = getWidth() > 0 ? getWidth() : AppUtils.getScreenWidth();
        if (width2 == -1) {
            return;
        }
        int iDp2px = this.mBannerType == 0 ? (int) (width2 / (width / height)) : (int) (((height / f10) * Resources.getSystem().getDisplayMetrics().density) + BannerUtils.dp2px(28.0f));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = iDp2px;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showData(List<? extends AdEntity> datas) {
        Collection collectionU;
        float width;
        int iDp2px;
        List<? extends AdEntity> list = datas;
        if (list == null || list.isEmpty()) {
            postLoadFailResult();
            return;
        }
        AdSdkUtils.onLoadAdSuccess(getContext(), this.adListener);
        this.mShowTime = System.currentTimeMillis();
        int i7 = 0;
        AdEntity adEntity = datas.get(0);
        int i10 = this.mHeightMode;
        if ((i10 == Integer.MIN_VALUE || i10 == 0) && !TextUtils.isEmpty(adEntity.imageDimention)) {
            String imageDimention = adEntity.imageDimention;
            Intrinsics.checkNotNullExpressionValue(imageDimention, "imageDimention");
            List listC = new Regex("[*]").c(imageDimention);
            if (!listC.isEmpty()) {
                ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionU = z.f38935a;
                        break;
                    } else if (((String) listIterator.previous()).length() != 0) {
                        collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                collectionU = z.f38935a;
                break;
            }
            String[] strArr = (String[]) collectionU.toArray(new String[0]);
            setDynamicHeight(Float.parseFloat(strArr[0]), Float.parseFloat(strArr[1]));
        }
        if (this.mBannerType == 1 && this.mImgWidth > 0.0f) {
            this.mContentRv.setClipToPadding(false);
            if (getWidth() <= 0) {
                width = AppUtils.getScreenWidth() - this.mImgWidth;
                iDp2px = ConvertUtils.dp2px(14.0f);
            } else {
                width = getWidth() - this.mImgWidth;
                iDp2px = ConvertUtils.dp2px(14.0f);
            }
            this.mContentRv.setPadding(ConvertUtils.dp2px(14.0f), 0, (int) (width - iDp2px), 0);
        }
        Iterator<T> it = datas.iterator();
        while (it.hasNext()) {
            ((AdEntity) it.next()).displayOrder = i7;
            i7++;
        }
        getMAdData().clear();
        getMAdData().addAll(datas);
        refreshData(getMAdData());
    }

    public final void appendExtra(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        getExtras().put(key, value);
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() == 1) {
            this.mLocationX = (int) ev.getRawX();
            this.mLocationY = (int) ev.getRawY();
        }
        return super.dispatchTouchEvent(ev);
    }

    @Nullable
    public final IAdListener getAdListener() {
        return this.adListener;
    }

    @Nullable
    /* JADX INFO: renamed from: getSlotId, reason: from getter */
    public final String getMSlotId() {
        return this.mSlotId;
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.viewScope;
        if (coroutineScope != null) {
            AbstractC0777v.c(coroutineScope, null);
        }
        Job job = this.viewJob;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.viewScope = null;
        this.viewJob = null;
        HashMap<String, AdEvent> map = this.mEvents;
        if (map != null) {
            for (AdEvent adEvent : map.values()) {
                Intrinsics.checkNotNullExpressionValue(adEvent, "next(...)");
                AdSdkUtils.trackEvent(adEvent);
            }
            HashMap<String, AdEvent> map2 = this.mEvents;
            if (map2 != null) {
                map2.clear();
            }
            this.mEvents = null;
        }
        stopLoop();
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager.OnPageClickListener
    public void onPageClick(@NotNull View clickedView, int position) {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        if (position >= getMAdData().size()) {
            return;
        }
        try {
            AdEntity adEntity = getMAdData().get(position);
            AdSdkUtils.onClickAd(getContext(), this.adListener, adEntity);
            AdManager.saveAdClickStatus(adEntity);
            AdSdkUtils.trackEvent(adEntity.adId, System.currentTimeMillis(), adEntity.adSlotId, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdManager.get().getApplicationId() + System.currentTimeMillis(), "");
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0) {
            startLoop();
        } else {
            stopLoop();
        }
    }

    @JvmOverloads
    public final void refreshData() {
        refreshData$default(this, false, 1, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.mSlotId)) {
            return;
        }
        initAdapter();
        CoroutineScope coroutineScope = getCoroutineScope();
        if (coroutineScope != null) {
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new g(this, null), 2);
        }
    }

    public final void setAdListener(@Nullable IAdListener iAdListener) {
        this.adListener = iAdListener;
    }

    public final void setSlotId(@Nullable String str) {
        setSlotId(str, true);
    }

    public final void setUseCoroutine(boolean useCoroutine) {
        this.useCoroutine = useCoroutine;
    }

    public final void switchDarkMode(boolean dark) {
        BannerAdAdapter bannerAdAdapter = this.mBannerAdAdapter;
        if (bannerAdAdapter != null) {
            bannerAdAdapter.switchDarkMode(dark);
        }
        if (AppUtils.isActivityAlive(getContext())) {
            refreshData$default(this, false, 1, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void appendExtra(@NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        getExtras().putAll(extra);
    }

    @JvmOverloads
    public final void refreshData(boolean force) {
        if (force) {
            getMAdData().clear();
        }
        if (getMAdData().isEmpty()) {
            this.mRefresh = true;
            run();
        }
    }

    public final void setSlotId(@Nullable String slotId, boolean loadNow) {
        this.mSlotId = slotId;
        if (loadNow) {
            run();
        }
    }

    public /* synthetic */ BannerAdView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mResult = true;
        this.mAdData = C2131j.b(new p041ce.o(26));
        this.mHeightMode = Integer.MIN_VALUE;
        this.mNoShowList = new ArrayList();
        this.useCoroutine = AdManager.isDebug();
        this.extras = C2131j.b(new p041ce.o(27));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BannerAdView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.mSlotId = typedArrayObtainStyledAttributes.getString(R.styleable.BannerAdView_slot_id);
            this.mUserCache = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BannerAdView_use_cache, true);
            this.mRounderCorner = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BannerAdView_ad_rounded_corners, 0);
            this.mDefaultSrc = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BannerAdView_ad_default_src, -1);
            this.mDefaultDimen = typedArrayObtainStyledAttributes.getString(R.styleable.BannerAdView_ad_default_dimen);
            this.useCoroutine = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BannerAdView_ad_use_coroutine, this.useCoroutine);
            this.mBannerType = typedArrayObtainStyledAttributes.getInt(R.styleable.BannerAdView_ad_banner_type, 0);
            this.mSelectedIndicatorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.BannerAdView_ad_banner_selected_indicator_color, context.getColor(R.color.banner_selected_indicator_color));
            this.mUnSelectedIndicatorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.BannerAdView_ad_banner_unselected_indicator_color, context.getColor(R.color.banner_unselected_indicator_color));
            typedArrayObtainStyledAttributes.recycle();
        }
        initData();
    }
}
