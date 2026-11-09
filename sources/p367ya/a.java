package p367ya;

import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.util.SPUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f44147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f44148c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MMKV f44149a = MMKV.p("d");

    public static a d() {
        a aVar;
        a aVar2 = f44147b;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (f44148c) {
            try {
                if (f44147b == null) {
                    BaseApplication.getContext();
                    f44147b = new a();
                }
                aVar = f44147b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static long h(int i7) {
        long j6 = SPUtils.getInstance().getLong("LastReadMessageId_" + i7, 0L);
        if (j6 > 0) {
            return j6;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SPUtils.getInstance().put("LastReadMessageId_" + i7, jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    public final boolean a() {
        if (BaseApplication.hasLogin()) {
            MMKV mmkv = this.f44149a;
            if (mmkv.getInt("key_rate_dialog_show_status", 0) != 1) {
                long j6 = mmkv.getLong("key_rate_dialog_show_time", -1L);
                if (System.currentTimeMillis() - j6 > 2592000000L || j6 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        p059e1.a.X("key_touch_id", false);
        MMKV mmkv = this.f44149a;
        mmkv.remove("member_id");
        mmkv.remove("key_notification");
        BaseApplication.get().setToken("");
        mmkv.remove("key_invitation_code");
        mmkv.remove("key_last_known_location");
        mmkv.remove("key_new_contact_request_num");
        mmkv.remove("key_new_contact_request_member");
        mmkv.remove("PATTERN_LOCK_ERROR_COUNT");
        c.e(true);
        SPUtils.getInstance().remove("LastReadMessageId_", true);
    }

    public final String c() {
        return this.f44149a.getString("advertising_id", "");
    }

    public final String e(String str) {
        if (TextUtils.isEmpty(i())) {
            return str;
        }
        return i() + "_" + str;
    }

    public final LocationRecord f() {
        String string = this.f44149a.getString("key_last_known_location", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new LocationRecord(string);
    }

    public final String g() {
        return this.f44149a.getString("last_phone_number", "");
    }

    public final String i() {
        return this.f44149a.getString("member_id", "");
    }

    public final void j() {
        this.f44149a.g(System.currentTimeMillis(), "key_rate_dialog_show_time");
    }
}
