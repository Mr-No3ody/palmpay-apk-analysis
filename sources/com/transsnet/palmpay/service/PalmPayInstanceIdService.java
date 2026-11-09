package com.transsnet.palmpay.service;

import F6.d;
import Oe.f;
import Pa.C0525w;
import Pa.U;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.core.app.M;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.transsnet.palmpay.aidl.Msg;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/service/PalmPayInstanceIdService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "a", "lib_push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmPayInstanceIdService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmPayInstanceIdService.kt\ncom/transsnet/palmpay/service/PalmPayInstanceIdService\n+ 2 Trace.kt\nandroidx/core/os/TraceKt\n*L\n1#1,227:1\n31#2,5:228\n*S KotlinDebug\n*F\n+ 1 PalmPayInstanceIdService.kt\ncom/transsnet/palmpay/service/PalmPayInstanceIdService\n*L\n36#1:228,5\n*E\n"})
public final class PalmPayInstanceIdService extends FirebaseMessagingService {

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static String e(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.e(str);
            if (StringsKt.A(str, "Android", false) || StringsKt.A(str, "android", false)) {
                try {
                    return new JSONObject(str).optString("Android");
                } catch (JSONException e10) {
                    d.c("fcm", "parseLinkUrl: ", e10);
                }
            }
        }
        return str;
    }

    public final void c(RemoteMessage remoteMessage) {
        PushMessage.Content content;
        PushMessage pushMessage = null;
        Object objFromJson = null;
        Map<String, String> data = remoteMessage != null ? remoteMessage.getData() : null;
        RemoteMessage.Notification notification = remoteMessage != null ? remoteMessage.getNotification() : null;
        if (remoteMessage != null) {
            try {
                remoteMessage.getPriority();
            } catch (Exception e10) {
                d.c("fcm", "onReceiveMessageData: ", e10);
                return;
            }
        }
        if (remoteMessage != null) {
            remoteMessage.getOriginalPriority();
        }
        if (notification != null) {
            PushMessage pushMessage2 = new PushMessage();
            pushMessage2.title = notification.getTitle();
            PushMessage.Content content2 = new PushMessage.Content();
            content2.noticeMsg = notification.getBody();
            pushMessage2.content = content2;
            pushMessage2.intentAction = notification.getClickAction();
            pushMessage2.messageId = remoteMessage != null ? remoteMessage.getMessageId() : null;
            pushMessage2.messageType = remoteMessage != null ? remoteMessage.getMessageType() : null;
            pushMessage2.notificationType = 101;
            pushMessage2.priority = remoteMessage.getPriority();
            pushMessage2.originalPriority = remoteMessage.getOriginalPriority();
            pushMessage = pushMessage2;
        } else if (data != null) {
            if (TextUtils.isEmpty(data.get("tcm_msg_id")) && TextUtils.isEmpty(data.get("tcm_msg_pkgname"))) {
                PushMessage pushMessage3 = new PushMessage();
                String str = data.get(FirebaseAnalytics.Param.CONTENT);
                Oe.a aVarD = Oe.a.d();
                aVarD.getClass();
                try {
                    objFromJson = ((Gson) aVarD.f6830b).fromJson(str, (Class<Object>) PushMessage.Content.class);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                pushMessage3.content = (PushMessage.Content) objFromJson;
                pushMessage3.app = data.get("app");
                pushMessage3.memberId = data.get("memberId");
                pushMessage3.title = data.get("title");
                String strE = e(data.get("linkUrl"));
                pushMessage3.linkUrl = strE;
                if (TextUtils.isEmpty(strE) && (content = pushMessage3.content) != null) {
                    pushMessage3.linkUrl = e(content.linkUrl);
                }
                PushMessage.Content content3 = pushMessage3.content;
                if (content3 != null) {
                    content3.fcmMessageId = remoteMessage.getMessageId();
                }
                pushMessage3.notificationType = 102;
                pushMessage3.priority = remoteMessage.getPriority();
                pushMessage3.originalPriority = remoteMessage.getOriginalPriority();
                pushMessage = pushMessage3;
            }
            return;
        }
        if (pushMessage != null) {
            d(pushMessage);
        }
    }

    public final void d(PushMessage pm) {
        String str;
        String str2;
        int i7 = pm.notificationType;
        if (i7 == 101) {
            f.f6842a.get().getClass();
            d.h("fcm", 5, "dealNotification");
            String str3 = pm.title;
            PushMessage.Content content = pm.content;
            String str4 = content != null ? content.noticeMsg : null;
            StringBuilder sbF = F.f("messsageId: ", pm.messageId, " ,title: ", str3, " ,body:");
            sbF.append(str4);
            d.h("fcm", 3, sbF.toString());
            M m7 = new M(BaseApplication.getContext());
            Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
            HashMap map = new HashMap();
            map.put(LogConstants.Autotrack.ELEMENT_PUSH_MSG_TYPE, pm.messageType);
            map.put(LogConstants.Autotrack.ELEMENT_EXTRA_ID, pm.messageId);
            map.put(LogConstants.Autotrack.ELEMENT_EXTRA_TYPE, "notification");
            try {
                map.put(LogConstants.Autotrack.ELEMENT_NOTIFICATION_ENABLE, Boolean.valueOf(m7.f15943b.areNotificationsEnabled()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            map.put(LogConstants.Autotrack.ELEMENT_PUSH_PRIORITY, Integer.valueOf(pm.priority));
            map.put(LogConstants.Autotrack.ELEMENT_PUSH_ORI_PRIORITY, Integer.valueOf(pm.originalPriority));
            U.F().G(map);
            PushSubService.a aVar = PushSubService.f34100f;
            if (aVar.getInstance() != null) {
                g(pm);
                PushSubService aVar2 = aVar.getInstance();
                if (aVar2 != null) {
                    aVar2.a(new Msg(pm.notificationType, ((Gson) Oe.a.d().f6830b).toJson(pm)));
                }
            } else {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 31) {
                    if (i10 < 26) {
                        g(pm);
                        h(pm);
                        return;
                    }
                    pm.startForegroundNotification = true;
                    int i11 = Oe.d.f6840a;
                    pm.notifyId = 3;
                    Intent intent = new Intent(this, (Class<?>) PushSubService.class);
                    intent.putExtra("PUSH_MESSAGE_FOR_SERVICE", ((Gson) C0525w.f().f7166b).toJson(pm));
                    startForegroundService(intent);
                    return;
                }
                g(pm);
                if (pm.priority == 1) {
                    h(pm);
                }
            }
            return;
        }
        if (i7 != 102) {
            return;
        }
        f.f6842a.get().getClass();
        Intrinsics.checkNotNullParameter(pm, "pm");
        d.h("fcm", 5, "dealDataMessageBySubProgress");
        PushMessage.Content content2 = pm.content;
        if (content2 != null) {
            if (PushMessage.MESSAGE_TYPE_INSTALMENT_RECEIVED_MONEY_OWNER.equals(content2.messageType) || PushMessage.MESSAGE_TYPE_INSTALMENT_RECEIVED_MONEY_STAFF.equals(pm.content.messageType)) {
                new top.zibin.luban.io.a(17).q(pm.content.noticeMsg);
            }
            PushMessage.Content content3 = pm.content;
            if (content3 != null) {
                String fcmMessageId = content3.fcmMessageId;
                Intrinsics.checkNotNullExpressionValue(fcmMessageId, "fcmMessageId");
                HashMap map2 = new HashMap();
                M m10 = new M(BaseApplication.getContext());
                Intrinsics.checkNotNullExpressionValue(m10, "from(...)");
                PushMessage.Content content4 = pm.content;
                if (content4 == null || (str = content4.messageType) == null) {
                    str = "";
                }
                map2.put(LogConstants.Autotrack.ELEMENT_PUSH_MSG_TYPE, str);
                PushMessage.Content content5 = pm.content;
                if (content5 == null || (str2 = content5.bulkNo) == null) {
                    str2 = "";
                }
                map2.put(LogConstants.Autotrack.ELEMENT_PUSH_BATCH_NO, str2);
                if (fcmMessageId == null) {
                    fcmMessageId = "";
                }
                map2.put(LogConstants.Autotrack.ELEMENT_EXTRA_ID, fcmMessageId);
                map2.put(LogConstants.Autotrack.ELEMENT_RECEIVE_BY_PULL, Boolean.valueOf(pm.receivedByPull));
                try {
                    map2.put(LogConstants.Autotrack.ELEMENT_NOTIFICATION_ENABLE, Boolean.valueOf(m10.f15943b.areNotificationsEnabled()));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                map2.put(LogConstants.Autotrack.ELEMENT_EXTRA_TYPE, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                map2.put(LogConstants.Autotrack.ELEMENT_PUSH_PRIORITY, Integer.valueOf(pm.priority));
                map2.put(LogConstants.Autotrack.ELEMENT_PUSH_ORI_PRIORITY, Integer.valueOf(pm.originalPriority));
                U.F().G(map2);
            }
        }
        PushSubService.a aVar3 = PushSubService.f34100f;
        if (aVar3.getInstance() != null) {
            f(pm);
            PushSubService aVar4 = aVar3.getInstance();
            if (aVar4 != null) {
                aVar4.a(new Msg(pm.notificationType, ((Gson) Oe.a.d().f6830b).toJson(pm)));
                return;
            }
            return;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            f(pm);
            if (pm.priority == 1) {
                h(pm);
                return;
            }
            return;
        }
        if (i12 < 26) {
            f(pm);
            h(pm);
            return;
        }
        f.f6842a.get().getClass();
        if (f.c(pm)) {
            pm.startForegroundNotification = true;
            Intent intent2 = new Intent(this, (Class<?>) PushSubService.class);
            intent2.putExtra("PUSH_MESSAGE_FOR_SERVICE", ((Gson) C0525w.f().f7166b).toJson(pm));
            startForegroundService(intent2);
        }
    }

    public final void f(PushMessage pushMessage) {
        f.f6842a.get().getClass();
        Notification notificationA = f.a(pushMessage);
        if (notificationA != null) {
            M m7 = new M(getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
            m7.b(pushMessage.notifyId, notificationA);
        }
    }

    public final void g(PushMessage pushMessage) {
        f.f6842a.get().getClass();
        Notification notificationB = f.b(pushMessage);
        if (notificationB != null) {
            M m7 = new M(getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
            m7.b(pushMessage.notifyId, notificationB);
        }
    }

    public final void h(PushMessage pushMessage) {
        Intent intent = new Intent(this, (Class<?>) PushSubService.class);
        intent.putExtra("PUSH_MESSAGE_FOR_SERVICE", ((Gson) Oe.a.d().f6830b).toJson(pushMessage));
        startService(intent);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Trace.beginSection("handlePush");
        try {
            super.onMessageReceived(remoteMessage);
            c(remoteMessage);
            Unit unit = Unit.f38893a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String refreshedToken) {
        Intrinsics.checkNotNullParameter(refreshedToken, "refreshedToken");
        super.onNewToken(refreshedToken);
    }
}
