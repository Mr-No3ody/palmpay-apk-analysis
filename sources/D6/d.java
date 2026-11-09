package D6;

import N8.q0;
import Wf.AbstractC0780y;
import Wf.B;
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
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.g0;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f1602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(File file, String str, e eVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.f1602d = file;
        this.f1603e = str;
        this.f1604f = eVar;
        this.f1605g = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f1602d, this.f1603e, this.f1604f, this.f1605g, continuation);
        dVar.f1601c = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0106  */
    /* JADX WARN: Code duplicated, block: B:40:0x012d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0151  */
    /* JADX WARN: Code duplicated, block: B:47:0x017d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0183  */
    /* JADX WARN: Code duplicated, block: B:50:0x0185  */
    /* JADX WARN: Code duplicated, block: B:53:0x018c  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ae  */
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
        int i7 = this.f1600b;
        e eVar = this.f1604f;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            coroutineScope = (CoroutineScope) this.f1601c;
            UploadRequestV2 uploadRequestV2 = new UploadRequestV2(this.f1602d);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            p pVar = p.f41234a;
            UploadApi uploadApiH = p.h();
            this.f1601c = coroutineScope;
            this.f1599a = jCurrentTimeMillis2;
            this.f1600b = 1;
            if (uploadApiH.uploadV2(this.f1603e, uploadRequestV2, this) != aVar) {
                j6 = jCurrentTimeMillis2;
            }
            return aVar;
        }
        if (i7 == 1) {
            j6 = this.f1599a;
            coroutineScope = (CoroutineScope) this.f1601c;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        } else {
            if (i7 == 2) {
                CheckRequest checkRequest2 = (CheckRequest) this.f1601c;
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
                this.f1601c = null;
                this.f1599a = jCurrentTimeMillis;
                this.f1600b = 3;
                objCheck = liveApiE.check("/api/validator/liveness/checkV2", checkRequest, this);
                if (objCheck != aVar) {
                    j10 = jCurrentTimeMillis;
                }
                return aVar;
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f1599a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            objCheck = obj;
        }
        checkResponse = (CheckResponse) objCheck;
        int i10 = p292t6.a.f42345a;
        p292t6.a.a("check cost : " + (System.currentTimeMillis() - j10) + "ms");
        if (androidx.camera.core.impl.utils.executor.g.A(checkResponse)) {
            eVar.f1619o = new LiveIDResult.Success(new LiveSelfieResult(checkResponse));
            do {
                g0Var2 = eVar.f1617i;
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
            eVar.f1619o = new LiveIDResult.Error(new LiveIDException(str, q0.l(respMsg, "[", str, "]"), null, checkResponse.getAddition(), 4, null));
            file = eVar.f1620p;
            if (file != null) {
                file.delete();
            }
            eVar.f1620p = null;
            do {
                g0Var = eVar.f1617i;
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
            String str3 = eVar.t;
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
        checkRequest = new CheckRequest(this.f1605g, 0, 0, null, 12, null);
        p042cg.f fVar = I.f10809a;
        B bD = AbstractC0780y.d(coroutineScope, p042cg.e.f19009c, new c(2, null), 2);
        this.f1601c = checkRequest;
        this.f1600b = 2;
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
            this.f1601c = null;
            this.f1599a = jCurrentTimeMillis;
            this.f1600b = 3;
            objCheck = liveApiE2.check("/api/validator/liveness/checkV2", checkRequest, this);
            if (objCheck != aVar) {
                j10 = jCurrentTimeMillis;
                checkResponse = (CheckResponse) objCheck;
                int i12 = p292t6.a.f42345a;
                p292t6.a.a("check cost : " + (System.currentTimeMillis() - j10) + "ms");
                if (androidx.camera.core.impl.utils.executor.g.A(checkResponse)) {
                    eVar.f1619o = new LiveIDResult.Success(new LiveSelfieResult(checkResponse));
                    do {
                        g0Var2 = eVar.f1617i;
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
                    eVar.f1619o = new LiveIDResult.Error(new LiveIDException(str, q0.l(respMsg, "[", str, "]"), null, checkResponse.getAddition(), 4, null));
                    file = eVar.f1620p;
                    if (file != null) {
                        file.delete();
                    }
                    eVar.f1620p = null;
                    do {
                        g0Var = eVar.f1617i;
                        value = g0Var.getValue();
                    } while (!g0Var.compareAndSet(value, i.a((i) value, null, 0.0f, null, null, g.f1637c, checkResponse.getRespMsg(), null, 71)));
                }
                return Unit.f38893a;
            }
        }
        return aVar;
    }
}
