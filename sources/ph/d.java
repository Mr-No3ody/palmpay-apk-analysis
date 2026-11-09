package ph;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.m1;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f41321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f41323c;

    public d(m1 m1Var, Uri uri, int i7) {
        this.f41323c = m1Var;
        this.f41321a = uri;
        this.f41322b = i7;
    }

    @Override // ph.b
    public final InputStream a() {
        m1 m1Var = this.f41323c;
        m1Var.getClass();
        top.zibin.luban.io.a aVarF = top.zibin.luban.io.a.f();
        ContentResolver contentResolver = ((Context) m1Var.f12971a).getContentResolver();
        Uri uri = this.f41321a;
        aVarF.getClass();
        try {
            try {
                top.zibin.luban.io.b bVar = (top.zibin.luban.io.b) ((ConcurrentHashMap) aVarF.f42646c).get(uri.toString());
                if (bVar == null) {
                    return aVarF.w(contentResolver, uri);
                }
                bVar.reset();
                return bVar;
            } catch (Exception unused) {
                return contentResolver.openInputStream(uri);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return aVarF.w(contentResolver, uri);
        }
    }

    @Override // top.zibin.luban.InputStreamProvider
    public final int getIndex() {
        return this.f41322b;
    }

    @Override // top.zibin.luban.InputStreamProvider
    public final String getPath() {
        Uri uri = this.f41321a;
        String string = uri.toString();
        a aVar = a.SINGLE;
        return TextUtils.isEmpty(string) ? false : string.startsWith("content://") ? uri.toString() : uri.getPath();
    }
}
