package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CommonListResult<T> extends CommonResult {
    public CommonList<T> data;

    public static class CommonList<T> {
        public int curPage;
        public List<T> list;
        public int pageSize;
        public int total;
        public int totalPage;
    }
}
