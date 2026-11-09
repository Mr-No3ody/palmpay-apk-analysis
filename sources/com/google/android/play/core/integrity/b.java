package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class b extends bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f22662b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f22662b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f22661a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f22661a;
        if (str != null && (yVar = this.f22662b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f22661a == null) {
            sb2.append(" token");
        }
        if (this.f22662b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
