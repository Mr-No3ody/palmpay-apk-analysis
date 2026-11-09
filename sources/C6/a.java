package C6;

import android.util.Size;
import android.view.View;
import com.palmpay.lib.liveness.video.VideoActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoActivity f1159b;

    public /* synthetic */ a(VideoActivity videoActivity, int i7) {
        this.f1158a = i7;
        this.f1159b = videoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoActivity videoActivity = this.f1159b;
        switch (this.f1158a) {
            case 0:
                Size size = VideoActivity.f23949B;
                videoActivity.f().d();
                break;
            case 1:
                Size size2 = VideoActivity.f23949B;
                videoActivity.finish();
                break;
            case 2:
                Size size3 = VideoActivity.f23949B;
                videoActivity.i();
                break;
            default:
                Size size4 = VideoActivity.f23949B;
                videoActivity.f().d();
                break;
        }
    }
}
