package p026bb;

import C0.G;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @Nullable
    private final UploadDeviceInfoReq.DeviceInfoBean nodeConfirmParam;

    @Nullable
    private final String respMsg;

    @Nullable
    private final a serverInfo;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final b uploadStats;
    private final boolean success = true;

    @Nullable
    private final String resultType = "success";

    @Nullable
    private final String respCode = "00000000";

    @Nullable
    private final String uploadNode = null;

    @Nullable
    private final String uploadNodeDetail = null;

    @Nullable
    private final String applyId = null;

    @Nullable
    private final String collectMode = null;

    @Nullable
    private final String errorDetails = null;

    public c(String str, Long l5, UploadDeviceInfoReq.DeviceInfoBean deviceInfoBean) {
        this.respMsg = str;
        this.timestamp = l5;
        this.nodeConfirmParam = deviceInfoBean;
    }

    public final String a() {
        String str;
        if (!this.success && (str = this.errorDetails) != null && str.length() != 0) {
            return this.errorDetails;
        }
        String str2 = this.respMsg;
        return (str2 == null || str2.length() == 0) ? "未知错误" : this.respMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.success == cVar.success && Intrinsics.c(this.resultType, cVar.resultType) && Intrinsics.c(this.respCode, cVar.respCode) && Intrinsics.c(this.respMsg, cVar.respMsg) && Intrinsics.c(this.uploadNode, cVar.uploadNode) && Intrinsics.c(this.uploadNodeDetail, cVar.uploadNodeDetail) && Intrinsics.c(this.applyId, cVar.applyId) && Intrinsics.c(this.timestamp, cVar.timestamp) && Intrinsics.c(this.collectMode, cVar.collectMode) && Intrinsics.c(this.errorDetails, cVar.errorDetails) && Intrinsics.c(this.nodeConfirmParam, cVar.nodeConfirmParam);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.resultType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.respCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.respMsg;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uploadNode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.uploadNodeDetail;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.applyId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l5 = this.timestamp;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str7 = this.collectMode;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.errorDetails;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 29791;
        UploadDeviceInfoReq.DeviceInfoBean deviceInfoBean = this.nodeConfirmParam;
        return iHashCode10 + (deviceInfoBean != null ? deviceInfoBean.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    public final String toString() {
        String strO;
        boolean z3 = this.success;
        String str = this.resultType;
        String str2 = this.respCode;
        String str3 = this.applyId;
        String str4 = this.collectMode;
        if (str == null) {
            strO = G.o("未知状态: ", this.resultType);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1867169789) {
                if (iHashCode != -1281977283) {
                    if (iHashCode == 96784904 && str.equals("error")) {
                        strO = G.o("处理错误: ", a());
                    } else {
                        strO = G.o("未知状态: ", this.resultType);
                    }
                } else if (str.equals(TransferByLoanResult.STATUS_FAILED)) {
                    strO = G.o("上传失败: ", a());
                } else {
                    strO = G.o("未知状态: ", this.resultType);
                }
            } else if (str.equals("success")) {
                strO = "上传成功";
            } else {
                strO = G.o("未知状态: ", this.resultType);
            }
        }
        StringBuilder sb2 = new StringBuilder("DeviceInfoUploadResp(success=");
        sb2.append(z3);
        sb2.append(", resultType='");
        sb2.append(str);
        sb2.append("', respCode='");
        u.x(sb2, str2, "', applyId='", str3, "', collectMode='");
        return G.s(sb2, str4, "', summary='", strO, "')");
    }
}
