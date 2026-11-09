package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.A;
import androidx.core.app.B;
import androidx.core.app.z;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonNotificationBuilder {
    private static final String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f22995id;
        public final B notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(B b7, String str, int i7) {
            this.notificationBuilder = b7;
            this.tag = str;
            this.f22995id = i7;
        }
    }

    private CommonNotificationBuilder() {
    }

    @Nullable
    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent intentCreateTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (intentCreateTargetIntent == null) {
            return null;
        }
        intentCreateTargetIntent.addFlags(67108864);
        intentCreateTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            intentCreateTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), intentCreateTargetIntent, getPendingIntentFlags(1073741824));
    }

    @Nullable
    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent(ACTION_RECEIVER).setPackage(context2.getPackageName()).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), getPendingIntentFlags(1073741824));
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(link);
        return intent2;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i7 = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i7 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(context.getColor(i7));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z3 = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r3 = z3;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r3 = (z3 ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? r3 | 4 : r3;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    @VisibleForTesting
    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string2 = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (!TextUtils.isEmpty(string2) && notificationManager.getNotificationChannel(string2) != null) {
                return string2;
            }
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e(Constants.TAG, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE;
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(com.google.android.gms.internal.measurement.a.d(string));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i7) {
        return i7 | 67108864;
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
        }
        int i7 = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i7 == 0 || !isValidIcon(resources, i7)) {
            try {
                i7 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.toString();
            }
        }
        return (i7 == 0 || !isValidIcon(resources, i7)) ? android.R.drawable.sym_def_app_icon : i7;
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if (GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT.equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean isValidIcon(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!com.google.android.gms.internal.measurement.a.D(resources.getDrawable(i7, null))) {
                return true;
            }
            Log.e(Constants.TAG, "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e(Constants.TAG, "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean shouldUploadMetrics(@NonNull NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        B b7 = new B(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            b7.f15901e = B.b(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            b7.f15902f = B.b(possiblyLocalizedString2);
            z zVar = new z(3);
            zVar.f16011c = B.b(possiblyLocalizedString2);
            b7.f(zVar);
        }
        b7.f15917v.icon = getSmallIcon(packageManager, resources, packageName, notificationParams.getString(Constants.MessageNotificationKeys.ICON), bundle);
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            Notification notification = b7.f15917v;
            notification.sound = sound;
            notification.audioStreamType = -1;
            notification.audioAttributes = A.a(A.d(A.c(A.b(), 4), 5));
        }
        b7.f15903g = createContentIntent(context, notificationParams, packageName, packageManager);
        PendingIntent pendingIntentCreateDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (pendingIntentCreateDeleteIntent != null) {
            b7.f15917v.deleteIntent = pendingIntentCreateDeleteIntent;
        }
        Integer color = getColor(context2, notificationParams.getString(Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            b7.f15912p = color.intValue();
        }
        b7.d(16, !notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY));
        b7.f15909m = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            b7.f15917v.tickerText = B.b(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            b7.f15906j = notificationPriority.intValue();
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            b7.f15913q = visibility.intValue();
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            b7.f15905i = notificationCount.intValue();
        }
        Long l5 = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l5 != null) {
            b7.f15907k = true;
            b7.f15917v.when = l5.longValue();
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            b7.f15917v.vibrate = vibrateTimings;
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            int i7 = lightSettings[0];
            int i10 = lightSettings[1];
            int i11 = lightSettings[2];
            Notification notification2 = b7.f15917v;
            notification2.ledARGB = i7;
            notification2.ledOnMS = i10;
            notification2.ledOffMS = i11;
            notification2.flags = (notification2.flags & (-2)) | ((i10 == 0 || i11 == 0) ? 0 : 1);
        }
        b7.c(getConsolidatedDefaults(notificationParams));
        return new DisplayNotificationInfo(b7, getTag(notificationParams), 0);
    }
}
