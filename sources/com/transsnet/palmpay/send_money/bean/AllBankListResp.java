package com.transsnet.palmpay.send_money.bean;

import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AllBankListResp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private List<BankInfo> allBankList;
        private List<BankInfo> commonBankList;
        private List<BankInfo> historyBankList;

        public List<BankInfo> getAllBankList() {
            return this.allBankList;
        }

        public List<BankInfo> getCommonBankList() {
            return this.commonBankList;
        }

        public List<BankInfo> getHistoryBankList() {
            return this.historyBankList;
        }

        public void setAllBankList(List<BankInfo> list) {
            this.allBankList = list;
        }

        public void setCommonBankList(List<BankInfo> list) {
            this.commonBankList = list;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
