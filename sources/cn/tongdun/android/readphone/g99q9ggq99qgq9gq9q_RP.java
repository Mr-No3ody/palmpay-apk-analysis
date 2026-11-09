package cn.tongdun.android.readphone;

import android.content.Context;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g99q9ggq99qgq9gq9q_RP {
    private static Map n0(Context context, HashMap map, TelephonyManager telephonyManager) {
        return q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context, telephonyManager);
    }

    private static String n1(Context context) {
        return String.valueOf(SubscriptionManager.from(context).getActiveSubscriptionInfoCount());
    }

    private static void n100() {
        q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
    }
}
