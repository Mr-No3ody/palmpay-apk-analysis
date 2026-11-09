package com.transsnet.mtn.sdk.http.resp;

import C0.G;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ShowAllForMTNResp extends CommonResult {
    public List<DataBean> data;

    public static class DataBean {
        public String businessType;
        public List<DetailBean> showAllDetailArray;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("businessType:");
            sb2.append(this.businessType);
            sb2.append("\nshowAllDetailArray:\n");
            Iterator<DetailBean> it = this.showAllDetailArray.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
            }
            return sb2.toString();
        }
    }

    public static class DetailBean {
        public String comboAmount;
        public String comboType;
        public String expiryDate;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("--comboAmount:");
            sb2.append(this.comboAmount);
            sb2.append(" \tcomboType:");
            sb2.append(this.comboType);
            sb2.append(" \texpiryDate:");
            return G.r(sb2, this.expiryDate, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
    }
}
