package Oe;

import M.q;
import Pa.i0;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6842a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f6843b;

    public static Notification a(PushMessage pushMessage) {
        if (!c(pushMessage)) {
            return null;
        }
        PushMessage.Content content = pushMessage.content;
        if (PushMessage.MESSAGE_TYPE_NOTIFICATIONS.equals(content != null ? content.messageType : null)) {
            PushMessage.Content content2 = pushMessage.content;
            String strOptString = content2 != null ? content2.deeplink : null;
            if (!TextUtils.isEmpty(strOptString)) {
                Intrinsics.e(strOptString);
                if (StringsKt.A(strOptString, "Android", false) || StringsKt.A(strOptString, "android", false)) {
                    try {
                        strOptString = new JSONObject(strOptString).optString("Android");
                    } catch (JSONException e10) {
                        F6.d.c("fcm", "parseLinkUrl: ", e10);
                    }
                }
            }
            pushMessage.deeplink = strOptString;
        }
        return d.d(BaseApplication.getContext(), pushMessage);
    }

    public static Notification b(PushMessage pushMessage) {
        Context context = BaseApplication.getContext();
        if (TextUtils.isEmpty(pushMessage.intentAction)) {
            int i7 = d.f6840a;
            if (TextUtils.isEmpty(pushMessage.title)) {
                pushMessage.title = d.f6841b;
            }
            return d.i(context, new Intent("com.transsnet.palmpay.action.notification"), pushMessage);
        }
        int i10 = d.f6840a;
        if (TextUtils.isEmpty(pushMessage.title)) {
            pushMessage.title = d.f6841b;
        }
        Intent intent = new Intent(pushMessage.intentAction);
        if (!i0.g0(context, intent)) {
            intent = new Intent("com.transsnet.palmpay.action.notification");
        }
        return d.i(context, intent, pushMessage);
    }

    public static boolean c(PushMessage pushMessage) {
        PushMessage.Content content = pushMessage.content;
        if (content != null && content.silence) {
            F6.d.h("fcm", 5, "静默推送，不通知");
            return false;
        }
        String str = content != null ? content.messageType : null;
        q qVarA = AbstractC1859i.a(PushMessage.DontShowNotificationTypes);
        while (qVarA.hasNext()) {
            if (Intrinsics.c((String) qVarA.next(), str)) {
                return false;
            }
        }
        return true;
    }
}
