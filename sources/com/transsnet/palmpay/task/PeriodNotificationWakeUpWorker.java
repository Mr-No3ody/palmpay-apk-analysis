package com.transsnet.palmpay.task;

import C0.G;
import F6.d;
import Pa.T;
import Pa.U;
import V0.C0692k;
import V0.C0706z;
import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import androidx.camera.video.u;
import androidx.core.app.M;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.firebase.messaging.Constants;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.rsp.LocalNotificationConfigItem;
import com.transsnet.palmpay.core.bean.rsp.LocalNotificationConfigRsp;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/task/PeriodNotificationWakeUpWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PeriodNotificationWakeUpWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f34131g = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isAllowShow(LocalNotificationConfigRsp localNotificationConfigRsp) {
            if (localNotificationConfigRsp.startHour >= localNotificationConfigRsp.endHour) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = jCurrentTimeMillis - calendar.getTimeInMillis();
            long j6 = localNotificationConfigRsp.startHour;
            long j10 = localNotificationConfigRsp.endHour;
            StringBuilder sbR = u.r(j6, "isAllowShow: start:", " ");
            sbR.append(timeInMillis);
            sbR.append(" end:");
            sbR.append(j10);
            sbR.append(" ");
            d.h("LocalNotification", 3, sbR.toString());
            return timeInMillis >= localNotificationConfigRsp.startHour && timeInMillis <= localNotificationConfigRsp.endHour;
        }

        private final void logReceiveNotification(String str, PushMessage pushMessage) {
            String str2;
            String str3;
            PushMessage.Content content;
            PushMessage.Content content2;
            HashMap map = new HashMap();
            M m7 = new M(BaseApplication.getContext());
            Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
            if (pushMessage == null || (content2 = pushMessage.content) == null || (str2 = content2.messageType) == null) {
                str2 = "";
            }
            map.put(LogConstants.Autotrack.ELEMENT_PUSH_MSG_TYPE, str2);
            if (pushMessage == null || (content = pushMessage.content) == null || (str3 = content.bulkNo) == null) {
                str3 = "";
            }
            map.put(LogConstants.Autotrack.ELEMENT_PUSH_BATCH_NO, str3);
            if (str == null) {
                str = "";
            }
            map.put(LogConstants.Autotrack.ELEMENT_EXTRA_ID, str);
            map.put(LogConstants.Autotrack.ELEMENT_RECEIVE_BY_PULL, Boolean.valueOf(pushMessage != null ? pushMessage.receivedByPull : false));
            try {
                map.put(LogConstants.Autotrack.ELEMENT_NOTIFICATION_ENABLE, Boolean.valueOf(m7.f15943b.areNotificationsEnabled()));
            } catch (Exception e10) {
                d.c("LocalNotification", "logReceiveNotification: areNotificationsEnabled error", e10);
            }
            map.put(LogConstants.Autotrack.ELEMENT_EXTRA_TYPE, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            map.put(LogConstants.Autotrack.ELEMENT_PUSH_PRIORITY, Integer.valueOf(pushMessage != null ? pushMessage.priority : 0));
            map.put(LogConstants.Autotrack.ELEMENT_PUSH_ORI_PRIORITY, Integer.valueOf(pushMessage != null ? pushMessage.originalPriority : 0));
            U.F().G(map);
        }

        public static /* synthetic */ void showPeriodLocalNotification$default(a aVar, boolean z3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z3 = false;
            }
            aVar.showPeriodLocalNotification(z3);
        }

        public final void delayShowPeriodLocalNotification(int i7) {
            T.a(new b(), i7);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
        public final void showPeriodLocalNotification(boolean z3) {
            PushMessage pushMessage;
            if (p115ha.b.f37362a.f37363a > 0) {
                d.h("LocalNotification", 3, "showPeriodLocalNotification: forground");
                if (!z3) {
                    return;
                }
            }
            String strH = p059e1.a.H("local_sp_local_notification_config_v2");
            if (TextUtils.isEmpty(strH)) {
                d.h("LocalNotification", 3, "showPeriodLocalNotification: empty config");
                return;
            }
            LocalNotificationConfigRsp localNotificationConfigRsp = (LocalNotificationConfigRsp) d0.l(LocalNotificationConfigRsp.class, strH);
            if (localNotificationConfigRsp == null) {
                return;
            }
            if (!isAllowShow(localNotificationConfigRsp) || localNotificationConfigRsp.preNumDay <= 0) {
                d.h("LocalNotification", 3, u.i(localNotificationConfigRsp.preNumDay, "showPeriodLocalNotification: not allow time "));
                if (!z3) {
                    return;
                }
            }
            long jE = p059e1.a.E(0L, "local_sp_last_show_local_notification");
            int iD = p059e1.a.D(0, "local_sp_show_local_notification_count");
            if (TimeUtils.isToday(jE)) {
                if (iD >= localNotificationConfigRsp.preNumDay) {
                    d.h("LocalNotification", 3, "showPeriodLocalNotification: reach max show today");
                    if (!z3) {
                        return;
                    }
                }
                d.h("LocalNotification", 3, u.i(localNotificationConfigRsp.timeInterval, "showPeriodLocalNotification: timeInterval "));
                if (jE + localNotificationConfigRsp.timeInterval > System.currentTimeMillis()) {
                    d.h("LocalNotification", 3, "showPeriodLocalNotification: too often");
                    if (!z3) {
                        return;
                    }
                }
            } else {
                iD = 0;
            }
            List<LocalNotificationConfigItem> list = localNotificationConfigRsp.pushDTOList;
            LocalNotificationConfigItem localNotificationConfigItem = null;
            if (list != null && (!list.isEmpty())) {
                List<LocalNotificationConfigItem> list2 = localNotificationConfigRsp.pushDTOList;
                int iD2 = p059e1.a.D(0, "local_sp_local_notification_index_v2");
                for (int size = list2 != null ? list2.size() : 0; size > 0; size--) {
                    iD2++;
                    if (iD2 >= 0) {
                        List<LocalNotificationConfigItem> list3 = localNotificationConfigRsp.pushDTOList;
                        Intrinsics.e(list3);
                        if (iD2 >= list3.size()) {
                            iD2 = 0;
                        }
                    } else {
                        iD2 = 0;
                    }
                    List<LocalNotificationConfigItem> list4 = localNotificationConfigRsp.pushDTOList;
                    Intrinsics.e(list4);
                    LocalNotificationConfigItem localNotificationConfigItem2 = list4.get(iD2);
                    if (localNotificationConfigItem2.checkCanShow()) {
                        localNotificationConfigItem = localNotificationConfigItem2;
                        break;
                    }
                }
                p059e1.a.U(iD2, "local_sp_local_notification_index_v2");
            }
            LocalNotificationConfigItem localNotificationConfigItem3 = localNotificationConfigItem;
            if (localNotificationConfigItem3 == null || (pushMessage = localNotificationConfigItem3.pushMessage) == null) {
                return;
            }
            d.h("LocalNotification", 3, G.o("showPeriodLocalNotification: ", localNotificationConfigItem3.pushCode));
            int i7 = Oe.d.f6840a;
            pushMessage.notifyId = 2;
            pushMessage.content.fcmMessageId = "Local Notification";
            Context context = BaseApplication.getContext();
            Notification notificationD = Oe.d.d(context, pushMessage);
            if (notificationD != null) {
                try {
                    new M(context.getApplicationContext()).b(pushMessage.notifyId, notificationD);
                } catch (Exception e10) {
                    d.c("NotificationUtils", "showNotification: ", e10);
                }
            }
            a aVar = PeriodNotificationWakeUpWorker.f34131g;
            String fcmMessageId = pushMessage.content.fcmMessageId;
            Intrinsics.checkNotNullExpressionValue(fcmMessageId, "fcmMessageId");
            aVar.logReceiveNotification(fcmMessageId, pushMessage);
            p059e1.a.V(System.currentTimeMillis(), "local_sp_last_show_local_notification");
            p059e1.a.U(iD + 1, "local_sp_show_local_notification_count");
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodNotificationWakeUpWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(C0692k c0692k) {
        C0706z c0706z = new C0706z();
        Intrinsics.checkNotNullExpressionValue(c0706z, "success(...)");
        return c0706z;
    }
}
