package com.transsnet.palmpay.core.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisCouponQrCodeRsp extends CommonResult {
    public DataBean data;

    public static class DataBean implements Parcelable {
        public static final Parcelable.Creator<DataBean> CREATOR = new Parcelable.Creator<DataBean>() { // from class: com.transsnet.palmpay.core.bean.rsp.AnalysisCouponQrCodeRsp.DataBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
        public String actCouponUrl;
        public String activityId;
        public String assigneeId;
        public long beginTime;
        public int commission;
        public String couponCode;
        public long couponId;
        public String couponName;
        public long endTime;
        public String eventId;
        public String eventName;
        public String memberId;
        public String owerHeadUrl;
        public String owerName;
        public String owerPhone;
        public String sourceType;
        public String valueId;

        public DataBean() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.activityId);
            dest.writeString(this.assigneeId);
            dest.writeString(this.couponCode);
            dest.writeString(this.couponName);
            dest.writeLong(this.beginTime);
            dest.writeInt(this.commission);
            dest.writeLong(this.endTime);
            dest.writeLong(this.couponId);
            dest.writeString(this.eventId);
            dest.writeString(this.eventName);
            dest.writeString(this.memberId);
            dest.writeString(this.valueId);
            dest.writeString(this.actCouponUrl);
            dest.writeString(this.sourceType);
            dest.writeString(this.owerHeadUrl);
            dest.writeString(this.owerName);
            dest.writeString(this.owerPhone);
        }

        public DataBean(Parcel in) {
            this.activityId = in.readString();
            this.assigneeId = in.readString();
            this.couponCode = in.readString();
            this.couponName = in.readString();
            this.beginTime = in.readLong();
            this.commission = in.readInt();
            this.endTime = in.readLong();
            this.couponId = in.readLong();
            this.eventId = in.readString();
            this.eventName = in.readString();
            this.memberId = in.readString();
            this.valueId = in.readString();
            this.actCouponUrl = in.readString();
            this.sourceType = in.readString();
            this.owerHeadUrl = in.readString();
            this.owerName = in.readString();
            this.owerPhone = in.readString();
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
