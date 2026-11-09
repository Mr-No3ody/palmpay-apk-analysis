package com.transsnet.mtn.sdk.http.resp;

import C0.G;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CallHisDataForMtnResp extends CommonResult {
    public List<DataBean> data;

    public static class DataBean {
        public String callCharges;
        public String callDate;
        public String callDuration;
        public String callNumber;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("callCharges:");
            sb2.append(this.callCharges);
            sb2.append("\ncallDate:");
            sb2.append(this.callDate);
            sb2.append("\ncallDuration:");
            sb2.append(this.callDuration);
            sb2.append("\ncallNumber:");
            return G.r(sb2, this.callNumber, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
    }
}
