package Ab;

import com.google.api.Service;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129a;

    public /* synthetic */ k(int i7) {
        this.f129a = i7;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f129a) {
            case 0:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 1:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 2:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 5:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
                break;
            case 8:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 10:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 11:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 18:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
                break;
            case 22:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 24:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 28:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e14) {
                    e14.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadSuccess() {
        switch (this.f129a) {
            case 3:
            case 4:
            case 17:
            case 19:
                break;
            default:
                super.onLoadSuccess();
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
