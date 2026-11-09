package p269rb;

import C0.G;
import Pa.AbstractC0509f;
import android.os.Build;
import android.text.TextUtils;
import com.flexibank.sdk.k;
import com.flexibank.sdk.l;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.req.UploadAppListV2Req;
import com.transsnet.palmpay.core.bean.rsp.UploadAppListV2Rsp;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import p020b4.a;
import p221ob.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static UploadAppListV2Rsp a(UploadAppListV2Req uploadAppListV2Req) {
        try {
            c.f40268a.getInstance().getClass();
            UploadAppListV2Rsp uploadAppListV2Rsp = (UploadAppListV2Rsp) c.a().uploadAppChannelInfo(uploadAppListV2Req).b();
            if (uploadAppListV2Rsp.isSuccess()) {
                return uploadAppListV2Rsp;
            }
            return null;
        } catch (Exception e10) {
            for (e = e10; e != null; e = e.getCause()) {
                if (e instanceof p203na.b) {
                    throw new a();
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    public static void b(String str, String str2, String str3) {
        String strK;
        List<UploadAppListV2Req.AppListBean> list;
        l lVar;
        UploadAppListV2Req uploadAppListV2Req = new UploadAppListV2Req();
        uploadAppListV2Req.channel = BaseApplication.getChannel();
        uploadAppListV2Req.createTime = 0L;
        uploadAppListV2Req.updateTime = 0L;
        if (com.facebook.imagepipeline.nativecode.b.y() && k.k() && k.k() && !TextUtils.isEmpty(k.h())) {
            k kVar = k.f22317a;
            k.d();
            if (TextUtils.isEmpty(k.h())) {
                lVar = null;
            } else {
                a aVarI = kVar.i();
                String strH = k.h();
                if (strH == null) {
                    strH = "";
                }
                lVar = new l(strH, aVarI.f18770a, aVarI.f18771b, k.o().f21929a);
            }
            if (lVar == null || (strK = lVar.f22329b) == null) {
                strK = G.k();
            } else {
                if (StringsKt.F(strK)) {
                    strK = null;
                }
                if (strK == null) {
                    strK = G.k();
                }
            }
        } else {
            strK = G.k();
        }
        uploadAppListV2Req.memberId = strK;
        uploadAppListV2Req.applyId = str;
        int size = 0;
        uploadAppListV2Req.appNum = Integer.valueOf(BaseApplication.get().getPackageManager().getInstalledPackages(0).size());
        uploadAppListV2Req.mobileVersion = Integer.valueOf(Build.VERSION.SDK_INT);
        uploadAppListV2Req.uploadNode = str2;
        uploadAppListV2Req.uploadNodeDetail = str3;
        while (true) {
            try {
                ArrayList arrayListA = AbstractC0509f.a(size);
                uploadAppListV2Req.appList = arrayListA;
                if (arrayListA.isEmpty()) {
                    return;
                }
                UploadAppListV2Rsp uploadAppListV2RspA = a(uploadAppListV2Req);
                if ((uploadAppListV2RspA != null || (uploadAppListV2RspA = a(uploadAppListV2Req)) != null) && (list = uploadAppListV2Req.appList) != null && list.size() >= 50) {
                    UploadAppListV2Rsp.DataBean dataBean = uploadAppListV2RspA.data;
                    uploadAppListV2Req.batchNo = dataBean != null ? dataBean.batchNo : null;
                    size += list.size();
                }
                return;
            } catch (a unused) {
                return;
            }
        }
    }
}
