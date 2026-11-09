package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class a extends ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f22609b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f22609b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f22608a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f22608a;
        if (str != null && (yVar = this.f22609b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f22608a == null) {
            sb2.append(" token");
        }
        if (this.f22609b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
