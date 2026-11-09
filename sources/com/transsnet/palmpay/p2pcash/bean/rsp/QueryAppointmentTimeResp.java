package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QueryAppointmentTimeResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public long currentTime;
        public List<TimeRangeListBean> timeRangeList;
    }

    public static class TimeRangeListBean {
        public int beginTime;
        public String businessFlag;
        public int endTime;
    }
}
