package com.transsnet.palmpay.core.bean.req;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class QueryCouponStatisticsReq {
    public String institutionId;
    public int pageNum = 1;
    public int pageSize = 100;
    public Long productId;
    public String transType;
    public List<String> transTypes;
}
