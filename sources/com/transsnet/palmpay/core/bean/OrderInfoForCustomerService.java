package com.transsnet.palmpay.core.bean;

import F6.d;
import Pa.r0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class OrderInfoForCustomerService implements Parcelable {
    public static final Parcelable.Creator<OrderInfoForCustomerService> CREATOR = new Parcelable.Creator<OrderInfoForCustomerService>() { // from class: com.transsnet.palmpay.core.bean.OrderInfoForCustomerService.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OrderInfoForCustomerService createFromParcel(Parcel source) {
            return new OrderInfoForCustomerService(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OrderInfoForCustomerService[] newArray(int size) {
            return new OrderInfoForCustomerService[size];
        }
    };
    private static final String TAG = "OrderInfoForCustomerService";
    public long amount;
    public String faqUrl;
    public long fee;
    public String feedbackLink;
    public String orderNumber;
    public String orderStatus;
    public String paymentMethod;
    public String paymentType;
    public long pointsEarned;
    public long pointsUsed;
    public long time;
    public String transType;
    public long vat;

    public OrderInfoForCustomerService() {
    }

    public GetCustomerServiceUrlReq buildGetCustomerServiceUrlReq() {
        GetCustomerServiceUrlReq getCustomerServiceUrlReq = new GetCustomerServiceUrlReq();
        getCustomerServiceUrlReq.entryType = GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL;
        getCustomerServiceUrlReq.transTypeDesc = this.paymentType;
        getCustomerServiceUrlReq.transType = this.transType;
        getCustomerServiceUrlReq.time = this.time;
        getCustomerServiceUrlReq.orderNumber = this.orderNumber;
        getCustomerServiceUrlReq.orderStatusDesc = this.orderStatus;
        getCustomerServiceUrlReq.amount = this.amount;
        return getCustomerServiceUrlReq;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContentString() {
        StringBuilder sb2 = new StringBuilder("<div style='color:#6F7B85'>AMOUNT:  <span style='color:#263138'>");
        sb2.append(r0.B(this.amount, true));
        sb2.append("</span></div>");
        if (!TextUtils.isEmpty(this.orderStatus)) {
            sb2.append("<div style='color:#6F7B85'>Status:  <span style='color:#263138'>");
            if ("Failed".equalsIgnoreCase(this.orderStatus)) {
                sb2.append("<span style='color:#FF6262'>");
            } else if ("Pending".equalsIgnoreCase(this.orderStatus)) {
                sb2.append("<span style='color:#FFAA0C'>");
            } else {
                sb2.append("<span style='color:#263138'>");
            }
            sb2.append(this.orderStatus);
            sb2.append("</span></div>");
        }
        if (this.fee > 0) {
            sb2.append("<div style='color:#6F7B85'>FEE:  <span style='color:#263138'>");
            sb2.append(r0.B(this.fee, true));
            sb2.append("</span></div>");
        }
        if (this.vat > 0) {
            sb2.append("<div style='color:#6F7B85'>VAT:  <span style='color:#263138'>");
            sb2.append(r0.B(this.vat, true));
            sb2.append("</span></div>");
        }
        if (this.pointsUsed > 0) {
            sb2.append("<div style='color:#6F7B85'>POINTS USED:  <span style='color:#263138'>");
            sb2.append("P " + this.pointsUsed);
            sb2.append("</span></div>");
        }
        if (this.pointsEarned > 0) {
            sb2.append("<div style='color:#6F7B85'>POINTS EARNED:  <span style='color:#263138'>");
            sb2.append("P " + this.pointsEarned);
            sb2.append("</span></div>");
        }
        sb2.append("<div style='color:#6F7B85'>Transaction id:  <span style='color:#263138'>");
        sb2.append(this.orderNumber);
        sb2.append("</span></div><div style='color:#6F7B85'>Transaction time:  <span style='color:#263138'>");
        sb2.append(r0.R(this.time));
        sb2.append("</span></div>");
        try {
            return URLEncoder.encode(sb2.toString(), Constants.ENCODING).replaceAll("\\+", "%20");
        } catch (Exception e10) {
            d.c(TAG, "getContentString: ", e10);
            return sb2.toString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.paymentType);
        dest.writeString(this.orderNumber);
        dest.writeString(this.orderStatus);
        dest.writeLong(this.amount);
        dest.writeLong(this.fee);
        dest.writeLong(this.vat);
        dest.writeLong(this.pointsUsed);
        dest.writeLong(this.pointsEarned);
        dest.writeLong(this.time);
    }

    public OrderInfoForCustomerService(Parcel in) {
        this.paymentType = in.readString();
        this.orderNumber = in.readString();
        this.orderStatus = in.readString();
        this.amount = in.readLong();
        this.fee = in.readLong();
        this.vat = in.readLong();
        this.pointsUsed = in.readLong();
        this.pointsEarned = in.readLong();
        this.time = in.readLong();
    }
}
