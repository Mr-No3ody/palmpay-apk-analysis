package cn.tongdun.android.qgq9qg99;

/* JADX INFO: loaded from: classes.dex */
final class qqg999qq implements Runnable {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ byte[] f19235q999ggg99999qqggqqg9qg;
    private /* synthetic */ q999ggg99999qqggqqg9qg.InterfaceC0009q999ggg99999qqggqqg9qg qgq9qg99;
    private /* synthetic */ q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public qqg999qq(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, byte[] bArr, q999ggg99999qqggqqg9qg.InterfaceC0009q999ggg99999qqggqqg9qg interfaceC0009q999ggg99999qqggqqg9qg) {
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.f19235q999ggg99999qqggqqg9qg = bArr;
        this.qgq9qg99 = interfaceC0009q999ggg99999qqggqqg9qg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq(this.qqggggg9g9q99q9gq, this.f19235q999ggg99999qqggqqg9qg);
        q999ggg99999qqggqqg9qg.InterfaceC0009q999ggg99999qqggqqg9qg interfaceC0009q999ggg99999qqggqqg9qg = this.qgq9qg99;
        if (interfaceC0009q999ggg99999qqggqqg9qg != null) {
            interfaceC0009q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }
    }
}
