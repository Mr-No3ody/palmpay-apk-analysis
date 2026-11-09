package N8;

import android.content.Intent;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.core.callback.Argument0Callback;
import com.transsnet.palmpay.core.callback.Argument1Callback;
import com.transsnet.palmpay.core.callback.Argument2Callback;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Argument2Callback, Argument0Callback, Argument1Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetUserPhotoActivity f6193b;

    public /* synthetic */ a0(SetUserPhotoActivity setUserPhotoActivity, int i7) {
        this.f6192a = i7;
        this.f6193b = setUserPhotoActivity;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument0Callback
    public void invoke() {
        SetUserPhotoActivity.onTakePhotoClick$lambda$13(this.f6193b);
    }

    @Override // com.transsnet.palmpay.core.callback.Argument1Callback
    public void invoke(Object obj) {
        switch (this.f6192a) {
            case 2:
                SetUserPhotoActivity.onTakePhotoClick$lambda$14(this.f6193b, (p038ca.a) obj);
                break;
            default:
                SetUserPhotoActivity.onTakePhotoClick$lambda$15(this.f6193b, (p038ca.a) obj);
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        int i7 = this.f6192a;
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        switch (i7) {
            case 0:
                SetUserPhotoActivity.openPreviewPdfForSnap$lambda$10(this.f6193b, iIntValue, intent);
                break;
            default:
                SetUserPhotoActivity.onTakePhotoClick$lambda$16(this.f6193b, iIntValue, intent);
                break;
        }
    }
}
