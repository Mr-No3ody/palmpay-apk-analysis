package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QueryAppointmentTimeBusinessCountResp extends CommonResult {
    public List<DataBean> data;

    public static class DataBean {
        public String businessFlag;
        public long endTime;
        public long startTime;
    }
}
