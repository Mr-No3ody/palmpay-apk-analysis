package com.transsnet.adsdk.data.network;

import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.bean.resp.AdBean;
import com.transsnet.adsdk.data.bean.resp.AdCommonResult;
import df.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0018\u00010\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/transsnet/adsdk/data/network/AdApiService;", "", "", "signature", "Lcom/transsnet/adsdk/data/bean/req/AdReq;", "adReq", "Ldf/d;", "Lcom/transsnet/adsdk/data/bean/resp/AdCommonResult;", "Lcom/transsnet/adsdk/data/bean/resp/AdBean;", "getAdData", "(Ljava/lang/String;Lcom/transsnet/adsdk/data/bean/req/AdReq;)Ldf/d;", "getAdData2", "(Ljava/lang/String;Lcom/transsnet/adsdk/data/bean/req/AdReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "batchPullAd", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdApiService {
    @Headers({"add_common_header: yes"})
    @POST("/api/ad/batchPullAd")
    @Nullable
    Object batchPullAd(@Header("Signature") @Nullable String str, @Body @Nullable AdReq adReq, @NotNull Continuation<? super AdCommonResult<List<AdBean>>> continuation);

    @Headers({"add_common_header: yes"})
    @POST("/api/ad/pullAd")
    @NotNull
    d<AdCommonResult<AdBean>> getAdData(@Header("Signature") @Nullable String signature, @Body @Nullable AdReq adReq);

    @Headers({"add_common_header: yes"})
    @POST("/api/ad/pullAd")
    @Nullable
    Object getAdData2(@Header("Signature") @Nullable String str, @Body @Nullable AdReq adReq, @NotNull Continuation<? super AdCommonResult<AdBean>> continuation);
}
