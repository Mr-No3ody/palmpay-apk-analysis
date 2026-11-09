package com.transsnet.palmpay.core.service;

import F6.d;
import Pa.AbstractC0509f;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.O;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.UploadAppListV2Req;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoV2Req;
import com.transsnet.palmpay.core.bean.rsp.UploadAppListV2Rsp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.util.SPUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/service/CollectDeviceInfoService;", "Landroidx/core/app/O;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CollectDeviceInfoService extends O {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f27401o = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f27403j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void enqueueWork$default(a aVar, Context context, boolean z3, boolean z8, boolean z10, boolean z11, String str, String str2, String str3, int i7, Object obj) {
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
                str = null;
            }
            if ((i7 & 64) != 0) {
                str2 = null;
            }
            if ((i7 & 128) != 0) {
                str3 = null;
            }
            aVar.enqueueWork(context, z3, z8, z10, z11, str, str2, str3);
        }

        public final void enqueueWork(@NotNull Context context, boolean z3, boolean z8, boolean z10, boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (BaseApplication.hasLogin()) {
                try {
                    Intent intent = new Intent();
                    intent.putExtra("forceUpload", z3);
                    intent.putExtra("uploadDeviceInfo", z8);
                    intent.putExtra("uploadAppList", z10);
                    intent.putExtra("uploadContact", z11);
                    intent.putExtra("uploadNode", str2);
                    intent.putExtra("uploadNodeDetail", str3);
                    intent.putExtra("apply_id", str);
                    O.a(context, CollectDeviceInfoService.class, 1005, intent);
                } catch (SecurityException e10) {
                    d.c("UpdateBadgeService", "enqueueWork: ", e10);
                }
            }
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    @Override // androidx.core.app.O
    public final void e(Intent intent) throws Throwable {
        UploadAppListV2Rsp uploadAppListV2Rsp;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        int size;
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean booleanExtra = intent.getBooleanExtra("forceUpload", false);
        boolean booleanExtra2 = intent.getBooleanExtra("uploadDeviceInfo", false);
        boolean booleanExtra3 = intent.getBooleanExtra("uploadAppList", false);
        boolean booleanExtra4 = intent.getBooleanExtra("uploadContact", false);
        String stringExtra = intent.getStringExtra("uploadNode");
        String stringExtra2 = intent.getStringExtra("uploadNodeDetail");
        if (booleanExtra2 && (booleanExtra || SPUtils.getInstance().getLong("key_upload_device_info", 0L) <= System.currentTimeMillis())) {
            try {
                UploadDeviceInfoV2Req uploadDeviceInfoV2ReqB = AbstractC0509f.b();
                this.f27402i = uploadDeviceInfoV2ReqB.createTime;
                this.f27403j = uploadDeviceInfoV2ReqB.updateTime;
                if (((CommonResult) ((PayApiService) c.f43141a.f14621b).uploadDeviceInfo(uploadDeviceInfoV2ReqB).b()).isSuccess()) {
                    SPUtils.getInstance().put("key_upload_device_info", System.currentTimeMillis() + 259200000);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (booleanExtra3) {
            String stringExtra3 = intent.getStringExtra("apply_id");
            if (booleanExtra || SPUtils.getInstance().getLong("key_upload_app_list", 0L) <= System.currentTimeMillis()) {
                try {
                    UploadAppListV2Req uploadAppListV2Req = new UploadAppListV2Req();
                    uploadAppListV2Req.channel = BaseApplication.getChannel();
                    uploadAppListV2Req.createTime = this.f27402i;
                    uploadAppListV2Req.updateTime = this.f27403j;
                    uploadAppListV2Req.memberId = BaseApplication.get().getUser().getMemberId();
                    uploadAppListV2Req.applyId = stringExtra3;
                    uploadAppListV2Req.appNum = Integer.valueOf(BaseApplication.get().getPackageManager().getInstalledPackages(0).size());
                    uploadAppListV2Req.mobileVersion = Integer.valueOf(Build.VERSION.SDK_INT);
                    uploadAppListV2Req.uploadNode = stringExtra;
                    uploadAppListV2Req.uploadNodeDetail = stringExtra2;
                    uploadAppListV2Rsp = null;
                    while (true) {
                        try {
                            try {
                                uploadAppListV2Req.appList = AbstractC0509f.a(size);
                                androidx.camera.video.internal.c cVar = c.f43141a;
                                UploadAppListV2Rsp uploadAppListV2Rsp2 = (UploadAppListV2Rsp) ((PayApiService) cVar.f14621b).uploadAppList(uploadAppListV2Req).b();
                                try {
                                    uploadAppListV2Rsp = !uploadAppListV2Rsp2.isSuccess() ? (UploadAppListV2Rsp) ((PayApiService) cVar.f14621b).uploadAppList(uploadAppListV2Req).b() : uploadAppListV2Rsp2;
                                    if (!uploadAppListV2Rsp.isSuccess()) {
                                        SPUtils.getInstance().put("key_upload_app_list", System.currentTimeMillis() + 259200000);
                                        break;
                                    }
                                    uploadAppListV2Req.batchNo = uploadAppListV2Rsp.data.batchNo;
                                    List<UploadAppListV2Req.AppListBean> list = uploadAppListV2Req.appList;
                                    size = (list != null && list.size() >= 50) ? size + uploadAppListV2Req.appList.size() : 0;
                                    SPUtils.getInstance().put("key_upload_app_list", System.currentTimeMillis() + 259200000);
                                    break;
                                } catch (Exception e11) {
                                    e = e11;
                                    uploadAppListV2Rsp = uploadAppListV2Rsp2;
                                    e.printStackTrace();
                                    if ((uploadAppListV2Rsp != null ? uploadAppListV2Rsp.data : null) != null) {
                                        jCurrentTimeMillis2 = uploadAppListV2Rsp.data.nextTime;
                                        if (jCurrentTimeMillis2 <= 0) {
                                            jCurrentTimeMillis2 = System.currentTimeMillis() + 259200000;
                                        }
                                    } else {
                                        jCurrentTimeMillis2 = System.currentTimeMillis() + 259200000;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    uploadAppListV2Rsp = uploadAppListV2Rsp2;
                                    if ((uploadAppListV2Rsp != null ? uploadAppListV2Rsp.data : null) != null) {
                                        jCurrentTimeMillis = uploadAppListV2Rsp.data.nextTime;
                                        if (jCurrentTimeMillis <= 0) {
                                            jCurrentTimeMillis = System.currentTimeMillis() + 259200000;
                                        }
                                    } else {
                                        jCurrentTimeMillis = System.currentTimeMillis() + 259200000;
                                    }
                                    SPUtils.getInstance().put("key_upload_app_list", jCurrentTimeMillis);
                                    throw th;
                                }
                            } catch (Exception e12) {
                                e = e12;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    UploadAppListV2Rsp.DataBean dataBean = uploadAppListV2Rsp.data;
                    if (dataBean != null) {
                        jCurrentTimeMillis2 = dataBean.nextTime;
                        if (jCurrentTimeMillis2 <= 0) {
                            jCurrentTimeMillis2 = System.currentTimeMillis() + 259200000;
                        }
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis() + 259200000;
                    }
                } catch (Exception e13) {
                    e = e13;
                    uploadAppListV2Rsp = null;
                } catch (Throwable th3) {
                    th = th3;
                    uploadAppListV2Rsp = null;
                }
                SPUtils.getInstance().put("key_upload_app_list", jCurrentTimeMillis2);
            }
        }
        if (booleanExtra4) {
            Ga.c.f3194a.periodUploadV3();
        }
    }
}
