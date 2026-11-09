package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes2.dex */
public final class zaac extends RemoteCreator {
    private static final zaac zaa = new zaac();

    private zaac() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i7, int i10) throws RemoteCreator.RemoteCreatorException {
        zaac zaacVar = zaa;
        try {
            zaaa zaaaVar = new zaaa(1, i7, i10, null);
            return (View) ObjectWrapper.unwrap(((zap) zaacVar.getRemoteCreatorInstance(context)).zae(ObjectWrapper.wrap(context), zaaaVar));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 42 + String.valueOf(i10).length());
            sb2.append("Could not get button with size ");
            sb2.append(i7);
            sb2.append(" and color ");
            sb2.append(i10);
            throw new RemoteCreator.RemoteCreatorException(sb2.toString(), e10);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zap ? (zap) iInterfaceQueryLocalInterface : new zap(iBinder);
    }
}
