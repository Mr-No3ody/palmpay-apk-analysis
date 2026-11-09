package com.google.net.cronet.okhttptransport;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/google/net/cronet/okhttptransport/CronetNqeKey;", "", "()V", "KEY_HTTP_RTT", "", "KEY_PROTOCOL", "KEY_SUCCESS", "KEY_TRANSPORT_RTT", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CronetNqeKey {

    @NotNull
    public static final CronetNqeKey INSTANCE = new CronetNqeKey();

    @NotNull
    public static final String KEY_HTTP_RTT = "httpRTT";

    @NotNull
    public static final String KEY_PROTOCOL = "protocol";

    @NotNull
    public static final String KEY_SUCCESS = "success";

    @NotNull
    public static final String KEY_TRANSPORT_RTT = "transportRTT";

    private CronetNqeKey() {
    }
}
