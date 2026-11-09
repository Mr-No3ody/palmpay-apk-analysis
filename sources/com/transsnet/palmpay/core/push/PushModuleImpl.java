package com.transsnet.palmpay.core.push;

import F6.d;
import Oe.f;
import Pa.i0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import androidx.core.app.O;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.appsflyer.AppsFlyerLib;
import com.transsnet.palmpay.aidl.Msg;
import com.transsnet.palmpay.bean.NotificationMessage;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.provider.IPushModule;
import com.transsnet.palmpay.core.service.RequestContactService;
import com.transsnet.palmpay.core.service.UpdateBadgeService;
import com.transsnet.palmpay.service.PushMainService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/push/provider_push")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/push/PushModuleImpl;", "Lcom/transsnet/palmpay/core/provider/IPushModule;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushModuleImpl implements IPushModule {
    @Override // com.transsnet.palmpay.core.provider.IPushModule
    public final void cancelAllNotification() {
        PushMainService aVar = PushMainService.f34093f.getInstance();
        if (aVar != null) {
            aVar.a(new Msg(104, ""));
        }
    }

    @Override // com.transsnet.palmpay.core.provider.IPushModule
    public final void dealDataMessage(PushMessage pushMessage) {
        f.f6842a.get().getClass();
        d.h("fcm", 5, "dealDataMessageByMain");
        if (pushMessage != null) {
            Context context = BaseApplication.getContext();
            PushMessage.Content content = pushMessage.content;
            if (content != null) {
                String str = content.fcmMessageId;
                if (str != null) {
                    Iterator it = g.u().iterator();
                    while (it.hasNext()) {
                        if (str.equals((String) it.next())) {
                            return;
                        }
                    }
                }
                c.b().f(pushMessage);
                UpdateBadgeService.a aVar = UpdateBadgeService.f27407i;
                Intrinsics.e(context);
                aVar.enqueueWork(context);
                String str2 = pushMessage.content.fcmMessageId;
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        ArrayList arrayListU = g.u();
                        Iterator it2 = arrayListU.iterator();
                        do {
                            if (!it2.hasNext()) {
                                if (arrayListU.size() >= 20) {
                                    arrayListU.remove(0);
                                }
                                Intrinsics.e(str2);
                                arrayListU.add(str2);
                                g.L(arrayListU);
                                break;
                            }
                        } while (!y.h(str2, (String) it2.next(), false));
                    }
                } catch (Exception e10) {
                    d.c("SyncPushMessageTask", "addPushMessageHistory: error", e10);
                }
                if (PushMessage.MESSAGE_TYPE_REQUEST_CONTACT.equals(pushMessage.content.messageType)) {
                    Intent intentPutExtra = new Intent(context, (Class<?>) RequestContactService.class).putExtra("contact_info", pushMessage.content.businessInfo);
                    int i7 = RequestContactService.f27405j;
                    try {
                        O.a(context, RequestContactService.class, 1000, intentPutExtra);
                    } catch (SecurityException e11) {
                        d.c("RequestContactService", "enqueueWork: ", e11);
                    }
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.provider.IPushModule
    public final void dealNotification(PushMessage pushMessage) {
        f.f6842a.get().getClass();
        d.h("fcm", 5, "dealNotificationByMain");
        if (pushMessage != null) {
            MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_NOTIFICATION_ARRIVE);
            NotificationMessage notificationMessage = new NotificationMessage();
            notificationMessage.title = pushMessage.title;
            PushMessage.Content content = pushMessage.content;
            notificationMessage.content = content != null ? content.noticeMsg : null;
            messageEvent.setEventObj(notificationMessage);
            c.b().f(messageEvent);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }

    @Override // com.transsnet.palmpay.core.provider.IPushModule
    public final void refreshToken(String str) {
        f.f6842a.get().getClass();
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerLib.getInstance().updateServerUninstallToken(BaseApplication.getContext(), str);
        }
        i0.Q(str);
    }

    @Override // com.transsnet.palmpay.core.provider.IPushModule
    public final void stopForegroundNotification() {
        try {
            PushMainService.a aVar = PushMainService.f34093f;
            if (aVar.getInstance() == null) {
                Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) PushMainService.class);
                intent.putExtra("KEY_LAUNCH_BY_NOTIFICATION", true);
                BaseApplication.getContext().startService(intent);
            } else {
                PushMainService aVar2 = aVar.getInstance();
                if (aVar2 != null) {
                    aVar2.c();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
