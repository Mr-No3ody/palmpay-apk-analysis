package H0;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import com.google.api.Service;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f3538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProfileInstaller$DiagnosticsCallback f3539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f3540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f3541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3543f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c[] f3544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f3545h;

    public b(AssetManager assetManager, Executor executor, ProfileInstaller$DiagnosticsCallback profileInstaller$DiagnosticsCallback, String str, File file) {
        this.f3538a = executor;
        this.f3539b = profileInstaller$DiagnosticsCallback;
        this.f3542e = str;
        this.f3541d = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 <= 34) {
            switch (i7) {
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    bArr = d.f3562h;
                    break;
                case 26:
                    bArr = d.f3561g;
                    break;
                case 27:
                    bArr = d.f3560f;
                    break;
                case 28:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    bArr = d.f3559e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f3558d;
                    break;
            }
        }
        this.f3540c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3539b.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    public final void b(int i7, Serializable serializable) {
        this.f3538a.execute(new a(this, i7, serializable, 0));
    }
}
