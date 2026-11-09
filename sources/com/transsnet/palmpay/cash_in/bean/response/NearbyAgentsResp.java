package com.transsnet.palmpay.cash_in.bean.response;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/response/NearbyAgentsResp;", "", "<init>", "()V", "phoneSwitch", "", "Ljava/lang/Boolean;", "nearbyShopList", "", "Lcom/transsnet/palmpay/cash_in/bean/response/NearbyAgentsResp$NearbyShopListBean;", "NearbyShopListBean", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NearbyAgentsResp {

    @JvmField
    @Nullable
    public List<NearbyShopListBean> nearbyShopList;

    @JvmField
    @Nullable
    public Boolean phoneSwitch = Boolean.FALSE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/response/NearbyAgentsResp$NearbyShopListBean;", "Ljava/io/Serializable;", "<init>", "()V", "bookingCode", "", "bookingStartTime", "bookingEndTime", "currentTime", "networkName", "networkAddress", "networkMobile", "shopId", "distance", "", "accountNo", "memberId", "transType", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NearbyShopListBean implements Serializable {

        @JvmField
        @Nullable
        public String accountNo;

        @JvmField
        @Nullable
        public String bookingCode;

        @JvmField
        @Nullable
        public String bookingEndTime;

        @JvmField
        @Nullable
        public String bookingStartTime;

        @JvmField
        @Nullable
        public String currentTime;

        @JvmField
        public double distance;

        @JvmField
        @Nullable
        public String memberId;

        @JvmField
        @Nullable
        public String networkAddress;

        @JvmField
        @Nullable
        public String networkMobile;

        @JvmField
        @Nullable
        public String networkName;

        @JvmField
        @Nullable
        public String shopId;

        @JvmField
        @Nullable
        public String transType;
    }
}
