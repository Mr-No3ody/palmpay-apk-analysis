package p143jb;

import N8.C0475t;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.util.PermissionUtils;
import p071ef.b;
import p221ob.c;
import p298tf.f;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    public static void a(String str, String str2, String str3) {
        if (PermissionUtils.isGranted(d.j()) || PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION")) {
            LocationRecord locationRecordF = a.d().f();
            if (locationRecordF == null) {
                F6.d.c("uploadLocationInfo", "location is null");
                return;
            }
            OcLocationInfoReq ocLocationInfoReq = new OcLocationInfoReq(Double.valueOf(locationRecordF.getLatitude()), Double.valueOf(locationRecordF.getLongitude()), str, null, str2, str3, 8, null);
            c.f40268a.getInstance().getClass();
            c.a().uploadLocationInfo(ocLocationInfoReq).k(f.f42629b).i(b.a()).subscribe(new C0475t(4));
        }
    }
}
