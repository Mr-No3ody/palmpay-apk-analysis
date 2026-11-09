package p218o7;

import V3.d;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.app.M;
import com.permissionx.guolindev.request.InvisibleFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(h hVar, int i7) {
        super(hVar);
        this.f40086f = i7;
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public final void request() {
        switch (this.f40086f) {
            case 0:
                ArrayList arrayList = new ArrayList();
                h hVar = (h) this.f9988e;
                for (String str : hVar.f40078c) {
                    if (androidx.core.content.d.a(hVar.a(), str) == 0) {
                        hVar.f40081f.add(str);
                    } else {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    finish();
                } else {
                    hVar.f(hVar.f40078c, this);
                }
                break;
            case 1:
                h hVar2 = (h) this.f9988e;
                if (hVar2.f40079d.contains("android.permission.POST_NOTIFICATIONS") && new M(hVar2.a()).f15943b.areNotificationsEnabled()) {
                    finish();
                } else {
                    finish();
                }
                break;
            case 2:
                h hVar3 = (h) this.f9988e;
                if (!hVar3.f40079d.contains("android.permission.SYSTEM_ALERT_WINDOW")) {
                    finish();
                } else if (hVar3.d() < 23) {
                    hVar3.f40081f.add("android.permission.SYSTEM_ALERT_WINDOW");
                    hVar3.f40079d.remove("android.permission.SYSTEM_ALERT_WINDOW");
                    finish();
                } else if (Settings.canDrawOverlays(hVar3.a())) {
                    finish();
                } else {
                    finish();
                }
                break;
            default:
                h hVar4 = (h) this.f9988e;
                if (!hVar4.f40079d.contains("android.permission.WRITE_SETTINGS")) {
                    finish();
                } else if (hVar4.d() < 23) {
                    hVar4.f40081f.add("android.permission.WRITE_SETTINGS");
                    hVar4.f40079d.remove("android.permission.WRITE_SETTINGS");
                    finish();
                } else if (Settings.System.canWrite(hVar4.a())) {
                    finish();
                } else {
                    finish();
                }
                break;
        }
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public final void requestAgain(List permissions) {
        switch (this.f40086f) {
            case 0:
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                h hVar = (h) this.f9988e;
                HashSet hashSet = new HashSet(hVar.f40081f);
                hashSet.addAll(permissions);
                if (!hashSet.isEmpty()) {
                    hVar.f(hashSet, this);
                } else {
                    finish();
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                h permissionBuilder = (h) this.f9988e;
                permissionBuilder.getClass();
                Intrinsics.checkNotNullParameter(this, "chainTask");
                InvisibleFragment invisibleFragmentC = permissionBuilder.c();
                Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
                Intrinsics.checkNotNullParameter(this, "chainTask");
                invisibleFragmentC.f24646b = permissionBuilder;
                invisibleFragmentC.f24647c = this;
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", invisibleFragmentC.requireActivity().getPackageName());
                    invisibleFragmentC.f24654o.a(intent);
                } else if (invisibleFragmentC.f()) {
                    invisibleFragmentC.h(new e(invisibleFragmentC, 0));
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                h permissionBuilder2 = (h) this.f9988e;
                permissionBuilder2.getClass();
                Intrinsics.checkNotNullParameter(this, "chainTask");
                InvisibleFragment invisibleFragmentC2 = permissionBuilder2.c();
                Intrinsics.checkNotNullParameter(permissionBuilder2, "permissionBuilder");
                Intrinsics.checkNotNullParameter(this, "chainTask");
                invisibleFragmentC2.f24646b = permissionBuilder2;
                invisibleFragmentC2.f24647c = this;
                if (!Settings.canDrawOverlays(invisibleFragmentC2.requireContext())) {
                    Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                    intent2.setData(Uri.parse("package:" + invisibleFragmentC2.requireActivity().getPackageName()));
                    invisibleFragmentC2.f24650f.a(intent2);
                } else {
                    invisibleFragmentC2.g();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                h permissionBuilder3 = (h) this.f9988e;
                permissionBuilder3.getClass();
                Intrinsics.checkNotNullParameter(this, "chainTask");
                InvisibleFragment invisibleFragmentC3 = permissionBuilder3.c();
                Intrinsics.checkNotNullParameter(permissionBuilder3, "permissionBuilder");
                Intrinsics.checkNotNullParameter(this, "chainTask");
                invisibleFragmentC3.f24646b = permissionBuilder3;
                invisibleFragmentC3.f24647c = this;
                if (!Settings.System.canWrite(invisibleFragmentC3.requireContext())) {
                    Intent intent3 = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                    intent3.setData(Uri.parse("package:" + invisibleFragmentC3.requireActivity().getPackageName()));
                    invisibleFragmentC3.f24651g.a(intent3);
                } else if (invisibleFragmentC3.f()) {
                    invisibleFragmentC3.h(new e(invisibleFragmentC3, 3));
                }
                break;
        }
    }
}
