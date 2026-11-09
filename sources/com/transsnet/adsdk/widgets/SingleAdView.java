package com.transsnet.adsdk.widgets;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.C0753a0;
import Wf.I;
import Wf.p0;
import Wf.v0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.AbstractActivityC0822m;
import androidx.lifecycle.V;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.chuanyi.ad.BaseViewGroupManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
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
import com.transsnet.adsdk.interfaces.IBatchAdView;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.adsdk.widgets.jsinterfaces.IJsClickListener;
import com.transsnet.adsdk.widgets.jsinterfaces.JsInterfaces;
import com.transsnet.analysis.contants.EventsConstants;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p015ag.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\b\u0016\u0018\u0000 ¬\u00012\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006:\u0002¬\u0001B%\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J;\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000bH\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020*2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020*H\u0014¢\u0006\u0004\b3\u00102J\u001f\u00106\u001a\u00020*2\b\u00104\u001a\u0004\u0018\u00010\u000f2\u0006\u00105\u001a\u00020\u001a¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020*2\u0006\u0010)\u001a\u00020\u000bH\u0014¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020*2\u0006\u0010:\u001a\u00020\u001a¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020*¢\u0006\u0004\b=\u00102J\u0017\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020*2\u0006\u0010A\u001a\u00020\u001a¢\u0006\u0004\bB\u0010<J\u0017\u0010F\u001a\u00020*2\u0006\u0010C\u001a\u00020\u0011H\u0007¢\u0006\u0004\bD\u0010EJ\u0019\u0010I\u001a\u00020*2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000f0KH\u0016¢\u0006\u0004\bL\u0010MJ\u0011\u0010N\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020*2\u0006\u0010P\u001a\u00020\u001aH\u0016¢\u0006\u0004\bQ\u0010<J\u0011\u0010R\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020*2\u0006\u0010T\u001a\u00020\u001a¢\u0006\u0004\bU\u0010<J\u001d\u0010X\u001a\u00020*2\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u0016¢\u0006\u0004\bX\u0010YJ!\u0010X\u001a\u00020*2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160Z¢\u0006\u0004\bX\u0010\\J\u0011\u0010^\u001a\u0004\u0018\u00010]H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020*H\u0002¢\u0006\u0004\b`\u00102J\u000f\u0010a\u001a\u00020\u001aH\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020*H\u0002¢\u0006\u0004\bc\u00102J\u000f\u0010d\u001a\u00020*H\u0002¢\u0006\u0004\bd\u00102J\u0011\u0010f\u001a\u0004\u0018\u00010eH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020*H\u0002¢\u0006\u0004\bh\u00102J\"\u0010k\u001a\u00020*2\u0010\u0010j\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010G\u0018\u00010iH\u0082@¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020*H\u0002¢\u0006\u0004\bm\u00102J\u000f\u0010n\u001a\u00020*H\u0002¢\u0006\u0004\bn\u00102J\u0019\u0010q\u001a\u00020*2\b\u0010p\u001a\u0004\u0018\u00010oH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020*H\u0002¢\u0006\u0004\bs\u00102J\u000f\u0010t\u001a\u00020*H\u0003¢\u0006\u0004\bt\u00102R\u0018\u0010u\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010}R\u0016\u0010\u007f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R'\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0012\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0004\bF\u0010ER\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010{R\u0019\u0010\u008c\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0089\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0089\u0001R%\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0K8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010MR\u0018\u0010\u0093\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010}R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010}R\u0018\u0010\u0097\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010}R\u0018\u0010\u0098\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010}R\u001a\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009c\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010}R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010T\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010}R\u0018\u0010¢\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010}R-\u0010§\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160£\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0090\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R)\u00104\u001a\u0004\u0018\u00010\u000f2\b\u00104\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\r\u001a\u0005\b¨\u0001\u0010O\"\u0004\b6\u0010@R\u0017\u0010«\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lcom/transsnet/adsdk/widgets/SingleAdView;", "Landroid/widget/FrameLayout;", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "Ljava/lang/Runnable;", "Lcom/transsnet/adsdk/widgets/jsinterfaces/IJsClickListener;", "Lcom/transsnet/adsdk/interfaces/IBatchAdView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "positionId", "Lcom/transsnet/adsdk/interfaces/IAdListener;", "adListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "Lcom/bumptech/glide/load/engine/u;", "e", "", "model", "Lcom/bumptech/glide/request/target/Target;", "target", "", "isFirstResource", "onLoadFailed", "(Lcom/bumptech/glide/load/engine/u;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z", "resource", "Lcom/bumptech/glide/load/a;", "dataSource", "onResourceReady", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/a;Z)Z", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "changedView", "visibility", "", "onVisibilityChanged", "(Landroid/view/View;I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "run", "()V", "onDetachedFromWindow", BaseViewGroupManager.PROP_SLOT_ID, "loadNow", "setSlotId", "(Ljava/lang/String;Z)V", "onWindowVisibilityChanged", "(I)V", "auto", "setAutoRefresh", "(Z)V", "refreshData", "param", "jsOnClickCallback", "(Ljava/lang/String;)V", "dark", "switchDarkMode", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAdListenerInternal", "(Lcom/transsnet/adsdk/interfaces/IAdListener;)V", "setAdListener", "Lcom/transsnet/adsdk/data/bean/resp/AdBean;", "adBean", "refreshAd", "(Lcom/transsnet/adsdk/data/bean/resp/AdBean;)V", "", "getNotShowAdList", "()Ljava/util/List;", "getAdSlotId", "()Ljava/lang/String;", "enable", "markAdBatchPull", "getViewContext", "()Landroid/content/Context;", "useCoroutine", "setUseCoroutine", "key", "value", "appendExtra", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "extra", "(Ljava/util/Map;)V", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "initData", "canUsePreloadDrawable", "()Z", "loadPreloadDrawable", "fetchData", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "fetchDataWithCoroutine", "Lcom/transsnet/adsdk/data/bean/resp/AdCommonResult;", "response", "handleAdData", "(Lcom/transsnet/adsdk/data/bean/resp/AdCommonResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoadFailResult", "showAd", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "entity", "showNativeAd", "(Lcom/transsnet/adsdk/data/local/entity/AdEntity;)V", "showWebViewAd", "setupWebView", "mAdImg", "Landroid/widget/ImageView;", "Landroid/webkit/WebView;", "mWebView", "Landroid/webkit/WebView;", "mSlotId", "Ljava/lang/String;", "bUseCache", "Z", "mPreload", "mExpired", "Lcom/transsnet/adsdk/interfaces/IAdListener;", "getAdListener", "()Lcom/transsnet/adsdk/interfaces/IAdListener;", "mAdData", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "", "mShowTime", "J", "mLocationX", "I", "mLocationY", "mLastBeginId", "mAdType", "mRounderCorner", "mDefaultSrc", "mNoShowList$delegate", "Lkotlin/Lazy;", "getMNoShowList", "mNoShowList", "mRefresh", "mCloseButton", "Landroid/view/View;", "bWindowVisibilityChange", "bAutoRefresh", "bDarkMode", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Landroid/widget/ImageView$ScaleType;", "adjustViewBounds", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "viewJob", "Lkotlinx/coroutines/Job;", "bMarkAsBatch", "", "extras$delegate", "getExtras", "()Ljava/util/Map;", "extras", "getSlotId", "getCloseButton", "()Landroid/view/View;", "closeButton", "Companion", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSingleAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleAdView.kt\ncom/transsnet/adsdk/widgets/SingleAdView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,903:1\n739#2,9:904\n774#2:917\n865#2,2:918\n1869#2,2:920\n37#3:913\n36#3,3:914\n*S KotlinDebug\n*F\n+ 1 SingleAdView.kt\ncom/transsnet/adsdk/widgets/SingleAdView\n*L\n678#1:904,9\n873#1:917\n873#1:918,2\n873#1:920,2\n679#1:913\n679#1:914,3\n*E\n"})
public class SingleAdView extends FrameLayout implements RequestListener<Drawable>, Runnable, IJsClickListener, IBatchAdView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static Map<String, AdEntity> mPreAdEntity;

    @Nullable
    private IAdListener adListener;
    private boolean adjustViewBounds;
    private boolean bAutoRefresh;
    private boolean bDarkMode;
    private boolean bMarkAsBatch;
    private boolean bUseCache;
    private boolean bWindowVisibilityChange;

    /* JADX INFO: renamed from: extras$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extras;

    @Nullable
    private AdEntity mAdData;

    @Nullable
    private ImageView mAdImg;
    private int mAdType;

    @Nullable
    private View mCloseButton;
    private int mDefaultSrc;
    private boolean mExpired;

    @NotNull
    private String mLastBeginId;
    private int mLocationX;
    private int mLocationY;

    /* JADX INFO: renamed from: mNoShowList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNoShowList;
    private boolean mPreload;
    private boolean mRefresh;
    private int mRounderCorner;
    private long mShowTime;

    @Nullable
    private String mSlotId;

    @Nullable
    private WebView mWebView;

    @NotNull
    private ImageView.ScaleType scaleType;
    private boolean useCoroutine;

    @Nullable
    private Job viewJob;

    @Nullable
    private CoroutineScope viewScope;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007R \u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/adsdk/widgets/SingleAdView$Companion;", "", "<init>", "()V", "mPreAdEntity", "", "", "Lcom/transsnet/adsdk/data/local/entity/AdEntity;", "clearPreloadData", "", "addPreloadData", BaseViewGroupManager.PROP_SLOT_ID, "entity", "removePreloadData", "getPreloadData", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void addPreloadData(@Nullable String slotId, @Nullable AdEntity entity) {
            if (SingleAdView.mPreAdEntity == null) {
                SingleAdView.mPreAdEntity = new HashMap();
            }
            Map map = SingleAdView.mPreAdEntity;
            if (map != null) {
            }
        }

        @JvmStatic
        public final void clearPreloadData() {
            Map map = SingleAdView.mPreAdEntity;
            if (map != null) {
                map.clear();
            }
        }

        @JvmStatic
        @Nullable
        public final AdEntity getPreloadData(@Nullable String slotId) {
            Map map = SingleAdView.mPreAdEntity;
            if (map != null) {
                return (AdEntity) map.get(slotId);
            }
            return null;
        }

        @JvmStatic
        public final void removePreloadData(@Nullable String slotId) {
            Map map = SingleAdView.mPreAdEntity;
            if (map != null) {
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_closeButton_$lambda$24(SingleAdView singleAdView, View view) {
        AdSdkUtils.onAdClosed(singleAdView.getContext(), singleAdView.adListener);
        singleAdView.setVisibility(8);
        AdManager.saveAdCloseStatus(singleAdView.mAdData);
        AdEntity adEntity = singleAdView.mAdData;
        AdSdkUtils.trackEvent(adEntity != null ? adEntity.adId : null, singleAdView.mShowTime, adEntity != null ? adEntity.adSlotId : null, EventsConstants.CLICK, "close", String.valueOf(singleAdView.mLocationX), String.valueOf(singleAdView.mLocationY), AdSdkUtils.getBehaviorId(), "");
    }

    @JvmStatic
    public static final void addPreloadData(@Nullable String str, @Nullable AdEntity adEntity) {
        INSTANCE.addPreloadData(str, adEntity);
    }

    private final boolean canUsePreloadDrawable() {
        return (!this.mPreload || TextUtils.isEmpty(this.mSlotId) || INSTANCE.getPreloadData(this.mSlotId) == null) ? false : true;
    }

    @JvmStatic
    public static final void clearPreloadData() {
        INSTANCE.clearPreloadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap extras_delegate$lambda$1() {
        return new HashMap();
    }

    private final void fetchData() {
        ImageView imageView;
        if (this.mAdType == 0 && this.mDefaultSrc != -1 && (imageView = getImageView()) != null) {
            imageView.setImageResource(this.mDefaultSrc);
        }
        if (TextUtils.isEmpty(this.mSlotId)) {
            return;
        }
        if (canUsePreloadDrawable()) {
            loadPreloadDrawable();
            return;
        }
        this.mExpired = this.mRefresh ? true : AdSdkUtils.checkAdExpired(this.mSlotId);
        if (getVisibility() == 0) {
            setVisibility(0);
        }
        C1755g c1755g = new C1755g(new c(this), 0);
        df.i iVar = p298tf.f.f42628a;
        final int i7 = 1;
        C1765q c1765qI = new C1760l(new C1760l(c1755g.k(iVar), new com.google.firebase.crashlytics.internal.concurrency.b(new com.facebook.react.packagerconnection.a(3), 15), 1), new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleAdView f25614b;

            {
                this.f25614b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return Boolean.valueOf(SingleAdView.fetchData$lambda$10(this.f25614b, (Boolean) obj));
                    case 1:
                        return SingleAdView.fetchData$lambda$6(this.f25614b, (Boolean) obj);
                    default:
                        return SingleAdView.fetchData$lambda$8(this.f25614b, ((Boolean) obj).booleanValue());
                }
            }
        }, 16), 2).i(p071ef.b.a());
        final int i10 = 2;
        C1760l c1760l = new C1760l(c1765qI, new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleAdView f25614b;

            {
                this.f25614b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(SingleAdView.fetchData$lambda$10(this.f25614b, (Boolean) obj));
                    case 1:
                        return SingleAdView.fetchData$lambda$6(this.f25614b, (Boolean) obj);
                    default:
                        return SingleAdView.fetchData$lambda$8(this.f25614b, ((Boolean) obj).booleanValue());
                }
            }
        }, 13), 2);
        final int i11 = 0;
        new C1760l(new C1760l(new C1760l(c1760l, new com.google.firebase.crashlytics.internal.concurrency.b(new Function1(this) { // from class: com.transsnet.adsdk.widgets.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleAdView f25614b;

            {
                this.f25614b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(SingleAdView.fetchData$lambda$10(this.f25614b, (Boolean) obj));
                    case 1:
                        return SingleAdView.fetchData$lambda$6(this.f25614b, (Boolean) obj);
                    default:
                        return SingleAdView.fetchData$lambda$8(this.f25614b, ((Boolean) obj).booleanValue());
                }
            }
        }, 14), 1).i(iVar).f(new c(this)), new SingleAdFunction(this.mSlotId, new c(this)), 2), new SingleAdPredicate(new c(this)), 1).i(p071ef.b.a()).subscribe(new AdCommonObserver<AdEntity>(getContext(), this.adListener) { // from class: com.transsnet.adsdk.widgets.SingleAdView.fetchData.9
            @Override // com.transsnet.adsdk.data.network.INetResult
            public void onSuccess(AdEntity data) {
                Intrinsics.checkNotNullParameter(data, "data");
                SingleAdView.this.mAdData = data;
                SingleAdView.this.showAd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$10(SingleAdView singleAdView, Boolean bool) {
        return singleAdView.mExpired;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$11(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((Boolean) function1.invoke(p3)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource fetchData$lambda$12(SingleAdView singleAdView, Boolean bool) {
        AdReq commonAdReq = ReqUtil.getCommonAdReq(singleAdView.mSlotId, singleAdView.getMNoShowList(), singleAdView.getExtras());
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$14(SingleAdView singleAdView, boolean z3) {
        new Handler(Looper.getMainLooper()).post(new a(singleAdView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$16(SingleAdView singleAdView, boolean z3, AdEntity newEntity) {
        Intrinsics.checkNotNullParameter(newEntity, "newEntity");
        if (!z3) {
            new Handler(Looper.getMainLooper()).post(new a(singleAdView, 1));
        }
        AdDao adDao = AdDatabase.getInstance(singleAdView.getContext()).adDao();
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
            newEntity.closeCount = adEntityQueryByAdId.closeCount;
        }
        newEntity.updateTime = System.currentTimeMillis();
        newEntity.curEnable = 1;
        adDao.update(newEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchData$lambda$3(SingleAdView singleAdView, ObservableEmitter emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        if (!singleAdView.mPreload || INSTANCE.getPreloadData(singleAdView.mSlotId) == null) {
            emitter.onNext(Boolean.TRUE);
        } else {
            emitter.onNext(Boolean.FALSE);
        }
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$4(Boolean bool) {
        Intrinsics.e(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchData$lambda$5(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((Boolean) function1.invoke(p3)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$6(SingleAdView singleAdView, Boolean bool) {
        List<AdEntity> listQueryAllIdBySlotIdLimitCount = d0.h().queryAllIdBySlotIdLimitCount(singleAdView.mSlotId, AdManager.get().getCountryCode(), 10);
        singleAdView.getMNoShowList().clear();
        for (AdEntity adEntity : listQueryAllIdBySlotIdLimitCount) {
            if (!AdManager.checkShowAd(adEntity)) {
                List<String> mNoShowList = singleAdView.getMNoShowList();
                String adId = adEntity.adId;
                Intrinsics.checkNotNullExpressionValue(adId, "adId");
                mNoShowList.add(adId);
            }
        }
        if (singleAdView.mExpired || !singleAdView.bUseCache) {
            d0.h().disableAllData(singleAdView.mSlotId);
            return Boolean.FALSE;
        }
        if (listQueryAllIdBySlotIdLimitCount.size() != 0) {
            AdEntity adEntity2 = listQueryAllIdBySlotIdLimitCount.get(0);
            singleAdView.mAdData = adEntity2;
            return Boolean.valueOf(AdManager.checkShowAd(adEntity2));
        }
        singleAdView.mExpired = true;
        d0.h().disableAllData(singleAdView.mSlotId);
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$7(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Boolean) function1.invoke(p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$8(SingleAdView singleAdView, boolean z3) {
        if (z3) {
            singleAdView.showAd();
        }
        return Boolean.valueOf(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean fetchData$lambda$9(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Boolean) function1.invoke(p3);
    }

    private final void fetchDataWithCoroutine() {
        ImageView imageView;
        if (this.mAdType == 0 && this.mDefaultSrc != -1 && (imageView = getImageView()) != null) {
            imageView.setImageResource(this.mDefaultSrc);
        }
        if (TextUtils.isEmpty(this.mSlotId)) {
            return;
        }
        if (canUsePreloadDrawable()) {
            loadPreloadDrawable();
            return;
        }
        CoroutineScope coroutineScope = getCoroutineScope();
        if (coroutineScope != null) {
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new g(this, null), 2);
        }
    }

    private final View getCloseButton() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        int iDp2px = ConvertUtils.dp2px(8.0f);
        imageView.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        imageView.setImageResource(R.drawable.lib_ad_btn_close);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        imageView.setOnClickListener(new d(this, 0));
        addView(imageView, layoutParams);
        return imageView;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getExtras() {
        return (Map) this.extras.getValue();
    }

    private final ImageView getImageView() {
        ImageView imageView;
        String str;
        if (this.mAdImg == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.mAdImg = imageView2;
            if (AdManager.isDebug() && (imageView = this.mAdImg) != null) {
                AdEntity adEntity = this.mAdData;
                if (adEntity == null || (str = adEntity.adSlotId) == null) {
                    str = "";
                }
                imageView.setContentDescription("SingleAd-".concat(str));
            }
            imageView2.setScaleType(this.scaleType);
            imageView2.setAdjustViewBounds(this.adjustViewBounds);
            imageView2.setOnClickListener(new d(this, 1));
            addView(imageView2, new FrameLayout.LayoutParams(-1, -2));
        }
        return this.mAdImg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getImageView$lambda$2(SingleAdView singleAdView, View view) {
        AdSdkUtils.onClickAd(singleAdView.getContext(), singleAdView.adListener, singleAdView.mAdData);
        AdManager.saveAdClickStatus(singleAdView.mAdData);
        AdEntity adEntity = singleAdView.mAdData;
        AdSdkUtils.trackEvent(adEntity != null ? adEntity.adId : null, singleAdView.mShowTime, adEntity != null ? adEntity.adSlotId : null, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(singleAdView.mLocationX), String.valueOf(singleAdView.mLocationY), AdSdkUtils.getBehaviorId(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getMNoShowList() {
        return (List) this.mNoShowList.getValue();
    }

    @JvmStatic
    @Nullable
    public static final AdEntity getPreloadData(@Nullable String str) {
        return INSTANCE.getPreloadData(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        if (Wf.AbstractC0780y.s(r10, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        if (Wf.AbstractC0780y.s(r10, r11, r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleAdData(com.transsnet.adsdk.data.bean.resp.AdCommonResult<com.transsnet.adsdk.data.bean.resp.AdBean> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.SingleAdView.handleAdData(com.transsnet.adsdk.data.bean.resp.AdCommonResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void initData() {
        if (canUsePreloadDrawable()) {
            loadPreloadDrawable();
        }
        if (TextUtils.isEmpty(this.mSlotId) || canUsePreloadDrawable()) {
            return;
        }
        post(this);
    }

    private final void loadPreloadDrawable() {
        AdEntity preloadData = INSTANCE.getPreloadData(this.mSlotId);
        this.mAdData = preloadData;
        showNativeAd(preloadData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mNoShowList_delegate$lambda$0() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postLoadFailResult() {
        setVisibility(8);
        AdSdkUtils.onLoadAdFailed(getContext(), this.adListener);
    }

    @JvmStatic
    public static final void removePreloadData(@Nullable String str) {
        INSTANCE.removePreloadData(str);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void setupWebView() {
        WebSettings settings;
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.setLayerType(2, null);
        }
        WebView webView2 = this.mWebView;
        if (webView2 != null && (settings = webView2.getSettings()) != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView3 = this.mWebView;
        if (webView3 != null) {
            webView3.addJavascriptInterface(new JsInterfaces(this), "interstitialAd");
        }
        WebView webView4 = this.mWebView;
        if (webView4 != null) {
            webView4.setWebViewClient(new WebViewClient() { // from class: com.transsnet.adsdk.widgets.SingleAdView.setupWebView.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(url, "url");
                    return super.shouldOverrideUrlLoading(view, url);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(request, "request");
                    return super.shouldOverrideUrlLoading(view, request);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd() {
        if (AppUtils.isActivityAlive(getContext())) {
            if (this.mAdType == 0) {
                showNativeAd(this.mAdData);
            } else {
                showWebViewAd();
            }
        }
    }

    private final void showNativeAd(AdEntity entity) {
        G1.d dVar;
        G1.d dVar2;
        if (entity == null) {
            return;
        }
        boolean z3 = false;
        setVisibility(0);
        int i7 = this.mRounderCorner;
        com.bumptech.glide.load.b bVar = com.bumptech.glide.load.b.f20515b;
        if (i7 > 0) {
            G1.a aVarM = ((G1.d) new G1.d().I(new z(this.mRounderCorner), true)).m(bVar);
            Intrinsics.e(aVarM);
            dVar = (G1.d) aVarM;
        } else {
            G1.a aVarM2 = new G1.d().m(bVar);
            Intrinsics.e(aVarM2);
            dVar = (G1.d) aVarM2;
        }
        if (entity.showCloseButton == 1) {
            if (this.mCloseButton == null) {
                this.mCloseButton = getCloseButton();
            }
            View view = this.mCloseButton;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View view2 = this.mCloseButton;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        String str = entity.imageUrl;
        if (this.bDarkMode && !TextUtils.isEmpty(entity.imageUrlDark)) {
            str = entity.imageUrlDark;
        }
        ImageView imageView = getImageView();
        if (imageView != null) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                G1.a aVarW = dVar.w(width, height);
                Intrinsics.e(aVarW);
                dVar2 = (G1.d) aVarW;
            } else if (width > 0) {
                G1.a aVarW2 = dVar.w(width, Integer.MIN_VALUE);
                Intrinsics.e(aVarW2);
                dVar2 = (G1.d) aVarW2;
            } else if (height > 0) {
                G1.a aVarW3 = dVar.w(Integer.MIN_VALUE, height);
                Intrinsics.e(aVarW3);
                dVar2 = (G1.d) aVarW3;
            } else {
                G1.a aVarW4 = dVar.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
                Intrinsics.e(aVarW4);
                dVar2 = (G1.d) aVarW4;
            }
            if (this.bDarkMode && TextUtils.isEmpty(entity.imageUrlDark) && AdSdkUtils.isInDarkMode(imageView)) {
                z3 = true;
            }
            if (AdManager.isDebug()) {
                imageView.setTag(R.id.ad_image_url, str);
            }
            if (z3) {
                imageView.setAlpha((entity.getAlpha() * 1.0f) / 255.0f);
            } else {
                imageView.setAlpha(1.0f);
            }
            ((com.bumptech.glide.m) com.bumptech.glide.b.f(imageView).load(str).a(dVar2).g(com.bumptech.glide.load.engine.k.f20703b)).N(this).S(imageView);
        }
    }

    private final void showWebViewAd() {
        String str;
        WebView webView;
        AdEntity adEntity;
        String str2;
        String str3;
        List listC;
        Collection collectionU;
        String[] strArr;
        if (this.mWebView == null) {
            this.mWebView = new WebView(AdManager.get().getApp());
            setupWebView();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AdEntity adEntity2 = this.mAdData;
            if (TextUtils.isEmpty(adEntity2 != null ? adEntity2.imageDimention : null) || (adEntity = this.mAdData) == null || (str2 = adEntity.imageDimention) == null || !StringsKt.A(str2, "*", false)) {
                layoutParams.width = ConvertUtils.dp2px(240.0f);
                layoutParams.height = ConvertUtils.dp2px(120.0f);
            } else {
                AdEntity adEntity3 = this.mAdData;
                if (adEntity3 != null && (str3 = adEntity3.imageDimention) != null && (listC = new Regex("[*]").c(str3)) != null) {
                    if (!listC.isEmpty()) {
                        ListIterator listIterator = listC.listIterator(listC.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                collectionU = kotlin.collections.z.f38935a;
                                break;
                            } else if (((String) listIterator.previous()).length() != 0) {
                                collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    } else {
                        collectionU = kotlin.collections.z.f38935a;
                        break;
                    }
                    if (collectionU != null && (strArr = (String[]) collectionU.toArray(new String[0])) != null) {
                        if (strArr.length < 2) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            layoutParams.width = Integer.parseInt(strArr[0]);
                            layoutParams.height = Integer.parseInt(strArr[1]);
                        }
                    }
                }
            }
            setLayoutParams(layoutParams);
            addView(this.mWebView);
        }
        AdEntity adEntity4 = this.mAdData;
        if (adEntity4 != null && (str = adEntity4.imageUrl) != null && (webView = this.mWebView) != null) {
            webView.loadUrl(str);
        }
        AdSdkUtils.onLoadAdSuccess(getContext(), this.adListener);
        this.mShowTime = System.currentTimeMillis();
        AdManager.saveAdShowStatusBackground(this.mAdData, true);
        String behaviorId = AdSdkUtils.getBehaviorId();
        AdEntity adEntity5 = this.mAdData;
        String str4 = adEntity5 != null ? adEntity5.adId : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdEntity adEntity6 = this.mAdData;
        AdSdkUtils.trackEvent(str4, jCurrentTimeMillis, adEntity6 != null ? adEntity6.adSlotId : null, EventsConstants.AUTO_BEGIN, "", "", "", behaviorId, this.mLastBeginId);
    }

    public final void appendExtra(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        getExtras().put(key, value);
    }

    @Nullable
    public final IAdListener getAdListener() {
        return this.adListener;
    }

    @Override // com.transsnet.adsdk.interfaces.IBatchAdView
    @Nullable
    /* JADX INFO: renamed from: getAdSlotId, reason: from getter */
    public String getMSlotId() {
        return this.mSlotId;
    }

    @Override // com.transsnet.adsdk.interfaces.IBatchAdView
    @NotNull
    public List<String> getNotShowAdList() {
        List<AdEntity> listQueryBySlotIdLimitCount = d0.h().queryBySlotIdLimitCount(this.mSlotId, AdManager.get().getCountryCode(), 10);
        getMNoShowList().clear();
        Intrinsics.e(listQueryBySlotIdLimitCount);
        ArrayList<AdEntity> arrayList = new ArrayList();
        for (Object obj : listQueryBySlotIdLimitCount) {
            if (!AdManager.checkShowAd((AdEntity) obj)) {
                arrayList.add(obj);
            }
        }
        for (AdEntity adEntity : arrayList) {
            if (!TextUtils.isEmpty(adEntity.adId)) {
                List<String> mNoShowList = getMNoShowList();
                String adId = adEntity.adId;
                Intrinsics.checkNotNullExpressionValue(adId, "adId");
                mNoShowList.add(adId);
            }
        }
        return getMNoShowList();
    }

    @Nullable
    public final String getSlotId() {
        return this.mSlotId;
    }

    @Override // com.transsnet.adsdk.interfaces.IBatchAdView
    @Nullable
    public Context getViewContext() {
        return getContext();
    }

    @Override // com.transsnet.adsdk.widgets.jsinterfaces.IJsClickListener
    public void jsOnClickCallback(@NotNull String param) {
        AdEntity adEntity;
        Intrinsics.checkNotNullParameter(param, "param");
        try {
            JSONObject jSONObject = new JSONObject(param);
            String strOptString = jSONObject.optString("jumpType");
            String strOptString2 = jSONObject.optString("jumpPath");
            String strOptString3 = jSONObject.optString("jumpParams");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                AdEntity adEntity2 = this.mAdData;
                AdSdkUtils.trackEvent(adEntity2 != null ? adEntity2.adId : null, this.mShowTime, adEntity2 != null ? adEntity2.adSlotId : null, EventsConstants.CLICK, "close", String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
                return;
            }
            AdEntity adEntity3 = this.mAdData;
            if (adEntity3 != null) {
                adEntity3.jumpType = strOptString;
            }
            if (adEntity3 != null) {
                adEntity3.relativeUrl = strOptString2;
            }
            if (!TextUtils.isEmpty(strOptString3) && (adEntity = this.mAdData) != null) {
                adEntity.jumpParams = strOptString3;
            }
            AdSdkUtils.onClickAd(getContext(), this.adListener, this.mAdData);
            AdManager.saveAdClickStatus(this.mAdData);
            AdEntity adEntity4 = this.mAdData;
            AdSdkUtils.trackEvent(adEntity4 != null ? adEntity4.adId : null, this.mShowTime, adEntity4 != null ? adEntity4.adSlotId : null, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IBatchAdView
    public void markAdBatchPull(boolean enable) {
        this.bMarkAsBatch = enable;
    }

    @Override // android.view.ViewGroup, android.view.View
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
        ImageView imageView = this.mAdImg;
        if (imageView != null) {
            if (AdSdkUtils.isValidGlideContext(getContext())) {
                p pVarF = com.bumptech.glide.b.f(imageView);
                pVarF.getClass();
                pVarF.e(new n(imageView));
            }
            imageView.setImageDrawable(null);
        }
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable u e10, @Nullable Object model, @NotNull Target<Drawable> target, boolean isFirstResource) {
        Intrinsics.checkNotNullParameter(target, "target");
        AdSdkUtils.onLoadAdFailed(getContext(), this.adListener);
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.mAdImg != null) {
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            if (this.mAdType == 0 && mode == 1073741824) {
                ImageView imageView = this.mAdImg;
                ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = -1;
                ImageView imageView2 = this.mAdImg;
                if (imageView2 != null) {
                    imageView2.setLayoutParams(layoutParams2);
                }
            }
        }
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

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        AdEntity adEntity = this.mAdData;
        if (adEntity != null) {
            if (TextUtils.isEmpty(adEntity != null ? adEntity.adId : null)) {
                return;
            }
            String behaviorId = AdSdkUtils.getBehaviorId();
            if (visibility == 0) {
                AdEntity adEntity2 = this.mAdData;
                String str = adEntity2 != null ? adEntity2.adId : null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                AdEntity adEntity3 = this.mAdData;
                AdSdkUtils.trackEvent(str, jCurrentTimeMillis, adEntity3 != null ? adEntity3.adSlotId : null, EventsConstants.AUTO_BEGIN, "", "", "", behaviorId, this.mLastBeginId);
            }
            Intrinsics.e(behaviorId);
            this.mLastBeginId = behaviorId;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (this.bAutoRefresh) {
            if (visibility == 8) {
                this.bWindowVisibilityChange = true;
            } else if (visibility == 0 && this.bWindowVisibilityChange) {
                this.bWindowVisibilityChange = false;
                refreshData();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.adsdk.interfaces.IBatchAdView
    public void refreshAd(@Nullable AdBean adBean) {
        if (adBean == 0) {
            CoroutineScope coroutineScope = getCoroutineScope();
            if (coroutineScope != null) {
                p042cg.f fVar = I.f10809a;
                AbstractC0780y.m(coroutineScope, o.f11960a, null, new l(this, null), 2);
                return;
            }
            return;
        }
        AdCommonResult adCommonResult = new AdCommonResult();
        adCommonResult.respCode = "00000000";
        adCommonResult.respMsg = "success";
        adCommonResult.data = adBean;
        CoroutineScope coroutineScope2 = getCoroutineScope();
        if (coroutineScope2 != null) {
            p042cg.f fVar2 = I.f10809a;
            AbstractC0780y.m(coroutineScope2, p042cg.e.f19009c, null, new m(this, adCommonResult, null), 2);
        }
    }

    public final void refreshData() {
        this.mRefresh = true;
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.bMarkAsBatch || this.mRefresh) {
            if (this.useCoroutine) {
                fetchDataWithCoroutine();
            } else {
                fetchData();
            }
        }
    }

    public final void setAdListener(@Nullable IAdListener iAdListener) {
        this.adListener = iAdListener;
    }

    @JvmName(name = "setAdListenerInternal")
    public final void setAdListenerInternal(@NotNull IAdListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.adListener = listener;
    }

    public final void setAutoRefresh(boolean auto) {
        this.bAutoRefresh = auto;
    }

    public final void setSlotId(@Nullable String str) {
        setSlotId(str, true);
    }

    public final void setUseCoroutine(boolean useCoroutine) {
        this.useCoroutine = useCoroutine;
    }

    public final void switchDarkMode(boolean dark) {
        this.bDarkMode = dark;
        if (AppUtils.isActivityAlive(getContext()) && this.mAdType == 0) {
            showNativeAd(this.mAdData);
        }
    }

    public /* synthetic */ SingleAdView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    public final void appendExtra(@NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        getExtras().putAll(extra);
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(@NotNull Drawable resource, @NotNull Object model, @Nullable Target<Drawable> target, @NotNull com.bumptech.glide.load.a dataSource, boolean isFirstResource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        AdSdkUtils.onLoadAdSuccess(getContext(), this.adListener);
        this.mShowTime = System.currentTimeMillis();
        AdManager.saveAdShowStatusBackground(this.mAdData, true);
        String behaviorId = AdSdkUtils.getBehaviorId();
        AdEntity adEntity = this.mAdData;
        String str = adEntity != null ? adEntity.adId : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdEntity adEntity2 = this.mAdData;
        AdSdkUtils.trackEvent(str, jCurrentTimeMillis, adEntity2 != null ? adEntity2.adSlotId : null, EventsConstants.AUTO_BEGIN, "", "", "", behaviorId, this.mLastBeginId);
        return false;
    }

    public final void setSlotId(@Nullable String slotId, boolean loadNow) {
        this.mSlotId = slotId;
        if (loadNow) {
            run();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mAdData = new AdEntity();
        this.mLastBeginId = "";
        this.mNoShowList = C2131j.b(new p041ce.o(24));
        this.bAutoRefresh = true;
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.scaleType = ImageView.ScaleType.FIT_CENTER;
        this.useCoroutine = true;
        this.extras = C2131j.b(new p041ce.o(25));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SingleAdView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.mSlotId = typedArrayObtainStyledAttributes.getString(R.styleable.SingleAdView_slot_id);
            this.bUseCache = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SingleAdView_use_cache, true);
            this.mPreload = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SingleAdView_preload, false);
            this.useCoroutine = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SingleAdView_ad_use_coroutine, this.useCoroutine);
            this.mAdType = typedArrayObtainStyledAttributes.getInt(R.styleable.SingleAdView_ad_type, 0);
            this.mRounderCorner = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SingleAdView_ad_rounded_corners, 0);
            this.adjustViewBounds = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SingleAdView_android_adjustViewBounds, false);
            this.scaleType = ImageView.ScaleType.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.SingleAdView_android_scaleType, 3)];
            this.mDefaultSrc = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SingleAdView_ad_default_src, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        initData();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleAdView(@NotNull Context context, @Nullable String str, @Nullable IAdListener iAdListener) {
        this(context, null, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mSlotId = str;
        this.adListener = iAdListener;
    }
}
