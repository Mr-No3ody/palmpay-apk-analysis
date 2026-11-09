package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionsResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        private List<String> transTypeList;

        public List<String> getList() {
            return this.transTypeList;
        }

        public void setList(List<String> list) {
            this.transTypeList = list;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
