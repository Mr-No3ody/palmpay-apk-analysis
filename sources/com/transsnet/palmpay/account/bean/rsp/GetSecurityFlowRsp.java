package com.transsnet.palmpay.account.bean.rsp;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GetSecurityFlowRsp implements Parcelable {
    public static final int ACTION_TYPE_CHANGE_MOBILE = 14;
    public static final int ACTION_TYPE_RESET_PIN = 12;
    public static final int ACTION_TYPE_RESET_PSW = 36;
    public static final Parcelable.Creator<GetSecurityFlowRsp> CREATOR = new Parcelable.Creator<GetSecurityFlowRsp>() { // from class: com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetSecurityFlowRsp createFromParcel(Parcel parcel) {
            return new GetSecurityFlowRsp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetSecurityFlowRsp[] newArray(int i7) {
            return new GetSecurityFlowRsp[i7];
        }
    };
    public static final String VERIFY_TYPE_ACCOUNT_HISTORY = "securityQuestion";
    public static final String VERIFY_TYPE_FACE_RECOGNITION = "face";
    public static final String VERIFY_TYPE_OTP = "otp";
    public static final String VERIFY_TYPE_USER_INFO = "realNameVerify";
    public int action;
    public String email;
    public String flowId;
    public List<String> flowPoints;
    public String mobile;
    public int scene;
    public String securityVerifyToken;
    public String smsToken;

    public GetSecurityFlowRsp() {
    }

    private Postcard getPostcard(String str) {
        if (VERIFY_TYPE_OTP.equals(str)) {
            return ARouter.getInstance().build("/account/resetpin");
        }
        if (VERIFY_TYPE_ACCOUNT_HISTORY.equals(str)) {
            return ARouter.getInstance().build("/account/verify_account_history");
        }
        if (VERIFY_TYPE_USER_INFO.equals(str)) {
            return ARouter.getInstance().build("/account/select_reset_pin_verify_type");
        }
        if ("face".equals(str)) {
            return ARouter.getInstance().build("/account/verify_account_face");
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void nextStep(Activity activity, String str) {
        Postcard postcard;
        int i7;
        List<String> list = this.flowPoints;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            postcard = getPostcard(this.flowPoints.get(0));
        } else {
            int size = this.flowPoints.size();
            Postcard postcard2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (str.equals(this.flowPoints.get(i10)) && (i7 = i10 + 1) < size) {
                    postcard2 = getPostcard(this.flowPoints.get(i7));
                }
            }
            postcard = postcard2;
        }
        if (postcard != null) {
            postcard.withParcelable("_security_flow_info", this);
            postcard.navigation();
        } else {
            int i11 = this.action;
            if (i11 == 14) {
                ARouter.getInstance().build("/account/changeMobile").withParcelable("_security_flow_info", this).navigation();
            } else if (i11 == 12) {
                d0.g(3, "/account/setnewpin", "mode").withString("extra_data_2", this.mobile).withParcelable("_security_flow_info", this).navigation();
            } else if (i11 == 36) {
                d0.g(5, "/account/set_new_psw", "mode").withString("extra_data_2", this.mobile).withParcelable("_security_flow_info", this).navigation();
            }
        }
        if (activity != null) {
            activity.finish();
        }
    }

    public void readFromParcel(Parcel parcel) {
        this.action = parcel.readInt();
        this.mobile = parcel.readString();
        this.smsToken = parcel.readString();
        this.flowId = parcel.readString();
        this.securityVerifyToken = parcel.readString();
        this.flowPoints = parcel.createStringArrayList();
        this.scene = parcel.readInt();
        this.email = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.action);
        parcel.writeString(this.mobile);
        parcel.writeString(this.smsToken);
        parcel.writeString(this.flowId);
        parcel.writeString(this.securityVerifyToken);
        parcel.writeStringList(this.flowPoints);
        parcel.writeInt(this.scene);
        parcel.writeString(this.email);
    }

    public GetSecurityFlowRsp(Parcel parcel) {
        this.action = parcel.readInt();
        this.mobile = parcel.readString();
        this.smsToken = parcel.readString();
        this.flowId = parcel.readString();
        this.securityVerifyToken = parcel.readString();
        this.flowPoints = parcel.createStringArrayList();
        this.scene = parcel.readInt();
        this.email = parcel.readString();
    }
}
