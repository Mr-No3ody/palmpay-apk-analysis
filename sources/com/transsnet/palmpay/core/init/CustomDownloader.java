package com.transsnet.palmpay.core.init;

import com.palmpay.lib.webview.offline.download.DefaultDownloader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/init/CustomDownloader;", "Lcom/palmpay/lib/webview/offline/download/DefaultDownloader;", "Lokhttp3/U;", "client", "<init>", "(Lokhttp3/U;)V", "getOkHttpClient", "()Lokhttp3/U;", "Lokhttp3/U;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomDownloader extends DefaultDownloader {

    @NotNull
    private final U client;

    public CustomDownloader(@NotNull U client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.palmpay.lib.webview.offline.download.DefaultDownloader
    @NotNull
    /* JADX INFO: renamed from: getOkHttpClient, reason: from getter */
    public U getClient() {
        return this.client;
    }
}
