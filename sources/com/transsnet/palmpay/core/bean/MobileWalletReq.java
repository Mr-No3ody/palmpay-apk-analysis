package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MobileWalletReq {
    public static final String BUSINESS_TYPE_BUNDLE = "1";
    private String businessType;
    private String countryCode;
    private List<String> operatorCode;
    private List<String> operatorName;
    private int queryType;

    public String getBusinessType() {
        return this.businessType;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public List<String> getOperatorCode() {
        return this.operatorCode;
    }

    public List<String> getOperatorName() {
        return this.operatorName;
    }

    public int getQueryType() {
        return this.queryType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setOperatorCode(List<String> operatorCode) {
        this.operatorCode = operatorCode;
    }

    public void setOperatorName(List<String> operatorName) {
        this.operatorName = operatorName;
    }

    public void setQueryType(int queryType) {
        this.queryType = queryType;
    }
}
