package pub.devrel.easypermissions;

import C0.G;
import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.C0833k;
import androidx.appcompat.app.DialogInterfaceC0834l;
import dh.b;
import p192n.c;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({c.f39801b})
public class AppSettingsDialogHolderActivity extends AbstractActivityC0837o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0834l f41338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41339b;

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        setResult(i10, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        if (i7 == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f41339b);
            startActivityForResult(data, 7534);
        } else {
            if (i7 != -2) {
                throw new IllegalStateException(G.m(i7, "Unknown button type: "));
            }
            setResult(0);
            finish();
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AppSettingsDialogHolderActivity appSettingsDialogHolderActivity;
        super.onCreate(bundle);
        Intent intent = getIntent();
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialog == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            appSettingsDialogHolderActivity = this;
            appSettingsDialog = new AppSettingsDialog(appSettingsDialogHolderActivity, TextUtils.isEmpty(null) ? getString(b.rationale_ask_again) : null, TextUtils.isEmpty(null) ? getString(b.title_settings_dialog) : null, TextUtils.isEmpty(null) ? getString(R.string.ok) : null, TextUtils.isEmpty(null) ? getString(R.string.cancel) : null, 16061);
        } else {
            appSettingsDialogHolderActivity = this;
        }
        appSettingsDialogHolderActivity.f41339b = appSettingsDialog.f41337g;
        int i7 = appSettingsDialog.f41331a;
        appSettingsDialogHolderActivity.f41338a = (i7 != -1 ? new C0833k(this, i7) : new C0833k(this)).setCancelable(false).setTitle(appSettingsDialog.f41333c).setMessage(appSettingsDialog.f41332b).setPositiveButton(appSettingsDialog.f41334d, this).setNegativeButton(appSettingsDialog.f41335e, this).show();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        DialogInterfaceC0834l dialogInterfaceC0834l = this.f41338a;
        if (dialogInterfaceC0834l == null || !dialogInterfaceC0834l.isShowing()) {
            return;
        }
        this.f41338a.dismiss();
    }
}
