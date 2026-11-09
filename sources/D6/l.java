package D6;

import Ab.B;
import N8.q0;
import Wf.AbstractC0780y;
import Wf.I;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.CheckRequest;
import com.palmpay.lib.liveness.model.CheckResponse;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.model.UploadRequestV2;
import com.palmpay.lib.liveness.net.LiveApi;
import com.palmpay.lib.liveness.net.UploadApi;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.result.LiveSelfieResult;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.g0;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f1664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f1666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1667g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1668i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(File file, String str, m mVar, String str2, int i7, Continuation continuation) {
        super(2, continuation);
        this.f1664d = file;
        this.f1665e = str;
        this.f1666f = mVar;
        this.f1667g = str2;
        this.f1668i = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f1664d, this.f1665e, this.f1666f, this.f1667g, this.f1668i, continuation);
        lVar.f1663c = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:40:0x012f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x017f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0185  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:53:0x018e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bb  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        long j6;
        CheckRequest checkRequest;
        Object objC;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        long jCurrentTimeMillis;
        Object objCheck;
        long j10;
        CheckResponse checkResponse;
        String respCode;
        String str;
        String respMsg;
        File file;
        g0 g0Var;
        Object value;
        g0 g0Var2;
        Object value2;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1662b;
        m mVar = this.f1666f;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            coroutineScope = (CoroutineScope) this.f1663c;
            UploadRequestV2 uploadRequestV2 = new UploadRequestV2(this.f1664d);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            p pVar = p.f41234a;
            UploadApi uploadApiH = p.h();
            this.f1663c = coroutineScope;
            this.f1661a = jCurrentTimeMillis2;
            this.f1662b = 1;
            if (uploadApiH.uploadV2(this.f1665e, uploadRequestV2, this) != aVar) {
                j6 = jCurrentTimeMillis2;
            }
            return aVar;
        }
        if (i7 == 1) {
            j6 = this.f1661a;
            coroutineScope = (CoroutineScope) this.f1663c;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        } else {
            if (i7 == 2) {
                CheckRequest checkRequest2 = (CheckRequest) this.f1663c;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                checkRequest = checkRequest2;
                objC = obj;
                if (((Boolean) objC).booleanValue()) {
                    checkRequest.setSystemType(1);
                }
                p pVar2 = p.f41234a;
                checkRequest.setDeviceFingerprint(p.d());
                jCurrentTimeMillis = System.currentTimeMillis();
                p pVar3 = p.f41234a;
                LiveApi liveApiE = p.e();
                this.f1663c = null;
                this.f1661a = jCurrentTimeMillis;
                this.f1662b = 3;
                objCheck = liveApiE.check("/api/validator/liveness/checkV2", checkRequest, this);
                if (objCheck != aVar) {
                    j10 = jCurrentTimeMillis;
                }
                return aVar;
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f1661a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            objCheck = obj;
        }
        checkResponse = (CheckResponse) objCheck;
        int i10 = p292t6.a.f42345a;
        p292t6.a.a("check cost : " + (System.currentTimeMillis() - j10) + "ms");
        if (androidx.camera.core.impl.utils.executor.g.A(checkResponse)) {
            mVar.f1683v = new LiveIDResult.Success(new LiveSelfieResult(checkResponse));
            do {
                g0Var2 = mVar.f1682p;
                value2 = g0Var2.getValue();
            } while (!g0Var2.compareAndSet(value2, i.a((i) value2, null, 0.0f, null, null, g.f1636b, null, null, HomeDialogState.PRIORITY_HIGHEST_111)));
        } else {
            respCode = checkResponse.getRespCode();
            if (respCode == null) {
                str = "";
            } else {
                str = respCode;
            }
            respMsg = checkResponse.getRespMsg();
            if (respMsg == null) {
                respMsg = "Unknown Error";
            }
            mVar.f1683v = new LiveIDResult.Error(new LiveIDException(str, q0.l(respMsg, "[", str, "]"), null, checkResponse.getAddition(), 4, null));
            v.r(mVar.f1684w, new B(7));
            file = mVar.f1669A;
            if (file != null) {
                file.delete();
            }
            mVar.f1669A = null;
            do {
                g0Var = mVar.f1682p;
                value = g0Var.getValue();
            } while (!g0Var.compareAndSet(value, i.a((i) value, null, 0.0f, null, null, g.f1637c, checkResponse.getRespMsg(), null, 71)));
        }
        return Unit.f38893a;
        int i11 = p292t6.a.f42345a;
        p292t6.a.a("uploadV2 cost : " + (System.currentTimeMillis() - j6) + "ms");
        r6.a aVar2 = p.f41237d;
        if (aVar2 != null && (liveID$ILiveIDMonitor = aVar2.f41573e) != null) {
            p320v6.d dVar = p320v6.e.f43078f;
            String str2 = dVar.f43071a;
            Pair pair = new Pair("event_desc", dVar.f43072b);
            Integer num = p.f41243j;
            Pair pair2 = new Pair("scene", new Integer(num != null ? num.intValue() : -1));
            String str3 = mVar.f1670B;
            if (str3 == null) {
                str3 = "";
            }
            Pair pair3 = new Pair("transactionId", str3);
            String str4 = p.f41242i;
            if (str4 == null) {
                str4 = "";
            }
            liveID$ILiveIDMonitor.report(str2, G.h(pair, pair2, pair3, new Pair("uuid", str4)));
        }
        checkRequest = new CheckRequest(this.f1667g, this.f1668i, 0, null, 12, null);
        p042cg.f fVar = I.f10809a;
        Wf.B bD = AbstractC0780y.d(coroutineScope, p042cg.e.f19009c, new k(2, null), 2);
        this.f1663c = checkRequest;
        this.f1662b = 2;
        objC = bD.c(this);
        if (objC != aVar) {
            if (((Boolean) objC).booleanValue()) {
                checkRequest.setSystemType(1);
            }
            p pVar4 = p.f41234a;
            checkRequest.setDeviceFingerprint(p.d());
            jCurrentTimeMillis = System.currentTimeMillis();
            p pVar5 = p.f41234a;
            LiveApi liveApiE2 = p.e();
            this.f1663c = null;
            this.f1661a = jCurrentTimeMillis;
            this.f1662b = 3;
            objCheck = liveApiE2.check("/api/validator/liveness/checkV2", checkRequest, this);
            if (objCheck != aVar) {
                j10 = jCurrentTimeMillis;
                checkResponse = (CheckResponse) objCheck;
                int i12 = p292t6.a.f42345a;
                p292t6.a.a("check cost : " + (System.currentTimeMillis() - j10) + "ms");
                if (androidx.camera.core.impl.utils.executor.g.A(checkResponse)) {
                    mVar.f1683v = new LiveIDResult.Success(new LiveSelfieResult(checkResponse));
                    do {
                        g0Var2 = mVar.f1682p;
                        value2 = g0Var2.getValue();
                    } while (!g0Var2.compareAndSet(value2, i.a((i) value2, null, 0.0f, null, null, g.f1636b, null, null, HomeDialogState.PRIORITY_HIGHEST_111)));
                } else {
                    respCode = checkResponse.getRespCode();
                    if (respCode == null) {
                        str = "";
                    } else {
                        str = respCode;
                    }
                    respMsg = checkResponse.getRespMsg();
                    if (respMsg == null) {
                        respMsg = "Unknown Error";
                    }
                    mVar.f1683v = new LiveIDResult.Error(new LiveIDException(str, q0.l(respMsg, "[", str, "]"), null, checkResponse.getAddition(), 4, null));
                    v.r(mVar.f1684w, new B(7));
                    file = mVar.f1669A;
                    if (file != null) {
                        file.delete();
                    }
                    mVar.f1669A = null;
                    do {
                        g0Var = mVar.f1682p;
                        value = g0Var.getValue();
                    } while (!g0Var.compareAndSet(value, i.a((i) value, null, 0.0f, null, null, g.f1637c, checkResponse.getRespMsg(), null, 71)));
                }
                return Unit.f38893a;
            }
        }
        return aVar;
    }
}
