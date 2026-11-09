package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ThirdPartyMerchantListResp extends CommonResult {
    private List<ThirdPartyMerchant> data;

    public static class ThirdPartyMerchant implements Serializable {
        private String countryCode;
        private String logoUrl;
        private String merchantId;
        private String merchantName;
        private int priority;
        private String serviceLink;

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getLogoUrl() {
            return this.logoUrl;
        }

        public String getMerchantId() {
            return this.merchantId;
        }

        public String getMerchantName() {
            return this.merchantName;
        }

        public int getPriority() {
            return this.priority;
        }

        public String getServiceLink() {
            return this.serviceLink;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setLogoUrl(String str) {
            this.logoUrl = str;
        }

        public void setMerchantId(String str) {
            this.merchantId = str;
        }

        public void setMerchantName(String str) {
            this.merchantName = str;
        }

        public void setPriority(int i7) {
            this.priority = i7;
        }

        public void setServiceLink(String str) {
            this.serviceLink = str;
        }
    }

    public List<ThirdPartyMerchant> getData() {
        return this.data;
    }

    public void setData(List<ThirdPartyMerchant> list) {
        this.data = list;
    }
}
