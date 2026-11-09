package com.transsnet.adsdk.data.bean.req;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AdReq {
    public String bizInfo;
    public String nonceStr;
    public long requestTime;
    public String version;

    public static class BizInfoBean {
        public String adSlotId;
        public List<BatchAd> adSlotInfoList;
        public String applicationId;
        public Map<String, Object> extendParam;
        public String gaId;
        public String infoId;
        public double lat;
        public double lon;
        public List<String> notShowAdIds;
        public String userId;
    }
}
