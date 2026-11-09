package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentMethodListResp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private List<Data> list;

        public static class Data {
            private String name;
            private int prefered;
            private int type;

            public String getName() {
                return this.name;
            }

            public int getPrefered() {
                return this.prefered;
            }

            public int getType() {
                return this.type;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setPrefered(int i7) {
                this.prefered = i7;
            }

            public void setType(int i7) {
                this.type = i7;
            }
        }

        public List<Data> getList() {
            return this.list;
        }

        public void setList(List<Data> list) {
            this.list = list;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
