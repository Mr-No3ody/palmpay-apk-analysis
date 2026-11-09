package com.transsnet.palmpay.send_money.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class AddRecipientResp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private String activityId;

        public String getActivityId() {
            return this.activityId;
        }

        public void setActivityId(String str) {
            this.activityId = str;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
