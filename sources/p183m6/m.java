package p183m6;

import O2.a;
import Og.b;
import android.content.Context;
import android.os.Looper;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.J;
import okhttp3.S;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p199n6.c;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void checkInitialized() {
        if (!n.f39525c || n.f39524b == null) {
            throw new IllegalStateException("PalmPayRemoteConfig is not initialized. Call PalmPayRemoteConfig.init(context, remoteConfigSettings) first.");
        }
    }

    public final void init(@NotNull Context context, @NotNull s remoteConfigSettings) {
        String baseUrl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteConfigSettings, "remoteConfigSettings");
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("PalmPayRemoteConfig.init() must NOT be called on the main thread.");
        }
        String str = remoteConfigSettings.f39545e;
        int i7 = remoteConfigSettings.f39543c;
        if (i7 == 0) {
            baseUrl = "pk".equalsIgnoreCase(str) ? "https://api-dev.palmpay.pk" : "https://nebula-dev.palmpay-inc.com";
        } else if (i7 == 1) {
            baseUrl = "pk".equalsIgnoreCase(str) ? "https://api-daily.palmpay.pk" : "https://nebula-daily.palmpay-inc.com";
        } else if (i7 == 2) {
            baseUrl = "pk".equalsIgnoreCase(str) ? "https://api-sit.palmpay.pk" : "https://nebula-gray.palmpay-inc.com";
        } else if (i7 != 3) {
            baseUrl = "pk".equalsIgnoreCase(str) ? "https://api.palmpay.pk" : "https://nebula-prod.palmpay-inc.com";
        } else {
            baseUrl = "pk".equalsIgnoreCase(str) ? "https://api-pre.palmpay.pk" : "https://nebula-pre.palmpay-inc.com";
        }
        int i10 = remoteConfigSettings.f39543c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(remoteConfigSettings, "remoteConfigSettings");
        a aVar = new a();
        aVar.f6553a = null;
        aVar.f6554b = null;
        aVar.f6553a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        aVar.f6554b = k.b(context);
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s3.b(20L, timeUnit);
        s3.e(20L, timeUnit);
        s3.a(new p199n6.a(aVar, remoteConfigSettings));
        b bVar = new b(new p184m8.b(1));
        Og.a level = i10 == 4 ? Og.a.f6844a : Og.a.f6847d;
        Intrinsics.checkNotNullParameter(level, "level");
        bVar.f6851c = level;
        s3.a(bVar);
        aVar.f6555c = new U(s3);
        try {
            aVar.f6556d = J.f40577k.get(baseUrl);
            init(new i(context, new c(aVar, context), null, new e(context, remoteConfigSettings.f39541a), remoteConfigSettings, 84), remoteConfigSettings);
        } catch (IllegalArgumentException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw new p104gg.c("An invalid URL was provided for the Remote Config base url.", exception);
        }
    }

    @JvmStatic
    @NotNull
    public final n instance() {
        return instance(n.f39526d);
    }

    @JvmStatic
    public final boolean isInitialized() {
        return n.f39525c;
    }

    @JvmStatic
    public final void setContext(@Nullable Context context) {
        n.f39526d = context != null ? context.getApplicationContext() : null;
    }

    private m() {
    }

    @JvmStatic
    @NotNull
    public final n instance(@Nullable Context context) {
        if (context == null) {
            checkInitialized();
            n nVar = n.f39524b;
            if (nVar != null) {
                return nVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (n.f39524b == null) {
            n.f39524b = new l(context);
        }
        n nVar2 = n.f39524b;
        Intrinsics.e(nVar2);
        return nVar2;
    }

    private final synchronized void init(i iVar, s sVar) {
        n.f39524b = new q(iVar, sVar.f39547g);
        n.f39525c = true;
    }
}
