package com.transsnet.analysis.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class GsonUtil {
    private static volatile GsonUtil sInstance;
    private final Gson mGson = new GsonBuilder().disableHtmlEscaping().create();

    private GsonUtil() {
    }

    public static GsonUtil get() {
        if (sInstance == null) {
            synchronized (GsonUtil.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new GsonUtil();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.length() < 50) {
            try {
                return (T) this.mGson.fromJson(str, (Class) cls);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                jsonReader.setLenient(true);
                T t = this.mGson.getAdapter(TypeToken.get((Class) cls)).read2(jsonReader);
                jsonReader.close();
                return t;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public String toJson(Object object) {
        return this.mGson.toJson(object);
    }

    public <T> String toJson(Object object, Class<T> classOfT) {
        return this.mGson.toJson(object, classOfT);
    }

    public <T> T fromJson(String str, Type type) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.length() < 50) {
            try {
                return (T) this.mGson.fromJson(str, type);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                jsonReader.setLenient(true);
                T t = this.mGson.getAdapter(TypeToken.get(type)).read2(jsonReader);
                jsonReader.close();
                return t;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public <T> T fromJson(JsonObject jsonObject, Class<T> cls) {
        try {
            return (T) this.mGson.fromJson((JsonElement) jsonObject, (Class) cls);
        } catch (Exception unused) {
            return null;
        }
    }
}
