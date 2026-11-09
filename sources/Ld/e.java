package Ld;

import android.content.Context;
import androidx.core.app.M;
import com.transsnet.palmpay.aidl.IRemoteCallback;
import com.transsnet.palmpay.aidl.Msg;
import com.transsnet.palmpay.service.PushSubService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends IRemoteCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PushSubService f5656a;

    public e(PushSubService pushSubService) {
        this.f5656a = pushSubService;
    }

    @Override // com.transsnet.palmpay.aidl.IRemoteCallback
    public final void notifyEvent(Msg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        F6.d.h("aidl-service-push", 5, com.airbnb.lottie.model.layer.d.j("push service notify event code:", msg.code, " message:", msg.message));
        PushSubService pushSubService = this.f5656a;
        pushSubService.f34102a = true;
        int i7 = msg.code;
        if (i7 != 103) {
            if (i7 != 104) {
                return;
            }
            Context applicationContext = pushSubService.getApplicationContext();
            int i10 = Oe.d.f6840a;
            new M(applicationContext.getApplicationContext()).f15943b.cancelAll();
            return;
        }
        pushSubService.stopForeground(1);
        M m7 = new M(pushSubService.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
        int i11 = Oe.d.f6840a;
        m7.a(3);
    }
}
