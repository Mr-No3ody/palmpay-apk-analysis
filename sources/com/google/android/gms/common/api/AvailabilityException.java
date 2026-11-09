package com.google.android.gms.common.api;

import M.b;
import M.c;
import M.f;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    private final f zaa;

    public AvailabilityException(@NonNull f fVar) {
        this.zaa = fVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NonNull
    public ConnectionResult getConnectionResult(@NonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        f fVar = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        Object obj = fVar.get(apiKey);
        String strZaa = apiKey.zaa();
        Preconditions.checkArgument(obj != null, F.d(new StringBuilder(String.valueOf(strZaa).length() + 58), "The given API (", strZaa, ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) fVar.get(apiKey));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        f fVar = this.zaa;
        Iterator it = ((c) fVar.keySet()).iterator();
        boolean z3 = true;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            ApiKey apiKey = (ApiKey) bVar.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) fVar.get(apiKey));
            z3 &= !connectionResult.isSuccess();
            String strZaa = apiKey.zaa();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(d.c(2, strZaa) + strValueOf.length());
            sb2.append(strZaa);
            sb2.append(": ");
            sb2.append(strValueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z3) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NonNull
    public ConnectionResult getConnectionResult(@NonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        f fVar = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        Object obj = fVar.get(apiKey);
        String strZaa = apiKey.zaa();
        Preconditions.checkArgument(obj != null, F.d(new StringBuilder(String.valueOf(strZaa).length() + 58), "The given API (", strZaa, ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) fVar.get(apiKey));
    }
}
