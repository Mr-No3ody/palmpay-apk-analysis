package p322v8;

import Ef.a;
import Ff.h;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.analysis.data.bean.req.AnalysisBody;
import com.transsnet.analysis.data.bean.req.AnalysisReqDetail;
import com.transsnet.analysis.data.bean.req.CommonReqHead;
import com.transsnet.analysis.data.bean.req.CommonReqUtil;
import com.transsnet.analysis.utils.AnalysisEventUtils;
import com.transsnet.analysis.utils.AnalysisUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f43101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f43102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f43103g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f43104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f43105j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f43106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f43107p;
    public final /* synthetic */ String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f43108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f43109w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, String str3, String str4, String str5, String str6, long j6, String str7, String str8, String str9, String str10, String str11, int i7, Continuation continuation) {
        super(2, continuation);
        this.f43098b = str;
        this.f43099c = str2;
        this.f43100d = str3;
        this.f43101e = str4;
        this.f43102f = str5;
        this.f43103g = str6;
        this.f43104i = j6;
        this.f43105j = str7;
        this.f43106o = str8;
        this.f43107p = str9;
        this.t = str10;
        this.f43108v = str11;
        this.f43109w = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f43098b, this.f43099c, this.f43100d, this.f43101e, this.f43102f, this.f43103g, this.f43104i, this.f43105j, this.f43106o, this.f43107p, this.t, this.f43108v, this.f43109w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.transsnet.analysis.data.bean.req.AnalysisBody] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f43097a;
        try {
            if (i7 == 0) {
                g.M(obj);
                AnalysisReqDetail analysisReqDetail = new AnalysisReqDetail();
                String str = this.f43100d;
                String str2 = this.f43101e;
                String str3 = this.f43102f;
                String str4 = this.f43103g;
                long j6 = this.f43104i;
                String str5 = this.f43105j;
                String str6 = this.f43106o;
                String str7 = this.f43107p;
                String str8 = this.t;
                String str9 = this.f43108v;
                int i10 = this.f43109w;
                CommonReqHead commonHead = CommonReqUtil.getCommonHead(str);
                commonHead.behaviorId = str2;
                analysisReqDetail.head = commonHead;
                ?? reqBody = CommonReqUtil.getReqBody();
                reqBody.adId = str3;
                reqBody.adSlotId = str4;
                reqBody.adTime = j6;
                reqBody.eventType = str5;
                reqBody.eventSubType = str6;
                reqBody.pointWindowX = str7;
                reqBody.pointWindowY = str8;
                reqBody.relatedId = str9;
                reqBody.num = i10;
                analysisReqDetail.body = reqBody;
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(((AnalysisBody) analysisReqDetail.body).eventType)) {
                    AnalysisUtils.saveEventToDB(analysisReqDetail, 0);
                }
                AnalysisEventUtils analysisEventUtils = AnalysisEventUtils.INSTANCE;
                if (analysisEventUtils.checkOkToUploadEvent()) {
                    AnalysisEventUtils.mLastUploadTime = System.currentTimeMillis();
                    String str10 = this.f43098b;
                    String str11 = this.f43099c;
                    this.f43097a = 1;
                    if (analysisEventUtils.uploadAnalysisEventInternal(str10, str11, 0, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
        } catch (Exception e10) {
            Log.e("AnalysisEventUtils", "track: ", e10);
        }
        return Unit.f38893a;
    }
}
