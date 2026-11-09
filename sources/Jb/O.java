package Jb;

import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanViewModel f4721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(TransferByLoanViewModel transferByLoanViewModel, Ff.c cVar) {
        super(cVar);
        this.f4721b = transferByLoanViewModel;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f4720a = obj;
        this.f4722c |= Integer.MIN_VALUE;
        return TransferByLoanViewModel.d(this.f4721b, this);
    }
}
