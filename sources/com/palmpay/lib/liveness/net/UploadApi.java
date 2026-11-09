package com.palmpay.lib.liveness.net;

import com.palmpay.lib.liveness.model.UploadRequest;
import com.palmpay.lib.liveness.model.UploadRequestV2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/liveness/net/UploadApi;", "", "", "url", "Lcom/palmpay/lib/liveness/model/UploadRequest;", "request", "", "upload", "(Ljava/lang/String;Lcom/palmpay/lib/liveness/model/UploadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/palmpay/lib/liveness/model/UploadRequestV2;", "uploadV2", "(Ljava/lang/String;Lcom/palmpay/lib/liveness/model/UploadRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Call;", "Lokhttp3/h0;", "uploadV3", "(Ljava/lang/String;Lcom/palmpay/lib/liveness/model/UploadRequestV2;)Lretrofit2/Call;", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UploadApi {
    @PUT
    @Nullable
    Object upload(@Url @NotNull String str, @Body @NotNull UploadRequest uploadRequest, @NotNull Continuation<? super Unit> continuation);

    @PUT
    @Nullable
    Object uploadV2(@Url @NotNull String str, @Body @NotNull UploadRequestV2 uploadRequestV2, @NotNull Continuation<? super Unit> continuation);

    @PUT
    @NotNull
    Call<h0> uploadV3(@Url @NotNull String url, @Body @NotNull UploadRequestV2 request);
}
