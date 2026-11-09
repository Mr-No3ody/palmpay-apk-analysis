package Pa;

import B6.RunnableC0085g;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.StatisticEventFilter;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.init.PpPerfTrace;
import com.transsnet.palmpay.core.util.CustomGioOkhttpModule;
import com.transsnet.palmpay.core.util.statistic.BaseTrackEvent;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.TrackEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class n0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Z4.c f7107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f7108j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile String f7115q;
    public static volatile n0 t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseAnalytics f7120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StatisticEventFilter f7125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7126h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicBoolean f7109k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f7110l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ArrayDeque f7111m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f7112n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicBoolean f7113o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f7114p = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile boolean f7116r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicBoolean f7117s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f7118u = new Object();

    public n0(Context context) {
        User user;
        this.f7119a = context.getApplicationContext();
        if (!AbstractC0520q.f7145k) {
            try {
                this.f7120b = FirebaseAnalytics.getInstance(context);
            } catch (Exception unused) {
            }
        }
        this.f7121c = BaseApplication.get().getVersionName();
        this.f7122d = BaseApplication.getChannel();
        if (this.f7120b != null) {
            E((!BaseApplication.hasLogin() || (user = BaseApplication.getInstance().getUser()) == null) ? null : user.getMemberId());
            this.f7120b.setUserProperty(AppsFlyerProperties.CURRENCY_CODE, BaseApplication.getCurrency());
            this.f7120b.setUserProperty(AppsFlyerProperties.CHANNEL, BaseApplication.getChannel());
        }
    }

    public static HashMap A(Intent intent) {
        HashMap map = new HashMap();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            map.put(LogConstants.Autotrack.INTENT_NAME, intent.getStringExtra(LogConstants.Autotrack.INTENT_NAME));
        } else {
            map.put(LogConstants.Autotrack.INTENT_NAME, action);
        }
        map.put(LogConstants.Autotrack.ELEMENT_PUSH_MSG_TYPE, intent.getStringExtra("extra_msg_type"));
        map.put(LogConstants.Autotrack.ELEMENT_PUSH_BATCH_NO, intent.getStringExtra("extra_push_batch_no"));
        map.put(LogConstants.Autotrack.ELEMENT_EXTRA_ID, intent.getStringExtra("extra_push_msg_id"));
        return map;
    }

    public static void b(Z4.c cVar, String str) {
        if (TextUtils.isEmpty(str)) {
            if (cVar.f23194a) {
                e5.c.f36164a.x(new RunnableC0527y(8));
            }
        } else {
            if (cVar.f23194a) {
                e5.c.f36164a.x(new Da.d(str, 5));
            }
            HashMap map = new HashMap();
            map.put("palmpay_device_id", PhoneUtils.getUniqueId());
            map.put("google_adId", p367ya.a.d().c());
            cVar.a(map);
        }
    }

    public static String f() {
        if (TextUtils.isEmpty(f7108j)) {
            f7108j = PhoneUtils.getUniqueId();
        }
        return EncryptUtils.encryptMD5ToString("" + f7108j + BaseApplication.getInstance().getUser().getMemberId() + System.currentTimeMillis());
    }

    public static n0 g() {
        n0 n0Var;
        n0 n0Var2 = t;
        if (n0Var2 != null) {
            return n0Var2;
        }
        synchronized (f7118u) {
            try {
                if (t == null) {
                    t = new n0(BaseApplication.getContext());
                }
                n0Var = t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n0Var;
    }

    public static String h(String str, boolean z3) {
        if ("2".equals(str)) {
            return z3 ? "PAY_FUND_WITH_OLD_CARD" : "PAY_FUND_WITH_NEW_CARD";
        }
        if ("3".equals(str)) {
            return z3 ? "PAY_WITHDRAW_WITH_OLD_CARD" : "PAY_WITHDRAW_WITH_NEW_CARD";
        }
        if ("0".equals(str)) {
            return z3 ? "PAY_AIRTIME_WITH_OLD_CARD" : "PAY_AIRTIME_WITH_NEW_CARD";
        }
        if ("1".equals(str)) {
            return z3 ? "PAY_SEND_MONEY_WITH_OLD_CARD" : "PAY_SEND_MONEY_WITH_NEW_CARD";
        }
        return "";
    }

    public static void p(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                TrackEvent trackEventAfEvt = new TrackEvent("track_deep_link").afEvt(true);
                trackEventAfEvt.add(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, data.toString());
                for (String str : data.getQueryParameterNames()) {
                    if (!TextUtils.isEmpty(str) && (str.startsWith("pp_") || AFInAppEventParameterName.AF_CHANNEL.equals(str) || "shortlink".equals(str) || "url".equals(str) || "af_dp".equals(str))) {
                        trackEventAfEvt.add(str, data.getQueryParameter(str));
                    }
                }
                g().q(trackEventAfEvt);
            }
        } catch (Exception unused) {
        }
    }

    public static Bundle x(Map map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            try {
                if (value instanceof String) {
                    bundle.putString(str, (String) value);
                } else if (value instanceof Integer) {
                    bundle.putInt(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(str, ((Long) value).longValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Double) {
                    bundle.putDouble(str, ((Double) value).doubleValue());
                } else if (value instanceof Float) {
                    bundle.putFloat(str, ((Float) value).floatValue());
                }
            } catch (Exception e10) {
                F6.d.c("StatisticsUtil", "mapToBundle: ", e10);
            }
        }
        return bundle;
    }

    public static HashMap y(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            try {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    map2.put(str, (String) value);
                } else {
                    map2.put(str, String.valueOf(value));
                }
            } catch (Exception e10) {
                F6.d.c("StatisticsUtil", "mapToStringMap: ", e10);
            }
        }
        return map2;
    }

    public static TrackEvent z(String str) {
        return new TrackEvent(str).afEvt(false);
    }

    public final void B(String str, HashMap map) {
        try {
            if (!f7110l || f7107i == null) {
                d(str, map);
            } else {
                f7107i.c(str, map);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void C() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            F6.d.h("StatisticsUtil", 5, "tryInitGrowingIOOnce: require main thread");
            return;
        }
        AtomicBoolean atomicBoolean = f7109k;
        if (atomicBoolean.compareAndSet(false, true)) {
            synchronized (f7114p) {
                if (f7107i != null) {
                    return;
                }
                try {
                    Z4.c cVarI = i(this.f7119a);
                    if (cVarI == null) {
                        atomicBoolean.set(false);
                        return;
                    }
                    f7107i = cVarI;
                    f7110l = true;
                    if (f7116r) {
                        b(cVarI, f7115q);
                        f7116r = false;
                        f7115q = null;
                    }
                    e();
                } catch (Throwable th) {
                    f7109k.set(false);
                    F6.d.c("StatisticsUtil", "tryInitGrowingIOOnce failed", th);
                }
            }
        }
    }

    public final void D(String str) {
        E(str);
        try {
            HashMap map = new HashMap();
            map.put(AppsFlyerProperties.CHANNEL, BaseApplication.getChannel());
            map.put(AdRevenueScheme.COUNTRY, BaseApplication.getCountryLocale());
            if (!TextUtils.isEmpty(str)) {
                map.put("member_id", str);
            }
            AppsFlyerLib.getInstance().setAdditionalData(map);
        } catch (Exception e10) {
            Log.e("StatisticsUtil", "updateUserId for appsflyer: ", e10);
        }
        if (BaseApplication.isFirebaseInitialized()) {
            try {
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                if (firebaseCrashlytics != null) {
                    firebaseCrashlytics.setUserId(TextUtils.isEmpty(str) ? "" : str);
                }
            } catch (Throwable unused) {
            }
        }
        synchronized (f7114p) {
            try {
                Z4.c cVar = f7107i;
                if (cVar != null) {
                    b(cVar, str);
                } else {
                    f7115q = str;
                    f7116r = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7123e = f();
    }

    public final void E(String str) {
        FirebaseAnalytics firebaseAnalytics = this.f7120b;
        if (firebaseAnalytics == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            firebaseAnalytics.setUserId(null);
            return;
        }
        firebaseAnalytics.setUserId(str);
        User user = BaseApplication.getInstance().getUser();
        if (user != null) {
            String phoneNumber = user.getPhoneNumber();
            if (TextUtils.isEmpty(phoneNumber)) {
                return;
            }
            firebaseAnalytics.setUserProperty("phone", r0.w0(phoneNumber));
        }
    }

    public final void a(Map map) {
        if (TextUtils.isEmpty(f7108j)) {
            f7108j = PhoneUtils.getUniqueId();
        }
        map.put("app_info", "PalmPay_" + this.f7121c + "_" + BaseApplication.getCurrency());
        map.put("device_info", f7108j + "/" + DeviceUtils.getModel() + "/-1");
        map.put(AppsFlyerProperties.CHANNEL, this.f7122d);
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        if (TextUtils.isEmpty(this.f7123e) || this.f7124f + 120000 < System.currentTimeMillis()) {
            this.f7123e = f();
        }
        this.f7124f = System.currentTimeMillis();
        map.put("session_id", this.f7123e);
    }

    public final Boolean c(String str, String str2) {
        if (!this.f7126h) {
            if (this.f7125g == null) {
                String strH = p059e1.a.H("statistics_sp_key_statistic_event_filter");
                if (TextUtils.isEmpty(strH)) {
                    this.f7126h = true;
                    return null;
                }
                F6.d.h("StatisticsUtil", 3, C0.G.o("checkEventByFilter: ", strH));
                C0525w.f().getClass();
                this.f7125g = (StatisticEventFilter) C0525w.d(strH, StatisticEventFilter.class);
            }
            StatisticEventFilter statisticEventFilter = this.f7125g;
            if (statisticEventFilter != null) {
                return statisticEventFilter.isAllow(str, str2);
            }
        }
        return null;
    }

    public final void d(String str, HashMap map) {
        Z4.c cVar;
        ArrayDeque arrayDeque;
        m0 m0Var;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f7112n) {
            try {
                cVar = f7110l ? f7107i : null;
                if (cVar == null) {
                    while (true) {
                        arrayDeque = f7111m;
                        if (arrayDeque.size() < 100 || (m0Var = (m0) arrayDeque.pollFirst()) == null) {
                            break;
                            break;
                        }
                        F6.d.h("StatisticsUtil", 5, "pending GIO queue full, drop oldest: " + m0Var.f7103a);
                    }
                    arrayDeque.offerLast(new m0(str, map));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar == null) {
            if (f7110l) {
                e();
            }
        } else {
            try {
                cVar.c(str, map);
            } catch (Exception e10) {
                F6.d.c("StatisticsUtil", "enqueuePendingGioEvent direct track failed", e10);
            }
        }
    }

    public final void e() {
        if (f7110l && f7113o.compareAndSet(false, true)) {
            T.b(-4).execute(new M7.s(this, 9));
        }
    }

    public final Z4.c i(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return null;
        }
        PpPerfTrace.begin("initGrowingIO");
        try {
            Log.e("StatisticsUtil", "initGrowingIO");
            int i7 = AbstractC0520q.f7145k ? 50 : 2;
            String string = context.getString(p025ba.k.growingio_datasource_id);
            p1.d dVar = new p1.d(context.getString(p025ba.k.growingio_account_id), context.getString(p025ba.k.growingio_url_scheme));
            com.growingio.android.sdk.a aVar = (com.growingio.android.sdk.a) dVar.f41178b;
            aVar.getClass();
            if (!TextUtils.isEmpty("https://accept.palmpay-inc.com")) {
                aVar.f23191j = "https://accept.palmpay-inc.com";
            }
            ((Z4.b) ((HashMap) dVar.f41179c).get(Z4.b.class)).f11510a = string;
            aVar.f23190i = false;
            aVar.f23185c = BaseApplication.getChannel();
            aVar.f23187e = 10;
            aVar.f23186d = 5;
            aVar.f23188f = Math.max(1, i7);
            aVar.f23189g = Math.max(1, 50);
            aVar.f23192o |= 4093;
            aVar.f23193p.add(new CustomGioOkhttpModule());
            Z4.e.M(BaseApplication.getApplication(), dVar);
            Z4.c cVarF = Z4.e.f();
            String strI = p367ya.a.d().i();
            if (cVarF.f23194a) {
                e5.c.f36164a.x(new Da.d(strI, 5));
            }
            HashMap map = new HashMap();
            map.put("palmpay_device_id", PhoneUtils.getUniqueId());
            map.put("google_adId", p367ya.a.d().c());
            Z4.e.f().a(map);
            if (f7117s.compareAndSet(false, true)) {
                e5.c.f36164a.w(new l0(this, string));
            }
            return Z4.e.f();
        } finally {
            PpPerfTrace.end();
        }
    }

    public final void j(Map map) {
        TrackEvent trackEventFbEvt = z("event_track_activity_screen").fbEvt(false);
        trackEventFbEvt.add("event_type", "View_Event");
        if (map != null) {
            trackEventFbEvt.putAll(map);
        }
        q(trackEventFbEvt);
        String str = map != null ? (String) map.get(LogConstants.Autotrack.PAGE_NAME) : null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TrackEvent trackEventAfEvt = new TrackEvent(str).afEvt(false);
        trackEventAfEvt.add("event_type", "View_Event");
        if (map != null) {
            trackEventAfEvt.putAll(map);
        }
        q(trackEventAfEvt);
    }

    public final void k(ClickEvent clickEvent) {
        if (clickEvent == null) {
            return;
        }
        q(clickEvent);
    }

    public final void l(String str) {
        q(new ClickEvent(str));
    }

    public final void m(String str, String str2, String str3) {
        k(((ClickEvent) C0.G.f(str, "element_name", str2)).add("element_details", str3));
    }

    public final void n(String str, Map map) {
        ClickEvent clickEvent = new ClickEvent(str);
        if (map != null && !map.isEmpty()) {
            clickEvent.putAll(map);
        }
        q(clickEvent);
    }

    public final void o(String str, String str2, String... strArr) {
        TrackEvent trackEvent = new TrackEvent(str);
        trackEvent.add("log_tag", str2);
        try {
            if (strArr.length > 0) {
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    trackEvent.add("EVENT_EXTRA_" + i7, strArr[i7]);
                }
            }
        } catch (Exception unused) {
        }
        q(trackEvent);
    }

    public final void q(BaseTrackEvent baseTrackEvent) {
        T.b(-4).execute(new RunnableC0085g(18, this, baseTrackEvent));
    }

    public final void r(String str, Map map) {
        TrackEvent trackEvent = new TrackEvent(str);
        if (map != null && !map.isEmpty()) {
            trackEvent.putAll(map);
        }
        q(trackEvent);
    }

    public final void s(String str) {
        TrackEvent trackEvent = new TrackEvent(str);
        HashMap map = new HashMap();
        map.put("event_name", str);
        q(trackEvent.putAll(map));
    }

    public final void t(String str) {
        TrackEvent trackEvent = new TrackEvent("FB_PPRNActivity");
        HashMap map = new HashMap();
        map.put("value", str);
        q(trackEvent.putAll(map));
    }

    public final void u(ViewEvent viewEvent) {
        if (viewEvent == null) {
            return;
        }
        q(viewEvent);
    }

    public final void v(String str) {
        q(new ViewEvent(str));
    }

    public final void w(String str, Map map) {
        ViewEvent viewEvent = new ViewEvent(str);
        if (map != null && map.size() > 0) {
            viewEvent.putAll(map);
        }
        q(viewEvent);
    }
}
