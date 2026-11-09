package N8;

import android.view.View;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetUserPhotoActivity f6187b;

    public /* synthetic */ Y(SetUserPhotoActivity setUserPhotoActivity, int i7) {
        this.f6186a = i7;
        this.f6187b = setUserPhotoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6186a) {
            case 0:
                this.f6187b.finish();
                break;
            case 1:
                this.f6187b.onTakePhotoClick();
                break;
            case 2:
                this.f6187b.onPickFromAlbumClick();
                break;
            case 3:
                this.f6187b.onChoosePdfClick();
                break;
            case 4:
                this.f6187b.finish();
                break;
            default:
                this.f6187b.gotoFailCancelled();
                break;
        }
    }
}
