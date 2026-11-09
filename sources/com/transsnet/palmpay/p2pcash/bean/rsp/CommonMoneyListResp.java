package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommonMoneyListResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public List<Long> commontMoey;
        public long endMoney;
        public long startMoney;
    }
}
