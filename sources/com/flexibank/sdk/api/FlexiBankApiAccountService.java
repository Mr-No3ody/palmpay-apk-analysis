package com.flexibank.sdk.api;

import I3.b;
import W3.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/flexibank/sdk/api/FlexiBankApiAccountService;", "", "LI3/b;", "body", "LW3/c;", "LI3/c;", "authorize", "(LI3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Call;", "authorizeBlocking", "(LI3/b;)Lretrofit2/Call;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankApiAccountService {
    @Headers({"No-Token: yes", "Black-Code: yes"})
    @POST("/api/validator-service/auth/authLogin")
    @Nullable
    Object authorize(@Body @NotNull b bVar, @NotNull Continuation<? super c<I3.c>> continuation);

    @Headers({"No-Token: yes", "Black-Code: yes"})
    @POST("/api/validator-service/auth/authLogin")
    @NotNull
    Call<c<I3.c>> authorizeBlocking(@Body @NotNull b body);
}
