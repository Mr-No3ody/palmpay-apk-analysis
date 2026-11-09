package com.palmpay.lib.liveness.lang;

import android.content.Context;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.F;
import kotlin.text.StringsKt;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import p232p6.p;
import p292t6.a;

/* JADX INFO: loaded from: classes3.dex */
public final class LanguageManager$Companion {
    public /* synthetic */ LanguageManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void init$lib_liveness_release$default(LanguageManager$Companion languageManager$Companion, Context context, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = "en";
        }
        languageManager$Companion.init$lib_liveness_release(context, str);
    }

    private final void loadLanguageResources(Context context, String str) {
        int i7 = a.f42345a;
        a.a("LanguageManager: Attempting to load resources for locale '" + str + "'.");
        String str2 = "lang/" + str + ".json";
        Map<String, String> jsonToMap = parseJsonToMap(parseAssetFile(context, str2, str));
        if (!jsonToMap.isEmpty()) {
            p280s6.a.f42047d.put(str, jsonToMap);
            a.a("LanguageManager: Successfully loaded " + jsonToMap.size() + " translations for '" + str + "'.");
            return;
        }
        a.c("LanguageManager: No translations found or failed to load for '" + str + "' from '" + str2 + "'.");
        if (!Intrinsics.c(str, "en")) {
            LinkedHashMap linkedHashMap = p280s6.a.f42047d;
            if (!linkedHashMap.containsKey("en")) {
                a.c("LanguageManager: Attempting to load fallback default locale 'en'.");
                Map<String, String> jsonToMap2 = parseJsonToMap(parseAssetFile(context, "lang/en.json", "en"));
                if (jsonToMap2.isEmpty()) {
                    a.b("LanguageManager: Failed to load fallback default locale 'en'.");
                } else {
                    linkedHashMap.put("en", jsonToMap2);
                    a.a("LanguageManager: Loaded " + jsonToMap2.size() + " translations for fallback 'en'.");
                }
            }
        }
        LinkedHashMap linkedHashMap2 = p280s6.a.f42047d;
        if (linkedHashMap2.containsKey(str)) {
            return;
        }
        linkedHashMap2.put(str, G.c());
    }

    private final String parseAssetFile(Context context, String str, String str2) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), UserMetadata.MAX_INTERNAL_KEY_SIZE);
            try {
                String strE = p264r5.a.E(bufferedReader);
                bufferedReader.close();
                return strE;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.o(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            int i7 = a.f42345a;
            a.b("LanguageManager: IOException for " + str + " (" + e10.getMessage() + ").");
            if (!Intrinsics.c(str2, "en")) {
                a.c("LanguageManager: Fallback: Attempting to load default asset 'lang/en.json'.");
                try {
                    InputStream inputStreamOpen2 = context.getAssets().open("lang/en.json");
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen2, "open(...)");
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen2, Charsets.UTF_8), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    try {
                        String strE2 = p264r5.a.E(bufferedReader2);
                        bufferedReader2.close();
                        return strE2;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            b.o(bufferedReader2, th3);
                            throw th4;
                        }
                    }
                } catch (IOException e11) {
                    int i10 = a.f42345a;
                    a.b("LanguageManager: Fallback failed: Could not load default asset 'lang/en.json' (" + e11.getMessage() + ").");
                    return "{}";
                }
            }
            return "{}";
        }
    }

    private final Map<String, String> parseJsonToMap(String str) {
        if (StringsKt.F(str) || str.equals("{}")) {
            return G.c();
        }
        try {
            Map<String, String> map = (Map) new Gson().fromJson(str, new TypeToken<Map<String, ? extends String>>() { // from class: com.palmpay.lib.liveness.lang.LanguageManager$Companion$parseJsonToMap$type$1
            }.getType());
            return map == null ? G.c() : map;
        } catch (Exception e10) {
            int i7 = a.f42345a;
            a.b("LanguageManager: Failed to parse JSON to map. Error: " + e10.getMessage() + ". JSON (first 100 chars): " + F.z(100, str));
            return G.c();
        }
    }

    @JvmStatic
    @NotNull
    public final p280s6.a getInstance() {
        if (!p280s6.b.f42050b || p280s6.b.f42049a.getCount() > 0) {
            a.a("LazyLoad.checkLoad: Manager not ready or latch pending. Calling init() to ensure completion.");
            p280s6.b.a();
        }
        try {
            CountDownLatch countDownLatch = p280s6.b.f42049a;
            if (countDownLatch.getCount() > 0) {
                a.a("LazyLoad.checkLoad: Waiting for initialization latch...");
                countDownLatch.await();
                a.a("LazyLoad.checkLoad: Latch released. Core initialization complete.");
            }
            p pVar = p.f41234a;
            Context contextF = p.f();
            if (p280s6.b.f42050b) {
                String str = (String) p280s6.b.f42051c.getAndSet(null);
                if (str != null) {
                    int i7 = a.f42345a;
                    a.a("LazyLoad.checkLoad: Applying final pending target locale '" + str + "' after await (context might have become available).");
                    p280s6.a.f42044a.setLocale$lib_liveness_release(contextF, str);
                }
            } else if (!p280s6.b.f42050b) {
                a.b("LazyLoad.checkLoad: Exiting checkLoad but isManagerInitialized is false. Init likely failed due to missing context.");
            }
        } catch (InterruptedException e10) {
            int i10 = a.f42345a;
            a.b("LazyLoad.checkLoad: Interrupted while waiting for latch: " + e10.getMessage());
            Thread.currentThread().interrupt();
        }
        p280s6.a aVar = p280s6.a.f42045b;
        if (aVar == null) {
            synchronized (this) {
                aVar = p280s6.a.f42045b;
                if (aVar == null) {
                    aVar = new p280s6.a();
                    p280s6.a.f42045b = aVar;
                }
            }
        }
        return aVar;
    }

    @JvmStatic
    @NotNull
    public final String getUserLanguage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (p280s6.a.f42048e == null) {
            p280s6.a.f42048e = context.getApplicationContext();
        }
        String str = p280s6.a.f42046c;
        return StringsKt.F(str) ? "en" : str;
    }

    @JvmStatic
    public final void init$lib_liveness_release(@NotNull Context context, @NotNull String defaultLocale) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultLocale, "defaultLocale");
        p280s6.a.f42048e = context.getApplicationContext();
        p280s6.a.f42046c = defaultLocale;
        Context context2 = p280s6.a.f42048e;
        Intrinsics.e(context2);
        loadLanguageResources(context2, p280s6.a.f42046c);
        if (p280s6.a.f42045b == null) {
            synchronized (this) {
                try {
                    if (p280s6.a.f42045b == null) {
                        p280s6.a.f42045b = new p280s6.a();
                        a.a("LanguageManager.init: Singleton instance created.");
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @JvmStatic
    public final void setLocale$lib_liveness_release(@NotNull Context context, @NotNull String locale) {
        Map map;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (StringsKt.F(locale)) {
            locale = "en";
        }
        if (p280s6.a.f42048e == null) {
            p280s6.a.f42048e = context.getApplicationContext();
            a.c("LanguageManager.setLocale: applicationContext was null, setting now. Ensure init() is called first for proper setup.");
        }
        Context context2 = p280s6.a.f42048e;
        if (context2 == null) {
            a.b("LanguageManager.setLocale: Cannot set locale, applicationContext is still null after checks!");
            return;
        }
        if (Intrinsics.c(p280s6.a.f42046c, locale)) {
            LinkedHashMap linkedHashMap = p280s6.a.f42047d;
            if (linkedHashMap.containsKey(locale) && (map = (Map) linkedHashMap.get(locale)) != null && (!map.isEmpty())) {
                int i7 = a.f42345a;
                a.a("LanguageManager: Locale '" + locale + "' already set and resources loaded.");
                return;
            }
        }
        int i10 = a.f42345a;
        a.a("LanguageManager: Setting locale from '" + p280s6.a.f42046c + "' to '" + locale + "'.");
        p280s6.a.f42046c = locale;
        loadLanguageResources(context2, locale);
    }

    private LanguageManager$Companion() {
    }
}
