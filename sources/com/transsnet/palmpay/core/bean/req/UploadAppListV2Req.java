package com.transsnet.palmpay.core.bean.req;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UploadAppListV2Req {
    public List<AppListBean> appList;
    public Integer appNum;
    public String applyId;
    public Integer batchNo;
    public String channel;
    public long createTime;
    public String memberId;
    public Integer mobileVersion;
    public long updateTime;
    public String uploadNode;
    public String uploadNodeDetail;

    public static class AppListBean {
        public long appCreateTime;
        public String appName;
        public String appPackageName;
        public int appType;
        public long appUpdateTime;
    }
}
