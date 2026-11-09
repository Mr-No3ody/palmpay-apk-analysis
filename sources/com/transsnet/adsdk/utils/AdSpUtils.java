package com.transsnet.adsdk.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.tencent.mmkv.MMKV;
import com.transsnet.adsdk.AdManager;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ApplySharedPref"})
public final class AdSpUtils {
    private static AdSpUtils mInstance;
    private MMKV sp;

    private AdSpUtils(final String spName) {
        try {
            this.sp = MMKV.o(spName);
        } catch (IllegalStateException unused) {
            MMKV.m(AdManager.get().getApp());
            this.sp = MMKV.o(spName);
        }
    }

    public static AdSpUtils getInstance() {
        if (mInstance == null) {
            mInstance = new AdSpUtils("transsnet_ad_config");
        }
        return mInstance;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@NonNull final String key) {
        return this.sp.contains(key);
    }

    public Map<String, ?> getAll() {
        this.sp.getAll();
        throw null;
    }

    public boolean getBoolean(@NonNull final String key) {
        return getBoolean(key, false);
    }

    public int getInt(@NonNull final String key) {
        return getInt(key, -1);
    }

    public long getLong(@NonNull final String key) {
        return getLong(key, -1L);
    }

    public String getString(@NonNull final String key) {
        return getString(key, "");
    }

    public void put(@NonNull final String key, final String value) {
        put(key, value, false);
    }

    public void remove(@NonNull final String key) {
        remove(key, false);
    }

    public void clear(final boolean isCommit) {
        if (isCommit) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.clear().commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.clear().apply();
        }
    }

    public boolean getBoolean(@NonNull final String key, final boolean defaultValue) {
        return this.sp.getBoolean(key, defaultValue);
    }

    public int getInt(@NonNull final String key, final int defaultValue) {
        return this.sp.getInt(key, defaultValue);
    }

    public long getLong(@NonNull final String key, final long defaultValue) {
        return this.sp.getLong(key, defaultValue);
    }

    public String getString(@NonNull final String key, final String defaultValue) {
        return this.sp.getString(key, defaultValue);
    }

    public void put(@NonNull final String key, final String value, final boolean isCommit) {
        if (isCommit) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putString(key, value).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putString(key, value).apply();
        }
    }

    public void remove(@NonNull final String key, final boolean isCommit) {
        if (isCommit) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.remove(key).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.remove(key).apply();
        }
    }

    public void put(@NonNull final String key, final int value) {
        put(key, value, false);
    }

    public void put(@NonNull final String key, final int value, final boolean isCommit) {
        if (isCommit) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putInt(key, value).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putInt(key, value).apply();
        }
    }

    public void put(@NonNull final String key, final long value) {
        put(key, value, false);
    }

    public void put(@NonNull final String key, final long value, final boolean isCommit) {
        if (isCommit) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putLong(key, value).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putLong(key, value).apply();
        }
    }

    public void put(@NonNull final String key, final boolean value) {
        put(key, value, false);
    }

    public void put(@NonNull final String key, final boolean value, final boolean isCommit) {
        if (isCommit) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putBoolean(key, value).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putBoolean(key, value).apply();
        }
    }

    public void put(@NonNull final String key, final Set<String> value) {
        put(key, value, false);
    }

    public void put(@NonNull final String key, final Set<String> value, final boolean isCommit) {
        if (isCommit) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putStringSet(key, value).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putStringSet(key, value).apply();
        }
    }
}
