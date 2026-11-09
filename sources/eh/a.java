package eh;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.mtn.sdk.MTN;
import java.util.ArrayList;
import mh.h;
import p073f.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f36323a;

    public abstract void f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D3.a.f1587c = (Application) getApplicationContext();
        if (Build.VERSION.SDK_INT != 26 && getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        getWindow().setSoftInputMode(3);
        if (Oe.a.f6828d == null) {
            Oe.a.f6828d = new Oe.a(23);
        }
        ((ArrayList) Oe.a.f6828d.f6830b).add(this);
        if (g() != 0) {
            setContentView(g());
        }
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
        Window window2 = getWindow();
        View decorView = window2.getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            window2.addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility(systemUiVisibility | UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        e();
        f();
        i();
        h();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (Oe.a.f6828d == null) {
            Oe.a.f6828d = new Oe.a(23);
        }
        Oe.a aVar = Oe.a.f6828d;
        ((ArrayList) aVar.f6830b).remove(this);
        if (((ArrayList) aVar.f6830b).size() == 0) {
            c.a().b(MTN.RESULT_CANCEL, "MTN cancel!");
        }
    }

    public void e() {
    }
}
