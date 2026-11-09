package com.transsnet.palmpay.credit.service;

import F6.d;
import Fb.c;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.O;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.util.CameraUtils;
import com.transsnet.palmpay.util.OcCameraInfoBean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/service/OkCardCollectDeviceInfoService;", "Landroidx/core/app/O;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkCardCollectDeviceInfoService extends O {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f28650i = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void enqueueWork$default(a aVar, Context context, boolean z3, boolean z8, boolean z10, boolean z11, boolean z12, String str, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z3 = false;
            }
            if ((i7 & 4) != 0) {
                z8 = false;
            }
            if ((i7 & 8) != 0) {
                z10 = false;
            }
            if ((i7 & 16) != 0) {
                z11 = false;
            }
            if ((i7 & 32) != 0) {
                z12 = false;
            }
            if ((i7 & 64) != 0) {
                str = null;
            }
            aVar.enqueueWork(context, z3, z8, z10, z11, z12, str);
        }

        public final void enqueueWork(@NotNull Context context, boolean z3, boolean z8, boolean z10, boolean z11, boolean z12, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (BaseApplication.hasLogin()) {
                try {
                    Intent intent = new Intent();
                    intent.putExtra("key_upload_device_info", z3);
                    intent.putExtra("key_upload_app_list", z8);
                    intent.putExtra("key_upload_contact", z12);
                    intent.putExtra("key_upload_camera", z10);
                    intent.putExtra("key_upload_location", z11);
                    intent.putExtra("apply_id", str);
                    O.a(context, OkCardCollectDeviceInfoService.class, 1005, intent);
                } catch (SecurityException e10) {
                    d.c("UpdateBadgeService", "enqueueWork: ", e10);
                }
            }
        }

        private a() {
        }
    }

    @Override // androidx.core.app.O
    public final void e(Intent intent) {
        double latitude;
        double longitude;
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean booleanExtra = intent.getBooleanExtra("key_upload_device_info", false);
        intent.getBooleanExtra("key_upload_app_list", false);
        intent.getBooleanExtra("key_upload_contact", false);
        boolean booleanExtra2 = intent.getBooleanExtra("key_upload_camera", false);
        boolean booleanExtra3 = intent.getBooleanExtra("key_upload_location", false);
        intent.getStringExtra("apply_id");
        if (booleanExtra) {
            try {
                UploadDeviceInfoReq.DeviceInfoBean ocDeviceInfo$default = c.getOcDeviceInfo$default(Fb.d.f2639a, null, null, null, 7, null);
                p221ob.c.f40268a.getInstance().getClass();
                d.h("OkCardCollectDeviceInfoService", 3, "uploadDeviceInfo: " + ((CommonResult) p221ob.c.a().uploadDeviceInfoNew(ocDeviceInfo$default).b()).isSuccess());
            } catch (Exception e10) {
                d.c("OkCardCollectDeviceInfoService", "uploadDeviceInfo: ", e10);
            }
        }
        if (booleanExtra3) {
            try {
                LocationRecord locationRecordF = p367ya.a.d().f();
                if (locationRecordF != null) {
                    latitude = locationRecordF.getLatitude();
                    longitude = locationRecordF.getLongitude();
                } else {
                    latitude = 9999.0d;
                    longitude = 9999.0d;
                }
                OcLocationInfoReq ocLocationInfoReq = new OcLocationInfoReq(Double.valueOf(latitude), Double.valueOf(longitude), null, null, null, null, 60, null);
                p221ob.c.f40268a.getInstance().getClass();
                d.h("OkCardCollectDeviceInfoService", 3, "uploadLocation: " + ((CommonResult) p221ob.c.a().uploadLocationInfo(ocLocationInfoReq).b()).isSuccess());
            } catch (Exception e11) {
                d.c("OkCardCollectDeviceInfoService", "uploadLocation: ", e11);
            }
        }
        if (booleanExtra2) {
            try {
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = p221ob.c.a();
                OcCameraInfoBean ocCameraInfo = CameraUtils.getOcCameraInfo(BaseApplication.get());
                Intrinsics.checkNotNullExpressionValue(ocCameraInfo, "getOcCameraInfo(...)");
                d.h("OkCardCollectDeviceInfoService", 3, "uploadCameraInfo: " + ((CommonResult) iApiCreditServiceA.uploadCameraInfo(ocCameraInfo).b()).isSuccess());
            } catch (Exception e12) {
                d.c("OkCardCollectDeviceInfoService", "uploadCameraInfo: ", e12);
            }
        }
    }
}
