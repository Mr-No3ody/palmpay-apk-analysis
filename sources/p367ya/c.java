package p367ya;

import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.update.AppUpdate;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MMKV f44151a;

    public static boolean a() {
        if (c()) {
            return b().getBoolean("force_update", false);
        }
        return false;
    }

    public static synchronized MMKV b() {
        try {
            if (f44151a == null) {
                f44151a = MMKV.o("update_bean");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44151a;
    }

    public static boolean c() {
        return d().versionCode > BaseApplication.get().getVersionCode();
    }

    public static AppUpdate.VersionBean d() {
        AppUpdate.VersionBean versionBean = new AppUpdate.VersionBean();
        MMKV mmkvB = b();
        versionBean.apkMd5 = mmkvB.getString("apk_md5", "");
        versionBean.apkLink = mmkvB.getString("apk_url", "");
        versionBean.versionCode = mmkvB.getInt("version_code", 1);
        versionBean.isLocal = mmkvB.getBoolean("local_update", false);
        versionBean.isForce = mmkvB.getBoolean("force_update", false);
        versionBean.releaseNote = mmkvB.getString("release_note", "");
        versionBean.version = mmkvB.getString("version_name", "");
        versionBean.isSilent = mmkvB.getBoolean("isSilent", false);
        versionBean.disableVersionCodes = mmkvB.getString("disable_version_codes", "");
        return versionBean;
    }

    public static void e(boolean z3) {
        MMKV mmkvB = b();
        if (z3) {
            mmkvB.putInt("show_count", 0);
            mmkvB.putLong("next_show_time", 0L);
        } else {
            mmkvB.putInt("show_count", mmkvB.getInt("show_count", 0) + 1);
            mmkvB.putLong("next_show_time", System.currentTimeMillis() + 86400000);
        }
    }

    public static void f(AppUpdate.VersionBean versionBean) {
        if (versionBean == null) {
            return;
        }
        MMKV mmkvB = b();
        mmkvB.putInt("version_code", versionBean.versionCode);
        mmkvB.putString("version_name", versionBean.version);
        mmkvB.putBoolean("force_update", versionBean.isForce);
        mmkvB.putBoolean("isSilent", versionBean.isSilent);
        mmkvB.putString("release_note", versionBean.releaseNote);
        mmkvB.putString("apk_url", versionBean.apkLink);
        mmkvB.putString("apk_md5", versionBean.apkMd5);
        mmkvB.putBoolean("local_update", versionBean.isLocal);
        mmkvB.putString("disable_version_codes", versionBean.disableVersionCodes);
    }
}
