package com.transsnet.adsdk;

import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.AbstractActivityC0822m;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.transsnet.adsdk.interfaces.IBatchAdView;
import com.transsnet.analysis.utils.StringUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041ce.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\tJ%\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u001a\"\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001bJ-\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u001a\"\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0006\u0010!\u001a\u00020\u0015Ro\u0010\u0004\u001aV\u0012\u0004\u0012\u00020\u0006\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\n0\u0005j*\u0012\u0004\u0012\u00020\u0006\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\n`\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lcom/transsnet/adsdk/BatchAdManager;", "", "<init>", "()V", "batchMap", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/transsnet/adsdk/interfaces/IBatchAdView;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "getBatchMap", "()Ljava/util/HashMap;", "batchMap$delegate", "Lkotlin/Lazy;", "getCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "appendBatchAd", "", "key", "view", "addBatchAd", "views", "", "([Lcom/transsnet/adsdk/interfaces/IBatchAdView;)Ljava/lang/String;", "loadNow", "", "(Z[Lcom/transsnet/adsdk/interfaces/IBatchAdView;)Ljava/lang/String;", "removeBatchAd", "refreshBatchAd", "clearAllBatchAd", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBatchAdManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchAdManager.kt\ncom/transsnet/adsdk/BatchAdManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,146:1\n13472#2,2:147\n*S KotlinDebug\n*F\n+ 1 BatchAdManager.kt\ncom/transsnet/adsdk/BatchAdManager\n*L\n55#1:147,2\n*E\n"})
public final class BatchAdManager {

    @NotNull
    public static final BatchAdManager INSTANCE = new BatchAdManager();

    /* JADX INFO: renamed from: batchMap$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy batchMap = C2131j.b(new o(21));

    private BatchAdManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap batchMap_delegate$lambda$0() {
        return new HashMap();
    }

    private final HashMap<String, ArrayList<WeakReference<IBatchAdView>>> getBatchMap() {
        return (HashMap) batchMap.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CoroutineScope getCoroutineScope(Context context) {
        try {
            if (context instanceof AbstractActivityC0822m) {
                return V.f((LifecycleOwner) context);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final String addBatchAd(@NotNull IBatchAdView... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        return addBatchAd(false, (IBatchAdView[]) Arrays.copyOf(views, views.length));
    }

    public final void appendBatchAd(@Nullable String key, @Nullable IBatchAdView view) {
        ArrayList<WeakReference<IBatchAdView>> arrayList;
        if (key == null || (arrayList = INSTANCE.getBatchMap().get(key)) == null || arrayList.isEmpty()) {
            return;
        }
        if (view != null) {
            view.markAdBatchPull(true);
        }
        arrayList.add(new WeakReference<>(view));
    }

    public final void clearAllBatchAd() {
        getBatchMap().clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshBatchAd(@Nullable String key) {
        ArrayList<WeakReference<IBatchAdView>> arrayList;
        CoroutineScope coroutineScope;
        if (TextUtils.isEmpty(key) || (arrayList = getBatchMap().get(key)) == null || arrayList.isEmpty()) {
            return;
        }
        Iterator<WeakReference<IBatchAdView>> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        Context context = null;
        while (it.hasNext()) {
            WeakReference<IBatchAdView> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            IBatchAdView iBatchAdView = next.get();
            if ((iBatchAdView != 0 ? iBatchAdView.getViewContext() : null) != null) {
                context = iBatchAdView.getViewContext();
            } else if (iBatchAdView instanceof View) {
                context = ((View) iBatchAdView).getContext();
            }
            if (context != null) {
                break;
            }
        }
        if (context == null || (coroutineScope = INSTANCE.getCoroutineScope(context)) == null) {
            return;
        }
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new e(arrayList, null), 2);
    }

    public final void removeBatchAd(@Nullable String key) {
        K.c(getBatchMap()).remove(key);
    }

    @Nullable
    public final String addBatchAd(boolean loadNow, @NotNull IBatchAdView... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        StringBuilder sb2 = new StringBuilder();
        ArrayList<WeakReference<IBatchAdView>> arrayList = new ArrayList<>();
        int length = views.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            IBatchAdView iBatchAdView = views[i7];
            String mSlotId = iBatchAdView != null ? iBatchAdView.getMSlotId() : null;
            if (!TextUtils.isEmpty(mSlotId)) {
                sb2.append(mSlotId);
                if (iBatchAdView != null) {
                    iBatchAdView.markAdBatchPull(true);
                }
                arrayList.add(new WeakReference<>(iBatchAdView));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strEncryptMD5String = StringUtil.encryptMD5String(sb2.toString());
        getBatchMap().put(strEncryptMD5String, arrayList);
        if (loadNow) {
            refreshBatchAd(strEncryptMD5String);
        }
        return strEncryptMD5String;
    }
}
