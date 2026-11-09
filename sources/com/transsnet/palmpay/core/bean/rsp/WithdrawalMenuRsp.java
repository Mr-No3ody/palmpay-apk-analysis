package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WithdrawalMenuRsp extends CommonResult {
    public List<WithdrawalMenuBean> data;

    public class WithdrawalMenuBean {
        private String copywriting;
        private String labelUrl;
        private String linkAddress;
        private String pictureUrl;

        public WithdrawalMenuBean() {
        }

        public String getCopywriting() {
            return this.copywriting;
        }

        public String getLabelUrl() {
            return this.labelUrl;
        }

        public String getLinkAddress() {
            return this.linkAddress;
        }

        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public void setCopywriting(String copywriting) {
            this.copywriting = copywriting;
        }

        public void setLabelUrl(String labelUrl) {
            this.labelUrl = labelUrl;
        }

        public void setLinkAddress(String linkAddress) {
            this.linkAddress = linkAddress;
        }

        public void setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
        }
    }
}
