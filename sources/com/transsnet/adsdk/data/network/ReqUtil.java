package com.transsnet.adsdk.data.network;

import android.os.Build;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.BuildConfig;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.bean.req.BatchAd;
import com.transsnet.analysis.utils.GsonUtil;
import com.transsnet.analysis.utils.StringUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ReqUtil {
    private static void addParam(Map<String, Object> map, String key, String value) {
        if (map == null || map.containsKey(key)) {
            return;
        }
        map.put(key, value);
    }

    public static AdReq getBatchAdReq(List<BatchAd> batchAdList) {
        return getCommonAdReq(null, null, batchAdList, null);
    }

    public static AdReq getCommonAdReq(String slotId, List<String> noShowList) {
        return getCommonAdReq(slotId, noShowList, null);
    }

    public static AdReq getBatchAdReq(List<BatchAd> batchAdList, Map<String, Object> extendExtras) {
        return getCommonAdReq(null, null, batchAdList, extendExtras);
    }

    public static AdReq getCommonAdReq(String slotId, List<String> noShowList, Map<String, Object> extendExtras) {
        return getCommonAdReq(slotId, noShowList, null, extendExtras);
    }

    private static AdReq getCommonAdReq(String slotId, List<String> noShowList, List<BatchAd> batchAdList, Map<String, Object> extendExtras) {
        AdReq.BizInfoBean bizInfoBean = new AdReq.BizInfoBean();
        bizInfoBean.applicationId = AdManager.get().getApplicationId();
        bizInfoBean.userId = AdManager.getUserId();
        bizInfoBean.adSlotId = slotId;
        bizInfoBean.notShowAdIds = noShowList;
        bizInfoBean.lat = AdManager.get().getLatitude();
        bizInfoBean.lon = AdManager.get().getLongitude();
        bizInfoBean.gaId = AdManager.getGaId();
        bizInfoBean.infoId = AdManager.getExtraId();
        Map<String, Object> extras = AdManager.getExtras();
        if (extras != null || extendExtras != null) {
            bizInfoBean.extendParam = new HashMap();
            if (extendExtras != null && !extendExtras.isEmpty()) {
                bizInfoBean.extendParam.putAll(extendExtras);
            }
            if (extras != null) {
                bizInfoBean.extendParam.putAll(extras);
            }
            addParam(bizInfoBean.extendParam, "deviceModel", Build.MODEL);
            addParam(bizInfoBean.extendParam, "brand", Build.BRAND);
            addParam(bizInfoBean.extendParam, "deviceVersion", "Android" + Build.VERSION.RELEASE);
        }
        if (batchAdList != null && !batchAdList.isEmpty()) {
            bizInfoBean.adSlotInfoList = batchAdList;
        }
        AdReq adReq = new AdReq();
        adReq.nonceStr = StringUtil.createRandomString(8);
        adReq.requestTime = System.currentTimeMillis();
        adReq.version = BuildConfig.VERSION_NAME;
        adReq.bizInfo = GsonUtil.get().toJson(bizInfoBean, AdReq.BizInfoBean.class);
        return adReq;
    }
}
