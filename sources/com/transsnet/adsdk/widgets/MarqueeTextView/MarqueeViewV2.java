package com.transsnet.adsdk.widgets.MarqueeTextView;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import Wf.v0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.AbstractActivityC0822m;
import androidx.lifecycle.V;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.m;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.chuanyi.ad.BaseViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.bean.resp.AdBean;
import com.transsnet.adsdk.data.bean.resp.AdCommonResult;
import com.transsnet.adsdk.data.local.dao.AdDao;
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
import com.transsnet.analysis.contants.EventsConstants;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B%\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0018\u0010\u0014J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001d\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010&\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030#2\u0006\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010'JA\u0010+\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0010\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010#2\u0006\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001b¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001b2\u0006\u00101\u001a\u000200H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u001b¢\u0006\u0004\b9\u0010/J\u0017\u0010:\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b:\u0010;J)\u0010<\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010\fJ\u0010\u0010=\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b=\u0010>J\"\u0010B\u001a\u00020\u00122\u0010\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010@\u0018\u00010?H\u0082@¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001bH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0012H\u0002¢\u0006\u0004\bF\u0010\u0014J\u000f\u0010G\u001a\u00020\u0012H\u0002¢\u0006\u0004\bG\u0010\u0014J\u0017\u0010J\u001a\u00020\u00122\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010L\u001a\u00020\u0012H\u0002¢\u0006\u0004\bL\u0010\u0014J\u0011\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010S\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010QR\u0016\u0010f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010QR\u0014\u0010g\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bg\u0010XR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\r0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u00108\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010ZR(\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\b\u001d\u0010\u0017R\u0014\u0010u\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010E¨\u0006v"}, d2 = {"Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeViewV2;", "Landroid/widget/LinearLayout;", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "positionId", "Lcom/transsnet/adsdk/interfaces/IAdListener;", "adListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "", "loadAdData", "()V", "textContent", "setContent", "(Ljava/lang/String;)V", "onDetachedFromWindow", "release", BaseViewGroupManager.PROP_SLOT_ID, "", "loadNow", "setSlotId", "(Ljava/lang/String;Z)V", "Lcom/bumptech/glide/load/engine/u;", "e", "", "model", "Lcom/bumptech/glide/request/target/Target;", "target", "isFirstResource", "onLoadFailed", "(Lcom/bumptech/glide/load/engine/u;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z", "resource", "Lcom/bumptech/glide/load/a;", "dataSource", "onResourceReady", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/a;Z)Z", "dark", "switchDarkMode", "(Z)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "useCoroutine", "setUseCoroutine", "initView", "(Landroid/content/Context;)V", "initAttrs", "fetchDataWithCoroutine", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/transsnet/adsdk/data/bean/resp/AdCommonResult;", "Lcom/transsnet/adsdk/data/bean/resp/AdBean;", "result", "handleData", "(Lcom/transsnet/adsdk/data/bean/resp/AdCommonResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCache", "()Z", "fetchData", "postFailResult", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "newEntity", "updateDatabase", "(Lcom/transsnet/adsdk/data/local/entity/AdEntity;)V", "saveAnalysisData", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "mDrawablePadding", "I", "mTextSize", "mTextColor", "Landroid/graphics/Typeface;", "typeface", "Landroid/graphics/Typeface;", "mSlotId", "Ljava/lang/String;", "mExpired", "Z", "Lcom/transsnet/adsdk/interfaces/IAdListener;", "getAdListener", "()Lcom/transsnet/adsdk/interfaces/IAdListener;", "setAdListener", "(Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "mAdData", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "", "mShowTime", "J", "mLocationX", "mLocationY", "mLastBeginId", "", "mNoShowList", "Ljava/util/List;", "Landroid/widget/ImageView;", "iv_ad_marquee_start_icon", "Landroid/widget/ImageView;", "Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeTextView;", "tv_marquee", "Lcom/transsnet/adsdk/widgets/MarqueeTextView/MarqueeTextView;", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "getSlotId", "()Ljava/lang/String;", "isDark", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MarqueeViewV2 extends LinearLayout implements RequestListener<Drawable>, View.OnClickListener {

    @Nullable
    private IAdListener adListener;

    @Nullable
    private ImageView iv_ad_marquee_start_icon;

    @Nullable
    private AdEntity mAdData;
    private int mDrawablePadding;
    private boolean mExpired;

    @NotNull
    private final String mLastBeginId;
    private int mLocationX;
    private int mLocationY;

    @NotNull
    private final List<String> mNoShowList;
    private long mShowTime;

    @Nullable
    private String mSlotId;
    private final int mTextColor;
    private int mTextSize;

    @Nullable
    private MarqueeTextView tv_marquee;

    @Nullable
    private Typeface typeface;
    private boolean useCoroutine;

    @Nullable
    private CoroutineScope viewScope;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarqueeViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean checkCache() {
        this.mNoShowList.clear();
        if (this.mExpired) {
            d0.h().disableAllData(this.mSlotId);
            return false;
        }
        List<AdEntity> listQueryBySlotIdLimitCount = d0.h().queryBySlotIdLimitCount(this.mSlotId, AdManager.get().getCountryCode(), 1);
        Intrinsics.e(listQueryBySlotIdLimitCount);
        if (listQueryBySlotIdLimitCount.isEmpty()) {
            this.mExpired = true;
            d0.h().disableAllData(this.mSlotId);
            return false;
        }
        AdEntity adEntity = listQueryBySlotIdLimitCount.get(0);
        this.mAdData = adEntity;
        return AdManager.checkShowAd(adEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchData() {
        C1755g c1755g = new C1755g(new com.palmpay.lib.bridgewrapper.photo.upload.a(13), 0);
        df.i iVar = p298tf.f.f42628a;
        final int i7 = 0;
        C1765q c1765qI = new C1760l(new C1760l(c1755g.k(iVar), new com.google.firebase.crashlytics.internal.concurrency.b(new com.facebook.react.packagerconnection.a(2), 10), 1), new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.MarqueeTextView.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarqueeViewV2 f25600b;

            {
                this.f25600b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return MarqueeViewV2.fetchData$lambda$5(this.f25600b, (Boolean) obj);
                    case 1:
                        return MarqueeViewV2.fetchData$lambda$7(this.f25600b, ((Boolean) obj).booleanValue());
                    default:
                        return Boolean.valueOf(MarqueeViewV2.fetchData$lambda$9(this.f25600b, (Boolean) obj));
                }
            }
        }, 11), 2).i(p071ef.b.a());
        final int i10 = 1;
        C1760l c1760l = new C1760l(c1765qI, new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.MarqueeTextView.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarqueeViewV2 f25600b;

            {
                this.f25600b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return MarqueeViewV2.fetchData$lambda$5(this.f25600b, (Boolean) obj);
                    case 1:
                        return MarqueeViewV2.fetchData$lambda$7(this.f25600b, ((Boolean) obj).booleanValue());
                    default:
                        return Boolean.valueOf(MarqueeViewV2.fetchData$lambda$9(this.f25600b, (Boolean) obj));
                }
            }
        }, 12), 2);
        final int i11 = 2;
        new C1760l(new C1760l(new C1760l(c1760l, new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.MarqueeTextView.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarqueeViewV2 f25600b;

            {
                this.f25600b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return MarqueeViewV2.fetchData$lambda$5(this.f25600b, (Boolean) obj);
                    case 1:
                        return MarqueeViewV2.fetchData$lambda$7(this.f25600b, ((Boolean) obj).booleanValue());
                    default:
                        return Boolean.valueOf(MarqueeViewV2.fetchData$lambda$9(this.f25600b, (Boolean) obj));
                }
            }
        }, 9), 1).i(iVar).f(new d(this)), new SingleAdFunction(this.mSlotId, new d(this)), 2), new SingleAdPredicate(new d(this)), 1).i(p071ef.b.a()).subscribe(new AdCommonObserver<AdEntity>(getContext(), this.adListener) { // from class: com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2.fetchData.9
            @Override // com.transsnet.adsdk.data.network.INetResult
            public void onSuccess(AdEntity data) {
                MarqueeViewV2.this.mAdData = data;
                if (AppUtils.isActivityAlive(MarqueeViewV2.this.getContext())) {
                    MarqueeViewV2.this.setContent();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$10(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((Boolean) function1.invoke(p3)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource fetchData$lambda$11(MarqueeViewV2 marqueeViewV2, Boolean bool) {
        AdReq commonAdReq = ReqUtil.getCommonAdReq(marqueeViewV2.mSlotId, marqueeViewV2.mNoShowList);
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$13(MarqueeViewV2 marqueeViewV2, boolean z3, AdEntity newEntity) {
        Intrinsics.checkNotNullParameter(newEntity, "newEntity");
        if (!z3) {
            marqueeViewV2.postFailResult();
        }
        marqueeViewV2.updateDatabase(newEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$2(ObservableEmitter emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        emitter.onNext(Boolean.TRUE);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$3(Boolean bool) {
        Intrinsics.e(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$4(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((Boolean) function1.invoke(p3)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$5(MarqueeViewV2 marqueeViewV2, Boolean bool) {
        marqueeViewV2.mNoShowList.clear();
        if (marqueeViewV2.mExpired) {
            d0.h().disableAllData(marqueeViewV2.mSlotId);
            return Boolean.FALSE;
        }
        List<AdEntity> listQueryBySlotIdLimitCount = d0.h().queryBySlotIdLimitCount(marqueeViewV2.mSlotId, AdManager.get().getCountryCode(), 1);
        if (listQueryBySlotIdLimitCount.size() != 0) {
            AdEntity adEntity = listQueryBySlotIdLimitCount.get(0);
            marqueeViewV2.mAdData = adEntity;
            return Boolean.valueOf(AdManager.checkShowAd(adEntity));
        }
        marqueeViewV2.mExpired = true;
        d0.h().disableAllData(marqueeViewV2.mSlotId);
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$6(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Boolean) function1.invoke(p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$7(MarqueeViewV2 marqueeViewV2, boolean z3) {
        if (z3 && AppUtils.isActivityAlive(marqueeViewV2.getContext())) {
            marqueeViewV2.setContent();
        }
        return Boolean.valueOf(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$8(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Boolean) function1.invoke(p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$9(MarqueeViewV2 marqueeViewV2, Boolean bool) {
        return marqueeViewV2.mExpired;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (handleData((com.transsnet.adsdk.data.bean.resp.AdCommonResult) r7, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchDataWithCoroutine(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.transsnet.adsdk.widgets.MarqueeTextView.f
            if (r0 == 0) goto L13
            r0 = r7
            com.transsnet.adsdk.widgets.MarqueeTextView.f r0 = (com.transsnet.adsdk.widgets.MarqueeTextView.f) r0
            int r1 = r0.f25603c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25603c = r1
            goto L18
        L13:
            com.transsnet.adsdk.widgets.MarqueeTextView.f r0 = new com.transsnet.adsdk.widgets.MarqueeTextView.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f25601a
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f25603c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L96
            goto L99
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L96
            goto L8b
        L39:
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L96
            goto L63
        L3d:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            boolean r7 = r6.checkCache()     // Catch: java.lang.Exception -> L96
            if (r7 == 0) goto L66
            android.content.Context r7 = r6.getContext()     // Catch: java.lang.Exception -> L96
            boolean r7 = com.transsnet.adsdk.utils.AppUtils.isActivityAlive(r7)     // Catch: java.lang.Exception -> L96
            if (r7 == 0) goto L66
            cg.f r7 = Wf.I.f10809a     // Catch: java.lang.Exception -> L96
            Wf.p0 r7 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L96
            com.transsnet.adsdk.widgets.MarqueeTextView.g r2 = new com.transsnet.adsdk.widgets.MarqueeTextView.g     // Catch: java.lang.Exception -> L96
            r3 = 0
            r2.<init>(r6, r3)     // Catch: java.lang.Exception -> L96
            r0.f25603c = r5     // Catch: java.lang.Exception -> L96
            java.lang.Object r7 = Wf.AbstractC0780y.s(r7, r2, r0)     // Catch: java.lang.Exception -> L96
            if (r7 != r1) goto L63
            goto L95
        L63:
            kotlin.Unit r7 = kotlin.Unit.f38893a     // Catch: java.lang.Exception -> L96
            return r7
        L66:
            boolean r7 = r6.mExpired     // Catch: java.lang.Exception -> L96
            if (r7 == 0) goto L99
            java.lang.String r7 = r6.mSlotId     // Catch: java.lang.Exception -> L96
            java.util.List<java.lang.String> r2 = r6.mNoShowList     // Catch: java.lang.Exception -> L96
            com.transsnet.adsdk.data.bean.req.AdReq r7 = com.transsnet.adsdk.data.network.ReqUtil.getCommonAdReq(r7, r2)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = com.transsnet.adsdk.utils.ConvertUtils.json2QueryString(r7)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = com.transsnet.adsdk.utils.AdSdkUtils.getSignatureHeader(r2)     // Catch: java.lang.Exception -> L96
            com.transsnet.adsdk.data.network.AdApi r5 = com.transsnet.adsdk.data.network.AdApi.getInstance()     // Catch: java.lang.Exception -> L96
            com.transsnet.adsdk.data.network.AdApiService r5 = r5.getService()     // Catch: java.lang.Exception -> L96
            r0.f25603c = r4     // Catch: java.lang.Exception -> L96
            java.lang.Object r7 = r5.getAdData2(r2, r7, r0)     // Catch: java.lang.Exception -> L96
            if (r7 != r1) goto L8b
            goto L95
        L8b:
            com.transsnet.adsdk.data.bean.resp.AdCommonResult r7 = (com.transsnet.adsdk.data.bean.resp.AdCommonResult) r7     // Catch: java.lang.Exception -> L96
            r0.f25603c = r3     // Catch: java.lang.Exception -> L96
            java.lang.Object r7 = r6.handleData(r7, r0)     // Catch: java.lang.Exception -> L96
            if (r7 != r1) goto L99
        L95:
            return r1
        L96:
            r6.postFailResult()
        L99:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2.fetchDataWithCoroutine(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final CoroutineScope getCoroutineScope() {
        try {
            if (getContext() instanceof AbstractActivityC0822m) {
                Context context = getContext();
                Intrinsics.f(context, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
                return V.f((AbstractActivityC0822m) context);
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
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleData(AdCommonResult<AdBean> adCommonResult, Continuation<? super Unit> continuation) {
        h hVar;
        AdEntity adEntityApply2;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i7 = hVar.f25607c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                hVar.f25607c = i7 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, continuation);
            }
        } else {
            hVar = new h(this, continuation);
        }
        Object obj = hVar.f25605a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = hVar.f25607c;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                if (adCommonResult == null || adCommonResult.data == null || (adEntityApply2 = new SingleAdFunction(this.mSlotId).apply(adCommonResult)) == null || TextUtils.isEmpty(adEntityApply2.adSlotId)) {
                    postFailResult();
                } else {
                    updateDatabase(adEntityApply2);
                    this.mAdData = adEntityApply2;
                    p042cg.f fVar = I.f10809a;
                    p0 p0Var = o.f11960a;
                    i iVar = new i(this, null);
                    hVar.f25607c = 1;
                    if (AbstractC0780y.s(p0Var, iVar, hVar) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
        } catch (Exception unused) {
            postFailResult();
        }
        return Unit.f38893a;
    }

    private final void initAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        MarqueeTextView marqueeTextView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.MarqueeViewV2, defStyleAttr, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mSlotId = typedArrayObtainStyledAttributes.getString(R.styleable.MarqueeViewV2_slot_id);
        this.useCoroutine = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MarqueeViewV2_ad_use_coroutine, this.useCoroutine);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeViewV2_ad_drawable_padding)) {
            this.mDrawablePadding = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.MarqueeViewV2_ad_drawable_padding, context.getResources().getDimensionPixelSize(R.dimen.dp_6));
            ImageView imageView = this.iv_ad_marquee_start_icon;
            ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(this.mDrawablePadding);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeViewV2_ad_text_size)) {
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.MarqueeViewV2_ad_text_size, context.getResources().getDimensionPixelSize(R.dimen.dp_12));
            this.mTextSize = dimension;
            MarqueeTextView marqueeTextView2 = this.tv_marquee;
            if (marqueeTextView2 != null) {
                marqueeTextView2.setTextSize(0, dimension);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeViewV2_ad_text_color)) {
            int color = typedArrayObtainStyledAttributes.getColor(R.styleable.MarqueeViewV2_ad_text_color, this.mTextColor);
            MarqueeTextView marqueeTextView3 = this.tv_marquee;
            if (marqueeTextView3 != null) {
                marqueeTextView3.setTextColor(color);
            }
        } else if (isDark()) {
            MarqueeTextView marqueeTextView4 = this.tv_marquee;
            if (marqueeTextView4 != null) {
                marqueeTextView4.setTextColor(-1);
            }
        } else {
            MarqueeTextView marqueeTextView5 = this.tv_marquee;
            if (marqueeTextView5 != null) {
                marqueeTextView5.setTextColor(this.mTextColor);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeViewV2_ad_font)) {
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MarqueeViewV2_ad_font, 0);
                if (resourceId != 0) {
                    this.typeface = Y.j.a(resourceId, context);
                }
                Typeface typeface = this.typeface;
                if (typeface != null && (marqueeTextView = this.tv_marquee) != null) {
                    marqueeTextView.setTypeface(typeface);
                }
            } catch (Exception unused) {
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.lib_ad_single_text_ad_layout, (ViewGroup) this, true);
        this.iv_ad_marquee_start_icon = (ImageView) findViewById(R.id.iv_ad_marquee_start_icon);
        this.tv_marquee = (MarqueeTextView) findViewById(R.id.tv_marquee);
        setOrientation(0);
        setGravity(16);
        if (getBackground() == null) {
            setBackground(getContext().getDrawable(R.drawable.lib_ad_marquee_txt_bg));
            if (getPaddingLeft() == 0 && getPaddingRight() == 0) {
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp_12);
                setPadding(dimensionPixelOffset, getPaddingTop(), dimensionPixelOffset, getPaddingBottom());
            }
        }
        setOnClickListener(this);
    }

    private final boolean isDark() {
        return AdSdkUtils.isInDarkMode(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postFailResult() {
        AdSdkUtils.runInMainThread(new p024b9.g(this, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFailResult$lambda$14(MarqueeViewV2 marqueeViewV2) {
        marqueeViewV2.setVisibility(8);
        AdSdkUtils.onLoadAdFailed(marqueeViewV2.getContext(), marqueeViewV2.adListener);
    }

    private final void saveAnalysisData() {
        AdSdkUtils.onLoadAdSuccess(getContext(), this.adListener);
        this.mShowTime = System.currentTimeMillis();
        AdManager.saveAdShowStatusBackground(this.mAdData, true);
        String behaviorId = AdSdkUtils.getBehaviorId();
        AdEntity adEntity = this.mAdData;
        String str = adEntity != null ? adEntity.adId : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdEntity adEntity2 = this.mAdData;
        AdSdkUtils.trackEvent(str, jCurrentTimeMillis, adEntity2 != null ? adEntity2.adSlotId : null, EventsConstants.AUTO_BEGIN, "", "", "", behaviorId, this.mLastBeginId);
    }

    private final void updateDatabase(AdEntity newEntity) {
        AdDao adDao = AdDatabase.getInstance(getContext()).adDao();
        AdEntity adEntityQueryByAdId = adDao.queryByAdId(newEntity.adId);
        if (adEntityQueryByAdId == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            newEntity.createTime = jCurrentTimeMillis;
            newEntity.updateTime = jCurrentTimeMillis;
            newEntity.curEnable = 1;
            adDao.insert(newEntity);
            return;
        }
        if (Intrinsics.c(adEntityQueryByAdId.adId, newEntity.adId)) {
            newEntity.showDate = adEntityQueryByAdId.showDate;
            newEntity.hasShowTimes = adEntityQueryByAdId.hasShowTimes;
            newEntity.clickDate = adEntityQueryByAdId.clickDate;
            newEntity.createTime = adEntityQueryByAdId.createTime;
        }
        newEntity.updateTime = System.currentTimeMillis();
        newEntity.curEnable = 1;
        adDao.update(newEntity);
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

    public final void loadAdData() {
        if (TextUtils.isEmpty(this.mSlotId)) {
            setVisibility(8);
            return;
        }
        CoroutineScope coroutineScope = getCoroutineScope();
        if (coroutineScope != null) {
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new j(this, null), 2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        AdEntity adEntity = this.mAdData;
        if ("04".equals(adEntity != null ? adEntity.jumpType : null)) {
            Context context = getContext();
            AdEntity adEntity2 = this.mAdData;
            new ShowTextDialog(context, adEntity2 != null ? adEntity2.textContent : null).show();
        } else {
            AdSdkUtils.onClickAd(getContext(), this.adListener, this.mAdData);
            AdManager.saveAdClickStatus(this.mAdData);
            AdEntity adEntity3 = this.mAdData;
            AdSdkUtils.trackEvent(adEntity3 != null ? adEntity3.adId : null, this.mShowTime, adEntity3 != null ? adEntity3.adSlotId : null, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        MarqueeTextView marqueeTextView = this.tv_marquee;
        if (marqueeTextView != null) {
            marqueeTextView.stopAnim();
        }
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.viewScope;
        if (coroutineScope != null) {
            AbstractC0777v.c(coroutineScope, null);
        }
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable u e10, @Nullable Object model, @NotNull Target<Drawable> target, boolean isFirstResource) {
        Intrinsics.checkNotNullParameter(target, "target");
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.mLocationX = (int) event.getRawX();
            this.mLocationY = (int) event.getRawY();
        }
        return super.onTouchEvent(event);
    }

    public final void release() {
        MarqueeTextView marqueeTextView = this.tv_marquee;
        if (marqueeTextView != null) {
            marqueeTextView.releaseAnim();
        }
        this.adListener = null;
    }

    public final void setAdListener(@Nullable IAdListener iAdListener) {
        this.adListener = iAdListener;
    }

    public final void setContent(@Nullable String textContent) {
        setVisibility(0);
        MarqueeTextView marqueeTextView = this.tv_marquee;
        if (marqueeTextView != null) {
            marqueeTextView.setText(textContent);
        }
    }

    public final void setSlotId(@Nullable String str) {
        setSlotId(str, true);
    }

    public final void setUseCoroutine(boolean useCoroutine) {
        this.useCoroutine = useCoroutine;
    }

    public final void switchDarkMode(boolean dark) {
        setContent();
    }

    public /* synthetic */ MarqueeViewV2(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(@NotNull Drawable resource, @NotNull Object model, @Nullable Target<Drawable> target, @NotNull com.bumptech.glide.load.a dataSource, boolean isFirstResource) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        if (!AdSdkUtils.isValidGlideContext(getContext()) || (imageView = this.iv_ad_marquee_start_icon) == null) {
            return true;
        }
        imageView.setImageDrawable(resource);
        return true;
    }

    public final void setSlotId(@Nullable String slotId, boolean loadNow) {
        this.mSlotId = slotId;
        if (loadNow) {
            loadAdData();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarqueeViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDrawablePadding = 6;
        this.mTextSize = 14;
        this.mTextColor = -16777216;
        this.mAdData = new AdEntity();
        this.mLastBeginId = "";
        this.mNoShowList = new ArrayList();
        this.useCoroutine = AdManager.isDebug();
        initView(context);
        initAttrs(context, attributeSet, i7);
        loadAdData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContent() {
        MarqueeTextView marqueeTextView;
        MarqueeTextView marqueeTextView2;
        String str;
        if (this.mAdData == null || !AppUtils.isActivityAlive(getContext())) {
            return;
        }
        setVisibility(0);
        try {
            AdEntity adEntity = this.mAdData;
            if (!TextUtils.isEmpty(adEntity != null ? adEntity.textFontSize : null) && (marqueeTextView2 = this.tv_marquee) != null) {
                AdEntity adEntity2 = this.mAdData;
                marqueeTextView2.setTextSize(2, (adEntity2 == null || (str = adEntity2.textFontSize) == null) ? 16 : Integer.parseInt(str));
            }
        } catch (Exception unused) {
        }
        AdEntity adEntity3 = this.mAdData;
        String str2 = adEntity3 != null ? adEntity3.textFontColor : null;
        if (isDark()) {
            AdEntity adEntity4 = this.mAdData;
            if (!TextUtils.isEmpty(adEntity4 != null ? adEntity4.textFontColorDark : null)) {
                AdEntity adEntity5 = this.mAdData;
                str2 = adEntity5 != null ? adEntity5.textFontColorDark : null;
            }
        }
        try {
            if (!TextUtils.isEmpty(str2) && (marqueeTextView = this.tv_marquee) != null) {
                marqueeTextView.setTextColor(Color.parseColor(str2));
            }
        } catch (Exception unused2) {
        }
        AdEntity adEntity6 = this.mAdData;
        String str3 = adEntity6 != null ? adEntity6.backgroundColor : null;
        if (isDark()) {
            AdEntity adEntity7 = this.mAdData;
            if (!TextUtils.isEmpty(adEntity7 != null ? adEntity7.backgroundColorDark : null)) {
                AdEntity adEntity8 = this.mAdData;
                str3 = adEntity8 != null ? adEntity8.backgroundColorDark : null;
            }
        }
        try {
            if (!TextUtils.isEmpty(str3)) {
                setBackgroundColor(Color.parseColor(str3));
            }
        } catch (Exception unused3) {
        }
        AdEntity adEntity9 = this.mAdData;
        String str4 = adEntity9 != null ? adEntity9.textIconUrl : null;
        if (isDark()) {
            AdEntity adEntity10 = this.mAdData;
            if (!TextUtils.isEmpty(adEntity10 != null ? adEntity10.textIconUrlDark : null)) {
                AdEntity adEntity11 = this.mAdData;
                str4 = adEntity11 != null ? adEntity11.textIconUrlDark : null;
            }
        }
        MarqueeTextView marqueeTextView3 = this.tv_marquee;
        if (marqueeTextView3 != null) {
            AdEntity adEntity12 = this.mAdData;
            marqueeTextView3.setText(adEntity12 != null ? adEntity12.textContent : null);
        }
        if (!TextUtils.isEmpty(str4)) {
            m mVarN = ((m) com.bumptech.glide.b.e(getContext()).load(str4).w(ConvertUtils.dp2px(16.0f), ConvertUtils.dp2px(16.0f))).N(this);
            mVarN.getClass();
            mVarN.T(new H1.j(mVarN.f21022k0), null, mVarN, J1.g.f4461a);
        } else {
            ImageView imageView = this.iv_ad_marquee_start_icon;
            if (imageView != null) {
                com.bumptech.glide.b.f(imageView).load(Integer.valueOf(R.drawable.lib_ad_marquee_txt_start_icon));
            }
        }
        saveAnalysisData();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarqueeViewV2(@NotNull Context context, @Nullable String str, @Nullable IAdListener iAdListener) {
        this(context, null, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mSlotId = str;
        this.adListener = iAdListener;
    }
}
