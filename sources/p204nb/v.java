package p204nb;

import Ef.a;
import Ef.f;
import Ff.c;
import Wf.C0765i;
import androidx.camera.core.impl.utils.executor.g;
import com.flexibank.sdk.k;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.GenerateAuthCodeReq;
import com.transsnet.palmpay.core.bean.rsp.GenerateAuthCodeResp;
import com.transsnet.palmpay.core.network.PayApiService;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f39929a = new v();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(c cVar) {
        u frame;
        String message;
        String message2;
        String authCode;
        if (cVar instanceof u) {
            frame = (u) cVar;
            int i7 = frame.f39928c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f39928c = i7 - Integer.MIN_VALUE;
            } else {
                frame = new u(this, cVar);
            }
        } else {
            frame = new u(this, cVar);
        }
        Object objGenerateAuthCode = frame.f39926a;
        a aVar = a.f2423a;
        int i10 = frame.f39928c;
        try {
            if (i10 == 0) {
                g.M(objGenerateAuthCode);
                if (!k.k()) {
                    return new r(s.f39922b, null);
                }
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                GenerateAuthCodeReq generateAuthCodeReq = new GenerateAuthCodeReq("P260617092568177297851");
                frame.f39928c = 1;
                objGenerateAuthCode = payApiService.generateAuthCode(generateAuthCodeReq, frame);
                if (objGenerateAuthCode == aVar) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(objGenerateAuthCode);
                return objGenerateAuthCode;
            }
            g.M(objGenerateAuthCode);
            CommonBeanResult commonBeanResult = (CommonBeanResult) objGenerateAuthCode;
            if (!commonBeanResult.isSuccess()) {
                String respCode = commonBeanResult.getRespCode();
                return new r((respCode == null || StringsKt.F(respCode)) ? s.f39922b : s.f39923c, commonBeanResult.getRespMsg());
            }
            GenerateAuthCodeResp generateAuthCodeResp = (GenerateAuthCodeResp) commonBeanResult.data;
            if (generateAuthCodeResp == null || (authCode = generateAuthCodeResp.getAuthCode()) == null || StringsKt.F(authCode)) {
                authCode = null;
            }
            if (authCode == null || StringsKt.F(authCode)) {
                return new r(s.f39923c, null);
            }
            frame.f39928c = 2;
            C0765i c0765i = new C0765i(1, f.b(frame));
            c0765i.initCancellability();
            try {
                k.c(authCode, new t(c0765i));
            } catch (Exception unused) {
                if (c0765i.isActive()) {
                    o oVar = q.f43977a;
                    c0765i.resumeWith(new r(s.f39923c, null));
                }
            }
            Object objM = c0765i.m();
            if (objM == a.f2423a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objM == aVar ? aVar : objM;
        } catch (Exception e10) {
            return new r(((e10 instanceof IOException) || (e10 instanceof SocketTimeoutException) || ((message = e10.getMessage()) != null && StringsKt.A(message, "timeout", true)) || ((message2 = e10.getMessage()) != null && StringsKt.A(message2, "network", true))) ? s.f39922b : s.f39923c, null);
        }
    }
}
