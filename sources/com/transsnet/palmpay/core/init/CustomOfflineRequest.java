package com.transsnet.palmpay.core.init;

import com.palmpay.lib.webview.offline.net.DefaultOfflineRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/init/CustomOfflineRequest;", "Lcom/palmpay/lib/webview/offline/net/DefaultOfflineRequest;", "Lokhttp3/U;", "client", "<init>", "(Lokhttp3/U;)V", "getOkHttpClient", "()Lokhttp3/U;", "", "getBaseUrl", "()Ljava/lang/String;", "Lokhttp3/U;", "Companion", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomOfflineRequest extends DefaultOfflineRequest {

    @NotNull
    public static final String OFFLINE_CONFIG_DEV = "https://offweb-dev.palmpay-inc.com/";

    @NotNull
    public static final String OFFLINE_CONFIG_GRAY = "https://offweb-gray.palmpay-inc.com/";

    @NotNull
    public static final String OFFLINE_CONFIG_PRE = "https://offweb-pre.palmpay-inc.com/";

    @NotNull
    public static final String OFFLINE_CONFIG_PROD = "https://offweb-prod.palmpay-inc.com/";

    @NotNull
    public static final String OFFLINE_CONFIG_TEST = "https://offweb-daily.palmpay-inc.com/";

    @NotNull
    private final U client;

    public CustomOfflineRequest(@NotNull U client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.palmpay.lib.webview.offline.net.DefaultOfflineRequest
    @NotNull
    public String getBaseUrl() {
        return OFFLINE_CONFIG_PROD;
    }

    @Override // com.palmpay.lib.webview.offline.net.DefaultOfflineRequest
    @NotNull
    /* JADX INFO: renamed from: getOkHttpClient, reason: from getter */
    public U getClient() {
        return this.client;
    }
}
