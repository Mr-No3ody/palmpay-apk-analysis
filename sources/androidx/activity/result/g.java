package androidx.activity.result;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f12058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p177m.b f12060d;

    public /* synthetic */ g(h hVar, String str, p177m.b bVar, int i7) {
        this.f12057a = i7;
        this.f12058b = hVar;
        this.f12059c = str;
        this.f12060d = bVar;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        switch (this.f12057a) {
            case 0:
                h hVar = this.f12058b;
                LinkedHashMap linkedHashMap = hVar.f12062b;
                String str = this.f12059c;
                Object obj2 = linkedHashMap.get(str);
                p177m.b bVar = this.f12060d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ArrayList arrayList = hVar.f12064d;
                arrayList.add(str);
                try {
                    hVar.b(iIntValue, bVar, obj);
                    return;
                } catch (Exception e10) {
                    arrayList.remove(str);
                    throw e10;
                }
            default:
                h hVar2 = this.f12058b;
                LinkedHashMap linkedHashMap2 = hVar2.f12062b;
                String str2 = this.f12059c;
                Object obj3 = linkedHashMap2.get(str2);
                p177m.b bVar2 = this.f12060d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = hVar2.f12064d;
                arrayList2.add(str2);
                try {
                    hVar2.b(iIntValue2, bVar2, obj);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
        }
    }

    @Override // androidx.activity.result.a
    public final void b() {
        switch (this.f12057a) {
            case 0:
                this.f12058b.f(this.f12059c);
                break;
            default:
                this.f12058b.f(this.f12059c);
                break;
        }
    }
}
