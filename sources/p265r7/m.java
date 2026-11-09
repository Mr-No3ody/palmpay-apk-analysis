package p265r7;

import android.widget.Toast;
import com.didiglobal.booster.instrument.ShadowToast;
import com.facebook.react.modules.core.PermissionListener;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements PermissionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f41629c;

    public m(p pVar, String str, String str2) {
        this.f41629c = pVar;
        this.f41627a = str;
        this.f41628b = str2;
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public final boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (i7 != 1) {
            return false;
        }
        int length = iArr.length;
        p pVar = this.f41629c;
        if (length <= 0 || iArr[0] != 0) {
            ShadowToast.show(Toast.makeText(pVar.f41637a, this.f41628b, 1));
        } else if (pVar.f41638b != null) {
            pVar.b(this.f41627a);
        }
        return true;
    }
}
