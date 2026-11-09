package com.transsnet.palmpay.credit.rnbridge;

import C0.G;
import android.app.Activity;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.transsnet.palmpay.core.init.LivenessTask;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p232p6.p;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/risk/face"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\f\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/CreditFaceBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/rnbridge/CreditFaceBridge$FaceModel;", "<init>", "()V", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "onHandle", "(Lcom/transsnet/palmpay/credit/rnbridge/CreditFaceBridge$FaceModel;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "LivenessData", "FaceModel", "FaceResult", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreditFaceBridge extends SyncBridge<FaceModel> {

    @NotNull
    public static final String TAG = "FaceBridge";

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/CreditFaceBridge$FaceModel;", "", "scene", "", "mobileNo", "memberId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScene", "()Ljava/lang/String;", "getMobileNo", "getMemberId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FaceModel {

        @Nullable
        private final String memberId;

        @Nullable
        private final String mobileNo;

        @NotNull
        private final String scene;

        public FaceModel(@NotNull String scene, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            this.scene = scene;
            this.mobileNo = str;
            this.memberId = str2;
        }

        public static /* synthetic */ FaceModel copy$default(FaceModel faceModel, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = faceModel.scene;
            }
            if ((i7 & 2) != 0) {
                str2 = faceModel.mobileNo;
            }
            if ((i7 & 4) != 0) {
                str3 = faceModel.memberId;
            }
            return faceModel.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getScene() {
            return this.scene;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMobileNo() {
            return this.mobileNo;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        @NotNull
        public final FaceModel copy(@NotNull String scene, @Nullable String mobileNo, @Nullable String memberId) {
            Intrinsics.checkNotNullParameter(scene, "scene");
            return new FaceModel(scene, mobileNo, memberId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceModel)) {
                return false;
            }
            FaceModel faceModel = (FaceModel) other;
            return Intrinsics.c(this.scene, faceModel.scene) && Intrinsics.c(this.mobileNo, faceModel.mobileNo) && Intrinsics.c(this.memberId, faceModel.memberId);
        }

        @Nullable
        public final String getMemberId() {
            return this.memberId;
        }

        @Nullable
        public final String getMobileNo() {
            return this.mobileNo;
        }

        @NotNull
        public final String getScene() {
            return this.scene;
        }

        public int hashCode() {
            int iHashCode = this.scene.hashCode() * 31;
            String str = this.mobileNo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.memberId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.scene;
            String str2 = this.mobileNo;
            return G.r(F.f("FaceModel(scene=", str, ", mobileNo=", str2, ", memberId="), this.memberId, ")");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/CreditFaceBridge$FaceResult;", "", "token", "", "bizId", "memberId", "faceUrl", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getBizId", "getMemberId", "getFaceUrl", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FaceResult {

        @Nullable
        private final String bizId;

        @Nullable
        private final String faceUrl;

        @Nullable
        private final String memberId;

        @Nullable
        private final String token;

        @Nullable
        private final String transactionId;

        public FaceResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.token = str;
            this.bizId = str2;
            this.memberId = str3;
            this.faceUrl = str4;
            this.transactionId = str5;
        }

        public static /* synthetic */ FaceResult copy$default(FaceResult faceResult, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = faceResult.token;
            }
            if ((i7 & 2) != 0) {
                str2 = faceResult.bizId;
            }
            if ((i7 & 4) != 0) {
                str3 = faceResult.memberId;
            }
            if ((i7 & 8) != 0) {
                str4 = faceResult.faceUrl;
            }
            if ((i7 & 16) != 0) {
                str5 = faceResult.transactionId;
            }
            String str6 = str5;
            String str7 = str3;
            return faceResult.copy(str, str2, str7, str4, str6);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBizId() {
            return this.bizId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFaceUrl() {
            return this.faceUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        @NotNull
        public final FaceResult copy(@Nullable String token, @Nullable String bizId, @Nullable String memberId, @Nullable String faceUrl, @Nullable String transactionId) {
            return new FaceResult(token, bizId, memberId, faceUrl, transactionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceResult)) {
                return false;
            }
            FaceResult faceResult = (FaceResult) other;
            return Intrinsics.c(this.token, faceResult.token) && Intrinsics.c(this.bizId, faceResult.bizId) && Intrinsics.c(this.memberId, faceResult.memberId) && Intrinsics.c(this.faceUrl, faceResult.faceUrl) && Intrinsics.c(this.transactionId, faceResult.transactionId);
        }

        @Nullable
        public final String getBizId() {
            return this.bizId;
        }

        @Nullable
        public final String getFaceUrl() {
            return this.faceUrl;
        }

        @Nullable
        public final String getMemberId() {
            return this.memberId;
        }

        @Nullable
        public final String getToken() {
            return this.token;
        }

        @Nullable
        public final String getTransactionId() {
            return this.transactionId;
        }

        public int hashCode() {
            String str = this.token;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bizId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.memberId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.faceUrl;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.transactionId;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.token;
            String str2 = this.bizId;
            String str3 = this.memberId;
            String str4 = this.faceUrl;
            String str5 = this.transactionId;
            StringBuilder sbF = F.f("FaceResult(token=", str, ", bizId=", str2, ", memberId=");
            u.x(sbF, str3, ", faceUrl=", str4, ", transactionId=");
            return G.r(sbF, str5, ")");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/CreditFaceBridge$LivenessData;", "", "code", "", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMsg", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LivenessData {

        @Nullable
        private final String code;

        @Nullable
        private final String msg;

        public LivenessData(@Nullable String str, @Nullable String str2) {
            this.code = str;
            this.msg = str2;
        }

        public static /* synthetic */ LivenessData copy$default(LivenessData livenessData, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = livenessData.code;
            }
            if ((i7 & 2) != 0) {
                str2 = livenessData.msg;
            }
            return livenessData.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        @NotNull
        public final LivenessData copy(@Nullable String code, @Nullable String msg) {
            return new LivenessData(code, msg);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LivenessData)) {
                return false;
            }
            LivenessData livenessData = (LivenessData) other;
            return Intrinsics.c(this.code, livenessData.code) && Intrinsics.c(this.msg, livenessData.msg);
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getMsg() {
            return this.msg;
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.msg;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return G.q("LivenessData(code=", this.code, ", msg=", this.msg, ")");
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable FaceModel params, @Nullable IBridgeCallback callback) {
        Unit unit;
        Objects.toString(params);
        if (params != null) {
            Activity activity = getActivity();
            if (activity != null) {
                int i7 = Integer.parseInt(params.getScene());
                AuthenticationRequest authenticationRequest = new AuthenticationRequest(Integer.valueOf(i7), params.getMemberId(), null, params.getMobileNo(), null, 20, null);
                p pVar = p.f41234a;
                r6.a aVar = p.f41237d;
                if (aVar != null) {
                    aVar.f41575g = 0;
                }
                LivenessTask.INSTANCE.initLiveness(activity.getApplication());
                p.j(activity, authenticationRequest, new a(this));
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        BaseBridge.handleIllegalArgument$default(this, null, 1, null);
    }
}
