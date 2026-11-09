package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.didiglobal.booster.instrument.ShadowToast;

/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Preference f17636a;

    public k(Preference preference) {
        this.f17636a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f17636a;
        CharSequence charSequenceE = preference.e();
        if (!preference.f17565r0 || TextUtils.isEmpty(charSequenceE)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceE);
        contextMenu.add(0, 0, 0, z.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f17636a;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f17551a.getSystemService("clipboard");
        CharSequence charSequenceE = preference.e();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceE));
        Context context = preference.f17551a;
        ShadowToast.show(Toast.makeText(context, context.getString(z.preference_copied, charSequenceE), 0));
        return true;
    }
}
