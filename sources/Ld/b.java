package Ld;

import Pa.C0525w;
import com.transsnet.palmpay.aidl.IEventInterface;
import com.transsnet.palmpay.aidl.IRemoteCallback;
import com.transsnet.palmpay.aidl.Msg;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.provider.IPushModule;
import com.transsnet.palmpay.service.PushMainService;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends IEventInterface.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PushMainService f5653a;

    public b(PushMainService pushMainService) {
        this.f5653a = pushMainService;
    }

    @Override // com.transsnet.palmpay.aidl.IEventInterface
    public final void notify(Msg msg) {
        F6.d.h("aidl-service-main", 2, "main service notify code:" + (msg != null ? Integer.valueOf(msg.code) : null) + " message:" + (msg != null ? msg.message : null));
        if (msg != null) {
            int i7 = msg.code;
            PushMainService pushMainService = this.f5653a;
            t tVar = pushMainService.f34099e;
            switch (i7) {
                case 100:
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((IPushModule) value).refreshToken(msg.message);
                    break;
                case 101:
                    C0525w c0525wF = C0525w.f();
                    String str = msg.message;
                    c0525wF.getClass();
                    PushMessage pushMessage = (PushMessage) C0525w.d(str, PushMessage.class);
                    if (pushMessage != null) {
                        pushMessage.startForegroundNotification = !pushMainService.f34095a;
                        Object value2 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((IPushModule) value2).dealNotification(pushMessage);
                    }
                    break;
                case 102:
                    C0525w c0525wF2 = C0525w.f();
                    String str2 = msg.message;
                    c0525wF2.getClass();
                    PushMessage pushMessage2 = (PushMessage) C0525w.d(str2, PushMessage.class);
                    if (pushMessage2 != null) {
                        pushMessage2.startForegroundNotification = !pushMainService.f34095a;
                        Object value3 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        ((IPushModule) value3).dealDataMessage(pushMessage2);
                    }
                    break;
            }
        }
    }

    @Override // com.transsnet.palmpay.aidl.IEventInterface
    public final void registerCallback(IRemoteCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        F6.d.h("aidl-service-main", 5, "main service registerCallback:" + callback + callback.asBinder());
        this.f5653a.f34098d.register(callback);
    }

    @Override // com.transsnet.palmpay.aidl.IEventInterface
    public final void unregisterCallback(IRemoteCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        F6.d.h("aidl-service-main", 5, "main service unregisterCallback " + callback + callback.asBinder());
        this.f5653a.f34098d.unregister(callback);
    }
}
