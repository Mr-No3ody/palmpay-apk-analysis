package com.transsnet.adsdk;

import Ff.h;
import android.text.TextUtils;
import android.view.View;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.bean.req.BatchAd;
import com.transsnet.adsdk.data.bean.resp.AdBean;
import com.transsnet.adsdk.data.bean.resp.AdCommonResult;
import com.transsnet.adsdk.data.network.AdApi;
import com.transsnet.adsdk.data.network.AdApiService;
import com.transsnet.adsdk.data.network.ReqUtil;
import com.transsnet.adsdk.interfaces.IBatchAdView;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f25571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f25573c = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f25573c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        HashMap map;
        IBatchAdView iBatchAdView;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f25572b;
        try {
            if (i7 == 0) {
                g.M(obj);
                ArrayList arrayList = new ArrayList();
                HashMap map2 = new HashMap();
                for (WeakReference weakReference : this.f25573c) {
                    IBatchAdView iBatchAdView2 = (IBatchAdView) weakReference.get();
                    if (iBatchAdView2 instanceof View) {
                        BatchAd batchAd = new BatchAd();
                        String mSlotId = iBatchAdView2.getMSlotId();
                        if (!TextUtils.isEmpty(mSlotId)) {
                            batchAd.adSlotId = mSlotId;
                            batchAd.notShowAdIds = iBatchAdView2.getNotShowAdList();
                            arrayList.add(batchAd);
                            map2.put(mSlotId, weakReference);
                        }
                    }
                }
                AdReq batchAdReq = ReqUtil.getBatchAdReq(arrayList);
                String signatureHeader = AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(batchAdReq));
                AdApiService service = AdApi.getInstance().getService();
                this.f25571a = map2;
                this.f25572b = 1;
                obj = service.batchPullAd(signatureHeader, batchAdReq, this);
                if (obj == aVar) {
                    return aVar;
                }
                map = map2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = this.f25571a;
                g.M(obj);
            }
            AdCommonResult adCommonResult = (AdCommonResult) obj;
            if (adCommonResult == null || !adCommonResult.isSuccess()) {
                Set setEntrySet = map.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    IBatchAdView iBatchAdView3 = (IBatchAdView) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (iBatchAdView3 != null) {
                        iBatchAdView3.refreshAd(null);
                    }
                }
            } else {
                List<AdBean> list = (List) adCommonResult.data;
                if (list != null) {
                    for (AdBean adBean : list) {
                        WeakReference weakReference2 = (WeakReference) map.get(adBean.adSlotId);
                        if (weakReference2 != null && (iBatchAdView = (IBatchAdView) weakReference2.get()) != null) {
                            iBatchAdView.refreshAd(adBean);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }
}
