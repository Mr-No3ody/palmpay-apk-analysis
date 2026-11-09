package p367ya;

import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.update.AppUpdate;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MMKV f44150a;

    public static synchronized MMKV a() {
        try {
            if (f44150a == null) {
                f44150a = MMKV.o("query_bean");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44150a;
    }

    public static boolean b() {
        return c().versionCode > BaseApplication.get().getVersionCode();
    }

    public static AppUpdate.VersionBean c() {
        AppUpdate.VersionBean versionBean = new AppUpdate.VersionBean();
        MMKV mmkvA = a();
        versionBean.apkLink = mmkvA.getString("apk_url", "");
        versionBean.versionCode = mmkvA.getInt("version_code", 1);
        versionBean.version = mmkvA.getString("version_name", "");
        return versionBean;
    }
}
