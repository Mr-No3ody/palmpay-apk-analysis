package com.transsnet.palmpay.util;

import M.n;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.tencent.mmkv.MMKV;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ApplySharedPref"})
public final class SPUtils {
    private static n SP_UTILS_MAP = new n(0);
    private MMKV sp;

    private SPUtils(String str) {
        try {
            this.sp = MMKV.o(str);
        } catch (IllegalStateException unused) {
            MMKV.m(Utils.getApp());
            this.sp = MMKV.o(str);
        }
    }

    public static SPUtils get() {
        return getInstance("");
    }

    public static SPUtils getInstance() {
        return getInstance("");
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@NonNull String str) {
        return this.sp.contains(str);
    }

    public Map<String, ?> getAll() {
        this.sp.getAll();
        throw null;
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public float getFloat(@NonNull String str) {
        return getFloat(str, -1.0f);
    }

    public int getInt(@NonNull String str) {
        return getInt(str, -1);
    }

    public long getLong(@NonNull String str) {
        return getLong(str, -1L);
    }

    public String getString(@NonNull String str) {
        return getString(str, "");
    }

    public Set<String> getStringSet(@NonNull String str) {
        return getStringSet(str, Collections.EMPTY_SET);
    }

    public void put(@NonNull String str, @NonNull String str2) {
        put(str, str2, false);
    }

    public void remove(@NonNull String str) {
        remove(str, false);
    }

    public static synchronized SPUtils getInstance(String str) {
        SPUtils sPUtils;
        try {
            if (isSpace(str)) {
                str = "spUtils";
            }
            sPUtils = (SPUtils) SP_UTILS_MAP.get(str);
            if (sPUtils == null) {
                sPUtils = new SPUtils(str);
                SP_UTILS_MAP.put(str, sPUtils);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sPUtils;
    }

    public void clear(boolean z3) {
        if (z3) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.clear().commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.clear().apply();
        }
    }

    public boolean getBoolean(@NonNull String str, boolean z3) {
        return this.sp.getBoolean(str, z3);
    }

    public float getFloat(@NonNull String str, float f10) {
        return this.sp.getFloat(str, f10);
    }

    public int getInt(@NonNull String str, int i7) {
        return this.sp.getInt(str, i7);
    }

    public long getLong(@NonNull String str, long j6) {
        return this.sp.getLong(str, j6);
    }

    public String getString(@NonNull String str, @NonNull String str2) {
        return this.sp.getString(str, str2);
    }

    public Set<String> getStringSet(@NonNull String str, @NonNull Set<String> set) {
        return this.sp.d(str, set);
    }

    public void put(@NonNull String str, @NonNull String str2, boolean z3) {
        if (z3) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putString(str, str2).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putString(str, str2).apply();
        }
    }

    public void remove(@NonNull String str, boolean z3) {
        if (z3) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.remove(str).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.remove(str).apply();
        }
    }

    public void put(@NonNull String str, int i7) {
        put(str, i7, false);
    }

    public void put(@NonNull String str, int i7, boolean z3) {
        if (z3) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putInt(str, i7).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putInt(str, i7).apply();
        }
    }

    public void put(@NonNull String str, long j6) {
        put(str, j6, false);
    }

    public void put(@NonNull String str, long j6, boolean z3) {
        if (z3) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putLong(str, j6).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putLong(str, j6).apply();
        }
    }

    public void put(@NonNull String str, float f10) {
        put(str, f10, false);
    }

    public void put(@NonNull String str, float f10, boolean z3) {
        if (z3) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putFloat(str, f10).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putFloat(str, f10).apply();
        }
    }

    public void put(@NonNull String str, boolean z3) {
        put(str, z3, false);
    }

    public void put(@NonNull String str, boolean z3, boolean z8) {
        if (z8) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putBoolean(str, z3).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putBoolean(str, z3).apply();
        }
    }

    public void put(@NonNull String str, @NonNull Set<String> set) {
        put(str, set, false);
    }

    public void put(@NonNull String str, @NonNull Set<String> set, boolean z3) {
        if (z3) {
            MMKV mmkv = this.sp;
            mmkv.getClass();
            mmkv.putStringSet(str, set).commit();
        } else {
            MMKV mmkv2 = this.sp;
            mmkv2.getClass();
            mmkv2.putStringSet(str, set).apply();
        }
    }
}
