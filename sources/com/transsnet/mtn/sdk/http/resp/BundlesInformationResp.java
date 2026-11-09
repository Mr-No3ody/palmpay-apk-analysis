package com.transsnet.mtn.sdk.http.resp;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BundlesInformationResp extends CommonResult {
    public List<DataBean> data;

    public static final class AmountBean {
        public String type;
        public String unit;
        public String value;

        public String toString() {
            return String.format("T:%1$s U:%2$s V:%3$s", this.type, this.unit, this.value);
        }
    }

    public static final class DataBean {
        public String bundlesBalance;
        public String bundlesName;
        public String bundlesType;
        public String unit;
        public List<WalletBean> wallets;

        public String getWallets() {
            if (this.wallets == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<WalletBean> it = this.wallets.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            sb2.delete(sb2.length() - 1, sb2.length());
            return sb2.toString();
        }
    }

    public static final class WalletBean {
        public AmountBean amount;
        public String expiryDate;
        public String name;

        public String toString() {
            return this.amount.toString() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + String.format("name:%1$s expire:%2$s", this.name, this.expiryDate);
        }
    }
}
