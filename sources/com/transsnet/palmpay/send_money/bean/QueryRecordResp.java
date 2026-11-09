package com.transsnet.palmpay.send_money.bean;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QueryRecordResp extends CommonResult {
    public Data data;

    public static class Data {
        public int curPage;
        public DataMap dataMap;
        public ExtData extData;
        public List<Record> list;
        public int pageSize;
        public int total;
        public int totalPage;
    }

    public static class DataMap {
    }

    public static class ExtData {
    }

    public static class Record extends TransferData {
    }
}
