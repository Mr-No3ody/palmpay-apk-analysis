package com.growingio.android.sdk.track.ipc;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IDataSharer {
    int getAndAddInt(String key, int delta, int startValue);

    long getAndAddLong(String key, long delta, long startValue);

    int getAndDecrementInt(String key, int startValue);

    int getAndDelInt(String key, int delta, int startValue);

    int getAndIncrementInt(String key, int startValue);

    long getAndIncrementLong(String key, long startValue);

    boolean getBoolean(String key, boolean defValue);

    float getFloat(String key, float defValue);

    int getInt(String key, int defValue);

    List<Integer> getIntArray(String key, List<Integer> defValue);

    long getLong(String key, long defValue);

    @Nullable
    String getString(String key, @Nullable String defValue);

    void putBoolean(String key, boolean value);

    void putFloat(String key, float value);

    void putInt(String key, int value);

    void putIntArray(String key, List<Integer> value);

    void putLong(String key, long value);

    void putMultiString(Map<String, String> values);

    void putString(String key, @Nullable String value);
}
