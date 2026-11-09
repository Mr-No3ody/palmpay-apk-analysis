package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class RiskControlResult implements Parcelable {
    public static final String CODE_PASS = "RD001";
    public static final String CODE_PASS_AND_NOTICE = "RD002";
    public static final String CODE_POSTPONE = "RD006";
    public static final String CODE_REJECT = "RD003";
    public static final String CODE_REJECT_AND_SUSPEND_ACCOUNT = "RD005";
    public static final String CODE_REJECT_AND_SUSPEND_MEMBER = "RD004";
    public static final String CODE_VERIFY_PALMPAY_PIN = "RD008";
    public static final String CODE_VERIFY_SMS = "RD007";
    public static final String CODE_VERIFY_SMS_AND_PALMPAY_PIN = "RD009";
    public static final String CODE_WAIT_RESULT = "RD010";
    public static final Parcelable.Creator<RiskControlResult> CREATOR = new Parcelable.Creator<RiskControlResult>() { // from class: com.transsnet.palmpay.core.bean.RiskControlResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RiskControlResult createFromParcel(Parcel source) {
            return new RiskControlResult(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RiskControlResult[] newArray(int size) {
            return new RiskControlResult[size];
        }
    };
    public String businessRiskType;
    public String disposal;
    public String flowId;

    public RiskControlResult(String businessRiskType, String disposal, String flowId) {
        this.businessRiskType = businessRiskType;
        this.disposal = disposal;
        this.flowId = flowId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getSmsSceneByBusinessRiskType() {
        String str = this.businessRiskType;
        str.getClass();
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 3;
            case "02":
                return 2;
            case "03":
                return 5;
            case "10":
                return 11;
            case "11":
                return 21;
            case "12":
                return 22;
            default:
                return 0;
        }
    }

    public boolean isNeedAction() {
        return CODE_VERIFY_SMS.equalsIgnoreCase(this.disposal) || CODE_VERIFY_PALMPAY_PIN.equalsIgnoreCase(this.disposal) || CODE_VERIFY_SMS_AND_PALMPAY_PIN.equalsIgnoreCase(this.disposal);
    }

    public boolean isPass() {
        return CODE_PASS.equalsIgnoreCase(this.disposal) || CODE_PASS_AND_NOTICE.equalsIgnoreCase(this.disposal);
    }

    public boolean isPendingResult() {
        return CODE_WAIT_RESULT.equalsIgnoreCase(this.disposal);
    }

    public boolean isRejected() {
        return CODE_REJECT.equalsIgnoreCase(this.disposal) || CODE_REJECT_AND_SUSPEND_MEMBER.equalsIgnoreCase(this.disposal) || CODE_POSTPONE.equalsIgnoreCase(this.disposal) || CODE_REJECT_AND_SUSPEND_ACCOUNT.equalsIgnoreCase(this.disposal);
    }

    public boolean isRequireOtcVerify() {
        return CODE_VERIFY_SMS.equalsIgnoreCase(this.disposal);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.businessRiskType);
        dest.writeString(this.disposal);
        dest.writeString(this.flowId);
    }

    public RiskControlResult(Parcel in) {
        this.businessRiskType = in.readString();
        this.disposal = in.readString();
        this.flowId = in.readString();
    }
}
