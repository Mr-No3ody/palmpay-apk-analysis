package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CheckCustomerIdRsp extends CommonResult implements Serializable {
    public DataBean data;

    public static class DataBean implements Serializable {
        public String address;
        public boolean available;
        public String fullName;
        public TvListByCategoryIdResp.TvItemChildBean item;
        public List<Item> items;
        public long minAmount;
        public String referenceId;
        public long renewalAmount;
    }

    public static class Item implements Serializable {
        public String key;
        public String value;

        public Item(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }
}
