package com.transsnet.palmpay.core.rnbridge.bridge;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.app.Activity;
import android.text.TextUtils;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/photo/upload"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/PhotoUploadBridge;", "Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge;", "<init>", "()V", "isDebug", "", "checkContent", "path", "", "uploadToS3", "", "params", "Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhotoUploadBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoUploadBridge.kt\ncom/transsnet/palmpay/core/rnbridge/bridge/PhotoUploadBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class PhotoUploadBridge extends com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge {
    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkContent(String path) {
        return !TextUtils.isEmpty(path) && y.m(path, "content://", false);
    }

    @Override // com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge
    public boolean isDebug() {
        return false;
    }

    @Override // com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge
    public void uploadToS3(@NotNull String path, @Nullable com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge.PhotoUploadParam params) {
        Boolean bool;
        t0 t0VarM;
        Intrinsics.checkNotNullParameter(path, "path");
        Activity activity = getActivity();
        if (activity != null) {
            if (params != null && (bool = params.getPrivate()) != null) {
                boolean zBooleanValue = bool.booleanValue();
                AbstractActivityC0837o abstractActivityC0837o = activity instanceof AbstractActivityC0837o ? (AbstractActivityC0837o) activity : null;
                if (abstractActivityC0837o != null) {
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(abstractActivityC0837o);
                    f fVar = I.f10809a;
                    t0VarM = AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new PhotoUploadBridge$uploadToS3$1$1$1(this, path, zBooleanValue, null), 2);
                } else {
                    t0VarM = null;
                }
                if (t0VarM != null) {
                    return;
                }
            }
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
            Unit unit = Unit.f38893a;
        }
    }
}
