package p187mc;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetWebActivity;
import com.transsnet.palmpay.echat.EchatActivity;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39643a;

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
        switch (this.f39643a) {
            case 0:
                int i7 = EchatActivity.f31827i;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(Uri.parse(str));
                ActivityUtils.startActivity(intent);
                break;
            default:
                String str5 = BettingQuickBetWebActivity.f26693j;
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addCategory("android.intent.category.BROWSABLE");
                intent2.setData(Uri.parse(str));
                ActivityUtils.startActivity(intent2);
                break;
        }
    }
}
