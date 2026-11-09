package p284sb;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: renamed from: sb.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2025x extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42191a;

    public /* synthetic */ C2025x(int i7) {
        this.f42191a = i7;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f42191a) {
            case 0:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 1:
                try {
                    b.P(adEntity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 8:
                b.P(adEntity);
                break;
            case 9:
                try {
                    b.P(adEntity);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
                break;
            case 10:
                try {
                    b.P(adEntity);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
                break;
            case 11:
                try {
                    b.P(adEntity);
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
                break;
            case 12:
                try {
                    b.P(adEntity);
                } catch (Exception e14) {
                    e14.printStackTrace();
                    return;
                }
                break;
            case 13:
                try {
                    b.P(adEntity);
                } catch (Exception e15) {
                    e15.printStackTrace();
                    return;
                }
                break;
            case 14:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 15:
                b.P(adEntity);
                break;
            case 16:
                b.P(adEntity);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    b.P(adEntity);
                } catch (Exception e16) {
                    e16.printStackTrace();
                    return;
                }
                break;
            case 19:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
            case 21:
                try {
                    b.P(adEntity);
                } catch (Exception e17) {
                    e17.printStackTrace();
                    return;
                }
                break;
            case 22:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    b.P(adEntity);
                } catch (Exception e18) {
                    e18.printStackTrace();
                    return;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                b.P(adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadSuccess() {
        switch (this.f42191a) {
            case 0:
            case 2:
                break;
            case 1:
            default:
                super.onLoadSuccess();
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
