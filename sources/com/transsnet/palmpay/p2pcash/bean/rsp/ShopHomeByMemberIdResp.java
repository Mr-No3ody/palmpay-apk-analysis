package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ShopHomeByMemberIdResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public List<NearbyShopListBean> nearbyShopList;
        public List<ReceivedShopListBean> receivedShopList;
    }

    public static class NearbyShopListBean {
        public String agentId;
        public String bookingCode;
        public String bookingEndTime;
        public boolean bookingNotes;
        public String bookingStartTime;
        public List<String> businessLabel;
        public boolean businessStatus;
        public String currentTime;
        public double distance;
        public boolean isRecent;
        public double latitude;
        public double longitude;
        public String networkAddress;
        public String networkMobile;
        public String networkName;
        public boolean newNotes;
        public boolean phoneSwitch;
        public String pictureUrl;
        public String shopId;
    }

    public static class ReceivedShopListBean {
        public String agentId;
        public String bookingCode;
        public long bookingEndTime;
        public long bookingMoney;
        public long bookingStartTime;
        public long currentTime;
        public double distance;
        public double latitude;
        public double longitude;
        public String networkAddress;
        public String networkMobile;
        public String networkName;
        public String orderNo;
        public int orderStatus;
        public String shopId;
        public String timeStatus;
        public boolean updateMoneyFlag;
    }
}
