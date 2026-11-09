package com.facebook.react.modules.network;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.C1929i;
import okhttp3.S;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0011\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/facebook/react/modules/network/OkHttpClientProvider;", "", "<init>", "()V", "Lcom/facebook/react/modules/network/OkHttpClientFactory;", "factory", "", "setOkHttpClientFactory", "(Lcom/facebook/react/modules/network/OkHttpClientFactory;)V", "Lokhttp3/U;", "getOkHttpClient", "()Lokhttp3/U;", "createClient", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Lokhttp3/U;", "Lokhttp3/S;", "createClientBuilder", "()Lokhttp3/S;", "(Landroid/content/Context;)Lokhttp3/S;", "", "cacheSize", "(Landroid/content/Context;I)Lokhttp3/S;", "client", "Lokhttp3/U;", "getClient$ReactAndroid_release", "setClient$ReactAndroid_release", "(Lokhttp3/U;)V", "Lcom/facebook/react/modules/network/OkHttpClientFactory;", "getFactory$ReactAndroid_release", "()Lcom/facebook/react/modules/network/OkHttpClientFactory;", "setFactory$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkHttpClientProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClientProvider.kt\ncom/facebook/react/modules/network/OkHttpClientProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class OkHttpClientProvider {

    @NotNull
    public static final OkHttpClientProvider INSTANCE = new OkHttpClientProvider();

    @Nullable
    private static U client;

    @Nullable
    private static OkHttpClientFactory factory;

    private OkHttpClientProvider() {
    }

    @JvmStatic
    @NotNull
    public static final U createClient() {
        U uCreateNewNetworkModuleClient;
        OkHttpClientFactory okHttpClientFactory = factory;
        if (okHttpClientFactory != null && (uCreateNewNetworkModuleClient = okHttpClientFactory.createNewNetworkModuleClient()) != null) {
            return uCreateNewNetworkModuleClient;
        }
        S sCreateClientBuilder = createClientBuilder();
        sCreateClientBuilder.getClass();
        return new U(sCreateClientBuilder);
    }

    @JvmStatic
    @NotNull
    public static final S createClientBuilder() {
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s3.b(0L, timeUnit);
        s3.e(0L, timeUnit);
        s3.f(0L, timeUnit);
        ReactCookieJarContainer cookieJar = new ReactCookieJarContainer();
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        s3.f40624j = cookieJar;
        return s3;
    }

    @JvmStatic
    @NotNull
    public static final U getOkHttpClient() {
        U u6 = client;
        if (u6 != null) {
            return u6;
        }
        U uCreateClient = createClient();
        client = uCreateClient;
        return uCreateClient;
    }

    @JvmStatic
    public static final void setOkHttpClientFactory(@Nullable OkHttpClientFactory factory2) {
        factory = factory2;
    }

    @Nullable
    public final U getClient$ReactAndroid_release() {
        return client;
    }

    @Nullable
    public final OkHttpClientFactory getFactory$ReactAndroid_release() {
        return factory;
    }

    public final void setClient$ReactAndroid_release(@Nullable U u6) {
        client = u6;
    }

    public final void setFactory$ReactAndroid_release(@Nullable OkHttpClientFactory okHttpClientFactory) {
        factory = okHttpClientFactory;
    }

    @JvmStatic
    @NotNull
    public static final U createClient(@NotNull Context context) {
        U uCreateNewNetworkModuleClient;
        Intrinsics.checkNotNullParameter(context, "context");
        OkHttpClientFactory okHttpClientFactory = factory;
        if (okHttpClientFactory != null && (uCreateNewNetworkModuleClient = okHttpClientFactory.createNewNetworkModuleClient()) != null) {
            return uCreateNewNetworkModuleClient;
        }
        S sCreateClientBuilder = createClientBuilder(context);
        sCreateClientBuilder.getClass();
        return new U(sCreateClientBuilder);
    }

    @JvmStatic
    @NotNull
    public static final S createClientBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return createClientBuilder(context, 10485760);
    }

    @JvmStatic
    @NotNull
    public static final S createClientBuilder(@NotNull Context context, int cacheSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        S sCreateClientBuilder = createClientBuilder();
        if (cacheSize == 0) {
            return sCreateClientBuilder;
        }
        sCreateClientBuilder.f40625k = new C1929i(new File(context.getCacheDir(), "http-cache"), cacheSize);
        return sCreateClientBuilder;
    }
}
