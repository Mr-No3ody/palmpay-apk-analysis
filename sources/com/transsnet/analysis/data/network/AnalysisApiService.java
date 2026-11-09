package com.transsnet.analysis.data.network;

import com.google.common.net.HttpHeaders;
import com.transsnet.analysis.data.bean.req.AnalysisReq;
import com.transsnet.analysis.data.bean.resp.AnalysisCommonResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/analysis/data/network/AnalysisApiService;", "", "sendData", "Lcom/transsnet/analysis/data/bean/resp/AnalysisCommonResult;", "CountryCode", "", "signature", "author", "req", "Lcom/transsnet/analysis/data/bean/req/AnalysisReq;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/analysis/data/bean/req/AnalysisReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analysisSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AnalysisApiService {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("/api/dataBurialPoint/adBehavior")
    @Nullable
    Object sendData(@Header("CountryCode") @Nullable String str, @Header("Signature") @Nullable String str2, @Header(HttpHeaders.AUTHORIZATION) @Nullable String str3, @Body @Nullable AnalysisReq analysisReq, @NotNull Continuation<? super AnalysisCommonResult> continuation);
}
