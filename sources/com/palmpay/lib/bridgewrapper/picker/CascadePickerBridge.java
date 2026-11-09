package com.palmpay.lib.bridgewrapper.picker;

import X6.j;
import android.app.Activity;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.bridgewrapper.picker.bean.CascadePickerBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/picker/cascade"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/picker/CascadePickerBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/picker/bean/CascadePickerBean;", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CascadePickerBridge extends SyncBridge<CascadePickerBean> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable CascadePickerBean params, @Nullable IBridgeCallback callback) {
        Unit unit;
        if (params != null) {
            if (getActivity() instanceof AbstractActivityC0837o) {
                int i7 = j.f11015f;
                Activity activity = getActivity();
                Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                j jVar = new j((AbstractActivityC0837o) activity);
                jVar.f11017b = params.getTitle();
                jVar.f11018c = params.getData();
                jVar.f11020e = new CascadePickerBridge$onHandle$1$1$1(this);
                jVar.f11019d = params.getSelectedIndex();
                jVar.a().show();
            }
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
    }
}
