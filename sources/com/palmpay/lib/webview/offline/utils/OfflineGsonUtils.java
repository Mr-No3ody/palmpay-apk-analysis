package com.palmpay.lib.webview.offline.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineGsonUtils {
    private static final Gson GSON = new GsonBuilder().serializeNulls().enableComplexMapKeySerialization().create();

    public static class ParameterizedTypeImpl implements ParameterizedType {
        Class clazz;

        public ParameterizedTypeImpl(Class cls) {
            this.clazz = cls;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return new Type[]{this.clazz};
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return List.class;
        }
    }

    private OfflineGsonUtils() {
    }

    public static Object fromJson(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            return GSON.fromJson(str, type);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> fromJsonToList(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (List) GSON.fromJson(str, new ParameterizedTypeImpl(cls));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static <T> Set<T> fromJsonToSet(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (Set) GSON.fromJson(str, new ParameterizedTypeImpl(cls));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String toJson(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return GSON.toJson(obj);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) GSON.fromJson(str, (Class) cls);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static <T> T fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) GSON.fromJson(str, new TypeToken<T>() { // from class: com.palmpay.lib.webview.offline.utils.OfflineGsonUtils.1
            }.getType());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
