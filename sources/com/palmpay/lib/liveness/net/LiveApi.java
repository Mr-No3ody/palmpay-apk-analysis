package com.palmpay.lib.liveness.net;

import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.palmpay.lib.liveness.model.AuthenticationResponse;
import com.palmpay.lib.liveness.model.CheckRequest;
import com.palmpay.lib.liveness.model.CheckResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u000bH'¨\u0006\u000e"}, d2 = {"Lcom/palmpay/lib/liveness/net/LiveApi;", "", "authenticate", "Lcom/palmpay/lib/liveness/model/AuthenticationResponse;", "url", "", "request", "Lcom/palmpay/lib/liveness/model/AuthenticationRequest;", "(Ljava/lang/String;Lcom/palmpay/lib/liveness/model/AuthenticationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "check", "Lcom/palmpay/lib/liveness/model/CheckResponse;", "Lcom/palmpay/lib/liveness/model/CheckRequest;", "(Ljava/lang/String;Lcom/palmpay/lib/liveness/model/CheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkV2", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LiveApi {
    @Headers({"Content-Type: application/json", "No-Token: yes"})
    @POST
    @Nullable
    Object authenticate(@Url @NotNull String str, @Body @NotNull AuthenticationRequest authenticationRequest, @NotNull Continuation<? super AuthenticationResponse> continuation);

    @Headers({"Content-Type: application/json", "No-Token: yes"})
    @POST
    @Nullable
    Object check(@Url @NotNull String str, @Body @NotNull CheckRequest checkRequest, @NotNull Continuation<? super CheckResponse> continuation);

    @Headers({"Content-Type: application/json", "No-Token: yes"})
    @POST("/api/validator/liveness/check")
    @NotNull
    CheckResponse checkV2(@Body @NotNull CheckRequest request);
}
