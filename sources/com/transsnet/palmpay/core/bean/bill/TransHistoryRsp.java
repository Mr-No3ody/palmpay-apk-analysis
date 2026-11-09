package com.transsnet.palmpay.core.bean.bill;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TransHistoryRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int curPage;
        public List<ListBean> list;
        public int pageSize;
        public int total;
        public int totalPage;

        public static class ListBean implements Serializable, MultiItemEntity {
            public static final int ITEM_TYPE_NORMAL = 0;
            public static final int ITEM_TYPE_TITLE = 1;
            public long amount;
            public int businessType;
            public String companyIconUrl;
            public long createTime;
            public String displayAmount;
            public String iconUrl;
            public long inComeAmount;
            public int itemType = 0;
            public String merchantNo;
            public String orderNo;
            public String orderStatus;
            public long payOutAmount;
            public int payerAccountType;
            public String redirect;
            public String subTransTypeCode;
            public String title;
            public String transType;
            public String transTypeDesc;
            public long updateTime;

            @Override // com.chad.library.adapter.base.entity.MultiItemEntity
            public int getItemType() {
                return this.itemType;
            }

            public boolean isHeader() {
                return this.itemType == 1;
            }
        }
    }
}
