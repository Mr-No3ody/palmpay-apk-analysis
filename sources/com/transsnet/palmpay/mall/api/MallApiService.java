package com.transsnet.palmpay.mall.api;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.mall.bean.rsp.MallPaymentOrderDetailRsp;
import df.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/mall/api/MallApiService;", "", "", "paymentOrderNo", "Ldf/d;", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/mall/bean/rsp/MallPaymentOrderDetailRsp;", "queryPaymentOrderDetail", "(Ljava/lang/String;)Ldf/d;", "module_mall_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MallApiService {
    @GET("/api/cfront/ecommerce/queryPaymentDetail")
    @NotNull
    d<CommonBeanResult<MallPaymentOrderDetailRsp>> queryPaymentOrderDetail(@NotNull @Query("paymentOrderNo") String paymentOrderNo);
}
