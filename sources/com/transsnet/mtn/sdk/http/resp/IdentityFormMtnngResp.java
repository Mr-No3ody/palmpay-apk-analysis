package com.transsnet.mtn.sdk.http.resp;

import com.transsnet.mtn.sdk.MTN;

/* JADX INFO: loaded from: classes3.dex */
public class IdentityFormMtnngResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String bundlesName;
        public String cardAmount;
        public String currentAirtimeBalance;
        public String currentDataBalance;
        public String dob;
        public String fullName;
        public String gender;
        public String ninnumber;
        public String operatorName;
        public String phoneNumber;

        public void decrypt() {
            this.currentAirtimeBalance = MTN.decrypt(this.currentAirtimeBalance);
            this.currentDataBalance = MTN.decrypt(this.currentDataBalance);
            this.fullName = MTN.decrypt(this.fullName);
            this.phoneNumber = MTN.decrypt(this.phoneNumber);
        }
    }
}
