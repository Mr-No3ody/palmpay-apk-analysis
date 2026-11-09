package com.transsnet.analysis.utils;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.v0;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.camera.core.impl.utils.executor.g;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.reflect.TypeToken;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.analysis.AnalysisManager;
import com.transsnet.analysis.BuildConfig;
import com.transsnet.analysis.data.bean.req.AnalysisBody;
import com.transsnet.analysis.data.bean.req.AnalysisReq;
import com.transsnet.analysis.data.bean.req.AnalysisReqDetail;
import com.transsnet.analysis.data.bean.resp.AnalysisCommonResult;
import com.transsnet.analysis.data.local.entity.EventsEntity;
import com.transsnet.analysis.data.network.AnalysisApi;
import com.transsnet.analysis.data.network.AnalysisApiService;
import com.transsnet.analysis.data.network.SignatureUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.f;
import p322v8.a;
import p322v8.b;
import p322v8.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0084\u0001\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\"\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0007H\u0007J(\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010 J,\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0083@¢\u0006\u0002\u0010%J\u001a\u0010&\u001a\u0004\u0018\u00010$2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002J\b\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/transsnet/analysis/utils/AnalysisEventUtils;", "", "<init>", "()V", "TAG", "", "MAX_UPLOAD_COUNT", "", "mLastUploadTime", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "uploadMutex", "Lkotlinx/coroutines/sync/Mutex;", "track", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "merchantId", "key", "adId", "adShowTime", "adSlotId", "eventType", "eventSubType", "pointWindowX", "pointWindowY", "behaviorId", "relatedId", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "uploadAnalysisEvent", "type", "uploadAnalysisEventInternal", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendData", "Lcom/transsnet/analysis/data/bean/resp/AnalysisCommonResult;", "req", "Lcom/transsnet/analysis/data/bean/req/AnalysisReq;", "(Lcom/transsnet/analysis/data/bean/req/AnalysisReq;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildAnalysisReq", "", "Lcom/transsnet/analysis/data/local/entity/EventsEntity;", "checkOkToUploadEvent", "", "analysisSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalysisEventUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalysisEventUtils.kt\ncom/transsnet/analysis/utils/AnalysisEventUtils\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n120#2,10:172\n*S KotlinDebug\n*F\n+ 1 AnalysisEventUtils.kt\ncom/transsnet/analysis/utils/AnalysisEventUtils\n*L\n97#1:172,10\n*E\n"})
public final class AnalysisEventUtils {

    @NotNull
    public static final AnalysisEventUtils INSTANCE = new AnalysisEventUtils();
    private static final int MAX_UPLOAD_COUNT = 50;

    @NotNull
    private static final String TAG = "AnalysisEventUtils";
    private static long mLastUploadTime;

    @NotNull
    private static final CoroutineScope scope;

    @NotNull
    private static final Mutex uploadMutex;

    static {
        v0 v0VarC = AbstractC0780y.c();
        f fVar = I.f10809a;
        scope = AbstractC0777v.a(e.c(v0VarC, p042cg.e.f19009c));
        uploadMutex = new p072eg.e();
    }

    private AnalysisEventUtils() {
    }

    private final AnalysisReq buildAnalysisReq(List<? extends EventsEntity> sendData) {
        List<? extends EventsEntity> list = sendData;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Type type = new TypeToken<AnalysisReqDetail<AnalysisBody>>() { // from class: com.transsnet.analysis.utils.AnalysisEventUtils$buildAnalysisReq$jsonType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        AnalysisReq analysisReq = new AnalysisReq();
        ArrayList arrayList = new ArrayList();
        Iterator<? extends EventsEntity> it = sendData.iterator();
        while (it.hasNext()) {
            AnalysisReqDetail analysisReqDetail = (AnalysisReqDetail) GsonUtil.get().fromJson(it.next().data, type);
            if (analysisReqDetail != null) {
                arrayList.add(analysisReqDetail);
            }
        }
        analysisReq.requestTime = System.currentTimeMillis();
        analysisReq.bizInfo = GsonUtil.get().toJson(arrayList);
        return analysisReq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkOkToUploadEvent() {
        if (AnalysisUtils.isConnected(AnalysisManager.getContext())) {
            return System.currentTimeMillis() > (BuildConfig.analyReleaseUrl.equals(AnalysisManager.getBaseUrl()) ? AnalysisManager.get().getUploadEventDuration() : DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) + mLastUploadTime;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @WorkerThread
    public final Object sendData(AnalysisReq analysisReq, String str, String str2, Continuation<? super AnalysisCommonResult> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i7 = aVar.f43096c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f43096c = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f43094a;
        Ef.a aVar3 = Ef.a.f2423a;
        int i10 = aVar2.f43096c;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
                return obj;
            }
            g.M(obj);
            if (analysisReq == null) {
                return null;
            }
            analysisReq.nonceStr = StringUtil.createRandomString(8);
            analysisReq.version = BuildConfig.VERSION_NAME;
            AnalysisApiService service = AnalysisApi.getInstance().getService();
            String countryCode = AnalysisManager.getCountryCode();
            aVar2.f43096c = 1;
            Object objSendData = service.sendData(countryCode, SignatureUtils.getSignatureHeader(AnalysisUtils.json2QueryString(analysisReq), str2), "Bearer " + str, analysisReq, aVar2);
            return objSendData == aVar3 ? aVar3 : objSendData;
        } catch (Exception e10) {
            Log.e(TAG, "sendData: ", e10);
            return null;
        }
    }

    @JvmStatic
    public static final void track(@Nullable String appId, @NotNull String merchantId, @Nullable String key, @Nullable String adId, long adShowTime, @Nullable String adSlotId, @Nullable String eventType, @Nullable String eventSubType, @Nullable String pointWindowX, @Nullable String pointWindowY, @Nullable String behaviorId, @Nullable String relatedId, int count) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        AbstractC0780y.m(scope, null, null, new b(merchantId, key, appId, behaviorId, adId, adSlotId, adShowTime, eventType, eventSubType, pointWindowX, pointWindowY, relatedId, count, null), 3);
    }

    @JvmStatic
    public static final void uploadAnalysisEvent(@NotNull String merchantId, @Nullable String key, int type) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        mLastUploadTime = System.currentTimeMillis();
        AbstractC0780y.m(scope, null, null, new c(type, merchantId, key, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0088 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:29:0x00ac, B:31:0x00b0, B:33:0x00b6, B:36:0x00c0, B:26:0x0088, B:37:0x00c3, B:24:0x006e), top: B:42:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (r15 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a9 -> B:29:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadAnalysisEventInternal(java.lang.String r12, java.lang.String r13, int r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.analysis.utils.AnalysisEventUtils.uploadAnalysisEventInternal(java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
