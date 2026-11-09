package G;

import androidx.camera.camera2.internal.J;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.processing.m;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.dialog.SendMoneyHandlerHomeDialog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2886g;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f2880a = i7;
        this.f2881b = obj;
        this.f2882c = obj2;
        this.f2883d = obj3;
        this.f2884e = obj4;
        this.f2885f = obj5;
        this.f2886g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() throws UnsupportedEncodingException {
        switch (this.f2880a) {
            case 0:
                ((E2.a) this.f2881b).b((CameraInternal) this.f2882c, (CameraInternal) this.f2883d, (m) this.f2884e, (m) this.f2885f, (Map.Entry) this.f2886g);
                break;
            case 1:
                J j6 = (J) this.f2881b;
                String str = (String) this.f2882c;
                H0 h7 = (H0) this.f2883d;
                UseCaseConfig useCaseConfig = (UseCaseConfig) this.f2884e;
                C0993n c0993n = (C0993n) this.f2885f;
                List list = (List) this.f2886g;
                j6.getClass();
                j6.f("Use case " + str + " RESET");
                j6.f13175a.j(str, h7, useCaseConfig, c0993n, list);
                j6.a();
                j6.q();
                j6.x();
                if (j6.f13166B0 == 9) {
                    j6.n();
                }
                break;
            default:
                HomeActivity.a aVar = HomeActivity.f34463H;
                HomeActivity homeActivity = (HomeActivity) this.f2881b;
                SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog = (SendMoneyHandlerHomeDialog) this.f2882c;
                homeActivity.showDialog(sendMoneyHandlerHomeDialog, HomeDialogState.PRIORITY_HIGHEST_111);
                if (sendMoneyHandlerHomeDialog != null) {
                    sendMoneyHandlerHomeDialog.fillData((String) this.f2883d, URLDecoder.decode((String) this.f2884e, Constants.ENCODING), URLDecoder.decode((String) this.f2885f, Constants.ENCODING), (String) this.f2886g);
                }
                break;
        }
    }
}
