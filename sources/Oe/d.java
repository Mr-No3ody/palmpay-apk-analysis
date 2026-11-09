package Oe;

import H1.h;
import J1.g;
import Pa.F;
import Pa.i0;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.B;
import androidx.core.app.D;
import androidx.core.app.M;
import androidx.core.app.z;
import com.bumptech.glide.m;
import com.bumptech.glide.request.target.Target;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.ui.activity.CoreNotificationEntryActivity;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.util.AppUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f6840a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f6841b = AppUtils.getAppName();

    public static void a(Intent intent, PushMessage pushMessage) {
        PushMessage.Content content = pushMessage.content;
        if (content != null) {
            intent.putExtra("extra_msg_type", content.messageType);
            intent.putExtra("extra_push_msg_id", pushMessage.content.fcmMessageId);
            intent.putExtra("extra_push_batch_no", pushMessage.content.bulkNo);
        }
        intent.putExtra(LogConstants.Autotrack.INTENT_NAME, "com.transsnet.palmpay.action.notification");
    }

    public static Intent b(Context context, Intent intent, int i7) {
        String className = intent.getComponent() != null ? intent.getComponent().getClassName() : null;
        if (TextUtils.isEmpty(className) || !className.equals(CoreNotificationEntryActivity.class.getName())) {
            Intent intent2 = new Intent(context, (Class<?>) CoreNotificationEntryActivity.class);
            intent2.putExtra("extra_data", intent);
            intent = intent2;
        }
        intent.setAction("com.transsnet.palmpay.action.notification.click");
        intent.putExtra("extra_id", i7);
        intent.putExtra("KEY_LAUNCH_BY_NOTIFICATION", true);
        intent.setFlags(268468224);
        return intent;
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannel notificationChannelB = A1.b.b();
        notificationChannelB.setShowBadge(true);
        notificationChannelB.enableVibration(true);
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannelB);
        return "channel_1";
    }

    public static Notification d(Context context, PushMessage pushMessage) {
        Object objFromJson;
        boolean zIsEmpty = TextUtils.isEmpty(pushMessage.title);
        String str = f6841b;
        if (zIsEmpty) {
            pushMessage.title = str;
        }
        if (TextUtils.isEmpty(pushMessage.linkUrl)) {
            if (TextUtils.isEmpty(pushMessage.title)) {
                pushMessage.title = str;
            }
            return i(context, new Intent("com.transsnet.palmpay.action.notification"), pushMessage);
        }
        Intent intentA = F.a(context, pushMessage.linkUrl);
        if (!i0.g0(context, intentA)) {
            String str2 = pushMessage.linkUrl;
            int i7 = pushMessage.notifyId;
            if (i7 <= 0) {
                i7 = 2;
            }
            Intent intent = new Intent(context, (Class<?>) CoreNotificationEntryActivity.class);
            intent.setAction("com.transsnet.palmpay.action.notification.click");
            intent.putExtra("extra_id", i7);
            intent.putExtra("extra_link", str2);
            intent.putExtra("KEY_LAUNCH_BY_NOTIFICATION", true);
            intent.setFlags(268468224);
            intentA = intent;
        }
        if ("com.transsnet.palmpay.action.ORDER_DETAIL".equals(intentA.getAction())) {
            if (PushMessage.MESSAGE_TYPE_REQUEST_CONTACT.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_ACCEPT_CONTACT.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_LUCKY_MONEY_REQUEST_CONTACT.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_SEND_MONEY_REQUEST_CONTACT.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_REQUEST_MONEY_REQUEST_CONTACT.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_TOP_UP_AIRTIME_REQUEST_CONTACT.equals(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_DATA_BUNDLE_REQUEST_CONTACT.equals(pushMessage.content.messageType)) {
                a aVarD = a.d();
                String str3 = pushMessage.content.businessInfo;
                aVarD.getClass();
                try {
                    objFromJson = ((Gson) aVarD.f6830b).fromJson(str3, (Class<Object>) PalmPayContact.class);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    objFromJson = null;
                }
                intentA.putExtra("contact", (PalmPayContact) objFromJson);
            }
            intentA.putExtra("business_data", pushMessage.content.businessInfo);
            intentA.setData(Uri.parse(pushMessage.linkUrl));
        }
        if (PushMessage.MESSAGE_TYPE_BENEFICIARY_BILLPAYMENT_REMIND.equals(pushMessage.content.messageType)) {
            try {
                intentA.putExtra("KEY_CATEGORY_ID", new JSONObject(pushMessage.content.businessInfo).getString("categoryId"));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        return i(context, intentA, pushMessage);
    }

    public static PendingIntent e(Context context, Intent intent, PushMessage pushMessage) {
        try {
            TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
            a(intent, pushMessage);
            taskStackBuilderCreate.addNextIntentWithParentStack(intent);
            return Build.VERSION.SDK_INT >= 31 ? taskStackBuilderCreate.getPendingIntent(1, 201326592) : taskStackBuilderCreate.getPendingIntent(1, 134217728);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(int i7) {
        return i7 < f6840a && i7 > 0;
    }

    public static void g(final int i7, final int i10, final Notification notification, final Context context, final RemoteViews remoteViews, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Oe.b
            @Override // java.lang.Runnable
            public final void run() {
                RemoteViews remoteViews2 = remoteViews;
                Notification notification2 = notification;
                int i11 = i7;
                Context context2 = context;
                Target hVar = new h(context2, i10, remoteViews2, notification2, i11);
                m mVarLoad = com.bumptech.glide.b.e(context2.getApplicationContext()).b().load(str);
                mVarLoad.T(hVar, null, mVarLoad, g.f4461a);
            }
        });
    }

    public static void h(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
            context.startActivity(intent);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent2);
        }
    }

    public static Notification i(Context context, Intent intent, PushMessage pushMessage) {
        B b7;
        int iV;
        int iV2;
        if ((Build.VERSION.SDK_INT >= 33 && androidx.core.content.d.a(context, "android.permission.POST_NOTIFICATIONS") != 0) || pushMessage.content == null) {
            return null;
        }
        int i7 = pushMessage.notifyId;
        if (!f(i7)) {
            i7 = f6840a + 1;
            f6840a = i7;
        }
        int i10 = i7;
        String strE = a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideStyle");
        if ("styleA".equalsIgnoreCase(strE)) {
            M m7 = new M(context.getApplicationContext());
            B b10 = new B(context, c(context));
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), p025ba.g.core_layout_custom_notification_style_1);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), p025ba.g.core_layout_custom_notification_style_1_small);
            String strE2 = a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideBtnText");
            if (TextUtils.isEmpty(strE2)) {
                remoteViews.setViewVisibility(p025ba.e.tvAction, 8);
                remoteViews.setViewVisibility(p025ba.e.ivNext, 0);
                remoteViews2.setViewVisibility(p025ba.e.tvAction, 8);
                remoteViews2.setViewVisibility(p025ba.e.ivNext, 0);
            } else {
                remoteViews.setTextViewText(p025ba.e.tvAction, strE2);
                remoteViews.setViewVisibility(p025ba.e.tvAction, 0);
                remoteViews.setViewVisibility(p025ba.e.ivNext, 8);
                remoteViews2.setTextViewText(p025ba.e.tvAction, strE2);
                remoteViews2.setViewVisibility(p025ba.e.tvAction, 0);
                remoteViews2.setViewVisibility(p025ba.e.ivNext, 8);
            }
            remoteViews.setTextViewText(p025ba.e.tvMessage, pushMessage.content.noticeMsg);
            remoteViews.setTextViewText(p025ba.e.tvTitle, pushMessage.title);
            remoteViews2.setTextViewText(p025ba.e.tvMessage, pushMessage.content.noticeMsg);
            remoteViews2.setTextViewText(p025ba.e.tvTitle, pushMessage.title);
            remoteViews2.setViewVisibility(p025ba.e.ivIcon, 8);
            a(intent, pushMessage);
            Intent intentB = b(context, intent, i10);
            b10.f15917v.icon = p025ba.d.core_push_small;
            b10.c(-1);
            b10.d(16, true);
            b10.f15917v.when = System.currentTimeMillis();
            b10.f15903g = e(context, intentB, pushMessage);
            b10.f15906j = 1;
            b10.f15910n = "msg";
            b10.f(new D(3));
            b10.f15914r = remoteViews2;
            b10.f15915s = remoteViews;
            if (f(i10)) {
                m7.a(i10);
            } else {
                pushMessage.notifyId = i10;
            }
            Notification notificationA = b10.a();
            g(i10, p025ba.e.ivIcon, notificationA, context, remoteViews, a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideIcon"));
            return notificationA;
        }
        if ("styleB".equalsIgnoreCase(strE)) {
            M m10 = new M(context.getApplicationContext());
            B b11 = new B(context, c(context));
            RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), p025ba.g.core_layout_custom_notification_style_2);
            remoteViews3.setTextViewText(p025ba.e.tvMessage, pushMessage.content.noticeMsg);
            remoteViews3.setTextViewText(p025ba.e.tvTitle, pushMessage.title);
            RemoteViews remoteViews4 = new RemoteViews(context.getPackageName(), p025ba.g.core_layout_custom_notification_style_2_small);
            remoteViews4.setTextViewText(p025ba.e.tvMessage, pushMessage.content.noticeMsg);
            remoteViews4.setTextViewText(p025ba.e.tvTitle, pushMessage.title);
            remoteViews4.setViewVisibility(p025ba.e.ivIcon, 8);
            a(intent, pushMessage);
            Intent intentB2 = b(context, intent, i10);
            b11.f15917v.icon = p025ba.d.core_push_small;
            b11.c(-1);
            b11.d(16, true);
            b11.f15917v.when = System.currentTimeMillis();
            b11.f15902f = B.b(pushMessage.content.noticeMsg);
            b11.f15906j = 1;
            b11.f(new D(3));
            b11.f15903g = e(context, intentB2, pushMessage);
            b11.f15914r = remoteViews4;
            b11.f15915s = remoteViews3;
            Notification notificationA2 = b11.a();
            String strE3 = a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideIcon");
            if (!TextUtils.isEmpty(strE3)) {
                g(i10, p025ba.e.ivIcon, notificationA2, context, remoteViews3, strE3);
                i10 = i10;
            } else if (TextUtils.isEmpty(pushMessage.content.resId) || (iV2 = i0.v(pushMessage.content.resId)) <= 0) {
                remoteViews3.setViewVisibility(p025ba.e.ivIcon, 8);
            } else {
                remoteViews3.setImageViewResource(p025ba.e.ivIcon, iV2);
            }
            String strE4 = a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideBtnText");
            if (TextUtils.isEmpty(strE4)) {
                remoteViews4.setViewVisibility(p025ba.e.ivNext, 0);
                remoteViews3.setViewVisibility(p025ba.e.ivNext, 0);
                remoteViews4.setViewVisibility(p025ba.e.tvAction, 8);
                remoteViews3.setViewVisibility(p025ba.e.tvAction, 8);
            } else {
                remoteViews4.setViewVisibility(p025ba.e.ivNext, 8);
                remoteViews3.setViewVisibility(p025ba.e.ivNext, 8);
                remoteViews4.setViewVisibility(p025ba.e.tvAction, 0);
                remoteViews4.setTextViewText(p025ba.e.tvAction, strE4);
                remoteViews3.setViewVisibility(p025ba.e.tvAction, 0);
                remoteViews3.setTextViewText(p025ba.e.tvAction, strE4);
            }
            if (f(i10)) {
                m10.a(i10);
                return notificationA2;
            }
            pushMessage.notifyId = i10;
            return notificationA2;
        }
        if ("styleBigImage".equalsIgnoreCase(strE)) {
            M m11 = new M(context.getApplicationContext());
            B b12 = new B(context, c(context));
            RemoteViews remoteViews5 = new RemoteViews(context.getPackageName(), p025ba.g.core_layout_custom_notification_style_5);
            remoteViews5.setTextViewText(p025ba.e.tvMessage, pushMessage.content.noticeMsg);
            remoteViews5.setTextViewText(p025ba.e.tvTitle, pushMessage.title);
            RemoteViews remoteViews6 = new RemoteViews(context.getPackageName(), p025ba.g.core_layout_custom_notification_style_5_small);
            remoteViews6.setTextViewText(p025ba.e.tvMessage, pushMessage.content.noticeMsg);
            remoteViews6.setTextViewText(p025ba.e.tvTitle, pushMessage.title);
            a(intent, pushMessage);
            Intent intentB3 = b(context, intent, i10);
            b12.f15917v.icon = p025ba.d.core_push_small;
            b12.d(16, true);
            b12.c(-1);
            b12.f15917v.when = System.currentTimeMillis();
            b12.f15902f = B.b(pushMessage.content.noticeMsg);
            b12.f15906j = 1;
            b12.f(new D(3));
            b12.f15903g = e(context, intentB3, pushMessage);
            b12.f15914r = remoteViews6;
            b12.f15915s = remoteViews5;
            Notification notificationA3 = b12.a();
            String strE5 = a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideBigIcon");
            String strE6 = a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideIcon");
            if (!TextUtils.isEmpty(strE5)) {
                String str = TextUtils.isEmpty(strE6) ? strE5 : strE6;
                g(i10, p025ba.e.ivIcon, notificationA3, context, remoteViews5, strE5);
                g(i10, p025ba.e.ivIcon, notificationA3, context, remoteViews6, str);
                i10 = i10;
            } else if (!TextUtils.isEmpty(pushMessage.content.resId) && (iV = i0.v(pushMessage.content.resId)) > 0) {
                remoteViews6.setImageViewResource(p025ba.e.ivIcon, iV);
                remoteViews5.setImageViewResource(p025ba.e.ivIcon, iV);
            }
            if (f(i10)) {
                m11.a(i10);
                return notificationA3;
            }
            pushMessage.notifyId = i10;
            return notificationA3;
        }
        if (!"styleMultiText".equalsIgnoreCase(strE)) {
            a(intent, pushMessage);
            Intent intentB4 = b(context, intent, i10);
            B b13 = new B(context, c(context));
            b13.f15917v.when = System.currentTimeMillis();
            b13.f15901e = B.b(pushMessage.title);
            b13.f15902f = B.b(pushMessage.content.noticeMsg);
            b13.c(-1);
            b13.f15917v.icon = p025ba.d.core_push_small;
            b13.f15912p = -1;
            b13.d(16, true);
            b13.f15903g = e(context, intentB4, pushMessage);
            return b13.a();
        }
        M m12 = new M(context.getApplicationContext());
        B b14 = new B(context, c(context));
        b14.f15901e = B.b(pushMessage.title);
        b14.f15902f = B.b(pushMessage.content.noticeMsg);
        z zVar = new z(3);
        zVar.f16011c = B.b(pushMessage.content.noticeMsg);
        a(intent, pushMessage);
        Intent intentB5 = b(context, intent, i10);
        b14.f15917v.icon = p025ba.d.core_push_small;
        b14.d(16, true);
        b14.c(-1);
        b14.f15917v.when = System.currentTimeMillis();
        b14.f15906j = 1;
        b14.f(zVar);
        b14.f15903g = e(context, intentB5, pushMessage);
        if (f(i10)) {
            m12.a(i10);
        } else {
            pushMessage.notifyId = i10;
        }
        String strE7 = a.e(pushMessage.content.outsideInsideNotificationInfo, "outsideBtnIcon");
        if (TextUtils.isEmpty(strE7)) {
            b7 = b14;
        } else {
            b7 = b14;
            new Handler(Looper.getMainLooper()).post(new Lb.b(context, strE7, b7, m12, i10));
        }
        return b7.a();
    }
}
