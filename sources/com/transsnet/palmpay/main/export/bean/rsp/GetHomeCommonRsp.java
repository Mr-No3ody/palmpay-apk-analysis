package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GetHomeCommonRsp extends CommonResult {
    private long _cacheTime;
    private DataBean data;

    public static class DataBean {
        public List<HomeMenuBean> bottomTabMenu;
        public int clientCacheExpireSecond;
        public int cornerCount;
        public boolean enableAppDowngrade;
        public boolean fromCache;
        public List<HomePageMenuData> funMenu;
        public List<HomePageMenuData> sendMoneyMenu;
        public String welcomeMsg;
    }

    public DataBean getData() {
        return this.data;
    }

    public boolean isCacheTimeValid() {
        DataBean dataBean;
        int i7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = this._cacheTime;
        return j6 > 0 && j6 <= jCurrentTimeMillis && (dataBean = this.data) != null && (i7 = dataBean.clientCacheExpireSecond) > 0 && jCurrentTimeMillis - j6 < ((long) i7) * 1000;
    }

    public void markCacheTime() {
        this._cacheTime = System.currentTimeMillis();
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
