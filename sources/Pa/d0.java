package Pa;

import com.pp.faceguard.traffic.FaceGuardTraffic;
import com.transsnet.palmpay.core.base.BaseApplication;
import face.security.device.api.FaceSecDevice;
import face.security.device.api.FaceSecToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends Ff.h implements Function2 {
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d0(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        try {
            FaceSecToken deviceToken = FaceSecDevice.getInstance().getDeviceToken();
            if (deviceToken != null) {
                int i7 = deviceToken.code;
                if (10000 != i7) {
                    F6.d.h("Face", 3, "AliyunFaceGuard get token fail code=" + i7);
                } else {
                    String token = deviceToken.token;
                    Intrinsics.checkNotNullExpressionValue(token, "token");
                    p059e1.a.W("face_guard_device_token", token);
                    if (BaseApplication.hasLogin()) {
                        FaceGuardTraffic.bindDeviceTokens(BaseApplication.get().getUser().getMemberId(), deviceToken.token, "", null);
                    }
                    T.b(-4).execute(new RunnableC0527y(1));
                }
            } else {
                F6.d.h("Face", 3, "AliyunFaceGuard get token fail, token is null");
            }
        } catch (Exception e10) {
            F6.d.c("Face", C0.G.o("AliyunFaceGuard get token fail, ", e10.getMessage()));
        }
        return Unit.f38893a;
    }
}
